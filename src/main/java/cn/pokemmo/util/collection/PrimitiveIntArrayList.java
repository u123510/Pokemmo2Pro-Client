package cn.pokemmo.util.collection;

import f.*;

public class PrimitiveIntArrayList {
    public int[] bR;
    public int Ml;
    public final boolean M60;

    public PrimitiveIntArrayList() {
        this(true, 16);
    }

    public PrimitiveIntArrayList(int capacity) {
        this(true, capacity);
    }

    public PrimitiveIntArrayList(boolean mutable, int capacity) {
        this.M60 = mutable;
        this.bR = new int[capacity];
    }

    public PrimitiveIntArrayList(Nn0 other) {
        this.M60 = other.M60;
        this.Ml = other.Ml;
        this.bR = new int[this.Ml];
        System.arraycopy(other.bR, 0, this.bR, 0, this.Ml);
    }

    public PrimitiveIntArrayList(int[] values) {
        this(true, values, 0, values.length);
    }

    public PrimitiveIntArrayList(boolean mutable, int[] values, int offset, int length) {
        this(mutable, length);
        this.Ml = length;
        System.arraycopy(values, offset, this.bR, 0, length);
    }

    public final void ja0(int value) {
        int[] values = this.bR;
        int size = this.Ml;
        if (size == values.length) {
            values = this.Wn(Math.max(8, (int) (size * 1.75f)));
        }
        values[this.Ml++] = value;
    }

    public final int X8(int index) {
        if (index < this.Ml) {
            return this.bR[index];
        }
        throw new IndexOutOfBoundsException(
            CO.go("index can't be >= size:", index, " >= ")
                .append(this.Ml).toString());
    }

    public final void MJ(int index, int value) {
        if (index < this.Ml) {
            this.bR[index] = value;
            return;
        }
        throw new IndexOutOfBoundsException(
            CO.go("index can't be >= size:", index, " >= ")
                .append(this.Ml).toString());
    }

    public final int[] Wn(int capacity) {
        int[] values = new int[capacity];
        int length = Math.min(this.Ml, capacity);
        System.arraycopy(this.bR, 0, values, 0, length);
        this.bR = values;
        return values;
    }

    public final int[] Ni() {
        int[] values = new int[this.Ml];
        System.arraycopy(this.bR, 0, values, 0, this.Ml);
        return values;
    }

    @Override
    public final int hashCode() {
        if (!this.M60) {
            return super.hashCode();
        }
        int result = 1;
        for (int i = 0; i < this.Ml; i++) {
            result = result * 31 + this.bR[i];
        }
        return result;
    }

    @Override
    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!this.M60 || !(object instanceof Nn0)) {
            return false;
        }
        Nn0 other = (Nn0) object;
        if (!other.M60 || this.Ml != other.Ml) {
            return false;
        }
        for (int i = 0; i < this.Ml; i++) {
            if (this.bR[i] != other.bR[i]) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final String toString() {
        if (this.Ml == 0) {
            return "[]";
        }
        b3_0 builder = new b3_0(32);
        builder.GC0('[');
        builder.on(this.bR[0]);
        for (int i = 1; i < this.Ml; i++) {
            builder.sV(",");
            builder.on(this.bR[i]);
        }
        builder.GC0(']');
        return builder.toString();
    }

    public final void CK0(int index) {
        if (index >= this.Ml) {
            throw new IndexOutOfBoundsException(
                CO.go("index can't be >= size:", index, " >= ")
                    .append(this.Ml).toString());
        }
        int last = --this.Ml;
        if (this.M60) {
            System.arraycopy(this.bR, index + 1, this.bR, index, last - index);
        } else {
            this.bR[index] = this.bR[last];
        }
    }
}
