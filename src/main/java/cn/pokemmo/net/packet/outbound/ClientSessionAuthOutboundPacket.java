package cn.pokemmo.net.packet.outbound;

import f.TX;
import f.lpt4__2;
import java.nio.ByteBuffer;

/**
 * 客户端会话认证出站数据包 (Client Session Auth Outbound Packet)
 * <p>
 * Opcode: 1
 * 写入角色 ID 与认证 Token 数据。
 * <p>
 * 原始混淆类: {@code f.J00}
 */
public class ClientSessionAuthOutboundPacket extends lpt4__2 {
    public ClientSessionAuthOutboundPacket() {
        super(1);
    }

    @Override
    public void pH0(TX clientContext, ByteBuffer buffer) {
        buffer.putLong(clientContext.Bu.cJ0.dj0.Sa);
        byte[] token = clientContext.Bu.bq0;
        buffer.put((byte) token.length);
        buffer.put(token);
    }
}
