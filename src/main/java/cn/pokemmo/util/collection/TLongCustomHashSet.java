package cn.pokemmo.util.collection;

import f.*;
import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class TLongCustomHashSet implements Externalizable {
    private static final long serialVersionUID = 1L;
    public yj_1 Au0;

    public TLongCustomHashSet() { this(0); }

    public TLongCustomHashSet(int ignored) {
        this.Au0 = new yj_1(10);
    }

    @Override
    public final String toString() {
        StringBuilder out = new StringBuilder("{");
        int index = this.Au0.Pf - 1;
        while (index > 0) {
            if (index >= this.Au0.Pf) throw new ArrayIndexOutOfBoundsException(index);
            out.append(this.Au0.KL0[index]).append(", ");
            index--;
        }
        int count = this.Au0.Pf;
        if (count > 0) {
            int last = 0;
            if (last < 0) throw new ArrayIndexOutOfBoundsException(last);
            out.append(this.Au0.KL0[last]);
        }
        return out.append('}').toString();
    }

    @Override
    public final boolean equals(Object other) {
        return this == other || other != null && other.getClass() == TLongCustomHashSet.class
                && this.Au0.equals(((ov0_0) other).Au0);
    }

    @Override
    public final int hashCode() { return this.Au0.hashCode(); }

    @Override
    public final void writeExternal(ObjectOutput out) throws IOException {
        out.writeByte(0);
        out.writeObject(this.Au0);
    }

    @Override
    public final void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        in.readByte();
        this.Au0 = (yj_1) in.readObject();
    }
}
