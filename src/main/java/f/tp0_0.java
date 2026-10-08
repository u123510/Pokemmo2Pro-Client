package f;

import cn.pokemmo.net.packet.inbound.ServerOpcode146Packet;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - ServerOpcode146Packet
 * 操作码: 146
 * 原始混淆类: f.tp0_0
 * 现代实现: cn.pokemmo.net.packet.inbound.ServerOpcode146Packet
 */
public class tp0_0 extends ServerOpcode146Packet {

    public tp0_0(k20_0 source, ByteBuffer data) {
        super(source, data);
    }
}
