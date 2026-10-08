package cn.pokemmo.ui.widget.button;

import f.*;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class ThemeToggleButton extends Ec implements XO {
    static final long serialVersionUID = 1L;
    public transient short[] YG0;

    public ThemeToggleButton() {
    }

    public final int La(int capacity) {
        int actualCapacity = super.La(capacity);
        this.YG0 = new short[actualCapacity];
        return actualCapacity;
    }

    public final void Pl(int capacity) {
        short[] oldKeys = this.zp0;
        short[] oldValues = this.YG0;
        byte[] oldStates = this.Ut;
        this.zp0 = new short[capacity];
        this.YG0 = new short[capacity];
        this.Ut = new byte[capacity];
        for (int index = oldKeys.length; --index >= 0;) {
            if (oldStates[index] == 1) {
                this.YG0[this.O50(oldKeys[index])] = oldValues[index];
            }
        }
    }

    public final short Dc0(short key, short value) {
        int index = this.O50(key);
        short previous = this.Uf;
        boolean inserted = true;
        if (index < 0) {
            index = -index - 1;
            previous = this.YG0[index];
            inserted = false;
        }
        this.YG0[index] = value;
        if (inserted) {
            this.OC0(this.L0);
        }
        return previous;
    }

    public final short f5(short key) {
        int index = this.aq0(key);
        return index < 0 ? this.Uf : this.YG0[index];
    }

    public final short Eh0(short key) {
        short previous = this.Uf;
        int index = this.aq0(key);
        if (index >= 0) {
            previous = this.YG0[index];
            this.YG0[index] = this.Uf;
            super.dx0(index);
        }
        return previous;
    }

    public final void dx0(int index) {
        this.YG0[index] = this.Uf;
        super.dx0(index);
    }

    public final boolean bm0(d5_0 procedure) {
        for (int index = this.YG0.length; --index >= 0;) {
            if (this.Ut[index] == 1 && !procedure.a3(this.zp0[index], this.YG0[index])) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object object) {
        if (!(object instanceof XO)) {
            return false;
        }
        XO other = (XO) object;
        if (other.size() != this.Rv) {
            return false;
        }
        short otherNoEntryValue = other.fW();
        for (int index = this.YG0.length; --index >= 0;) {
            if (this.Ut[index] != 1) {
                continue;
            }
            short value = this.YG0[index];
            short otherValue = other.f5(this.zp0[index]);
            if (value != otherValue && value != this.Uf && otherValue != otherNoEntryValue) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int hash = 0;
        for (int index = this.YG0.length; --index >= 0;) {
            if (this.Ut[index] == 1) {
                hash += this.zp0[index] ^ this.YG0[index];
            }
        }
        return hash;
    }

    public final String toString() {
        StringBuilder text = new StringBuilder("{");
        boolean first = true;
        for (int index = this.YG0.length; --index >= 0;) {
            if (this.Ut[index] != 1) {
                continue;
            }
            if (first) {
                first = false;
            } else {
                text.append(", ");
            }
            text.append((int) this.zp0[index]);
            text.append("=");
            text.append((int) this.YG0[index]);
        }
        text.append("}");
        return text.toString();
    }

    public final void writeExternal(ObjectOutput output) {
        try {
            output.writeByte(0);
            super.writeExternal(output);
            output.writeInt(this.Rv);
            for (int index = this.Ut.length; --index >= 0;) {
                if (this.Ut[index] == 1) {
                    output.writeShort(this.zp0[index]);
                    output.writeShort(this.YG0[index]);
                }
            }
        } catch (IOException exception) {
            throwUnchecked(exception);
        }
    }

    public final void readExternal(ObjectInput input) {
        try {
            input.readByte();
            super.readExternal(input);
            int size = input.readInt();
            this.YG0 = new short[super.La(size)];
            for (int index = size; --index >= 0;) {
                short key = input.readShort();
                this.Dc0(key, input.readShort());
            }
        } catch (IOException exception) {
            throwUnchecked(exception);
        }
    }

    private static <T extends Throwable> void throwUnchecked(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
