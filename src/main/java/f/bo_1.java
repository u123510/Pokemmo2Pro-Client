package f;

import cn.pokemmo.net.packet.OutboundPacket;

/**
 * 出站数据包抽象基类兼容垫片
 * 核心业务已重构迁移至 cn.pokemmo.net.packet.OutboundPacket
 */
public abstract class bo_1 extends OutboundPacket {

    public bo_1(int n) {
        super(n);
    }

    public bo_1() {
        super();
    }
}
