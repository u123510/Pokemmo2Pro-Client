package f;

import cn.pokemmo.net.packet.inbound.ServerOpcode135Packet;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - ServerOpcode135Packet
 * 操作码: 135
 * 原始混淆类: f.GC
 * 现代实现: cn.pokemmo.net.packet.inbound.ServerOpcode135Packet
 */
public class GC extends ServerOpcode135Packet {

    public GC(k20_0 source, ByteBuffer data) {
        super(source, data);
    }
}
