/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.order;

import f.*;

import f.CH0;
import f.wp_0;

/*
 * Renamed from f.ad
 */
public class OrderedTransitionSegment
implements Comparable {
    public final CH0 y60;
    public final int ly0;
    public final int Bf;
    public final wp_0[] d4;

    public OrderedTransitionSegment(CH0 cH0, int n, int n2, wp_0 ... wp_0Array) {
        this.y60 = cH0;
        this.ly0 = n;
        this.Bf = n2;
        this.d4 = wp_0Array;
    }

    public final boolean equals(Object object) {
        if (object instanceof OrderedTransitionSegment) {
            object = (OrderedTransitionSegment)object;
            if (this.y60.equals(((OrderedTransitionSegment)object).y60) && this.ly0 == ((OrderedTransitionSegment)object).ly0) {
                wp_0[] wp_0Array = this.d4;
                if (this.d4.length == ((OrderedTransitionSegment)object).d4.length && this.Bf == ((OrderedTransitionSegment)object).Bf) {
                    block0: for (wp_0 wp_02 : wp_0Array) {
                        wp_0[] wp_0Array2 = ((OrderedTransitionSegment)object).d4;
                        int n = ((OrderedTransitionSegment)object).d4.length;
                        for (int j = 0; j < n; ++j) {
                            if (!wp_0Array2[j].eU().equals(wp_02.eU())) continue;
                            continue block0;
                        }
                        return false;
                    }
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public final int compareTo(Object object) {
        object = (OrderedTransitionSegment)object;
        int n = ((OrderedTransitionSegment)object).ly0 - this.ly0;
        if (n == 0) {
            n = this.Bf - ((OrderedTransitionSegment)object).Bf;
        }
        return n;
    }
}

