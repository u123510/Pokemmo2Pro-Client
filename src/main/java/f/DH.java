package f;

import cn.pokemmo.net.packet.inbound.ServerOpcode099Packet;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - ServerOpcode099Packet
 * 操作码: 99
 * 原始混淆类: f.DH
 * 现代实现: cn.pokemmo.net.packet.inbound.ServerOpcode099Packet
 */
public class DH extends ServerOpcode099Packet {

    public DH(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }
}
