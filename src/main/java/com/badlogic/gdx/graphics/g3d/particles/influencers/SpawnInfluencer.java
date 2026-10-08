package com.badlogic.gdx.graphics.g3d.particles.influencers;

import com.badlogic.gdx.graphics.g3d.particles.ParallelArray;
import com.badlogic.gdx.graphics.g3d.particles.ParticleChannels;
import com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent;
import com.badlogic.gdx.graphics.g3d.particles.ResourceData;
import com.badlogic.gdx.graphics.g3d.particles.values.PointSpawnShapeValue;
import com.badlogic.gdx.graphics.g3d.particles.values.SpawnShapeValue;
import f.gp_1;
import f.h4_0;
import f.hd0_2;
import f.oe_0;

public class SpawnInfluencer extends Influencer {
    public SpawnShapeValue spawnShapeValue;
    ParallelArray.FloatChannel positionChannel;
    ParallelArray.FloatChannel rotationChannel;

    public SpawnInfluencer() {
        this.spawnShapeValue = new PointSpawnShapeValue();
    }

    public SpawnInfluencer(SpawnShapeValue spawnShapeValue) {
        this.spawnShapeValue = spawnShapeValue;
    }

    public SpawnInfluencer(SpawnInfluencer source) {
        this.spawnShapeValue = source.spawnShapeValue.copy();
    }

    @Override
    public void init() {
        this.spawnShapeValue.init();
    }

    @Override
    public void allocateChannels() {
        this.positionChannel = (ParallelArray.FloatChannel)this.controller.particles.addChannel(ParticleChannels.Position);
        this.rotationChannel = (ParallelArray.FloatChannel)this.controller.particles.addChannel(ParticleChannels.Rotation3D);
    }

    @Override
    public void start() {
        this.spawnShapeValue.start();
    }

    @Override
    public void activateParticles(int startIndex, int count) {
        int positionStride = this.positionChannel.strideSize;
        int i = startIndex * positionStride;
        int end = count * positionStride + i;
        while (i < end) {
            int base = i;
            this.spawnShapeValue.spawn(ParticleControllerComponent.TMP_V1, this.controller.emitter.percent);
            ParticleControllerComponent.TMP_V1.cu(this.controller.transform);
            this.positionChannel.data[i] = ParticleControllerComponent.TMP_V1.x;
            this.positionChannel.data[i + 1] = ParticleControllerComponent.TMP_V1.y;
            this.positionChannel.data[i + 2] = ParticleControllerComponent.TMP_V1.z;
            i = base + this.positionChannel.strideSize;
        }

        int rotationStride = this.rotationChannel.strideSize;
        i = startIndex * rotationStride;
        end = count * rotationStride + i;
        while (i < end) {
            int base = i;
            ParticleControllerComponent.TMP_Q.et0(true, this.controller.transform);
            this.rotationChannel.data[i] = ParticleControllerComponent.TMP_Q.m1;
            this.rotationChannel.data[i + 1] = ParticleControllerComponent.TMP_Q.ao0;
            this.rotationChannel.data[i + 2] = ParticleControllerComponent.TMP_Q.th;
            this.rotationChannel.data[i + 3] = ParticleControllerComponent.TMP_Q.Au0;
            i = base + this.rotationChannel.strideSize;
        }
    }

    @Override
    public SpawnInfluencer copy() {
        return new SpawnInfluencer(this);
    }

    @Override
    public void write(gp_1 json) {
        json.sg(SpawnShapeValue.class, this.spawnShapeValue, "spawnShape");
    }

    @Override
    public void read(gp_1 json, oe_0 jsonData) {
        this.spawnShapeValue = (SpawnShapeValue)h4_0.Lpt6(json, jsonData, "spawnShape", SpawnShapeValue.class, null);
    }

    @Override
    public void save(hd0_2 manager, ResourceData resources) {
        this.spawnShapeValue.save(manager, resources);
    }

    @Override
    public void load(hd0_2 manager, ResourceData resources) {
        this.spawnShapeValue.load(manager, resources);
    }
}
