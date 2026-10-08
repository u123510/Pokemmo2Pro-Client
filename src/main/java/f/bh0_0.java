package f;

import cn.pokemmo.net.packet.inbound.ServerOpcode086Packet;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - ServerOpcode086Packet
 * 操作码: 86
 * 原始混淆类: f.bh0_0
 * 现代实现: cn.pokemmo.net.packet.inbound.ServerOpcode086Packet
 */
public class bh0_0 extends ServerOpcode086Packet {

    public bh0_0(k20_0 connection, ByteBuffer input) {
        super(connection, input);
    }
}
