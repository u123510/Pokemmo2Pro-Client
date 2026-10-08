package f;

import cn.pokemmo.net.packet.inbound.ServerOpcode103Packet;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - ServerOpcode103Packet
 * 操作码: 103
 * 原始混淆类: f.r00_0
 * 现代实现: cn.pokemmo.net.packet.inbound.ServerOpcode103Packet
 */
public class r00_0 extends ServerOpcode103Packet {

    public r00_0(k20_0 source, ByteBuffer data) {
        super(source, data);
    }
}
