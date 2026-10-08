package f;

import cn.pokemmo.net.packet.inbound.ServerOpcode101Packet;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - ServerOpcode101Packet
 * 操作码: 101
 * 原始混淆类: f.cs0_0
 * 现代实现: cn.pokemmo.net.packet.inbound.ServerOpcode101Packet
 */
public class cs0_0 extends ServerOpcode101Packet {

    public cs0_0(k20_0 source, ByteBuffer data) {
        super(source, data);
    }
}
