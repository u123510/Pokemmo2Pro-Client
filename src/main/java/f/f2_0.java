package f;

import cn.pokemmo.net.packet.outbound.ClientOpcode011RequestPacket;
import java.nio.ByteBuffer;

/**
 * 客户端出站请求数据包垫片 - ClientOpcode011RequestPacket
 * 操作码: 11
 * 原始混淆类: f.f2_0
 * 现代实现: cn.pokemmo.net.packet.outbound.ClientOpcode011RequestPacket
 */
public class f2_0 extends ClientOpcode011RequestPacket {

    public f2_0(CH0 cH0, boolean bl) {
        super(cH0, bl);
    }
}
