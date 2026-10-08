package f;

import cn.pokemmo.net.packet.inbound.ServerOpcode089Packet;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - ServerOpcode089Packet
 * 操作码: 89
 * 原始混淆类: f.lw_1
 * 现代实现: cn.pokemmo.net.packet.inbound.ServerOpcode089Packet
 */
public class lw_1 extends ServerOpcode089Packet {

    public lw_1(k20_0 source, ByteBuffer data) {
        super(source, data);
    }
}
