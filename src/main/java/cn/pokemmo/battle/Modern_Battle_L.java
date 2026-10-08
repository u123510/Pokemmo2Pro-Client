package cn.pokemmo.battle;

import f.*;

/**
 * 现代化重构类 - 原始混淆类: f.L
 */
public class Modern_Battle_L extends kj0_0 {

   public Modern_Battle_L() {
      super(new String[]{"Hue", "Saturation", "Lightness"});
   }

   public static float my0(float var0, float var1, float var2) {
      if (var2 < 1.0F) {
         return fe_2.Ga0(var0, var1, var2, var1);
      } else if (var2 < 3.0F) {
         return var0;
      } else if (var2 < 4.0F) {
         var0 -= var1;
         return fe_2.Ga0(4.0F, var2, var0, var1);
      } else {
         return var1;
      }
   }

   @Override
   public final float o6(int var1) {
      return var1 == 0 ? 360.0F : 100.0F;
   }

   @Override
   public final int a80(float[] var1) {
      float var5 = var1[0] / 360.0F;
      float var2;
      float var10000 = var2 = var1[1] / 100.0F;
      float var9 = var1[2] / 100.0F;
      float var8;
      if (var10000 > 0.0F) {
         float var6;
         if (var5 < 1.0F) {
            var6 = var5 * 6.0F;
         } else {
            var6 = 0.0F;
         }

         float var3;
         if (var9 > 0.5F) {
            var3 = 1.0F - var9;
         } else {
            var3 = var9;
         }

         float var10 = var2 * var3 + var9;
         var2 = var9 * 2.0F - var10;
         if (var6 < 4.0F) {
            var3 = var6 + 2.0F;
         } else {
            var3 = var6 - 4.0F;
         }

         var3 = my0(var10, var2, var3);
         float var4 = my0(var10, var2, var6);
         float var7;
         if (var6 < 2.0F) {
            var7 = var6 + 4.0F;
         } else {
            var7 = var6 - 2.0F;
         }

         float var11 = my0(var10, var2, var7);
         var2 = var11;
         var8 = var4;
         var9 = var3;
      } else {
         var2 = var9;
         var8 = var9;
      }

      return Math.max(0, Math.min(255, (int)(var9 * 255.0F))) << 16
         | Math.max(0, Math.min(255, (int)(var8 * 255.0F))) << 8
         | Math.max(0, Math.min(255, (int)(var2 * 255.0F)));
   }
}

