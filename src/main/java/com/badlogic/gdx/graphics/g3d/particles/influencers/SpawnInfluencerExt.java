package com.badlogic.gdx.graphics.g3d.particles.influencers;

import com.badlogic.gdx.graphics.g3d.particles.ParallelArray;
import com.badlogic.gdx.graphics.g3d.particles.ParticleChannels;
import com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent;
import com.badlogic.gdx.graphics.g3d.particles.ResourceData;
import com.badlogic.gdx.graphics.g3d.particles.values.PointSpawnShapeValueExt;
import com.badlogic.gdx.graphics.g3d.particles.values.SpawnShapeValueExt;
import f.C8;
import f.gp_1;
import f.h4_0;
import f.hd0_2;
import f.oe_0;

public class SpawnInfluencerExt extends Influencer {
    public SpawnShapeValueExt spawnShapeValue;
    ParallelArray.FloatChannel positionChannel;

    public SpawnInfluencerExt() {
        this.spawnShapeValue = new PointSpawnShapeValueExt();
    }

    public SpawnInfluencerExt(SpawnShapeValueExt spawnShapeValue) {
        this.spawnShapeValue = spawnShapeValue;
    }

    public SpawnInfluencerExt(SpawnInfluencerExt source) {
        this.spawnShapeValue = source.spawnShapeValue.copy();
    }

    @Override
    public void init() {
        this.spawnShapeValue.init();
    }

    @Override
    public void allocateChannels() {
        this.positionChannel = (ParallelArray.FloatChannel)this.controller.particles.addChannel(ParticleChannels.Position);
    }

    @Override
    public void start() {
        this.spawnShapeValue.start();
        this.spawnShapeValue.reSeed();
    }

    @Override
    public void activateParticles(int startIndex, int count) {
        int stride = this.positionChannel.strideSize;
        int offset = startIndex * stride;
        int end = count * stride + offset;
        while (offset < end) {
            int base = offset;
            C8 tmp = ParticleControllerComponent.TMP_V1;
            this.spawnShapeValue.spawn(tmp, this.controller.emitter.percent);
            tmp.cu(this.controller.transform);
            this.positionChannel.data[offset] = tmp.x;
            this.positionChannel.data[offset + 1] = tmp.y;
            this.positionChannel.data[offset + 2] = tmp.z;
            offset = base + this.positionChannel.strideSize;
        }
    }

    @Override
    public SpawnInfluencerExt copy() {
        return new SpawnInfluencerExt(this);
    }

    @Override
    public void write(gp_1 json) {
        json.sg(SpawnShapeValueExt.class, this.spawnShapeValue, "spawnShape");
    }

    @Override
    public void read(gp_1 json, oe_0 jsonData) {
        this.spawnShapeValue = (SpawnShapeValueExt)h4_0.Lpt6(json, jsonData, "spawnShape", SpawnShapeValueExt.class, null);
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
