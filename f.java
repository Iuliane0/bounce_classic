package com.nokia.mid.appl.boun;

import com.nokia.mid.sound.Sound;
import javax.microedition.lcdui.Image;

public class f {
   private boolean j = true;
   public int s;
   public int r;
   public int l;
   public int o;
   public int w;
   public int a;
   public int p;
   public int d;
   public int c;
   public int b;
   public int z;
   public int t;
   public int h;
   public int g;
   public int y;
   public boolean m;
   public boolean v;
   public boolean u;
   public int C;
   public static final byte[][] f = new byte[][]{{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1}, {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1}, {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1}, {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1}, {0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1}, {0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}};
   public static final byte[][] e = new byte[][]{{0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0}, {0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0}, {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0}, {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0}, {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0}, {0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0}, {0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0}};
   public static final byte[][] x = new byte[][]{{0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0}, {0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0}, {0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0}, {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0}, {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0}, {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0}, {0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0}, {0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0}, {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0}};
   public e n;
   public Image i;
   public Image k;
   public Image B;
   public Image A;
   private int q;

   public f(int var1, int var2, int var3, e var4) {
      this.s = var1;
      this.r = var2;
      this.l = 0;
      this.o = 0;
      this.n = var4;
      this.t = 0;
      this.m = false;
      this.v = false;
      this.u = false;
      this.q = 0;
      this.h = 0;
      this.g = 0;
      this.y = 0;
      this.C = 0;
      this.z = 0;
      this.w = 0;
      this.n.a(this);
      if (var3 == 12) {
         this.c();
      } else {
         this.f();
      }

   }

   public void a(int var1, int var2) {
      this.d = var1;
      this.c = var2;
      this.b = this.a;
   }

   public void c(int var1) {
      if (var1 == 8 || var1 == 4 || var1 == 2 || var1 == 1) {
         this.w |= var1;
      }

   }

   public void a(int var1) {
      if (var1 == 8 || var1 == 4 || var1 == 2 || var1 == 1) {
         this.w &= ~var1;
      }

   }

   public void a() {
      this.w &= -16;
   }

   public boolean b(int var1, int var2) {
      int var3 = (var1 - this.p) / 12;
      int var4 = (var2 - this.p) / 12;
      int var5 = (var1 - 1 + this.p) / 12 + 1;
      int var6 = (var2 - 1 + this.p) / 12 + 1;

      for(int var7 = var3; var7 < var5; ++var7) {
         for(int var8 = var4; var8 < var6; ++var8) {
            if (!this.a(var1, var2, var8, var7)) {
               return false;
            }
         }
      }

      return true;
   }

   public void f() {
      this.a = 16;
      this.p = 8;
      this.i = this.B;
      boolean var1 = false;
      int var2 = 1;

      while(!var1) {
         var1 = true;
         if (this.b(this.s, this.r - var2)) {
            this.r -= var2;
         } else if (this.b(this.s - var2, this.r - var2)) {
            this.s -= var2;
            this.r -= var2;
         } else if (this.b(this.s + var2, this.r - var2)) {
            this.s += var2;
            this.r -= var2;
         } else if (this.b(this.s, this.r + var2)) {
            this.r += var2;
         } else if (this.b(this.s - var2, this.r + var2)) {
            this.s -= var2;
            this.r += var2;
         } else if (this.b(this.s + var2, this.r + var2)) {
            this.s += var2;
            this.r += var2;
         } else {
            var1 = false;
            ++var2;
         }
      }

   }

   public void c() {
      this.a = 12;
      this.p = 6;
      this.i = this.A;
   }

   public void e() {
      if (!this.n.x) {
         this.q = 7;
         this.z = 2;
         --this.n.h;
         this.h = 0;
         this.g = 0;
         this.y = 0;
         this.n.y = true;
         this.n.i.play(1);
      }

   }

   public void d() {
      this.n.b(500);
      ++this.n.U;
      this.n.y = true;
   }

   public void b(int var1) {
      int var2 = this.l;
      switch(var1) {
      case 30:
         this.l = this.l < this.o ? this.l : -(this.o >> 1);
         this.o = -var2;
         break;
      case 31:
         this.l = this.l > -this.o ? this.l : this.o >> 1;
         this.o = var2;
         break;
      case 32:
         this.l = this.l > this.o ? this.l : -(this.o >> 1);
         this.o = -var2;
         break;
      case 33:
         this.l = -this.l > this.o ? this.l : this.o >> 1;
         this.o = var2;
         break;
      case 34:
         this.l = this.l < this.o ? this.l : -this.o;
         this.o = -var2;
         break;
      case 35:
         this.l = this.l > -this.o ? this.l : this.o;
         this.o = var2;
         break;
      case 36:
         this.l = this.l > this.o ? this.l : -this.o;
         this.o = -var2;
         break;
      case 37:
         this.l = -this.l > this.o ? this.l : this.o;
         this.o = var2;
      }

   }

   public boolean b(int var1, int var2, int var3, int var4) {
      int var5 = var4 * 12;
      int var6 = var3 * 12;
      int var7 = var1 - this.p - var5;
      int var8 = var2 - this.p - var6;
      int var9;
      int var10;
      if (var7 >= 0) {
         var9 = var7;
         var10 = 12;
      } else {
         var9 = 0;
         var10 = this.a + var7;
      }

      int var11;
      int var12;
      if (var8 >= 0) {
         var11 = var8;
         var12 = 12;
      } else {
         var11 = 0;
         var12 = this.a + var8;
      }

      byte[][] var13;
      if (this.a == 16) {
         var13 = x;
      } else {
         var13 = e;
      }

      if (var10 > 12) {
         var10 = 12;
      }

      if (var12 > 12) {
         var12 = 12;
      }

      for(int var14 = var9; var14 < var10; ++var14) {
         for(int var15 = var11; var15 < var12; ++var15) {
            if (var13[var15 - var8][var14 - var7] != 0) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean c(int var1, int var2, int var3, int var4, int var5) {
      int var6 = var4 * 12;
      int var7 = var3 * 12;
      int var8 = var1 - this.p - var6;
      int var9 = var2 - this.p - var7;
      byte var10 = 0;
      byte var11 = 0;
      switch(var5) {
      case 30:
      case 34:
         var11 = 11;
         var10 = 11;
         break;
      case 31:
      case 35:
         var11 = 11;
      case 32:
      case 36:
      default:
         break;
      case 33:
      case 37:
         var10 = 11;
      }

      int var12;
      int var13;
      if (var8 >= 0) {
         var12 = var8;
         var13 = 12;
      } else {
         var12 = 0;
         var13 = this.a + var8;
      }

      int var14;
      int var15;
      if (var9 >= 0) {
         var14 = var9;
         var15 = 12;
      } else {
         var14 = 0;
         var15 = this.a + var9;
      }

      byte[][] var16;
      if (this.a == 16) {
         var16 = x;
      } else {
         var16 = e;
      }

      if (var13 > 12) {
         var13 = 12;
      }

      if (var15 > 12) {
         var15 = 12;
      }

      for(int var17 = var12; var17 < var13; ++var17) {
         for(int var18 = var14; var18 < var15; ++var18) {
            if ((f[Math.abs(var18 - var11)][Math.abs(var17 - var10)] & var16[var18 - var9][var17 - var8]) != 0) {
               if (!this.m) {
                  this.b(var5);
               }

               return true;
            }
         }
      }

      return false;
   }

   public boolean b(int var1, int var2, int var3, int var4, int var5) {
      int var6 = var4 * 12;
      int var7 = var3 * 12;
      int var8 = var6 + 12;
      int var9 = var7 + 12;
      switch(var5) {
      case 3:
      case 5:
      case 9:
      case 13:
      case 14:
      case 17:
      case 18:
      case 21:
      case 22:
      case 43:
      case 45:
         var6 += 4;
         var8 -= 4;
         break;
      case 4:
      case 6:
      case 15:
      case 16:
      case 19:
      case 20:
      case 23:
      case 24:
      case 44:
      case 46:
         var7 += 4;
         var9 -= 4;
      case 7:
      case 8:
      case 10:
      case 11:
      case 12:
      case 25:
      case 26:
      case 27:
      case 28:
      case 29:
      case 30:
      case 31:
      case 32:
      case 33:
      case 34:
      case 35:
      case 36:
      case 37:
      case 38:
      case 39:
      case 40:
      case 41:
      case 42:
      }

      return a(var1 - this.p, var2 - this.p, var1 + this.p - 1, var2 + this.p - 1, var6, var7, var8 - 1, var9 - 1);
   }

   public boolean a(int var1, int var2, int var3, int var4, int var5) {
      int var6 = var4 * 12;
      int var7 = var3 * 12;
      int var8 = var6 + 12;
      int var9 = var7 + 12;
      switch(var5) {
      case 13:
      case 17:
         var6 += 6;
         var8 -= 6;
         var9 -= 11;
         break;
      case 14:
      case 18:
      case 22:
      case 26:
         var6 += 6;
         var8 -= 6;
         var7 += 11;
         break;
      case 15:
      case 19:
      case 23:
      case 27:
         var7 += 6;
         var9 -= 6;
         var8 -= 11;
         break;
      case 16:
      case 20:
      case 24:
      case 28:
         var7 += 6;
         var9 -= 6;
         var6 += 11;
         break;
      case 21:
      case 25:
         var9 = var7--;
         var6 += 6;
         var8 -= 6;
      }

      return a(var1 - this.p, var2 - this.p, var1 + this.p, var2 + this.p, var6, var7, var8, var9);
   }

   public boolean a(int var1, int var2, int var3, int var4) {
      if (var3 < this.n.ai && var3 >= 0 && var4 < this.n.c && var4 >= 0) {
         if (this.z == 2) {
            return false;
         } else {
            boolean var5 = true;
            int var6 = this.n.C[var3][var4] & 64;
            int var7 = this.n.C[var3][var4] & -65 & -129;
            Sound var8 = null;
            switch(var7) {
            case 0:
            case 8:
            case 11:
            case 12:
            case 26:
            default:
               break;
            case 1:
               if (this.b(var1, var2, var3, var4)) {
                  var5 = false;
                  this.u = true;
               } else {
                  this.u = true;
               }
               break;
            case 2:
               if (this.b(var1, var2, var3, var4)) {
                  this.v = true;
                  var5 = false;
               } else {
                  this.u = true;
               }
               break;
            case 3:
            case 4:
            case 5:
            case 6:
               if (this.b(var1, var2, var3, var4, var7)) {
                  var5 = false;
                  this.e();
               }
               break;
            case 7:
               this.n.b(200);
               this.n.C[this.c][this.d] = 128;
               this.a(var4, var3);
               this.n.C[var3][var4] = 136;
               var8 = this.n.j;
               break;
            case 9:
               if (this.b(var1, var2, var3, var4, var7)) {
                  if (this.n.M) {
                     this.n.e = true;
                     var8 = this.n.j;
                  } else {
                     var5 = false;
                  }
               }
               break;
            case 10:
               int var9 = this.n.b(var4, var3);
               if (var9 != -1) {
                  int var10 = this.n.P[var9][0] * 12 + this.n.w[var9][0];
                  int var11 = this.n.P[var9][1] * 12 + this.n.w[var9][1];
                  if (a(var1 - this.p + 1, var2 - this.p + 1, var1 + this.p - 1, var2 + this.p - 1, var10 + 1, var11 + 1, var10 + 24 - 1, var11 + 24 - 1)) {
                     var5 = false;
                     this.e();
                  }
               }
               break;
            case 13:
               if (this.b(var1, var2, var3, var4, var7)) {
                  if (this.a == 16) {
                     var5 = false;
                  } else {
                     if (this.a(var1, var2, var3, var4, var7)) {
                        var5 = false;
                     }

                     this.d();
                     this.n.C[var3][var4] = (short)(145 | var6);
                     this.n.C[var3 + 1][var4] = (short)(146 | var6);
                     var8 = this.n.ah;
                  }
               }
               break;
            case 14:
               if (this.b(var1, var2, var3, var4, var7)) {
                  if (this.a == 16) {
                     var5 = false;
                  } else {
                     this.d();
                     this.n.C[var3][var4] = (short)(146 | var6);
                     this.n.C[var3 - 1][var4] = (short)(145 | var6);
                     var8 = this.n.ah;
                  }
               }
               break;
            case 15:
               if (this.b(var1, var2, var3, var4, var7)) {
                  if (this.a == 16) {
                     var5 = false;
                  } else {
                     if (this.a(var1, var2, var3, var4, var7)) {
                        var5 = false;
                     }

                     this.d();
                     this.n.C[var3][var4] = (short)(147 | var6);
                     this.n.C[var3][var4 + 1] = (short)(148 | var6);
                     var8 = this.n.ah;
                  }
               }
               break;
            case 16:
               if (this.b(var1, var2, var3, var4, var7)) {
                  if (this.a == 16) {
                     var5 = false;
                  } else {
                     if (this.a(var1, var2, var3, var4, var7)) {
                        var5 = false;
                     }

                     this.d();
                     this.n.C[var3][var4] = (short)(148 | var6);
                     this.n.C[var3][var4 - 1] = (short)(147 | var6);
                     var8 = this.n.ah;
                  }
               }
               break;
            case 17:
            case 19:
            case 20:
               if (this.b(var1, var2, var3, var4, var7)) {
                  if (this.a == 16) {
                     var5 = false;
                  } else if (this.a(var1, var2, var3, var4, var7)) {
                     var5 = false;
                  }
               }
               break;
            case 18:
               if (this.b(var1, var2, var3, var4, var7) && this.a == 16) {
                  var5 = false;
               }
               break;
            case 21:
               if (this.b(var1, var2, var3, var4, var7)) {
                  if (this.a(var1, var2, var3, var4, var7)) {
                     var5 = false;
                  }

                  this.d();
                  this.n.C[var3][var4] = (short)(153 | var6);
                  this.n.C[var3 + 1][var4] = (short)(154 | var6);
                  var8 = this.n.ah;
               }
               break;
            case 22:
               if (this.b(var1, var2, var3, var4, var7)) {
                  this.d();
                  this.n.C[var3][var4] = (short)(154 | var6);
                  this.n.C[var3 - 1][var4] = (short)(153 | var6);
                  var8 = this.n.ah;
               }
               break;
            case 23:
               if (this.b(var1, var2, var3, var4, var7)) {
                  if (this.a(var1, var2, var3, var4, var7)) {
                     var5 = false;
                  } else {
                     this.d();
                     this.n.C[var3][var4] = (short)(155 | var6);
                     this.n.C[var3][var4 + 1] = (short)(156 | var6);
                     var8 = this.n.ah;
                  }
               }
               break;
            case 24:
               if (this.b(var1, var2, var3, var4, var7)) {
                  if (this.a(var1, var2, var3, var4, var7)) {
                     var5 = false;
                  }

                  this.d();
                  this.n.C[var3][var4] = (short)(156 | var6);
                  this.n.C[var3][var4 - 1] = (short)(155 | var6);
                  var8 = this.n.ah;
               }
               break;
            case 25:
            case 27:
            case 28:
               if (this.a(var1, var2, var3, var4, var7)) {
                  var5 = false;
               }
               break;
            case 29:
               this.n.b(1000);
               if (this.n.h < 5) {
                  ++this.n.h;
                  this.n.y = true;
               }

               this.n.C[var3][var4] = 128;
               var8 = this.n.j;
               break;
            case 30:
            case 31:
            case 32:
            case 33:
               if (this.c(var1, var2, var3, var4, var7)) {
                  var5 = false;
                  this.u = true;
               }
               break;
            case 34:
            case 35:
            case 36:
            case 37:
               if (this.c(var1, var2, var3, var4, var7)) {
                  this.v = true;
                  var5 = false;
                  this.u = true;
               }
               break;
            case 38:
               this.h = 300;
               var8 = this.n.j;
               var5 = false;
               break;
            case 39:
            case 40:
            case 41:
            case 42:
               var5 = false;
               if (this.a == 16) {
                  this.c();
               }
               break;
            case 43:
            case 44:
            case 45:
            case 46:
               if (this.b(var1, var2, var3, var4, var7)) {
                  var5 = false;
                  if (this.a == 12) {
                     this.f();
                  }
               }
               break;
            case 47:
            case 48:
            case 49:
            case 50:
               this.g = 300;
               var8 = this.n.j;
               this.m = false;
               var5 = false;
               break;
            case 51:
            case 52:
            case 53:
            case 54:
               this.y = 300;
               var8 = this.n.j;
               var5 = false;
            }

            if (var8 != null) {
               var8.play(1);
            }

            return var5;
         }
      } else {
         return false;
      }
   }

   public void b() {
      int var1 = this.s;
      boolean var2 = false;
      boolean var3 = false;
      boolean var4 = false;
      boolean var5 = false;
      if (this.z == 2) {
         --this.q;
         if (this.q == 0) {
            this.z = 1;
            if (this.n.h < 0) {
               this.n.e = true;
            }
         }

      } else {
         int var6 = this.s / 12;
         int var7 = this.r / 12;
         boolean var8 = (this.n.C[var7][var6] & 64) != 0;
         int var15;
         int var16;
         if (var8) {
            if (this.a == 16) {
               var16 = -30;
               var15 = -2;
               if (this.m) {
                  this.o = -10;
               }
            } else {
               var16 = 42;
               var15 = 6;
            }
         } else if (this.a == 16) {
            var16 = 38;
            var15 = 3;
         } else {
            var16 = 80;
            var15 = 4;
         }

         if (this.g != 0) {
            var5 = true;
            var16 *= -1;
            var15 *= -1;
            --this.g;
            if (this.g == 0) {
               var5 = false;
               this.m = false;
               var16 *= -1;
               var15 *= -1;
            }
         }

         if (this.y != 0) {
            if (-1 * Math.abs(this.t) > -80) {
               if (var5) {
                  this.t = 80;
               } else {
                  this.t = -80;
               }
            }

            --this.y;
         }

         ++this.C;
         if (this.C == 3) {
            this.C = 0;
         }

         if (this.o < -150) {
            this.o = -150;
         } else if (this.o > 150) {
            this.o = 150;
         }

         if (this.l < -150) {
            this.l = -150;
         } else if (this.l > 150) {
            this.l = 150;
         }

         if (this.o < 10 && this.o > 0 && !var8 && !var5) {
            this.o = 10;
         }

         int var10;
         for(int var9 = 0; var9 < Math.abs(this.o) / 10; ++var9) {
            var10 = 0;
            if (this.o != 0) {
               var10 = this.o < 0 ? -1 : 1;
            }

            if (this.b(this.s, this.r + var10)) {
               this.r += var10;
               this.m = false;
               if (var16 == -30) {
                  var7 = this.r / 12;
                  if ((this.n.C[var7][var6] & 64) == 0) {
                     this.o >>= 1;
                     if (this.o <= 10 && this.o >= -10) {
                        this.o = 0;
                     }
                  }
               }
            } else {
               if (this.u && this.l < 10 && this.C == 0) {
                  byte var11 = 1;
                  if (this.b(this.s + var11, this.r + var10)) {
                     this.s += var11;
                     this.r += var10;
                     this.u = false;
                  } else if (this.b(this.s - var11, this.r + var10)) {
                     this.s -= var11;
                     this.r += var10;
                     this.u = false;
                  }
               }

               if (var10 > 0 || var5 && var10 < 0) {
                  this.o = this.o * -1 / 2;
                  this.m = true;
                  if (this.v && (this.w & 8) != 0) {
                     this.v = false;
                     if (var5) {
                        this.t += 10;
                     } else {
                        this.t += -10;
                     }
                  } else if (this.y == 0) {
                     this.t = 0;
                  }

                  if (this.o < 10 && this.o > -10) {
                     if (var5) {
                        this.o = -10;
                     } else {
                        this.o = 10;
                     }
                  }
                  break;
               }

               if (var10 < 0 || var5 && var10 > 0) {
                  if (var5) {
                     this.o = -20;
                  } else {
                     this.o = -this.o >> 1;
                  }
               }
            }
         }

         if (var5) {
            if (var15 == -2 && this.o < var16) {
               this.o += var15;
               if (this.o > var16) {
                  this.o = var16;
               }
            } else if (!this.m && this.o > var16) {
               this.o += var15;
               if (this.o < var16) {
                  this.o = var16;
               }
            }
         } else if (var15 == -2 && this.o > var16) {
            this.o += var15;
            if (this.o < var16) {
               this.o = var16;
            }
         } else if (!this.m && this.o < var16) {
            this.o += var15;
            if (this.o > var16) {
               this.o = var16;
            }
         }

         byte var17;
         if (this.h != 0) {
            var17 = 100;
            --this.h;
         } else {
            var17 = 50;
         }

         if ((this.w & 2) != 0 && this.l < var17) {
            this.l += 6;
         } else if ((this.w & 1) != 0 && this.l > -var17) {
            this.l -= 6;
         } else if (this.l > 0) {
            this.l -= 4;
         } else if (this.l < 0) {
            this.l += 4;
         }

         if (this.a == 16 && this.y == 0) {
            if (var5) {
               this.t += 5;
            } else {
               this.t += -5;
            }
         }

         if (this.m && (this.w & 8) != 0) {
            if (var5) {
               this.o = 67 + this.t;
            } else {
               this.o = -67 + this.t;
            }

            this.m = false;
         }

         var10 = Math.abs(this.l);
         int var18 = var10 / 10;

         for(int var12 = 0; var12 < var18; ++var12) {
            int var13 = 0;
            if (this.l != 0) {
               var13 = this.l < 0 ? -1 : 1;
            }

            if (this.b(this.s + var13, this.r)) {
               this.s += var13;
            } else if (this.u) {
               this.u = false;
               boolean var14 = false;
               byte var19;
               if (var5) {
                  var19 = 1;
               } else {
                  var19 = -1;
               }

               if (this.b(this.s + var13, this.r + var19)) {
                  this.s += var13;
                  this.r += var19;
               } else if (this.b(this.s + var13, this.r - var19)) {
                  this.s += var13;
                  this.r -= var19;
               } else {
                  this.l = -(this.l >> 1);
               }
            }
         }

      }
   }

   public static boolean a(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      return var0 <= var6 && var1 <= var7 && var4 <= var2 && var5 <= var3;
   }
}
