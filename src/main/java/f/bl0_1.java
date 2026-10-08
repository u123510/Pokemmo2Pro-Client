package f;

import cn.pokemmo.net.packet.inbound.ServerOpcode004Packet;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - ServerOpcode004Packet
 * 操作码: 4
 * 原始混淆类: f.bl0_1
 * 现代实现: cn.pokemmo.net.packet.inbound.ServerOpcode004Packet
 */
public class bl0_1 extends ServerOpcode004Packet {

    public bl0_1(k20_0 connection, ByteBuffer input) {
        super(connection, input);
    }
}
