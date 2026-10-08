package f;

import cn.pokemmo.net.packet.inbound.ServerOpcode128Packet;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - ServerOpcode128Packet
 * 操作码: 128
 * 原始混淆类: f.HJ
 * 现代实现: cn.pokemmo.net.packet.inbound.ServerOpcode128Packet
 */
public class HJ extends ServerOpcode128Packet {

    public HJ(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }
}
