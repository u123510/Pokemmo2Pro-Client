package com.badlogic.gdx.graphics.g3d.particles.values;

import f.C8;
import f.O00;
import f.TG0;
import java.util.Random;

public final class LineSpawnShapeValueExt extends PrimitiveSpawnShapeValueExt {
   private static final Random random = new O00();

   public LineSpawnShapeValueExt(LineSpawnShapeValueExt var1) {
      super(var1);
      ((PrimitiveSpawnShapeValueExt)this).load(var1);
   }

   public LineSpawnShapeValueExt() {
   }

   public void reSeed() {
      super.reSeed();
      if (super.seed.isActive()) {
         random.setSeed(super.seed.getValue());
      }

   }

   public void spawnAux(C8 var1, float var2) {
      LineSpawnShapeValueExt var10001 = this;
      LineSpawnShapeValueExt var10002 = this;
      LineSpawnShapeValueExt var10003 = this;
      LineSpawnShapeValueExt var10004 = this;
      LineSpawnShapeValueExt var10005 = this;
      LineSpawnShapeValueExt var10006 = this;
      LineSpawnShapeValueExt var10007 = this;
      LineSpawnShapeValueExt var10008 = this;
      float var6 = super.spawnWidth;
      float var3 = var10008.spawnWidthDiff;
      var6 = TG0.u9(var10007.spawnWidthValue, var2, var3, var6);
      var3 = var10006.spawnHeight;
      float var4 = var10005.spawnHeightDiff;
      var3 = TG0.u9(var10004.spawnHeightValue, var2, var4, var3);
      var4 = var10003.spawnDepth;
      float var5 = var10002.spawnDepthDiff;
      var2 = TG0.u9(var10001.spawnDepthValue, var2, var5, var4);
      float var13 = var4 = random.nextFloat();
      var1.x = var4 * var6;
      var1.y = var4 * var3;
      var1.z = var13 * var2;
   }

   public SpawnShapeValueExt copy() {
      return new LineSpawnShapeValueExt(this);
   }
}
