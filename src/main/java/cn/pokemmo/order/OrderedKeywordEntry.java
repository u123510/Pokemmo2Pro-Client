/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.order;

import f.*;

/*
 * Renamed from f.ft
 */
public class OrderedKeywordEntry
implements Comparable {
    public final String So;
    public final boolean Mg0;

    public OrderedKeywordEntry(String string, boolean bl) {
        this.So = string;
        this.Mg0 = bl;
    }

    public final int compareTo(Object object) {
        object = (OrderedKeywordEntry)object;
        int n = ((OrderedKeywordEntry)object).Mg0 ? 1 : 0;
        int n2 = this.Mg0 ? 1 : 0;
        return n != n2 ? n - n2 : this.So.compareTo(((OrderedKeywordEntry)object).So);
    }
}

