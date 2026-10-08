package f;

import cn.pokemmo.net.packet.outbound.ClientOpcode209RequestPacket;
import java.nio.ByteBuffer;

/**
 * 客户端出站请求数据包垫片 - ClientOpcode209RequestPacket
 * 操作码: 209
 * 原始混淆类: f.WQ
 * 现代实现: cn.pokemmo.net.packet.outbound.ClientOpcode209RequestPacket
 */
public class WQ extends ClientOpcode209RequestPacket {

    public WQ(CH0 cH0) {
        super(cH0);
    }
}
