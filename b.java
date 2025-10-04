package com.nokia.mid.appl.boun;

import com.nokia.mid.ui.DirectGraphics;
import com.nokia.mid.ui.DirectUtils;
import com.nokia.mid.ui.FullCanvas;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public abstract class b extends FullCanvas {
   protected int l;
   protected int k;
   protected int G;
   protected int Z;
   protected int v;
   protected boolean z;
   protected Image E;
   private Image[] Q;
   private Image I;
   private Graphics J;
   public int ac = -1;
   public String N;
   public String ak;
   public boolean d;
   protected int s;
   protected int S;
   public int a;
   protected int W;
   protected int V;
   public short[][] C;
   public int c;
   public int ai;
   public int ao;
   public int B;
   public short[][] P;
   public short[][] O;
   public short[][] ae;
   public short[][] w;
   public Image[] r;
   public Graphics[] an;
   public Image L;
   public Image A;
   public Image D;
   public int al;
   public int u;
   public Image aa;
   public Image o;
   public int b;
   public boolean M;
   protected int ag = 0;
   protected int am = 0;
   protected Display m;
   public g ab = null;

   public b(Display var1) {
      this.m = var1;
      this.ag = super.getWidth();
      this.am = super.getHeight();
      this.v = 0;
      this.Z = 156;
      this.E = Image.createImage(156, 96);
      this.I = Image.createImage(12, 12);
      this.J = this.I.getGraphics();
      this.c();
      this.d = false;
      this.l = 0;
      this.k = 0;
      this.z = false;
      this.G = this.l + 13;
      this.C = null;
   }

   public void a(int var1) {
      InputStream var2 = null;
      DataInputStream var3 = null;
      this.d = false;
      String var4 = "";
      String[] var5 = new String[]{(new Integer(this.ac)).toString()};
      this.N = com.nokia.mid.appl.boun.c.a(9, var5);
      this.ak = com.nokia.mid.appl.boun.c.a(10, var5);
      var5[0] = null;
      var5 = null;
      if (var1 < 10) {
         var4 = "00" + var1;
      } else if (var1 < 100) {
         var4 = "0" + var1;
      }

      try {
         var2 = this.getClass().getResourceAsStream("/levels/J2MElvl." + var4);
         var3 = new DataInputStream(var2);
         this.s = var3.read();
         this.S = var3.read();
         int var6 = var3.read();
         if (var6 == 0) {
            this.a = 12;
         } else {
            this.a = 16;
         }

         this.W = var3.read();
         this.V = var3.read();
         this.a(this.W, this.V, this.Q[12]);
         this.ao = var3.read();
         this.c = var3.read();
         this.ai = var3.read();
         this.C = new short[this.ai][this.c];

         for(int var7 = 0; var7 < this.ai; ++var7) {
            for(int var8 = 0; var8 < this.c; ++var8) {
               this.C[var7][var8] = (short)var3.read();
            }
         }

         this.B = var3.read();
         if (this.B != 0) {
            this.a(var3);
         }

         var3.close();
      } catch (IOException var9) {
      }

   }

   public static Image a(Image var0, int var1) {
      Image var2 = DirectUtils.createImage(var0.getWidth(), var0.getHeight(), 0);
      if (var2 == null) {
         var2 = Image.createImage(var0.getWidth(), var0.getHeight());
      }

      Graphics var3 = var2.getGraphics();
      DirectGraphics var4 = DirectUtils.getDirectGraphics(var3);
      switch(var1) {
      case 0:
         var4.drawImage(var0, 0, 0, 20, 8192);
         break;
      case 1:
         var4.drawImage(var0, 0, 0, 20, 16384);
         break;
      case 2:
         var4.drawImage(var0, 0, 0, 20, 24576);
         break;
      case 3:
         var4.drawImage(var0, 0, 0, 20, 90);
         break;
      case 4:
         var4.drawImage(var0, 0, 0, 20, 180);
         break;
      case 5:
         var4.drawImage(var0, 0, 0, 20, 270);
         break;
      default:
         var3.drawImage(var0, 0, 0, 20);
      }

      return var2;
   }

   public void a(DataInputStream var1) throws IOException {
      this.P = new short[this.B][2];
      this.O = new short[this.B][2];
      this.ae = new short[this.B][2];
      this.w = new short[this.B][2];
      this.r = new Image[this.B];
      this.an = new Graphics[this.B];

      for(int var4 = 0; var4 < this.B; ++var4) {
         this.P[var4][0] = (short)var1.read();
         this.P[var4][1] = (short)var1.read();
         this.O[var4][0] = (short)var1.read();
         this.O[var4][1] = (short)var1.read();
         this.ae[var4][0] = (short)var1.read();
         this.ae[var4][1] = (short)var1.read();
         int var2 = var1.read();
         int var3 = var1.read();
         this.w[var4][0] = (short)var2;
         this.w[var4][1] = (short)var3;
      }

      this.L = Image.createImage(24, 24);
      Graphics var5 = this.L.getGraphics();
      var5.drawImage(this.Q[46], 0, 0, 20);
      var5.drawImage(a(this.Q[46], 0), 12, 0, 20);
      var5.drawImage(a(this.Q[46], 4), 12, 12, 20);
      var5.drawImage(a(this.Q[46], 1), 0, 12, 20);
      var5 = null;
   }

   public void r() {
      for(int var1 = 0; var1 < this.B; ++var1) {
         this.r[var1] = null;
         this.an[var1] = null;
      }

      this.r = null;
      this.an = null;
      this.C = null;
      Runtime.getRuntime().gc();
   }

   public void o() {
      for(int var1 = 0; var1 < this.B; ++var1) {
         short var2 = this.P[var1][0];
         short var3 = this.P[var1][1];
         short var4 = this.w[var1][0];
         short var5 = this.w[var1][1];
         short[] var10000 = this.w[var1];
         var10000[0] += this.ae[var1][0];
         int var8 = (this.O[var1][0] - var2 - 2) * 12;
         int var9 = (this.O[var1][1] - var3 - 2) * 12;
         if (this.w[var1][0] < 0) {
            this.w[var1][0] = 0;
         } else if (this.w[var1][0] > var8) {
            this.w[var1][0] = (short)var8;
         }

         if (this.w[var1][0] == 0 || this.w[var1][0] == var8) {
            this.ae[var1][0] = (short)(-this.ae[var1][0]);
         }

         var10000 = this.w[var1];
         var10000[1] += this.ae[var1][1];
         if (this.w[var1][1] < 0) {
            this.w[var1][1] = 0;
         } else if (this.w[var1][1] > var9) {
            this.w[var1][1] = (short)var9;
         }

         if (this.w[var1][1] == 0 || this.w[var1][1] == var9) {
            var10000 = this.ae[var1];
            var10000[1] = (short)(var10000[1] * -1);
         }

         short var6 = this.w[var1][0];
         short var7 = this.w[var1][1];
         short var10;
         if (var6 < var4) {
            var10 = var6;
            var6 = var4;
            var4 = var10;
         }

         if (var7 < var5) {
            var10 = var7;
            var7 = var5;
            var5 = var10;
         }

         int var14 = var6 + 23;
         int var15 = var7 + 23;
         int var12 = var4 / 12;
         int var13 = var5 / 12;
         var14 = var14 / 12 + 1;
         var15 = var15 / 12 + 1;

         for(int var16 = var12; var16 < var14; ++var16) {
            for(int var11 = var13; var11 < var15; ++var11) {
               var10000 = this.C[var3 + var11];
               var10000[var2 + var16] = (short)(var10000[var2 + var16] | 128);
            }
         }
      }

   }

   public int b(int var1, int var2) {
      for(int var3 = 0; var3 < this.B; ++var3) {
         if (this.P[var3][0] <= var1 && this.O[var3][0] > var1 && this.P[var3][1] <= var2 && this.O[var3][1] > var2) {
            return var3;
         }
      }

      return -1;
   }

   public void a(int var1, int var2, int var3, int var4) {
      Graphics var5 = this.E.getGraphics();
      if (var1 >= 0 && var2 >= 0 && var1 < this.c && var2 < this.ai) {
         short[] var10000 = this.C[var2];
         var10000[var1] = (short)(var10000[var1] & 'ｿ');
         int var6 = this.C[var2][var1];
         boolean var7 = (var6 & 64) != 0;
         if (var7) {
            var6 &= -65;
         }

         var5.setColor(var7 ? 1073328 : 11591920);
         int var8;
         int var9;
         switch(var6) {
         case 0:
            var5.fillRect(var3, var4, 12, 12);
            break;
         case 1:
            var5.drawImage(this.Q[0], var3, var4, 20);
            break;
         case 2:
            var5.drawImage(this.Q[1], var3, var4, 20);
            break;
         case 3:
            if (var7) {
               var5.drawImage(this.Q[6], var3, var4, 20);
            } else {
               var5.drawImage(this.Q[2], var3, var4, 20);
            }
            break;
         case 4:
            if (var7) {
               var5.drawImage(this.Q[9], var3, var4, 20);
            } else {
               var5.drawImage(this.Q[5], var3, var4, 20);
            }
            break;
         case 5:
            if (var7) {
               var5.drawImage(this.Q[7], var3, var4, 20);
            } else {
               var5.drawImage(this.Q[3], var3, var4, 20);
            }
            break;
         case 6:
            if (var7) {
               var5.drawImage(this.Q[8], var3, var4, 20);
            } else {
               var5.drawImage(this.Q[4], var3, var4, 20);
            }
            break;
         case 7:
            var5.drawImage(this.Q[10], var3, var4, 20);
            break;
         case 8:
            var5.drawImage(this.Q[11], var3, var4, 20);
            break;
         case 9:
            var8 = (var1 - this.al) * 12;
            var9 = (var2 - this.u) * 12;
            var5.setClip(var3, var4, 12, 12);
            var5.drawImage(this.aa, var3 - var8, var4 - var9, 20);
            var5.setClip(0, 0, this.E.getWidth(), this.E.getHeight());
            this.z = true;
            break;
         case 10:
            var8 = this.b(var1, var2);
            if (var8 != -1) {
               var9 = (var1 - this.P[var8][0]) * 12;
               int var10 = (var2 - this.P[var8][1]) * 12;
               int var11 = this.w[var8][0] - var9;
               int var12 = this.w[var8][1] - var10;
               if ((var11 <= -36 || var11 >= 12) && (var12 <= -36 || var12 >= 12)) {
                  var5.setColor(11591920);
                  var5.fillRect(var3, var4, 12, 12);
               } else {
                  this.J.setColor(11591920);
                  this.J.fillRect(0, 0, 12, 12);
                  this.J.drawImage(this.L, var11, var12, 20);
                  var5.drawImage(this.I, var3, var4, 20);
               }
            }
         case 11:
         case 12:
         default:
            break;
         case 13:
         case 14:
         case 15:
         case 16:
         case 17:
         case 18:
         case 19:
         case 20:
         case 21:
         case 22:
         case 23:
         case 24:
         case 25:
         case 26:
         case 27:
         case 28:
            var5.fillRect(var3, var4, 12, 12);
            var5.drawImage(this.Q[com.nokia.mid.appl.boun.d.a[var6 - 13]], var3, var4, 20);
            var5.drawImage(this.Q[com.nokia.mid.appl.boun.d.b[var6 - 13]], var3, var4, 20);
            break;
         case 29:
            var5.drawImage(this.Q[45], var3, var4, 20);
            break;
         case 30:
            if (var7) {
               var5.drawImage(this.Q[61], var3, var4, 20);
            } else {
               var5.drawImage(this.Q[57], var3, var4, 20);
            }
            break;
         case 31:
            if (var7) {
               var5.drawImage(this.Q[60], var3, var4, 20);
            } else {
               var5.drawImage(this.Q[56], var3, var4, 20);
            }
            break;
         case 32:
            if (var7) {
               var5.drawImage(this.Q[59], var3, var4, 20);
            } else {
               var5.drawImage(this.Q[55], var3, var4, 20);
            }
            break;
         case 33:
            if (var7) {
               var5.drawImage(this.Q[62], var3, var4, 20);
            } else {
               var5.drawImage(this.Q[58], var3, var4, 20);
            }
            break;
         case 34:
            var5.fillRect(var3, var4, 12, 12);
            var5.drawImage(this.Q[65], var3, var4, 20);
            break;
         case 35:
            var5.fillRect(var3, var4, 12, 12);
            var5.drawImage(this.Q[64], var3, var4, 20);
            break;
         case 36:
            var5.fillRect(var3, var4, 12, 12);
            var5.drawImage(this.Q[63], var3, var4, 20);
            break;
         case 37:
            var5.fillRect(var3, var4, 12, 12);
            var5.drawImage(this.Q[66], var3, var4, 20);
            break;
         case 38:
            var5.drawImage(this.Q[53], var3, var4, 20);
            break;
         case 39:
            var5.fillRect(var3, var4, 12, 12);
            var5.drawImage(this.Q[50], var3, var4, 20);
            break;
         case 40:
            var5.fillRect(var3, var4, 12, 12);
            var5.drawImage(a(this.Q[50], 5), var3, var4, 20);
            break;
         case 41:
            var5.fillRect(var3, var4, 12, 12);
            var5.drawImage(a(this.Q[50], 4), var3, var4, 20);
            break;
         case 42:
            var5.fillRect(var3, var4, 12, 12);
            var5.drawImage(a(this.Q[50], 3), var3, var4, 20);
            break;
         case 43:
            var5.fillRect(var3, var4, 12, 12);
            var5.drawImage(this.Q[51], var3, var4, 20);
            break;
         case 44:
            var5.fillRect(var3, var4, 12, 12);
            var5.drawImage(a(this.Q[51], 5), var3, var4, 20);
            break;
         case 45:
            var5.fillRect(var3, var4, 12, 12);
            var5.drawImage(a(this.Q[51], 4), var3, var4, 20);
            break;
         case 46:
            var5.fillRect(var3, var4, 12, 12);
            var5.drawImage(a(this.Q[51], 3), var3, var4, 20);
            break;
         case 47:
            var5.drawImage(this.Q[52], var3, var4, 20);
            break;
         case 48:
            var5.drawImage(a(this.Q[52], 5), var3, var4, 20);
            break;
         case 49:
            var5.drawImage(a(this.Q[52], 4), var3, var4, 20);
            break;
         case 50:
            var5.drawImage(a(this.Q[52], 3), var3, var4, 20);
            break;
         case 51:
            var5.drawImage(this.Q[54], var3, var4, 20);
            break;
         case 52:
            var5.drawImage(a(this.Q[54], 5), var3, var4, 20);
            break;
         case 53:
            var5.drawImage(a(this.Q[54], 4), var3, var4, 20);
            break;
         case 54:
            var5.drawImage(a(this.Q[54], 3), var3, var4, 20);
         }

      } else {
         var5.drawImage(this.Q[0], var3, var4, 20);
      }
   }

   public void a(Graphics var1, int var2, int var3, int var4, int var5) {
      int var6 = (var2 - var4) / 12;
      int var7 = (var3 - var4) / 12;
      int var8 = (var2 + var4 - 1) / 12 + 1;
      int var9 = (var3 + var4 - 1) / 12 + 1;
      if (var6 < 0) {
         var6 = 0;
      }

      if (var7 < 0) {
         var7 = 0;
      }

      if (var8 > this.c) {
         var8 = this.c;
      }

      if (var9 > this.ai) {
         var9 = this.ai;
      }

      for(int var10 = var6; var10 < var8; ++var10) {
         for(int var11 = var7; var11 < var9; ++var11) {
            int var12 = this.C[var11][var10] & -65;
            if (var12 >= 13 && var12 <= 28) {
               int var13 = (var10 - this.l) * 12 + var5;
               int var14 = (var11 - this.k) * 12;
               var1.drawImage(this.Q[com.nokia.mid.appl.boun.d.b[var12 - 13]], var13, var14, 20);
            }
         }
      }

   }

   public void f() {
      for(int var1 = 0; var1 < 13; ++var1) {
         for(int var2 = 0; var2 < 8; ++var2) {
            this.a(this.l + var1, this.k + var2, var1 * 12, var2 * 12);
         }
      }

   }

   public void i() {
      int var1 = this.l;
      int var2 = this.k;

      for(int var3 = 0; var3 < 13; ++var3) {
         if (var3 * 12 >= this.Z && var1 >= this.l) {
            var1 = this.G - 13;
         }

         for(int var4 = 0; var4 < 8; ++var4) {
            if ((this.C[var2][var1] & 128) != 0) {
               this.a(var1, var2, var3 * 12, var4 * 12);
            }

            ++var2;
         }

         var2 = this.k;
         ++var1;
      }

   }

   public void c(int var1) {
      int var2 = this.G - 13;
      int var3 = this.G;
      int var4 = var1 - 64;
      if (var4 < 0) {
         var4 = 0;
      } else if (var4 > (this.c + 1) * 12 - 156) {
         var4 = (this.c + 1) * 12 - 156;
      }

      int var5;
      int var6;
      while(var4 / 12 < var2) {
         this.Z -= 12;
         var5 = this.Z;
         --this.G;
         --var3;
         --var2;
         if (this.Z <= 0) {
            this.Z = 156;
            this.l -= 13;
         }

         for(var6 = 0; var6 < 8; ++var6) {
            this.a(this.G - 13, this.k + var6, var5, var6 * 12);
         }
      }

      while((var4 + 128) / 12 >= var3) {
         if (this.Z >= 156) {
            this.Z = 0;
            this.l += 13;
         }

         var5 = this.Z;
         this.Z += 12;
         ++this.G;
         ++var3;
         ++var2;

         for(var6 = 0; var6 < 8; ++var6) {
            this.a(this.l + var5 / 12, this.k + var6, var5, var6 * 12);
         }
      }

      this.v = this.l * 12 - var4;
   }

   public int m() {
      return this.l * 12 - this.v;
   }

   public int g() {
      return this.l * 12 - this.v + 128;
   }

   public Image a(Image var1) {
      Image var2 = DirectUtils.createImage(16, 16, 0);
      if (var2 == null) {
         var2 = Image.createImage(16, 16);
      }

      Graphics var3 = var2.getGraphics();
      DirectGraphics var4 = DirectUtils.getDirectGraphics(var3);
      var3.drawImage(var1, -4, -4, 20);
      var4.drawImage(var1, 8, -4, 20, 8192);
      var4.drawImage(var1, -4, 8, 20, 16384);
      var4.drawImage(var1, 8, 8, 20, 180);
      return var2;
   }

   public Image b(Image var1) {
      Image var2 = Image.createImage(24, 48);
      Graphics var3 = var2.getGraphics();
      var3.setColor(11591920);
      var3.fillRect(0, 0, 24, 48);
      var3.setColor(16555422);
      var3.fillRect(4, 0, 16, 48);
      var3.setColor(14891583);
      var3.fillRect(6, 0, 10, 48);
      var3.setColor(12747918);
      var3.fillRect(10, 0, 4, 48);
      var3.drawImage(var1, 0, 0, 20);
      var3.drawImage(a(var1, 0), 12, 0, 20);
      var3.drawImage(a(var1, 1), 0, 12, 20);
      var3.drawImage(a(var1, 2), 12, 12, 20);
      return var2;
   }

   public void c() {
      Image var1 = a("/icons/objects_nm.png");
      this.Q = new Image[67];
      this.Q[0] = a(var1, 1, 0);
      this.Q[1] = a(var1, 1, 2);
      this.Q[2] = a(var1, 0, 3, -5185296);
      this.Q[3] = a(this.Q[2], 1);
      this.Q[4] = a(this.Q[2], 3);
      this.Q[5] = a(this.Q[2], 5);
      this.Q[6] = a(var1, 0, 3, -15703888);
      this.Q[7] = a(this.Q[6], 1);
      this.Q[8] = a(this.Q[6], 3);
      this.Q[9] = a(this.Q[6], 5);
      this.Q[10] = a(var1, 0, 4);
      this.Q[11] = a(var1, 3, 4);
      this.Q[12] = this.b(a(var1, 2, 3));
      this.Q[14] = a(var1, 0, 5);
      this.Q[13] = a(this.Q[14], 1);
      this.Q[15] = a(this.Q[13], 0);
      this.Q[16] = a(this.Q[14], 0);
      this.Q[18] = a(var1, 1, 5);
      this.Q[17] = a(this.Q[18], 1);
      this.Q[19] = a(this.Q[17], 0);
      this.Q[20] = a(this.Q[18], 0);
      this.Q[22] = a(var1, 2, 5);
      this.Q[21] = a(this.Q[22], 1);
      this.Q[23] = a(this.Q[21], 0);
      this.Q[24] = a(this.Q[22], 0);
      this.Q[26] = a(var1, 3, 5);
      this.Q[25] = a(this.Q[26], 1);
      this.Q[27] = a(this.Q[25], 0);
      this.Q[28] = a(this.Q[26], 0);
      this.Q[29] = a(this.Q[14], 5);
      this.Q[30] = a(this.Q[29], 1);
      this.Q[31] = a(this.Q[29], 0);
      this.Q[32] = a(this.Q[30], 0);
      this.Q[33] = a(this.Q[18], 5);
      this.Q[34] = a(this.Q[33], 1);
      this.Q[35] = a(this.Q[33], 0);
      this.Q[36] = a(this.Q[34], 0);
      this.Q[37] = a(this.Q[22], 5);
      this.Q[38] = a(this.Q[37], 1);
      this.Q[39] = a(this.Q[37], 0);
      this.Q[40] = a(this.Q[38], 0);
      this.Q[41] = a(this.Q[26], 5);
      this.Q[42] = a(this.Q[41], 1);
      this.Q[43] = a(this.Q[41], 0);
      this.Q[44] = a(this.Q[42], 0);
      this.Q[45] = a(var1, 3, 3);
      this.Q[46] = a(var1, 1, 3);
      this.Q[47] = a(var1, 2, 0);
      this.Q[48] = a(var1, 0, 1);
      this.Q[49] = this.a(a(var1, 3, 0));
      this.Q[50] = a(var1, 3, 1);
      this.Q[51] = a(var1, 2, 4);
      this.Q[52] = a(var1, 3, 2);
      this.Q[53] = a(var1, 1, 1);
      this.Q[54] = a(var1, 2, 2);
      this.Q[55] = a(var1, 0, 0, -5185296);
      this.Q[56] = a(this.Q[55], 3);
      this.Q[57] = a(this.Q[55], 4);
      this.Q[58] = a(this.Q[55], 5);
      this.Q[59] = a(var1, 0, 0, -15703888);
      this.Q[60] = a(this.Q[59], 3);
      this.Q[61] = a(this.Q[59], 4);
      this.Q[62] = a(this.Q[59], 5);
      this.Q[63] = a(var1, 0, 2);
      this.Q[64] = a(this.Q[63], 3);
      this.Q[65] = a(this.Q[63], 4);
      this.Q[66] = a(this.Q[63], 5);
      this.A = a(var1, 2, 1);
      this.D = a(var1, 1, 4);
   }

   public void a(f var1) {
      var1.A = this.Q[47];
      var1.k = this.Q[48];
      var1.B = this.Q[49];
   }

   public static Image a(Image var0, int var1, int var2) {
      return a(var0, var1, var2, 0);
   }

   public static Image a(Image var0, int var1, int var2, int var3) {
      Image var4 = DirectUtils.createImage(12, 12, var3);
      Graphics var5;
      if (var4 == null) {
         var4 = Image.createImage(12, 12);
         var5 = var4.getGraphics();
         var5.setColor(var3);
         var5.fillRect(0, 0, 12, 12);
      }

      var5 = var4.getGraphics();
      var5.drawImage(var0, -var1 * 12, -var2 * 12, 20);
      return var4;
   }

   public static Image a(String var0) {
      Image var1 = null;

      try {
         var1 = Image.createImage(var0);
      } catch (IOException var3) {
      }

      return var1;
   }

   public void a(int var1, int var2, Image var3) {
      this.al = var1;
      this.u = var2;
      this.o = var3;
      this.aa = Image.createImage(24, 24);
      this.b = 0;
      this.p();
      this.M = false;
   }

   public void p() {
      Graphics var1 = this.aa.getGraphics();
      var1.drawImage(this.o, 0, 0 - this.b, 20);
   }

   public void h() {
      this.b += 4;
      if (this.b >= 24) {
         this.b = 24;
         this.M = true;
      }

      this.p();
   }

   public abstract void a();

   public synchronized void d() {
      if (this.ab == null) {
         this.ab = new g(this, this);
      }
   }

   public synchronized void j() {
      if (this.ab != null) {
         this.ab.a();
         this.ab = null;
      }
   }

   protected void n() {
      this.a();
   }
}
