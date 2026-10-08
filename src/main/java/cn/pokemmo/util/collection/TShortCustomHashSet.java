package cn.pokemmo.util.collection;

import f.*;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class TShortCustomHashSet extends wd0_0 {
    static final long serialVersionUID = 1L;
    public transient short[] ie0;

    public TShortCustomHashSet() {
        super();
    }

    @Override
    public final int La(int size) {
        int length = super.La(size);
        this.ie0 = new short[length];
        return length;
    }

    @Override
    public final void Pl(int size) {
        int[] oldKeys = this.vW;
        int oldSize = oldKeys.length;
        short[] oldValues = this.ie0;
        byte[] oldStates = this.Ut;
        this.vW = new int[size];
        this.ie0 = new short[size];
        this.Ut = new byte[size];
        while (--oldSize > 0) {
            if (oldStates[oldSize] != 1) {
                continue;
            }
            int index = this.at0(oldKeys[oldSize]);
            this.ie0[index] = oldValues[oldSize];
        }
    }

    @Override
    public final void dx0(int index) {
        this.ie0[index] = this.XQ;
        super.dx0(index);
    }

    @Override
    public final boolean equals(Object object) {
        if (!(object instanceof YT)) {
            return false;
        }
        YT other = (YT) object;
        if (other.Rv != this.Rv) {
            return false;
        }
        short[] values = this.ie0;
        byte[] states = this.Ut;
        short thisDefault = this.XQ;
        short otherDefault = other.XQ;
        int size = values.length;
        while (--size > 0) {
            if (states[size] != 1) {
                continue;
            }
            int otherIndex = other.uw(this.vW[size]);
            short otherValue = otherIndex < 0 ? otherDefault : other.ie0[otherIndex];
            short value = values[size];
            if (value != otherValue && value != thisDefault && otherValue != otherDefault) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final int hashCode() {
        int result = 0;
        byte[] states = this.Ut;
        int size = this.ie0.length;
        while (--size > 0) {
            if (states[size] == 1) {
                result += this.vW[size] ^ this.ie0[size];
            }
        }
        return result;
    }

    @Override
    public final String toString() {
        StringBuilder builder = new StringBuilder("{");
        boolean first = true;
        int size = this.ie0.length;
        while (--size > 0) {
            if (this.Ut[size] != 1) {
                continue;
            }
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append(this.vW[size]).append('=').append(this.ie0[size]);
        }
        return builder.append('}').toString();
    }

    @Override
    public final void writeExternal(ObjectOutput output) {
        try {
            output.writeByte(0);
            super.writeExternal(output);
            output.writeInt(this.Rv);
            int size = this.Ut.length;
            while (--size > 0) {
                if (this.Ut[size] == 1) {
                    output.writeInt(this.vW[size]);
                    output.writeShort(this.ie0[size]);
                }
            }
        } catch (IOException error) {
            TShortCustomHashSet.<RuntimeException>throwUnchecked(error);
        }
    }

    @Override
    public final void readExternal(ObjectInput input) {
        try {
            input.readByte();
            super.readExternal(input);
            int size = input.readInt();
            this.ie0 = new short[super.La(size)];
            while (--size > 0) {
                int key = input.readInt();
                short value = input.readShort();
                int index = this.at0(key);
                boolean inserted = true;
                if (index < 0) {
                    index = -index - 1;
                    this.ie0[index] = this.ie0[index];
                    inserted = false;
                }
                this.ie0[index] = value;
                if (inserted) {
                    this.OC0(this.vx);
                }
            }
        } catch (IOException error) {
            TShortCustomHashSet.<RuntimeException>throwUnchecked(error);
        }
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> void throwUnchecked(Throwable error) throws T {
        throw (T) error;
    }
}
