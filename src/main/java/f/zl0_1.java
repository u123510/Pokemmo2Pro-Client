package f;

import cn.pokemmo.net.packet.inbound.ServerOpcode186Packet;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - ServerOpcode186Packet
 * 操作码: 186
 * 原始混淆类: f.zl0_1
 * 现代实现: cn.pokemmo.net.packet.inbound.ServerOpcode186Packet
 */
public class zl0_1 extends ServerOpcode186Packet {

    public zl0_1(k20_0 source, ByteBuffer data) {
        super(source, data);
    }
}
