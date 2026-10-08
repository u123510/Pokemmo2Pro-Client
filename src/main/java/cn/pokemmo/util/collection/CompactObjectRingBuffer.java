package cn.pokemmo.util.collection;

import f.*;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;

public class CompactObjectRingBuffer extends pz0_0 implements x {
    static final long serialVersionUID = 1L;
    public transient Object[] BS;
    public short vi0;

    public CompactObjectRingBuffer() {
        super();
    }

    public CompactObjectRingBuffer(int i) {
        super(650);
        this.vi0 = km_2.TI0;
    }

    public final int La(int i) {
        int res = super.La(i);
        this.BS = new Object[res];
        return res;
    }

    public final void Pl(int i) {
        short[] oldKeys = this.L1;
        int oldLen = oldKeys.length;
        Object[] oldValues = this.BS;
        byte[] oldStates = this.Ut;
        this.L1 = new short[i];
        this.BS = new Object[i];
        this.Ut = new byte[i];
        while (oldLen-- > 0) {
            if (oldStates[oldLen] == 1) {
                int newIdx = D10(oldKeys[oldLen]);
                this.BS[newIdx] = oldValues[oldLen];
            }
        }
    }

    public final Object f5(short s) {
        int idx = Ye0(s);
        return idx < 0 ? null : this.BS[idx];
    }

    public final Object coM4(short s, Object obj) {
        int idx = D10(s);
        Object old = null;
        boolean isNew = true;
        if (idx < 0) {
            idx = -idx - 1;
            old = this.BS[idx];
            isNew = false;
        }
        this.BS[idx] = obj;
        if (isNew) {
            OC0(this.EH);
        }
        return old;
    }

    public final Object sX(short s) {
        Object old = null;
        int idx = Ye0(s);
        if (idx >= 0) {
            old = this.BS[idx];
            this.BS[idx] = null;
            super.dx0(idx);
        }
        return old;
    }

    public final void dx0(int i) {
        this.BS[i] = null;
        super.dx0(i);
    }

    public final void clear() {
        super.Rv = 0;
        super.YB0 = uT();
        Arrays.fill(this.L1, 0, this.L1.length, this.vi0);
        Arrays.fill(this.Ut, 0, this.Ut.length, (byte) 0);
        Arrays.fill(this.BS, 0, this.BS.length, (Object) null);
    }

    public final short[] sA0() {
        short[] res = new short[this.Rv];
        short[] keys = this.L1;
        byte[] states = this.Ut;
        int len = states.length;
        int count = 0;
        while (len-- > 0) {
            if (states[len] == 1) {
                res[count++] = keys[len];
            }
        }
        return res;
    }

    public final Collection To() {
        return new M((w7_0) this);
    }

    public final Object[] qy(Object[] arr) {
        if (arr.length < this.Rv) {
            arr = (Object[]) Array.newInstance(arr.getClass().getComponentType(), this.Rv);
        }
        Object[] values = this.BS;
        byte[] states = this.Ut;
        int len = states.length;
        int count = 0;
        while (len-- > 0) {
            if (states[len] == 1) {
                arr[count++] = values[len];
            }
        }
        return arr;
    }

    public final boolean eQ(mm0_0 v1) {
        byte[] states = this.Ut;
        short[] keys = this.L1;
        Object[] values = this.BS;
        int len = values.length;
        while (len-- > 0) {
            if (states[len] == 1 && !v1.xH0(keys[len], values[len])) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x)) {
            return false;
        }
        x other = (x) obj;
        if (other.size() != this.Rv) {
            return false;
        }
        try {
            byte[] states = this.Ut;
            short[] keys = this.L1;
            Object[] values = this.BS;
            int len = states.length;
            while (len-- > 0) {
                if (states[len] == 1) {
                    short key = keys[len];
                    Object val = values[len];
                    if (val == null) {
                        if (other.f5(key) != null || !other.dq0(key)) {
                            return false;
                        }
                    } else if (!val.equals(other.f5(key))) {
                        return false;
                    }
                }
            }
            return true;
        } catch (ClassCastException unused) {
            return true;
        }
    }

    public final int hashCode() {
        int hash = 0;
        Object[] values = this.BS;
        byte[] states = this.Ut;
        int len = states.length;
        while (len-- > 0) {
            if (states[len] == 1) {
                short key = this.L1[len];
                Object val = values[len];
                hash += key ^ (val == null ? 0 : val.hashCode());
            }
        }
        return hash;
    }

    public final void writeExternal(ObjectOutput out) throws IOException {
        out.writeByte(0);
        out.writeByte(0);
        out.writeFloat(this.na0);
        out.writeFloat(this.yk0);
        out.writeShort(this.vi0);
        out.writeInt(this.Rv);
        byte[] states = this.Ut;
        int len = states.length;
        while (len-- > 0) {
            if (states[len] == 1) {
                out.writeShort(this.L1[len]);
                out.writeObject(this.BS[len]);
            }
        }
    }

    public final void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        in.readByte();
        super.readExternal(in);
        this.vi0 = in.readShort();
        int size = in.readInt();
        this.BS = new Object[super.La(size)];
        while (size-- > 0) {
            short key = in.readShort();
            Object val = in.readObject();
            coM4(key, val);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        boolean first = true;
        byte[] states = this.Ut;
        short[] keys = this.L1;
        Object[] values = this.BS;
        int len = values.length;
        while (len-- > 0) {
            if (states[len] == 1) {
                short key = keys[len];
                Object val = values[len];
                if (first) {
                    first = false;
                } else {
                    sb.append(",");
                }
                sb.append((int) key);
                sb.append("=");
                sb.append(val);
            }
        }
        sb.append("}");
        return sb.toString();
    }
}
