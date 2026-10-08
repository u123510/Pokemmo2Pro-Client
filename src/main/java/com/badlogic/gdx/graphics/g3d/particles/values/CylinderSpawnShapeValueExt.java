package com.badlogic.gdx.graphics.g3d.particles.values;

import com.badlogic.gdx.graphics.g3d.particles.SeedRandom;
import f.C8;
import f.LW;
import f.O00;
import f.TG0;
import java.util.Random;

public final class CylinderSpawnShapeValueExt extends PrimitiveSpawnShapeValueExt {
   private Random random;

   public CylinderSpawnShapeValueExt(CylinderSpawnShapeValueExt var1) {
      super(var1);
      ((PrimitiveSpawnShapeValueExt)this).load(var1);
      this.random = new O00();
      if (super.seed.isActive()) {
         this.random.setSeed(super.seed.getValue());
      }

   }

   public CylinderSpawnShapeValueExt() {
      super();
      this.random = new O00();
   }

   public void reSeed() {
      super.reSeed();
      if (super.seed.isActive()) {
         this.random.setSeed(super.seed.getValue());
      }

   }

   public void spawnAux(C8 var1, float var2) {
      float var3 = super.spawnWidth;
      float var4 = super.spawnWidthDiff;
      var3 = TG0.u9(super.spawnWidthValue, var2, var4, var3);
      var4 = super.spawnHeight;
      float var5 = super.spawnHeightDiff;
      float var20;
      float var10002 = var20 = TG0.u9(super.spawnHeightValue, var2, var5, var4);
      var5 = super.spawnDepth;
      float var6 = super.spawnDepthDiff;
      var2 = TG0.u9(super.spawnDepthValue, var2, var6, var5);
      var5 = var10002 / 2.0F;
      var4 = SeedRandom.random(this.random, var20) - var5;
      if (super.edges) {
         float var10000 = var2;
         var2 = var3 / 2.0F;
         var3 = var10000 / 2.0F;
      } else {
         var3 = SeedRandom.random(this.random, var3) / 2.0F;
         var2 = SeedRandom.random(this.random, var2) / 2.0F;
         float var26 = var3;
         var3 = var2;
         var2 = var26;
      }

      var5 = 0.0F;
      boolean var25;
      if (var2 == 0.0F) {
         var25 = true;
      } else {
         var25 = false;
      }

      boolean var7;
      if (var3 == 0.0F) {
         var7 = true;
      } else {
         var7 = false;
      }

      if (!var25 && !var7) {
         var5 = SeedRandom.random(this.random, 360.0F);
      } else if (var25) {
         if (SeedRandom.random(this.random, 1) == 0) {
            float var8 = -90.0F;
            var5 = var8;
         } else {
            float var9 = 90.0F;
            var5 = var9;
         }
      } else if (var7) {
         if (SeedRandom.random(this.random, 1) == 0) {
            float var10 = 0.0F;
            var5 = var10;
         } else {
            float var11 = 180.0F;
            var5 = var11;
         }
      }

      float var10004 = LW.gc0(var5) * var2;
      float var12 = LW.Om(var5) * var3;
      var1.x = var10004;
      var1.y = var4;
      var1.z = var12;
   }

   public SpawnShapeValueExt copy() {
      return new CylinderSpawnShapeValueExt(this);
   }
}
