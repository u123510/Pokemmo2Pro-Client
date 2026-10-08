/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.ui.easing;

import f.*;
import java.util.*;

import f.by_0;

/*
 * Renamed from f.gd0
 */
public class LinearInterpolation extends BaseInterpolation {
    public final float F0(float f) {
        float f2 = f;
        float f3 = f2 * f2 * f;
        return ((f2 * 6.0f - 15.0f) * f + 10.0f) * f3;
    }
}

