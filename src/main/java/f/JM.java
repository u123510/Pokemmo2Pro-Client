package f;

import cn.pokemmo.net.packet.Packet;

/**
 * 数据包顶级抽象基类兼容垫片
 * 核心业务已重构迁移至 cn.pokemmo.net.packet.Packet
 */
public abstract class JM extends Packet {

    public JM(Mu0 var1, int var2) {
        super(var1, var2);
    }

    public JM() {
        super();
    }
}
