package cn.pokemmo.util.collection;

import f.*;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Arrays;
import java.util.Collection;

public class PrimitiveIntIntOpenHashMap extends ts_0 implements IG0 {
    static final long serialVersionUID = 1L;
    public final lh0_1 Dl0;
    public transient Object[] vJ;
    public byte F8;

    public PrimitiveIntIntOpenHashMap() {
        super();
        this.Dl0 = new lh0_1((bm0_1) this);
    }

    public PrimitiveIntIntOpenHashMap(int n) {
        super(n);
        this.Dl0 = new lh0_1((bm0_1) this);
        this.F8 = km_2.Qz;
    }

    public PrimitiveIntIntOpenHashMap(byte by, int n) {
        super(n, 0);
        this.Dl0 = new lh0_1((bm0_1) this);
        this.F8 = by;
    }

    @Override
    public final int La(int n) {
        int n2 = super.La(n);
        this.vJ = new Object[n2];
        return n2;
    }

    @Override
    public final void Pl(int n) {
        byte[] oldKeys = this.MO;
        int oldSize = this.MO.length;
        Object[] oldValues = this.vJ;
        byte[] oldStates = this.Ut;
        this.MO = new byte[n];
        this.vJ = new Object[n];
        this.Ut = new byte[n];
        for (int i = oldSize - 1; i >= 0; --i) {
            if (oldStates[i] != 1) {
                continue;
            }
            this.vJ[this.lpT8(oldKeys[i])] = oldValues[i];
        }
    }

    @Override
    public final byte SK() {
        return this.F8;
    }

    @Override
    public final Object BM(byte by) {
        int n = this.Q80(by);
        return n < 0 ? null : this.vJ[n];
    }

    @Override
    public final Object gE0(byte by, Object object) {
        int n = this.lpT8(by);
        Object old = null;
        boolean bl = true;
        if (n < 0) {
            n = -n - 1;
            old = this.vJ[n];
            bl = false;
        }
        this.vJ[n] = object;
        if (bl) {
            this.OC0(this.IF);
        }
        return old;
    }

    @Override
    public final Object lz0(byte by) {
        Object object = null;
        int n = this.Q80(by);
        if (n >= 0) {
            object = this.vJ[n];
            this.vJ[n] = null;
            super.dx0(n);
        }
        return object;
    }

    @Override
    public final void dx0(int n) {
        this.vJ[n] = null;
        super.dx0(n);
    }

    public final void o70(IG0 iG0) {
        iG0.ml0(this.Dl0);
    }

    @Override
    public final void clear() {
        this.Rv = 0;
        this.YB0 = this.uT();
        Arrays.fill(this.MO, 0, this.MO.length, this.F8);
        Arrays.fill(this.Ut, 0, this.Ut.length, (byte) 0);
        Arrays.fill(this.vJ, 0, this.vJ.length, null);
    }

    @Override
    public final Collection To() {
        return new YL0((bm0_1) this);
    }

    @Override
    public final boolean ml0(wq0_0 wq0) {
        byte[] states = this.Ut;
        byte[] keys = this.MO;
        Object[] values = this.vJ;
        for (int i = keys.length - 1; i >= 0; --i) {
            if (states[i] != 1) {
                continue;
            }
            if (!wq0.P7(keys[i], values[i])) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof IG0)) {
            return false;
        }
        IG0 other = (IG0) o;
        if (other.size() != this.Rv) {
            return false;
        }
        for (int i = this.uT() - 1; i >= 0; --i) {
            if (this.Ut[i] != 1) {
                continue;
            }
            byte key = this.MO[i];
            Object value = this.vJ[i];
            if (value == null) {
                if (other.BM(key) != null || !other.I0(key)) {
                    return false;
                }
            } else if (!value.equals(other.BM(key))) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final int hashCode() {
        int n = 0;
        Object[] values = this.vJ;
        byte[] states = this.Ut;
        for (int i = this.vJ.length - 1; i >= 0; --i) {
            if (states[i] != 1) {
                continue;
            }
            byte key = this.MO[i];
            Object value = values[i];
            int hash = value == null ? 0 : value.hashCode();
            n += key ^ hash;
        }
        return n;
    }

    @Override
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeByte(0);
        objectOutput.writeByte(0);
        objectOutput.writeFloat(this.na0);
        objectOutput.writeFloat(this.yk0);
        objectOutput.writeByte(this.F8);
        objectOutput.writeInt(this.Rv);
        for (int i = this.Ut.length - 1; i >= 0; --i) {
            if (this.Ut[i] != 1) {
                continue;
            }
            objectOutput.writeByte(this.MO[i]);
            objectOutput.writeObject(this.vJ[i]);
        }
    }

    @Override
    public final void readExternal(ObjectInput objectInput) {
        try {
        objectInput.readByte();
        super.readExternal(objectInput);
        this.F8 = objectInput.readByte();
        int n = objectInput.readInt();
        this.vJ = new Object[super.La(n)];
        for (int i = n - 1; i >= 0; --i) {
            byte by = objectInput.readByte();
            this.gE0(by, objectInput.readObject());
        }
        } catch (IOException | ClassNotFoundException ex) {
            PrimitiveIntIntOpenHashMap.sneakyThrow(ex);
        }
    }

    @SuppressWarnings("unchecked")
    private static <E extends Throwable> void sneakyThrow(Throwable throwable) throws E {
        throw (E) throwable;
    }

    @Override
    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        boolean first = true;
        byte[] states = this.Ut;
        byte[] keys = this.MO;
        Object[] values = this.vJ;
        for (int i = keys.length - 1; i >= 0; --i) {
            if (states[i] != 1) {
                continue;
            }
            byte key = keys[i];
            Object value = values[i];
            if (first) {
                first = false;
            } else {
                sb.append(",");
            }
            sb.append(key);
            sb.append("=");
            sb.append(value);
        }
        sb.append("}");
        return sb.toString();
    }
}





