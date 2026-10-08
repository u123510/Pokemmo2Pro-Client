package f;

import cn.pokemmo.net.packet.inbound.ServerOpcode189Packet;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - ServerOpcode189Packet
 * 操作码: 189
 * 原始混淆类: f.Lu0
 * 现代实现: cn.pokemmo.net.packet.inbound.ServerOpcode189Packet
 */
public class Lu0 extends ServerOpcode189Packet {

    public Lu0(k20_0 connection, ByteBuffer buffer) {
        super(connection, buffer);
    }
}
