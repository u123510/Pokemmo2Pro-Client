package cn.pokemmo.net.packet;

import java.nio.ByteBuffer;

/**
 * 载荷编码出站数据包抽象基类 (Payload Outbound Packet)
 * 原混淆类: f.ZF0
 */
public abstract class AbstractPayloadPacket extends OutboundPacket {

    public AbstractPayloadPacket(int opcode) {
        super(opcode);
    }

    public abstract void writePayload(ByteBuffer buffer);

    public void Q80(ByteBuffer buffer) {
        writePayload(buffer);
    }
}
