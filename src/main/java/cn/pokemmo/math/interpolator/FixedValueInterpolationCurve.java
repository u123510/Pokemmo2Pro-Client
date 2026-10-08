package cn.pokemmo.math.interpolator;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import f.nq_0;
import f.te0_0;


public class FixedValueInterpolationCurve
extends BaseInterpolationCurve {
    public final float Qu0;

    public FixedValueInterpolationCurve(float f) {
        this.Qu0 = f;
    }

    @Override
    public final float H9(te0_0 te0_02) {
        return this.Qu0;
    }

    public final String toString() {
        return Float.toString(this.Qu0);
    }
}
