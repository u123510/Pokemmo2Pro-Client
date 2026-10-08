/*
 * Decompiled with CFR 0.152.
 */
package com.badlogic.gdx.graphics.g3d.particles.values;

import com.badlogic.gdx.graphics.g3d.particles.values.ParticleValue;
import f.gp_1;
import f.h4_0;
import f.oe_0;

public class LongNumericValue
extends ParticleValue {
    private long value;

    public long getValue() {
        return this.value;
    }

    public void setValue(long l) {
        this.value = l;
    }

    public void load(LongNumericValue longNumericValue) {
        super.load(longNumericValue);
        this.value = longNumericValue.value;
    }

    @Override
    public void write(gp_1 gp_12) {
        LongNumericValue longNumericValue = this;
        super.write(gp_12);
        gp_12.v80(longNumericValue.value, "value");
    }

    @Override
    public void read(gp_1 gp_12, oe_0 oe_02) {
        super.read(gp_12, oe_02);
        this.value = (Long)h4_0.Lpt6(gp_12, oe_02, "value", Long.class, null);
    }
}

