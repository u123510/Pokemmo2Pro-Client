package f;

import cn.pokemmo.net.packet.inbound.ServerOpcode050Packet;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - ServerOpcode050Packet
 * 操作码: 50
 * 原始混淆类: f.N20
 * 现代实现: cn.pokemmo.net.packet.inbound.ServerOpcode050Packet
 */
public class N20 extends ServerOpcode050Packet {

    public N20(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }
}
