package com.badlogic.gdx.graphics.g3d.particles.values;

import com.badlogic.gdx.graphics.g3d.particles.ResourceData;
import f.C8;
import f.LW;
import f.ap0_0;
import f.cr_2;
import f.hd0_2;
import f.nf_1;
import f.ut_0;

public abstract class MeshSpawnShapeValue extends SpawnShapeValue {
   public static class Triangle {
      float x1;
      float y1;
      float z1;
      float x2;
      float y2;
      float z2;
      float x3;
      float y3;
      float z3;

      public Triangle(float x1, float y1, float z1, float x2, float y2, float z2,
                      float x3, float y3, float z3) {
         this.x1 = x1;
         this.y1 = y1;
         this.z1 = z1;
         this.x2 = x2;
         this.y2 = y2;
         this.z2 = z2;
         this.x3 = x3;
         this.y3 = y3;
         this.z3 = z3;
      }

      public static C8 pick(float x1, float y1, float z1, float x2, float y2, float z2,
                            float x3, float y3, float z3, C8 vector) {
         float a = LW.Yu.nextFloat();
         float b = LW.Yu.nextFloat();
         vector.x = x1 + a * (x2 - x1) + b * (x3 - x1);
         vector.y = y1 + a * (y2 - y1) + b * (y3 - y1);
         vector.z = z1 + a * (z2 - z1) + b * (z3 - z1);
         return vector;
      }

      public C8 pick(C8 vector) {
         return pick(this.x1, this.y1, this.z1, this.x2, this.y2, this.z2,
            this.x3, this.y3, this.z3, vector);
      }
   }

   protected ap0_0 mesh;
   protected ut_0 model;

   public MeshSpawnShapeValue(MeshSpawnShapeValue value) {
      super(value);
   }

   public MeshSpawnShapeValue() {
   }

   @Override
   public void load(ParticleValue value) {
      super.load(value);
      MeshSpawnShapeValue shape = (MeshSpawnShapeValue)value;
      this.setMesh(shape.mesh, shape.model);
   }

   public void setMesh(ap0_0 mesh, ut_0 model) {
      if (mesh.UL(1) == null) {
         throw new nf_1("Mesh vertices must have Usage.Position");
      }
      this.model = model;
      this.mesh = mesh;
   }

   public void setMesh(ap0_0 mesh) {
      this.setMesh(mesh, null);
   }

   @Override
   public void save(hd0_2 manager, ResourceData data) {
      if (this.model != null) {
         ResourceData.SaveData saveData = data.createSaveData();
         saveData.saveAsset(manager.RV(this.model), ut_0.class);
         saveData.save("index", this.model.By.E8(this.mesh, true));
      }
   }

   @Override
   public void load(hd0_2 manager, ResourceData data) {
      ResourceData.SaveData saveData = data.getSaveData();
      cr_2 asset = saveData.loadAsset();
      if (asset != null) {
         ut_0 model = (ut_0)manager.Og0(asset.wj, asset.RH0);
         this.setMesh((ap0_0)model.By.get((Integer)saveData.load("index")), model);
      }
   }
}
