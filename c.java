package com.nokia.mid.appl.boun;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

public class c {
   private static c a = null;
   private static DataInputStream c = null;
   public static final String b = System.getProperty("microedition.locale");

   private c() {
   }

   private static String a(String var0, String var1, String var2) {
      int var3 = var0.indexOf(var1);
      return var3 >= 0 ? var0.substring(0, var3) + var2 + var0.substring(var3 + var1.length()) : var0;
   }

   public static synchronized String a(int var0) {
      return a(var0, (String[])null);
   }

   public static synchronized String a(int var0, String[] var1) {
      try {
         if (a == null) {
            a = new c();
         }

         if (c == null) {
            InputStream var2 = a.getClass().getResourceAsStream("/lang." + b);
            if (var2 == null) {
               var2 = a.getClass().getResourceAsStream("/lang.xx");
            }

            if (var2 == null) {
               return "NoLang";
            }

            c = new DataInputStream(var2);
            c.mark(512);
         }

         c.skipBytes(var0 * 2);
         short var7 = c.readShort();
         c.skipBytes(var7 - var0 * 2 - 2);
         String var3 = c.readUTF();

         try {
            c.reset();
         } catch (IOException var5) {
            c.close();
            c = null;
         }

         if (var1 != null) {
            if (var1.length == 1) {
               var3 = a(var3, "%U", var1[0]);
            } else {
               for(int var4 = 0; var4 < var1.length; ++var4) {
                  var3 = a(var3, "%" + var4 + "U", var1[var4]);
               }
            }
         }

         return var3;
      } catch (IOException var6) {
         return "Err";
      }
   }
}
