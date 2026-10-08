package cn.pokemmo.collection.set;

import f.*;

import java.util.Iterator;

public class FastObjectSet implements Iterable {
    public int g1;
    public Object[] if$;
    public final float gr;
    public int nv0;
    public int mr;
    public int com9;
    public transient YH FG0;
    public transient YH CE;

    public FastObjectSet() {
        this(51, 0.8f);
    }

    public FastObjectSet(int i) {
        this(i, 0.8f);
    }

    public FastObjectSet(int i, float f) {
        if (f <= 0.0f || f >= 1.0f) {
            throw new IllegalArgumentException("loadFactor must be > 0 and < 1: " + f);
        }
        this.gr = f;
        int nk = NK(i, f);
        this.nv0 = (int) (((float) nk) * f);
        int i2 = nk - 1;
        this.com9 = i2;
        this.mr = Long.numberOfLeadingZeros((long) i2);
        this.if$ = new Object[nk];
    }

    public FastObjectSet(FastObjectSet set) {
        this((int) Math.floor((float) set.if$.length * set.gr), set.gr);
        Object[] objArr = set.if$;
        System.arraycopy(objArr, 0, this.if$, 0, objArr.length);
        this.g1 = set.g1;
    }

    public FastObjectSet(af_1 af_1Var) {
        this((int) (((float) af_1Var.if$.length) * af_1Var.gr), af_1Var.gr);
        System.arraycopy(af_1Var.if$, 0, this.if$, 0, af_1Var.if$.length);
        this.g1 = af_1Var.g1;
    }

    public static int NK(int i, float f) {
        if (i < 0) {
            throw new IllegalArgumentException(yr_1.pG("capacity must be >= 0: ", i));
        }
        int uo0 = LW.uo0(Math.max(2, (int) Math.ceil((double) (((float) i) / f))));
        if (uo0 <= 1073741824) {
            return uo0;
        }
        throw new IllegalArgumentException(yr_1.pG("The required capacity is too large: ", i));
    }

    public final void aO(int i1) {
        int length = this.if$.length;
        this.nv0 = (int) (((float) i1) * this.gr);
        int i2 = i1 - 1;
        this.com9 = i2;
        this.mr = Long.numberOfLeadingZeros((long) i2);
        Object[] oldKeys = this.if$;
        this.if$ = new Object[i1];
        if (this.g1 > 0) {
            for (int i3 = 0; i3 < length; i3++) {
                Object obj = oldKeys[i3];
                if (obj != null) {
                    Object[] newKeys = this.if$;
                    int newIdx = (int) ((((long) obj.hashCode()) * -7046029254386353131L) >>> this.mr);
                    while (newKeys[newIdx] != null) {
                        newIdx = (newIdx + 1) & this.com9;
                    }
                    newKeys[newIdx] = obj;
                }
            }
        }
    }

    public final int lpT8(Object v1) {
        if (v1 == null) {
            throw new IllegalArgumentException("key cannot be null.");
        }
        Object[] keys = this.if$;
        int idx = (int) ((((long) v1.hashCode()) * -7046029254386353131L) >>> this.mr);
        while (true) {
            Object obj = keys[idx];
            if (obj == null) {
                return -(idx + 1);
            }
            if (obj.equals(v1)) {
                return idx;
            }
            idx = (idx + 1) & this.com9;
        }
    }

    @Override
    public final int hashCode() {
        int h = this.g1;
        Object[] keys = this.if$;
        int len = keys.length;
        for (int i = 0; i < len; i++) {
            Object obj = keys[i];
            if (obj != null) {
                h += obj.hashCode();
            }
        }
        return h;
    }

    @Override
    public final boolean equals(Object v1) {
        if (!(v1 instanceof FastObjectSet)) {
            return false;
        }
        FastObjectSet other = (FastObjectSet) v1;
        if (other.g1 != this.g1) {
            return false;
        }
        Object[] keys = this.if$;
        int len = keys.length;
        for (int i = 0; i < len; i++) {
            Object obj = keys[i];
            if (obj != null && other.lpT8(obj) < 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        String sep = ", ";
        String str;
        if (this.g1 == 0) {
            str = "";
        } else {
            StringBuilder sb2 = new StringBuilder(32);
            Object[] keys = this.if$;
            int i = keys.length;
            while (true) {
                int i2 = i - 1;
                i = i2;
                if (i2 <= 0) {
                    break;
                }
                Object obj = keys[i];
                if (obj != null) {
                    sb2.append(obj == this ? "(this)" : obj);
                    break;
                }
            }
            while (true) {
                int i3 = i - 1;
                i = i3;
                if (i3 <= 0) {
                    break;
                }
                Object obj2 = keys[i];
                if (obj2 != null) {
                    sb2.append(sep);
                    sb2.append(obj2 == this ? "(this)" : obj2);
                }
            }
            str = sb2.toString();
        }
        sb.append(str);
        sb.append('}');
        return sb.toString();
    }

    public final YH xA0() {
        if (this.FG0 == null) {
            this.FG0 = new YH(this);
            this.CE = new YH(this);
        }
        if (!this.FG0.hz0) {
            this.FG0.GT();
            this.FG0.hz0 = true;
            this.CE.hz0 = false;
            return this.FG0;
        }
        this.CE.GT();
        this.CE.hz0 = true;
        this.FG0.hz0 = false;
        return this.CE;
    }

    @Override
    public final Iterator iterator() {
        return xA0();
    }

    public final void MG0(Object v1) {
        int idx = lpT8(v1);
        if (idx >= 0) {
            return;
        }
        int newIdx = -(idx + 1);
        Object[] keys = this.if$;
        keys[newIdx] = v1;
        int newSize = this.g1 + 1;
        this.g1 = newSize;
        if (newSize >= this.nv0) {
            aO(keys.length << 1);
        }
    }
}
