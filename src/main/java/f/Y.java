package f;

import cn.pokemmo.net.packet.outbound.ClientOpcode060RequestPacket;
import java.nio.ByteBuffer;

/**
 * 客户端出站请求数据包垫片 - ClientOpcode060RequestPacket
 * 操作码: 60
 * 原始混淆类: f.Y
 * 现代实现: cn.pokemmo.net.packet.outbound.ClientOpcode060RequestPacket
 */
public class Y extends ClientOpcode060RequestPacket {

    public Y(short i1, TE0 v2) {
        super(i1, v2);
    }
}
