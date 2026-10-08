package f;

import cn.pokemmo.net.packet.inbound.ServerOpcode131Packet;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - ServerOpcode131Packet
 * 操作码: 131
 * 原始混淆类: f.bu_2
 * 现代实现: cn.pokemmo.net.packet.inbound.ServerOpcode131Packet
 */
public class bu_2 extends ServerOpcode131Packet {

    public bu_2(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }
}
