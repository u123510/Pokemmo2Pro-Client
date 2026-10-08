package cn.pokemmo.collection.map;

import f.*;

import java.util.Iterator;

public class IntObjectMap implements Iterable {
    public int SZ;
    public int[] Qu0;
    public Object[] Com9;
    public Object Nc0;
    public boolean Bu;
    public final float NUl;
    public int Lr;
    public int f8;
    public int It0;
    public transient ic_2 iK;
    public transient ic_2 DC0;
    public transient xz_1 implements$;
    public transient xz_1 Rv;

    public IntObjectMap() {
        this(51, 0.8f);
    }

    public IntObjectMap(int i1) {
        this(i1, 0.8f);
    }

    public IntObjectMap(int i1, float f2) {
        if (f2 <= 0.0f || f2 >= 1.0f) {
            throw new IllegalArgumentException("loadFactor must be > 0 and < 1: " + f2);
        }
        this.NUl = f2;
        i1 = af_1.NK(i1, f2);
        this.Lr = (int) ((float) i1 * f2);
        int i0 = i1 - 1;
        this.It0 = i0;
        this.f8 = Long.numberOfLeadingZeros((long) i0);
        this.Qu0 = new int[i1];
        this.Com9 = new Object[i1];
    }

    public IntObjectMap(IntObjectMap v1) {
        this((int) Math.floor((float) v1.Qu0.length * v1.NUl), v1.NUl);
        int[] iArr = v1.Qu0;
        System.arraycopy(iArr, 0, this.Qu0, 0, iArr.length);
        Object[] objArr = v1.Com9;
        System.arraycopy(objArr, 0, this.Com9, 0, objArr.length);
        this.SZ = v1.SZ;
        this.Nc0 = v1.Nc0;
        this.Bu = v1.Bu;
    }

    public IntObjectMap(nl_1 v1) {
        this((int) ((float) v1.Qu0.length * v1.NUl), v1.NUl);
        System.arraycopy(v1.Qu0, 0, this.Qu0, 0, this.Qu0.length);
        System.arraycopy(v1.Com9, 0, this.Com9, 0, this.Com9.length);
        this.SZ = v1.SZ;
        this.Nc0 = v1.Nc0;
        this.Bu = v1.Bu;
    }

    public final void qx0(int i1, Object v2) {
        if (i1 == 0) {
            this.Nc0 = v2;
            if (!this.Bu) {
                this.Bu = true;
                this.SZ++;
            }
            return;
        }
        int i3 = auX(i1);
        if (i3 >= 0) {
            this.Com9[i3] = v2;
            return;
        }
        i3 = -(i3 + 1);
        int[] v4 = this.Qu0;
        v4[i3] = i1;
        this.Com9[i3] = v2;
        if (++this.SZ >= this.Lr) {
            int i1_2 = v4.length;
            int newCapacity = i1_2 << 1;
            this.Lr = (int) ((float) newCapacity * this.NUl);
            this.It0 = newCapacity - 1;
            this.f8 = Long.numberOfLeadingZeros((long) this.It0);
            int[] v2_2 = this.Qu0;
            Object[] v3 = this.Com9;
            this.Qu0 = new int[newCapacity];
            this.Com9 = new Object[newCapacity];
            if (this.SZ > 0) {
                for (int i4 = 0; i4 < i1_2; i4++) {
                    int i5 = v2_2[i4];
                    if (i5 != 0) {
                        Object v6 = v3[i4];
                        int[] v7 = this.Qu0;
                        int i8 = (int) ((long) i5 * -7046029254386353131L >>> this.f8);
                        while (v7[i8] != 0) {
                            i8 = (i8 + 1) & this.It0;
                        }
                        v7[i8] = i5;
                        this.Com9[i8] = v6;
                    }
                }
            }
        }
    }

    public final Object get(int i1) {
        if (i1 == 0) {
            return this.Bu ? this.Nc0 : null;
        }
        int index = auX(i1);
        return index >= 0 ? this.Com9[index] : null;
    }

    public final Object remove(int i1) {
        if (i1 == 0) {
            if (!this.Bu) {
                return null;
            }
            this.Bu = false;
            Object oldValue = this.Nc0;
            this.Nc0 = null;
            this.SZ--;
            return oldValue;
        }
        int index = auX(i1);
        if (index < 0) {
            return null;
        }
        int[] v2 = this.Qu0;
        Object[] v3 = this.Com9;
        Object v4 = v3[index];
        int i5 = this.It0;
        int i6 = (index + 1) & i5;
        while (true) {
            int i7 = v2[i6];
            if (i7 == 0) {
                break;
            }
            int i8 = (int) ((long) i7 * -7046029254386353131L >>> this.f8);
            if (((i6 - i8) & i5) > ((index - i8) & i5)) {
                v2[index] = i7;
                v3[index] = v3[i6];
                index = i6;
            }
            i6 = (i6 + 1) & i5;
        }
        v2[index] = 0;
        v3[index] = null;
        this.SZ--;
        return v4;
    }

    @Override
    public final int hashCode() {
        int i1 = this.SZ;
        if (this.Bu && this.Nc0 != null) {
            i1 += this.Nc0.hashCode();
        }
        int[] v2 = this.Qu0;
        Object[] v3 = this.Com9;
        int i4 = v2.length;
        for (int i3 = 0; i3 < i4; i3++) {
            int i5 = v2[i3];
            if (i5 != 0) {
                i1 += i5 * 31;
                Object v5_2 = v3[i3];
                if (v5_2 != null) {
                    i1 += v5_2.hashCode();
                }
            }
        }
        return i1;
    }

    @Override
    public final boolean equals(Object v1) {
        if (v1 == this) {
            return true;
        }
        if (!(v1 instanceof IntObjectMap)) {
            return false;
        }
        IntObjectMap other = (IntObjectMap) v1;
        if (other.SZ != this.SZ) {
            return false;
        }
        boolean i2 = other.Bu;
        if (i2 != this.Bu) {
            return false;
        }
        if (i2) {
            Object v2 = other.Nc0;
            if (v2 == null) {
                if (this.Nc0 != null) {
                    return false;
                }
            } else if (!v2.equals(this.Nc0)) {
                return false;
            }
        }
        int[] v2_2 = this.Qu0;
        Object[] v3 = this.Com9;
        int i4 = v2_2.length;
        for (int i3 = 0; i3 < i4; i3++) {
            int i5 = v2_2[i3];
            if (i5 != 0) {
                Object v6 = v3[i3];
                if (v6 == null) {
                    Object otherVal = nb_2.Com5;
                    if (i5 == 0) {
                        if (other.Bu) {
                            otherVal = other.Nc0;
                        }
                    } else {
                        int otherIndex = other.auX(i5);
                        if (otherIndex >= 0) {
                            otherVal = other.Com9[otherIndex];
                        }
                    }
                    if (otherVal != null) {
                        return false;
                    }
                } else if (!v6.equals(other.get(i5))) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public final String toString() {
        if (this.SZ == 0) {
            return "[]";
        }
        StringBuilder v1 = new StringBuilder(32);
        v1.append('[');
        int[] v2 = this.Qu0;
        Object[] v3 = this.Com9;
        int i4 = v2.length;
        if (this.Bu) {
            v1.append("0=");
            v1.append(this.Nc0);
        } else {
            while (i4-- > 0) {
                int i0 = v2[i4];
                if (i0 != 0) {
                    v1.append(i0);
                    v1.append('=');
                    v1.append(v3[i4]);
                    break;
                }
            }
        }
        while (i4-- > 0) {
            int i0 = v2[i4];
            if (i0 != 0) {
                v1.append(", ");
                v1.append(i0);
                v1.append('=');
                v1.append(v3[i4]);
            }
        }
        v1.append(']');
        return v1.toString();
    }

    @Override
    public final Iterator iterator() {
        return Cs();
    }

    public final ic_2 Cs() {
        if (this.iK == null) {
            this.iK = new ic_2(this);
            this.DC0 = new ic_2(this);
        }
        if (!this.iK.nw0) {
            this.iK.bu();
            this.iK.nw0 = true;
            this.DC0.nw0 = false;
            return this.iK;
        }
        this.DC0.bu();
        this.DC0.nw0 = true;
        this.iK.nw0 = false;
        return this.DC0;
    }

    public final xz_1 zG() {
        if (this.implements$ == null) {
            this.implements$ = new xz_1(this);
            this.Rv = new xz_1(this);
        }
        if (!this.implements$.nw0) {
            this.implements$.bu();
            this.implements$.nw0 = true;
            this.Rv.nw0 = false;
            return this.implements$;
        }
        this.Rv.bu();
        this.Rv.nw0 = true;
        this.implements$.nw0 = false;
        return this.Rv;
    }

    public final int auX(int i1) {
        int[] v2 = this.Qu0;
        int i3 = (int) ((long) i1 * -7046029254386353131L >>> this.f8);
        while (true) {
            int i4 = v2[i3];
            if (i4 == 0) {
                return -(i3 + 1);
            }
            if (i4 == i1) {
                return i3;
            }
            i3 = (i3 + 1) & this.It0;
        }
    }
}
