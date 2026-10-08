package f;

import cn.pokemmo.net.packet.inbound.ServerOpcode063Packet;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - ServerOpcode063Packet
 * 操作码: 63
 * 原始混淆类: f.P3
 * 现代实现: cn.pokemmo.net.packet.inbound.ServerOpcode063Packet
 */
public class P3 extends ServerOpcode063Packet {

    public P3(k20_0 context, ByteBuffer buffer) {
        super(context, buffer);
    }
}
