package cn.pokemmo.util.collection;

import f.*;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Arrays;

public class PrimitiveShortCompactHashSet extends pz0_0 implements ce0_1 {
    static final long serialVersionUID = 1L;

    public PrimitiveShortCompactHashSet() {
        super();
    }

    public PrimitiveShortCompactHashSet(int i1) {
        super(i1);
    }

    public final short[] Eo() {
        short[] arr = new short[this.Rv];
        short[] v1 = this.L1;
        byte[] v2 = this.Ut;
        int i3 = v2.length;
        int i4 = 0;
        while (i3-- > 0) {
            if (v2[i3] == 1) {
                arr[i4++] = v1[i3];
            }
        }
        return arr;
    }

    public final boolean TI0(short i1) {
        if (this.D10(i1) < 0) {
            return false;
        }
        this.OC0(this.EH);
        return true;
    }

    @Override
    public final void Pl(int i1) {
        short[] oldL1 = this.L1;
        int i2 = oldL1.length;
        byte[] oldUt = this.Ut;
        this.L1 = new short[i1];
        this.Ut = new byte[i1];
        while (i2-- > 0) {
            if (oldUt[i2] == 1) {
                this.D10(oldL1[i2]);
            }
        }
    }

    @Override
    public final boolean equals(Object v1) {
        if (!(v1 instanceof ce0_1)) {
            return false;
        }
        ce0_1 set = (ce0_1) v1;
        if (set.size() != this.Rv) {
            return false;
        }
        int i2 = this.Ut.length;
        while (i2-- > 0) {
            if (this.Ut[i2] == 1 && !set.bL0(this.L1[i2])) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final int hashCode() {
        int i1 = 0;
        int i2 = this.Ut.length;
        while (i2-- > 0) {
            if (this.Ut[i2] == 1) {
                i1 += this.L1[i2];
            }
        }
        return i1;
    }

    @Override
    public final String toString() {
        StringBuilder v1 = new StringBuilder(this.Rv * 2 + 2);
        v1.append("{");
        int i2 = this.Ut.length;
        int i3 = 1;
        while (i2-- > 0) {
            if (this.Ut[i2] == 1) {
                v1.append((int) this.L1[i2]);
                if (i3++ < this.Rv) {
                    v1.append(",");
                }
            }
        }
        v1.append("}");
        return v1.toString();
    }

    @Override
    public final void writeExternal(ObjectOutput v1) throws IOException {
        v1.writeByte(1);
        v1.writeByte(0);
        v1.writeFloat(this.na0);
        v1.writeFloat(this.yk0);
        v1.writeInt(this.Rv);
        v1.writeFloat(this.na0);
        v1.writeShort(this.Tn0);
        int i2 = this.Ut.length;
        while (i2-- > 0) {
            if (this.Ut[i2] == 1) {
                v1.writeShort(this.L1[i2]);
            }
        }
    }

    @Override
    public final void readExternal(ObjectInput v1) throws IOException, ClassNotFoundException {
        byte version = v1.readByte();
        super.readExternal(v1);
        int i2 = v1.readInt();
        if (version >= 1) {
            this.na0 = v1.readFloat();
            short i3 = v1.readShort();
            this.Tn0 = i3;
            if (i3 != 0) {
                Arrays.fill(this.L1, i3);
            }
        }
        this.La(i2);
        while (i2-- > 0) {
            this.TI0(v1.readShort());
        }
    }

    public final void W30(short[] v1) {
        int i2 = v1.length;
        while (i2-- > 0) {
            this.TI0(v1[i2]);
        }
    }
}
