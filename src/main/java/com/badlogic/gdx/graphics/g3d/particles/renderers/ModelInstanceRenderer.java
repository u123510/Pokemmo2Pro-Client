package com.badlogic.gdx.graphics.g3d.particles.renderers;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g3d.particles.ParallelArray;
import com.badlogic.gdx.graphics.g3d.particles.ParticleChannels;
import com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent;
import com.badlogic.gdx.graphics.g3d.particles.batches.ModelInstanceParticleBatch;
import com.badlogic.gdx.graphics.g3d.particles.batches.ParticleBatch;
import f.BM;
import f.PRN_;
import f.St;
import f.sh_0;

public class ModelInstanceRenderer extends ParticleControllerRenderer {
    private boolean hasColor;
    private boolean hasScale;
    private boolean hasRotation;

    public ModelInstanceRenderer() {
        super(new ModelInstanceControllerRenderData());
    }

    public ModelInstanceRenderer(ModelInstanceParticleBatch batch) {
        this();
        setBatch(batch);
    }

    @Override
    public void allocateChannels() {
        ((ModelInstanceControllerRenderData)this.renderData).positionChannel = (ParallelArray.FloatChannel)this.controller.particles.addChannel(ParticleChannels.Position);
    }

    @Override
    public void init() {
        ModelInstanceControllerRenderData data = (ModelInstanceControllerRenderData)this.renderData;
        data.modelInstanceChannel = (ParallelArray.ObjectChannel)this.controller.particles.getChannel(ParticleChannels.ModelInstance);
        data.colorChannel = (ParallelArray.FloatChannel)this.controller.particles.getChannel(ParticleChannels.Color);
        data.scaleChannel = (ParallelArray.FloatChannel)this.controller.particles.getChannel(ParticleChannels.Scale);
        data.rotationChannel = (ParallelArray.FloatChannel)this.controller.particles.getChannel(ParticleChannels.Rotation3D);
        this.hasColor = data.colorChannel != null;
        this.hasScale = data.scaleChannel != null;
        this.hasRotation = data.rotationChannel != null;
    }

    @Override
    public void update() {
        ModelInstanceControllerRenderData data = (ModelInstanceControllerRenderData)this.renderData;
        int positionIndex = 0;
        int count = this.controller.particles.size;
        for (int i = 0; i < count; ++i) {
            St instance = (St)data.modelInstanceChannel.data[i];
            float scale = this.hasScale ? data.scaleChannel.data[i] : 1.0f;
            float qx = 0.0f;
            float qy = 0.0f;
            float qz = 0.0f;
            float qw = 1.0f;
            if (this.hasRotation) {
                int rotationIndex = i * data.rotationChannel.strideSize;
                qx = data.rotationChannel.data[rotationIndex];
                qy = data.rotationChannel.data[rotationIndex + 1];
                qz = data.rotationChannel.data[rotationIndex + 2];
                qw = data.rotationChannel.data[rotationIndex + 3];
            }
            instance.ho.oC(data.positionChannel.data[positionIndex], data.positionChannel.data[positionIndex + 1], data.positionChannel.data[positionIndex + 2], qx, qy, qz, qw, scale, scale, scale);
            if (this.hasColor) {
                int colorIndex = i * data.colorChannel.strideSize;
                BM material = (BM)instance.Y3.get(0);
                PRN_ diffuse = (PRN_)material.sg(PRN_.Ly);
                sh_0 blending = (sh_0)material.sg(sh_0.vF0);
                Color color = diffuse.v50;
                color.r = data.colorChannel.data[colorIndex];
                color.g = data.colorChannel.data[colorIndex + 1];
                color.b = data.colorChannel.data[colorIndex + 2];
                if (blending != null) blending.yt = data.colorChannel.data[colorIndex + 3];
            }
            positionIndex += data.positionChannel.strideSize;
        }
        super.update();
    }

    @Override
    public ParticleControllerComponent copy() {
        return new ModelInstanceRenderer((ModelInstanceParticleBatch)this.batch);
    }

    @Override
    public boolean isCompatible(ParticleBatch batch) {
        return batch instanceof ModelInstanceParticleBatch;
    }
}
