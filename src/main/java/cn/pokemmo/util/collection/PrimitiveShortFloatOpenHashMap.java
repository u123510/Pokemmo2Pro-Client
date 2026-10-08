package cn.pokemmo.util.collection;

import f.*;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class PrimitiveShortFloatOpenHashMap extends hl_0 {
    static final long serialVersionUID = 1L;
    public transient float[] AJ;

    public PrimitiveShortFloatOpenHashMap() {
        super();
    }

    @Override
    public final int La(int capacity) {
        int length = super.La(capacity);
        this.AJ = new float[length];
        return length;
    }

    public final void Pl(int capacity) {
        short[] oldKeys = this.r7;
        int length = oldKeys.length;
        float[] oldValues = this.AJ;
        byte[] oldStates = this.Ut;
        this.r7 = new short[capacity];
        this.AJ = new float[capacity];
        this.Ut = new byte[capacity];
        while (length-- > 0) {
            if (oldStates[length] == 1) {
                int index = this.pL0(oldKeys[length]);
                this.AJ[index] = oldValues[length];
            }
        }
    }

    public final float EW(short key) {
        byte[] states = this.Ut;
        short[] keys = this.r7;
        int length = keys.length;
        int hash = key & Integer.MAX_VALUE;
        int start = hash % length;
        byte state = states[start];
        int index;
        if (state == 0) {
            index = -1;
        } else if (state == 1 && keys[start] == key) {
            index = start;
        } else {
            int probe = sj_0.oC0(length, 2, hash, 1);
            int cur = start;
            while (true) {
                cur -= probe;
                if (cur < 0) {
                    cur += length;
                }
                byte nextState = states[cur];
                if (nextState == 0) {
                    index = -1;
                    break;
                }
                if (key == keys[cur] && nextState != 2) {
                    index = cur;
                    break;
                }
                if (cur == start) {
                    index = -1;
                    break;
                }
            }
        }
        return index < 0 ? this.GE0 : this.AJ[index];
    }

    @Override
    public final void dx0(int index) {
        this.AJ[index] = this.GE0;
        super.dx0(index);
    }

    @Override
    public final boolean equals(Object obj) {
        if (!(obj instanceof pe0_0)) {
            return false;
        }
        pe0_0 other = (pe0_0) obj;
        if (other.Rv != this.Rv) {
            return false;
        }
        float[] values = this.AJ;
        byte[] states = this.Ut;
        float otherNoEntry = other.GE0;
        float thisNoEntry = this.GE0;
        for (int i = states.length; i-- > 0; ) {
            if (states[i] == 1) {
                float otherVal = other.EW(this.r7[i]);
                float thisVal = values[i];
                if (thisVal != otherVal && thisVal != otherNoEntry && otherVal != thisNoEntry) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public final int hashCode() {
        int hash = 0;
        byte[] states = this.Ut;
        for (int i = this.AJ.length; i-- > 0; ) {
            if (states[i] == 1) {
                short key = this.r7[i];
                float value = this.AJ[i];
                if (!JS.t40 && Float.isNaN(value)) {
                    throw new AssertionError("Values of NaN are not supported.");
                }
                hash += key ^ Float.floatToIntBits(value * 663608960.0f);
            }
        }
        return hash;
    }

    @Override
    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        boolean first = true;
        byte[] states = this.Ut;
        short[] keys = this.r7;
        float[] values = this.AJ;
        for (int i = values.length; i-- > 0; ) {
            if (states[i] == 1) {
                short key = keys[i];
                float value = values[i];
                if (first) {
                    first = false;
                } else {
                    sb.append(", ");
                }
                sb.append((int) key);
                sb.append("=");
                sb.append(value);
            }
        }
        sb.append("}");
        return sb.toString();
    }

    @Override
    public final void writeExternal(ObjectOutput out) throws IOException {
        out.writeByte(0);
        super.writeExternal(out);
        out.writeInt(this.Rv);
        for (int i = this.Ut.length; i-- > 0; ) {
            if (this.Ut[i] == 1) {
                out.writeShort(this.r7[i]);
                out.writeFloat(this.AJ[i]);
            }
        }
    }

    @Override
    public final void readExternal(ObjectInput in) {
        try {
            in.readByte();
            super.readExternal(in);
            int size = in.readInt();
            super.La(size);
            this.AJ = new float[this.r7.length];
            while (size-- > 0) {
                short key = in.readShort();
                float value = in.readFloat();
                int index = this.pL0(key);
                boolean isNew = true;
                if (index < 0) {
                    index = -index - 1;
                    float old = this.AJ[index];
                    isNew = false;
                }
                this.AJ[index] = value;
                if (isNew) {
                    this.OC0(this.My);
                }
            }
        } catch (IOException e) {
            throwUnchecked(e);
        }
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> void throwUnchecked(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
