/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.graphics.material.attribute;

import f.*;
import java.util.*;


import f.hf_1;

/*
 * Renamed from f.pr
 */
public class IntAttribute
extends BaseMaterialAttribute {
    public static final long av = hf_1.T20("cullface");
    public int ps;

    public IntAttribute(long l) {
        super(l);
    }

    public IntAttribute(long l, int n) {
        super(l);
        this.ps = n;
    }

    @Override
    public hf_1 pD0() {
        IntAttribute pr_12 = this;
        long l = pr_12.yO;
        int n = pr_12.ps;
        return new f.pr_1(l, n);
    }

    @Override
    public final int hashCode() {
        return this.YF * 7361687 + this.ps;
    }

    public final int compareTo(Object object) {
        object = (hf_1)object;
        long l = this.yO;
        long l2 = ((hf_1)object).yO;
        return l != l2 ? (int)(l - l2) : this.ps - ((IntAttribute)object).ps;
    }
}

