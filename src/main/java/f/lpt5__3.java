package f;

import cn.pokemmo.net.packet.outbound.action.DirectBufferOutboundPacket;

/**
 * 直接缓冲区动作出站包兼容门面
 * 核心实现已迁移至 cn.pokemmo.net.packet.outbound.action.DirectBufferOutboundPacket
 */
public abstract class lpt5__3 extends DirectBufferOutboundPacket {

    public lpt5__3(int opcode) {
        super(opcode);
    }
}
