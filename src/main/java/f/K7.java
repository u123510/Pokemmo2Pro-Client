package f;

import cn.pokemmo.net.packet.inbound.ServerOpcode031Packet;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - ServerOpcode031Packet
 * 操作码: 31
 * 原始混淆类: f.K7
 * 现代实现: cn.pokemmo.net.packet.inbound.ServerOpcode031Packet
 */
public class K7 extends ServerOpcode031Packet {

    public K7(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }
}
