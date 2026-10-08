package f;

import cn.pokemmo.net.packet.inbound.ServerOpcode168Packet;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - ServerOpcode168Packet
 * 操作码: 168
 * 原始混淆类: f.yb_2
 * 现代实现: cn.pokemmo.net.packet.inbound.ServerOpcode168Packet
 */
public class yb_2 extends ServerOpcode168Packet {

    public yb_2(k20_0 source, ByteBuffer data) {
        super(source, data);
    }
}
