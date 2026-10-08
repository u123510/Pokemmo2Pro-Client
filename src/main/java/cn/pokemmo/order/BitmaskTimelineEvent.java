/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.order;

import f.*;

import f.es_1;
import f.nf_1;
import f.xq_1;

/*
 * Renamed from f.hF
 */
public abstract class BitmaskTimelineEvent
implements Comparable {
    public static final es_1 hg = new es_1();
    public final long yO;
    public final int YF;

    public static final long T20(String string) {
        long l;
        es_1 es_12;
        block4: {
            int n = 0;
            while (true) {
                es_12 = hg;
                if (n >= es_12.KB) break;
                if (((String)es_12.get(n)).compareTo(string) == 0) {
                    l = 1L << n;
                    break block4;
                }
                ++n;
            }
            l = 0L;
        }
        if (l > 0L) {
            return l;
        }
        if (es_12.KB < 64) {
            es_1 es_13 = es_12;
            es_13.Ue0(string);
            int n = es_13.KB - 1;
            return 1L << n;
        }
        throw new nf_1(xq_1.pz0("Cannot register ", string, ", maximum registered attribute count reached."));
    }

    public BitmaskTimelineEvent(long l) {
        this.yO = l;
        this.YF = Long.numberOfTrailingZeros(l);
    }

    public abstract BitmaskTimelineEvent pD0();

    public final boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (object == this) {
            return true;
        }
        if (!(object instanceof BitmaskTimelineEvent)) {
            return false;
        }
        object = (BitmaskTimelineEvent)object;
        if (this.yO != ((BitmaskTimelineEvent)object).yO) {
            return false;
        }
        return ((BitmaskTimelineEvent)object).hashCode() == this.hashCode();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final String toString() {
        long l = this.yO;
        int n = -1;
        while (l != 0L && ++n < 63 && (l >> n & 1L) == 0L) {
        }
        if (n < 0) return null;
        es_1 es_12 = hg;
        if (n >= es_12.KB) return null;
        String string = (String)es_12.get(n);
        return string;
    }

    public int hashCode() {
        return this.YF * 7489;
    }
}

