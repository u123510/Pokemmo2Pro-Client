package f;

import cn.pokemmo.net.filter.Ipv6SubnetFilterEntry;
import f.ineter.qb0_1;

public final class ny_1 extends Ipv6SubnetFilterEntry {
    public ny_1(qb0_1 address, rm_2 mask) {
        super(address, mask);
    }

    public static ny_1 va(String cidr) {
        return (ny_1) Ipv6SubnetFilterEntry.va(cidr);
    }
}
