package cn.pokemmo.util.collection;

import f.*;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class PrimitiveShortByteOpenHashMap extends x40_0 {
    static final long serialVersionUID = 1L;
    public transient byte[] y10;

    public PrimitiveShortByteOpenHashMap() {
        super();
    }

    @Override
    public final int La(int i) {
        int result = super.La(i);
        this.y10 = new byte[result];
        return result;
    }

    @Override
    public final void Pl(int i) {
        short[] olds = this.jA0;
        int len = olds.length;
        byte[] oldVals = this.y10;
        byte[] oldStates = this.Ut;
        this.jA0 = new short[i];
        this.y10 = new byte[i];
        this.Ut = new byte[i];
        while (len-- > 0) {
            if (oldStates[len] == 1) {
                int slot = lpt2(olds[len]);
                this.y10[slot] = oldVals[len];
            }
        }
    }

    public final byte aU(short s) {
        byte[] states = this.Ut;
        short[] keys = this.jA0;
        int length = keys.length;
        int hash = s & Integer.MAX_VALUE;
        int slot = hash % length;
        byte state = states[slot];
        if (state == 0) {
            slot = -1;
        } else if (state != 1 || keys[slot] != s) {
            int step = sj_0.oC0(length, 2, hash, 1);
            int index = slot;
            while (true) {
                index -= step;
                if (index < 0) {
                    index += length;
                }
                byte nextState = states[index];
                if (nextState == 0) {
                    slot = -1;
                    break;
                }
                if (s == keys[index] && nextState != 2) {
                    slot = index;
                    break;
                }
                if (index == slot) {
                    slot = -1;
                    break;
                }
            }
        }

        if (slot < 0) {
            return this.SH;
        }
        return this.y10[slot];
    }

    @Override
    public final void dx0(int i) {
        this.y10[i] = this.SH;
        super.dx0(i);
    }

    @Override
    public final boolean equals(Object obj) {
        if (!(obj instanceof pi_0)) {
            return false;
        }
        pi_0 other = (pi_0) obj;
        if (other.Rv != this.Rv) {
            return false;
        }
        byte[] values = this.y10;
        byte[] states = this.Ut;
        byte noEntryVal = this.SH;
        byte otherNoEntryVal = other.SH;
        int len = states.length;
        while (len-- > 0) {
            if (states[len] == 1) {
                byte b = other.aU(this.jA0[len]);
                byte b2 = values[len];
                if (b2 != b && b2 != noEntryVal && b != otherNoEntryVal) {
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
        int len = this.y10.length;
        while (len-- > 0) {
            if (states[len] == 1) {
                hash += this.jA0[len] ^ this.y10[len];
            }
        }
        return hash;
    }

    @Override
    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        boolean first = true;
        byte[] states = this.Ut;
        short[] keys = this.jA0;
        byte[] values = this.y10;
        int len = values.length;
        while (len-- > 0) {
            if (states[len] == 1) {
                short k = keys[len];
                byte v = values[len];
                if (first) {
                    first = false;
                } else {
                    sb.append(", ");
                }
                sb.append((int) k).append("=").append((int) v);
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
        int len = this.Ut.length;
        while (len-- > 0) {
            if (this.Ut[len] == 1) {
                out.writeShort(this.jA0[len]);
                out.writeByte(this.y10[len]);
            }
        }
    }

    @Override
    public final void readExternal(ObjectInput in) {
        try {
            in.readByte();
            super.readExternal(in);
            int size = in.readInt();
            this.y10 = new byte[super.La(size)];
            while (size-- > 0) {
                short key = in.readShort();
                byte val = in.readByte();
                int slot = lpt2(key);
                boolean isNew = true;
                if (slot < 0) {
                    slot = -slot - 1;
                    isNew = false;
                }
                this.y10[slot] = val;
                if (isNew) {
                    OC0(this.H6);
                }
            }
        } catch (IOException e) {
            throwUnchecked(e);
        }
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> T throwUnchecked(Throwable t) throws T {
        throw (T) t;
    }
}

