#include "raylib.h"
#include <cmath>     // For std::abs, sqrt
#include <algorithm> // For std::min and std::max

// --- Refined Game Constants ---
const float MU_PER_PIXEL = 10.0f;
const float ACCELERATION = 6.0f;
const float DECELERATION = 4.0f;
const float MAX_SPEED_INPUT = 50.0f;
const float MAX_SPEED_ABSOLUTE = 150.0f;
const float GRAVITY_FORCE = 4.0f;
const float JUMP_FORCE = -67.0f;
const float ELASTICITY = 0.5f;

// Screen and player dimensions
const int screenWidth = 128;
const int screenHeight = 96; // MODIFIED: Changed height to 96
const int ballRadius = 6;
const int blockSize = 12;
const int numBlocks = 2;

// --- Player (Ball) Structure ---
typedef struct {
    Vector2 position;
    Vector2 velocity; // Velocity is now in Movement Units (MU)
    bool isGrounded;
} Player;

// --- Game State ---
Player player;
Rectangle ground;
Rectangle blocks[numBlocks];
int grabbedBlock = -1; // Index of the block being dragged by the mouse, -1 if none
Vector2 grabOffset;    // To hold the click offset within a block

// --- Function Prototypes ---
void InitGame();
void UpdateGame();
void DrawGame();
void CheckCollisions();

int main() {
    // Initialization
    //--------------------------------------------------------------------------------------
    SetConfigFlags(FLAG_WINDOW_HIGHDPI);
    InitWindow(screenWidth, screenHeight, "Raylib Physics Test");
    InitGame();
    SetTargetFPS(25); // Set back to 25 FPS as requested
    //--------------------------------------------------------------------------------------

    // Main game loop
    while (!WindowShouldClose()) {
        UpdateGame();
        DrawGame();
    }

    // De-Initialization
    //--------------------------------------------------------------------------------------
    CloseWindow();
    //--------------------------------------------------------------------------------------

    return 0;
}

// --- Game Initialization ---
void InitGame() {
    // Initialize Player
    player.position = { (float)screenWidth / 2.0f, 40.0f };
    player.velocity = { 0.0f, 0.0f };
    player.isGrounded = false;

    // Initialize Ground
    ground.x = 0;
    ground.y = screenHeight - 10;
    ground.width = screenWidth;
    ground.height = 10;

    // Initialize Movable Blocks
    blocks[0] = { 30, (float)screenHeight / 2, blockSize, blockSize };
    blocks[1] = { 80, (float)screenHeight / 2 + 10, blockSize, blockSize };
}

// --- Game Update Loop ---
void UpdateGame() {
    // --- Mouse Input for Moving Blocks ---
    Vector2 mousePos = GetMousePosition();

    if (IsMouseButtonPressed(MOUSE_BUTTON_LEFT)) {
        for (int i = 0; i < numBlocks; i++) {
            if (CheckCollisionPointRec(mousePos, blocks[i])) {
                grabbedBlock = i;
                grabOffset = { mousePos.x - blocks[i].x, mousePos.y - blocks[i].y };
                break; // Grab only the top-most block
            }
        }
    }

    if (IsMouseButtonDown(MOUSE_BUTTON_LEFT) && grabbedBlock != -1) {
        blocks[grabbedBlock].x = mousePos.x - grabOffset.x;
        blocks[grabbedBlock].y = mousePos.y - grabOffset.y;
    }

    if (IsMouseButtonReleased(MOUSE_BUTTON_LEFT)) {
        grabbedBlock = -1;
    }


    // --- Player Input and Horizontal Movement ---
    bool isMoving = false;
    if (IsKeyDown(KEY_RIGHT)) {
        player.velocity.x += ACCELERATION;
        isMoving = true;
    }
    if (IsKeyDown(KEY_LEFT)) {
        player.velocity.x -= ACCELERATION;
        isMoving = true;
    }

    player.velocity.x = std::max(-MAX_SPEED_INPUT, std::min(player.velocity.x, MAX_SPEED_INPUT));

    if (!isMoving) {
        if (player.velocity.x > 0) {
            player.velocity.x -= DECELERATION;
            if (player.velocity.x < 0) player.velocity.x = 0;
        } else if (player.velocity.x < 0) {
            player.velocity.x += DECELERATION;
            if (player.velocity.x > 0) player.velocity.x = 0;
        }
    }

    // --- Jumping ---
    if (IsKeyPressed(KEY_SPACE) && player.isGrounded) {
        player.velocity.y = JUMP_FORCE;
        player.isGrounded = false;
    }

    // --- Vertical Physics (Gravity) ---
    player.velocity.y += GRAVITY_FORCE;

    // --- Hard Speed Cap ---
    player.velocity.x = std::max(-MAX_SPEED_ABSOLUTE, std::min(player.velocity.x, MAX_SPEED_ABSOLUTE));
    player.velocity.y = std::max(-MAX_SPEED_ABSOLUTE, std::min(player.velocity.y, MAX_SPEED_ABSOLUTE));

    // --- Update Position ---
    player.position.x += player.velocity.x / MU_PER_PIXEL;
    player.position.y += player.velocity.y / MU_PER_PIXEL;

    // --- Collision Detection ---
    CheckCollisions();

    // --- Screen Boundary Collision & Bouncing ---
    if (player.position.x - ballRadius < 0) {
        player.position.x = ballRadius;
        player.velocity.x *= -ELASTICITY;
    }
    if (player.position.x + ballRadius > screenWidth) {
        player.position.x = screenWidth - ballRadius;
        player.velocity.x *= -ELASTICITY;
    }
    if (player.position.y - ballRadius < 0) {
        player.position.y = ballRadius;
        player.velocity.y *= -ELASTICITY;
    }
}

// --- Game Drawing ---
void DrawGame() {
    BeginDrawing();
    ClearBackground(RAYWHITE);

    // Draw Ground
    DrawRectangleRec(ground, LIME);

    // Draw Movable Blocks
    for (int i = 0; i < numBlocks; i++) {
        DrawRectangleRec(blocks[i], BLUE);
    }

    // Draw Player (Ball)
    DrawCircleV(player.position, (float)ballRadius, MAROON);

    // Draw debug text
    DrawText("Click and drag blue blocks", 5, 50, 10, DARKGRAY);
    DrawText(TextFormat("Grounded: %s", player.isGrounded ? "true" : "false"), 5, 5, 10, DARKGRAY);
    DrawText(TextFormat("Vel X: %.0f MU", player.velocity.x), 5, 20, 10, DARKGRAY);
    DrawText(TextFormat("Vel Y: %.0f MU", player.velocity.y), 5, 35, 10, DARKGRAY);

    EndDrawing();
}

// --- Collision Checks ---
void CheckCollisions() {
    // --- Ground Collision ---
    if (player.position.y + ballRadius >= ground.y && player.velocity.y > 0) {
        player.position.y = ground.y - ballRadius;
        float reboundVelocity = player.velocity.y * -ELASTICITY;
        if (std::abs(reboundVelocity) < GRAVITY_FORCE * 2) { // Increased threshold for stability
            player.velocity.y = 0;
            player.isGrounded = true;
        } else {
            player.velocity.y = reboundVelocity;
            player.isGrounded = false;
        }
    } else {
        if (player.position.y + ballRadius < ground.y) {
            player.isGrounded = false;
        }
    }

    // --- Movable Block Collision ---
    for (int i = 0; i < numBlocks; i++) {
        if (CheckCollisionCircleRec(player.position, ballRadius, blocks[i])) {
            // Find the closest point on the rectangle to the circle's center
            float closestX = std::max(blocks[i].x, std::min(player.position.x, blocks[i].x + blocks[i].width));
            float closestY = std::max(blocks[i].y, std::min(player.position.y, blocks[i].y + blocks[i].height));
            Vector2 closestPoint = { closestX, closestY };

            // Calculate collision vector
            Vector2 collisionVector = { player.position.x - closestPoint.x, player.position.y - closestPoint.y };
            float distance = sqrt(collisionVector.x * collisionVector.x + collisionVector.y * collisionVector.y);

            if (distance < ballRadius && distance > 0.0f) {
                // Collision has occurred
                float penetration = ballRadius - distance;
                Vector2 normal = { collisionVector.x / distance, collisionVector.y / distance };

                // 1. Resolve position (push the ball out)
                player.position.x += normal.x * penetration;
                player.position.y += normal.y * penetration;

                // --- MODIFIED: Velocity Resolution ---
                // The original code applied elasticity to the entire velocity vector,
                // causing a "sticky" friction effect when sliding.
                // The correct approach is to apply elasticity ONLY to the component of
                // velocity that is normal (perpendicular) to the collision surface.

                float dotProduct = (player.velocity.x * normal.x) + (player.velocity.y * normal.y);

                // We only resolve the collision if the objects are moving towards each other.
                // A negative dot product indicates this.
                if (dotProduct < 0) {
                    // Separate velocity into normal and tangential components
                    // Normal component (along the collision normal)
                    float vn_x = dotProduct * normal.x;
                    float vn_y = dotProduct * normal.y;
                    // Tangential component (perpendicular to the collision normal)
                    float vt_x = player.velocity.x - vn_x;
                    float vt_y = player.velocity.y - vn_y;

                    // Apply elasticity to the normal component (the "bounce")
                    // We reverse its direction and reduce its magnitude by ELASTICITY
                    vn_x *= -ELASTICITY;
                    vn_y *= -ELASTICITY;

                    // The new total velocity is the sum of the unchanged tangential
                    // component and the new, "bounced" normal component. This prevents
                    // the ball from slowing down when sliding along a surface.
                    player.velocity.x = vt_x + vn_x;
                    player.velocity.y = vt_y + vn_y;
                }
                // --- END MODIFICATION ---

                // If the ball lands on top of the block, it can be considered "grounded"
                // This is a simplification; a more robust check would see if normal.y is close to -1
                if (normal.y < -0.8f && std::abs(player.velocity.y) < GRAVITY_FORCE * 2) {
                     player.isGrounded = true;
                }
            }
        }
    }
}
