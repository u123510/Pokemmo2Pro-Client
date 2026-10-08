package com.badlogic.gdx.graphics.g3d.particles.values;

import f.C8;
import f.LW;
import f.es_1;
import f.gs_1;
import f.me0_1;
import f.sa_0;

public final class WeightMeshSpawnShapeValue extends MeshSpawnShapeValue {
   private me0_1 distribution;

   public WeightMeshSpawnShapeValue(WeightMeshSpawnShapeValue value) {
      super(value);
      this.distribution = new me0_1();
      load(value);
   }

   public WeightMeshSpawnShapeValue() {
      super();
      this.distribution = new me0_1();
   }

   @Override
   public void init() {
      calculateWeights();
   }

   public void calculateWeights() {
      this.distribution.k.clear();
      sa_0 attributes = this.mesh.COM6.JP();
      int indicesCount = this.mesh.Sw0.Id();
      int vertexCount = this.mesh.COM6.mB0();
      int vertexSize = attributes.u5 / 4;
      int positionOffset = attributes.r70(1).Kk0 / 4;

      float[] vertices = new float[vertexCount * vertexSize];
      this.mesh.gK(-1, vertices);

      if (indicesCount > 0) {
         short[] indices = new short[indicesCount];
         this.mesh.DH(-1, indices);
         for (int i = 0; i < indicesCount; i += 3) {
            int p1 = indices[i] * vertexSize + positionOffset;
            int p2 = indices[i + 1] * vertexSize + positionOffset;
            int p3 = indices[i + 2] * vertexSize + positionOffset;
            addTriangle(vertices, p1, p2, p3, vertexSize);
         }
      } else {
         for (int i = 0; i + vertexSize * 2 < vertices.length; i += vertexSize) {
            int p1 = i + positionOffset;
            int p2 = i + vertexSize + positionOffset;
            int p3 = i + vertexSize * 2 + positionOffset;
            addTriangle(vertices, p1, p2, p3, vertexSize);
         }
      }

      es_1 entries = this.distribution.k;
      float total = 0.0f;
      for (int i = 0; i < entries.KB; ++i) {
         total += ((gs_1[])entries.rZ)[i].r7;
      }
      float cumulative = 0.0f;
      for (int i = 0; i < entries.KB; ++i) {
         gs_1 entry = ((gs_1[])entries.rZ)[i];
         cumulative += total == 0.0f ? 0.0f : entry.r7 / total;
         entry.ce0 = cumulative;
      }
   }

   private void addTriangle(float[] vertices, int p1, int p2, int p3, int vertexSize) {
      float x1 = vertices[p1];
      float y1 = vertices[p1 + 1];
      float z1 = vertices[p1 + 2];
      float x2 = vertices[p2];
      float y2 = vertices[p2 + 1];
      float z2 = vertices[p2 + 2];
      float x3 = vertices[p3];
      float y3 = vertices[p3 + 1];
      float z3 = vertices[p3 + 2];
      float area = Math.abs((x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) / 2.0f);
      this.distribution.k.Ue0(new gs_1(this.distribution,
         new Triangle(x1, y1, z1, x2, y2, z2, x3, y3, z3), 0.0f, area));
   }

   @Override
   public void spawnAux(C8 vector, float percent) {
      es_1 entries = this.distribution.k;
      if (entries.KB == 0) {
         vector.x = vector.y = vector.z = 0.0f;
         return;
      }

      float value = LW.Yu.nextFloat();
      int low = 0;
      int high = entries.KB - 1;
      while (low < high) {
         int middle = (low + high) >>> 1;
         if (value <= ((gs_1[])entries.rZ)[middle].ce0) {
            high = middle;
         } else {
            low = middle + 1;
         }
      }

      Triangle triangle = (Triangle)((gs_1[])entries.rZ)[low].Ss;
      triangle.pick(vector);
   }

   @Override
   public SpawnShapeValue copy() {
      return new WeightMeshSpawnShapeValue(this);
   }
}
