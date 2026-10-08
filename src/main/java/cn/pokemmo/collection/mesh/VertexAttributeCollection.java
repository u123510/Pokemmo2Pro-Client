package cn.pokemmo.collection.mesh;

import f.I3;
import f.kz_0;
import java.util.Iterator;

public class VertexAttributeCollection implements Iterable, Comparable {
    public final kz_0[] Os;
    public final int u5;
    public long ap0 = -1L;
    public int AUX = -1;
    public int lPT1 = -1;
    public I3 qi;

    public VertexAttributeCollection(kz_0... kz_0Arr) {
        if (kz_0Arr.length == 0) {
            throw new IllegalArgumentException("attributes must be >= 1");
        }
        kz_0[] kz_0Arr2 = new kz_0[kz_0Arr.length];
        for (int i = 0; i < kz_0Arr.length; i++) {
            kz_0Arr2[i] = kz_0Arr[i];
        }
        this.Os = kz_0Arr2;
        this.u5 = fP();
    }

    public final kz_0 r70(int i) {
        int length = this.Os.length;
        for (int j = 0; j < length; j++) {
            kz_0 kz_02 = this.Os[j];
            if (kz_02.tM == i) {
                return kz_02;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("[");
        for (int i = 0; i < this.Os.length; i++) {
            stringBuilder.append("(");
            stringBuilder.append(this.Os[i].ot0);
            stringBuilder.append(", ");
            stringBuilder.append(this.Os[i].tM);
            stringBuilder.append(", ");
            stringBuilder.append(this.Os[i].dG0);
            stringBuilder.append(", ");
            stringBuilder.append(this.Os[i].Kk0);
            stringBuilder.append(")\n");
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VertexAttributeCollection)) {
            return false;
        }
        VertexAttributeCollection sa_02 = (VertexAttributeCollection) obj;
        if (this.Os.length != sa_02.Os.length) {
            return false;
        }
        for (int i = 0; i < this.Os.length; i++) {
            if (!this.Os[i].hM(sa_02.Os[i])) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        long j = (long) (this.Os.length * 61);
        for (int i = 0; i < this.Os.length; i++) {
            j = j * 61L + (long) this.Os[i].hashCode();
        }
        return (int) (j ^ (j >>> 32));
    }

    public final long Js0() {
        if (this.ap0 != -1L) {
            return this.ap0;
        }
        long j = 0L;
        for (int i = 0; i < this.Os.length; i++) {
            j |= (long) this.Os[i].tM;
        }
        this.ap0 = j;
        return j;
    }

    public final long vJ0() {
        return Js0() | ((long) this.Os.length << 32);
    }

    public final int ab0() {
        if (this.AUX >= 0) {
            return this.AUX;
        }
        this.AUX = 0;
        for (int i = 0; i < this.Os.length; i++) {
            kz_0 kz_02 = this.Os[i];
            if (kz_02.tM == 64) {
                this.AUX = Math.max(this.AUX, kz_02.sf + 1);
            }
        }
        return this.AUX;
    }

    public final int g() {
        if (this.lPT1 >= 0) {
            return this.lPT1;
        }
        this.lPT1 = 0;
        for (int i = 0; i < this.Os.length; i++) {
            kz_0 kz_02 = this.Os[i];
            if (kz_02.tM == 16) {
                this.lPT1 = Math.max(this.lPT1, kz_02.sf + 1);
            }
        }
        return this.lPT1;
    }

    @Override
    public Iterator iterator() {
        if (this.qi == null) {
            this.qi = new I3(this.Os);
        }
        return this.qi.iterator();
    }

    @Override
    public int compareTo(Object obj) {
        VertexAttributeCollection sa_02 = (VertexAttributeCollection) obj;
        if (this.Os.length != sa_02.Os.length) {
            return this.Os.length - sa_02.Os.length;
        }
        long j1 = Js0();
        long j2 = sa_02.Js0();
        if (j1 != j2) {
            return j1 < j2 ? -1 : 1;
        }
        for (int i = this.Os.length - 1; i >= 0; i--) {
            kz_0 kz_02 = this.Os[i];
            kz_0 kz_03 = sa_02.Os[i];
            if (kz_02.tM != kz_03.tM) {
                return kz_02.tM - kz_03.tM;
            }
            if (kz_02.sf != kz_03.sf) {
                return kz_02.sf - kz_03.sf;
            }
            if (kz_02.dG0 != kz_03.dG0) {
                return kz_02.dG0 - kz_03.dG0;
            }
            if (kz_02.UO != kz_03.UO) {
                return kz_02.UO ? 1 : -1;
            }
            if (kz_02.IK0 != kz_03.IK0) {
                return kz_02.IK0 - kz_03.IK0;
            }
        }
        return 0;
    }

    public final int fP() {
        int i1 = 0;
        for (int i2 = 0; i2 < this.Os.length; i2++) {
            kz_0 kz_02 = this.Os[i2];
            kz_02.Kk0 = i1;
            int i3;
            int i4 = kz_02.IK0;
            if (i4 == 5126 || i4 == 5132) {
                i3 = kz_02.dG0 * 4;
            } else {
                switch (i4) {
                    case 5120:
                    case 5121:
                        i3 = kz_02.dG0;
                        break;
                    case 5122:
                    case 5123:
                        i3 = kz_02.dG0 * 2;
                        break;
                    default:
                        i3 = 0;
                        break;
                }
            }
            i1 += i3;
        }
        return i1;
    }
}
