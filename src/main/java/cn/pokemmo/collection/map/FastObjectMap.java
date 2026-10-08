package cn.pokemmo.collection.map;

import f.*;

import java.util.Arrays;
import java.util.Iterator;

public class FastObjectMap implements Iterable {
    public static final Object Com5 = new Object();
    public int Va0;
    public Object[] z40;
    public Object[] Pr;
    public final float cB0;
    public int g6;
    public int qs0;
    public int u2;
    public transient a60_0 Mz;
    public transient a60_0 NP;
    public transient be_2 EO;
    public transient be_2 Ne;
    public transient us0_0 FK;
    public transient us0_0 xw;

    public FastObjectMap() {
        this(51, 0.8f);
    }

    public FastObjectMap(int i) {
        this(i, 0.8f);
    }

    public FastObjectMap(int i, float f) {
        if (f <= 0.0f || f >= 1.0f) {
            throw new IllegalArgumentException("loadFactor must be > 0 and < 1: " + f);
        }
        this.cB0 = f;
        int NK = af_1.NK(i, f);
        this.g6 = (int) (((float) NK) * f);
        int i2 = NK - 1;
        this.u2 = i2;
        this.qs0 = Long.numberOfLeadingZeros((long) i2);
        this.z40 = new Object[NK];
        this.Pr = new Object[NK];
    }

    public FastObjectMap(FastObjectMap nb_2Var) {
        this((int) Math.floor((float) nb_2Var.z40.length * nb_2Var.cB0), nb_2Var.cB0);
        Object[] objArr = nb_2Var.z40;
        System.arraycopy(objArr, 0, this.z40, 0, objArr.length);
        Object[] objArr2 = nb_2Var.Pr;
        System.arraycopy(objArr2, 0, this.Pr, 0, objArr2.length);
        this.Va0 = nb_2Var.Va0;
    }

    public FastObjectMap(nb_2 nb_2Var) {
        this((int) (((float) nb_2Var.z40.length) * nb_2Var.cB0), nb_2Var.cB0);
        System.arraycopy(nb_2Var.z40, 0, this.z40, 0, nb_2Var.z40.length);
        System.arraycopy(nb_2Var.Pr, 0, this.Pr, 0, nb_2Var.Pr.length);
        this.Va0 = nb_2Var.Va0;
    }

    public final int Va(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("key cannot be null.");
        }
        Object[] objArr = this.z40;
        int hashCode = (int) ((((long) obj.hashCode()) * -7046029254386353131L) >>> this.qs0);
        while (true) {
            Object obj2 = objArr[hashCode];
            if (obj2 == null) {
                return -(hashCode + 1);
            }
            if (obj2.equals(obj)) {
                return hashCode;
            }
            hashCode = (hashCode + 1) & this.u2;
        }
    }

    public Object WK0(Object obj, Object obj2) {
        int Va = Va(obj);
        if (Va >= 0) {
            Object obj3 = this.Pr[Va];
            this.Pr[Va] = obj2;
            return obj3;
        }
        int i = -(Va + 1);
        Object[] objArr = this.z40;
        objArr[i] = obj;
        this.Pr[i] = obj2;
        int i2 = this.Va0 + 1;
        this.Va0 = i2;
        if (i2 >= this.g6) {
            p70(objArr.length << 1);
        }
        return null;
    }

    public final Object Wk0(Object obj) {
        int Va = Va(obj);
        if (Va < 0) {
            return null;
        }
        return this.Pr[Va];
    }

    public Object ns0(Object obj) {
        int Va = Va(obj);
        if (Va < 0) {
            return null;
        }
        Object[] objArr = this.z40;
        Object[] objArr2 = this.Pr;
        Object obj2 = objArr2[Va];
        int i = this.u2;
        int i2 = (Va + 1) & i;
        while (true) {
            Object obj3 = objArr[i2];
            if (obj3 == null) {
                objArr[Va] = null;
                objArr2[Va] = null;
                this.Va0--;
                return obj2;
            }
            int hashCode = (int) ((((long) obj3.hashCode()) * -7046029254386353131L) >>> this.qs0);
            if (((i2 - hashCode) & i) > ((Va - hashCode) & i)) {
                objArr[Va] = obj3;
                objArr2[Va] = objArr2[i2];
                Va = i2;
            }
            i2 = (i2 + 1) & i;
        }
    }

    public final boolean fl(Object obj) {
        return Va(obj) >= 0;
    }

    public final void p70(int i) {
        int length = this.z40.length;
        this.g6 = (int) (((float) i) * this.cB0);
        int i2 = i - 1;
        this.u2 = i2;
        this.qs0 = Long.numberOfLeadingZeros((long) i2);
        Object[] objArr = this.z40;
        Object[] objArr2 = this.Pr;
        this.z40 = new Object[i];
        this.Pr = new Object[i];
        if (this.Va0 > 0) {
            for (int i3 = 0; i3 < length; i3++) {
                Object obj = objArr[i3];
                if (obj != null) {
                    Object obj2 = objArr2[i3];
                    Object[] objArr3 = this.z40;
                    int hashCode = (int) ((((long) obj.hashCode()) * -7046029254386353131L) >>> this.qs0);
                    while (objArr3[hashCode] != null) {
                        hashCode = (hashCode + 1) & this.u2;
                    }
                    objArr3[hashCode] = obj;
                    this.Pr[hashCode] = obj2;
                }
            }
        }
    }

    @Override
    public final int hashCode() {
        int i = this.Va0;
        Object[] objArr = this.z40;
        Object[] objArr2 = this.Pr;
        int length = objArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            Object obj = objArr[i2];
            if (obj != null) {
                i += obj.hashCode();
                Object obj2 = objArr2[i2];
                if (obj2 != null) {
                    i += obj2.hashCode();
                }
            }
        }
        return i;
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FastObjectMap)) {
            return false;
        }
        FastObjectMap nb_2Var = (FastObjectMap) obj;
        if (nb_2Var.Va0 != this.Va0) {
            return false;
        }
        Object[] objArr = this.z40;
        Object[] objArr2 = this.Pr;
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            Object obj2 = objArr[i];
            if (obj2 != null) {
                Object obj3 = objArr2[i];
                if (obj3 == null) {
                    int Va = nb_2Var.Va(obj2);
                    if ((Va < 0 ? Com5 : nb_2Var.Pr[Va]) != null) {
                        return false;
                    }
                } else if (!obj3.equals(nb_2Var.Wk0(obj2))) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public final String toString() {
        return dg0();
    }

    public a60_0 u9() {
        return lb0();
    }

    public a60_0 lb0() {
        if (this.Mz == null) {
            this.Mz = new a60_0(this);
            this.NP = new a60_0(this);
        }
        if (!this.Mz.X10) {
            this.Mz.NF0();
            a60_0 a60_0Var = this.Mz;
            a60_0Var.X10 = true;
            this.NP.X10 = false;
            return a60_0Var;
        }
        this.NP.NF0();
        a60_0 a60_0Var2 = this.NP;
        a60_0Var2.X10 = true;
        this.Mz.X10 = false;
        return a60_0Var2;
    }

    public be_2 Ww0() {
        if (this.EO == null) {
            this.EO = new be_2(this);
            this.Ne = new be_2(this);
        }
        if (!this.EO.X10) {
            this.EO.NF0();
            be_2 be_2Var = this.EO;
            be_2Var.X10 = true;
            this.Ne.X10 = false;
            return be_2Var;
        }
        this.Ne.NF0();
        be_2 be_2Var2 = this.Ne;
        be_2Var2.X10 = true;
        this.EO.X10 = false;
        return be_2Var2;
    }

    public us0_0 mC0() {
        if (this.FK == null) {
            this.FK = new us0_0(this);
            this.xw = new us0_0(this);
        }
        if (!this.FK.X10) {
            this.FK.NF0();
            us0_0 us0_0Var = this.FK;
            us0_0Var.X10 = true;
            this.xw.X10 = false;
            return us0_0Var;
        }
        this.xw.NF0();
        us0_0 us0_0Var2 = this.xw;
        us0_0Var2.X10 = true;
        this.FK.X10 = false;
        return us0_0Var2;
    }

    @Override
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return u9();
    }

    public void b20() {
        if (this.Va0 == 0) {
            return;
        }
        this.Va0 = 0;
        Arrays.fill(this.z40, (Object) null);
        Arrays.fill(this.Pr, (Object) null);
    }

    public String dg0() {
        if (this.Va0 == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append('{');
        Object[] objArr = this.z40;
        Object[] objArr2 = this.Pr;
        int length = objArr.length;
        while (true) {
            int i = length - 1;
            if (length <= 0) {
                break;
            }
            Object obj = objArr[i];
            if (obj != null) {
                Object obj2 = obj == this ? "(this)" : obj;
                sb.append(obj2);
                sb.append('=');
                Object obj3 = objArr2[i];
                sb.append(obj3 == this ? "(this)" : obj3);
                length = i;
                break;
            }
            length = i;
        }
        while (true) {
            int i2 = length - 1;
            if (length <= 0) {
                sb.append('}');
                return sb.toString();
            }
            Object obj4 = objArr[i2];
            if (obj4 != null) {
                sb.append(", ");
                sb.append(obj4 == this ? "(this)" : obj4);
                sb.append('=');
                Object obj5 = objArr2[i2];
                sb.append(obj5 == this ? "(this)" : obj5);
            }
            length = i2;
        }
    }
}
