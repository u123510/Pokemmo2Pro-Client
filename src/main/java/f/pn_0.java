package f;

import cn.pokemmo.net.packet.inbound.ServerOpcode173Packet;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - ServerOpcode173Packet
 * 操作码: 173
 * 原始混淆类: f.pn_0
 * 现代实现: cn.pokemmo.net.packet.inbound.ServerOpcode173Packet
 */
public class pn_0 extends ServerOpcode173Packet {

    public pn_0(k20_0 source, ByteBuffer data) {
        super(source, data);
    }
}
