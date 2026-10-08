package f;

import cn.pokemmo.net.packet.inbound.ServerOpcode166Packet;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - ServerOpcode166Packet
 * 操作码: 166
 * 原始混淆类: f.ns_1
 * 现代实现: cn.pokemmo.net.packet.inbound.ServerOpcode166Packet
 */
public class ns_1 extends ServerOpcode166Packet {

    public ns_1(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }
}
