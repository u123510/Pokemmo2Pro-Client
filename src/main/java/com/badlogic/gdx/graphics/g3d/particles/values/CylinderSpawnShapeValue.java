package com.badlogic.gdx.graphics.g3d.particles.values;

import f.C8;
import f.LW;
import f.O00;
import f.hk0_0;

public final class CylinderSpawnShapeValue extends PrimitiveSpawnShapeValue {
   public CylinderSpawnShapeValue(CylinderSpawnShapeValue var1) {
      super(var1);
      ((PrimitiveSpawnShapeValue)this).load(var1);
   }

   public CylinderSpawnShapeValue() {
   }

   public void spawnAux(C8 var1, float var2) {
      CylinderSpawnShapeValue var10000 = this;
      float var3 = super.spawnWidth;
      float var4 = super.spawnWidthDiff;
      var3 = hk0_0.gb0(super.spawnWidthValue, var2, var4, var3);
      var4 = super.spawnHeight;
      float var5 = super.spawnHeightDiff;
      float var23;
      float var10001 = var23 = hk0_0.gb0(super.spawnHeightValue, var2, var5, var4);
      CylinderSpawnShapeValue var10002 = this;
      CylinderSpawnShapeValue var10003 = this;
      float var8 = super.spawnDepth;
      var5 = var10003.spawnDepthDiff;
      var8 = hk0_0.gb0(var10002.spawnDepthValue, var2, var5, var8);
      O00 var13;
      var4 = (var13 = LW.Yu).nextFloat() * var23 - var10001 / 2.0F;
      if (var10000.edges) {
         float var27 = var8;
         var8 = var3 / 2.0F;
         var3 = var27 / 2.0F;
      } else {
         var3 = var13.nextFloat() * var3 / 2.0F;
         var8 = var13.nextFloat() * var8 / 2.0F;
         float var28 = var3;
         var3 = var8;
         var8 = var28;
      }

      var5 = 0.0F;
      boolean var6;
      if (var8 == 0.0F) {
         var6 = true;
      } else {
         var6 = false;
      }

      boolean var7;
      if (var3 == 0.0F) {
         var7 = true;
      } else {
         var7 = false;
      }

      if (!var6 && !var7) {
         O00 var29 = var13;
         float var18 = 360.0F;
         var5 = var29.nextFloat() * var18;
      } else if (var6) {
         if ((int)var13.nextLong((long)2) == 0) {
            float var14 = -90.0F;
            var5 = var14;
         } else {
            float var15 = 90.0F;
            var5 = var15;
         }
      } else if (var7) {
         if ((int)var13.nextLong((long)2) == 0) {
            float var16 = 0.0F;
            var5 = var16;
         } else {
            float var17 = 180.0F;
            var5 = var17;
         }
      }

      float var10004 = LW.gc0(var5) * var8;
      var8 = LW.Om(var5) * var3;
      var1.x = var10004;
      var1.y = var4;
      var1.z = var8;
   }

   public SpawnShapeValue copy() {
      return new CylinderSpawnShapeValue(this);
   }
}
