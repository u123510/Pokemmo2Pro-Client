/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.ui.widget.table;

import f.*;

import f.ij0_0;
import f.ts_0;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Arrays;

public class TwlListTableModel
extends ts_0 {
    static final long serialVersionUID = 1L;

    public TwlListTableModel() {
    }

    public TwlListTableModel(int n) {
        super(n);
    }

    public final boolean YE0(byte by) {
        if (this.lpT8(by) < 0) {
            return false;
        }
        Iq0 iq0 = (Iq0) this;
        iq0.OC0(iq0.IF);
        return true;
    }

    public final void Pl(int n) {
        Iq0 iq0 = (Iq0) this;
        byte[] byArray = iq0.MO;
        int n2 = iq0.MO.length;
        byte[] byArray2 = iq0.Ut;
        this.MO = new byte[n];
        this.Ut = new byte[n];
        while (true) {
            int n3 = n2;
            n2 = n3 + -1;
            if (n3 <= 0) break;
            if (byArray2[n2] != 1) continue;
            this.lpT8(byArray[n2]);
        }
    }

    public final boolean equals(Object object) {
        block3: {
            if (!(object instanceof Iq0)) {
                return false;
            }
            object = (Iq0)object;
            if (((ij0_0)object).Rv != this.Rv) {
                return false;
            }
            int n = this.Ut.length;
            do {
                int n2 = n;
                n = n2 + -1;
                if (n2 <= 0) break block3;
            } while (this.Ut[n] != 1 || ((ts_0)object).dg(this.MO[n]));
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int n = 0;
        int n2 = this.Ut.length;
        while (true) {
            int n3 = n2;
            n2 = n3 + -1;
            if (n3 <= 0) break;
            if (this.Ut[n2] != 1) continue;
            n += this.MO[n2];
        }
        return n;
    }

    public final String toString() {
        StringBuilder stringBuilder2 = new StringBuilder(this.Rv * 2 + 2).append("{");
        int n = this.Ut.length;
        int n2 = 1;
        while (true) {
            int n3 = n;
            n = n3 + -1;
            if (n3 <= 0) break;
            if (this.Ut[n] != 1) continue;
            stringBuilder2.append(this.MO[n]);
            if (n2++ >= this.Rv) continue;
            stringBuilder2.append(",");
        }
        StringBuilder stringBuilder3 = stringBuilder2;
        stringBuilder3.append("}");
        return stringBuilder3.toString();
    }

    public final void writeExternal(ObjectOutput objectOutput) {
        try {
            ObjectOutput objectOutput2 = objectOutput;
            objectOutput2.writeByte(1);
            objectOutput2.writeByte(0);
            objectOutput.writeFloat(this.na0);
            objectOutput.writeFloat(this.yk0);
            objectOutput.writeInt(this.Rv);
            objectOutput.writeFloat(this.na0);
            objectOutput.writeByte(this.st);
            int n = this.Ut.length;
            while (true) {
                int n2 = n;
                n = n2 + -1;
                if (n2 <= 0) break;
                if (this.Ut[n] != 1) continue;
                objectOutput.writeByte(this.MO[n]);
            }
        } catch (java.io.IOException ex) {
            sneakyThrow(ex);
        }
    }

    public final void readExternal(ObjectInput objectInput) {
        try {
            byte by = objectInput.readByte();
            super.readExternal(objectInput);
            int n = objectInput.readInt();
            if (by >= 1) {
                byte by2;
                this.na0 = objectInput.readFloat();
                this.st = by2 = objectInput.readByte();
                if (by2 != 0) {
                    Arrays.fill(this.MO, by2);
                }
            }
            this.La(n);
            while (true) {
                int n2 = n;
                n = n2 + -1;
                if (n2 <= 0) break;
                this.YE0(objectInput.readByte());
            }
        } catch (ClassNotFoundException | java.io.IOException ex) {
            sneakyThrow(ex);
        }
    }

    @SuppressWarnings("unchecked")
    private static <E extends Throwable> void sneakyThrow(Throwable throwable) throws E {
        throw (E)throwable;
    }

    public final void B30(byte[] byArray) {
        int n = byArray.length;
        while (true) {
            int n2 = n;
            n = n2 + -1;
            if (n2 <= 0) break;
            this.YE0(byArray[n]);
        }
    }
}

