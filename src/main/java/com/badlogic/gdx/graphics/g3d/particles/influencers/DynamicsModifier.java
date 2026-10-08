/*
 * Decompiled with CFR 0.152.
 */
package com.badlogic.gdx.graphics.g3d.particles.influencers;

import com.badlogic.gdx.graphics.g3d.particles.ParallelArray;
import com.badlogic.gdx.graphics.g3d.particles.ParticleChannels;
import com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent;
import com.badlogic.gdx.graphics.g3d.particles.influencers.Influencer;
import com.badlogic.gdx.graphics.g3d.particles.values.ScaledNumericValue;
import com.badlogic.gdx.math.Matrix4;
import f.C8;
import f.LW;
import f.VD0;
import f.gp_1;
import f.h4_0;
import f.hk0_0;
import f.me0_2;
import f.oe_0;

public abstract class DynamicsModifier
extends Influencer {
    protected static final C8 TMP_V1 = new C8();
    protected static final C8 TMP_V2 = new C8();
    protected static final C8 TMP_V3 = new C8();
    protected static final me0_2 TMP_Q = new me0_2();
    public boolean isGlobal = false;
    protected ParallelArray.FloatChannel lifeChannel;

    public DynamicsModifier() {
    }

    public DynamicsModifier(DynamicsModifier dynamicsModifier) {
        this.isGlobal = dynamicsModifier.isGlobal;
    }

    @Override
    public void allocateChannels() {
        this.lifeChannel = (ParallelArray.FloatChannel)this.controller.particles.addChannel(ParticleChannels.Life);
    }

    @Override
    public void write(gp_1 gp_12) {
        DynamicsModifier dynamicsModifier = this;
        super.write(gp_12);
        gp_12.v80(dynamicsModifier.isGlobal, "isGlobal");
    }

    @Override
    public void read(gp_1 gp_12, oe_0 oe_02) {
        super.read(gp_12, oe_02);
        this.isGlobal = (Boolean)h4_0.Lpt6(gp_12, oe_02, "isGlobal", Boolean.TYPE, null);
    }

    public static class BrownianAcceleration
    extends Strength {
        ParallelArray.FloatChannel accelerationChannel;

        public BrownianAcceleration() {
        }

        public BrownianAcceleration(BrownianAcceleration brownianAcceleration) {
            super(brownianAcceleration);
        }

        @Override
        public void allocateChannels() {
            BrownianAcceleration brownianAcceleration = this;
            super.allocateChannels();
            brownianAcceleration.accelerationChannel = (ParallelArray.FloatChannel)brownianAcceleration.controller.particles.addChannel(ParticleChannels.Acceleration);
        }

        @Override
        public void update() {
            int n = 2;
            int n2 = 0;
            int n3 = 0;
            int n4 = this.controller.particles.size;
            for (int j = 0; j < n4; ++j) {
                int n5 = n;
                int n6 = n3;
                BrownianAcceleration brownianAcceleration = this;
                float f = brownianAcceleration.strengthChannel.data[n2];
                float f2 = brownianAcceleration.strengthChannel.data[n2 + 1];
                float f3 = hk0_0.gb0(brownianAcceleration.strengthValue, this.lifeChannel.data[n], f2, f);
                C8 c8 = TMP_V3;
                f = 2.0f;
                f2 = LW.Yu.nextFloat() * f + -1.0f;
                f = LW.Yu.nextFloat() * f + -1.0f;
                c8.x = LW.Yu.nextFloat() * 2.0f + -1.0f;
                c8.y = f2;
                c8.z = f;
                c8.KM().Fg0(f3);
                ParallelArray.FloatChannel floatChannel = brownianAcceleration.accelerationChannel;
                float[] fArray = floatChannel.data;
                fArray[n3] = floatChannel.data[n3] + c8.x;
                int n7 = n3 + 1;
                fArray[n7] = floatChannel.data[n7] + c8.y;
                fArray[n3 += 2] = floatChannel.data[n3] + c8.z;
                n = n2 + brownianAcceleration.strengthChannel.strideSize;
                n3 = n6 + floatChannel.strideSize;
                n2 = n5 + this.lifeChannel.strideSize;
                int n8 = n;
                n = n2;
                n2 = n8;
            }
        }

        @Override
        public BrownianAcceleration copy() {
            return new BrownianAcceleration(this);
        }
    }

    public static class TangentialAcceleration
    extends Angular {
        ParallelArray.FloatChannel directionalVelocityChannel;
        ParallelArray.FloatChannel positionChannel;

        public TangentialAcceleration() {
        }

        public TangentialAcceleration(TangentialAcceleration tangentialAcceleration) {
            super(tangentialAcceleration);
        }

        @Override
        public void allocateChannels() {
            TangentialAcceleration tangentialAcceleration = this;
            super.allocateChannels();
            tangentialAcceleration.directionalVelocityChannel = (ParallelArray.FloatChannel)tangentialAcceleration.controller.particles.addChannel(ParticleChannels.Acceleration);
            tangentialAcceleration.positionChannel = (ParallelArray.FloatChannel)tangentialAcceleration.controller.particles.addChannel(ParticleChannels.Position);
        }

        @Override
        public void update() {
            int n = 0;
            int n2 = 2;
            int n3 = 0;
            int n4 = 0;
            int n5 = 0;
            int n6 = this.controller.particles.size * this.directionalVelocityChannel.strideSize;
            while (n < n6) {
                TangentialAcceleration tangentialAcceleration = this;
                float f = tangentialAcceleration.lifeChannel.data[n2];
                float f2 = tangentialAcceleration.strengthChannel.data[n3];
                float f3 = tangentialAcceleration.strengthChannel.data[n3 + 1];
                f2 = hk0_0.gb0(tangentialAcceleration.strengthValue, f, f3, f2);
                f3 = tangentialAcceleration.angularChannel.data[n4 + 2];
                float f4 = tangentialAcceleration.angularChannel.data[n4 + 3];
                float f5 = hk0_0.gb0(tangentialAcceleration.phiValue, f, f4, f3);
                TangentialAcceleration tangentialAcceleration2 = this;
                f3 = tangentialAcceleration2.angularChannel.data[n4];
                f4 = tangentialAcceleration2.angularChannel.data[n4 + 1];
                float f6 = hk0_0.gb0(tangentialAcceleration2.thetaValue, f, f4, f3);
                f = LW.gc0(f6);
                f3 = LW.Om(f6);
                f4 = LW.gc0(f5);
                float f7 = LW.Om(f5);
                C8 c8 = TMP_V3;
                c8.x = f *= f7;
                TMP_V3.y = f4;
                TMP_V3.z = f3 *= f7;
                C8 c82 = TMP_V1;
                float[] fArray = this.positionChannel.data;
                float f8 = fArray[n5];
                f4 = fArray[n5 + 1];
                f7 = this.positionChannel.data[n5 + 2];
                TMP_V1.x = f8;
                TMP_V1.y = f4;
                TMP_V1.z = f7;
                if (!tangentialAcceleration.isGlobal) {
                    Matrix4 matrix4 = this.controller.transform;
                    C8 c83 = TMP_V2;
                    matrix4.V1(c83);
                    float f9 = c83.x;
                    f4 = c83.y;
                    f7 = c83.z;
                    c82.Vy(f9, f4, f7);
                    Matrix4 matrix42 = this.controller.transform;
                    me0_2 me0_22 = TMP_Q;
                    boolean bl = true;
                    matrix42.getClass();
                    me0_22.et0(bl, matrix42);
                    c8.bm0(me0_22);
                }
                int n7 = n;
                int n8 = n3;
                TangentialAcceleration tangentialAcceleration3 = this;
                c8.Xv0(c82).KM().Fg0(f2);
                ParallelArray.FloatChannel floatChannel = tangentialAcceleration3.directionalVelocityChannel;
                float[] fArray2 = floatChannel.data;
                fArray2[n] = floatChannel.data[n] + c8.x;
                n3 = n + 1;
                fArray2[n3] = floatChannel.data[n3] + c8.y;
                fArray2[n += 2] = floatChannel.data[n] + c8.z;
                n3 = n8 + tangentialAcceleration3.strengthChannel.strideSize;
                n = n7 + floatChannel.strideSize;
                n4 += this.angularChannel.strideSize;
                n2 += this.lifeChannel.strideSize;
                n5 += this.positionChannel.strideSize;
            }
        }

        @Override
        public TangentialAcceleration copy() {
            return new TangentialAcceleration(this);
        }
    }

    public static class PolarAcceleration
    extends Angular {
        ParallelArray.FloatChannel directionalVelocityChannel;

        public PolarAcceleration() {
        }

        public PolarAcceleration(PolarAcceleration polarAcceleration) {
            super(polarAcceleration);
        }

        @Override
        public void allocateChannels() {
            PolarAcceleration polarAcceleration = this;
            super.allocateChannels();
            polarAcceleration.directionalVelocityChannel = (ParallelArray.FloatChannel)polarAcceleration.controller.particles.addChannel(ParticleChannels.Acceleration);
        }

        @Override
        public void update() {
            int n = 0;
            int n2 = 2;
            int n3 = 0;
            int n4 = 0;
            int n5 = this.controller.particles.size * this.directionalVelocityChannel.strideSize;
            while (n < n5) {
                PolarAcceleration polarAcceleration = this;
                float f = polarAcceleration.lifeChannel.data[n2];
                float f2 = polarAcceleration.strengthChannel.data[n3];
                float f3 = polarAcceleration.strengthChannel.data[n3 + 1];
                f2 = hk0_0.gb0(polarAcceleration.strengthValue, f, f3, f2);
                f3 = polarAcceleration.angularChannel.data[n4 + 2];
                float f4 = polarAcceleration.angularChannel.data[n4 + 3];
                float f5 = hk0_0.gb0(polarAcceleration.phiValue, f, f4, f3);
                PolarAcceleration polarAcceleration2 = this;
                f3 = polarAcceleration2.angularChannel.data[n4];
                f4 = polarAcceleration2.angularChannel.data[n4 + 1];
                float f6 = hk0_0.gb0(polarAcceleration2.thetaValue, f, f4, f3);
                f = LW.gc0(f6);
                f3 = LW.Om(f6);
                f4 = LW.gc0(f5);
                float f7 = LW.Om(f5);
                C8 c8 = TMP_V3;
                c8.x = f *= f7;
                c8.y = f4;
                c8.z = f3 *= f7;
                c8.KM().Fg0(f2);
                if (!polarAcceleration.isGlobal) {
                    Matrix4 matrix4 = this.controller.transform;
                    me0_2 me0_22 = TMP_Q;
                    boolean bl = true;
                    matrix4.getClass();
                    me0_22.et0(bl, matrix4);
                    c8.bm0(me0_22);
                }
                int n6 = n;
                int n7 = n3;
                PolarAcceleration polarAcceleration3 = this;
                ParallelArray.FloatChannel floatChannel = polarAcceleration3.directionalVelocityChannel;
                float[] fArray = floatChannel.data;
                fArray[n] = floatChannel.data[n] + c8.x;
                n3 = n + 1;
                fArray[n3] = floatChannel.data[n3] + c8.y;
                fArray[n += 2] = floatChannel.data[n] + c8.z;
                n3 = n7 + polarAcceleration3.strengthChannel.strideSize;
                n = n6 + floatChannel.strideSize;
                n4 += this.angularChannel.strideSize;
                n2 += this.lifeChannel.strideSize;
            }
        }

        @Override
        public PolarAcceleration copy() {
            return new PolarAcceleration(this);
        }
    }

    public static class CentripetalAcceleration
    extends Strength {
        ParallelArray.FloatChannel accelerationChannel;
        ParallelArray.FloatChannel positionChannel;

        public CentripetalAcceleration() {
        }

        public CentripetalAcceleration(CentripetalAcceleration centripetalAcceleration) {
            super(centripetalAcceleration);
        }

        @Override
        public void allocateChannels() {
            CentripetalAcceleration centripetalAcceleration = this;
            super.allocateChannels();
            centripetalAcceleration.accelerationChannel = (ParallelArray.FloatChannel)centripetalAcceleration.controller.particles.addChannel(ParticleChannels.Acceleration);
            centripetalAcceleration.positionChannel = (ParallelArray.FloatChannel)centripetalAcceleration.controller.particles.addChannel(ParticleChannels.Position);
        }

        @Override
        public void update() {
            float f = 0.0f;
            float f2 = 0.0f;
            float f3 = 0.0f;
            if (!this.isGlobal) {
                f = this.controller.transform.EW[12];
                f2 = this.controller.transform.EW[13];
                f3 = this.controller.transform.EW[14];
            }
            int n = 2;
            int n2 = 0;
            int n3 = 0;
            int n4 = 0;
            int n5 = 0;
            int n6 = this.controller.particles.size;
            while (n5 < n6) {
                int n7 = n;
                int n8 = n3;
                CentripetalAcceleration centripetalAcceleration = this;
                float f4 = centripetalAcceleration.strengthChannel.data[n2];
                float f5 = centripetalAcceleration.strengthChannel.data[n2 + 1];
                float f6 = hk0_0.gb0(centripetalAcceleration.strengthValue, this.lifeChannel.data[n], f5, f4);
                C8 c8 = TMP_V3;
                float[] fArray = this.positionChannel.data;
                float f7 = fArray[n3] - f;
                float f8 = fArray[n3 + 1] - f2;
                f5 = this.positionChannel.data[n3 + 2] - f3;
                c8.x = f7;
                c8.y = f8;
                c8.z = f5;
                c8.KM().Fg0(f6);
                ParallelArray.FloatChannel floatChannel = centripetalAcceleration.accelerationChannel;
                float[] fArray2 = floatChannel.data;
                fArray2[n4] = floatChannel.data[n4] + c8.x;
                n3 = n4 + 1;
                fArray2[n3] = floatChannel.data[n3] + c8.y;
                n3 = n4 + 2;
                fArray2[n3] = floatChannel.data[n3] + c8.z;
                ++n5;
                n3 = n8 + centripetalAcceleration.positionChannel.strideSize;
                n = n2 + this.strengthChannel.strideSize;
                n4 += floatChannel.strideSize;
                n2 = n7 + this.lifeChannel.strideSize;
                int n9 = n;
                n = n2;
                n2 = n9;
            }
        }

        @Override
        public CentripetalAcceleration copy() {
            return new CentripetalAcceleration(this);
        }
    }

    public static class Rotational3D
    extends Angular {
        ParallelArray.FloatChannel rotationChannel;
        ParallelArray.FloatChannel rotationalForceChannel;

        public Rotational3D() {
        }

        public Rotational3D(Rotational3D rotational3D) {
            super(rotational3D);
        }

        @Override
        public void allocateChannels() {
            Rotational3D rotational3D = this;
            super.allocateChannels();
            rotational3D.rotationChannel = (ParallelArray.FloatChannel)rotational3D.controller.particles.addChannel(ParticleChannels.Rotation3D);
            rotational3D.rotationalForceChannel = (ParallelArray.FloatChannel)rotational3D.controller.particles.addChannel(ParticleChannels.AngularVelocity3D);
        }

        @Override
        public void update() {
            int n = 0;
            int n2 = 2;
            int n3 = 0;
            int n4 = 0;
            int n5 = this.controller.particles.size * this.rotationalForceChannel.strideSize;
            while (n < n5) {
                int n6 = n;
                int n7 = n3;
                Rotational3D rotational3D = this;
                float f = rotational3D.lifeChannel.data[n2];
                float f2 = rotational3D.strengthChannel.data[n3];
                float f3 = rotational3D.strengthChannel.data[n3 + 1];
                f2 = hk0_0.gb0(rotational3D.strengthValue, f, f3, f2);
                f3 = rotational3D.angularChannel.data[n4 + 2];
                float f4 = rotational3D.angularChannel.data[n4 + 3];
                float f5 = hk0_0.gb0(rotational3D.phiValue, f, f4, f3);
                Rotational3D rotational3D2 = this;
                float f6 = rotational3D2.angularChannel.data[n4];
                f3 = rotational3D2.angularChannel.data[n4 + 1];
                float f7 = hk0_0.gb0(rotational3D2.thetaValue, f, f3, f6);
                f = LW.gc0(f7);
                f6 = LW.Om(f7);
                f3 = LW.gc0(f5);
                f4 = LW.Om(f5);
                C8 c8 = TMP_V3;
                float f8 = f2;
                C8 c82 = c8;
                f2 = f6 * f4;
                c8.x = f *= f4;
                c82.y = f3;
                c82.z = f2;
                c8.Fg0(f8 * ((float)Math.PI / 180));
                ParallelArray.FloatChannel floatChannel = rotational3D.rotationalForceChannel;
                float[] fArray = floatChannel.data;
                fArray[n] = floatChannel.data[n] + c8.x;
                n3 = n + 1;
                fArray[n3] = floatChannel.data[n3] + c8.y;
                fArray[n += 2] = floatChannel.data[n] + c8.z;
                n3 = n7 + rotational3D.strengthChannel.strideSize;
                n = n6 + floatChannel.strideSize;
                n4 += this.angularChannel.strideSize;
                n2 += this.lifeChannel.strideSize;
            }
        }

        @Override
        public Rotational3D copy() {
            return new Rotational3D(this);
        }
    }

    public static class Rotational2D
    extends Strength {
        ParallelArray.FloatChannel rotationalVelocity2dChannel;

        public Rotational2D() {
        }

        public Rotational2D(Rotational2D rotational2D) {
            super(rotational2D);
        }

        @Override
        public void allocateChannels() {
            Rotational2D rotational2D = this;
            super.allocateChannels();
            rotational2D.rotationalVelocity2dChannel = (ParallelArray.FloatChannel)rotational2D.controller.particles.addChannel(ParticleChannels.AngularVelocity2D);
        }

        @Override
        public void update() {
            int n = 0;
            int n2 = 2;
            int n3 = 0;
            int n4 = this.controller.particles.size * this.rotationalVelocity2dChannel.strideSize;
            while (n < n4) {
                Rotational2D rotational2D = this;
                float[] fArray = rotational2D.rotationalVelocity2dChannel.data;
                Rotational2D rotational2D2 = this;
                float f = fArray[n];
                float f2 = rotational2D2.strengthChannel.data[n3];
                float f3 = rotational2D2.strengthChannel.data[n3 + 1];
                rotational2D.rotationalVelocity2dChannel.data[n] = rotational2D2.strengthValue.getScale(this.lifeChannel.data[n2]) * f3 + f2 + f;
                n3 += rotational2D.strengthChannel.strideSize;
                n += this.rotationalVelocity2dChannel.strideSize;
                n2 += this.lifeChannel.strideSize;
            }
        }

        @Override
        public Rotational2D copy() {
            return new Rotational2D(this);
        }
    }

    public static abstract class Angular
    extends Strength {
        protected ParallelArray.FloatChannel angularChannel;
        public ScaledNumericValue thetaValue;
        public ScaledNumericValue phiValue;

        public Angular() {
            this.thetaValue = new ScaledNumericValue();
            this.phiValue = new ScaledNumericValue();
        }

        public Angular(Angular angular) {
            super(angular);
            this.thetaValue = new ScaledNumericValue();
            this.phiValue = new ScaledNumericValue();
            this.thetaValue.load(angular.thetaValue);
            this.phiValue.load(angular.phiValue);
        }

        @Override
        public void allocateChannels() {
            Angular angular = this;
            super.allocateChannels();
            ParallelArray.ChannelDescriptor channelDescriptor = ParticleChannels.Interpolation4;
            ParticleChannels.Interpolation4.id = this.controller.particleChannels.newId();
            angular.angularChannel = (ParallelArray.FloatChannel)angular.controller.particles.addChannel(channelDescriptor);
        }

        @Override
        public void activateParticles(int n, int n2) {
            int n3 = n2;
            int n4 = n;
            Angular angular = this;
            super.activateParticles(n, n2);
            n = angular.angularChannel.strideSize;
            n2 = n4 * n;
            n = n3 * n + n2;
            while (n2 < n) {
                Angular angular2 = this;
                float f = angular2.thetaValue.newLowValue();
                float f2 = angular2.thetaValue.newHighValue();
                if (!angular2.thetaValue.isRelative()) {
                    f2 -= f;
                }
                Angular angular3 = this;
                angular3.angularChannel.data[n2] = f;
                angular3.angularChannel.data[n2 + 1] = f2;
                f = angular3.phiValue.newLowValue();
                f2 = angular3.phiValue.newHighValue();
                if (!angular3.phiValue.isRelative()) {
                    f2 -= f;
                }
                ParallelArray.FloatChannel floatChannel = this.angularChannel;
                floatChannel.data[n2 + 2] = f;
                floatChannel.data[n2 + 3] = f2;
                n2 += floatChannel.strideSize;
            }
        }

        @Override
        public void write(gp_1 gp_12) {
            Angular angular = this;
            super.write(gp_12);
            gp_12.v80(angular.thetaValue, "thetaValue");
            gp_12.v80(this.phiValue, "phiValue");
        }

        @Override
        public void read(gp_1 json, oe_0 jsonData) {
            super.read(json, jsonData);
            this.thetaValue = (ScaledNumericValue)h4_0.Lpt6(json, jsonData, "thetaValue", ScaledNumericValue.class, null);
            this.phiValue = (ScaledNumericValue)json.b20(ScaledNumericValue.class, null, jsonData.Is("phiValue"));
        }
    }

    public static abstract class Strength
    extends DynamicsModifier {
        protected ParallelArray.FloatChannel strengthChannel;
        public ScaledNumericValue strengthValue;

        public Strength() {
            this.strengthValue = new ScaledNumericValue();
        }

        public Strength(Strength strength) {
            super(strength);
            this.strengthValue = new ScaledNumericValue();
            this.strengthValue.load(strength.strengthValue);
        }

        @Override
        public void allocateChannels() {
            Strength strength = this;
            super.allocateChannels();
            ParallelArray.ChannelDescriptor channelDescriptor = ParticleChannels.Interpolation;
            ParticleChannels.Interpolation.id = this.controller.particleChannels.newId();
            strength.strengthChannel = (ParallelArray.FloatChannel)strength.controller.particles.addChannel(channelDescriptor);
        }

        @Override
        public void activateParticles(int n, int n2) {
            int n3 = n2;
            int n4 = n;
            n = this.strengthChannel.strideSize;
            n2 = n4 * n;
            n = n3 * n + n2;
            while (n2 < n) {
                Strength strength = this;
                float f = strength.strengthValue.newLowValue();
                float f2 = strength.strengthValue.newHighValue();
                if (!strength.strengthValue.isRelative()) {
                    f2 -= f;
                }
                ParallelArray.FloatChannel floatChannel = this.strengthChannel;
                floatChannel.data[n2] = f;
                floatChannel.data[n2 + 1] = f2;
                n2 += floatChannel.strideSize;
            }
        }

        @Override
        public void write(gp_1 gp_12) {
            Strength strength = this;
            super.write(gp_12);
            gp_12.v80(strength.strengthValue, "strengthValue");
        }

        @Override
        public void read(gp_1 gp_12, oe_0 oe_02) {
            super.read(gp_12, oe_02);
            this.strengthValue = (ScaledNumericValue)h4_0.Lpt6(gp_12, oe_02, "strengthValue", ScaledNumericValue.class, null);
        }
    }

    public static class FaceDirection
    extends DynamicsModifier {
        ParallelArray.FloatChannel rotationChannel;
        ParallelArray.FloatChannel accellerationChannel;

        public FaceDirection() {
        }

        public FaceDirection(FaceDirection faceDirection) {
            super(faceDirection);
        }

        @Override
        public void allocateChannels() {
            FaceDirection faceDirection = this;
            faceDirection.rotationChannel = (ParallelArray.FloatChannel)faceDirection.controller.particles.addChannel(ParticleChannels.Rotation3D);
            faceDirection.accellerationChannel = (ParallelArray.FloatChannel)faceDirection.controller.particles.addChannel(ParticleChannels.Acceleration);
        }

        @Override
        public void update() {
            int n = 0;
            int n2 = 0;
            int n3 = this.controller.particles.size * this.rotationChannel.strideSize;
            while (n < n3) {
                C8 c8;
                int n4 = n2;
                int n5 = n;
                C8 c82 = TMP_V1;
                float[] fArray = this.accellerationChannel.data;
                float f = fArray[n2];
                float f2 = fArray[n2 + 1];
                float f3 = this.accellerationChannel.data[n2 + 2];
                c82.x = f;
                c82.y = f2;
                c82.z = f3;
                C8 c83 = c82.KM();
                c82 = TMP_V2.np(c82).Xv0(C8.Y).KM().Xv0(c82).KM();
                C8 c84 = c8 = TMP_V3;
                C8 c85 = c82;
                c8.getClass();
                float f4 = c85.x;
                f3 = c85.y;
                float f5 = c85.z;
                c84.x = f4;
                c84.y = f3;
                c84.z = f5;
                C8 c86 = c8.Xv0(c83).KM();
                me0_2 me0_22 = TMP_Q;
                float f6 = c86.x;
                float f7 = c82.x;
                float f8 = c83.x;
                f5 = c86.y;
                float f9 = c82.y;
                float f10 = c83.y;
                float f11 = c86.z;
                float f12 = c82.z;
                float f13 = c83.z;
                me0_22.WA0(false, f6, f7, f8, f5, f9, f10, f11, f12, f13);
                ParallelArray.FloatChannel floatChannel = this.rotationChannel;
                float[] fArray2 = floatChannel.data;
                fArray2[n] = me0_22.m1;
                n2 = n + 1;
                fArray2[n2] = me0_22.ao0;
                n2 = n + 2;
                fArray2[n2] = me0_22.th;
                floatChannel.data[n += 3] = me0_22.Au0;
                n = n5 + floatChannel.strideSize;
                n2 = n4 + this.accellerationChannel.strideSize;
            }
        }

        @Override
        public ParticleControllerComponent copy() {
            return new FaceDirection(this);
        }
    }
}

