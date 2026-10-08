package f;

import cn.pokemmo.net.packet.outbound.ShopOutboundPacket;

/**
 * 兼容垫片 (Shim) - 商城与通用网络请求出站数据包基类
 * 核心逻辑已迁移至 cn.pokemmo.net.packet.outbound.ShopOutboundPacket
 */
public abstract class RE extends ShopOutboundPacket {
    public RE(int n) {
        super(n);
    }
}
