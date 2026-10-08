package cn.pokemmo.util.collection;

import f.*;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Arrays;

public class PrimitiveLongLongOpenHashMap extends iw_2 implements D4 {
    static final long serialVersionUID = 1L;
    public transient double[] us;
    public double aH;

    public PrimitiveLongLongOpenHashMap() {
        this.aH = km_2.GN;
    }

    @Override
    public final int La(int i1) {
        int res = super.La(i1);
        this.us = new double[res];
        return res;
    }

    @Override
    public final void Pl(int i1) {
        Object[] objArr = this.Yw;
        int length = objArr.length;
        double[] dArr = this.us;
        this.Yw = new Object[i1];
        Arrays.fill(this.Yw, VW);
        double[] dArr2 = new double[i1];
        this.us = dArr2;
        Arrays.fill(dArr2, this.aH);
        while (length-- > 0) {
            Object obj = objArr[length];
            if (obj != VW && obj != J80) {
                int e5 = e5(obj);
                if (e5 < 0) {
                    throw l3("", this.Yw[-e5 - 1], obj);
                }
                this.Yw[e5] = obj;
                this.us[e5] = dArr[length];
            }
        }
    }

    public final double N60(Object v1, double d2) {
        int i1 = e5(v1);
        double d4 = this.aH;
        boolean z = true;
        if (i1 < 0) {
            i1 = -i1 - 1;
            d4 = this.us[i1];
            z = false;
        }
        this.us[i1] = d2;
        if (z) {
            OC0(this.wC);
        }
        return d4;
    }

    @Override
    public final void tq0(int i1) {
        this.us[i1] = this.aH;
        super.tq0(i1);
    }

    @Override
    public final boolean equals(Object obj) {
        if (!(obj instanceof D4)) {
            return false;
        }
        D4 d4 = (D4) obj;
        if (((ij0_0) d4).Rv != this.Rv) {
            return false;
        }
        try {
            jg0_2 jg0_2Var = new jg0_2((hh_1) this);
            while (jg0_2Var.RV()) {
                jg0_2Var.zC0();
                int i = jg0_2Var.UE;
                Object obj2 = jg0_2Var.ns0.Yw[i];
                double d = this.us[i];
                if (d == this.aH) {
                    PrimitiveLongLongOpenHashMap hh_1Var = (PrimitiveLongLongOpenHashMap) d4;
                    int Dy0 = hh_1Var.Dy0(obj2);
                    if ((Dy0 < 0 ? hh_1Var.aH : hh_1Var.us[Dy0]) != ((PrimitiveLongLongOpenHashMap) d4).aH || !((PrimitiveLongLongOpenHashMap) d4).s60(obj2)) {
                        return false;
                    }
                } else {
                    PrimitiveLongLongOpenHashMap hh_1Var2 = (PrimitiveLongLongOpenHashMap) d4;
                    int Dy02 = hh_1Var2.Dy0(obj2);
                    if (d != (Dy02 < 0 ? hh_1Var2.aH : hh_1Var2.us[Dy02])) {
                        return false;
                    }
                }
            }
            return true;
        } catch (ClassCastException unused) {
            return true;
        }
    }

    @Override
    public final int hashCode() {
        int i0 = 0;
        Object[] keys = this.Yw;
        double[] vals = this.us;
        int i3 = vals.length;
        while (i3-- > 0) {
            Object obj = keys[i3];
            if (obj != VW && obj != J80) {
                double d4 = vals[i3];
                if (!JS.t40 && Double.isNaN(d4)) {
                    throw new AssertionError("Values of NaN are not supported.");
                }
                long bits = Double.doubleToLongBits(d4);
                int i4 = (int) (bits ^ (bits >>> 32));
                int i5 = obj == null ? 0 : obj.hashCode();
                i0 += i4 ^ i5;
            }
        }
        return i0;
    }

    @Override
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeByte(0);
        super.writeExternal(objectOutput);
        objectOutput.writeDouble(this.aH);
        objectOutput.writeInt(this.Rv);
        int length = this.Yw.length;
        while (length-- > 0) {
            Object obj = this.Yw[length];
            if (obj != J80 && obj != VW) {
                objectOutput.writeObject(obj);
                objectOutput.writeDouble(this.us[length]);
            }
        }
    }

    @Override
    public final void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        objectInput.readByte();
        super.readExternal(objectInput);
        this.aH = objectInput.readDouble();
        int readInt = objectInput.readInt();
        super.La(readInt);
        this.us = new double[readInt];
        while (readInt-- > 0) {
            N60(objectInput.readObject(), objectInput.readDouble());
        }
    }

    @Override
    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        boolean z = true;
        Object[] objArr = this.Yw;
        double[] dArr = this.us;
        int length = objArr.length;
        while (length-- > 0) {
            Object obj = objArr[length];
            if (obj != VW && obj != J80) {
                double d = dArr[length];
                if (z) {
                    z = false;
                } else {
                    sb.append(",");
                }
                sb.append(obj).append("=").append(d);
            }
        }
        sb.append("}");
        return sb.toString();
    }
}
