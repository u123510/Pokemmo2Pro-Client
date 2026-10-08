package f;

import cn.pokemmo.net.packet.inbound.ServerOpcode163Packet;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - ServerOpcode163Packet
 * 操作码: 163
 * 原始混淆类: f.QG0
 * 现代实现: cn.pokemmo.net.packet.inbound.ServerOpcode163Packet
 */
public class QG0 extends ServerOpcode163Packet {

    public QG0(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }
}
