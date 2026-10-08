package f;

import cn.pokemmo.net.packet.inbound.ServerOpcode044Packet;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - ServerOpcode044Packet
 * 操作码: 44
 * 原始混淆类: f.fc_0
 * 现代实现: cn.pokemmo.net.packet.inbound.ServerOpcode044Packet
 */
public class fc_0 extends ServerOpcode044Packet {

    public fc_0(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }
}
