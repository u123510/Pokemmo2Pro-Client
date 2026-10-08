package f;

import cn.pokemmo.net.packet.outbound.ClientOpcode065RequestPacket;
import java.nio.ByteBuffer;

/**
 * 客户端出站请求数据包垫片 - ClientOpcode065RequestPacket
 * 操作码: 65
 * 原始混淆类: f.Ma
 * 现代实现: cn.pokemmo.net.packet.outbound.ClientOpcode065RequestPacket
 */
public class Ma extends ClientOpcode065RequestPacket {

    public Ma(CH0 cH0, boolean bl) {
        super(cH0, bl);
    }
}
