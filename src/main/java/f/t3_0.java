package f;

import cn.pokemmo.net.packet.inbound.ServerOpcode038Packet;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - ServerOpcode038Packet
 * 操作码: 38
 * 原始混淆类: f.t3_0
 * 现代实现: cn.pokemmo.net.packet.inbound.ServerOpcode038Packet
 */
public class t3_0 extends ServerOpcode038Packet {

    public t3_0(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }
}
