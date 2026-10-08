package f;

import cn.pokemmo.net.packet.inbound.ServerOpcode083Packet;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - ServerOpcode083Packet
 * 操作码: 83
 * 原始混淆类: f.k90_0
 * 现代实现: cn.pokemmo.net.packet.inbound.ServerOpcode083Packet
 */
public class k90_0 extends ServerOpcode083Packet {

    public k90_0(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }
}
