package cn.pokemmo.net.packet.outbound;

import f.*;
import cn.pokemmo.net.packet.OutboundPacket;
import java.nio.ByteBuffer;

/**
 * 带有客户端上下文的出站数据包抽象基类 (Client Context Outbound Packet)
 * 对应混淆类: f.lpt4__2
 */
public abstract class ClientContextOutboundPacket extends OutboundPacket {

    public ClientContextOutboundPacket(int opcode) {
        super(opcode);
    }

    public abstract void pH0(TX client, ByteBuffer buffer);

    public void writeWithClient(TX client, ByteBuffer buffer) {
        this.pH0(client, buffer);
    }
}
