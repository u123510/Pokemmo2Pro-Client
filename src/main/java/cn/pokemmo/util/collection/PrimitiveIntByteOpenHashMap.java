package cn.pokemmo.util.collection;

import f.*;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Arrays;

public class PrimitiveIntByteOpenHashMap extends iw_2 implements ch_1 {
    static final long serialVersionUID = 1L;
    public transient int[] ju0;
    public int gz;

    public PrimitiveIntByteOpenHashMap() {
        this.gz = km_2.Lo0;
    }

    @Override
    public final int La(int i1) {
        int actual = super.La(i1);
        this.ju0 = new int[actual];
        return actual;
    }

    @Override
    public final void Pl(int i1) {
        Object[] oldKeys = this.Yw;
        int oldLen = oldKeys.length;
        int[] oldVals = this.ju0;
        this.Yw = new Object[i1];
        Arrays.fill(this.Yw, VW);
        int[] newVals = new int[i1];
        this.ju0 = newVals;
        Arrays.fill(newVals, this.gz);
        while (oldLen-- > 0) {
            Object key = oldKeys[oldLen];
            if (key != VW && key != J80) {
                int index = e5(key);
                if (index >= 0) {
                    this.Yw[index] = key;
                    this.ju0[index] = oldVals[oldLen];
                } else {
                    throw iw_2.l3("", key, this.Yw[-index - 1]);
                }
            }
        }
    }

    @Override
    public final void tq0(int i1) {
        this.ju0[i1] = this.gz;
        super.tq0(i1);
    }

    @Override
    public final boolean equals(Object v1) {
        if (!(v1 instanceof ch_1)) {
            return false;
        }
        ch_1 other = (ch_1) v1;
        if (((ij0_0) other).Rv != this.Rv) {
            return false;
        }
        try {
            qb0_0 it = new qb0_0((re0_1) this);
            while (it.RV()) {
                it.zC0();
                Object key = it.Vz.Yw[it.UE];
                int val = it.Vz.ju0[it.UE];
                PrimitiveIntByteOpenHashMap otherMap = (PrimitiveIntByteOpenHashMap) v1;
                if (val == this.gz) {
                    int otherIdx = otherMap.Dy0(key);
                    int otherVal = otherIdx < 0 ? otherMap.gz : otherMap.ju0[otherIdx];
                    if (otherVal != ((PrimitiveIntByteOpenHashMap) v1).gz || !((PrimitiveIntByteOpenHashMap) v1).s60(key)) {
                        return false;
                    }
                } else {
                    int otherIdx = otherMap.Dy0(key);
                    int otherVal = otherIdx < 0 ? otherMap.gz : otherMap.ju0[otherIdx];
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
        int[] vals = this.ju0;
        int len = vals.length;
        while (len-- > 0) {
            Object key = keys[len];
            if (key != VW && key != J80) {
                int val = vals[len];
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
        v1.writeInt(this.gz);
        v1.writeInt(this.Rv);
        int len = this.Yw.length;
        while (len-- > 0) {
            Object key = this.Yw[len];
            if (key != J80 && key != VW) {
                v1.writeObject(key);
                v1.writeInt(this.ju0[len]);
            }
        }
    }

    @Override
    public final void readExternal(ObjectInput v1) throws IOException, ClassNotFoundException {
        v1.readByte();
        super.readExternal(v1);
        this.gz = v1.readInt();
        int size = v1.readInt();
        this.ju0 = new int[super.La(size)];
        while (size-- > 0) {
            Object key = v1.readObject();
            int val = v1.readInt();
            int index = e5(key);
            boolean inserted = true;
            if (index < 0) {
                index = -index - 1;
                int unused = this.ju0[index];
                inserted = false;
            }
            this.ju0[index] = val;
            if (inserted) {
                OC0(this.wC);
            }
        }
    }

    @Override
    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        boolean first = true;
        Object[] keys = this.Yw;
        int[] vals = this.ju0;
        int len = keys.length;
        while (len-- > 0) {
            Object key = keys[len];
            if (key != VW && key != J80) {
                int val = vals[len];
                if (first) {
                    first = false;
                } else {
                    sb.append(",");
                }
                sb.append(key).append("=").append(val);
            }
        }
        sb.append("}");
        return sb.toString();
    }

    public final void Iy(CH0 v1) {
        int index = e5(v1);
        if (index < 0) {
            int slot = -index - 1;
            this.ju0[slot] += 1;
        } else {
            this.ju0[index] = 1;
            OC0(this.wC);
        }
    }
}
