package f;

import cn.pokemmo.net.packet.inbound.LoginServerInboundPacket;

/**
 * 登录服入站数据包兼容门面
 * 核心实现已迁移至 cn.pokemmo.net.packet.inbound.LoginServerInboundPacket
 */
public abstract class uf_0 extends LoginServerInboundPacket {

    public uf_0(int opcode) {
        super(opcode);
    }
}
