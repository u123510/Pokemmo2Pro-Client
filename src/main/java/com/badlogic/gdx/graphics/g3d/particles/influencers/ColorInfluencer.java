package com.badlogic.gdx.graphics.g3d.particles.influencers;

import com.badlogic.gdx.graphics.g3d.particles.ParallelArray;
import com.badlogic.gdx.graphics.g3d.particles.ParticleChannels;
import com.badlogic.gdx.graphics.g3d.particles.values.GradientColorValue;
import com.badlogic.gdx.graphics.g3d.particles.values.ScaledNumericValue;
import f.LW;
import f.gp_1;
import f.h4_0;
import f.hk0_0;
import f.oe_0;

public abstract class ColorInfluencer extends Influencer {
    ParallelArray.FloatChannel colorChannel;

    @Override
    public void allocateChannels() {
        this.colorChannel = (ParallelArray.FloatChannel) this.controller.particles.addChannel(ParticleChannels.Color);
    }

    public static class Single extends ColorInfluencer {
        ParallelArray.FloatChannel alphaInterpolationChannel;
        ParallelArray.FloatChannel lifeChannel;
        public ScaledNumericValue alphaValue;
        public GradientColorValue colorValue;

        public Single() {
            this.colorValue = new GradientColorValue();
            this.alphaValue = new ScaledNumericValue();
            this.alphaValue.setHigh(1.0f);
        }

        public Single(Single single) {
            this();
            set(single);
        }

        public void set(Single single) {
            this.colorValue.load(single.colorValue);
            this.alphaValue.load(single.alphaValue);
        }

        @Override
        public void allocateChannels() {
            super.allocateChannels();
            ParticleChannels.Interpolation.id = this.controller.particleChannels.newId();
            this.alphaInterpolationChannel = (ParallelArray.FloatChannel) this.controller.particles.addChannel(ParticleChannels.Interpolation);
            this.lifeChannel = (ParallelArray.FloatChannel) this.controller.particles.addChannel(ParticleChannels.Life);
        }

        @Override
        public void activateParticles(int startIndex, int count) {
            int colorIndex = startIndex * this.colorChannel.strideSize;
            int alphaInterpIndex = startIndex * this.alphaInterpolationChannel.strideSize;
            int lifeIndex = startIndex * this.lifeChannel.strideSize + ParticleChannels.LifePercentOffset;
            int end = count * this.colorChannel.strideSize + colorIndex;
            while (colorIndex < end) {
                float start = this.alphaValue.newLowValue();
                float diff = this.alphaValue.newHighValue() - start;
                this.colorValue.getColor(0.0f, this.colorChannel.data, colorIndex);
                this.colorChannel.data[colorIndex + 3] = hk0_0.gb0(this.alphaValue, this.lifeChannel.data[lifeIndex], diff, start);
                this.alphaInterpolationChannel.data[alphaInterpIndex] = start;
                this.alphaInterpolationChannel.data[alphaInterpIndex + 1] = diff;
                colorIndex += this.colorChannel.strideSize;
                alphaInterpIndex += this.alphaInterpolationChannel.strideSize;
                lifeIndex += this.lifeChannel.strideSize;
            }
        }

        @Override
        public void update() {
            int colorIndex = 0;
            int alphaInterpIndex = 0;
            int lifeIndex = ParticleChannels.LifePercentOffset;
            int end = this.controller.particles.size * this.colorChannel.strideSize;
            while (colorIndex < end) {
                float lifePercent = this.lifeChannel.data[lifeIndex];
                this.colorValue.getColor(lifePercent, this.colorChannel.data, colorIndex);
                this.colorChannel.data[colorIndex + 3] = hk0_0.gb0(this.alphaValue, lifePercent,
                        this.alphaInterpolationChannel.data[alphaInterpIndex + 1],
                        this.alphaInterpolationChannel.data[alphaInterpIndex]);
                colorIndex += this.colorChannel.strideSize;
                alphaInterpIndex += this.alphaInterpolationChannel.strideSize;
                lifeIndex += this.lifeChannel.strideSize;
            }
        }

        @Override
        public Single copy() {
            return new Single(this);
        }

        @Override
        public void write(gp_1 json) {
            json.v80(this.alphaValue, "alpha");
            json.v80(this.colorValue, "color");
        }

        @Override
        public void read(gp_1 json, oe_0 jsonData) {
            this.alphaValue = (ScaledNumericValue) h4_0.Lpt6(json, jsonData, "alpha", ScaledNumericValue.class, null);
            this.colorValue = (GradientColorValue) json.b20(GradientColorValue.class, null, jsonData.Is("color"));
        }
    }

    public static class Random extends ColorInfluencer {
        ParallelArray.FloatChannel colorChannel;

        public Random() {
        }

        @Override
        public void allocateChannels() {
            this.colorChannel = (ParallelArray.FloatChannel) this.controller.particles.addChannel(ParticleChannels.Color);
        }

        @Override
        public void activateParticles(int startIndex, int count) {
            int colorIndex = startIndex * this.colorChannel.strideSize;
            int end = count * this.colorChannel.strideSize + colorIndex;
            while (colorIndex < end) {
                this.colorChannel.data[colorIndex] = LW.Yu.nextFloat();
                this.colorChannel.data[colorIndex + 1] = LW.Yu.nextFloat();
                this.colorChannel.data[colorIndex + 2] = LW.Yu.nextFloat();
                this.colorChannel.data[colorIndex + 3] = LW.Yu.nextFloat();
                colorIndex += this.colorChannel.strideSize;
            }
        }

        @Override
        public Random copy() {
            return new Random();
        }
    }
}
