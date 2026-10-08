package cn.pokemmo.util.collection;

import f.*;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class PrimitiveIntFloatOpenHashMap extends ya0_1 {
    static final long serialVersionUID = 1L;
    public transient float[] US;

    public PrimitiveIntFloatOpenHashMap() {
        super();
    }

    public PrimitiveIntFloatOpenHashMap(int i) {
        super(i);
    }

    public final int La(int i) {
        int La = super.La(i);
        this.US = new float[La];
        return La;
    }

    public final void Pl(int i) {
        int length = this.E70.length;
        int[] iArr = this.E70;
        float[] fArr = this.US;
        byte[] bArr = this.Ut;
        this.E70 = new int[i];
        this.US = new float[i];
        this.Ut = new byte[i];
        while (length-- > 0) {
            if (bArr[length] == 1) {
                int Lq0 = Lq0(iArr[length]);
                this.US[Lq0] = fArr[length];
            }
        }
    }

    public final void dx0(int i) {
        this.US[i] = this.DM;
        super.dx0(i);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ha0_1)) {
            return false;
        }
        ha0_1 ha0_1Var = (ha0_1) obj;
        if (ha0_1Var.Rv != this.Rv) {
            return false;
        }
        float[] fArr = this.US;
        byte[] bArr = this.Ut;
        float f = this.DM;
        float f2 = ha0_1Var.DM;
        int length = bArr.length;
        while (length-- > 0) {
            if (bArr[length] == 1) {
                int bf0 = ha0_1Var.bf0(this.E70[length]);
                float f3 = bf0 < 0 ? ha0_1Var.DM : ha0_1Var.US[bf0];
                float f4 = fArr[length];
                if (f4 != f3 && f4 != f && f3 != f2) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        byte[] bArr = this.Ut;
        int length = this.US.length;
        while (length-- > 0) {
            if (bArr[length] == 1) {
                int i2 = this.E70[length];
                float f = this.US[length];
                if (!JS.t40 && Float.isNaN(f)) {
                    throw new AssertionError("Values of NaN are not supported.");
                }
                i += i2 ^ Float.floatToIntBits(f * 663608960.0F);
            }
        }
        return i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        boolean first = true;
        byte[] bArr = this.Ut;
        int[] iArr = this.E70;
        float[] fArr = this.US;
        int length = fArr.length;
        while (length-- > 0) {
            if (bArr[length] == 1) {
                int i = iArr[length];
                float f = fArr[length];
                if (first) {
                    first = false;
                } else {
                    sb.append(", ");
                }
                sb.append(i).append("=").append(f);
            }
        }
        sb.append("}");
        return sb.toString();
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> void throwUnchecked(Throwable error) throws T {
        throw (T) error;
    }

    public final void writeExternal(ObjectOutput objectOutput) {
        try {
            objectOutput.writeByte(0);
            super.writeExternal(objectOutput);
            objectOutput.writeInt(this.Rv);
            int length = this.Ut.length;
            while (length-- > 0) {
                if (this.Ut[length] == 1) {
                    objectOutput.writeInt(this.E70[length]);
                    objectOutput.writeFloat(this.US[length]);
                }
            }
        } catch (IOException e) {
            throwUnchecked(e);
        }
    }

    public final void readExternal(ObjectInput objectInput) {
        try {
            objectInput.readByte();
            super.readExternal(objectInput);
            int readInt = objectInput.readInt();
            this.US = new float[super.La(readInt)];
            while (readInt-- > 0) {
                int readInt2 = objectInput.readInt();
                Ns(readInt2, objectInput.readFloat());
            }
        } catch (IOException e) {
            throwUnchecked(e);
        }
    }

    public final void Ns(int i, float f) {
        int Lq0 = Lq0(i);
        boolean z = true;
        if (Lq0 < 0) {
            Lq0 = (-Lq0) - 1;
            z = false;
        }
        this.US[Lq0] = f;
        if (z) {
            OC0(this.Uq);
        }
    }
}
