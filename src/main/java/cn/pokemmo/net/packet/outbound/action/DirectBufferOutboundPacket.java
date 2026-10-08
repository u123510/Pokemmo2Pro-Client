package cn.pokemmo.net.packet.outbound.action;

import f.*;
import cn.pokemmo.net.packet.OutboundPacket;
import java.nio.ByteBuffer;

/**
 * 直接缓冲区动作出站数据包抽象基类 (Direct Buffer Outbound Action Packet)
 * 对应混淆类: f.lpt5__3
 */
public abstract class DirectBufferOutboundPacket extends OutboundPacket {

    public DirectBufferOutboundPacket(int opcode) {
        super(opcode);
    }

    public abstract void Xn0(ByteBuffer buffer);

    public void writePayload(ByteBuffer buffer) {
        this.Xn0(buffer);
    }
}
