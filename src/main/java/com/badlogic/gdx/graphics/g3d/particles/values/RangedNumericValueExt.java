/*
 * Decompiled with CFR 0.152.
 */
package com.badlogic.gdx.graphics.g3d.particles.values;

import com.badlogic.gdx.graphics.g3d.particles.values.RangedNumericValue;
import f.O00;
import java.util.Random;

public class RangedNumericValueExt
extends RangedNumericValue {
    private static final Random random = new O00();

    @Override
    public float newLowValue() {
        RangedNumericValueExt rangedNumericValueExt = this;
        float f = rangedNumericValueExt.getLowMin();
        return random.nextFloat() * (rangedNumericValueExt.getLowMax() - this.getLowMin()) + f;
    }

    public void setSeed(long l) {
        random.setSeed(l);
    }
}

