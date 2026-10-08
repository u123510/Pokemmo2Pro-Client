package com.badlogic.gdx.graphics.g3d.particles.batches;

import com.badlogic.gdx.graphics.g3d.particles.ParticleShaderExt;

public class PointSpriteParticleBatchExt extends PointSpriteParticleBatch {
   public PointSpriteParticleBatchExt(int var1, ParticleShaderExt.Config var2) {
      super(var1);
      super.renderable.st.dispose();
      super.renderable.st = new ParticleShaderExt(super.renderable, var2);
      super.renderable.st.init();
   }
}
