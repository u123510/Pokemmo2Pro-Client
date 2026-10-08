package f.ineter;

import com.github.maltalex.ineter.base.IPv6Address;
import f.LY;
import f.oe_2;
import f.zm0_0;

/**
 * Renamed from f.qB0 (com.github.maltalex.ineter.base.IPv6Address implementation)
 */
public class qb0_1 extends IPv6Address implements LY {
    private static final long serialVersionUID = 2L;
    public static final int W80 = 0;
    public final long fE0;
    public final long Ek;

    public qb0_1(long j1, long j3) {
        super(j1, j3);
        this.fE0 = j1;
        this.Ek = j3;
    }

    public static qb0_1 gj0(String v0) {
        IPv6Address parsed = IPv6Address.of(v0);
        return new qb0_1(parsed.getUpper(), parsed.getLower());
    }

    public static boolean QH(long j0, long j2, long j4) {
        long s0 = j0 >>> 63;
        long s2 = j2 >>> 63;
        long s4 = j4 >>> 63;
        if ((s2 & s4) == 1L) {
            return true;
        }
        return (s0 ^ s2) == 1L && s4 == 0L;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object v1) {
        return super.equals(v1);
    }

    @Override
    public boolean YS() {
        zm0_0 range = oe_2.Ie0.RG0;
        return range.ss0.lK(this) <= 0 && range.cb.lK(this) >= 0;
    }

    @Override
    public qb0_1 Hg() {
        return this;
    }

    public qb0_1 RS(long j1) {
        IPv6Address next = this.plus(j1);
        return new qb0_1(next.getUpper(), next.getLower());
    }

    public qb0_1 Dy(long j1) {
        IPv6Address prev = this.minus(j1);
        return new qb0_1(prev.getUpper(), prev.getLower());
    }

    @Override
    public byte[] Mm0() {
        return this.toBigEndianArray();
    }

    @Override
    public int pf0() {
        return 6;
    }

    public int lK(qb0_1 v1) {
        return this.compareTo((IPv6Address) v1);
    }

    public String Fg() {
        return this.toString();
    }
}
