package com.badlogic.gdx.graphics.g3d.particles.values;

import f.C8;
import f.LW;
import f.hk0_0;

public final class LineSpawnShapeValue extends PrimitiveSpawnShapeValue {
   public LineSpawnShapeValue(LineSpawnShapeValue var1) {
      super(var1);
      ((PrimitiveSpawnShapeValue)this).load(var1);
   }

   public LineSpawnShapeValue() {
   }

   public void spawnAux(C8 var1, float var2) {
      LineSpawnShapeValue var10001 = this;
      LineSpawnShapeValue var10002 = this;
      LineSpawnShapeValue var10003 = this;
      LineSpawnShapeValue var10004 = this;
      LineSpawnShapeValue var10005 = this;
      LineSpawnShapeValue var10006 = this;
      LineSpawnShapeValue var10007 = this;
      LineSpawnShapeValue var10008 = this;
      float var6 = super.spawnWidth;
      float var3 = var10008.spawnWidthDiff;
      var6 = hk0_0.gb0(var10007.spawnWidthValue, var2, var3, var6);
      var3 = var10006.spawnHeight;
      float var4 = var10005.spawnHeightDiff;
      var3 = hk0_0.gb0(var10004.spawnHeightValue, var2, var4, var3);
      var4 = var10003.spawnDepth;
      float var5 = var10002.spawnDepthDiff;
      var2 = hk0_0.gb0(var10001.spawnDepthValue, var2, var5, var4);
      float var13 = var4 = LW.Yu.nextFloat();
      var1.x = var4 * var6;
      var1.y = var4 * var3;
      var1.z = var13 * var2;
   }

   public SpawnShapeValue copy() {
      return new LineSpawnShapeValue(this);
   }
}
