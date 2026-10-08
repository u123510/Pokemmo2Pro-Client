package f;

import cn.pokemmo.net.packet.inbound.ServerOpcode157Packet;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - ServerOpcode157Packet
 * 操作码: 157
 * 原始混淆类: f.UF0
 * 现代实现: cn.pokemmo.net.packet.inbound.ServerOpcode157Packet
 */
public class UF0 extends ServerOpcode157Packet {

    public UF0(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }
}
