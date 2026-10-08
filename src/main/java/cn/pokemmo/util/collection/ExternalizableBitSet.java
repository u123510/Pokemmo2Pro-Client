/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.util.collection;

import f.*;

import f.dp_1;
import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class ExternalizableBitSet
implements dp_1,
Externalizable {
    static final long serialVersionUID = 1L;
    public int[] Ur;
    public int Vz0;
    public int H6;

    public ExternalizableBitSet(int n) {
        PG0 pG0 = (PG0) this;
        pG0.Ur = new int[n];
        pG0.Vz0 = 0;
        pG0.H6 = 0;
    }

    public final boolean isEmpty() {
        return this.Vz0 == 0;
    }

    public final boolean Vn(int n) {
        int n2 = this.Vz0 + 1;
        int[] nArray = this.Ur;
        if (n2 > this.Ur.length) {
            int[] nArray2 = new int[Math.max(nArray.length << 1, n2)];
            int n3 = this.Ur.length;
            System.arraycopy(this.Ur, 0, nArray2, 0, n3);
            this.Ur = nArray2;
        }
        int n4 = this.Vz0;
        this.Vz0 = n4 + 1;
        this.Ur[n4] = n;
        return true;
    }

    public final int[] toArray() {
        int n;
        block3: {
            int[] nArray;
            block2: {
                n = 0;
                int n2 = this.Vz0;
                nArray = new int[n2];
                if (n2 == 0) break block2;
                if (n2 <= 0) break block3;
                System.arraycopy(this.Ur, n, nArray, 0, n2);
            }
            return nArray;
        }
        throw new ArrayIndexOutOfBoundsException(n);
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof PG0) {
            block4: {
                object = (PG0)object;
                int n = this.Vz0;
                if (((PG0)object).Vz0 != n) {
                    return false;
                }
                do {
                    int n2 = n;
                    n = n2 + -1;
                    if (n2 <= 0) break block4;
                } while (this.Ur[n] == ((PG0)object).Ur[n]);
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int n = 0;
        int n2 = this.Vz0;
        while (true) {
            int n3 = n2;
            n2 = n3 + -1;
            if (n3 <= 0) break;
            n += this.Ur[n2];
        }
        return n;
    }

    public final String toString() {
        StringBuilder stringBuilder2 = new StringBuilder("{");
        int n2 = this.Vz0 - 1;
        for (int n = 0; n < n2; ++n) {
            StringBuilder stringBuilder3 = stringBuilder2;
            stringBuilder3.append(this.Ur[n]);
            stringBuilder3.append(", ");
        }
        int n = this.Vz0;
        if (n > 0) {
            stringBuilder2.append(this.Ur[n - 1]);
        }
        StringBuilder stringBuilder4 = stringBuilder2;
        stringBuilder4.append("}");
        return stringBuilder4.toString();
    }

    public final void writeExternal(ObjectOutput objectOutput) {
        try {
            objectOutput.writeByte(0);
            objectOutput.writeInt(this.Vz0);
            objectOutput.writeInt(this.H6);
            int n = this.Ur.length;
            objectOutput.writeInt(n);
            for (int j = 0; j < n; ++j) {
                objectOutput.writeInt(this.Ur[j]);
            }
        } catch (java.io.IOException ex) {
            sneakyThrow(ex);
        }
    }

    public final void readExternal(ObjectInput objectInput) {
        try {
            ObjectInput objectInput2 = objectInput;
            objectInput2.readByte();
            this.Vz0 = objectInput2.readInt();
            this.H6 = objectInput.readInt();
            int n = objectInput.readInt();
            this.Ur = new int[n];
            for (int j = 0; j < n; ++j) {
                this.Ur[j] = objectInput.readInt();
            }
        } catch (java.io.IOException ex) {
            sneakyThrow(ex);
        }
    }

    @SuppressWarnings("unchecked")
    private static <E extends Throwable> void sneakyThrow(Throwable throwable) throws E {
        throw (E)throwable;
    }

}

