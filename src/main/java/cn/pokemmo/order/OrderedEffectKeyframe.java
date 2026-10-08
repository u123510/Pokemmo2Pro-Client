/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.order;

import f.*;

/*
 * Renamed from f.a40
 */
public class OrderedEffectKeyframe
implements Comparable {
    public final byte hV;
    public final float mh;
    public final int bG;

    public OrderedEffectKeyframe(byte by, float f, int n) {
        this.hV = by;
        this.mh = f;
        this.bG = n;
    }

    public final int compareTo(Object object) {
        int n;
        int n2;
        float f;
        float f2;
        object = (OrderedEffectKeyframe)object;
        byte by = ((OrderedEffectKeyframe)object).hV;
        byte by2 = this.hV;
        return by != by2 ? by - by2 : ((f2 = ((OrderedEffectKeyframe)object).mh) != (f = this.mh) ? Float.compare(f2, f) : ((n2 = ((OrderedEffectKeyframe)object).bG) != (n = this.bG) ? n2 - n : 0));
    }
}

