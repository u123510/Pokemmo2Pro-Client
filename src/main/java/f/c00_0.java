package f;

import cn.pokemmo.net.packet.inbound.ServerOpcode075Packet;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - ServerOpcode075Packet
 * 操作码: 75
 * 原始混淆类: f.c00_0
 * 现代实现: cn.pokemmo.net.packet.inbound.ServerOpcode075Packet
 */
public class c00_0 extends ServerOpcode075Packet {

    public c00_0(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }
}
