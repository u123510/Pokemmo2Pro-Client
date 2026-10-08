package com.badlogic.gdx.graphics.g3d.particles.influencers;

import com.badlogic.gdx.graphics.g3d.particles.ParallelArray;
import com.badlogic.gdx.graphics.g3d.particles.ParticleChannels;
import com.badlogic.gdx.graphics.g3d.particles.values.ScaledNumericValue;
import f.gp_1;
import f.h4_0;
import f.hk0_0;
import f.oe_0;

public abstract class SimpleInfluencer extends Influencer {
    public ScaledNumericValue value;
    ParallelArray.FloatChannel valueChannel;
    ParallelArray.FloatChannel interpolationChannel;
    ParallelArray.FloatChannel lifeChannel;
    ParallelArray.ChannelDescriptor valueChannelDescriptor;

    public SimpleInfluencer() {
        this.value = new ScaledNumericValue();
        this.value.setHigh(1.0f);
    }

    public SimpleInfluencer(SimpleInfluencer source) {
        this();
        set(source);
    }

    private void set(SimpleInfluencer source) {
        this.value.load(source.value);
        this.valueChannelDescriptor = source.valueChannelDescriptor;
    }

    @Override
    public void allocateChannels() {
        this.valueChannel = (ParallelArray.FloatChannel)this.controller.particles.addChannel(this.valueChannelDescriptor);
        ParticleChannels.Interpolation.id = this.controller.particleChannels.newId();
        this.interpolationChannel = (ParallelArray.FloatChannel)this.controller.particles.addChannel(ParticleChannels.Interpolation);
        this.lifeChannel = (ParallelArray.FloatChannel)this.controller.particles.addChannel(ParticleChannels.Life);
    }

    @Override
    public void activateParticles(int startIndex, int count) {
        int i = startIndex * this.valueChannel.strideSize;
        int interp = startIndex * this.interpolationChannel.strideSize;
        int end = count * this.valueChannel.strideSize + i;
        if (!this.value.isRelative()) {
            while (i < end) {
                float start = this.value.newLowValue();
                float diff = this.value.newHighValue() - start;
                this.interpolationChannel.data[interp] = start;
                this.interpolationChannel.data[interp + 1] = diff;
                this.valueChannel.data[i] = hk0_0.gb0(this.value, 0.0f, diff, start);
                i += this.valueChannel.strideSize;
                interp += this.interpolationChannel.strideSize;
            }
        } else {
            while (i < end) {
                float start = this.value.newLowValue();
                float diff = this.value.newHighValue();
                this.interpolationChannel.data[interp] = start;
                this.interpolationChannel.data[interp + 1] = diff;
                this.valueChannel.data[i] = hk0_0.gb0(this.value, 0.0f, diff, start);
                i += this.valueChannel.strideSize;
                interp += this.interpolationChannel.strideSize;
            }
        }
    }

    @Override
    public void update() {
        int valueIndex = 0;
        int interpIndex = 0;
        int lifeIndex = ParticleChannels.LifePercentOffset;
        int end = this.controller.particles.size * this.valueChannel.strideSize;
        while (valueIndex < end) {
            float start = this.interpolationChannel.data[interpIndex];
            float diff = this.interpolationChannel.data[interpIndex + 1];
            this.valueChannel.data[valueIndex] = hk0_0.gb0(this.value, this.lifeChannel.data[lifeIndex], diff, start);
            valueIndex += this.valueChannel.strideSize;
            interpIndex += this.interpolationChannel.strideSize;
            lifeIndex += this.lifeChannel.strideSize;
        }
    }

    @Override
    public void write(gp_1 json) {
        json.v80(this.value, "value");
    }

    @Override
    public void read(gp_1 json, oe_0 jsonData) {
        this.value = (ScaledNumericValue)h4_0.Lpt6(json, jsonData, "value", ScaledNumericValue.class, null);
    }
}
