package f;

import cn.pokemmo.net.packet.inbound.ServerOpcode068Packet;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - ServerOpcode068Packet
 * 操作码: 68
 * 原始混淆类: f.PU
 * 现代实现: cn.pokemmo.net.packet.inbound.ServerOpcode068Packet
 */
public class PU extends ServerOpcode068Packet {

    public PU(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }
}
