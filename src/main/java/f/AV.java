package f;

import cn.pokemmo.net.packet.outbound.ClientOpcode083RequestPacket;
import java.nio.ByteBuffer;

/**
 * 客户端出站请求数据包垫片 - ClientOpcode083RequestPacket
 * 操作码: 83
 * 原始混淆类: f.AV
 * 现代实现: cn.pokemmo.net.packet.outbound.ClientOpcode083RequestPacket
 */
public class AV extends ClientOpcode083RequestPacket {

    public AV(CH0 cH0, short s, short s2) {
        super(cH0, s, s2);
    }
}
