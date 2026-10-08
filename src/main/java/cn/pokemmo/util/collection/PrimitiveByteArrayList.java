/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.util.collection;

import f.*;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/*
 * Renamed from f.Fa
 */
public class PrimitiveByteArrayList
implements Externalizable {
    static final long serialVersionUID = 1L;
    public byte[] DK0;
    public int j5;
    public byte bG0;

    public PrimitiveByteArrayList() {
        this(10, 0);
    }

    public PrimitiveByteArrayList(int n) {
        this(4, 0);
    }

    public PrimitiveByteArrayList(int n, int n2) {
        PrimitiveByteArrayList fa_02 = this;
        fa_02.DK0 = new byte[n];
        fa_02.j5 = 0;
        fa_02.bG0 = 0;
    }

    public final byte[] Jh0() {
        int n;
        block3: {
            byte[] byArray;
            block2: {
                n = 0;
                int n2 = this.j5;
                byArray = new byte[n2];
                if (n2 == 0) break block2;
                if (n2 <= 0) break block3;
                System.arraycopy(this.DK0, n, byArray, 0, n2);
            }
            return byArray;
        }
        throw new ArrayIndexOutOfBoundsException(n);
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof fa_0) {
            block4: {
                object = (fa_0)object;
                int n = this.j5;
                if (((fa_0)object).j5 != n) {
                    return false;
                }
                do {
                    int n2 = n;
                    n = n2 + -1;
                    if (n2 <= 0) break block4;
                } while (this.DK0[n] == ((fa_0)object).DK0[n]);
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int n = 0;
        int n2 = this.j5;
        while (true) {
            int n3 = n2;
            n2 = n3 + -1;
            if (n3 <= 0) break;
            n += this.DK0[n2];
        }
        return n;
    }

    public final String toString() {
        int n;
        StringBuilder stringBuilder2 = new StringBuilder("{");
        int n2 = this.j5 - 1;
        for (n = 0; n < n2; ++n) {
            StringBuilder stringBuilder3 = stringBuilder2;
            stringBuilder3.append(this.DK0[n]);
            stringBuilder3.append(", ");
        }
        n = this.j5;
        if (n > 0) {
            stringBuilder2.append(this.DK0[n - 1]);
        }
        StringBuilder stringBuilder4 = stringBuilder2;
        stringBuilder4.append("}");
        return stringBuilder4.toString();
    }

    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeByte(0);
        objectOutput.writeInt(this.j5);
        objectOutput.writeByte(this.bG0);
        int n = this.DK0.length;
        objectOutput.writeInt(n);
        for (int j = 0; j < n; ++j) {
            objectOutput.writeByte(this.DK0[j]);
        }
    }

    public final void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        ObjectInput objectInput2 = objectInput;
        objectInput2.readByte();
        this.j5 = objectInput2.readInt();
        this.bG0 = objectInput.readByte();
        int n = objectInput.readInt();
        this.DK0 = new byte[n];
        for (int j = 0; j < n; ++j) {
            this.DK0[j] = objectInput.readByte();
        }
    }

    public final void nf0(byte by) {
        int n = this.j5 + 1;
        byte[] byArray = this.DK0;
        if (n > this.DK0.length) {
            byte[] byArray2 = new byte[Math.max(byArray.length << 1, n)];
            int n2 = this.DK0.length;
            System.arraycopy(this.DK0, 0, byArray2, 0, n2);
            this.DK0 = byArray2;
        }
        int n3 = this.j5;
        this.j5 = n3 + 1;
        this.DK0[n3] = by;
    }

    public final void cON(byte by) {
        int n;
        for (int j = 0; j < (n = this.j5); ++j) {
            byte[] byArray = this.DK0;
            if (by != this.DK0[j]) continue;
            by = 1;
            if (j >= 0 && j < n) {
                if (j == 0) {
                    j = n - by;
                    System.arraycopy(byArray, by, byArray, 0, j);
                } else if (n - by != j) {
                    int n2 = n;
                    n = j + by;
                    int n3 = n2 - n;
                    System.arraycopy(byArray, n, byArray, j, n3);
                }
                this.j5 -= by;
                return;
            }
            throw new ArrayIndexOutOfBoundsException(j);
        }
    }
}
