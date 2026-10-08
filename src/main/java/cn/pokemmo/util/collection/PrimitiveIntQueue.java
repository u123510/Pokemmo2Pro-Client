package cn.pokemmo.util.collection;

import f.*;

import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.IOException;

public class PrimitiveIntQueue extends nw0_0 {
    static final long serialVersionUID = 1L;
    public transient int[] Vd0;

    public PrimitiveIntQueue() {
    }

    public PrimitiveIntQueue(int capacity) {
        super(capacity);
    }

    public final int La(int size) {
        int capacity = super.La(size);
        this.Vd0 = new int[capacity];
        return capacity;
    }

    public final void Pl(int capacity) {
        short[] oldKeys = this.bS;
        int oldLength = oldKeys.length;
        int[] oldValues = this.Vd0;
        byte[] oldUsed = this.Ut;
        this.bS = new short[capacity];
        this.Vd0 = new int[capacity];
        this.Ut = new byte[capacity];
        while (--oldLength >= 0) {
            if (oldUsed[oldLength] == 1) {
                int index = this.zJ(oldKeys[oldLength]);
                this.Vd0[index] = oldValues[oldLength];
            }
        }
    }

    public final int mk(short key) {
        int index = this.Dz0(key);
        return index < 0 ? this.ik0 : this.Vd0[index];
    }

    public final void dx0(int index) {
        this.Vd0[index] = this.ik0;
        super.dx0(index);
    }

    public final boolean equals(Object object) {
        if (!(object instanceof RB)) {
            return false;
        }

        RB other = (RB)object;
        if (other.Rv != this.Rv) {
            return false;
        }

        int[] values = this.Vd0;
        byte[] used = this.Ut;
        int defaultValue = this.ik0;
        int otherDefaultValue = other.ik0;
        for (int index = values.length - 1; index >= 0; index--) {
            if (used[index] == 1) {
                int value = values[index];
                int otherValue = other.mk(this.bS[index]);
                if (value != otherValue && value != defaultValue && otherValue != otherDefaultValue) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        int hash = 0;
        for (int index = this.Vd0.length - 1; index >= 0; index--) {
            if (this.Ut[index] == 1) {
                hash += this.bS[index] ^ this.Vd0[index];
            }
        }
        return hash;
    }

    public final String toString() {
        StringBuilder result = new StringBuilder("{");
        boolean first = true;
        for (int index = this.bS.length - 1; index >= 0; index--) {
            if (this.Ut[index] == 1) {
                if (first) {
                    first = false;
                } else {
                    result.append(", ");
                }
                result.append(this.bS[index]).append("=").append(this.Vd0[index]);
            }
        }
        return result.append("}").toString();
    }

    public final void writeExternal(ObjectOutput output) {
        try {
            output.writeByte(0);
            super.writeExternal(output);
            output.writeInt(this.Rv);
            for (int index = this.Ut.length - 1; index >= 0; index--) {
                if (this.Ut[index] == 1) {
                    output.writeShort(this.bS[index]);
                    output.writeInt(this.Vd0[index]);
                }
            }
        } catch (IOException error) {
            PrimitiveIntQueue.<RuntimeException>rethrowUnchecked(error);
        }
    }

    public final void readExternal(ObjectInput input) {
        try {
            input.readByte();
            super.readExternal(input);
            int count = input.readInt();
            this.Vd0 = new int[super.La(count)];
            while (--count >= 0) {
                short key = input.readShort();
                this.JF0(input.readInt(), key);
            }
        } catch (IOException error) {
            PrimitiveIntQueue.<RuntimeException>rethrowUnchecked(error);
        }
    }

    public final void JF0(int value, short key) {
        int index = this.zJ(key);
        boolean inserted = true;
        if (index < 0) {
            index = -index - 1;
            int previous = this.Vd0[index];
            inserted = false;
        }
        this.Vd0[index] = value;
        if (inserted) {
            this.OC0(this.Lz0);
        }
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> void rethrowUnchecked(Throwable error) throws T {
        throw (T)error;
    }
}
