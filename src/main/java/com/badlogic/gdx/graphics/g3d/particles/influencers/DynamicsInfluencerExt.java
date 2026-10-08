package com.badlogic.gdx.graphics.g3d.particles.influencers;

import com.badlogic.gdx.graphics.g3d.particles.ParallelArray;
import com.badlogic.gdx.graphics.g3d.particles.ParticleChannels;
import com.badlogic.gdx.graphics.g3d.particles.ParticleController;
import com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent;
import com.badlogic.gdx.graphics.g3d.particles.values.NumericValue;
import f.LW;
import f.es_1;
import f.fe_2;
import f.gp_1;
import f.h4_0;
import f.me0_2;
import f.oe_0;
import java.util.Arrays;

public class DynamicsInfluencerExt extends DynamicsInfluencer {
    private ParallelArray.FloatChannel accellerationChannel;
    private ParallelArray.FloatChannel positionChannel;
    private ParallelArray.FloatChannel previousPositionChannel;
    private ParallelArray.FloatChannel rotationChannel;
    private ParallelArray.FloatChannel angularVelocityChannel;
    public NumericValue dampFactor;

    public DynamicsInfluencerExt() {
        this.velocities = new es_1(true, 3, DynamicsModifier.class);
        this.dampFactor = new NumericValue();
        this.dampFactor.setValue(1.0f);
    }

    public DynamicsInfluencerExt(DynamicsModifier... velocities) {
        this.velocities = new es_1(true, velocities.length, DynamicsModifier.class);
        this.dampFactor = new NumericValue();
        this.dampFactor.setValue(1.0f);
        for (DynamicsModifier velocity : velocities) {
            this.velocities.Ue0((DynamicsModifier)velocity.copy());
        }
    }

    public DynamicsInfluencerExt(DynamicsInfluencerExt source) {
        this((DynamicsModifier[])source.velocities.Mo0(DynamicsModifier.class));
        this.dampFactor.setValue(source.dampFactor.getValue());
    }

    @Override
    public void set(ParticleController particleController) {
        this.controller = particleController;
        for (int i = 0; i < this.velocities.KB; ++i) {
            ((DynamicsModifier[])this.velocities.rZ)[i].set(particleController);
        }
    }

    @Override
    public void allocateChannels() {
        for (int i = 0; i < this.velocities.KB; ++i) {
            ((DynamicsModifier[])this.velocities.rZ)[i].allocateChannels();
        }

        this.accellerationChannel = (ParallelArray.FloatChannel)this.controller.particles.getChannel(ParticleChannels.Acceleration);
        this.hasAcceleration = this.accellerationChannel != null;
        if (this.hasAcceleration) {
            this.positionChannel = (ParallelArray.FloatChannel)this.controller.particles.addChannel(ParticleChannels.Position);
            this.previousPositionChannel = (ParallelArray.FloatChannel)this.controller.particles.addChannel(ParticleChannels.PreviousPosition);
        }

        this.angularVelocityChannel = (ParallelArray.FloatChannel)this.controller.particles.getChannel(ParticleChannels.AngularVelocity2D);
        this.has2dAngularVelocity = this.angularVelocityChannel != null;
        if (this.has2dAngularVelocity) {
            this.rotationChannel = (ParallelArray.FloatChannel)this.controller.particles.addChannel(ParticleChannels.Rotation2D);
            this.has3dAngularVelocity = false;
        } else {
            this.angularVelocityChannel = (ParallelArray.FloatChannel)this.controller.particles.getChannel(ParticleChannels.AngularVelocity3D);
            this.has3dAngularVelocity = this.angularVelocityChannel != null;
            if (this.has3dAngularVelocity) {
                this.rotationChannel = (ParallelArray.FloatChannel)this.controller.particles.addChannel(ParticleChannels.Rotation3D);
            }
        }
    }

    @Override
    public void init() {
        for (int i = 0; i < this.velocities.KB; ++i) {
            ((DynamicsModifier[])this.velocities.rZ)[i].init();
        }
    }

    @Override
    public void activateParticles(int startIndex, int count) {
        if (this.hasAcceleration) {
            int stride = this.positionChannel.strideSize;
            int offset = startIndex * stride;
            int end = count * stride + offset;
            while (offset < end) {
                int base = offset;
                this.previousPositionChannel.data[offset] = this.positionChannel.data[offset];
                this.previousPositionChannel.data[offset + 1] = this.positionChannel.data[offset + 1];
                this.previousPositionChannel.data[offset + 2] = this.positionChannel.data[offset + 2];
                offset = base + this.positionChannel.strideSize;
            }
        }

        if (this.has2dAngularVelocity) {
            int stride = this.rotationChannel.strideSize;
            int offset = startIndex * stride;
            int end = count * stride + offset;
            while (offset < end) {
                this.rotationChannel.data[offset] = 1.0f;
                this.rotationChannel.data[offset + 1] = 0.0f;
                offset += this.rotationChannel.strideSize;
            }
        } else if (this.has3dAngularVelocity) {
            int stride = this.rotationChannel.strideSize;
            int offset = startIndex * stride;
            int end = count * stride + offset;
            while (offset < end) {
                this.rotationChannel.data[offset] = 0.0f;
                this.rotationChannel.data[offset + 1] = 0.0f;
                this.rotationChannel.data[offset + 2] = 0.0f;
                this.rotationChannel.data[offset + 3] = 1.0f;
                offset += this.rotationChannel.strideSize;
            }
        }

        for (int i = 0; i < this.velocities.KB; ++i) {
            ((DynamicsModifier[])this.velocities.rZ)[i].activateParticles(startIndex, count);
        }
    }

    @Override
    public void update() {
        if (this.hasAcceleration) {
            Arrays.fill(this.accellerationChannel.data, 0, this.controller.particles.size * this.accellerationChannel.strideSize, 0.0f);
        }
        if (this.has2dAngularVelocity || this.has3dAngularVelocity) {
            Arrays.fill(this.angularVelocityChannel.data, 0, this.controller.particles.size * this.angularVelocityChannel.strideSize, 0.0f);
        }

        for (int i = 0; i < this.velocities.KB; ++i) {
            ((DynamicsModifier[])this.velocities.rZ)[i].update();
        }

        if (this.hasAcceleration) {
            int offset = 0;
            for (int i = 0; i < this.controller.particles.size; ++i) {
                float x = this.positionChannel.data[offset];
                int yOffset = offset + 1;
                float y = this.positionChannel.data[yOffset];
                int zOffset = offset + 2;
                float z = this.positionChannel.data[zOffset];
                float damp = this.dampFactor.getValue();
                float dt2 = this.controller.deltaTimeSqr;
                this.positionChannel.data[offset] = this.accellerationChannel.data[offset] * dt2 + fe_2.Ga0(x, this.previousPositionChannel.data[offset], damp, x);
                this.positionChannel.data[yOffset] = this.accellerationChannel.data[yOffset] * dt2 + fe_2.Ga0(y, this.previousPositionChannel.data[yOffset], damp, y);
                this.positionChannel.data[zOffset] = this.accellerationChannel.data[zOffset] * dt2 + fe_2.Ga0(z, this.previousPositionChannel.data[zOffset], damp, z);
                this.previousPositionChannel.data[offset] = x;
                this.previousPositionChannel.data[yOffset] = y;
                this.previousPositionChannel.data[zOffset] = z;
                offset += this.positionChannel.strideSize;
            }
        }

        if (this.has2dAngularVelocity) {
            int rotationOffset = 0;
            for (int i = 0; i < this.controller.particles.size; ++i) {
                float rotation = this.angularVelocityChannel.data[i] * this.controller.deltaTime;
                if (rotation != 0.0f) {
                    float cos = LW.gc0(rotation);
                    float sin = LW.Om(rotation);
                    float currentCos = this.rotationChannel.data[rotationOffset];
                    int sineOffset = rotationOffset + 1;
                    float currentSin = this.rotationChannel.data[sineOffset];
                    this.rotationChannel.data[rotationOffset] = currentCos * cos - currentSin * sin;
                    this.rotationChannel.data[sineOffset] = currentCos * sin + currentSin * cos;
                }
                rotationOffset += this.rotationChannel.strideSize;
            }
        } else if (this.has3dAngularVelocity) {
            int rotationOffset = 0;
            int angularOffset = 0;
            for (int i = 0; i < this.controller.particles.size; ++i) {
                float wx = this.angularVelocityChannel.data[angularOffset];
                float wy = this.angularVelocityChannel.data[angularOffset + 1];
                float wz = this.angularVelocityChannel.data[angularOffset + 2];
                float qx = this.rotationChannel.data[rotationOffset];
                int qyOffset = rotationOffset + 1;
                float qy = this.rotationChannel.data[qyOffset];
                int qzOffset = rotationOffset + 2;
                float qz = this.rotationChannel.data[qzOffset];
                int qwOffset = rotationOffset + 3;
                float qw = this.rotationChannel.data[qwOffset];

                me0_2 tmp = ParticleControllerComponent.TMP_Q;
                tmp.m1 = wx;
                tmp.ao0 = wy;
                tmp.th = wz;
                tmp.Au0 = 0.0f;
                tmp.Z80(qx, qy, qz, qw);
                float halfDt = this.controller.deltaTime * 0.5f;
                tmp.m1 = tmp.m1 * halfDt + qx;
                tmp.ao0 = tmp.ao0 * halfDt + qy;
                tmp.th = tmp.th * halfDt + qz;
                tmp.Au0 = tmp.Au0 * halfDt + qw;
                tmp.Cx();

                this.rotationChannel.data[rotationOffset] = tmp.m1;
                this.rotationChannel.data[qyOffset] = tmp.ao0;
                this.rotationChannel.data[qzOffset] = tmp.th;
                this.rotationChannel.data[qwOffset] = tmp.Au0;
                rotationOffset += this.rotationChannel.strideSize;
                angularOffset += this.angularVelocityChannel.strideSize;
            }
        }
    }

    @Override
    public DynamicsInfluencerExt copy() {
        return new DynamicsInfluencerExt(this);
    }

    @Override
    public void write(gp_1 json) {
        json.A2("velocities", this.velocities, es_1.class, DynamicsModifier.class);
        json.sg(NumericValue.class, this.dampFactor, "damp");
    }

    @Override
    public void read(gp_1 json, oe_0 jsonData) {
        es_1 loaded = (es_1)h4_0.Lpt6(json, jsonData, "velocities", es_1.class, DynamicsModifier.class);
        if (loaded != null) {
            this.velocities.G6(loaded.rZ, 0, loaded.KB);
        }
        if (jsonData.UJ0("damp")) {
            this.dampFactor = (NumericValue)json.b20(NumericValue.class, null, jsonData.Is("damp"));
        }
    }
}
