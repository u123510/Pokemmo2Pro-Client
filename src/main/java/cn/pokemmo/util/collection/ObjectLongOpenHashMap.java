package cn.pokemmo.util.collection;

import f.*;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Arrays;

public class ObjectLongOpenHashMap extends iw_2 implements dl0_2 {
    static final long serialVersionUID = 1L;
    public transient long[] Fp;
    public long Ju;

    public ObjectLongOpenHashMap() {
        this.Ju = km_2.Ug;
    }

    @Override
    public final int La(int i) {
        int capacity = super.La(i);
        this.Fp = new long[capacity];
        return capacity;
    }

    @Override
    public final void Pl(int i) {
        Object[] objArr = this.Yw;
        int length = objArr.length;
        long[] jArr = this.Fp;
        this.Yw = new Object[i];
        Arrays.fill(this.Yw, VW);
        long[] jArr2 = new long[i];
        this.Fp = jArr2;
        Arrays.fill(jArr2, this.Ju);
        while (length-- > 0) {
            Object obj = objArr[length];
            if (obj != VW && obj != J80) {
                int e5 = e5(obj);
                if (e5 < 0) {
                    throw l3("", this.Yw[-e5 - 1], obj);
                }
                this.Yw[e5] = obj;
                this.Fp[e5] = jArr[length];
            }
        }
    }

    @Override
    public final void tq0(int i) {
        this.Fp[i] = this.Ju;
        super.tq0(i);
    }

    @Override
    public final boolean equals(Object obj) {
        if (!(obj instanceof dl0_2)) {
            return false;
        }
        dl0_2 dl0_2Var = (dl0_2) obj;
        if (((ij0_0) dl0_2Var).Rv != this.Rv) {
            return false;
        }
        try {
            L10 l10 = new L10((s3_0) this);
            while (l10.RV()) {
                l10.zC0();
                int i = l10.UE;
                Object obj2 = l10.Rh.Yw[i];
                long j = this.Fp[i];
                if (j == this.Ju) {
                    s3_0 s3_0Var = (s3_0) dl0_2Var;
                    int Dy0 = s3_0Var.Dy0(obj2);
                    if ((Dy0 < 0 ? s3_0Var.Ju : s3_0Var.Fp[Dy0]) != ((s3_0) dl0_2Var).Ju
                            || !((s3_0) dl0_2Var).s60(obj2)) {
                        return false;
                    }
                } else {
                    s3_0 s3_0Var2 = (s3_0) dl0_2Var;
                    int Dy02 = s3_0Var2.Dy0(obj2);
                    if (j != (Dy02 < 0 ? s3_0Var2.Ju : s3_0Var2.Fp[Dy02])) {
                        return false;
                    }
                }
            }
            return true;
        } catch (ClassCastException unused) {
            return true;
        }
    }

    @Override
    public final int hashCode() {
        Object[] objArr = this.Yw;
        long[] jArr = this.Fp;
        int length = jArr.length;
        int i = 0;
        while (length-- > 0) {
            Object obj = objArr[length];
            if (obj != VW && obj != J80) {
                long j = jArr[length];
                i += ((int) (j ^ (j >>> 32))) ^ (obj == null ? 0 : obj.hashCode());
            }
        }
        return i;
    }

    @Override
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeByte(0);
        super.writeExternal(objectOutput);
        objectOutput.writeLong(this.Ju);
        objectOutput.writeInt(this.Rv);
        int length = this.Yw.length;
        while (length-- > 0) {
            Object obj = this.Yw[length];
            if (obj != J80 && obj != VW) {
                objectOutput.writeObject(obj);
                objectOutput.writeLong(this.Fp[length]);
            }
        }
    }

    @Override
    public final void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        objectInput.readByte();
        super.readExternal(objectInput);
        this.Ju = objectInput.readLong();
        int readInt = objectInput.readInt();
        super.La(readInt);
        this.Fp = new long[this.Yw.length];
        while (readInt-- > 0) {
            Object readObject = objectInput.readObject();
            uR(objectInput.readLong(), readObject);
        }
    }

    @Override
    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        boolean z = true;
        Object[] objArr = this.Yw;
        long[] jArr = this.Fp;
        int length = objArr.length;
        while (length-- > 0) {
            Object obj = objArr[length];
            if (obj != VW && obj != J80) {
                long j = jArr[length];
                if (z) {
                    z = false;
                } else {
                    sb.append(",");
                }
                sb.append(obj).append("=").append(j);
            }
        }
        sb.append("}");
        return sb.toString();
    }

    public final void uR(long j, Object obj) {
        int e5 = e5(obj);
        boolean z = true;
        if (e5 < 0) {
            e5 = -e5 - 1;
            long dummy = this.Fp[e5];
            z = false;
        }
        this.Fp[e5] = j;
        if (z) {
            OC0(this.wC);
        }
    }
}
