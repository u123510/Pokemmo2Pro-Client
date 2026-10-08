package f;

import cn.pokemmo.net.packet.inbound.ServerOpcode061Packet;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - ServerOpcode061Packet
 * 操作码: 61
 * 原始混淆类: f.r10_0
 * 现代实现: cn.pokemmo.net.packet.inbound.ServerOpcode061Packet
 */
public class r10_0 extends ServerOpcode061Packet {

    public r10_0(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }
}
