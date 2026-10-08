/*
 * Decompiled with CFR 0.152.
 */
package com.badlogic.gdx.graphics.g3d.particles.values;

import f.VD0;
import f.gp_1;
import f.h4_0;
import f.oe_0;

public class ParticleValue
implements VD0 {
    public boolean active;

    public ParticleValue() {
    }

    public ParticleValue(ParticleValue particleValue) {
        this.active = particleValue.active;
    }

    public boolean isActive() {
        return this.active;
    }

    public void setActive(boolean bl) {
        this.active = bl;
    }

    public void load(ParticleValue particleValue) {
        this.active = particleValue.active;
    }

    @Override
    public void write(gp_1 gp_12) {
        gp_12.v80(this.active, "active");
    }

    @Override
    public void read(gp_1 gp_12, oe_0 oe_02) {
        this.active = (Boolean)h4_0.Lpt6(gp_12, oe_02, "active", Boolean.class, null);
    }
}

