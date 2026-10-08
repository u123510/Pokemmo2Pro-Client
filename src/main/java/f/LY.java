package f;

import cn.pokemmo.net.address.IpAddress;
import java.net.InetAddress;

/**
 * 兼容垫片 (Shim) - IP 网络地址接口 (IP Address)
 * 实际实现已迁移至 {@link IpAddress}
 */
public interface LY extends IpAddress {
    static LY Fu0(InetAddress address) {
        return IpAddress.Fu0(address);
    }
}
