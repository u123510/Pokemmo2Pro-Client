package f;

import cn.pokemmo.net.packet.outbound.ClientOpcode025RequestPacket;
import java.nio.ByteBuffer;

/**
 * 客户端出站请求数据包垫片 - ClientOpcode025RequestPacket
 * 操作码: 25
 * 原始混淆类: f.tu_1
 * 现代实现: cn.pokemmo.net.packet.outbound.ClientOpcode025RequestPacket
 */
public class tu_1 extends ClientOpcode025RequestPacket {

    public tu_1(CH0 cH0, short s) {
        super(cH0, s);
    }
}
