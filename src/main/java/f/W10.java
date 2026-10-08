package f;

import cn.pokemmo.net.packet.inbound.ServerOpcode107Packet;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - ServerOpcode107Packet
 * 操作码: 107
 * 原始混淆类: f.W10
 * 现代实现: cn.pokemmo.net.packet.inbound.ServerOpcode107Packet
 */
public class W10 extends ServerOpcode107Packet {

    public W10(k20_0 connection, ByteBuffer input) {
        super(connection, input);
    }
}
