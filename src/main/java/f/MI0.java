package f;

import cn.pokemmo.net.packet.inbound.ServerOpcode178Packet;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - ServerOpcode178Packet
 * 操作码: 178
 * 原始混淆类: f.MI0
 * 现代实现: cn.pokemmo.net.packet.inbound.ServerOpcode178Packet
 */
public class MI0 extends ServerOpcode178Packet {

    public MI0(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }
}
