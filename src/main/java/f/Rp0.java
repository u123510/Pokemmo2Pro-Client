package f;

import cn.pokemmo.net.packet.inbound.ServerOpcode181Packet;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - ServerOpcode181Packet
 * 操作码: 181
 * 原始混淆类: f.Rp0
 * 现代实现: cn.pokemmo.net.packet.inbound.ServerOpcode181Packet
 */
public class Rp0 extends ServerOpcode181Packet {

    public Rp0(k20_0 connection, ByteBuffer buffer) {
        super(connection, buffer);
    }
}
