package com.badlogic.gdx.graphics.g3d.particles;

import aurelienribon.tweenengine.equations.Sine;
import com.badlogic.gdx.graphics.g3d.particles.ParallelArray.ChannelDescriptor;
import com.badlogic.gdx.graphics.g3d.particles.ParallelArray.FloatChannel;
import com.badlogic.gdx.graphics.g3d.particles.ParallelArray.IntChannel;
import com.badlogic.gdx.graphics.g3d.particles.batches.BillboardParticleBatchExt;
import com.badlogic.gdx.graphics.g3d.particles.emitters.Emitter;
import com.badlogic.gdx.graphics.g3d.particles.emitters.RegularEmitter;
import com.badlogic.gdx.graphics.g3d.particles.influencers.DynamicsModifier;
import com.badlogic.gdx.graphics.g3d.particles.renderers.BillboardRendererExt;
import com.badlogic.gdx.graphics.g3d.particles.values.NumericValue;
import com.badlogic.gdx.graphics.g3d.particles.values.ScaledNumericValue;
import com.badlogic.gdx.graphics.g3d.particles.values.ScaledNumericValueExt;
import f.Bp0;
import f.C8;
import f.Cq0;
import f.I2;
import f.L90;
import f.LW;
import f.ML;
import f.O00;
import f.T3;
import f.Tv0;
import f.ah_1;
import f.bm0_1;
import f.cf_2;
import f.co_1;
import f.dl_1;
import f.es_1;
import f.gp_1;
import f.h4_0;
import f.hk0_0;
import f.in_2;
import f.nf_1;
import f.oe_0;
import f.ri_0;
import f.tl_0;
import f.tx_2;
import java.util.Random;

public class DynamicsModifierExt {
    protected static final dl_1 log = Cq0.E1(DynamicsModifierExt.class);

    public DynamicsModifierExt() {
    }

    public static abstract class AngularExt extends DynamicsModifier.Strength {
        protected FloatChannel angularChannel;
        public ScaledNumericValue thetaValue;
        public ScaledNumericValue phiValue;

        public AngularExt() {
            super();
            this.thetaValue = new ScaledNumericValue();
            this.phiValue = new ScaledNumericValue();
        }

        public AngularExt(AngularExt source) {
            super(source);
            this.thetaValue = new ScaledNumericValue();
            this.phiValue = new ScaledNumericValue();
            this.thetaValue.load(source.thetaValue);
            this.phiValue.load(source.phiValue);
        }

        @Override
        public void allocateChannels() {
            super.allocateChannels();
            ChannelDescriptor desc = ParticleChannels.Interpolation4;
            desc.id = this.controller.particleChannels.newId();
            this.angularChannel = (FloatChannel) this.controller.particles.addChannel(desc);
        }

        @Override
        public void activateParticles(int startIndex, int count) {
            super.activateParticles(startIndex, count);
            int stride = this.angularChannel.strideSize;
            int i = startIndex * stride;
            int end = i + count * stride;
            while (i < end) {
                float thetaLow = this.thetaValue.newLowValue();
                float thetaHigh = this.thetaValue.newHighValue();
                if (!this.thetaValue.isRelative()) {
                    thetaHigh -= thetaLow;
                }
                this.angularChannel.data[i] = thetaLow;
                this.angularChannel.data[i + 1] = thetaHigh;

                float phiLow = this.phiValue.newLowValue();
                float phiHigh = this.phiValue.newHighValue();
                if (!this.phiValue.isRelative()) {
                    phiHigh -= phiLow;
                }
                this.angularChannel.data[i + 2] = phiLow;
                this.angularChannel.data[i + 3] = phiHigh;
                i += this.angularChannel.strideSize;
            }
        }

        @Override
        public void write(gp_1 json) {
            super.write(json);
            json.v80(this.thetaValue, "thetaValue");
            json.v80(this.phiValue, "phiValue");
        }

        @Override
        public void read(gp_1 json, oe_0 jsonData) {
            super.read(json, jsonData);
            this.thetaValue = (ScaledNumericValue) h4_0.Lpt6(json, jsonData, "thetaValue", ScaledNumericValue.class, null);
            this.phiValue = (ScaledNumericValue) json.b20(ScaledNumericValue.class, null, jsonData.Is("phiValue"));
        }
    }

    public static class PolarAccelerationExt extends DynamicsModifier.Angular {
        FloatChannel accellerationChannel;
        FloatChannel previousPositionChannel;
        FloatChannel positionChannel;
        private FloatChannel stopForces;
        public boolean velocity = true;
        public C8 dir = new C8();
        private C8 dirMove = new C8();

        public PolarAccelerationExt() {
            super();
            this.velocity = true;
            this.dir = new C8();
            this.dirMove = new C8();
        }

        public PolarAccelerationExt(PolarAccelerationExt source) {
            super(source);
            this.velocity = true;
            this.dir = new C8();
            this.dirMove = new C8();
            this.velocity = source.velocity;
            this.dir.np(source.dir);
        }

        @Override
        public void allocateChannels() {
            super.allocateChannels();
            this.accellerationChannel = (FloatChannel) this.controller.particles.addChannel(ParticleChannels.Acceleration);
            this.previousPositionChannel = (FloatChannel) this.controller.particles.addChannel(ParticleChannels.PreviousPosition);
            this.positionChannel = (FloatChannel) this.controller.particles.addChannel(ParticleChannels.Position);
            ChannelDescriptor desc = ParticleChannels.Interpolation;
            desc.id = this.controller.particleChannels.newId();
            this.stopForces = (FloatChannel) this.controller.particles.addChannel(desc);
        }

        @Override
        public void init() {
            super.init();
            if (co_1.RC0.equals(co_1.Xh) || co_1.RC0 == ri_0.w8) {
                this.dirMove.np(this.dir);
            } else {
                switch (co_1.RC0) {
                    case xQ:
                        float f4 = (this.dir.x > 0.0f) ? this.dir.x : this.dir.z;
                        this.dirMove.np(co_1.Kl0);
                        this.dirMove.Vy(co_1.cOm6.x, co_1.cOm6.y, co_1.cOm6.z).KM().hn0(f4, 1.0f, f4).hn0(1.5f, 1.0f, 1.5f);
                        break;
                    case pN:
                        float f4_2 = (this.dir.x > 0.0f) ? this.dir.x : this.dir.z;
                        this.dirMove.np(co_1.cOm6);
                        this.dirMove.Vy(co_1.Kl0.x, co_1.Kl0.y, co_1.Kl0.z).KM().hn0(f4_2, 1.0f, f4_2).hn0(1.5f, 1.0f, 1.5f);
                        break;
                }
            }
        }

        @Override
        public void activateParticles(int startIndex, int count) {
            super.activateParticles(startIndex, count);
            int stride = this.stopForces.strideSize;
            int i = startIndex * stride;
            int end = i + count * stride;
            while (i < end) {
                this.stopForces.data[i] = 0.0f;
                i += this.stopForces.strideSize;
            }
        }

        @Override
        public void update() {
            int i1 = 0;
            int i2 = 2;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            int size = this.controller.particles.size * this.accellerationChannel.strideSize;
            while (i1 < size) {
                float stop = this.stopForces.data[i5];
                float life = this.lifeChannel.data[i2];
                float s1 = this.strengthChannel.data[i3];
                float s2 = this.strengthChannel.data[i3 + 1];
                float strength = hk0_0.gb0(this.strengthValue, life, s2, s1);
                if (this.strengthValue.isRelative()) {
                    strength = hk0_0.gb0(this.strengthValue, life, this.strengthValue.getHighMax(), this.strengthValue.getLowMax());
                }
                if (stop != 1.0f) {
                    float phi1 = this.angularChannel.data[i4 + 2];
                    float phi2 = this.angularChannel.data[i4 + 3];
                    float phi = hk0_0.gb0(this.phiValue, life, phi2, phi1);

                    float theta1 = this.angularChannel.data[i4];
                    float theta2 = this.angularChannel.data[i4 + 1];
                    float theta = hk0_0.gb0(this.thetaValue, life, theta2, theta1);

                    float cosTheta = LW.gc0(theta);
                    float sinTheta = LW.Om(theta);
                    float cosPhi = LW.gc0(phi);
                    float sinPhi = LW.Om(phi);

                    if (this.dirMove.eG()) {
                        TMP_V3.x = cosTheta * sinPhi;
                        TMP_V3.y = cosPhi;
                        TMP_V3.z = sinTheta * sinPhi;
                        TMP_V3.KM().Fg0(strength);
                    } else {
                        TMP_V3.np(this.dirMove).Fg0(strength);
                    }

                    this.accellerationChannel.data[i1] += TMP_V3.x;
                    this.accellerationChannel.data[i1 + 1] += TMP_V3.y;
                    this.accellerationChannel.data[i1 + 2] += TMP_V3.z;
                }

                i3 += this.strengthChannel.strideSize;
                i1 += this.accellerationChannel.strideSize;
                i4 += this.angularChannel.strideSize;
                i2 += this.lifeChannel.strideSize;
                i5 += this.stopForces.strideSize;
            }
        }

        @Override
        public PolarAccelerationExt copy() {
            return new PolarAccelerationExt(this);
        }

        @Override
        public void write(gp_1 json) {
            super.write(json);
            json.v80(this.dir, "dir");
        }

        @Override
        public void read(gp_1 json, oe_0 jsonData) {
            super.read(json, jsonData);
            if (jsonData.UJ0("dir")) {
                this.dir = (C8) h4_0.Lpt6(json, jsonData, "dir", C8.class, null);
            }
        }
    }

    public static class CentripetalAccelerationExt extends DynamicsModifier.Strength {
        FloatChannel accelerationChannel;
        FloatChannel positionChannel;
        FloatChannel prevPositionChannel;
        FloatChannel stopForces;

        public CentripetalAccelerationExt() {
            super();
        }

        public CentripetalAccelerationExt(CentripetalAccelerationExt source) {
            super(source);
        }

        @Override
        public void allocateChannels() {
            super.allocateChannels();
            this.accelerationChannel = (FloatChannel) this.controller.particles.addChannel(ParticleChannels.Acceleration);
            this.positionChannel = (FloatChannel) this.controller.particles.addChannel(ParticleChannels.Position);
            this.prevPositionChannel = (FloatChannel) this.controller.particles.addChannel(ParticleChannels.PreviousPosition);
            ChannelDescriptor desc = ParticleChannels.Interpolation;
            desc.id = this.controller.particleChannels.newId();
            this.stopForces = (FloatChannel) this.controller.particles.addChannel(desc);
        }

        @Override
        public void activateParticles(int startIndex, int count) {
            super.activateParticles(startIndex, count);
            int stride = this.stopForces.strideSize;
            int i = startIndex * stride;
            int end = i + count * stride;
            while (i < end) {
                this.stopForces.data[i] = 0.0f;
                i += this.stopForces.strideSize;
            }
        }

        @Override
        public void update() {
            float ox = 0.0f;
            float oy = 0.0f;
            float oz = 0.0f;
            if (!this.isGlobal) {
                float[] val = this.controller.transform.EW;
                ox = val[12];
                oy = val[13];
                oz = val[14];
            }
            int i4 = 2;
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            int count = this.controller.particles.size;
            for (int i9 = 0; i9 < count; i9++) {
                if (this.stopForces.data[i8] != 1.0f) {
                    float life = this.lifeChannel.data[i4];
                    float s1 = this.strengthChannel.data[i5];
                    float s2 = this.strengthChannel.data[i5 + 1];
                    float strength = hk0_0.gb0(this.strengthValue, life, s2, s1);

                    TMP_V3.x = this.positionChannel.data[i6] - ox;
                    TMP_V3.y = this.positionChannel.data[i6 + 1] - oy;
                    TMP_V3.z = this.positionChannel.data[i6 + 2] - oz;
                    TMP_V3.KM().Fg0(strength);

                    this.accelerationChannel.data[i7] += TMP_V3.x;
                    this.accelerationChannel.data[i7 + 1] += TMP_V3.y;
                    this.accelerationChannel.data[i7 + 2] += TMP_V3.z;
                }

                i6 += this.positionChannel.strideSize;
                i5 += this.strengthChannel.strideSize;
                i7 += this.accelerationChannel.strideSize;
                i4 += this.lifeChannel.strideSize;
                i8 += this.stopForces.strideSize;
            }
        }

        @Override
        public CentripetalAccelerationExt copy() {
            return new CentripetalAccelerationExt(this);
        }
    }

    public static class RandomInitialRotation extends DynamicsModifier.Strength {
        FloatChannel rotationalVelocity2dChannel;
        FloatChannel rotationChannel;

        public RandomInitialRotation() {
            super();
        }

        public RandomInitialRotation(RandomInitialRotation source) {
            super(source);
        }

        @Override
        public void dispose() {
            super.dispose();
        }

        @Override
        public void allocateChannels() {
            super.allocateChannels();
            this.rotationalVelocity2dChannel = (FloatChannel) this.controller.particles.addChannel(ParticleChannels.AngularVelocity2D);
            this.rotationChannel = (FloatChannel) this.controller.particles.addChannel(ParticleChannels.Rotation2D);
        }

        @Override
        public void activateParticles(int startIndex, int count) {
            super.activateParticles(startIndex, count);
            for (int i = startIndex; i < startIndex + count; i++) {
                float low = this.strengthValue.newLowValue();
                float rad = low * 0.0174532924F;
                int offset = i * this.rotationChannel.strideSize;
                this.rotationChannel.data[offset] = LW.Fm0(rad);
                this.rotationChannel.data[offset + 1] = LW.Po0(rad);
            }
        }

        @Override
        public void update() {
            super.update();
        }

        @Override
        public RandomInitialRotation copy() {
            return new RandomInitialRotation(this);
        }

        @Override
        public void write(gp_1 json) {
            super.write(json);
        }

        @Override
        public void read(gp_1 json, oe_0 jsonData) {
            super.read(json, jsonData);
        }
    }

    public static class CircuralMotion extends DynamicsModifier.Angular {
        private static final C8 origin = new C8();
        private static final Bp0 tmp = new Bp0();
        FloatChannel accelerationChannel;
        FloatChannel positionChannel;
        FloatChannel prevPositionChannel;
        FloatChannel angleChannel;
        public int type = 0;
        in_2 flood = new in_2(1000);

        public CircuralMotion() {
            super();
            this.type = 0;
            this.flood = new in_2(1000);
        }

        public CircuralMotion(CircuralMotion source) {
            super(source);
            this.type = 0;
            this.flood = new in_2(1000);
            this.type = source.type;
        }

        @Override
        public void allocateChannels() {
            super.allocateChannels();
            this.positionChannel = (FloatChannel) this.controller.particles.addChannel(ParticleChannels.Position);
            this.prevPositionChannel = (FloatChannel) this.controller.particles.addChannel(ParticleChannels.PreviousPosition);
            this.accelerationChannel = (FloatChannel) this.controller.particles.addChannel(ParticleChannels.Acceleration);
            ChannelDescriptor desc = ParticleChannels.Interpolation4;
            desc.id = this.controller.particleChannels.newId();
            this.angleChannel = (FloatChannel) this.controller.particles.addChannel(desc);
        }

        @Override
        public void activateParticles(int startIndex, int count) {
            super.activateParticles(startIndex, count);
            this.controller.transform.V1(origin);
            int strideAngle = this.angleChannel.strideSize;
            int stridePos = this.positionChannel.strideSize;
            int i2 = startIndex * strideAngle;
            int i3 = startIndex * stridePos;
            int end = startIndex + count;
            for (int i1 = startIndex; i1 < end; i1++) {
                TMP_V3.x = this.positionChannel.data[i3];
                TMP_V3.y = this.positionChannel.data[i3 + 1];
                TMP_V3.z = this.positionChannel.data[i3 + 2];
                TMP_V1.x = TMP_V3.x;
                TMP_V1.y = TMP_V3.y;
                TMP_V1.z = TMP_V3.z;
                TMP_V3.Vy(origin.x, origin.y, origin.z);
                if (this.type == 1) {
                    tmp.x = TMP_V3.x;
                    tmp.y = TMP_V3.y;
                } else if (this.type == 2) {
                    tmp.x = TMP_V3.y;
                    tmp.y = TMP_V3.z;
                } else {
                    tmp.x = TMP_V3.x;
                    tmp.y = TMP_V3.z;
                }
                float angle = (float) Math.atan2(tmp.y, tmp.x) * 57.2957763672F;
                if (angle < 0.0f) {
                    angle += 360.0f;
                }
                float dist = TMP_V1.SH0(origin);
                this.angleChannel.data[i2] = angle;
                this.angleChannel.data[i2 + 1] = dist;
                LW.Fm0(angle);
                LW.Po0(angle);
                i3 += stridePos;
                i2 += strideAngle;
            }
        }

        @Override
        public void update() {
            this.controller.transform.V1(origin);
            int i1 = 2;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            int i7 = 0;
            int count = this.controller.particles.size;
            for (int i6 = 0; i6 < count; i6++) {
                float life = this.lifeChannel.data[i1];
                float s1 = this.strengthChannel.data[i2];
                float s2 = this.strengthChannel.data[i2 + 1];
                float strength = hk0_0.gb0(this.strengthValue, life, s2, s1);

                TMP_V3.x = this.positionChannel.data[i7];
                TMP_V3.y = this.positionChannel.data[i7 + 1];
                TMP_V3.z = this.positionChannel.data[i7 + 2];
                TMP_V3.y = origin.y;

                float angle = (this.angleChannel.data[i4] + strength) % 360.0f;
                float a1 = this.angularChannel.data[i5];
                float a2 = this.angularChannel.data[i5 + 1];
                float theta = hk0_0.gb0(this.thetaValue, life, a2, a1);
                float radius = this.angleChannel.data[i4 + 1] + theta;
                float rad = angle * 0.0174532924F;
                float cosR = LW.Fm0(rad) * radius;
                float sinR = LW.Po0(rad) * radius;

                if (this.type == 1) {
                    this.positionChannel.data[i7] = origin.x + cosR;
                    this.positionChannel.data[i7 + 1] = origin.y + sinR;
                    this.prevPositionChannel.data[i3] = origin.x + cosR;
                    this.prevPositionChannel.data[i3 + 1] = origin.y + sinR;
                } else if (this.type == 2) {
                    this.positionChannel.data[i7 + 1] = origin.y + cosR;
                    this.positionChannel.data[i7 + 2] = origin.z + sinR;
                    this.prevPositionChannel.data[i3 + 1] = origin.y + cosR;
                    this.prevPositionChannel.data[i3 + 2] = origin.z + sinR;
                } else {
                    this.positionChannel.data[i7] = origin.x + cosR;
                    this.positionChannel.data[i7 + 2] = origin.z + sinR;
                    this.prevPositionChannel.data[i3] = origin.x + cosR;
                    this.prevPositionChannel.data[i3 + 2] = origin.z + sinR;
                }

                i7 += this.positionChannel.strideSize;
                i3 += this.prevPositionChannel.strideSize;
                i2 += this.strengthChannel.strideSize;
                i4 += this.angleChannel.strideSize;
                i5 += this.angularChannel.strideSize;
                i1 += this.lifeChannel.strideSize;
            }
        }

        @Override
        public void write(gp_1 json) {
            super.write(json);
            json.v80(Integer.valueOf(this.type), "type");
        }

        @Override
        public void read(gp_1 json, oe_0 jsonData) {
            super.read(json, jsonData);
            this.type = ((Integer) h4_0.Lpt6(json, jsonData, "type", Integer.class, null)).intValue();
        }

        @Override
        public CircuralMotion copy() {
            return new CircuralMotion(this);
        }
    }

    public static class CircuralModifier extends DynamicsModifier.Strength {
        FloatChannel accelerationChannel;
        FloatChannel positionChannel;
        public ScaledNumericValueExt radiusValue;
        public int type = 0;
        float degree = 0.0f;

        public CircuralModifier() {
            super();
            this.type = 0;
            this.degree = 0.0f;
            this.radiusValue = new ScaledNumericValueExt();
            this.radiusValue.setHigh(0.75f);
            this.strengthValue.setHigh(360.0f);
            this.strengthValue.setScaling(new float[]{0.0f, 1.0f});
            this.strengthValue.setTimeline(new float[]{0.0f, 1.0f});
        }

        public CircuralModifier(CircuralModifier source) {
            super(source);
            this.type = 0;
            this.degree = 0.0f;
            this.radiusValue = new ScaledNumericValueExt();
            this.radiusValue.load(source.radiusValue);
            this.type = source.type;
        }

        @Override
        public void dispose() {
            super.dispose();
        }

        @Override
        public void allocateChannels() {
            super.allocateChannels();
            this.accelerationChannel = (FloatChannel) this.controller.particles.addChannel(ParticleChannels.Acceleration);
            this.positionChannel = (FloatChannel) this.controller.particles.addChannel(ParticleChannels.Position);
        }

        @Override
        public void activateParticles(int startIndex, int count) {
            super.activateParticles(startIndex, count);
        }

        @Override
        public void update() {
            float ox = 0.0f;
            float oy = 0.0f;
            float oz = 0.0f;
            if (!this.isGlobal) {
                float[] val = this.controller.transform.EW;
                ox = val[12];
                oy = val[13];
                oz = val[14];
            }
            float low = this.radiusValue.newLowValue();
            float high = this.radiusValue.newHighValue();
            if (!this.radiusValue.isRelative()) {
                high -= low;
            }
            int i4 = 2;
            int i6 = 0;
            int i7 = 0;
            int count = this.controller.particles.size;
            for (int i8 = 0; i8 < count; i8++) {
                float life = this.lifeChannel.data[i4];
                float s1 = this.strengthChannel.data[i6];
                float s2 = this.strengthChannel.data[i6 + 1];
                float strength = hk0_0.gb0(this.strengthValue, life, s2, s1);
                float scale = this.radiusValue.getScale(life);
                if (this.strengthValue.isRelative()) {
                    strength += ((float) i8) * (360.0f / (float) this.controller.emitter.maxParticleCount);
                }
                float rad = strength * 0.0174532924F;
                float cosR = LW.Fm0(rad) * high * scale;
                float sinR = LW.Po0(rad) * high * scale;
                if (this.type == 1) {
                    this.positionChannel.data[i7] = ox + cosR;
                    this.positionChannel.data[i7 + 1] = oy + sinR;
                } else if (this.type == 2) {
                    this.positionChannel.data[i7 + 1] = oy + cosR;
                    this.positionChannel.data[i7 + 2] = oz + sinR;
                } else {
                    this.positionChannel.data[i7] = ox + cosR;
                    this.positionChannel.data[i7 + 2] = oz + sinR;
                }

                i7 += this.positionChannel.strideSize;
                i6 += this.strengthChannel.strideSize;
                i4 += this.lifeChannel.strideSize;
            }
        }

        @Override
        public void write(gp_1 json) {
            super.write(json);
            json.v80(this.radiusValue, "radiusValue");
            json.v80(Integer.valueOf(this.type), "type");
        }

        @Override
        public void read(gp_1 json, oe_0 jsonData) {
            super.read(json, jsonData);
            this.radiusValue = (ScaledNumericValueExt) h4_0.Lpt6(json, jsonData, "radiusValue", ScaledNumericValueExt.class, null);
            if (jsonData.UJ0("type")) {
                this.type = ((Integer) json.b20(Integer.class, null, jsonData.Is("type"))).intValue();
            }
        }

        @Override
        public CircuralModifier copy() {
            return new CircuralModifier(this);
        }
    }

    public static class CircularAcceleration extends DynamicsModifier.Angular {
        FloatChannel positionChannel;
        FloatChannel previousPositionChannel;
        FloatChannel accelerationChannel;

        public CircularAcceleration() {
            super();
        }

        public CircularAcceleration(CircularAcceleration source) {
            super(source);
        }

        @Override
        public void allocateChannels() {
            super.allocateChannels();
            this.positionChannel = (FloatChannel) this.controller.particles.addChannel(ParticleChannels.Position);
            this.previousPositionChannel = (FloatChannel) this.controller.particles.addChannel(ParticleChannels.PreviousPosition);
            this.accelerationChannel = (FloatChannel) this.controller.particles.addChannel(ParticleChannels.Acceleration);
        }

        @Override
        public void activateParticles(int startIndex, int count) {
            super.activateParticles(startIndex, count);
            for (int i3 = startIndex; i3 < startIndex + count; i3++) {
                int i4 = i3 * this.strengthChannel.strideSize;
                int i6 = i3 * this.lifeChannel.strideSize;
                int i7 = i3 * this.angularChannel.strideSize;
                int i5 = i3 * this.positionChannel.strideSize;
                int i8 = i3 * this.previousPositionChannel.strideSize;

                float life = this.lifeChannel.data[i6 + 2];
                float s1 = this.strengthChannel.data[i4];
                float s2 = this.strengthChannel.data[i4 + 1];
                float strength = hk0_0.gb0(this.strengthValue, life, s2, s1);

                float p1 = this.angularChannel.data[i7 + 2];
                float p2 = this.angularChannel.data[i7 + 3];
                float phi = hk0_0.gb0(this.phiValue, life, p2, p1);

                float t1 = this.angularChannel.data[i7];
                float t2 = this.angularChannel.data[i7 + 1];
                float theta = hk0_0.gb0(this.thetaValue, life, t2, t1);

                float cosTheta = LW.gc0(theta);
                float sinTheta = LW.Om(theta);
                float cosPhi = LW.gc0(phi);
                float sinPhi = LW.Om(phi);

                TMP_V1.x = this.positionChannel.data[i5];
                TMP_V1.y = this.positionChannel.data[i5 + 1];
                TMP_V1.z = this.positionChannel.data[i5 + 2];

                TMP_V3.x = cosTheta * sinPhi;
                TMP_V3.y = cosPhi;
                TMP_V3.z = sinTheta * sinPhi;

                if (!this.isGlobal) {
                    TMP_Q.et0(true, this.controller.transform);
                    TMP_V1.bm0(TMP_Q);
                    this.controller.transform.V1(ParticleControllerComponent.TMP_V5);
                    TMP_V1.Vy(ParticleControllerComponent.TMP_V5.x, ParticleControllerComponent.TMP_V5.y, ParticleControllerComponent.TMP_V5.z);
                }

                ParticleControllerComponent.TMP_V4.x = TMP_V3.x;
                ParticleControllerComponent.TMP_V4.y = TMP_V3.y;
                ParticleControllerComponent.TMP_V4.z = TMP_V3.z;
                TMP_V1.Xv0(ParticleControllerComponent.TMP_V4);

                ParticleControllerComponent.TMP_V5.x = TMP_V3.x;
                ParticleControllerComponent.TMP_V5.y = TMP_V3.y;
                ParticleControllerComponent.TMP_V5.z = TMP_V3.z;
                ParticleControllerComponent.TMP_V5.Fg0(TMP_V1.S60(TMP_V3));

                ParticleControllerComponent.TMP_V6.x = ParticleControllerComponent.TMP_V5.x;
                ParticleControllerComponent.TMP_V6.y = ParticleControllerComponent.TMP_V5.y;
                ParticleControllerComponent.TMP_V6.z = ParticleControllerComponent.TMP_V5.z;
                TMP_V1.Vy(ParticleControllerComponent.TMP_V6.x, ParticleControllerComponent.TMP_V6.y, ParticleControllerComponent.TMP_V6.z);

                float len = ParticleControllerComponent.TMP_V6.Am0();
                if (len > 0.0f) {
                    float a = (strength * strength) / len;
                    ParticleControllerComponent.TMP_V4.KM().Fg0(strength * this.controller.deltaTime);
                    ParticleControllerComponent.TMP_V6.KM().Fg0((float) (a * 0.5D * (double) this.controller.deltaTimeSqr));

                    this.previousPositionChannel.data[i8] -= ParticleControllerComponent.TMP_V4.x + ParticleControllerComponent.TMP_V6.x;
                    this.previousPositionChannel.data[i8 + 1] -= ParticleControllerComponent.TMP_V4.y + ParticleControllerComponent.TMP_V6.y;
                    this.previousPositionChannel.data[i8 + 2] -= ParticleControllerComponent.TMP_V4.z + ParticleControllerComponent.TMP_V6.z;
                }
            }
        }

        @Override
        public void update() {
            int i1 = 0;
            int i2 = 2;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            int size = this.controller.particles.size * this.accelerationChannel.strideSize;
            while (i1 < size) {
                float life = this.lifeChannel.data[i2];
                float s1 = this.strengthChannel.data[i3];
                float s2 = this.strengthChannel.data[i3 + 1];
                float strength = hk0_0.gb0(this.strengthValue, life, s2, s1);

                float p1 = this.angularChannel.data[i4 + 2];
                float p2 = this.angularChannel.data[i4 + 3];
                float phi = hk0_0.gb0(this.phiValue, life, p2, p1);

                float t1 = this.angularChannel.data[i4];
                float t2 = this.angularChannel.data[i4 + 1];
                float theta = hk0_0.gb0(this.thetaValue, life, t2, t1);

                float cosTheta = LW.gc0(theta);
                float sinTheta = LW.Om(theta);
                float cosPhi = LW.gc0(phi);
                float sinPhi = LW.Om(phi);

                TMP_V3.x = cosTheta * sinPhi;
                TMP_V3.y = cosPhi;
                TMP_V3.z = sinTheta * sinPhi;

                TMP_V1.x = this.positionChannel.data[i5];
                TMP_V1.y = this.positionChannel.data[i5 + 1];
                TMP_V1.z = this.positionChannel.data[i5 + 2];

                if (!this.isGlobal) {
                    this.controller.transform.V1(TMP_V2);
                    TMP_V1.Vy(TMP_V2.x, TMP_V2.y, TMP_V2.z);
                    TMP_Q.et0(true, this.controller.transform);
                    TMP_V1.bm0(TMP_Q);
                }

                ParticleControllerComponent.TMP_V4.x = TMP_V3.x;
                ParticleControllerComponent.TMP_V4.y = TMP_V3.y;
                ParticleControllerComponent.TMP_V4.z = TMP_V3.z;
                TMP_V1.Xv0(ParticleControllerComponent.TMP_V4);

                ParticleControllerComponent.TMP_V5.x = TMP_V3.x;
                ParticleControllerComponent.TMP_V5.y = TMP_V3.y;
                ParticleControllerComponent.TMP_V5.z = TMP_V3.z;
                ParticleControllerComponent.TMP_V5.Fg0(TMP_V1.S60(TMP_V3));

                ParticleControllerComponent.TMP_V6.x = ParticleControllerComponent.TMP_V5.x;
                ParticleControllerComponent.TMP_V6.y = ParticleControllerComponent.TMP_V5.y;
                ParticleControllerComponent.TMP_V6.z = ParticleControllerComponent.TMP_V5.z;
                TMP_V1.Vy(ParticleControllerComponent.TMP_V6.x, ParticleControllerComponent.TMP_V6.y, ParticleControllerComponent.TMP_V6.z);

                float len = ParticleControllerComponent.TMP_V6.Am0();
                if (len > 0.0f) {
                    ParticleControllerComponent.TMP_V6.KM().Fg0((strength * strength) / len);
                    this.accelerationChannel.data[i1] += ParticleControllerComponent.TMP_V6.x;
                    this.accelerationChannel.data[i1 + 1] += ParticleControllerComponent.TMP_V6.y;
                    this.accelerationChannel.data[i1 + 2] += ParticleControllerComponent.TMP_V6.z;
                }

                i3 += this.strengthChannel.strideSize;
                i1 += this.accelerationChannel.strideSize;
                i4 += this.angularChannel.strideSize;
                i2 += this.lifeChannel.strideSize;
                i5 += this.positionChannel.strideSize;
            }
        }

        @Override
        public CircularAcceleration copy() {
            return new CircularAcceleration(this);
        }
    }

    public static class FaceModifier extends DynamicsModifier.Strength {
        FloatChannel rotationChannel;
        FloatChannel accellerationChannel;
        public float rotateMod = 1.0f;
        public int type = 0;

        public FaceModifier() {
            super();
            this.rotateMod = 1.0f;
            this.type = 0;
        }

        public FaceModifier(FaceModifier source) {
            super(source);
            this.rotateMod = 1.0f;
            this.type = 0;
            this.type = source.type;
            this.rotateMod = source.rotateMod;
        }

        @Override
        public void allocateChannels() {
            super.allocateChannels();
            this.rotationChannel = (FloatChannel) this.controller.particles.addChannel(ParticleChannels.Rotation2D);
            this.accellerationChannel = (FloatChannel) this.controller.particles.addChannel(ParticleChannels.Acceleration);
        }

        @Override
        public void update() {
            int i1 = 0;
            int i2 = 0;
            int size = this.controller.particles.size * this.rotationChannel.strideSize;
            while (i1 < size) {
                TMP_V1.x = this.accellerationChannel.data[i2];
                TMP_V1.y = this.accellerationChannel.data[i2 + 1];
                TMP_V1.z = this.accellerationChannel.data[i2 + 2];
                C8 v5 = TMP_V1.KM();

                TMP_V2.np(TMP_V1).Xv0(C8.Y).KM().Xv0(TMP_V1).KM();
                TMP_V3.x = TMP_V2.x;
                TMP_V3.y = TMP_V2.y;
                TMP_V3.z = TMP_V2.z;
                v5.Xv0(TMP_V3).KM();

                float[] val = this.controller.transform.EW;
                ParticleControllerComponent.TMP_V4.x = val[12];
                ParticleControllerComponent.TMP_V4.y = val[13];
                ParticleControllerComponent.TMP_V4.z = val[14];

                ParticleControllerComponent.TMP_V6.x = this.accellerationChannel.data[i2];
                ParticleControllerComponent.TMP_V6.y = this.accellerationChannel.data[i2 + 1];
                ParticleControllerComponent.TMP_V6.z = this.accellerationChannel.data[i2 + 2];
                ParticleControllerComponent.TMP_V6.Fg0(1000.0f);

                float angle = 0.0f;
                if (this.type == 1) {
                    angle = (LW.mS(ParticleControllerComponent.TMP_V4.z - ParticleControllerComponent.TMP_V6.z,
                            ParticleControllerComponent.TMP_V4.x - ParticleControllerComponent.TMP_V6.x) * 180.0f / 3.141592741F) + 90.0f;
                } else if (this.type == 0) {
                    angle = LW.mS(ParticleControllerComponent.TMP_V4.x - ParticleControllerComponent.TMP_V6.x,
                            ParticleControllerComponent.TMP_V4.y - ParticleControllerComponent.TMP_V6.y) * 180.0f / 3.141592741F;
                }

                float rad = (angle * this.rotateMod + 180.0f) * 0.0174532924F;
                this.rotationChannel.data[i1] = LW.Fm0(rad);
                this.rotationChannel.data[i1 + 1] = LW.Po0(rad);

                i1 += this.rotationChannel.strideSize;
                i2 += this.accellerationChannel.strideSize;
            }
        }

        @Override
        public FaceModifier copy() {
            return new FaceModifier(this);
        }

        @Override
        public void write(gp_1 json) {
            super.write(json);
            json.sg(Float.class, Float.valueOf(this.rotateMod), "angle");
            json.sg(Integer.class, Integer.valueOf(this.type), "type");
        }

        @Override
        public void read(gp_1 json, oe_0 jsonData) {
            super.read(json, jsonData);
            this.rotateMod = ((Float) h4_0.Lpt6(json, jsonData, "angle", Float.class, null)).floatValue();
            if (jsonData.UJ0("type")) {
                this.type = ((Integer) json.b20(Integer.class, null, jsonData.Is("type"))).intValue();
            }
        }
    }

    public static class Rotational2DStatic extends DynamicsModifier.Strength {
        FloatChannel rotationalVelocity2dChannel;
        FloatChannel uvChannel;
        FloatChannel rotationChannel;
        public boolean flip_x = false;
        public boolean flip_y = false;
        public float start_angle = 0.0f;

        public Rotational2DStatic() {
            super();
            this.flip_x = false;
            this.flip_y = false;
        }

        public Rotational2DStatic(Rotational2DStatic source) {
            super(source);
            this.flip_x = false;
            this.flip_y = false;
            this.flip_x = source.flip_x;
            this.flip_y = source.flip_y;
            this.start_angle = source.start_angle;
        }

        @Override
        public void dispose() {
            super.dispose();
        }

        @Override
        public void allocateChannels() {
            super.allocateChannels();
            this.rotationalVelocity2dChannel = (FloatChannel) this.controller.particles.addChannel(ParticleChannels.AngularVelocity2D);
            this.uvChannel = (FloatChannel) this.controller.particles.addChannel(ParticleChannels.TextureRegion);
            this.rotationChannel = (FloatChannel) this.controller.particles.addChannel(ParticleChannels.Rotation2D);
        }

        @Override
        public void update() {
            int i1 = 0;
            int i2 = 2;
            int i3 = 0;
            int size = this.controller.particles.size * this.rotationalVelocity2dChannel.strideSize;
            while (i1 < size) {
                float s1 = this.strengthChannel.data[i3];
                float s2 = this.strengthChannel.data[i3 + 1];
                float life = this.lifeChannel.data[i2];
                this.rotationalVelocity2dChannel.data[i1] += this.strengthValue.getScale(life) * s2 + s1;
                i3 += this.strengthChannel.strideSize;
                i1 += this.rotationalVelocity2dChannel.strideSize;
                i2 += this.lifeChannel.strideSize;
            }

            int rotLen = this.rotationChannel.data.length;
            for (int i = 0; i < rotLen; i += this.rotationChannel.strideSize) {
                float rad = this.start_angle * 0.0174532924F;
                this.rotationChannel.data[i] = LW.Fm0(rad);
                this.rotationChannel.data[i + 1] = LW.Po0(rad);
            }

            int uvLen = this.uvChannel.data.length;
            int lifeIndex = 2;
            for (int i = 0; i < uvLen; i += this.uvChannel.strideSize) {
                if (this.flip_x) {
                    this.uvChannel.data[i] = 1.0f;
                    this.uvChannel.data[i + 2] = 0.0f;
                } else {
                    this.uvChannel.data[i] = 0.0f;
                    this.uvChannel.data[i + 2] = 1.0f;
                }

                float scale = this.strengthValue.getScale(this.lifeChannel.data[lifeIndex]);
                if (this.flip_y) {
                    this.uvChannel.data[i + 1] = 1.0f / scale;
                    this.uvChannel.data[i + 3] = 0.0f;
                } else {
                    this.uvChannel.data[i + 1] = 0.0f;
                    this.uvChannel.data[i + 3] = 1.0f / scale;
                }
                lifeIndex += this.lifeChannel.strideSize;
            }
        }

        @Override
        public Rotational2DStatic copy() {
            return new Rotational2DStatic(this);
        }

        @Override
        public void write(gp_1 json) {
            super.write(json);
            json.sg(Boolean.class, Boolean.valueOf(this.flip_x), "flip_x");
            json.sg(Boolean.class, Boolean.valueOf(this.flip_y), "flip_y");
            json.sg(Float.class, Float.valueOf(this.start_angle), "angle");
        }

        @Override
        public void read(gp_1 json, oe_0 jsonData) {
            super.read(json, jsonData);
            this.flip_x = ((Boolean) h4_0.Lpt6(json, jsonData, "flip_x", Boolean.class, null)).booleanValue();
            this.flip_y = ((Boolean) json.b20(Boolean.class, null, jsonData.Is("flip_y"))).booleanValue();
            this.start_angle = ((Float) json.b20(Float.class, null, jsonData.Is("angle"))).floatValue();
        }
    }

    public static class ProjectedDirection extends DynamicsModifier {
        FloatChannel rotChannel;
        FloatChannel accChannel;
        FloatChannel prevPosChannel;
        FloatChannel posChannel;
        protected Bp0 TMP_2V1;
        private Tv0 cam;

        public ProjectedDirection() {
            super();
            this.TMP_2V1 = new Bp0();
        }

        public ProjectedDirection(ProjectedDirection source) {
            super(source);
            this.TMP_2V1 = new Bp0();
        }

        @Override
        public void allocateChannels() {
            this.cam = ((BillboardRendererExt) this.controller.renderer).getBatch().getCamera();
            this.rotChannel = (FloatChannel) this.controller.particles.addChannel(ParticleChannels.Rotation2D);
            this.prevPosChannel = (FloatChannel) this.controller.particles.addChannel(ParticleChannels.PreviousPosition);
            this.posChannel = (FloatChannel) this.controller.particles.addChannel(ParticleChannels.Position);
            this.accChannel = (FloatChannel) this.controller.particles.addChannel(ParticleChannels.Acceleration);
        }

        @Override
        public void update() {
            int i1 = 0;
            int i2 = 0;
            int i3 = 0;
            int size = this.controller.particles.size * this.prevPosChannel.strideSize;
            while (i1 < size) {
                TMP_V1.x = this.prevPosChannel.data[i1];
                TMP_V1.y = this.prevPosChannel.data[i1 + 1];
                TMP_V1.z = this.prevPosChannel.data[i1 + 2];

                TMP_V2.x = this.posChannel.data[i2];
                TMP_V2.y = this.posChannel.data[i2 + 1];
                TMP_V2.z = this.posChannel.data[i2 + 2];

                C8 p1 = this.cam.zz(TMP_V1);
                TMP_V1.x = p1.x;
                TMP_V1.y = p1.y;
                TMP_V1.z = p1.z;

                C8 p2 = this.cam.zz(TMP_V2);
                TMP_V2.x = p2.x;
                TMP_V2.y = p2.y;
                TMP_V2.z = p2.z;

                float dx = TMP_V2.x - TMP_V1.x;
                float dy = TMP_V2.y - TMP_V1.y;
                this.TMP_2V1.x = dx;
                this.TMP_2V1.y = dy;

                float angle = (float) Math.atan2(dy, dx) * 57.2957763672F;
                if (angle < 0.0f) {
                    angle += 360.0f;
                }
                float rot = -angle + 90.0f;
                this.rotChannel.data[i3] = LW.gc0(rot);
                this.rotChannel.data[i3 + 1] = LW.Om(rot);

                i1 += this.prevPosChannel.strideSize;
                i2 += this.posChannel.strideSize;
                i3 += this.rotChannel.strideSize;
            }
            super.update();
        }

        @Override
        public ParticleControllerComponent copy() {
            return new ProjectedDirection(this);
        }
    }

    public static class DragForce extends DynamicsModifier.Strength {
        FloatChannel accelerationChannel;
        FloatChannel positionChannel;
        FloatChannel prevPositionChannel;
        FloatChannel stopForces;
        private C8 target;

        public DragForce() {
            super();
            this.target = new C8();
        }

        public DragForce(DragForce source) {
            super(source);
            this.target = new C8();
        }

        @Override
        public void allocateChannels() {
            super.allocateChannels();
            this.accelerationChannel = (FloatChannel) this.controller.particles.addChannel(ParticleChannels.Acceleration);
            this.positionChannel = (FloatChannel) this.controller.particles.addChannel(ParticleChannels.Position);
            this.prevPositionChannel = (FloatChannel) this.controller.particles.addChannel(ParticleChannels.PreviousPosition);
            ChannelDescriptor desc = ParticleChannels.Interpolation4;
            desc.id = this.controller.particleChannels.newId();
            this.stopForces = (FloatChannel) this.controller.particles.addChannel(desc);
        }

        @Override
        public void init() {
            super.init();
            if (co_1.Xh == ri_0.xQ) {
                this.target.np(co_1.cOm6);
            } else {
                this.target.np(co_1.Kl0);
            }
        }

        @Override
        public void activateParticles(int startIndex, int count) {
            super.activateParticles(startIndex, count);
            int stride = this.stopForces.strideSize;
            int i = startIndex * stride;
            int end = i + count * stride;
            while (i < end) {
                this.stopForces.data[i] = 0.0f;
                this.stopForces.data[i + 1] = this.target.x;
                this.stopForces.data[i + 2] = this.target.y;
                this.stopForces.data[i + 3] = this.target.z;
                i += this.stopForces.strideSize;
            }
        }

        @Override
        public void update() {
            int i1 = 2;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            int count = this.controller.particles.size;
            for (int i7 = 0; i7 < count; i7++) {
                if (this.stopForces.data[i5] != 1.0f) {
                    TMP_V1.x = this.stopForces.data[i5 + 1];
                    TMP_V1.y = this.stopForces.data[i5 + 2];
                    TMP_V1.z = this.stopForces.data[i5 + 3];

                    float life = this.lifeChannel.data[i1];
                    float s1 = this.strengthChannel.data[i2];
                    float s2 = this.strengthChannel.data[i2 + 1];
                    float strength = hk0_0.gb0(this.strengthValue, life, s2, s1);

                    TMP_V3.x = this.positionChannel.data[i3];
                    TMP_V3.y = this.positionChannel.data[i3 + 1];
                    TMP_V3.z = this.positionChannel.data[i3 + 2];

                    float dist = TMP_V3.SH0(TMP_V1);
                    TMP_V2.x = dist;
                    TMP_V2.y = dist;
                    TMP_V2.z = dist;
                    TMP_V2.KM();

                    TMP_V1.Vy(TMP_V3.x, TMP_V3.y, TMP_V3.z).KM();

                    TMP_V3.x = TMP_V1.x * TMP_V2.x;
                    TMP_V3.y = TMP_V1.y * TMP_V2.y;
                    TMP_V3.z = TMP_V1.z * TMP_V2.z;
                    TMP_V3.Fg0(strength);

                    this.accelerationChannel.data[i4] += TMP_V3.x;
                    this.accelerationChannel.data[i4 + 1] += TMP_V3.y;
                    this.accelerationChannel.data[i4 + 2] += TMP_V3.z;

                    if (dist < 0.05f) {
                        this.prevPositionChannel.data[i6] = this.positionChannel.data[i3];
                        this.prevPositionChannel.data[i6 + 1] = this.positionChannel.data[i3 + 1];
                        this.prevPositionChannel.data[i6 + 2] = this.positionChannel.data[i3 + 2];

                        float factor = 1.0f - Sine.OUT.compute(life);
                        this.accelerationChannel.data[i7] = factor * TMP_V3.x;
                        this.accelerationChannel.data[i7 + 1] = (1.0f - Sine.OUT.compute(life)) * TMP_V3.y;
                        this.accelerationChannel.data[i7 + 2] = (1.0f - Sine.OUT.compute(life)) * TMP_V3.z;
                        this.stopForces.data[i5] = 1.0f;
                    }
                }

                i3 += this.positionChannel.strideSize;
                i2 += this.strengthChannel.strideSize;
                i4 += this.accelerationChannel.strideSize;
                i1 += this.lifeChannel.strideSize;
                i6 += this.prevPositionChannel.strideSize;
                i5 += this.stopForces.strideSize;
            }
        }

        @Override
        public DragForce copy() {
            return new DragForce(this);
        }
    }

    public static class VectorPathModifier extends DynamicsModifier.Strength {
        private static final int CASTER = 1;
        private static final int TARGET = 2;
        protected static C8 TMP_V1 = new C8();
        protected static C8 TMP_V2 = new C8();
        private Random random = new O00();
        FloatChannel accelerationChannel;
        FloatChannel positionChannel;
        FloatChannel prevPositionChannel;
        FloatChannel spawnPosition;
        FloatChannel rotationChannel;
        IntChannel pathChannel;
        public es_1 vectorPath;
        public VectorPathMode pathType = VectorPathMode.Spline;
        public NumericValue degree;
        public boolean isContinuous = false;
        public boolean rotateTarget = false;
        public boolean spawnOnly = false;
        public boolean randomByIndex = false;
        public boolean useSpawnPosition = false;
        public ah_1 ease = null;
        private C8 basePosition;
        public C8[] finalVectorPath;
        public cf_2 pathCache;
        private int cacheId = 0;
        public NumericValue travelDuration;
        private float currentLife = 0.0f;

        public static enum VectorPathMode {
            Spline("Spline", (byte) 0),
            BSpline("BSpline", (byte) 1),
            Bezier("Bezier", (byte) 2);

            public static final VectorPathMode[] VALUES = values();
            private static final bm0_1 CACHE = new bm0_1();
            public String desc;
            public byte type;

            static {
                for (VectorPathMode mode : VALUES) {
                    CACHE.gE0(mode.type, mode);
                }
            }

            private VectorPathMode(String desc, byte type) {
                this.desc = desc;
                this.type = type;
            }

            public static VectorPathMode getById(byte b) {
                return (VectorPathMode) CACHE.BM(b);
            }

            @Override
            public String toString() {
                return this.desc;
            }
        }

        public static class VectorEntry {
            public C8 pos;
            public C8 offset;
            public int modifier;

            public VectorEntry() {
            }

            public VectorEntry(C8 pos, C8 offset, int modifier) {
                this.pos = pos;
                this.offset = offset;
                this.modifier = modifier;
            }

            public C8 modifier(Random random) {
                float ox = this.offset.x;
                float rx = SeedRandom.random(random, -ox, ox);
                float oy = this.offset.y;
                float ry = SeedRandom.random(random, -oy, oy);
                float oz = this.offset.z;
                float rz = SeedRandom.random(random, -oz, oz);
                VectorPathModifier.TMP_V1.x = rx;
                VectorPathModifier.TMP_V1.y = ry;
                VectorPathModifier.TMP_V1.z = rz;
                return VectorPathModifier.TMP_V1;
            }

            public C8 pos(Random random, boolean flip) {
                VectorPathModifier.TMP_V1.np(this.pos);
                if (flip) {
                    VectorPathModifier.TMP_V1.x = -VectorPathModifier.TMP_V1.x;
                    VectorPathModifier.TMP_V1.z = -VectorPathModifier.TMP_V1.z;
                }
                return VectorPathModifier.TMP_V1;
            }
        }

        public VectorPathModifier() {
            super();
            this.random = new O00();
            this.ease = null;
            this.cacheId = 0;
            this.pathCache = new cf_2();
            this.vectorPath = new es_1();
            this.vectorPath.Ue0(new VectorEntry(new C8(), new C8(), 1));
            this.vectorPath.Ue0(new VectorEntry(new C8(), new C8(), 2));
            this.rotateTarget = false;
            this.isContinuous = false;
            this.spawnOnly = false;
            this.useSpawnPosition = false;
            this.degree = new NumericValue();
            this.degree.setValue(0.0f);
            this.pathType = VectorPathMode.Spline;
            this.travelDuration = new NumericValue();
            this.travelDuration.setValue(1.0f);
            this.travelDuration.setActive(false);
            this.currentLife = 0.0f;
        }

        public VectorPathModifier(VectorPathModifier source) {
            super(source);
            this.random = new O00();
            this.ease = null;
            this.cacheId = 0;
            this.degree = new NumericValue();
            this.travelDuration = new NumericValue();
            this.pathCache = new cf_2();
            this.vectorPath = new es_1();
            I2 it = source.vectorPath.ZD();
            while (it.hasNext()) {
                VectorEntry entry = (VectorEntry) it.next();
                this.vectorPath.Ue0(new VectorEntry(entry.pos.q40(), entry.offset.q40(), entry.modifier));
            }
            this.pathType = source.pathType;
            this.degree.setValue(source.degree.getValue());
            this.isContinuous = source.isContinuous;
            this.rotateTarget = source.rotateTarget;
            this.spawnOnly = source.spawnOnly;
            this.randomByIndex = source.randomByIndex;
            this.useSpawnPosition = source.useSpawnPosition;
            this.ease = source.ease;
            this.travelDuration.setValue(source.travelDuration.getValue());
            this.travelDuration.setActive(source.travelDuration.isActive());
            this.currentLife = 0.0f;
        }

        public void initPath(int index) {
            if (this.vectorPath.KB < 2) {
                return;
            }
            if (this.strengthValue.getLowMin() > 0.0f) {
                index = (int) (index % this.strengthValue.getLowMin());
            }
            if (this.pathCache.Vd(Integer.valueOf(index))) {
                return;
            }
            int size = this.vectorPath.KB;
            int extra = (this.pathType == VectorPathMode.Bezier) ? 0 : 2;
            this.finalVectorPath = new C8[size + extra];
            if (this.pathType != VectorPathMode.Spline && this.pathType != VectorPathMode.BSpline) {
                for (int i2 = 0; i2 < this.finalVectorPath.length; i2++) {
                    boolean flip = false;
                    VectorEntry entry = (VectorEntry) this.vectorPath.get(i2);
                    if (entry.modifier != 0 && this.isGlobal && co_1.Xh == ri_0.pN) {
                        flip = true;
                    }
                    C8 pos = entry.pos(this.random, flip);
                    this.finalVectorPath[i2] = T3.hf(pos, pos);
                    if (entry.modifier == 1) {
                        this.finalVectorPath[i2].na(co_1.Kl0.x, co_1.Kl0.y, co_1.Kl0.z);
                    } else if (entry.modifier == 2) {
                        this.finalVectorPath[i2].na(co_1.cOm6.x, co_1.cOm6.y, co_1.cOm6.z);
                    }
                }
            } else {
                boolean flip = false;
                if (((VectorEntry) this.vectorPath.KI()).modifier != 0 && this.isGlobal && co_1.Xh == ri_0.pN) {
                    flip = true;
                }
                for (int i3 = 0; i3 < this.vectorPath.KB; i3++) {
                    if (this.randomByIndex) {
                        this.random.setSeed((long) index + (long) this.strengthValue.getHighMin());
                    }
                    if (((VectorEntry) this.vectorPath.get(i3)).modifier != 0 && this.isGlobal) {
                        flip = (co_1.Xh == ri_0.pN);
                    }
                    VectorEntry entry = (VectorEntry) this.vectorPath.get(i3);
                    int i5 = i3 + 1;
                    C8 pos = entry.pos(this.random, flip);
                    this.finalVectorPath[i5] = T3.hf(pos, pos);
                    C8 mod = entry.modifier(this.random);
                    this.finalVectorPath[i5].na(mod.x, mod.y, mod.z);
                    if (entry.modifier == 1) {
                        this.finalVectorPath[i5].na(co_1.Kl0.x, co_1.Kl0.y, co_1.Kl0.z);
                    } else if (entry.modifier == 2) {
                        this.finalVectorPath[i5].na(co_1.cOm6.x, co_1.cOm6.y, co_1.cOm6.z);
                    }
                }
                this.finalVectorPath[0] = T3.hf(this.finalVectorPath[1], this.finalVectorPath[1]);
                this.finalVectorPath[this.finalVectorPath.length - 1] = T3.hf(this.finalVectorPath[this.finalVectorPath.length - 2], this.finalVectorPath[this.finalVectorPath.length - 2]);
            }

            switch (this.pathType) {
                case Spline:
                    this.pathCache.n3(Integer.valueOf(index), new tl_0(this.finalVectorPath, this.isContinuous));
                    break;
                case BSpline:
                    this.pathCache.n3(Integer.valueOf(index), new ML(this.finalVectorPath, 3, this.isContinuous));
                    break;
                case Bezier:
                    if (this.finalVectorPath.length >= 2 && this.finalVectorPath.length <= 4) {
                        this.pathCache.n3(Integer.valueOf(index), new L90(this.finalVectorPath));
                    } else {
                        DynamicsModifierExt.log.error("Bezier curve support is limited, requires vector path len >= 2 && <= 4", new nf_1(""));
                    }
                    break;
            }
        }

        @Override
        public void allocateChannels() {
            super.allocateChannels();
            this.accelerationChannel = (FloatChannel) this.controller.particles.addChannel(ParticleChannels.Acceleration);
            this.positionChannel = (FloatChannel) this.controller.particles.addChannel(ParticleChannels.Position);
            this.prevPositionChannel = (FloatChannel) this.controller.particles.addChannel(ParticleChannels.PreviousPosition);
            if (this.useSpawnPosition) {
                this.spawnPosition = (FloatChannel) this.controller.particles.addChannel(ParticleChannelsExt.SpawnPosition);
            }
            if (this.rotateTarget) {
                this.rotationChannel = (FloatChannel) this.controller.particles.addChannel(ParticleChannels.Rotation2D);
            }
            this.pathChannel = (IntChannel) this.controller.particles.addChannel(ParticleChannelsExt.PathId);
        }

        @Override
        public void start() {
            super.start();
            this.currentLife = 0.0f;
        }

        @Override
        public void init() {
            super.init();
            if (this.rotateTarget && this.rotationChannel != null) {
                int count = this.controller.particles.size;
                for (int i1 = 0; i1 < count; i1++) {
                    int offset = i1 * this.rotationChannel.strideSize;
                    this.rotationChannel.data[offset] = 0.0f;
                    this.rotationChannel.data[offset + 1] = 1.0f;
                }
            }
            if (this.pathCache != null) {
                this.pathCache.clear();
            }
            this.random.setSeed((long) this.strengthValue.getHighMin());
            this.cacheId = 0;
            this.currentLife = 0.0f;
        }

        @Override
        public void activateParticles(int startIndex, int count) {
            for (int i3 = startIndex; i3 < startIndex + count; i3++) {
                initPath(i3);
                int i4 = i3 * this.lifeChannel.strideSize;
                int i5;
                if (this.strengthValue.getLowMin() > 0.0f) {
                    i5 = (int) (this.cacheId++ % this.strengthValue.getLowMin());
                } else {
                    i5 = i3;
                }
                float f6 = 0.0f;
                if (!this.strengthValue.isRelative() || this.spawnOnly) {
                    Emitter emitter = this.controller.emitter;
                    float pct = emitter.percent;
                    if (this.spawnOnly) {
                        float dur = ((RegularEmitter) emitter).durationValue.getLowMax();
                        float f4 = (dur / this.lifeChannel.data[i4]) * pct;
                        f6 = f4;
                        while (f6 > 1.0f) {
                            f6 -= 1.0f;
                        }
                    } else {
                        f6 = pct;
                    }
                }
                this.pathChannel.data[i3 * this.pathChannel.strideSize] = i5;
                if (this.pathCache.vC(Integer.valueOf(i5), null) != null) {
                    ((tx_2) this.pathCache.vC(Integer.valueOf(i5), null)).DA0(f6, TMP_V2);
                }
                int posOffset = i3 * this.positionChannel.strideSize;
                TMP_V3.x = this.positionChannel.data[posOffset];
                TMP_V3.y = this.positionChannel.data[posOffset + 1];
                TMP_V3.z = this.positionChannel.data[posOffset + 2];

                if (this.spawnPosition != null && this.useSpawnPosition) {
                    int spOffset = i3 * this.spawnPosition.strideSize;
                    this.spawnPosition.data[spOffset] = TMP_V3.x;
                    this.spawnPosition.data[spOffset + 1] = TMP_V3.y;
                    this.spawnPosition.data[spOffset + 2] = TMP_V3.z;
                }

                if (!this.strengthValue.isRelative() && !this.spawnOnly) {
                    if (this.useSpawnPosition) {
                        TMP_V2.na(TMP_V3.x, TMP_V3.y, TMP_V3.z);
                    }
                    this.positionChannel.data[posOffset] = TMP_V2.x;
                    this.positionChannel.data[posOffset + 1] = TMP_V2.y;
                    this.positionChannel.data[posOffset + 2] = TMP_V2.z;
                } else {
                    this.controller.transform.Y1(TMP_V2);
                }
            }
            super.activateParticles(startIndex, count);
        }

        @Override
        public void killParticles(int startIndex, int count) {
            super.killParticles(startIndex, count);
        }

        @Override
        public void update() {
            if (this.spawnOnly) {
                return;
            }
            this.currentLife += this.controller.deltaTime;
            float[] ew = this.controller.transform.EW;
            float f1 = ew[12];
            float f2 = ew[13];
            float f3 = ew[14];
            int i4 = 2;
            int i5 = 0;
            int count = this.controller.particles.size;
            for (int i6 = 0; i6 < count; i6++) {
                if (this.basePosition == null) {
                    this.basePosition = new C8();
                    this.basePosition.x = this.positionChannel.data[i5];
                    this.basePosition.y = this.positionChannel.data[i5 + 1];
                    this.basePosition.z = this.positionChannel.data[i5 + 2];
                }
                float life = this.lifeChannel.data[i4];
                if (this.travelDuration.isActive()) {
                    life = Math.min(1.0f, (this.currentLife * 1000.0f) / this.travelDuration.getValue());
                }
                if (this.ease != null) {
                    life = this.ease.compute(life);
                }
                int pathId = this.pathChannel.data[i6 * this.pathChannel.strideSize];
                if (pathId >= 0) {
                    tx_2 path = (tx_2) this.pathCache.vC(Integer.valueOf(pathId), null);
                    if (path != null) {
                        path.DA0(life, TMP_V2);
                        if (this.rotateTarget) {
                            path.DA0(life - 0.025f, TMP_V1);
                        }
                    } else {
                        path = (tx_2) this.pathCache.vC(Integer.valueOf(0), null);
                        if (path == null) {
                            initPath(0);
                            path = (tx_2) this.pathCache.vC(Integer.valueOf(0), null);
                        }
                        if (path == null) {
                            return;
                        }
                        path.DA0(life, TMP_V2);
                    }

                    if (life < 0.025f) {
                        TMP_V2.x = 999.0f;
                        TMP_V2.y = 999.0f;
                        TMP_V2.z = 999.0f;
                    }

                    if (this.spawnPosition != null && this.useSpawnPosition) {
                        int spIdx = i6 * this.spawnPosition.strideSize;
                        TMP_V3.x = this.spawnPosition.data[spIdx];
                        TMP_V3.y = this.spawnPosition.data[spIdx + 1];
                        TMP_V3.z = this.spawnPosition.data[spIdx + 2];
                        TMP_V2.na(TMP_V3.x, TMP_V3.y, TMP_V3.z);
                        TMP_V2.Vy(f1, f2, f3);
                    }

                    if (life >= 1.0f) {
                        this.pathChannel.data[i6 * this.pathChannel.strideSize] = -1;
                    }

                    if (!this.strengthValue.isRelative()) {
                        this.positionChannel.data[i5] = TMP_V2.x;
                        this.positionChannel.data[i5 + 1] = TMP_V2.y;
                        this.positionChannel.data[i5 + 2] = TMP_V2.z;
                    } else {
                        this.controller.transform.Y1(TMP_V2);
                    }

                    if (this.rotateTarget && this.rotationChannel != null) {
                        int rotIdx = i6 * this.rotationChannel.strideSize;
                        float deg = LW.mS(TMP_V2.z - TMP_V1.z, TMP_V2.x - TMP_V1.x) * 180.0f / 3.141592741F;
                        float rad = (this.degree.getValue() + deg) * 0.0174532924F;
                        this.rotationChannel.data[rotIdx] = LW.Fm0(rad);
                        this.rotationChannel.data[rotIdx + 1] = LW.Po0(rad);
                    }

                    if (this.strengthValue.isRelative()) {
                        break;
                    }
                }

                i5 += this.positionChannel.strideSize;
                i4 += this.lifeChannel.strideSize;
            }
        }

        @Override
        public void write(gp_1 json) {
            super.write(json);
            json.A2("vectorArray", this.vectorPath, es_1.class, VectorEntry.class);
            json.sg(Boolean.class, Boolean.valueOf(this.isContinuous), "isContinuous");
            json.sg(Integer.class, Byte.valueOf(this.pathType.type), "pathType");
            json.sg(Boolean.class, Boolean.valueOf(this.rotateTarget), "rotateTarget");
            json.sg(Boolean.class, Boolean.valueOf(this.spawnOnly), "spawnOnly");
            json.sg(Boolean.class, Boolean.valueOf(this.randomByIndex), "randByIdx");
            json.sg(Boolean.class, Boolean.valueOf(this.useSpawnPosition), "useSpawnPosition");
            json.sg(ah_1.class, this.ease, "ease");
            json.sg(NumericValue.class, this.degree, "degree");
            json.sg(NumericValue.class, this.travelDuration, "speed");
        }

        @Override
        public void read(gp_1 json, oe_0 jsonData) {
            super.read(json, jsonData);
            if (jsonData.UJ0("vectorPath")) {
                es_1 vp = (es_1) h4_0.Lpt6(json, jsonData, "vectorPath", es_1.class, C8.class);
                es_1 vm = (es_1) json.b20(es_1.class, Integer.class, jsonData.Is("vectorMod"));
                this.vectorPath.clear();
                int idx = 0;
                I2 it = vp.ZD();
                while (it.hasNext()) {
                    C8 c = (C8) it.next();
                    int mod = ((Integer) vm.get(idx++)).intValue();
                    this.vectorPath.Ue0(new VectorEntry(c, new C8(), mod));
                }
            } else if (jsonData.UJ0("vectorArray")) {
                this.vectorPath = (es_1) h4_0.Lpt6(json, jsonData, "vectorArray", es_1.class, VectorEntry.class);
            }
            this.isContinuous = ((Boolean) h4_0.Lpt6(json, jsonData, "isContinuous", Boolean.class, null)).booleanValue();
            byte type = ((Integer) json.b20(Integer.class, null, jsonData.Is("pathType"))).byteValue();
            this.pathType = VectorPathMode.getById(type);
            this.rotateTarget = ((Boolean) json.b20(Boolean.class, null, jsonData.Is("rotateTarget"))).booleanValue();
            this.degree = (NumericValue) json.b20(NumericValue.class, null, jsonData.Is("degree"));
            if (jsonData.UJ0("spawnOnly")) {
                this.spawnOnly = ((Boolean) json.b20(Boolean.class, null, jsonData.Is("spawnOnly"))).booleanValue();
            }
            if (jsonData.UJ0("randByIdx")) {
                this.randomByIndex = ((Boolean) json.b20(Boolean.class, null, jsonData.Is("randByIdx"))).booleanValue();
            }
            if (jsonData.UJ0("speed")) {
                this.travelDuration = (NumericValue) json.b20(NumericValue.class, null, jsonData.Is("speed"));
            }
            if (jsonData.UJ0("ease")) {
                this.ease = (ah_1) json.b20(ah_1.class, null, jsonData.Is("ease"));
            }
            if (jsonData.UJ0("useSpawnPosition")) {
                this.useSpawnPosition = ((Boolean) json.b20(Boolean.class, null, jsonData.Is("useSpawnPosition"))).booleanValue();
            }
        }

        @Override
        public VectorPathModifier copy() {
            return new VectorPathModifier(this);
        }
    }
}
