package com.badlogic.gdx.graphics.g3d.particles.values;

import f.C8;
import f.hk0_0;

public final class PointSpawnShapeValue extends PrimitiveSpawnShapeValue {
   public PointSpawnShapeValue(PointSpawnShapeValue var1) {
      super(var1);
      ((PrimitiveSpawnShapeValue)this).load(var1);
   }

   public PointSpawnShapeValue() {
   }

   public void spawnAux(C8 var1, float var2) {
      C8 var10000 = var1;
      PointSpawnShapeValue var10001 = this;
      PointSpawnShapeValue var10002 = this;
      PointSpawnShapeValue var10003 = this;
      C8 var10004 = var1;
      PointSpawnShapeValue var10005 = this;
      PointSpawnShapeValue var10006 = this;
      PointSpawnShapeValue var10007 = this;
      C8 var10008 = var1;
      PointSpawnShapeValue var10009 = this;
      PointSpawnShapeValue var10010 = this;
      float var3 = super.spawnWidth;
      float var6 = var10010.spawnWidthDiff;
      var10008.x = hk0_0.gb0(var10009.spawnWidthValue, var2, var6, var3);
      var3 = var10007.spawnHeight;
      var6 = var10006.spawnHeightDiff;
      var10004.y = hk0_0.gb0(var10005.spawnHeightValue, var2, var6, var3);
      var3 = var10003.spawnDepth;
      var6 = var10002.spawnDepthDiff;
      var10000.z = hk0_0.gb0(var10001.spawnDepthValue, var2, var6, var3);
   }

   public SpawnShapeValue copy() {
      return new PointSpawnShapeValue(this);
   }
}
