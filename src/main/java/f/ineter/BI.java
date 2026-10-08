package f.ineter;

import com.github.maltalex.ineter.range.IPv4Subnet;
import f.vi0_0;
import f.wv_0;

/**
 * Renamed from f.BI (com.github.maltalex.ineter.range.IPv4Subnet implementation)
 */
public class BI extends wv_0 {
    private static final long serialVersionUID = 3L;
    public final int cv0;

    public static BI kF(String string) {
        IPv4Subnet subnet = IPv4Subnet.of(string);
        pm_1 addr = new pm_1(subnet.getNetworkAddress().toInt());
        return new BI(addr, vi0_0.values()[subnet.getNetworkBitCount()]);
    }

    public BI(pm_1 pm_12, vi0_0 vi0_02) {
        super(vi0_02.Gt0(pm_12), vi0_02.MS(pm_12));
        this.cv0 = vi0_02.ld0();
    }

    @Override
    public String toString() {
        return String.format("%s/%d", this.iG0, this.cv0);
    }
}
