package f;

import cn.pokemmo.net.packet.inbound.ServerOpcode078Packet;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - ServerOpcode078Packet
 * 操作码: 78
 * 原始混淆类: f.o8_0
 * 现代实现: cn.pokemmo.net.packet.inbound.ServerOpcode078Packet
 */
public class o8_0 extends ServerOpcode078Packet {

    public o8_0(k20_0 source, ByteBuffer data) {
        super(source, data);
    }
}
