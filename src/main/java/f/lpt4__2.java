package f;

import cn.pokemmo.net.packet.outbound.ClientContextOutboundPacket;

/**
 * 客户端上下文出站包兼容门面
 * 核心实现已迁移至 cn.pokemmo.net.packet.outbound.ClientContextOutboundPacket
 */
public abstract class lpt4__2 extends ClientContextOutboundPacket {

    public lpt4__2(int opcode) {
        super(opcode);
    }
}
