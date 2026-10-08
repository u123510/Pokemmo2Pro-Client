package f;

import cn.pokemmo.net.packet.outbound.ClientOpcode069RequestPacket;
import java.nio.ByteBuffer;

/**
 * 客户端出站请求数据包垫片 - ClientOpcode069RequestPacket
 * 操作码: 69
 * 原始混淆类: f.Si0
 * 现代实现: cn.pokemmo.net.packet.outbound.ClientOpcode069RequestPacket
 */
public class Si0 extends ClientOpcode069RequestPacket {

    public Si0(GI0 gI0, byte by, short s) {
        super(gI0, by, s);
    }
}
