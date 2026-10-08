package com.badlogic.gdx.graphics.g3d.particles.renderers;

import com.badlogic.gdx.graphics.g3d.particles.ParticleController;
import com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent;
import com.badlogic.gdx.graphics.g3d.particles.batches.ParticleBatch;

public abstract class ParticleControllerRenderer extends ParticleControllerComponent {
   protected ParticleBatch batch;
   protected ParticleControllerRenderData renderData;

   public ParticleControllerRenderer() {
   }

   public ParticleControllerRenderer(ParticleControllerRenderData var1) {
      this.renderData = var1;
   }

   public void update() {
      this.batch.draw(this.renderData);
   }

   public boolean setBatch(ParticleBatch var1) {
      if (this.isCompatible(var1)) {
         this.batch = var1;
         return true;
      } else {
         return false;
      }
   }

   public abstract boolean isCompatible(ParticleBatch var1);

   public void set(ParticleController var1) {
      super.set(var1);
      ParticleControllerRenderData var2;
      if ((var2 = this.renderData) != null) {
         var2.controller = super.controller;
      }

   }
}
