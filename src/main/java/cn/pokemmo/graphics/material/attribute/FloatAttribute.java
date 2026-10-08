/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.graphics.material.attribute;

import f.*;
import java.util.*;


import f.LW;
import f.hf_1;

/*
 * Renamed from f.mb0
 */
public class FloatAttribute
extends BaseMaterialAttribute {
    public static final long an0 = hf_1.T20("shininess");
    public static final long k6 = hf_1.T20("alphaTest");
    public static /* synthetic */ int eB0;
    public float LL0;

    public FloatAttribute(long l) {
        super(l);
    }

    public FloatAttribute(long l, float f) {
        super(l);
        this.LL0 = f;
    }

    @Override
    public hf_1 pD0() {
        FloatAttribute mb0_22 = this;
        long l = mb0_22.yO;
        float f = mb0_22.LL0;
        return new f.mb0_2(l, f);
    }

    @Override
    public final int hashCode() {
        FloatAttribute mb0_22 = this;
        int n = mb0_22.YF * 7316753;
        return Float.floatToRawIntBits(mb0_22.LL0) + n;
    }

    public final int compareTo(Object object) {
        float f;
        object = (hf_1)object;
        long l = this.yO;
        long l2 = ((hf_1)object).yO;
        int n = l != l2 ? (int)(l - l2) : (LW.LH0(this.LL0, f = ((FloatAttribute)object).LL0) ? 0 : (this.LL0 < f ? -1 : 1));
        return n;
    }
}

