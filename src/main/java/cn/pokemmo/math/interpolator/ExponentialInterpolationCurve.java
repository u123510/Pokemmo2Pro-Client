package cn.pokemmo.math.interpolator;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import f.nq_0;
import f.ro0_0;
import f.te0_0;

public class ExponentialInterpolationCurve
extends BaseInterpolationCurve {
    @Override
    public final float H9(te0_0 te0_02) {
        if (te0_02 instanceof ro0_0) {
            ((ro0_0)((Object)te0_02)).Gu();
            return 0.0f;
        }
        float f = te0_02 == null ? 0.0f : te0_02.E20;
        return f;
    }
}
