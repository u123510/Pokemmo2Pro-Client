package f;

import cn.pokemmo.net.packet.inbound.ServerOpcode129Packet;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - ServerOpcode129Packet
 * 操作码: 129
 * 原始混淆类: f.NI0
 * 现代实现: cn.pokemmo.net.packet.inbound.ServerOpcode129Packet
 */
public class NI0 extends ServerOpcode129Packet {

    public NI0(k20_0 source, java.nio.ByteBuffer data) {
        super(source, data);
    }
}
