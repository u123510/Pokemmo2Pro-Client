package f;

import cn.pokemmo.net.packet.inbound.ServerOpcode133Packet;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - ServerOpcode133Packet
 * 操作码: 133
 * 原始混淆类: f.YV
 * 现代实现: cn.pokemmo.net.packet.inbound.ServerOpcode133Packet
 */
public class YV extends ServerOpcode133Packet {

    public YV(k20_0 source, ByteBuffer data) {
        super(source, data);
    }
}
