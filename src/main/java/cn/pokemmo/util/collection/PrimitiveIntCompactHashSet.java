package cn.pokemmo.util.collection;

import f.*;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Arrays;
import java.util.List;

public class PrimitiveIntCompactHashSet extends GX implements com4__3 {
    static final long serialVersionUID = 1L;

    public PrimitiveIntCompactHashSet() {
        super();
    }

    public PrimitiveIntCompactHashSet(int i) {
        super(i);
    }

    public PrimitiveIntCompactHashSet(List list) {
        this(Math.max(list.size(), 10));
        Jn0(list);
    }

    public final int[] toArray() {
        int[] iArr = new int[this.Rv];
        int[] dH = this.dH;
        byte[] ut = this.Ut;
        int length = ut.length;
        int i = 0;
        while (length-- > 0) {
            if (ut[length] == 1) {
                iArr[i++] = dH[length];
            }
        }
        return iArr;
    }

    public final boolean Vn(int i) {
        if (yw0(i) < 0) {
            return false;
        }
        OC0(this.pRN);
        return true;
    }

    public final void Pl(int i) {
        int length = this.dH.length;
        int[] iArr = this.dH;
        byte[] bArr = this.Ut;
        this.dH = new int[i];
        this.Ut = new byte[i];
        while (length-- > 0) {
            if (bArr[length] == 1) {
                yw0(iArr[length]);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ld_0)) {
            return false;
        }
        ld_0 ld_0Var = (ld_0) obj;
        if (ld_0Var.Rv != this.Rv) {
            return false;
        }
        int length = this.Ut.length;
        while (length-- > 0) {
            if (this.Ut[length] == 1 && !ld_0Var.l90(this.dH[length])) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        int length = this.Ut.length;
        while (length-- > 0) {
            if (this.Ut[length] == 1) {
                i += this.dH[length];
            }
        }
        return i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.Rv * 2) + 2);
        sb.append("{");
        int length = this.Ut.length;
        int i = 1;
        while (length-- > 0) {
            if (this.Ut[length] == 1) {
                sb.append(this.dH[length]);
                if (i++ < this.Rv) {
                    sb.append(",");
                }
            }
        }
        sb.append("}");
        return sb.toString();
    }

    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeByte(1);
        objectOutput.writeByte(0);
        objectOutput.writeFloat(this.na0);
        objectOutput.writeFloat(this.yk0);
        objectOutput.writeInt(this.Rv);
        objectOutput.writeFloat(this.na0);
        objectOutput.writeInt(this.Tw);
        int length = this.Ut.length;
        while (length-- > 0) {
            if (this.Ut[length] == 1) {
                objectOutput.writeInt(this.dH[length]);
            }
        }
    }

    public final void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        objectInput.readByte();
        super.readExternal(objectInput);
        int readInt = objectInput.readInt();
        if (readInt >= 1) {
            this.na0 = objectInput.readFloat();
            int readInt2 = objectInput.readInt();
            this.Tw = readInt2;
            if (readInt2 != 0) {
                Arrays.fill(this.dH, readInt2);
            }
        }
        La(readInt);
        while (readInt-- > 0) {
            Vn(objectInput.readInt());
        }
    }

    public final void Jn0(List list) {
        for (Object obj : list) {
            Vn(((Integer) obj).intValue());
        }
    }
}
