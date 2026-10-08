package com.badlogic.gdx.graphics.g3d.particles.influencers;

import com.badlogic.gdx.graphics.g3d.particles.ResourceData;
import com.badlogic.gdx.graphics.g3d.particles.values.NumericValue;
import f.C8;
import f.T3;
import f.co_1;
import f.gp_1;
import f.h4_0;
import f.hd0_2;
import f.oe_0;
import f.ri_0;

public class ControllerSpawnInfluencer extends Influencer {
    private C8 spawnPosition;
    public C8 spawnAdjustment;
    public NumericValue spawnType;
    public boolean invertSpawn;
    public C8 rotationAdjustment;

    public ControllerSpawnInfluencer() {
        this.spawnPosition = new C8(4.0f, 3.0f, 0.0f);
        this.spawnAdjustment = new C8(0.0f, 0.0f, 0.0f);
        this.rotationAdjustment = new C8(0.0f, 0.0f, 0.0f);
        this.spawnType = new NumericValue();
        this.invertSpawn = false;
    }

    public ControllerSpawnInfluencer(ControllerSpawnInfluencer source) {
        this.spawnPosition = source.spawnPosition.q40();
        this.spawnAdjustment = source.spawnAdjustment.q40();
        this.rotationAdjustment = source.rotationAdjustment.q40();
        this.invertSpawn = source.invertSpawn;
        this.spawnType = new NumericValue();
        this.spawnType.setValue(source.spawnType.getValue());
    }

    @Override
    public void init() {
    }

    @Override
    public void allocateChannels() {
    }

    public void setSpawnPosition(C8 spawnPosition) {
        this.spawnPosition = spawnPosition;
    }

    @Override
    public void start() {
        float type = this.spawnType.getValue();
        if (type == 0.0f) {
            this.spawnPosition = T3.hf(co_1.Kl0, co_1.Kl0);
        } else if (type == 1.0f) {
            this.spawnPosition = T3.hf(co_1.cOm6, co_1.cOm6);
        } else if (type == 2.0f) {
            this.spawnPosition.rB0();
        } else if (type == 3.0f) {
            this.spawnPosition = T3.hf(co_1.XZ, co_1.XZ);
        } else if (type == 4.0f) {
            this.spawnPosition = T3.hf(co_1.OK, co_1.OK);
        }

        if (this.invertSpawn && co_1.Xh == ri_0.pN) {
            C8 adjustment = this.spawnAdjustment;
            this.spawnPosition.na(-adjustment.x, adjustment.y, -adjustment.z);
        } else {
            C8 adjustment = this.spawnAdjustment;
            this.spawnPosition.na(adjustment.x, adjustment.y, adjustment.z);
        }

        this.controller.transform.IW(this.spawnPosition);
        this.controller.transform.tO(C8.Z, this.rotationAdjustment.z);
        this.controller.transform.tO(C8.Y, this.rotationAdjustment.y);
        this.controller.transform.tO(C8.X, this.rotationAdjustment.x);
    }

    @Override
    public void activateParticles(int startIndex, int count) {
    }

    @Override
    public ControllerSpawnInfluencer copy() {
        return new ControllerSpawnInfluencer(this);
    }

    @Override
    public void write(gp_1 json) {
        json.sg(NumericValue.class, this.spawnType, "spawnType");
        json.sg(Boolean.class, Boolean.valueOf(this.invertSpawn), "invertSpawn");
        json.sg(C8.class, this.spawnAdjustment, "spawnAdjustment");
        json.sg(C8.class, this.rotationAdjustment, "rotationAdjustment");
    }

    @Override
    public void read(gp_1 json, oe_0 jsonData) {
        this.spawnType = (NumericValue)h4_0.Lpt6(json, jsonData, "spawnType", NumericValue.class, null);
        if (jsonData.UJ0("spawnAdjustment")) {
            this.spawnAdjustment = (C8)json.b20(C8.class, null, jsonData.Is("spawnAdjustment"));
        }
        if (jsonData.UJ0("rotationAdjustment")) {
            this.rotationAdjustment = (C8)json.b20(C8.class, null, jsonData.Is("rotationAdjustment"));
        }
        if (jsonData.UJ0("invertSpawn")) {
            this.invertSpawn = ((Boolean)json.b20(Boolean.class, null, jsonData.Is("invertSpawn"))).booleanValue();
        }
    }

    @Override
    public void save(hd0_2 manager, ResourceData resources) {
    }

    @Override
    public void load(hd0_2 manager, ResourceData resources) {
    }
}
