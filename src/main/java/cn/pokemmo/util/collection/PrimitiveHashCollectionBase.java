package cn.pokemmo.util.collection;

import f.*;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Arrays;

public abstract class PrimitiveHashCollectionBase extends ij0_0 {
    static final long serialVersionUID = -3461112548087185871L;
    public static final Object J80;
    public static final Object VW;
    public transient Object[] Yw;
    public boolean wC;

    static {
        J80 = new Object();
        VW = new Object();
    }

    public PrimitiveHashCollectionBase() {
        super();
    }

    public PrimitiveHashCollectionBase(int initialCapacity) {
        super(initialCapacity);
    }

    public static IllegalArgumentException l3(String str, Object o1, Object o2) {
        StringBuilder sb = new StringBuilder("Equal objects must have equal hashcodes. During rehashing, Trove discovered that the following two objects claim to be equal (as in java.lang.Object.equals()) but their hashCodes (or those calculated by your TObjectHashingStrategy) are not equal.This violates the general contract of java.lang.Object.hashCode().  See bullet point two in that method's documentation. object #1 =");
        StringBuilder s1b = new StringBuilder();
        s1b.append(o1 == null ? "class null" : o1.getClass());
        s1b.append(" id= ");
        s1b.append(System.identityHashCode(o1));
        s1b.append(" hashCode= ");
        s1b.append(o1 == null ? 0 : o1.hashCode());
        s1b.append(" toString= ");
        s1b.append(String.valueOf(o1));
        sb.append(s1b.toString());
        sb.append("; object #2 =");

        StringBuilder s2b = new StringBuilder();
        s2b.append(o2 == null ? "class null" : o2.getClass());
        s2b.append(" id= ");
        s2b.append(System.identityHashCode(o2));
        s2b.append(" hashCode= ");
        s2b.append(o2 == null ? 0 : o2.hashCode());
        s2b.append(" toString= ");
        s2b.append(String.valueOf(o2));
        sb.append(s2b.toString());
        sb.append("\n");
        sb.append(str);
        return new IllegalArgumentException(sb.toString());
    }

    public static boolean k2(Object o1, Object o2) {
        if (o2 == null || o2 == J80) {
            return false;
        }
        return o1.equals(o2);
    }

    public final int uT() {
        return this.Yw.length;
    }

    public void tq0(int i) {
        this.Yw[i] = J80;
        int oldSize = this.Rv;
        int newSize = oldSize - 1;
        this.Rv = newSize;
        if (this.yk0 != 0.0f) {
            int autoCompacts = this.Gj - 1;
            this.Gj = autoCompacts;
            if (!this.o00 && autoCompacts <= 0) {
                Pl(g00_0.Ql(Math.max(oldSize, JS.Hf((float) newSize / this.na0) + 1)));
                Sf0(uT());
                if (this.yk0 != 0.0f) {
                    ov0(this.Rv);
                }
            }
        }
    }

    public int La(int i) {
        int prime = g00_0.Ql(i);
        Sf0(i);
        ov0(prime);
        this.Yw = new Object[prime];
        Arrays.fill(this.Yw, VW);
        return prime;
    }

    public final boolean s60(Object obj) {
        return Dy0(obj) >= 0;
    }

    public final int Dy0(Object obj) {
        if (obj == null) {
            for (int i = 0; i < this.Yw.length; i++) {
                Object cur = this.Yw[i];
                if (cur == null) {
                    return i;
                }
                if (cur == VW) {
                    return -1;
                }
            }
            return -1;
        }
        int hash = obj.hashCode() & 0x7FFFFFFF;
        int index = hash % this.Yw.length;
        Object cur = this.Yw[index];
        if (cur == VW) {
            return -1;
        }
        if (cur == obj || k2(obj, cur)) {
            return index;
        }
        int step = sj_0.oC0(hash, this.Yw.length, 2, 1);
        int probe = index;
        do {
            probe -= step;
            if (probe < 0) {
                probe += this.Yw.length;
            }
            Object probeObj = this.Yw[probe];
            if (probeObj == VW) {
                return -1;
            }
            if (probeObj == obj || k2(obj, probeObj)) {
                return probe;
            }
        } while (probe != index);
        return -1;
    }

    public final int e5(Object obj) {
        this.wC = false;
        if (obj == null) {
            int firstRemoved = -1;
            for (int i = 0; i < this.Yw.length; i++) {
                Object cur = this.Yw[i];
                if (cur == J80 && firstRemoved == -1) {
                    firstRemoved = i;
                }
                if (cur == VW) {
                    if (firstRemoved != -1) {
                        this.Yw[firstRemoved] = null;
                        return firstRemoved;
                    }
                    this.wC = true;
                    this.Yw[i] = null;
                    return i;
                }
                if (cur == null) {
                    return -i - 1;
                }
            }
            if (firstRemoved != -1) {
                this.Yw[firstRemoved] = null;
                return firstRemoved;
            }
            throw new IllegalStateException("Could not find insertion index for null key. Key set full!?!!");
        }
        int hash = obj.hashCode() & 0x7FFFFFFF;
        int index = hash % this.Yw.length;
        Object cur = this.Yw[index];
        if (cur == VW) {
            this.wC = true;
            this.Yw[index] = obj;
            return index;
        }
        if (cur == obj || k2(obj, cur)) {
            return -index - 1;
        }
        int step = sj_0.oC0(hash, this.Yw.length, 2, 1);
        int firstRemoved = -1;
        int probe = index;
        do {
            if (cur == J80 && firstRemoved == -1) {
                firstRemoved = probe;
            }
            probe -= step;
            if (probe < 0) {
                probe += this.Yw.length;
            }
            Object probeObj = this.Yw[probe];
            if (probeObj == VW) {
                if (firstRemoved != -1) {
                    this.Yw[firstRemoved] = obj;
                    return firstRemoved;
                }
                this.wC = true;
                this.Yw[probe] = obj;
                return probe;
            }
            if (probeObj == obj || k2(obj, probeObj)) {
                return -probe - 1;
            }
            cur = probeObj;
        } while (probe != index);
        if (firstRemoved != -1) {
            this.Yw[firstRemoved] = obj;
            return firstRemoved;
        }
        throw new IllegalStateException("No free or removed slots available. Key set full?!!");
    }

    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeByte(0);
        out.writeByte(0);
        out.writeFloat(this.na0);
        out.writeFloat(this.yk0);
    }

    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        in.readByte();
        super.readExternal(in);
    }

    public boolean containsKey(Object obj) {
        return s60(obj);
    }
}
