/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.util.collection;

import f.*;

import f.dn_0;
import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/*
 * Renamed from f.yJ
 */
public class PrimitiveShortList
implements dn_0,
Externalizable {
    static final long serialVersionUID = 1L;
    public short[] KL0;
    public int Pf;
    public short dM;

    public PrimitiveShortList() {
        this(10, 0);
    }

    public PrimitiveShortList(int n) {
        this(n, 0);
    }

    public PrimitiveShortList(int n, int n2) {
        PrimitiveShortList yj_12 = this;
        yj_12.KL0 = new short[n];
        yj_12.Pf = 0;
        yj_12.dM = 0;
    }

    public final int size() {
        return this.Pf;
    }

    public final boolean uo0(short s) {
        int n = this.Pf + 1;
        short[] sArray = this.KL0;
        if (n > this.KL0.length) {
            short[] sArray2 = new short[Math.max(sArray.length << 1, n)];
            int n2 = this.KL0.length;
            System.arraycopy(this.KL0, 0, sArray2, 0, n2);
            this.KL0 = sArray2;
        }
        int n3 = this.Pf;
        this.Pf = n3 + 1;
        this.KL0[n3] = s;
        return true;
    }

    public final short[] qE() {
        int n;
        block3: {
            short[] sArray;
            block2: {
                n = 0;
                int n2 = this.Pf;
                sArray = new short[n2];
                if (n2 == 0) break block2;
                if (n2 <= 0) break block3;
                System.arraycopy(this.KL0, n, sArray, 0, n2);
            }
            return sArray;
        }
        throw new ArrayIndexOutOfBoundsException(n);
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof yj_1) {
            block4: {
                object = (yj_1)object;
                int n = this.Pf;
                if (((yj_1)object).Pf != n) {
                    return false;
                }
                do {
                    int n2 = n;
                    n = n2 + -1;
                    if (n2 <= 0) break block4;
                } while (this.KL0[n] == ((yj_1)object).KL0[n]);
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int n = 0;
        int n2 = this.Pf;
        while (true) {
            int n3 = n2;
            n2 = n3 + -1;
            if (n3 <= 0) break;
            n += this.KL0[n2];
        }
        return n;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean bL0(short s) {
        int n = this.Pf;
        do {
            int n2 = n;
            n = n2 + -1;
            if (n2 <= 0) return false;
        } while (this.KL0[n] != s);
        if (n < 0) return false;
        return true;
    }

    public final String toString() {
        int n;
        StringBuilder stringBuilder2 = new StringBuilder("{");
        int n2 = this.Pf - 1;
        for (n = 0; n < n2; ++n) {
            StringBuilder stringBuilder3 = stringBuilder2;
            stringBuilder3.append(this.KL0[n]);
            stringBuilder3.append(", ");
        }
        n = this.Pf;
        if (n > 0) {
            stringBuilder2.append(this.KL0[n - 1]);
        }
        StringBuilder stringBuilder4 = stringBuilder2;
        stringBuilder4.append("}");
        return stringBuilder4.toString();
    }

    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeByte(0);
        objectOutput.writeInt(this.Pf);
        objectOutput.writeShort(this.dM);
        int n = this.KL0.length;
        objectOutput.writeInt(n);
        for (int j = 0; j < n; ++j) {
            objectOutput.writeShort(this.KL0[j]);
        }
    }

    public final void readExternal(ObjectInput objectInput) throws IOException {
        ObjectInput objectInput2 = objectInput;
        objectInput2.readByte();
        this.Pf = objectInput2.readInt();
        this.dM = objectInput.readShort();
        int n = objectInput.readInt();
        this.KL0 = new short[n];
        for (int j = 0; j < n; ++j) {
            this.KL0[j] = objectInput.readShort();
        }
    }
}
