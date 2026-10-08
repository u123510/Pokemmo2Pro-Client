package com.badlogic.gdx.graphics.g3d.particles.values;

import com.badlogic.gdx.graphics.g3d.particles.values.MeshSpawnShapeValue.Triangle;
import f.C8;
import f.LW;
import f.ap0_0;
import f.ut_0;

public final class UnweightedMeshSpawnShapeValue extends MeshSpawnShapeValue {
   private float[] vertices;
   private short[] indices;
   private int positionOffset;
   private int vertexSize;
   private int vertexCount;
   private int triangleCount;

   public UnweightedMeshSpawnShapeValue(UnweightedMeshSpawnShapeValue var1) {
      super(var1);
      ((MeshSpawnShapeValue)this).load(var1);
   }

   public UnweightedMeshSpawnShapeValue() {
   }

   public void setMesh(ap0_0 var1, ut_0 var2) {
      super.setMesh(var1, var2);
      this.vertexSize = var1.COM6.JP().u5 / 4;
      this.positionOffset = var1.UL(1).Kk0 / 4;
      int var5;
      if ((var5 = var1.Sw0.Id()) > 0) {
         short[] var6;
         this.indices = var6 = new short[var5];
         var1.DH(-1, var6);
         this.triangleCount = this.indices.length / 3;
      } else {
         this.indices = null;
      }

      ap0_0 var10000 = var1;
      int var4;
      int var10002 = var4 = var1.COM6.mB0();
      this.vertexCount = var4;
      float[] var3;
      this.vertices = var3 = new float[var10002 * this.vertexSize];
      var10000.gK(-1, var3);
   }

   public void spawnAux(C8 var1, float var2) {
      if (this.indices == null) {
         UnweightedMeshSpawnShapeValue var10000 = this;
         int var3;
         int var9;
         int var14;
         var14 = (var3 = (var9 = (int)LW.Yu.nextLong((long)(this.vertexCount - 2)) * (var14 = this.vertexSize) + this.positionOffset) + var14) + var14;
         float[] var4;
         float var32 = (var4 = var10000.vertices)[var9];
         float[] var10001 = var4;
         int var10002 = var14;
         float[] var10003 = var4;
         int var10004 = var14;
         float[] var10005 = var4;
         int var10006 = var14;
         float[] var10007 = var4;
         int var10008 = var3;
         int var10010 = var3;
         int var10014 = var9;
         float var10 = var4[var9 + 1];
         float var16 = var4[var10014 + 2];
         float var21 = var4[var3];
         float var25 = var4[var10010 + 1];
         float var5 = var10007[var10008 + 2];
         float var6 = var10005[var10006];
         float var7 = var10003[var10004 + 1];
         float var8 = var10001[var10002 + 2];
         Triangle.pick(var32, var10, var16, var21, var25, var5, var6, var7, var8, var1);
      } else {
         UnweightedMeshSpawnShapeValue var33 = this;
         int var17 = (int)LW.Yu.nextLong((long)this.triangleCount) * 3;
         short[] var22;
         short[] var35 = var22 = this.indices;
         int var37 = var17;
         short[] var39 = var22;
         int var41 = var17;
         int var11;
         int var18;
         int var23 = var22[var17] * (var18 = this.vertexSize) + (var11 = this.positionOffset);
         int var26 = var39[var41 + 1] * var18 + var11;
         int var12 = var35[var37 + 2] * var18 + var11;
         float[] var19;
         float var34 = (var19 = var33.vertices)[var23];
         float[] var36 = var19;
         var37 = var12;
         float[] var40 = var19;
         var41 = var12;
         float[] var43 = var19;
         int var44 = var12;
         float[] var45 = var19;
         int var46 = var26;
         float[] var10009 = var19;
         float[] var10011 = var19;
         float var13 = var19[var23 + 1];
         float var20 = var19[var23 + 2];
         float var24 = var10011[var26];
         float var27 = var10009[var26 + 1];
         float var28 = var45[var46 + 2];
         float var29 = var43[var44];
         float var30 = var40[var41 + 1];
         float var31 = var36[var37 + 2];
         Triangle.pick(var34, var13, var20, var24, var27, var28, var29, var30, var31, var1);
      }

   }

   public SpawnShapeValue copy() {
      return new UnweightedMeshSpawnShapeValue(this);
   }
}
