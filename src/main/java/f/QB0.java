package f;

import cn.pokemmo.net.packet.inbound.ServerOpcode036Packet;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - ServerOpcode036Packet
 * 操作码: 36
 * 原始混淆类: f.QB0
 * 现代实现: cn.pokemmo.net.packet.inbound.ServerOpcode036Packet
 */
public class QB0 extends ServerOpcode036Packet {

    public QB0(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }
}
