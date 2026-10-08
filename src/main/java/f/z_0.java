package f;

import cn.pokemmo.net.packet.inbound.ServerOpcode215Packet;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - ServerOpcode215Packet
 * 操作码: 215
 * 原始混淆类: f.z_0
 * 现代实现: cn.pokemmo.net.packet.inbound.ServerOpcode215Packet
 */
public class z_0 extends ServerOpcode215Packet {

    public z_0(k20_0 source, ByteBuffer data) {
        super(source, data);
    }
}
