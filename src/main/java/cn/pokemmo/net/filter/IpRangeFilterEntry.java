package cn.pokemmo.net.filter;

import f.ineter.qb0_1;

import f.*;
import java.math.BigInteger;
import java.util.Iterator;

public class IpRangeFilterEntry implements uo0_0 {
    private static final long serialVersionUID = 3L;
    public final qb0_1 ss0;
    public final qb0_1 cb;

    public IpRangeFilterEntry(qb0_1 first, qb0_1 last) {
        this.ss0 = first;
        this.cb = last;
        if (first == null || last == null) {
            throw new NullPointerException("Neither the first nor the last address can be null");
        }
        if (first.lK(last) > 0) {
            throw new IllegalArgumentException(String.format(
                "The first address in the range (%s) has to be lower than the last address (%s)",
                first.toString(), last.toString()));
        }
    }

    public final BigInteger d9() {
        return new BigInteger(1, this.cb.Mm0())
            .subtract(new BigInteger(1, this.ss0.Mm0()))
            .add(BigInteger.ONE);
    }

    @Override
    public final int hashCode() {
        int result = (31 + (this.ss0 == null ? 0 : this.ss0.hashCode())) * 31;
        return result + (this.cb == null ? 0 : this.cb.hashCode());
    }

    @Override
    public final boolean equals(Object value) {
        if (value == this) {
            return true;
        }
        if (value == null || !(value instanceof zm0_0)) {
            return false;
        }
        zm0_0 other = (zm0_0)value;
        if (this.ss0 == null ? other.ss0 != null : !this.ss0.equals(other.ss0)) {
            return false;
        }
        return this.cb == null ? other.cb == null : this.cb.equals(other.cb);
    }

    @Override
    public String toString() {
        return String.format("%s - %s", this.ss0.Fg(), this.cb.Fg());
    }

    @Override
    public final Iterator VF0() {
        return new xf0_1((zm0_0) (Object) this);
    }

    static {
        new BigInteger(new byte[]{127, -1, -1, -1});
    }
}
