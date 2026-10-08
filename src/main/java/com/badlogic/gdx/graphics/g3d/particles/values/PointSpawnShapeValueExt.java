package com.badlogic.gdx.graphics.g3d.particles.values;

import f.C8;
import f.TG0;

public final class PointSpawnShapeValueExt extends PrimitiveSpawnShapeValueExt {
   public PointSpawnShapeValueExt(PointSpawnShapeValueExt var1) {
      super(var1);
      ((PrimitiveSpawnShapeValueExt)this).load(var1);
   }

   public PointSpawnShapeValueExt() {
   }

   public void spawnAux(C8 var1, float var2) {
      C8 var10000 = var1;
      PointSpawnShapeValueExt var10001 = this;
      PointSpawnShapeValueExt var10002 = this;
      PointSpawnShapeValueExt var10003 = this;
      C8 var10004 = var1;
      PointSpawnShapeValueExt var10005 = this;
      PointSpawnShapeValueExt var10006 = this;
      PointSpawnShapeValueExt var10007 = this;
      C8 var10008 = var1;
      PointSpawnShapeValueExt var10009 = this;
      PointSpawnShapeValueExt var10010 = this;
      float var3 = super.spawnWidth;
      float var6 = var10010.spawnWidthDiff;
      var10008.x = TG0.u9(var10009.spawnWidthValue, var2, var6, var3);
      var3 = var10007.spawnHeight;
      var6 = var10006.spawnHeightDiff;
      var10004.y = TG0.u9(var10005.spawnHeightValue, var2, var6, var3);
      var3 = var10003.spawnDepth;
      var6 = var10002.spawnDepthDiff;
      var10000.z = TG0.u9(var10001.spawnDepthValue, var2, var6, var3);
   }

   public void setDimensions(float var1) {
      super.spawnWidthValue.setHigh(var1);
      super.spawnHeightValue.setHigh(var1);
   }

   public SpawnShapeValueExt copy() {
      return new PointSpawnShapeValueExt(this);
   }
}
