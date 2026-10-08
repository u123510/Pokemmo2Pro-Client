package f;

import cn.pokemmo.net.packet.inbound.ServerOpcode250Packet;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - ServerOpcode250Packet
 * 操作码: 250
 * 原始混淆类: f.xa0_2
 * 现代实现: cn.pokemmo.net.packet.inbound.ServerOpcode250Packet
 */
public class xa0_2 extends ServerOpcode250Packet {

    public xa0_2(k20_0 source, ByteBuffer data) {
        super(source, data);
    }
}
