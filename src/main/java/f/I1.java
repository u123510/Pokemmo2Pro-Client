package f;

import cn.pokemmo.net.packet.inbound.ServerOpcode030Packet;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - ServerOpcode030Packet
 * 操作码: 30
 * 原始混淆类: f.I1
 * 现代实现: cn.pokemmo.net.packet.inbound.ServerOpcode030Packet
 */
public class I1 extends ServerOpcode030Packet {

    public I1(k20_0 source, ByteBuffer data) {
        super(source, data);
    }
}
