package cn.pokemmo.util.binary;

import f.*;

public class DynamicByteBufferHolder {
    public byte[] Ld;
    public final int df0;
    public final boolean md;

    public final byte[] Ot0(int additionalCapacity) {
        if (additionalCapacity < 0) {
            throw new IllegalArgumentException(yr_1.pG("additionalCapacity must be >= 0: ", additionalCapacity));
        }
        int required = this.df0 + additionalCapacity;
        if (required > this.Ld.length) {
            int capacity = Math.max(8, required);
            capacity = Math.max(capacity, (int)(this.df0 * 1.75F));
            byte[] replacement = new byte[capacity];
            int copyLength = Math.min(this.df0, capacity);
            System.arraycopy(this.Ld, 0, replacement, 0, copyLength);
            this.Ld = replacement;
        }
        return this.Ld;
    }

    @Override
    public final int hashCode() {
        if (!this.md) {
            return super.hashCode();
        }
        int result = 1;
        for (int i = 0; i < this.df0; ++i) {
            result = result * 31 + this.Ld[i];
        }
        return result;
    }

    @Override
    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!this.md || !(object instanceof XW)) {
            return false;
        }
        XW other = (XW)object;
        if (!other.md || this.df0 != other.df0) {
            return false;
        }
        for (int i = 0; i < this.df0; ++i) {
            if (this.Ld[i] != other.Ld[i]) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final String toString() {
        if (this.df0 == 0) {
            return "[]";
        }
        b3_0 builder = new b3_0(32);
        builder.GC0('[');
        builder.on(this.Ld[0]);
        for (int i = 1; i < this.df0; ++i) {
            builder.sV(", ");
            builder.on(this.Ld[i]);
        }
        builder.GC0(']');
        return builder.toString();
    }

    public DynamicByteBufferHolder() {
        this(true, 16);
    }

    public DynamicByteBufferHolder(int capacity) {
        this(true, capacity);
    }

    public DynamicByteBufferHolder(boolean immutable, int capacity) {
        this.md = immutable;
        this.df0 = 0;
        this.Ld = new byte[capacity];
    }

    public DynamicByteBufferHolder(XW source) {
        this.md = source.md;
        this.df0 = source.df0;
        this.Ld = new byte[this.df0];
        System.arraycopy(source.Ld, 0, this.Ld, 0, this.df0);
    }

    public DynamicByteBufferHolder(byte[] source) {
        this(true, source, 0, source.length);
    }

    public DynamicByteBufferHolder(boolean immutable, byte[] source, int offset, int length) {
        this.md = immutable;
        this.df0 = length;
        this.Ld = new byte[length];
        System.arraycopy(source, offset, this.Ld, 0, length);
    }
}
