package f;

import cn.pokemmo.net.packet.inbound.ServerOpcode111Packet;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - ServerOpcode111Packet
 * 操作码: 111
 * 原始混淆类: f.fr_0
 * 现代实现: cn.pokemmo.net.packet.inbound.ServerOpcode111Packet
 */
public class fr_0 extends ServerOpcode111Packet {

    public fr_0(k20_0 connection, ByteBuffer data) {
        super(connection, data);
    }
}
