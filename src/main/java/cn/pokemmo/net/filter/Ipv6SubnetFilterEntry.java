package cn.pokemmo.net.filter;

import com.github.maltalex.ineter.range.IPv6Subnet;
import f.ineter.qb0_1;
import f.rm_2;
import f.zm0_0;

public class Ipv6SubnetFilterEntry extends zm0_0 {
    private static final long serialVersionUID = 3L;
    public final int fx0;

    public static Ipv6SubnetFilterEntry va(String cidr) {
        IPv6Subnet subnet = IPv6Subnet.of(cidr);
        qb0_1 addr = new qb0_1(subnet.getFirst().getUpper(), subnet.getFirst().getLower());
        return new f.ny_1(addr, rm_2.t40[subnet.getNetworkBitCount()]);
    }

    public Ipv6SubnetFilterEntry(qb0_1 address, rm_2 mask) {
        super(mask.L1(address), mask.R60(address));
        this.fx0 = mask.kF();
    }

    @Override
    public String toString() {
        return String.format("%s/%s", this.ss0.Fg(), this.fx0);
    }
}
