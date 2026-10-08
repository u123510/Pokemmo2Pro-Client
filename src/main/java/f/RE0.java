package f;

import cn.pokemmo.net.packet.inbound.ServerOpcode037Packet;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - ServerOpcode037Packet
 * 操作码: 37
 * 原始混淆类: f.RE0
 * 现代实现: cn.pokemmo.net.packet.inbound.ServerOpcode037Packet
 */
public class RE0 extends ServerOpcode037Packet {

    public RE0(k20_0 connection, ByteBuffer buffer) {
        super(connection, buffer);
    }
}
