package f.ineter;

import com.github.maltalex.ineter.base.IPv4Address;
import f.LY;
import f.r80;
import f.wv_0;

/**
 * Renamed from f.pM (com.github.maltalex.ineter.base.IPv4Address implementation)
 */
public class pm_1 extends IPv4Address implements LY {
    private static final long serialVersionUID = 2L;
    public static final int up = 0;
    public final int js0;

    public pm_1(int i) {
        super(i);
        this.js0 = i;
    }

    public static pm_1 gI(String str) {
        IPv4Address parsed = IPv4Address.of(str);
        return new pm_1(parsed.toInt());
    }

    public int zN(pm_1 other) {
        if (other == null) {
            return 1;
        }
        return this.compareTo((IPv4Address) other);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return this.js0;
    }

    @Override
    public int pf0() {
        return 4;
    }

    @Override
    public pm_1 nw0() {
        return this;
    }

    @Override
    public boolean YS() {
        wv_0 range = r80.Aq0.Iv;
        return range.iG0.zN(this) <= 0 && range.r30.zN(this) >= 0;
    }

    @Override
    public byte[] Mm0() {
        return this.toBigEndianArray();
    }

    public long kw() {
        return ((long) this.js0) & 4294967295L;
    }
}
