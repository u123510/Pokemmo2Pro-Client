package f;

import cn.pokemmo.net.packet.inbound.ServerOpcode171Packet;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - ServerOpcode171Packet
 * 操作码: 171
 * 原始混淆类: f.IV
 * 现代实现: cn.pokemmo.net.packet.inbound.ServerOpcode171Packet
 */
public class IV extends ServerOpcode171Packet {

    public IV(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }
}
