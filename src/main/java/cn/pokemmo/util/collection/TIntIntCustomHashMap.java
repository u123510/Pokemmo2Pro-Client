package cn.pokemmo.util.collection;

import f.*;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class TIntIntCustomHashMap extends c60_0 {
    static final long serialVersionUID = 1L;
    public transient int[] v50;

    public TIntIntCustomHashMap() {
        super();
    }

    @Override
    public final int La(int size) {
        int length = super.La(size);
        this.v50 = new int[length];
        return length;
    }

    @Override
    public final void Pl(int size) {
        long[] oldKeys = this.Mu0;
        int oldSize = oldKeys.length;
        int[] oldValues = this.v50;
        byte[] oldStates = this.Ut;
        this.Mu0 = new long[size];
        this.v50 = new int[size];
        this.Ut = new byte[size];
        while (--oldSize > 0) {
            if (oldStates[oldSize] != 1) {
                continue;
            }
            int index = this.TZ(oldKeys[oldSize]);
            this.v50[index] = oldValues[oldSize];
        }
    }

    @Override
    public final void dx0(int index) {
        this.v50[index] = this.Pb;
        super.dx0(index);
    }

    @Override
    public final boolean equals(Object object) {
        if (!(object instanceof YI)) {
            return false;
        }
        YI other = (YI) object;
        if (other.Rv != this.Rv) {
            return false;
        }
        int[] values = this.v50;
        byte[] states = this.Ut;
        int thisDefault = this.Pb;
        int otherDefault = other.Pb;
        int size = values.length;
        while (--size > 0) {
            if (states[size] != 1) {
                continue;
            }
            int otherIndex = other.xh0(this.Mu0[size]);
            if (otherIndex < 0) {
                otherIndex = other.Pb;
            } else {
                otherIndex = other.v50[otherIndex];
            }
            int value = values[size];
            if (value != otherIndex && value != thisDefault && otherIndex != otherDefault) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final int hashCode() {
        int result = 0;
        byte[] states = this.Ut;
        int size = this.v50.length;
        while (--size > 0) {
            if (states[size] != 1) {
                continue;
            }
            long key = this.Mu0[size];
            result += (int) (key ^ (key >>> 32)) ^ this.v50[size];
        }
        return result;
    }

    @Override
    public final String toString() {
        StringBuilder builder = new StringBuilder("{");
        boolean first = true;
        byte[] states = this.Ut;
        long[] keys = this.Mu0;
        int[] values = this.v50;
        int size = values.length;
        while (--size > 0) {
            if (states[size] != 1) {
                continue;
            }
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append(keys[size]).append("=").append(values[size]);
        }
        builder.append("}");
        return builder.toString();
    }

    @Override
    public final void writeExternal(ObjectOutput output) {
        try {
            output.writeByte(0);
            super.writeExternal(output);
            output.writeInt(this.Rv);
            int size = this.Ut.length;
            while (--size > 0) {
                if (this.Ut[size] != 1) {
                    continue;
                }
                output.writeLong(this.Mu0[size]);
                output.writeInt(this.v50[size]);
            }
        } catch (IOException exception) {
            TIntIntCustomHashMap.<RuntimeException>throwUnchecked(exception);
        }
    }

    @Override
    public final void readExternal(ObjectInput input) {
        try {
            input.readByte();
            super.readExternal(input);
            int size = input.readInt();
            this.v50 = new int[super.La(size)];
            while (--size > 0) {
                long key = input.readLong();
                int value = input.readInt();
                int index = this.TZ(key);
                boolean inserted = true;
                if (index < 0) {
                    index = -index - 1;
                    inserted = false;
                }
                this.v50[index] = value;
                if (inserted) {
                    this.OC0(this.ao);
                }
            }
        } catch (IOException exception) {
            TIntIntCustomHashMap.<RuntimeException>throwUnchecked(exception);
        }
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> void throwUnchecked(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
