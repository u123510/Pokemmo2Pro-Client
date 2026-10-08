package f;

import cn.pokemmo.net.packet.inbound.ServerOpcode144Packet;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - ServerOpcode144Packet
 * 操作码: 144
 * 原始混淆类: f.wm0_0
 * 现代实现: cn.pokemmo.net.packet.inbound.ServerOpcode144Packet
 */
public class wm0_0 extends ServerOpcode144Packet {

    public wm0_0(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }
}
