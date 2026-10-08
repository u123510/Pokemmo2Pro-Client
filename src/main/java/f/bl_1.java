package f;

import cn.pokemmo.net.packet.inbound.ServerOpcode155Packet;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - ServerOpcode155Packet
 * 操作码: 155
 * 原始混淆类: f.bl_1
 * 现代实现: cn.pokemmo.net.packet.inbound.ServerOpcode155Packet
 */
public class bl_1 extends ServerOpcode155Packet {

    public bl_1(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }
}
