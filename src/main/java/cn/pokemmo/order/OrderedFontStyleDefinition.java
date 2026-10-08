/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.order;

import f.*;

import f.Dn0;
import f.vs_2;

public class OrderedFontStyleDefinition
implements Comparable {
    public final String jH0;
    public final boolean J0;
    public final Dn0 jt;
    public final Dn0 h80;
    public final int Wg;

    public OrderedFontStyleDefinition(String string, vs_2 vs_22, boolean bl, int n, Dn0 dn0) {
        this.jH0 = string;
        this.jt = vs_22;
        this.h80 = dn0;
        this.J0 = bl;
        this.Wg = n;
    }

    public final boolean r() {
        if (!this.jt.RL()) {
            return false;
        }
        if (!this.jt.os0()) {
            return false;
        }
        if (!this.jt.wp("theme.xml").os0()) {
            return false;
        }
        Dn0 dn0 = this.h80;
        if (dn0 != null && !dn0.os0()) {
            return false;
        }
        dn0 = this.h80;
        return dn0 == null || dn0.RL() || this.h80.BN().equals("atlas");
    }

    public final String Yw() {
        return this.jH0;
    }

    public final String toString() {
        return this.jH0;
    }

    public final int compareTo(Object object) {
        object = (OrderedFontStyleDefinition)object;
        int n = !((OrderedFontStyleDefinition)object).jH0.equals("android") && !((OrderedFontStyleDefinition)object).jH0.equals("default") ? 0 : 1;
        boolean bl = this.jH0.equals("android") || this.jH0.equals("default");
        n = Boolean.compare(n != 0, bl);
        if (n == 0) {
            n = this.jH0.compareTo(((OrderedFontStyleDefinition)object).jH0);
        }
        return n;
    }
}

