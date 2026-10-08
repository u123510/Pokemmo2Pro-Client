package com.badlogic.gdx.graphics.g3d.particles;

import com.badlogic.gdx.graphics.g3d.particles.batches.ParticleBatch;
import com.badlogic.gdx.math.Matrix4;
import f.C8;
import f.I2;
import f.es_1;
import f.fy0_0;
import f.hd0_2;
import f.ly0_0;
import f.me0_2;

public class ParticleEffect implements fy0_0, ResourceData.Configurable {
   private es_1 controllers;
   private ly0_0 bounds;

   public ParticleEffect() {
      this.controllers = new es_1(true, 3, ParticleController.class);
   }

   public ParticleEffect(ParticleEffect var1) {
      this.controllers = new es_1(true, var1.controllers.KB);
      int var2 = 0;

      for(int var3 = var1.controllers.KB; var2 < var3; ++var2) {
         this.controllers.Ue0(((ParticleController)var1.controllers.get(var2)).copy());
      }

   }

   public ParticleEffect(ParticleController... var1) {
      this.controllers = new es_1(var1);
   }

   public void init() {
      int var1 = 0;

      for(int var2 = this.controllers.KB; var1 < var2; ++var1) {
         ((ParticleController)this.controllers.get(var1)).init();
      }

   }

   public void start() {
      int var1 = 0;

      for(int var2 = this.controllers.KB; var1 < var2; ++var1) {
         ((ParticleController)this.controllers.get(var1)).start();
      }

   }

   public void end() {
      int var1 = 0;

      for(int var2 = this.controllers.KB; var1 < var2; ++var1) {
         ((ParticleController)this.controllers.get(var1)).end();
      }

   }

   public void reset() {
      int var1 = 0;

      for(int var2 = this.controllers.KB; var1 < var2; ++var1) {
         ((ParticleController)this.controllers.get(var1)).reset();
      }

   }

   public void update() {
      int var1 = 0;

      for(int var2 = this.controllers.KB; var1 < var2; ++var1) {
         ((ParticleController)this.controllers.get(var1)).update();
      }

   }

   public void update(float var1) {
      int var2 = 0;

      for(int var3 = this.controllers.KB; var2 < var3; ++var2) {
         ((ParticleController)this.controllers.get(var2)).update(var1);
      }

   }

   public void draw() {
      int var1 = 0;

      for(int var2 = this.controllers.KB; var1 < var2; ++var1) {
         ((ParticleController)this.controllers.get(var1)).draw();
      }

   }

   public boolean isComplete() {
      int var1 = 0;

      for(int var2 = this.controllers.KB; var1 < var2; ++var1) {
         if (!((ParticleController)this.controllers.get(var1)).isComplete()) {
            return false;
         }
      }

      return true;
   }

   public void setTransform(Matrix4 var1) {
      int var2 = 0;

      for(int var3 = this.controllers.KB; var2 < var3; ++var2) {
         ((ParticleController)this.controllers.get(var2)).setTransform(var1);
      }

   }

   public void rotate(me0_2 var1) {
      int var2 = 0;

      for(int var3 = this.controllers.KB; var2 < var3; ++var2) {
         ((ParticleController)this.controllers.get(var2)).rotate(var1);
      }

   }

   public void rotate(C8 var1, float var2) {
      int var3 = 0;

      for(int var4 = this.controllers.KB; var3 < var4; ++var3) {
         ((ParticleController)this.controllers.get(var3)).rotate(var1, var2);
      }

   }

   public void translate(C8 var1) {
      int var2 = 0;

      for(int var3 = this.controllers.KB; var2 < var3; ++var2) {
         ((ParticleController)this.controllers.get(var2)).translate(var1);
      }

   }

   public void scale(float var1, float var2, float var3) {
      int var4 = 0;

      for(int var5 = this.controllers.KB; var4 < var5; ++var4) {
         ((ParticleController)this.controllers.get(var4)).scale(var1, var2, var3);
      }

   }

   public void scale(C8 var1) {
      int var2 = 0;

      for(int var3 = this.controllers.KB; var2 < var3; ++var2) {
         ParticleController var10000 = (ParticleController)this.controllers.get(var2);
         float var4 = var1.x;
         float var5 = var1.y;
         float var6 = var1.z;
         var10000.scale(var4, var5, var6);
      }

   }

   public es_1 getControllers() {
      return this.controllers;
   }

   public ParticleController findController(String var1) {
      int var2 = 0;

      for(int var3 = this.controllers.KB; var2 < var3; ++var2) {
         ParticleController var4;
         if ((var4 = (ParticleController)this.controllers.get(var2)).name.equals(var1)) {
            return var4;
         }
      }

      return null;
   }

   public void dispose() {
      int var1 = 0;

      for(int var2 = this.controllers.KB; var1 < var2; ++var1) {
         ((ParticleController)this.controllers.get(var1)).dispose();
      }

   }

   public ly0_0 getBoundingBox() {
      if (this.bounds == null) {
         ly0_0 var1;
         var1 = new ly0_0();
         this.bounds = var1;
      }

      ParticleEffect var10000 = this;
      ly0_0 var2;
      (var2 = this.bounds).br();
      I2 var3 = var10000.controllers.ZD();

      while(var3.hasNext()) {
         var2.qK0(((ParticleController)var3.next()).getBoundingBox());
      }

      return var2;
   }

   public void setBatch(es_1 var1) {
      I2 var5 = this.controllers.ZD();

      while(var5.hasNext()) {
         ParticleController var2 = (ParticleController)var5.next();
         I2 var3 = var1.ZD();

         while(var3.hasNext()) {
            ParticleBatch var4 = (ParticleBatch)var3.next();
            if (var2.renderer.setBatch(var4)) {
               break;
            }
         }
      }

   }

   public ParticleEffect copy() {
      return new ParticleEffect(this);
   }

   public void save(hd0_2 var1, ResourceData var2) {
      I2 var3 = this.controllers.ZD();

      while(var3.hasNext()) {
         ((ParticleController)var3.next()).save(var1, var2);
      }

   }

   public void load(hd0_2 var1, ResourceData var2) {
      I2 var3 = this.controllers.ZD();

      while(var3.hasNext()) {
         ((ParticleController)var3.next()).load(var1, var2);
      }

   }
}
