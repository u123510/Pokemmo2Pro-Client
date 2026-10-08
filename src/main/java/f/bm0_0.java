package f;

import cn.pokemmo.net.packet.inbound.ServerOpcode105Packet;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - ServerOpcode105Packet
 * 操作码: 105
 * 原始混淆类: f.bm0_0
 * 现代实现: cn.pokemmo.net.packet.inbound.ServerOpcode105Packet
 */
public class bm0_0 extends ServerOpcode105Packet {

    public bm0_0(k20_0 connection, ByteBuffer input) {
        super(connection, input);
    }
}
