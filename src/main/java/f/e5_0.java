package f;

import cn.pokemmo.net.packet.inbound.ServerOpcode060Packet;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - ServerOpcode060Packet
 * 操作码: 60
 * 原始混淆类: f.e5_0
 * 现代实现: cn.pokemmo.net.packet.inbound.ServerOpcode060Packet
 */
public class e5_0 extends ServerOpcode060Packet {

    public e5_0(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }
}
