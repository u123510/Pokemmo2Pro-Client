package cn.pokemmo.ui.window;

import f.*;
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.glfw.GLFW;

/**
 * 现代化重构类 - 原始类: f.Su0
 */
public class GlfwGraphicsContext implements fy0_0 {

   public long hc0;
   public final OR Ez;
   public final ee_2 Sn0;
   public boolean H8 = false;
   public final wl0_0 ge;
   public k3_0 gw;
   public DB0 ND;
   public final DZ IG0;
   public final es_1 Qb = new es_1();
   public final es_1 QX = new es_1();
   public final IntBuffer BF;
   public final IntBuffer gB;
   public boolean nJ = false;
   public boolean fx0 = false;
   public H20 KG;
   public L80 Pe;
   public Mx Kr0;
   public qd0_1 vF;
   public id0_0 yL0;
   public ag0_0 vh0;

   public GlfwGraphicsContext(OR var1, DZ var2, ee_2 var3) {
      this.Ez = var1;
      this.ge = var2.b1;
      this.IG0 = var2;
      this.Sn0 = var3;
      this.BF = BufferUtils.createIntBuffer(1);
      this.gB = BufferUtils.createIntBuffer(1);
   }

   public final void Df(Runnable var1) {
      synchronized (this.Qb) {
         this.Qb.Ue0(var1);
      }
   }

   public final int Py() {
      GLFW.glfwGetWindowPos(this.hc0, this.BF, this.gB);
      return this.BF.get(0);
   }

   public final int hv() {
      GLFW.glfwGetWindowPos(this.hc0, this.BF, this.gB);
      return this.gB.get(0);
   }

   public final long Z6() {
      return this.hc0;
   }

   public final boolean pl0() {
      if (!this.H8) {
         this.Ez.YK0();
         this.Ez.Gg(this.gw.Kr0(), this.gw.sD0());
         this.H8 = true;
      }
      synchronized (this.Qb) {
         this.QX.G6(this.Qb.rZ, 0, this.Qb.KB);
         this.Qb.clear();
      }
      I2 var1 = this.QX.ZD();
      while (var1.hasNext()) {
         ((Runnable)var1.next()).run();
      }
      boolean var2 = this.QX.KB > 0 || this.gw.pt0;
      this.QX.clear();
      if (!this.nJ) {
         this.ND.ki.bl(this.ND.L50);
      }
      synchronized (this) {
         var2 |= this.fx0 && !this.nJ;
         this.fx0 = false;
      }
      if (var2) {
         k3_0 var3 = this.gw;
         long var4 = System.nanoTime();
         if (var3.hp == -1L) {
            var3.hp = var4;
         }
         var3.uL = (float)(var4 - var3.hp) / 1.0E9F;
         var3.hp = var4;
         if (var4 - var3.Z60 >= 1000000000L) {
            var3.fs0 = var3.CJ;
            var3.CJ = 0;
            var3.Z60 = var4;
         }
         var3.CJ++;
         this.Ez.Ux0();
         GLFW.glfwSwapBuffers(this.hc0);
      }
      if (!this.nJ) {
         DB0 var3 = this.ND;
         if (var3.S5) {
            var3.S5 = false;
            for (int var4 = 0; var4 < var3.tJ0.length; var4++) {
               var3.tJ0[var4] = false;
            }
         }
         if (var3.com1) {
            var3.com1 = false;
            for (int var4 = 0; var4 < var3.Ae.length; var4++) {
               var3.Ae[var4] = false;
            }
         }
      }
      return var2;
   }

   public final void G20() {
      synchronized (this) {
         this.fx0 = true;
      }
   }

   public final DZ Zp() {
      return this.IG0;
   }

   public final void Xv() {
      k3_0 var1 = this.gw;
      lg_0.S4 = var1;
      lb0_1 var2 = var1.MH;
      if (var2 == null) {
         var2 = var1.lv;
      }
      if (var2 == null) {
         var2 = var1.COm2;
      }
      lg_0.MA = var2;
      sY var3 = var2;
      if (var3 == null) {
         var3 = var1.Z7;
      }
      lg_0.Sf0 = var3;
      lg_0.OH0 = var3;
      lg_0.lW = this.ND;
      GLFW.glfwMakeContextCurrent(this.hc0);
   }

   @Override
   public final void dispose() {
      this.Ez.wy0();
      this.Ez.dispose();
      for (int var1 = hz0.HY.KB - 1; var1 >= 0; var1--) {
         es_1 var2 = hz0.HY;
         if (((hz0)hz0.HY.get(var1)).yT.equals(this)) {
            ((hz0)var2.Tx0(var1)).dispose();
         }
      }
      this.gw.UB.free();
      this.ND.dispose();
      GLFW.glfwSetWindowFocusCallback(this.hc0, null);
      GLFW.glfwSetWindowIconifyCallback(this.hc0, null);
      GLFW.glfwSetWindowCloseCallback(this.hc0, null);
      GLFW.glfwSetDropCallback(this.hc0, null);
      GLFW.glfwDestroyWindow(this.hc0);
      this.KG.free();
      this.Pe.free();
      this.Kr0.free();
      this.vF.free();
      this.yL0.free();
      this.vh0.free();
   }

   @Override
   public final int hashCode() {
      return 31 + (int)(this.hc0 ^ this.hc0 >>> 32);
   }

   @Override
   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      }
      if (var1 == null || GlfwGraphicsContext.class != var1.getClass()) {
         return false;
      }
      return this.hc0 == ((Su0)var1).hc0;
   }
}
