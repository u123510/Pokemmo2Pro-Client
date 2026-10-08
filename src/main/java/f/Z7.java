package f;

import cn.pokemmo.net.packet.inbound.ServerOpcode169Packet;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - ServerOpcode169Packet
 * 操作码: 169
 * 原始混淆类: f.Z7
 * 现代实现: cn.pokemmo.net.packet.inbound.ServerOpcode169Packet
 */
public class Z7 extends ServerOpcode169Packet {

    public Z7(k20_0 source, ByteBuffer data) {
        super(source, data);
    }
}
