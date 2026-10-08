/*
 * Decompiled with CFR 0.152.
 */
package com.badlogic.gdx.graphics.g3d.particles.renderers;

import com.badlogic.gdx.graphics.g3d.particles.ParallelArray;
import com.badlogic.gdx.graphics.g3d.particles.ParticleChannels;
import com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent;
import com.badlogic.gdx.graphics.g3d.particles.batches.ParticleBatch;
import com.badlogic.gdx.graphics.g3d.particles.batches.PointSpriteParticleBatch;
import com.badlogic.gdx.graphics.g3d.particles.renderers.ParticleControllerRenderer;
import com.badlogic.gdx.graphics.g3d.particles.renderers.PointSpriteControllerRenderData;

public class PointSpriteRenderer
extends ParticleControllerRenderer {
    public PointSpriteRenderer() {
        super(new PointSpriteControllerRenderData());
    }

    public PointSpriteRenderer(PointSpriteParticleBatch pointSpriteParticleBatch) {
        this();
        this.setBatch(pointSpriteParticleBatch);
    }

    @Override
    public void allocateChannels() {
        PointSpriteRenderer pointSpriteRenderer = this;
        ((PointSpriteControllerRenderData)pointSpriteRenderer.renderData).positionChannel = (ParallelArray.FloatChannel)this.controller.particles.addChannel(ParticleChannels.Position);
        ((PointSpriteControllerRenderData)pointSpriteRenderer.renderData).regionChannel = (ParallelArray.FloatChannel)this.controller.particles.addChannel(ParticleChannels.TextureRegion, ParticleChannels.TextureRegionInitializer.get());
        ((PointSpriteControllerRenderData)pointSpriteRenderer.renderData).colorChannel = (ParallelArray.FloatChannel)this.controller.particles.addChannel(ParticleChannels.Color, ParticleChannels.ColorInitializer.get());
        ((PointSpriteControllerRenderData)pointSpriteRenderer.renderData).scaleChannel = (ParallelArray.FloatChannel)this.controller.particles.addChannel(ParticleChannels.Scale, ParticleChannels.ScaleInitializer.get());
        ((PointSpriteControllerRenderData)pointSpriteRenderer.renderData).rotationChannel = (ParallelArray.FloatChannel)this.controller.particles.addChannel(ParticleChannels.Rotation2D, ParticleChannels.Rotation2dInitializer.get());
    }

    @Override
    public boolean isCompatible(ParticleBatch particleBatch) {
        return particleBatch instanceof PointSpriteParticleBatch;
    }

    @Override
    public ParticleControllerComponent copy() {
        return new PointSpriteRenderer((PointSpriteParticleBatch)this.batch);
    }
}
