package cn.pokemmo.collection.list;

import f.es_1;
import f.hf_1;
import java.util.Comparator;
import java.util.Iterator;

public class TimedEventSequence implements Iterable, Comparator, Comparable {
    public long ni0;
    public final es_1 VH;
    public boolean Yz0;

    public TimedEventSequence() {
        this.VH = new es_1();
        this.Yz0 = true;
    }

    public final void kV() {
        if (!this.Yz0) {
            this.VH.sort(this);
            this.Yz0 = true;
        }
    }

    public final long N30() {
        return this.ni0;
    }

    public final hf_1 sg(long j) {
        if (tM(j)) {
            for (int i = 0; i < this.VH.KB; i++) {
                if (((hf_1) this.VH.get(i)).yO == j) {
                    return (hf_1) this.VH.get(i);
                }
            }
        }
        return null;
    }

    public final hf_1 Qy(long j) {
        return sg(j);
    }

    public final void LPT8(hf_1 hf_1) {
        long j = hf_1.yO;
        int i = -1;
        if (tM(j)) {
            for (int k = 0; k < this.VH.KB; k++) {
                if (((hf_1) this.VH.get(k)).yO == j) {
                    i = k;
                    break;
                }
            }
        }
        if (i < 0) {
            this.ni0 |= hf_1.yO;
            this.VH.Ue0(hf_1);
            this.Yz0 = false;
        } else {
            this.VH.c0(i, hf_1);
        }
        kV();
    }

    public final void uk(hf_1... hf_1Arr) {
        for (hf_1 hf_1 : hf_1Arr) {
            LPT8(hf_1);
        }
    }

    public final void zc(Iterable iterable) {
        for (Object obj : iterable) {
            LPT8((hf_1) obj);
        }
    }

    public final void fR(long j) {
        for (int i = this.VH.KB - 1; i >= 0; i--) {
            long mask = ((hf_1) this.VH.get(i)).yO;
            if ((j & mask) == mask) {
                this.VH.Tx0(i);
                this.ni0 &= ~mask;
                this.Yz0 = false;
            }
        }
        kV();
    }

    public final boolean tM(long j) {
        return j != 0L && (this.ni0 & j) == j;
    }

    @Override
    public Iterator iterator() {
        return this.VH.ZD();
    }

    @Override
    public int hashCode() {
        kV();
        int size = this.VH.KB;
        long h = this.ni0 + 71L;
        int k = 1;
        for (int i = 0; i < size; i++) {
            k = (k * 7) & 0xFFFF;
            h += this.ni0 * (long) ((hf_1) this.VH.get(i)).hashCode() * (long) k;
        }
        return (int) (h ^ (h >>> 32));
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof TimedEventSequence)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        TimedEventSequence other = (TimedEventSequence) obj;
        if (other == this) {
            return true;
        }
        if (other == null || this.ni0 != other.ni0) {
            return false;
        }
        other.kV();
        kV();
        for (int i = 0; i < this.VH.KB; i++) {
            hf_1 a = (hf_1) this.VH.get(i);
            hf_1 b = (hf_1) other.VH.get(i);
            b.getClass();
            if (b.hashCode() != a.hashCode()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final int compare(Object o1, Object o2) {
        return (int) (((hf_1) o1).yO - ((hf_1) o2).yO);
    }

    @Override
    public int compareTo(Object obj) {
        TimedEventSequence other = (TimedEventSequence) obj;
        if (this == other) {
            return 0;
        }
        if (this.ni0 != other.ni0) {
            return this.ni0 < other.ni0 ? -1 : 1;
        }
        other.kV();
        kV();
        for (int i = 0; i < this.VH.KB; i++) {
            int cmp = ((Comparable) this.VH.get(i)).compareTo(other.VH.get(i));
            if (cmp != 0) {
                return cmp < 0 ? -1 : 1;
            }
        }
        return 0;
    }
}
