package com.nokia.mid.appl.boun;

import java.util.Timer;
import java.util.TimerTask;

public class g extends TimerTask {
   b a;
   Timer c;
   private final b b;

   public g(b var1, b var2) {
      this.b = var1;
      this.a = var2;
      this.c = new Timer();
      this.c.schedule(this, 0L, 40L);
   }

   public void run() {
      this.a.n();
   }

   void a() {
      if (this.c != null) {
         this.cancel();
         this.c.cancel();
         this.c = null;
      }
   }
}
