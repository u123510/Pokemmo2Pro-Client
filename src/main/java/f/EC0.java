package f;

import cn.pokemmo.net.packet.inbound.ServerOpcode029Packet;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - ServerOpcode029Packet
 * 操作码: 29
 * 原始混淆类: f.EC0
 * 现代实现: cn.pokemmo.net.packet.inbound.ServerOpcode029Packet
 */
public class EC0 extends ServerOpcode029Packet {

    public EC0(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }
}
