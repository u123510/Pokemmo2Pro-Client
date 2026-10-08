/*
 * Decompiled with CFR 0.152.
 */
package com.badlogic.gdx.graphics.g3d.particles.values;

import com.badlogic.gdx.graphics.g3d.particles.values.ParticleValue;
import f.gp_1;
import f.h4_0;
import f.oe_0;

public class NumericValue
extends ParticleValue {
    private float value;

    public float getValue() {
        return this.value;
    }

    public void setValue(float f) {
        this.value = f;
    }

    public void load(NumericValue numericValue) {
        super.load(numericValue);
        this.value = numericValue.value;
    }

    @Override
    public void write(gp_1 gp_12) {
        NumericValue numericValue = this;
        super.write(gp_12);
        gp_12.v80(Float.valueOf(numericValue.value), "value");
    }

    @Override
    public void read(gp_1 gp_12, oe_0 oe_02) {
        super.read(gp_12, oe_02);
        this.value = ((Float)h4_0.Lpt6(gp_12, oe_02, "value", Float.TYPE, null)).floatValue();
    }
}

