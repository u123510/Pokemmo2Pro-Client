package cn.pokemmo.util.collection;

import f.*;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class TIntObjectCustomHashMap extends KR {
    static final long serialVersionUID = 1L;
    public transient int[] IL0;

    public TIntObjectCustomHashMap() {
        super();
    }

    public TIntObjectCustomHashMap(int size) {
        super(size);
    }

    @Override
    public final int La(int size) {
        int length = super.La(size);
        this.IL0 = new int[length];
        return length;
    }

    @Override
    public final void Pl(int size) {
        int[] oldKeys = this.kQ;
        int oldSize = oldKeys.length;
        int[] oldValues = this.IL0;
        byte[] oldStates = this.Ut;
        this.kQ = new int[size];
        this.IL0 = new int[size];
        this.Ut = new byte[size];
        while (--oldSize > 0) {
            if (oldStates[oldSize] != 1) {
                continue;
            }
            int index = this.q3(oldKeys[oldSize]);
            this.IL0[index] = oldValues[oldSize];
        }
    }

    @Override
    public final void dx0(int index) {
        this.IL0[index] = this.dJ;
        super.dx0(index);
    }

    @Override
    public final boolean equals(Object object) {
        if (!(object instanceof Y60)) {
            return false;
        }
        Y60 other = (Y60) object;
        if (other.Rv != this.Rv) {
            return false;
        }
        int[] values = this.IL0;
        byte[] states = this.Ut;
        int thisDefault = this.dJ;
        int otherDefault = other.dJ;
        int size = values.length;
        while (--size > 0) {
            if (states[size] != 1) {
                continue;
            }
            int otherIndex = other.IJ0(this.kQ[size]);
            if (otherIndex < 0) {
                otherIndex = other.dJ;
            } else {
                otherIndex = other.IL0[otherIndex];
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
        int size = this.IL0.length;
        while (--size > 0) {
            if (states[size] != 1) {
                continue;
            }
            result += this.kQ[size] ^ this.IL0[size];
        }
        return result;
    }

    @Override
    public final String toString() {
        StringBuilder builder = new StringBuilder("{");
        boolean first = true;
        byte[] states = this.Ut;
        int[] keys = this.kQ;
        int[] values = this.IL0;
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
                output.writeInt(this.kQ[size]);
                output.writeInt(this.IL0[size]);
            }
        } catch (IOException exception) {
            TIntObjectCustomHashMap.<RuntimeException>throwUnchecked(exception);
        }
    }

    @Override
    public final void readExternal(ObjectInput input) {
        try {
            input.readByte();
            super.readExternal(input);
            int size = input.readInt();
            this.IL0 = new int[super.La(size)];
            while (--size > 0) {
                int key = input.readInt();
                int value = input.readInt();
                this.Y6(key, value);
            }
        } catch (IOException exception) {
            TIntObjectCustomHashMap.<RuntimeException>throwUnchecked(exception);
        }
    }

    public final void Y6(int key, int value) {
        int index = this.q3(key);
        boolean inserted = true;
        if (index < 0) {
            index = -index - 1;
            inserted = false;
        }
        this.IL0[index] = value;
        if (inserted) {
            this.OC0(this.bf0);
        }
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> void throwUnchecked(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
