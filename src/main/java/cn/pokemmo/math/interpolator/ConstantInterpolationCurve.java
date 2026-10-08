package cn.pokemmo.math.interpolator;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import f.Fs;
import f.YA;
import f.br_1;
import f.nq_0;
import f.te0_0;

public class ConstantInterpolationCurve
extends BaseInterpolationCurve {
    @Override
    public final float H9(te0_0 te0_02) {
        YA yA = ((Fs)te0_02).tp0;
        float f = yA == null ? 0.0f : ((br_1)yA).dL0;
        return f;
    }
}
