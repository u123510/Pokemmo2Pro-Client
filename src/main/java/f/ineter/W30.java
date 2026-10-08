package f.ineter;

import com.github.maltalex.ineter.base.IPv6Address;
import java.util.Objects;

/**
 * Renamed from f.W30 (com.github.maltalex.ineter.base.IPv6AddressWithScope implementation)
 */
public class W30 extends qb0_1 {
    private static final long serialVersionUID = 1L;
    public static final int Ha = 0;
    public final String wj0;

    public W30(String value, long first, long second) {
        super(first, second);
        this.wj0 = value;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode() * 31;
        return result + (this.wj0 == null ? 0 : this.wj0.hashCode());
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (!super.equals(other)) return false;
        if (other.getClass() != W30.class) return false;
        W30 value = (W30) other;
        return Objects.equals(this.wj0, value.wj0);
    }

    @Override
    public int lK(qb0_1 other) {
        if (other == null) return 1;
        if (!(other instanceof W30)) return 1;

        int result = this.wj0.compareTo(((W30) other).wj0);
        if (result != 0) return result;

        long left = this.fE0;
        long right = other.fE0;
        if (left != right) return left < right ? -1 : 1;

        left = this.Ek;
        right = other.Ek;
        if (left == right) return 0;
        return left < right ? -1 : 1;
    }

    @Override
    public String toString() {
        return String.format("%s%%%s", super.toString(), this.wj0);
    }

    public W30 CJ0(long delta) {
        if (delta < 0L) {
            delta = -delta;
            if (delta < 0L) return this.CJ0(-delta);

            long newSecond = this.Ek + delta;
            long newFirst = this.fE0;
            if (qb0_1.QH(this.Ek, delta, newSecond)) {
                newFirst++;
            }
            return new W30(this.wj0, newFirst, newSecond);
        }

        long originalSecond = this.Ek;
        long newSecond = originalSecond - delta;
        long newFirst = this.fE0;
        long originalSign = originalSecond >>> 63;
        long deltaSign = delta >>> 63;
        long newSign = newSecond >>> 63;
        if ((deltaSign & newSign) == 1L
                || (originalSign == 0L && (deltaSign | newSign) == 1L)) {
            newFirst--;
        }
        return new W30(this.wj0, newFirst, newSecond);
    }

    @Override
    public qb0_1 Dy(long delta) {
        return this.CJ0(delta);
    }

    @Override
    public qb0_1 RS(long delta) {
        if (delta < 0L) return this.CJ0(-delta);

        long originalSecond = this.Ek;
        long newSecond = originalSecond + delta;
        long newFirst = this.fE0;
        long originalSign = originalSecond >>> 63;
        long deltaSign = delta >>> 63;
        long newSign = newSecond >>> 63;
        if ((originalSign & deltaSign) == 1L
                || ((originalSign ^ deltaSign) == 1L && newSign == 0L)) {
            newFirst++;
        }
        return new W30(this.wj0, newFirst, newSecond);
    }

    @Override
    public int compareTo(IPv6Address other) {
        if (other instanceof qb0_1) {
            return this.lK((qb0_1) other);
        }
        return super.compareTo(other);
    }
}
