package com.nokia.mid.appl.boun;

import com.nokia.mid.ui.DeviceControl;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.midlet.MIDlet;

public class Bounce extends MIDlet {
   private a a;

   public Bounce() {
      if (this.a == null) {
         this.a = new a(this);
      }

   }

   protected void startApp() {
      DeviceControl.setLights(0, 100);
   }

   protected void pauseApp() {
   }

   public void destroyApp(boolean var1) {
      if (this.a != null && this.a.v != null) {
         this.a.a(3);
         this.a.v.j();
      }

      Display.getDisplay(this).setCurrent((Displayable)null);
      this.a = null;
   }
}
