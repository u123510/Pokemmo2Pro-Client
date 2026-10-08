package f;

import cn.pokemmo.net.packet.inbound.ServerOpcode102Packet;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - ServerOpcode102Packet
 * 操作码: 102
 * 原始混淆类: f.ki_1
 * 现代实现: cn.pokemmo.net.packet.inbound.ServerOpcode102Packet
 */
public class ki_1 extends ServerOpcode102Packet {

    public ki_1(k20_0 source, ByteBuffer data) {
        super(source, data);
    }
}
