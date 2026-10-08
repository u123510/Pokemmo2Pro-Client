/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.order;

import f.*;

/*
 * Renamed from f.qP
 */
public class OrderedSequenceToken
implements Comparable {
    public final int sJ;
    public int tn;

    public OrderedSequenceToken(int n) {
        this.sJ = n;
    }

    public final int compareTo(Object object) {
        int n = this.tn;
        int n2 = ((OrderedSequenceToken)object).tn;
        n2 = n == n2 ? 0 : (n2 > n ? 1 : -1);
        return n2;
    }
}

