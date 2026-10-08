package cn.pokemmo.graphics.render;

import f.*;

import com.badlogic.gdx.math.Matrix4;

public class FirstPersonRenderableSorter extends DefaultRenderableSorter {
   public Tv0 Nq;
   public final C8 Wt0;
   public final C8 oP;

   public FirstPersonRenderableSorter() {
      C8 var1;
      var1 = new C8();
      this.Wt0 = var1;
      C8 var2;
      var2 = new C8();
      this.oP = var2;
   }

   @Override
   public final void On0(Tv0 var1, es_1 var2) {
      this.Nq = var1;
      var2.sort(this);
   }

   @Override
   public final int Yr0(W00 var1, W00 var2) {
      long var3 = sh_0.vF0;
      boolean var5;
      if (var1.ly.tM(sh_0.vF0) && ((sh_0)var1.ly.sg(var3)).yg) {
         var5 = true;
      } else {
         var5 = false;
      }

      boolean var16;
      if (var2.ly.tM(var3) && ((sh_0)var2.ly.sg(var3)).yg) {
         var16 = true;
      } else {
         var16 = false;
      }

      if (var5 != var16) {
         return var5 ? 1 : -1;
      }

      Matrix4 var9 = var1.eo0;
      C8 var17 = var1.VE0.T4;
      C8 var4 = this.Wt0;
      if (var17.eG()) {
         var9.V1(var4);
      } else if (!var9.Mq0()) {
         C8 var10000 = var9.V1(var4);
         float var10 = var17.x;
         float var18 = var17.y;
         float var23 = var17.z;
         var10000.na(var10, var18, var23);
      } else {
         var4.getClass();
         float var19 = var17.x;
         float var24 = var17.y;
         float var6 = var17.z;
         var4.x = var19;
         var4.y = var24;
         var4.z = var6;
         var4.cu(var9);
      }

      Matrix4 var11 = var2.eo0;
      C8 var13 = var2.VE0.T4;
      C8 var20 = this.oP;
      if (var13.eG()) {
         var11.V1(var20);
      } else if (!var11.Mq0()) {
         C8 var27 = var11.V1(var20);
         float var12 = var13.x;
         float var14 = var13.y;
         float var21 = var13.z;
         var27.na(var12, var14, var21);
      } else {
         var20.getClass();
         float var15 = var13.x;
         float var22 = var13.y;
         float var25 = var13.z;
         var20.x = var15;
         var20.y = var22;
         var20.z = var25;
         var20.cu(var11);
      }

      float var7;
      int var8;
      if ((var7 = (int)(this.Nq.v40.Lk(this.Wt0) * 1000.0F) - (int)(this.Nq.v40.Lk(this.oP) * 1000.0F)) < 0.0F) {
         var8 = -1;
      } else if (var7 > 0.0F) {
         var8 = 1;
      } else {
         var8 = 0;
      }

      if (var5) {
         var8 = -var8;
      }

      return var8;
   }
}
