package cn.pokemmo.util.collection;

import f.*;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.lang.reflect.Array;
import java.util.Arrays;

public class PrimitiveLongObjectOpenHashMap extends iw_2 implements W4 {
    static final long serialVersionUID = 1L;
    public transient byte[] ZA0;
    public byte hJ;

    public PrimitiveLongObjectOpenHashMap() {
        this.hJ = km_2.Qz;
    }

    @Override
    public final int La(int i1) {
        int actual = super.La(i1);
        this.ZA0 = new byte[actual];
        return actual;
    }

    @Override
    public final void Pl(int i1) {
        Object[] oldKeys = this.Yw;
        int oldLen = oldKeys.length;
        byte[] oldVals = this.ZA0;
        this.Yw = new Object[i1];
        Arrays.fill(this.Yw, VW);
        byte[] newVals = new byte[i1];
        this.ZA0 = newVals;
        Arrays.fill(newVals, this.hJ);
        while (oldLen-- > 0) {
            Object key = oldKeys[oldLen];
            if (key != VW && key != J80) {
                int index = e5(key);
                if (index >= 0) {
                    this.Yw[index] = key;
                    this.ZA0[index] = oldVals[oldLen];
                } else {
                    throw iw_2.l3("", key, this.Yw[-index - 1]);
                }
            }
        }
    }

    @Override
    public final void tq0(int i1) {
        this.ZA0[i1] = this.hJ;
        super.tq0(i1);
    }

    public final Object[] Fy(Object[] v1) {
        int size = this.Rv;
        if (v1.length < size) {
            v1 = (Object[]) Array.newInstance(v1.getClass().getComponentType(), size);
        }
        Object[] keys = this.Yw;
        int len = keys.length;
        int j = 0;
        while (len-- > 0) {
            Object key = keys[len];
            if (key != VW && key != J80) {
                v1[j++] = key;
            }
        }
        return v1;
    }

    @Override
    public final boolean equals(Object v1) {
        if (!(v1 instanceof W4)) {
            return false;
        }
        W4 other = (W4) v1;
        if (((ij0_0) other).Rv != this.Rv) {
            return false;
        }
        try {
            oc0_2 it = new oc0_2((mv_1) this);
            while (it.RV()) {
                it.zC0();
                Object key = it.Gu0.Yw[it.UE];
                byte val = it.Gu0.ZA0[it.UE];
                PrimitiveLongObjectOpenHashMap otherMap = (PrimitiveLongObjectOpenHashMap) v1;
                if (val == this.hJ) {
                    int otherIdx = otherMap.Dy0(key);
                    byte otherVal = otherIdx < 0 ? otherMap.hJ : otherMap.ZA0[otherIdx];
                    if (otherVal != ((PrimitiveLongObjectOpenHashMap) v1).hJ || !((PrimitiveLongObjectOpenHashMap) v1).s60(key)) {
                        return false;
                    }
                } else {
                    int otherIdx = otherMap.Dy0(key);
                    byte otherVal = otherIdx < 0 ? otherMap.hJ : otherMap.ZA0[otherIdx];
                    if (val != otherVal) {
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
        int h = 0;
        Object[] keys = this.Yw;
        byte[] vals = this.ZA0;
        int len = vals.length;
        while (len-- > 0) {
            Object key = keys[len];
            if (key != VW && key != J80) {
                byte val = vals[len];
                int kh = key == null ? 0 : key.hashCode();
                h += val ^ kh;
            }
        }
        return h;
    }

    @Override
    public final void writeExternal(ObjectOutput v1) throws IOException {
        v1.writeByte(0);
        super.writeExternal(v1);
        v1.writeByte(this.hJ);
        v1.writeInt(this.Rv);
        int len = this.Yw.length;
        while (len-- > 0) {
            Object key = this.Yw[len];
            if (key != J80 && key != VW) {
                v1.writeObject(key);
                v1.writeByte(this.ZA0[len]);
            }
        }
    }

    @Override
    public final void readExternal(ObjectInput v1) throws IOException, ClassNotFoundException {
        v1.readByte();
        super.readExternal(v1);
        this.hJ = v1.readByte();
        int size = v1.readInt();
        int actual = super.La(size);
        this.ZA0 = new byte[actual];
        while (size-- > 0) {
            Object key = v1.readObject();
            byte val = v1.readByte();
            Is0(val, key);
        }
    }

    @Override
    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        boolean first = true;
        Object[] keys = this.Yw;
        byte[] vals = this.ZA0;
        int len = keys.length;
        while (len-- > 0) {
            Object key = keys[len];
            if (key != VW && key != J80) {
                byte val = vals[len];
                if (first) {
                    first = false;
                } else {
                    sb.append(",");
                }
                sb.append(key).append("=").append((int) val);
            }
        }
        sb.append("}");
        return sb.toString();
    }

    public final void Is0(byte b, Object obj) {
        int index = e5(obj);
        boolean inserted = true;
        if (index < 0) {
            index = -index - 1;
            byte unused = this.ZA0[index];
            inserted = false;
        }
        this.ZA0[index] = b;
        if (inserted) {
            OC0(this.wC);
        }
    }
}
