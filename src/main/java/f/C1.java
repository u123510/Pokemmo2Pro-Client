package f;

import cn.pokemmo.net.packet.inbound.ServerOpcode244Packet;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - ServerOpcode244Packet
 * 操作码: 244
 * 原始混淆类: f.C1
 * 现代实现: cn.pokemmo.net.packet.inbound.ServerOpcode244Packet
 */
public class C1 extends ServerOpcode244Packet {

    public C1(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }
}
