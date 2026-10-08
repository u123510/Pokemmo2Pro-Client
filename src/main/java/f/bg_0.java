package f;

import cn.pokemmo.net.packet.inbound.ServerOpcode080Packet;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - ServerOpcode080Packet
 * 操作码: 80
 * 原始混淆类: f.bg_0
 * 现代实现: cn.pokemmo.net.packet.inbound.ServerOpcode080Packet
 */
public class bg_0 extends ServerOpcode080Packet {

    public bg_0(k20_0 connection, ByteBuffer input) {
        super(connection, input);
    }
}
