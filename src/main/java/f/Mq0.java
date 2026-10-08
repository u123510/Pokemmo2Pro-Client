package f;

import cn.pokemmo.net.packet.inbound.ServerOpcode145Packet;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - ServerOpcode145Packet
 * 操作码: 145
 * 原始混淆类: f.Mq0
 * 现代实现: cn.pokemmo.net.packet.inbound.ServerOpcode145Packet
 */
public class Mq0 extends ServerOpcode145Packet {

    public Mq0(k20_0 source, ByteBuffer data) {
        super(source, data);
    }
}
