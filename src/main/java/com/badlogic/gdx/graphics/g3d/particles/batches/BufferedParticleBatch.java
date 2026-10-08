package com.badlogic.gdx.graphics.g3d.particles.batches;

import com.badlogic.gdx.graphics.g3d.particles.ParticleSorter;
import com.badlogic.gdx.graphics.g3d.particles.renderers.ParticleControllerRenderData;
import f.Tv0;
import f.es_1;

public abstract class BufferedParticleBatch implements ParticleBatch {
   protected es_1 renderData;
   protected int bufferedParticlesCount;
   protected int currentCapacity;
   protected ParticleSorter sorter;
   protected Tv0 camera;

   public BufferedParticleBatch(Class var1) {
      this.currentCapacity = 0;
      this.sorter = new ParticleSorter.Distance();
      this.renderData = new es_1(false, 10, var1);
   }

   public void begin() {
      this.renderData.clear();
      this.bufferedParticlesCount = 0;
   }

   public void draw(ParticleControllerRenderData var1) {
      if (var1.controller.particles.size > 0) {
         this.renderData.Ue0(var1);
         this.bufferedParticlesCount += var1.controller.particles.size;
      }

   }

   public void end() {
      int var1;
      if ((var1 = this.bufferedParticlesCount) > 0) {
         this.ensureCapacity(var1);
         this.flush(this.sorter.sort(this.renderData));
      }

   }

   public void ensureCapacity(int var1) {
      if (this.currentCapacity < var1) {
         this.sorter.ensureCapacity(var1);
         this.allocParticlesData(var1);
         this.currentCapacity = var1;
      }
   }

   public void resetCapacity() {
      this.bufferedParticlesCount = 0;
      this.currentCapacity = 0;
   }

   public abstract void allocParticlesData(int var1);

   public void setCamera(Tv0 var1) {
      this.camera = var1;
      this.sorter.setCamera(var1);
   }

   public ParticleSorter getSorter() {
      return this.sorter;
   }

   public void setSorter(ParticleSorter var1) {
      this.sorter = var1;
      var1.setCamera(this.camera);
      var1.ensureCapacity(this.currentCapacity);
   }

   public abstract void flush(int[] var1);

   public int getBufferedCount() {
      return this.bufferedParticlesCount;
   }
}
