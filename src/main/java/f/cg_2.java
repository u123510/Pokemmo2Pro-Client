package f;

import cn.pokemmo.net.packet.inbound.ServerOpcode073Packet;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - ServerOpcode073Packet
 * 操作码: 73
 * 原始混淆类: f.cg_2
 * 现代实现: cn.pokemmo.net.packet.inbound.ServerOpcode073Packet
 */
public class cg_2 extends ServerOpcode073Packet {

    public cg_2(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }
}
