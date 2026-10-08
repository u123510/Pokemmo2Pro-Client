package f;

import cn.pokemmo.net.packet.inbound.ServerOpcode136Packet;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - ServerOpcode136Packet
 * 操作码: 136
 * 原始混淆类: f.ka0_0
 * 现代实现: cn.pokemmo.net.packet.inbound.ServerOpcode136Packet
 */
public class ka0_0 extends ServerOpcode136Packet {

    public ka0_0(k20_0 context, ByteBuffer buffer) {
        super(context, buffer);
    }
}
