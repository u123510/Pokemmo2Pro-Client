package com.badlogic.gdx.graphics.g3d.particles.renderers;

import com.badlogic.gdx.graphics.g3d.particles.ParallelArray;
import com.badlogic.gdx.graphics.g3d.particles.ParticleChannels;
import com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent;
import com.badlogic.gdx.graphics.g3d.particles.batches.BillboardParticleBatch;
import com.badlogic.gdx.graphics.g3d.particles.batches.ParticleBatch;

public class BillboardRenderer extends ParticleControllerRenderer {
    public BillboardRenderer() {
        super(new BillboardControllerRenderData());
    }

    public BillboardRenderer(BillboardParticleBatch batch) {
        this();
        setBatch(batch);
    }

    @Override
    public void allocateChannels() {
        BillboardControllerRenderData data = (BillboardControllerRenderData)this.renderData;
        data.positionChannel = (ParallelArray.FloatChannel)this.controller.particles.addChannel(ParticleChannels.Position);
        data.regionChannel = (ParallelArray.FloatChannel)this.controller.particles.addChannel(ParticleChannels.TextureRegion, ParticleChannels.TextureRegionInitializer.get());
        data.colorChannel = (ParallelArray.FloatChannel)this.controller.particles.addChannel(ParticleChannels.Color, ParticleChannels.ColorInitializer.get());
        data.scaleChannel = (ParallelArray.FloatChannel)this.controller.particles.addChannel(ParticleChannels.Scale, ParticleChannels.ScaleInitializer.get());
        data.rotationChannel = (ParallelArray.FloatChannel)this.controller.particles.addChannel(ParticleChannels.Rotation2D, ParticleChannels.Rotation2dInitializer.get());
    }

    @Override
    public ParticleControllerComponent copy() {
        return new BillboardRenderer((BillboardParticleBatch)this.batch);
    }

    @Override
    public boolean isCompatible(ParticleBatch batch) {
        return batch instanceof BillboardParticleBatch;
    }
}
