package cn.pokemmo.util.collection;

import f.*;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class PrimitiveLongObjectHashMap extends ng0_1 {
    static final long serialVersionUID = 1L;
    public transient Object[] Xv;
    public long lI0;

    public PrimitiveLongObjectHashMap() {
    }

    @Override
    public final int La(int i) {
        int La = super.La(i);
        this.Xv = new Object[La];
        return La;
    }

    public final void Pl(int i) {
        int length = this.q6.length;
        long[] oldKeys = this.q6;
        Object[] oldValues = this.Xv;
        byte[] oldStates = this.Ut;
        this.q6 = new long[i];
        this.Xv = new Object[i];
        this.Ut = new byte[i];
        while (length-- > 0) {
            if (oldStates[length] == 1) {
                int COM3 = COM3(oldKeys[length]);
                this.Xv[COM3] = oldValues[length];
            }
        }
    }

    @Override
    public final void dx0(int i) {
        this.Xv[i] = null;
        super.dx0(i);
    }

    @Override
    public final boolean equals(Object obj) {
        if (!(obj instanceof pa0_2)) {
            return false;
        }
        pa0_2 other = (pa0_2) obj;
        if (other.Rv != this.Rv) {
            return false;
        }
        try {
            int capacity = uT();
            byte[] states = this.Ut;
            while (capacity-- > 0) {
                if (states[capacity] == 1) {
                    long key = this.q6[capacity];
                    Object val = this.Xv[capacity];
                    int otherIdx = other.Ma0(key);
                    Object otherVal = otherIdx >= 0 ? other.Xv[otherIdx] : null;
                    if (val == null) {
                        if (otherVal != null || other.Ma0(key) < 0) {
                            return false;
                        }
                    } else if (!val.equals(otherVal)) {
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
        Object[] values = this.Xv;
        byte[] states = this.Ut;
        int len = states.length;
        while (len-- > 0) {
            if (states[len] == 1) {
                long key = this.q6[len];
                int keyHash = (int) (key ^ (key >>> 32));
                Object val = values[len];
                int valHash = val == null ? 0 : val.hashCode();
                h += keyHash ^ valHash;
            }
        }
        return h;
    }

    @Override
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeByte(0);
        objectOutput.writeByte(0);
        objectOutput.writeFloat(this.na0);
        objectOutput.writeFloat(this.yk0);
        objectOutput.writeLong(this.lI0);
        objectOutput.writeInt(this.Rv);
        int len = this.Ut.length;
        while (len-- > 0) {
            if (this.Ut[len] == 1) {
                objectOutput.writeLong(this.q6[len]);
                objectOutput.writeObject(this.Xv[len]);
            }
        }
    }

    @Override
    public final void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        objectInput.readByte();
        super.readExternal(objectInput);
        this.lI0 = objectInput.readLong();
        int size = objectInput.readInt();
        super.La(size);
        this.Xv = new Object[size];
        while (size-- > 0) {
            long key = objectInput.readLong();
            Object val = objectInput.readObject();
            bc0(key, val);
        }
    }

    @Override
    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        boolean first = true;
        byte[] states = this.Ut;
        long[] keys = this.q6;
        Object[] values = this.Xv;
        int len = values.length;
        while (len-- > 0) {
            if (states[len] == 1) {
                long key = keys[len];
                Object val = values[len];
                if (first) {
                    first = false;
                } else {
                    sb.append(",");
                }
                sb.append(key);
                sb.append("=");
                sb.append(val);
            }
        }
        sb.append("}");
        return sb.toString();
    }

    public final void bc0(long key, Object value) {
        int index = COM3(key);
        boolean isNew = true;
        if (index < 0) {
            index = -index - 1;
            Object oldVal = this.Xv[index];
            isNew = false;
        }
        this.Xv[index] = value;
        if (isNew) {
            OC0(this.uL);
        }
    }
}
