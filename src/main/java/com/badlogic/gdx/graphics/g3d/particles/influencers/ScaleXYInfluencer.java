package com.badlogic.gdx.graphics.g3d.particles.influencers;

import com.badlogic.gdx.graphics.g3d.particles.ParallelArray;
import com.badlogic.gdx.graphics.g3d.particles.ParticleChannels;
import com.badlogic.gdx.graphics.g3d.particles.ParticleChannelsExt;
import com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent;
import com.badlogic.gdx.graphics.g3d.particles.values.ScaledNumericValueExt;
import f.TG0;
import f.gp_1;
import f.h4_0;
import f.oe_0;

public class ScaleXYInfluencer extends SimpleInfluencer {
    public ScaledNumericValueExt valueX;
    public ScaledNumericValueExt valueY;
    private ParallelArray.FloatChannel regionChannel;
    public ParallelArray.FloatChannel parentScale;
    private ParallelArray.FloatChannel staticScale;
    public int parentScaleOffset;

    public ScaleXYInfluencer() {
        this.valueX = new ScaledNumericValueExt();
        this.valueX.setHigh(1.0f);
        this.valueY = new ScaledNumericValueExt();
        this.valueY.setHigh(1.0f);
        this.valueChannelDescriptor = ParticleChannelsExt.ScaleXY;
    }

    public ScaleXYInfluencer(ScaleXYInfluencer source) {
        this();
        set(source);
    }

    private void set(ScaleXYInfluencer source) {
        this.valueX.load(source.valueX);
        this.valueY.load(source.valueY);
        this.valueChannelDescriptor = source.valueChannelDescriptor;
    }

    @Override
    public void activateParticles(int startIndex, int count) {
        int valueIndex = startIndex * this.valueChannel.strideSize;
        int interpIndex = startIndex * this.interpolationChannel.strideSize;
        int end = count * this.valueChannel.strideSize + valueIndex;
        while (valueIndex < end) {
            float startX = this.valueX.newLowValue() * this.controller.scale.x;
            float diffX = this.valueX.newHighValue() * this.controller.scale.x - startX;
            float startY = this.valueY.newLowValue() * this.controller.scale.y;
            float diffY = this.valueY.newHighValue() * this.controller.scale.y - startY;
            this.interpolationChannel.data[interpIndex] = startX;
            this.interpolationChannel.data[interpIndex + 1] = diffX;
            if (this.valueX.isRelative()) {
                this.interpolationChannel.data[interpIndex + 2] = startX;
                this.interpolationChannel.data[interpIndex + 3] = diffX;
            } else {
                this.interpolationChannel.data[interpIndex + 2] = startY;
                this.interpolationChannel.data[interpIndex + 3] = diffY;
            }
            this.valueChannel.data[valueIndex] = TG0.u9(this.valueX, 0.0f, diffX, startX);
            this.valueChannel.data[valueIndex + 1] = this.valueX.isRelative()
                    ? TG0.u9(this.valueX, 0.0f, diffX, startX)
                    : TG0.u9(this.valueY, 0.0f, diffY, startY);
            if (this.parentScale != null) {
                float[] base = this.staticScale.data;
                float[] parent = this.parentScale.data;
                int parentOffset = this.parentScaleOffset;
                base[valueIndex] = parent[parentOffset];
                base[valueIndex + 1] = parent[parentOffset + 1];
                this.valueChannel.data[valueIndex] *= parent[parentOffset];
                this.valueChannel.data[valueIndex + 1] *= parent[parentOffset + 1];
            }
            valueIndex += this.valueChannel.strideSize;
            interpIndex += this.interpolationChannel.strideSize;
        }
    }

    @Override
    public void allocateChannels() {
        super.allocateChannels();
        ParticleChannels.Interpolation4.id = this.controller.particleChannels.newId();
        this.interpolationChannel = (ParallelArray.FloatChannel)this.controller.particles.addChannel(ParticleChannels.Interpolation4);
        this.regionChannel = (ParallelArray.FloatChannel)this.controller.particles.addChannel(ParticleChannels.TextureRegion);
        this.staticScale = (ParallelArray.FloatChannel)this.controller.particles.addChannel(ParticleChannelsExt.BaseScaleXY);
    }

    @Override
    public void update() {
        int valueIndex = 0;
        int interpIndex = 0;
        int lifeIndex = ParticleChannels.LifePercentOffset;
        int end = this.controller.particles.size * this.valueChannel.strideSize;
        while (valueIndex < end) {
            float startX = this.interpolationChannel.data[interpIndex];
            float diffX = this.interpolationChannel.data[interpIndex + 1];
            this.valueChannel.data[valueIndex] = TG0.u9(this.valueX, this.lifeChannel.data[lifeIndex], diffX, startX);
            if (this.valueX.isRelative()) {
                this.valueChannel.data[valueIndex + 1] = TG0.u9(this.valueX, this.lifeChannel.data[lifeIndex], diffX, startX);
            } else {
                float startY = this.interpolationChannel.data[interpIndex + 2];
                float diffY = this.interpolationChannel.data[interpIndex + 3];
                this.valueChannel.data[valueIndex + 1] = TG0.u9(this.valueY, this.lifeChannel.data[lifeIndex], diffY, startY);
            }
            if (this.parentScale != null) {
                this.valueChannel.data[valueIndex] *= this.staticScale.data[valueIndex];
                this.valueChannel.data[valueIndex + 1] *= this.staticScale.data[valueIndex + 1];
            }
            valueIndex += this.valueChannel.strideSize;
            interpIndex += this.interpolationChannel.strideSize;
            lifeIndex += this.lifeChannel.strideSize;
        }
    }

    @Override
    public void write(gp_1 json) {
        json.v80(this.valueX, "valuex");
        json.v80(this.valueY, "valuey");
    }

    @Override
    public void read(gp_1 json, oe_0 jsonData) {
        this.valueX = (ScaledNumericValueExt)h4_0.Lpt6(json, jsonData, "valuex", ScaledNumericValueExt.class, null);
        this.valueY = (ScaledNumericValueExt)json.b20(ScaledNumericValueExt.class, null, jsonData.Is("valuey"));
    }

    @Override
    public ParticleControllerComponent copy() {
        return new ScaleXYInfluencer(this);
    }
}
