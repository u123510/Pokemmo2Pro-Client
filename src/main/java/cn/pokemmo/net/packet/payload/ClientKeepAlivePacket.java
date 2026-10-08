package cn.pokemmo.net.packet.payload;

import f.ZF0;
import f.rg0_2;
import java.nio.ByteBuffer;

/**
 * 客户端保持连接/心跳握手数据包 (Client Keep Alive / Handshake Packet)
 * <p>
 * Opcode: 0
 * 包含加盐异或的客户端随机数与时间戳。
 * <p>
 * 原始混淆类: {@code f.HC}
 */
public class ClientKeepAlivePacket extends ZF0 {
    public ClientKeepAlivePacket() {
        super(0);
    }

    @Override
    public void writePayload(ByteBuffer buffer) {
        long seed = rg0_2.Vl0.MC0.nextLong();
        long now = System.currentTimeMillis();
        buffer.putLong(seed ^ 0x2C9CA13689DB65C8L);
        buffer.putLong(now ^ seed ^ 0xC5828CD837901279L);
    }

    @Override
    public void Q80(ByteBuffer byteBuffer) {
        writePayload(byteBuffer);
    }
}
