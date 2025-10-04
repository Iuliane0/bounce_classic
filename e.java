package com.nokia.mid.appl.boun;

import com.nokia.mid.sound.Sound;
import java.io.DataInputStream;
import java.io.IOException;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public class e extends b {
   public int ap;
   public Image t;
   private int n;
   public Sound ah;
   public Sound j;
   public Sound i;
   public a R;
   public f aq;
   public int U;
   public int h;
   public int f;
   public int ad;
   public int p;
   public boolean e;
   public boolean q;
   public boolean y;
   public final Font Y = Font.getFont(32, 0, 8);
   public Image F;
   public Graphics X = null;
   public boolean T;
   private boolean af = false;
   public boolean x = false;
   private int g = 0;
   private static final String[] aj = new String[]{"/icons/nokiagames.png", "/icons/bouncesplash.png"};
   public boolean H = true;
   private long K = System.currentTimeMillis();

   public e(a var1, int var2) {
      super(var1.m);
      this.R = var1;
      this.ah = this.b("/sounds/up.ott");
      this.j = this.b("/sounds/pickup.ott");
      this.i = this.b("/sounds/pop.ott");
      this.F = Image.createImage(128, 128);
      this.ap = 1;

      try {
         this.t = Image.createImage(aj[this.ap]);
      } catch (IOException var4) {
         this.t = Image.createImage(1, 1);
      }

      this.d();
   }

   public void a(int var1, int var2, int var3) {
      super.ac = var1;
      this.U = 0;
      this.h = var3;
      this.f = var2;
      this.e = false;
      this.q = false;
      this.l();
      this.T = true;
   }

   public void a(int var1, int var2) {
      super.ac = this.R.B;
      this.U = this.R.t;
      this.h = this.R.C;
      this.f = this.R.G;
      this.r();
      this.a(super.ac);
      this.k();
      this.b();
      this.p = 120;
      this.y = true;
      if (this.R.e != super.s && this.R.b != super.S) {
         super.C[this.R.b][this.R.e] = (short)(8 | super.C[this.R.b][this.R.e] & 64);
      }

      this.a(var1, var2, this.R.A, this.R.a, this.R.g);
      f var3 = this.aq;
      synchronized(var3) {
         this.aq.a(this.R.e, this.R.b);
         this.aq.h = this.R.w;
         this.aq.g = this.R.z;
         this.aq.y = this.R.n;
         this.T = true;
      }
   }

   private void l() {
      this.r();
      this.a(super.ac);
      this.U = 0;
      this.p = 120;
      this.y = true;
      this.a(super.s * 12 + 6, super.S * 12 + 6, super.a, 0, 0);
      this.aq.a(super.s, super.S);
      this.T = true;
   }

   public void a(int var1, int var2, int var3, int var4, int var5) {
      this.aq = new f(var1, var2, var3, this);
      this.aq.l = var4;
      this.aq.o = var5;
      super.l = 0;
      super.k = 0;
      this.e();
   }

   public void e() {
      int var1 = this.aq.s - 64;
      if (var1 < 0) {
         var1 = 0;
      } else if (var1 > super.c * 12 - 156) {
         var1 = super.c * 12 - 156;
      }

      super.l = var1 / 12;
      super.v = super.l * 12 - var1;
      super.Z = 156;

      for(super.G = super.l + 13; this.aq.r - 6 < super.k * 12; super.k -= 7) {
      }

      while(this.aq.r + 6 > super.k * 12 + 96) {
         super.k += 7;
      }

      this.f();
   }

   public void b(int var1) {
      this.f += var1;
      this.y = true;
   }

   public void q() {
      if (this.X == null) {
         this.X = this.F.getGraphics();
      }

      this.X.setClip(0, 0, 128, 96);
      if (super.E != null) {
         this.i();
         if (super.v <= 0) {
            this.X.drawImage(super.E, super.v, 0, 20);
         } else {
            this.X.drawImage(super.E, super.v, 0, 20);
            this.X.drawImage(super.E, super.v - 156, 0, 20);
         }
      }

      this.a(this.X, super.v);
      this.a(this.X, this.aq.s, this.aq.r, this.aq.p, super.v);
      this.X.setClip(0, 0, 128, 128);
      if (this.y) {
         this.X.setColor(545706);
         this.X.fillRect(0, 97, 128, 32);

         for(int var1 = 0; var1 < this.h; ++var1) {
            this.X.drawImage(super.A, 5 + var1 * (super.A.getWidth() - 1), 99, 20);
         }

         for(int var2 = 0; var2 < super.ao - this.U; ++var2) {
            this.X.drawImage(super.D, 5 + var2 * (super.D.getWidth() - 4), 112, 20);
         }

         this.X.setColor(16777214);
         this.X.setFont(this.Y);
         this.X.drawString(d(this.f), 64, 100, 20);
         if (this.ad != 0) {
            this.X.setColor(16750611);
            this.X.fillRect(1, 128 - 3 * this.ad / 30, 5, 128);
         }

         this.y = false;
      }

   }

   public void paint(Graphics var1) {
      if (this.ap != -1) {
         if (this.t != null) {
            var1.setColor(0);
            var1.fillRect(0, 0, super.ag, super.am);
            var1.drawImage(this.t, super.ag >> 1, super.am >> 1, 3);
         }
      } else {
         var1.drawImage(this.F, 0, 0, 20);
         if (this.p != 0) {
            var1.setColor(16777214);
            var1.setFont(this.Y);
            var1.drawString(super.N, 44, 84, 20);
         }
      }

   }

   public void a(Graphics var1, int var2) {
      if (this.aq != null) {
         int var3 = this.aq.s - super.l * 12;
         int var4 = this.aq.r - super.k * 12;
         if (this.aq.z == 2) {
            var1.drawImage(this.aq.k, var3 - 6 + var2, var4 - 6, 20);
         } else {
            var1.drawImage(this.aq.i, var3 - this.aq.p + var2, var4 - this.aq.p, 20);
         }

      }
   }

   public void a() {
      if (super.d) {
         this.l();
         this.repaint();
      } else if (this.ap != -1) {
         if (this.t != null && this.t != null) {
            if (this.n > 30) {
               this.t = null;
               Runtime.getRuntime().gc();
               switch(this.ap) {
               case 0:
                  this.ap = 1;

                  try {
                     this.t = Image.createImage(aj[this.ap]);
                  } catch (IOException var6) {
                     this.t = Image.createImage(1, 1);
                  }

                  this.repaint();
                  break;
               case 1:
                  this.ap = -1;
                  this.H = false;
                  this.R.f();
               }

               this.n = 0;
            } else {
               ++this.n;
            }
         } else {
            this.H = false;
            this.R.f();
         }

         this.repaint();
      } else {
         if (this.p != 0) {
            --this.p;
         }

         f var1 = this.aq;
         synchronized(var1) {
            if (this.aq.r - 6 >= super.k * 12 && this.aq.r + 6 <= super.k * 12 + 96) {
               this.aq.b();
            } else {
               this.e();
            }

            if (this.aq.z == 1) {
               if (this.h < 0) {
                  this.R.a();
                  this.j();
                  this.R.b(false);
                  return;
               }

               int var2 = this.aq.d;
               int var3 = this.aq.c;
               int var4 = this.aq.b;
               this.a(this.aq.d * 12 + 6, this.aq.c * 12 + 6, this.aq.b, 0, 0);
               this.aq.d = var2;
               this.aq.c = var3;
               this.aq.b = var4;
            }

            if (super.B != 0) {
               this.o();
            }

            if (this.U == super.ao) {
               this.q = true;
            }

            if (this.q && super.z && (super.W + 1) * 12 > this.m() && super.W * 12 < this.g()) {
               if (super.M) {
                  super.z = false;
                  this.q = false;
               } else {
                  this.h();
               }

               short[] var10000 = super.C[super.u];
               int var10001 = super.al;
               var10000[var10001] = (short)(var10000[var10001] | 128);
               var10000 = super.C[super.u];
               var10001 = super.al + 1;
               var10000[var10001] = (short)(var10000[var10001] | 128);
               var10000 = super.C[super.u + 1];
               var10001 = super.al;
               var10000[var10001] = (short)(var10000[var10001] | 128);
               var10000 = super.C[super.u + 1];
               var10001 = super.al + 1;
               var10000[var10001] = (short)(var10000[var10001] | 128);
            }

            this.ad = 0;
            if (this.aq.h != 0 || this.aq.g != 0 || this.aq.y != 0) {
               if (this.aq.h > this.ad) {
                  this.ad = this.aq.h;
               }

               if (this.aq.g > this.ad) {
                  this.ad = this.aq.g;
               }

               if (this.aq.y > this.ad) {
                  this.ad = this.aq.y;
               }

               if (this.ad % 30 == 0 || this.ad == 1) {
                  this.y = true;
               }
            }
         }

         this.c(this.aq.s);
         this.q();
         this.repaint();
         if (this.e) {
            this.e = false;
            this.q = false;
            super.d = true;
            ++super.ac;
            this.b(5000);
            this.R.a();
            if (super.ac > 11) {
               this.R.b(true);
            } else {
               this.H = false;
               this.R.d();
               this.repaint();
            }
         }

      }
   }

   public void keyPressed(int var1) {
      if (this.ap != -1) {
         this.n = 31;
      } else if (this.aq != null) {
         f var2 = this.aq;
         synchronized(var2) {
            switch(var1) {
            case -7:
            case -6:
               this.H = false;
               this.R.f();
               break;
            case 35:
               if (this.af) {
                  this.aq.g = 300;
               }
               break;
            case 49:
               if (this.af) {
                  super.d = true;
                  if (--super.ac < 1) {
                     super.ac = 11;
                  }
               }
               break;
            case 51:
               if (this.af) {
                  super.d = true;
                  if (++super.ac > 11) {
                     super.ac = 1;
                  }
               }
               break;
            case 55:
               if (this.g != 0 && this.g != 2) {
                  this.g = 0;
               } else {
                  ++this.g;
               }
               break;
            case 56:
               if (this.g != 1 && this.g != 3) {
                  if (this.g == 5) {
                     this.ah.play(1);
                     this.x = true;
                     this.g = 0;
                  } else {
                     this.g = 0;
                  }
               } else {
                  ++this.g;
               }
               break;
            case 57:
               if (this.g == 4) {
                  ++this.g;
               } else if (this.g == 5) {
                  this.i.play(1);
                  this.af = true;
                  this.g = 0;
               } else {
                  this.g = 0;
               }
               break;
            default:
               switch(this.getGameAction(var1)) {
               case 1:
                  this.aq.c(8);
                  break;
               case 2:
                  this.aq.c(1);
               case 3:
               case 4:
               case 7:
               default:
                  break;
               case 5:
                  this.aq.c(2);
                  break;
               case 6:
                  this.aq.c(4);
                  break;
               case 8:
                  if (this.af) {
                     this.e = true;
                  }
               }
            }

         }
      }
   }

   public void keyReleased(int var1) {
      if (this.aq != null) {
         f var2 = this.aq;
         synchronized(var2) {
            switch(this.getGameAction(var1)) {
            case 1:
               this.aq.a(8);
               break;
            case 2:
               this.aq.a(1);
            case 3:
            case 4:
            default:
               break;
            case 5:
               this.aq.a(2);
               break;
            case 6:
               this.aq.a(4);
            }

         }
      }
   }

   public static String d(int var0) {
      String var1;
      if (var0 < 100) {
         var1 = "0000000";
      } else if (var0 < 1000) {
         var1 = "00000";
      } else if (var0 < 10000) {
         var1 = "0000";
      } else if (var0 < 100000) {
         var1 = "000";
      } else if (var0 < 1000000) {
         var1 = "00";
      } else if (var0 < 10000000) {
         var1 = "0";
      } else {
         var1 = "";
      }

      return var1 + var0;
   }

   protected Sound b(String var1) {
      byte[] var3 = new byte[100];
      Sound var5 = null;
      DataInputStream var2 = new DataInputStream(this.getClass().getResourceAsStream(var1));

      try {
         int var6 = var2.read(var3);
         var2.close();
         byte[] var4 = new byte[var6];
         System.arraycopy(var3, 0, var4, 0, var6);
         var5 = new Sound(var4, 1);
      } catch (IOException var8) {
         var5 = new Sound(1000, 500L);
         var5.play(3);
      }

      return var5;
   }

   public void hideNotify() {
      if (this.H) {
         if (this.aq != null) {
            this.aq.a();
         }

         this.R.f();
      }

      this.H = true;
   }

   public void b() {
      for(int var1 = 0; var1 < this.R.r; ++var1) {
         super.ae[var1][0] = this.R.l[var1][0];
         super.ae[var1][1] = this.R.l[var1][1];
         super.w[var1][0] = this.R.D[var1][0];
         super.w[var1][1] = this.R.D[var1][1];
      }

      this.R.D = null;
      this.R.l = null;
      this.R.r = 0;
   }

   public void k() {
      for(int var1 = 0; var1 < super.ai; ++var1) {
         for(int var2 = 0; var2 < super.c; ++var2) {
            byte var3 = (byte)(super.C[var1][var2] & 'ｿ' & -65);
            switch(var3) {
            case 7:
            case 29:
               if (this.a(var1, var2, var3)) {
                  super.C[var1][var2] = (short)(0 | super.C[var1][var2] & 64);
               }
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 17:
            case 18:
            case 19:
            case 20:
            case 25:
            case 26:
            case 27:
            case 28:
            default:
               break;
            case 13:
               if (this.a(var1, var2, var3)) {
                  super.C[var1][var2] = (short)(17 | super.C[var1][var2] & 64);
               }
               break;
            case 14:
               if (this.a(var1, var2, var3)) {
                  super.C[var1][var2] = (short)(18 | super.C[var1][var2] & 64);
               }
               break;
            case 15:
               if (this.a(var1, var2, var3)) {
                  super.C[var1][var2] = (short)(19 | super.C[var1][var2] & 64);
               }
               break;
            case 16:
               if (this.a(var1, var2, var3)) {
                  super.C[var1][var2] = (short)(20 | super.C[var1][var2] & 64);
               }
               break;
            case 21:
               if (this.a(var1, var2, var3)) {
                  super.C[var1][var2] = (short)(25 | super.C[var1][var2] & 64);
               }
               break;
            case 22:
               if (this.a(var1, var2, var3)) {
                  super.C[var1][var2] = (short)(26 | super.C[var1][var2] & 64);
               }
               break;
            case 23:
               if (this.a(var1, var2, var3)) {
                  super.C[var1][var2] = (short)(27 | super.C[var1][var2] & 64);
               }
               break;
            case 24:
               if (this.a(var1, var2, var3)) {
                  super.C[var1][var2] = (short)(28 | super.C[var1][var2] & 64);
               }
            }
         }
      }

      this.R.u = null;
      this.R.p = 0;
   }

   public boolean a(int var1, int var2, byte var3) {
      for(int var4 = 0; var4 < this.R.p; ++var4) {
         if (this.R.u[var4][0] == var1 && this.R.u[var4][1] == var2) {
            return false;
         }
      }

      return true;
   }
}
