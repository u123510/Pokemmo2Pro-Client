package cn.pokemmo.platform.desktop.glfw;

import f.*;


import org.lwjgl.glfw.GLFWCursorPosCallback;

public class GlfwCursorPosCallback extends GLFWCursorPosCallback {
   // $FF: synthetic field
   public final DB0 N80;

   public GlfwCursorPosCallback(DB0 var1) {
      this.N80 = var1;
   }

   public final void invoke(long var1, double var3, double var5) {
      DB0 var2 = this.N80;
      int var3i = (int)var3;
      int var5i = (int)var5;
      var2.bk0 = var3i;
      var2.zs = var5i;

      Su0 var6 = var2.wc0;
      if (var6.IG0.hE == F70.TK) {
         float var7 = (float)var6.gw.cJ / (float)var2.wc0.gw.Cl;
         float var8 = (float)var2.wc0.gw.eP / (float)var2.wc0.gw.DB;
         var2.bk0 = (int)((float)var2.bk0 * var7);
         var2.zs = (int)((float)var2.zs * var8);
      }

      var2.wc0.gw.rt0.G20();
      long var9 = System.nanoTime();
      if (var2.Ct > 0) {
         y5 var10 = var2.ki;
         int var11 = var2.bk0;
         int var12 = var2.zs;
         byte var13 = 0;
         synchronized(var10) {
            int var14 = var10.H30(5, 0);

            while (var14 >= 0) {
               if (var10.kr0.X8(var14 + 5) == 0) {
                  var10.kr0.MJ(var14, -1);
                  var10.kr0.MJ(var14 + 3, 3);
               }

               var14 = var10.H30(5, var14 + 6);
            }

            var10.kr0.ja0(5);
            var10.P20(var9);
            var10.kr0.ja0(var11);
            var10.kr0.ja0(var12);
            var10.kr0.ja0(var13);
         }
      } else {
         var2.ki.UK(var2.bk0, var2.zs, var9);
      }
   }
}
