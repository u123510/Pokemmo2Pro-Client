package f;

import cn.pokemmo.net.packet.inbound.ServerOpcode240Packet;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - ServerOpcode240Packet
 * 操作码: 240
 * 原始混淆类: f.oc_1
 * 现代实现: cn.pokemmo.net.packet.inbound.ServerOpcode240Packet
 */
public class oc_1 extends ServerOpcode240Packet {

    public oc_1(k20_0 source, ByteBuffer data) {
        super(source, data);
    }
}
