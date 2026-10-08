/*
 * Decompiled with CFR 0.152.
 */
package com.badlogic.gdx.graphics.g3d.particles.values;

import com.badlogic.gdx.graphics.g3d.particles.values.ScaledNumericValue;
import f.O00;
import java.util.Random;

public class ScaledNumericValueExt
extends ScaledNumericValue {
    private static Random random = new O00();

    @Override
    public float newHighValue() {
        ScaledNumericValueExt scaledNumericValueExt = this;
        float f = scaledNumericValueExt.getHighMin();
        return random.nextFloat() * (scaledNumericValueExt.getHighMax() - this.getHighMin()) + f;
    }

    @Override
    public float newLowValue() {
        ScaledNumericValueExt scaledNumericValueExt = this;
        float f = scaledNumericValueExt.getLowMin();
        return random.nextFloat() * (scaledNumericValueExt.getLowMax() - this.getLowMin()) + f;
    }

    public void setSeed(long l) {
        random.setSeed(l);
    }
}

