package f;

import cn.pokemmo.net.packet.inbound.ServerOpcode242Packet;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - ServerOpcode242Packet
 * 操作码: 242
 * 原始混淆类: f.kj0_1
 * 现代实现: cn.pokemmo.net.packet.inbound.ServerOpcode242Packet
 */
public class kj0_1 extends ServerOpcode242Packet {

    public kj0_1(k20_0 source, ByteBuffer data) {
        super(source, data);
    }
}
