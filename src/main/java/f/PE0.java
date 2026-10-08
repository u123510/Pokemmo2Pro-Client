package f;

import cn.pokemmo.net.packet.inbound.ServerOpcode096Packet;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - ServerOpcode096Packet
 * 操作码: 96
 * 原始混淆类: f.PE0
 * 现代实现: cn.pokemmo.net.packet.inbound.ServerOpcode096Packet
 */
public class PE0 extends ServerOpcode096Packet {

    public PE0(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }
}
