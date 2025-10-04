package com.nokia.mid.appl.boun;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.List;
import javax.microedition.rms.RecordStore;

public class a implements CommandListener {
   public Bounce s;
   public Display m;
   public e v;
   public int K = 2;
   public int f;
   public int h;
   public boolean q;
   public int E;
   public byte J = 0;
   public byte C;
   public byte t;
   public byte B;
   public byte A;
   public int G;
   public int I;
   public int H;
   public int a;
   public int g;
   public int y;
   public int M;
   public int e;
   public int b;
   public int w;
   public int z;
   public int n;
   public int p;
   public int[][] u;
   public int r;
   public short[][] D;
   public short[][] l;
   public long o;
   private Command i;
   private Command d;
   private Command k;
   private Command L;
   private List c;
   private List F;
   private Form j;
   private int N;
   private String[] x = new String[4];

   public a(Bounce var1) {
      this.s = var1;
      this.h();
      this.v = new e(this, 1);
      this.v.d();
      this.m = Display.getDisplay(this.s);
      this.m.setCurrent(this.v);
      this.e();
   }

   public synchronized void e() {
      this.x[0] = com.nokia.mid.appl.boun.c.a(4);
      this.x[1] = com.nokia.mid.appl.boun.c.a(11);
      this.x[2] = com.nokia.mid.appl.boun.c.a(7);
      this.x[3] = com.nokia.mid.appl.boun.c.a(8);
   }

   public synchronized void f() {
      this.c = new List(com.nokia.mid.appl.boun.c.a(0), 3);
      if (this.d == null) {
         this.d = new Command(com.nokia.mid.appl.boun.c.a(2), 2, 1);
         this.k = new Command(com.nokia.mid.appl.boun.c.a(5), 7, 1);
      }

      if (this.K == 1 || this.J == 1 || this.J == 2) {
         this.c.append(this.x[0], (Image)null);
      }

      for(int var1 = 1; var1 < this.x.length; ++var1) {
         this.c.append(this.x[var1], (Image)null);
      }

      this.c.addCommand(this.k);
      this.c.setCommandListener(this);
      if (this.v.ap != -1) {
         this.v.ap = -1;
         this.v.t = null;
      }

      if (this.K != 1 && this.J != 1 && this.J != 2) {
         this.c.setSelectedIndex(this.N, true);
      } else {
         this.c.setSelectedIndex(0, true);
      }

      this.v.j();
      this.m.setCurrent(this.c);
   }

   public void g() {
      String[] var1 = new String[this.f];
      String[] var2 = new String[1];

      for(int var3 = 0; var3 < this.f; ++var3) {
         var2[0] = String.valueOf(var3 + 1);
         var1[var3] = com.nokia.mid.appl.boun.c.a(9, var2);
      }

      this.F = new List(com.nokia.mid.appl.boun.c.a(11), 3, var1, (Image[])null);
      this.F.addCommand(this.d);
      this.F.setCommandListener(this);
      this.m.setCurrent(this.F);
   }

   public void a(boolean var1, int var2) {
      if (var1) {
         this.q = false;
         this.v.a(var2, 0, 3);
      }

      this.v.d();
      this.v.aq.a();
      this.m.setCurrent(this.v);
      this.K = 1;
   }

   public void c() {
      this.j = new Form(com.nokia.mid.appl.boun.c.a(7));
      this.j.append(String.valueOf(this.h));
      this.j.addCommand(this.d);
      this.j.setCommandListener(this);
      this.m.setCurrent(this.j);
   }

   public void b() {
      this.j = new Form(com.nokia.mid.appl.boun.c.a(8));
      String[] var1 = new String[]{this.v.getKeyName(this.v.getKeyCode(2)), this.v.getKeyName(this.v.getKeyCode(5)), this.v.getKeyName(this.v.getKeyCode(1))};
      this.j.append(com.nokia.mid.appl.boun.c.a(1, var1));
      this.j.addCommand(this.d);
      this.j.setCommandListener(this);
      this.m.setCurrent(this.j);
      this.j = null;
   }

   public void a(boolean var1) {
      this.v.j();
      if (this.i == null) {
         this.i = new Command(com.nokia.mid.appl.boun.c.a(13), 4, 1);
      }

      this.j = new Form(com.nokia.mid.appl.boun.c.a(6));
      if (var1) {
         this.j.append(com.nokia.mid.appl.boun.c.a(3));
      } else {
         this.j.append(com.nokia.mid.appl.boun.c.a(6));
      }

      this.j.append("\n\n");
      if (this.q) {
         this.j.append(com.nokia.mid.appl.boun.c.a(12));
         this.j.append("\n\n");
      }

      this.j.append(String.valueOf(this.E));
      this.j.addCommand(this.i);
      this.j.setCommandListener(this);
      this.m.setCurrent(this.j);
      this.j = null;
   }

   public void d() {
      this.v.j();
      this.a(false, 0);
      this.K = 5;
      if (this.L == null) {
         this.L = new Command(com.nokia.mid.appl.boun.c.a(4), 4, 1);
      }

      this.j = new Form("");
      this.j.append(this.v.ak);
      this.j.append("\n\n");
      this.j.append("" + this.E + "\n");
      this.j.addCommand(this.L);
      this.j.setCommandListener(this);
      this.m.setCurrent(this.j);
      this.j = null;
   }

   public void commandAction(Command var1, Displayable var2) {
      if (var1 == List.SELECT_COMMAND) {
         if (var2 == this.F) {
            this.a(true, this.F.getSelectedIndex() + 1);
         } else {
            String var3 = this.c.getString(this.c.getSelectedIndex());
            this.N = this.c.getSelectedIndex();
            if (var3.equals(this.x[0])) {
               if (this.K == 1) {
                  this.a(false, this.v.ac);
               } else if (this.J != 0) {
                  this.m.setCurrent(this.v);
                  if (this.J == 1) {
                     this.v.a(this.y, this.M);
                  } else {
                     this.v.a(this.B, this.G, this.C);
                  }

                  this.u = null;
                  this.v.d();
                  this.K = 1;
               }
            } else if (var3.equals(this.x[1])) {
               if (this.K != 4) {
                  if (this.f > 1) {
                     this.g();
                  } else {
                     this.K = 4;
                     this.a(true, 1);
                  }
               }
            } else if (var3.equals(this.x[2])) {
               this.c();
            } else if (var3.equals(this.x[3])) {
               this.b();
            } else if (var3.equals("Read RMS")) {
               this.h();
            } else if (var3.equals("Write RMS")) {
               this.a(1);
               this.a(2);
               this.a(3);
            }
         }
      } else if (var1 != this.d && var1 != this.k && var1 != this.i) {
         if (var1 == this.L) {
            this.K = 1;
            this.m.setCurrent(this.v);
         }
      } else if (this.m.getCurrent() == this.c) {
         this.s.destroyApp(true);
         this.s.notifyDestroyed();
      } else {
         this.f();
      }

   }

   public void h() {
      byte[] var1 = new byte[1];
      byte[] var2 = new byte[4];
      byte[] var3 = new byte[255];
      Object var4 = null;

      try {
         RecordStore var5 = RecordStore.openRecordStore("bounceRMS", true);
         if (var5.getNumRecords() != 3) {
            var5.addRecord(var1, 0, var1.length);
            var5.addRecord(var2, 0, var2.length);
            var5.addRecord(var3, 0, var3.length);
         } else {
            var1 = var5.getRecord(1);
            var2 = var5.getRecord(2);
            var3 = var5.getRecord(3);
            ByteArrayInputStream var6 = new ByteArrayInputStream(var1);
            DataInputStream var7 = new DataInputStream(var6);
            this.f = var7.readByte();
            var6 = new ByteArrayInputStream(var2);
            var7 = new DataInputStream(var6);
            this.h = var7.readInt();
            var6 = new ByteArrayInputStream(var3);
            var7 = new DataInputStream(var6);
            this.o = var7.readLong();
            this.J = var7.readByte();
            this.C = var7.readByte();
            this.t = var7.readByte();
            this.B = var7.readByte();
            this.A = var7.readByte();
            this.G = var7.readInt();
            this.I = var7.readInt();
            this.H = var7.readInt();
            this.y = var7.readInt();
            this.M = var7.readInt();
            this.a = var7.readInt();
            this.g = var7.readInt();
            var7.readInt();
            var7.readInt();
            this.e = var7.readInt();
            this.b = var7.readInt();
            this.w = var7.readInt();
            this.z = var7.readInt();
            this.n = var7.readInt();
            this.p = var7.readByte();
            this.u = new int[this.p][3];

            for(int var8 = 0; var8 < this.p; ++var8) {
               this.u[var8][0] = var7.readShort();
               this.u[var8][1] = var7.readShort();
               this.u[var8][2] = var7.readByte();
            }

            this.r = var7.readByte();
            this.D = new short[this.r][2];
            this.l = new short[this.r][2];

            for(int var9 = 0; var9 < this.r; ++var9) {
               this.D[var9][0] = var7.readShort();
               this.D[var9][1] = var7.readShort();
               this.l[var9][0] = var7.readShort();
               this.l[var9][1] = var7.readShort();
            }

            if (var7.readLong() != -559038737L) {
               this.J = 0;
            }
         }

         var5.closeRecordStore();
      } catch (Exception var10) {
         this.J = 0;
      }

   }

   public void a(int var1) {
      ByteArrayOutputStream var2 = new ByteArrayOutputStream();
      DataOutputStream var3 = new DataOutputStream(var2);
      Object var4 = null;

      try {
         switch(var1) {
         case 1:
            var3.writeByte(this.f);
            break;
         case 2:
            var3.writeInt(this.h);
            break;
         case 3:
            if (this.v == null || this.v.aq == null) {
               return;
            }

            byte var5 = 0;
            if (this.K == 1) {
               var5 = 1;
            } else if (this.K == 5) {
               var5 = 2;
            }

            var3.writeLong(System.currentTimeMillis());
            var3.writeByte(var5);
            var3.writeByte(this.v.h);
            var3.writeByte(this.v.U);
            var3.writeByte(this.v.ac);
            var3.writeByte(this.v.aq.a);
            var3.writeInt(this.v.f);
            var3.writeInt(this.v.l);
            var3.writeInt(this.v.k);
            var3.writeInt(this.v.aq.s);
            var3.writeInt(this.v.aq.r);
            var3.writeInt(this.v.aq.l);
            var3.writeInt(this.v.aq.o);
            var3.writeInt(0);
            var3.writeInt(0);
            var3.writeInt(this.v.aq.d);
            var3.writeInt(this.v.aq.c);
            var3.writeInt(this.v.aq.h);
            var3.writeInt(this.v.aq.g);
            var3.writeInt(this.v.aq.y);
            int[][] var7 = new int[50][3];
            int var8 = 0;

            int var10;
            for(int var9 = 0; var9 < this.v.ai; ++var9) {
               for(var10 = 0; var10 < this.v.c; ++var10) {
                  byte var6 = (byte)(this.v.C[var9][var10] & 'ｿ' & -65);
                  if (var6 == 7 || var6 == 29 || var6 == 13 || var6 == 14 || var6 == 21 || var6 == 22 || var6 == 15 || var6 == 16 || var6 == 23 || var6 == 24) {
                     var7[var8][0] = var9;
                     var7[var8][1] = var10;
                     var7[var8][2] = var6;
                     ++var8;
                  }
               }
            }

            var3.writeByte(var8);

            for(var10 = 0; var10 < var8; ++var10) {
               var3.writeShort(var7[var10][0]);
               var3.writeShort(var7[var10][1]);
               var3.writeByte(var7[var10][2]);
            }

            Object var14 = null;
            var3.writeByte(this.v.B);

            for(int var11 = 0; var11 < this.v.B; ++var11) {
               var3.writeShort(this.v.w[var11][0]);
               var3.writeShort(this.v.w[var11][1]);
               var3.writeShort(this.v.ae[var11][0]);
               var3.writeShort(this.v.ae[var11][1]);
            }

            var3.writeLong(-559038737L);
         }

         RecordStore var12 = RecordStore.openRecordStore("bounceRMS", true);
         var12.setRecord(var1, var2.toByteArray(), 0, var2.size());
         var12.closeRecordStore();
      } catch (Exception var13) {
      }

   }

   public void a() {
      if (this.v.ac > this.f) {
         this.f = Math.min(this.v.ac, 11);
         this.a(1);
      }

      if (this.v.f > this.h) {
         this.h = this.v.f;
         this.q = true;
         this.a(2);
      }

      this.E = this.v.f;
   }

   public void b(boolean var1) {
      this.K = 3;
      this.J = 0;
      this.v.H = false;
      this.a(var1);
   }
}
