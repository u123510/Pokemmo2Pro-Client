package cn.pokemmo.graphics;

import f.*;

/**
 * OpenGL 图形渲染上下文与着色器状态管理器 (Graphics State Manager)
 * 适配不同渲染设备 (pt0_0, Aa, lb0_1, rl0_2) 的底层绘制状态与纹理管线。
 *
 * 原混淆类: f.Kr0
 */
public class GraphicsStateManager {
    public Kr0 asBridge() {
        return (Kr0) (Object) this;
    }

    public final ik0_0 Ry;
   public final ok0_0 ax0;
   public final SK zX;
   public boolean t40 = false;

   public GraphicsStateManager(ik0_0 var1) {
      this.Ry = var1;
      pt0_0 var2;
      k3_0 var5;
      pt0_0 var10000 = var2 = (var5 = (k3_0)var1).hn();
      Aa var3 = var5.V8();
      lb0_1 var4 = var5.rO();
      if (var10000 != null) {
         x6_0 var6;
         var6 = new x6_0(asBridge(), var2);
         this.ax0 = var6;
      } else if (var3 != null) {
         yw0_0 var7;
         var7 = new yw0_0(asBridge(), var3);
         this.ax0 = var7;
      } else if (var4 != null) {
         hs0_0 var8;
         var8 = new hs0_0(asBridge(), var4);
         this.ax0 = var8;
      } else {
         rl0_2 var9;
         var9 = new rl0_2(asBridge(), var5.Tb());
         this.ax0 = var9;
      }

      this.zX = mk0_2.fL0;
   }

   public final void yD0() {
      if (!this.t40) {
         ok0_0 var1 = this.ax0;
         if (this.ax0 instanceof pt0_0) {
            ik0_0 var2 = this.Ry;
            ((k3_0)var2).MH = (pt0_0)var1;
         }

         if (var1 instanceof Aa) {
            ik0_0 var3 = this.Ry;
            ((k3_0)var3).lv = (Aa)var1;
         }

         if (var1 instanceof lb0_1) {
            ik0_0 var4 = this.Ry;
            ((k3_0)var4).COm2 = (lb0_1)var1;
         }

         k3_0 var10003 = (k3_0)this.Ry;
         ((k3_0)this.Ry).Z7 = var1;
         lg_0.MA = var10003.COm2;
         lg_0.Sf0 = var1;
         lg_0.OH0 = var1;
         this.t40 = true;
      }
   }

   public final void Ld() {
      ok0_0 var10000 = this.ax0;
      ok0_0 var10001 = this.ax0;
      ok0_0 var10002 = this.ax0;
      ok0_0 var10003 = this.ax0;
      this.ax0.lf = 0;
      var10003.tA = 0;
      var10002.B1 = 0;
      var10001.BJ0 = 0;
      var10000.bH.bL();
   }
}
