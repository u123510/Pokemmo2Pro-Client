package f;

import cn.pokemmo.net.packet.inbound.ServerOpcode093Packet;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - ServerOpcode093Packet
 * 操作码: 93
 * 原始混淆类: f.IR
 * 现代实现: cn.pokemmo.net.packet.inbound.ServerOpcode093Packet
 */
public class IR extends ServerOpcode093Packet {

    public IR(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }
}
