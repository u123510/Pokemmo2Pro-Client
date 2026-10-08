package cn.pokemmo.collection.map;

import f.*;

import java.util.Iterator;

public class ObjectIntMap implements Iterable {
    public int xF;
    public Object[] z00;
    public int[] V5;
    public final float lPt3;
    public int ij0;
    public int i00;
    public int HZ;
    public transient hh0_2 o2;
    public transient hh0_2 Ov0;

    public ObjectIntMap() {
        this(51, 0.8f);
    }

    public ObjectIntMap(int i) {
        this(i, 0.8f);
    }

    public ObjectIntMap(int i, float f) {
        if (f <= 0.0f || f >= 1.0f) {
            throw new IllegalArgumentException("loadFactor must be > 0 and < 1: " + f);
        }
        this.lPt3 = f;
        int nk = af_1.NK(i, f);
        this.ij0 = (int) (((float) nk) * f);
        int i2 = nk - 1;
        this.HZ = i2;
        this.i00 = Long.numberOfLeadingZeros((long) i2);
        this.z00 = new Object[nk];
        this.V5 = new int[nk];
    }

    public ObjectIntMap(ObjectIntMap xy0) {
        this((int) Math.floor((float) xy0.z00.length * xy0.lPt3), xy0.lPt3);
        Object[] objArr = xy0.z00;
        System.arraycopy(objArr, 0, this.z00, 0, objArr.length);
        int[] iArr = xy0.V5;
        System.arraycopy(iArr, 0, this.V5, 0, iArr.length);
        this.xF = xy0.xF;
    }

    public ObjectIntMap(Xy0 xy0) {
        this((int) (((float) xy0.z00.length) * xy0.lPt3), xy0.lPt3);
        System.arraycopy(xy0.z00, 0, this.z00, 0, xy0.z00.length);
        System.arraycopy(xy0.V5, 0, this.V5, 0, xy0.V5.length);
        this.xF = xy0.xF;
    }

    public final int P5(Object v1) {
        if (v1 == null) {
            throw new IllegalArgumentException("key cannot be null.");
        }
        Object[] objArr = this.z00;
        int i = (int) ((((long) v1.hashCode()) * -7046029254386353131L) >>> this.i00);
        while (true) {
            Object obj = objArr[i];
            if (obj == null) {
                return -(i + 1);
            }
            if (obj.equals(v1)) {
                return i;
            }
            i = (i + 1) & this.HZ;
        }
    }

    public final void S50(int i1) {
        int length = this.z00.length;
        this.ij0 = (int) (((float) i1) * this.lPt3);
        int i2 = i1 - 1;
        this.HZ = i2;
        this.i00 = Long.numberOfLeadingZeros((long) i2);
        Object[] oldKeys = this.z00;
        int[] oldValues = this.V5;
        this.z00 = new Object[i1];
        this.V5 = new int[i1];
        if (this.xF > 0) {
            for (int i3 = 0; i3 < length; i3++) {
                Object obj = oldKeys[i3];
                if (obj != null) {
                    int val = oldValues[i3];
                    Object[] newKeys = this.z00;
                    int newIdx = (int) ((((long) obj.hashCode()) * -7046029254386353131L) >>> this.i00);
                    while (newKeys[newIdx] != null) {
                        newIdx = (newIdx + 1) & this.HZ;
                    }
                    newKeys[newIdx] = obj;
                    this.V5[newIdx] = val;
                }
            }
        }
    }

    @Override
    public final int hashCode() {
        int h = this.xF;
        Object[] keys = this.z00;
        int[] vals = this.V5;
        int len = vals.length;
        for (int i = 0; i < len; i++) {
            Object obj = keys[i];
            if (obj != null) {
                h += obj.hashCode() + vals[i];
            }
        }
        return h;
    }

    @Override
    public final boolean equals(Object v1) {
        if (v1 == this) {
            return true;
        }
        if (!(v1 instanceof ObjectIntMap)) {
            return false;
        }
        ObjectIntMap other = (ObjectIntMap) v1;
        if (other.xF != this.xF) {
            return false;
        }
        Object[] keys = this.z00;
        int[] vals = this.V5;
        int len = vals.length;
        for (int i = 0; i < len; i++) {
            Object obj = keys[i];
            if (obj != null) {
                int otherVal = other.Rl0(0, obj);
                if (otherVal == 0 && other.P5(obj) < 0) {
                    return false;
                }
                if (otherVal != vals[i]) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public final String toString() {
        if (this.xF == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append('{');
        Object[] keys = this.z00;
        int[] vals = this.V5;
        int i = vals.length;
        while (true) {
            int i2 = i - 1;
            i = i2;
            if (i2 <= 0) {
                break;
            }
            Object obj = keys[i];
            if (obj != null) {
                sb.append(obj);
                sb.append('=');
                sb.append(vals[i]);
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
                sb.append(", ");
                sb.append(obj2);
                sb.append('=');
                sb.append(vals[i]);
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final hh0_2 HI0() {
        if (this.o2 == null) {
            this.o2 = new hh0_2(this);
            this.Ov0 = new hh0_2(this);
        }
        if (!this.o2.Zq) {
            this.o2.Gb();
            this.o2.Zq = true;
            this.Ov0.Zq = false;
            return this.o2;
        }
        this.Ov0.Gb();
        this.Ov0.Zq = true;
        this.o2.Zq = false;
        return this.Ov0;
    }

    @Override
    public final Iterator iterator() {
        return HI0();
    }

    public final void hC0(int i1, Object v2) {
        int idx = P5(v2);
        if (idx >= 0) {
            this.V5[idx] = i1;
            return;
        }
        int newIdx = -(idx + 1);
        Object[] keys = this.z00;
        keys[newIdx] = v2;
        this.V5[newIdx] = i1;
        int newSize = this.xF + 1;
        this.xF = newSize;
        if (newSize >= this.ij0) {
            S50(keys.length << 1);
        }
    }

    public final int Rl0(int i1, Object v2) {
        int idx = P5(v2);
        if (idx >= 0) {
            return this.V5[idx];
        }
        return i1;
    }
}
