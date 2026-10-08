package f;

import cn.pokemmo.net.packet.inbound.ServerOpcode211Packet;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - ServerOpcode211Packet
 * 操作码: 211
 * 原始混淆类: f.IC
 * 现代实现: cn.pokemmo.net.packet.inbound.ServerOpcode211Packet
 */
public class IC extends ServerOpcode211Packet {

    public IC(k20_0 source, ByteBuffer data) {
        super(source, data);
    }
}
