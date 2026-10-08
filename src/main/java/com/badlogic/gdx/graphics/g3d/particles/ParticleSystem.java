package com.badlogic.gdx.graphics.g3d.particles;

import com.badlogic.gdx.graphics.g3d.particles.batches.ParticleBatch;
import f.I2;
import f.es_1;
import f.ju_0;
import f.uh_1;

public final class ParticleSystem implements uh_1 {
   private static ParticleSystem instance;
   private es_1 batches;
   private es_1 effects;

   /** @deprecated */
   @Deprecated
   public static ParticleSystem get() {
      if (instance == null) {
         instance = new ParticleSystem();
      }

      return instance;
   }

   public ParticleSystem() {
      this.batches = new es_1();
      this.effects = new es_1();
   }

   public void add(ParticleBatch var1) {
      this.batches.Ue0(var1);
   }

   public void add(ParticleEffect var1) {
      this.effects.Ue0(var1);
   }

   public void remove(ParticleEffect var1) {
      this.effects.sj0(var1, true);
   }

   public void removeAll() {
      this.effects.clear();
   }

   public void update() {
      I2 var1 = this.effects.ZD();

      while(var1.hasNext()) {
         ((ParticleEffect)var1.next()).update();
      }

   }

   public void updateAndDraw() {
      I2 var1 = this.effects.ZD();

      while(var1.hasNext()) {
         ParticleEffect var10000 = (ParticleEffect)var1.next();
         var10000.update();
         var10000.draw();
      }

   }

   public void update(float var1) {
      I2 var2 = this.effects.ZD();

      while(var2.hasNext()) {
         ((ParticleEffect)var2.next()).update(var1);
      }

   }

   public void updateAndDraw(float var1) {
      I2 var2 = this.effects.ZD();

      while(var2.hasNext()) {
         ParticleEffect var10000 = (ParticleEffect)var2.next();
         var10000.update(var1);
         var10000.draw();
      }

   }

   public void begin() {
      I2 var1 = this.batches.ZD();

      while(var1.hasNext()) {
         ((ParticleBatch)var1.next()).begin();
      }

   }

   public void draw() {
      I2 var1 = this.effects.ZD();

      while(var1.hasNext()) {
         ((ParticleEffect)var1.next()).draw();
      }

   }

   public void end() {
      I2 var1 = this.batches.ZD();

      while(var1.hasNext()) {
         ((ParticleBatch)var1.next()).end();
      }

   }

   public void getRenderables(es_1 var1, ju_0 var2) {
      I2 var3 = this.batches.ZD();

      while(var3.hasNext()) {
         ((ParticleBatch)var3.next()).getRenderables(var1, var2);
      }

   }

   public es_1 getBatches() {
      return this.batches;
   }
}
