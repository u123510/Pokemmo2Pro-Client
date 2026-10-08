package com.badlogic.gdx.graphics.g3d.particles.batches;

import com.badlogic.gdx.graphics.g3d.particles.ResourceData;
import com.badlogic.gdx.graphics.g3d.particles.renderers.ModelInstanceControllerRenderData;
import com.badlogic.gdx.graphics.g3d.particles.renderers.ParticleControllerRenderData;
import f.I2;
import f.St;
import f.es_1;
import f.hd0_2;
import f.ju_0;

public class ModelInstanceParticleBatch implements ParticleBatch {
   es_1 controllersRenderData;
   int bufferedParticlesCount;

   public ModelInstanceParticleBatch() {
      this.controllersRenderData = new es_1(false, 5);
   }

   public void getRenderables(es_1 var1, ju_0 var2) {
      I2 var6 = this.controllersRenderData.ZD();

      while(var6.hasNext()) {
         ModelInstanceControllerRenderData var3;
         ModelInstanceControllerRenderData var10000 = var3 = (ModelInstanceControllerRenderData)var6.next();
         int var4 = 0;

         for(int var5 = var10000.controller.particles.size; var4 < var5; ++var4) {
            ((St[])var3.modelInstanceChannel.data)[var4].getRenderables(var1, var2);
         }
      }

   }

   public int getBufferedCount() {
      return this.bufferedParticlesCount;
   }

   public void begin() {
      this.controllersRenderData.clear();
      this.bufferedParticlesCount = 0;
   }

   public void end() {
   }

   public void draw(ModelInstanceControllerRenderData var1) {
      this.controllersRenderData.Ue0(var1);
      this.bufferedParticlesCount += var1.controller.particles.size;
   }

   public void draw(ParticleControllerRenderData var1) {
      this.draw((ModelInstanceControllerRenderData)var1);
   }

   public void save(hd0_2 var1, ResourceData var2) {
   }

   public void load(hd0_2 var1, ResourceData var2) {
   }
}
