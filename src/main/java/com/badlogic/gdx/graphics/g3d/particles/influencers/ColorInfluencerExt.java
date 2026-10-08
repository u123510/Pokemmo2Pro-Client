package com.badlogic.gdx.graphics.g3d.particles.influencers;

import com.badlogic.gdx.graphics.g3d.particles.ParallelArray;
import com.badlogic.gdx.graphics.g3d.particles.ParticleChannels;
import com.badlogic.gdx.graphics.g3d.particles.ParticleChannelsExt;
import com.badlogic.gdx.graphics.g3d.particles.values.GradientColorValue;
import com.badlogic.gdx.graphics.g3d.particles.values.ScaledNumericValue;
import f.I2;
import f.LW;
import f.es_1;
import f.gp_1;
import f.h4_0;
import f.hk0_0;
import f.oe_0;

public abstract class ColorInfluencerExt extends Influencer {
    ParallelArray.FloatChannel colorChannel;

    @Override
    public void allocateChannels() {
        this.colorChannel = (ParallelArray.FloatChannel)this.controller.particles.addChannel(ParticleChannels.Color);
    }

    public static class RandomColor extends ColorInfluencer {
        ParallelArray.FloatChannel alphaInterpolationChannel;
        ParallelArray.FloatChannel lifeChannel;
        ParallelArray.IntChannel pathChannel;
        public es_1 alphaValues;
        public es_1 colorValues;

        public RandomColor() {
            this.colorValues = new es_1();
            this.alphaValues = new es_1();
            add();
        }

        public RandomColor(RandomColor source) {
            this.colorValues = new es_1();
            this.alphaValues = new es_1();
            set(source);
        }

        public final void add() {
            this.colorValues.Ue0(new GradientColorValue());
            ScaledNumericValue alpha = new ScaledNumericValue();
            alpha.setHigh(1.0f);
            this.alphaValues.Ue0(alpha);
        }

        public final void remove(int index) {
            if (index <= 0) return;
            this.colorValues.Tx0(index);
            this.alphaValues.Tx0(index);
        }

        public final void set(RandomColor source) {
            I2 colorIterator = source.colorValues.ZD();
            while (colorIterator.hasNext()) {
                GradientColorValue copy = new GradientColorValue();
                copy.load((GradientColorValue)colorIterator.next());
                this.colorValues.Ue0(copy);
            }
            I2 alphaIterator = source.alphaValues.ZD();
            while (alphaIterator.hasNext()) {
                ScaledNumericValue copy = new ScaledNumericValue();
                copy.load((ScaledNumericValue)alphaIterator.next());
                this.alphaValues.Ue0(copy);
            }
        }

        @Override
        public void allocateChannels() {
            super.allocateChannels();
            ParticleChannels.Interpolation.id = this.controller.particleChannels.newId();
            this.alphaInterpolationChannel = (ParallelArray.FloatChannel)this.controller.particles.addChannel(ParticleChannels.Interpolation);
            this.lifeChannel = (ParallelArray.FloatChannel)this.controller.particles.addChannel(ParticleChannels.Life);
            this.pathChannel = (ParallelArray.IntChannel)this.controller.particles.addChannel(ParticleChannelsExt.PathId);
        }

        @Override
        public void activateParticles(int startIndex, int count) {
            int colorIndex = startIndex * this.colorChannel.strideSize;
            int alphaInterpIndex = startIndex * this.alphaInterpolationChannel.strideSize;
            int lifeIndex = startIndex * this.lifeChannel.strideSize + ParticleChannels.LifePercentOffset;
            int pathIndex = startIndex * this.pathChannel.strideSize;
            int end = count * this.colorChannel.strideSize + colorIndex;
            while (colorIndex < end) {
                int path = (int)LW.Yu.nextLong(this.colorValues.KB);
                ScaledNumericValue alphaValue = (ScaledNumericValue)this.alphaValues.get(path);
                float start = alphaValue.newLowValue();
                float diff = alphaValue.newHighValue() - start;
                this.pathChannel.data[pathIndex] = path;
                ((GradientColorValue)this.colorValues.get(path)).getColor(0.0f, this.colorChannel.data, colorIndex);
                this.colorChannel.data[colorIndex + 3] = hk0_0.gb0(alphaValue, this.lifeChannel.data[lifeIndex], diff, start);
                this.alphaInterpolationChannel.data[alphaInterpIndex] = start;
                this.alphaInterpolationChannel.data[alphaInterpIndex + 1] = diff;
                colorIndex += this.colorChannel.strideSize;
                alphaInterpIndex += this.alphaInterpolationChannel.strideSize;
                lifeIndex += this.lifeChannel.strideSize;
                pathIndex += this.pathChannel.strideSize;
            }
        }

        @Override
        public void update() {
            int colorIndex = 0;
            int alphaInterpIndex = 0;
            int lifeIndex = ParticleChannels.LifePercentOffset;
            int pathIndex = 0;
            int end = this.controller.particles.size * this.colorChannel.strideSize;
            while (colorIndex < end) {
                float percent = this.lifeChannel.data[lifeIndex];
                int path = this.pathChannel.data[pathIndex];
                if (path >= this.alphaValues.KB) path = 0;
                ScaledNumericValue alphaValue = (ScaledNumericValue)this.alphaValues.get(path);
                ((GradientColorValue)this.colorValues.get(path)).getColor(percent, this.colorChannel.data, colorIndex);
                float start = this.alphaInterpolationChannel.data[alphaInterpIndex];
                float diff = this.alphaInterpolationChannel.data[alphaInterpIndex + 1];
                this.colorChannel.data[colorIndex + 3] = hk0_0.gb0(alphaValue, percent, diff, start);
                colorIndex += this.colorChannel.strideSize;
                alphaInterpIndex += this.alphaInterpolationChannel.strideSize;
                lifeIndex += this.lifeChannel.strideSize;
                pathIndex += this.pathChannel.strideSize;
            }
        }

        @Override
        public RandomColor copy() {
            return new RandomColor(this);
        }

        @Override
        public void write(gp_1 json) {
            json.v80(this.alphaValues, "alpha");
            json.v80(this.colorValues, "color");
        }

        @Override
        public void read(gp_1 json, oe_0 jsonData) {
            this.alphaValues = (es_1)h4_0.Lpt6(json, jsonData, "alpha", es_1.class, null);
            this.colorValues = (es_1)json.b20(es_1.class, null, jsonData.Is("color"));
        }
    }

    public static class AlphaOnly extends ColorInfluencer {
        ParallelArray.FloatChannel alphaInterpolationChannel;
        ParallelArray.FloatChannel lifeChannel;
        public ScaledNumericValue alphaValue;

        public AlphaOnly() {
            this.alphaValue = new ScaledNumericValue();
            this.alphaValue.setHigh(1.0f);
        }

        public AlphaOnly(AlphaOnly source) {
            this();
            set(source);
        }

        public void set(AlphaOnly source) {
            this.alphaValue.load(source.alphaValue);
        }

        @Override
        public void allocateChannels() {
            super.allocateChannels();
            ParticleChannels.Interpolation.id = this.controller.particleChannels.newId();
            this.alphaInterpolationChannel = (ParallelArray.FloatChannel)this.controller.particles.addChannel(ParticleChannels.Interpolation);
            this.lifeChannel = (ParallelArray.FloatChannel)this.controller.particles.addChannel(ParticleChannels.Life);
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
                float percent = this.lifeChannel.data[lifeIndex];
                float start = this.alphaInterpolationChannel.data[alphaInterpIndex];
                float diff = this.alphaInterpolationChannel.data[alphaInterpIndex + 1];
                this.colorChannel.data[colorIndex + 3] = hk0_0.gb0(this.alphaValue, percent, diff, start);
                colorIndex += this.colorChannel.strideSize;
                alphaInterpIndex += this.alphaInterpolationChannel.strideSize;
                lifeIndex += this.lifeChannel.strideSize;
            }
        }

        @Override
        public AlphaOnly copy() {
            return new AlphaOnly(this);
        }

        @Override
        public void write(gp_1 json) {
            json.v80(this.alphaValue, "alpha");
        }

        @Override
        public void read(gp_1 json, oe_0 jsonData) {
            this.alphaValue = (ScaledNumericValue)h4_0.Lpt6(json, jsonData, "alpha", ScaledNumericValue.class, null);
        }
    }
}
