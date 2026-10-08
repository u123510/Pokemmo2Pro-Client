package f;

import cn.pokemmo.net.packet.outbound.ClientOpcode038RequestPacket;
import java.nio.ByteBuffer;

/**
 * 客户端出站请求数据包垫片 - ClientOpcode038RequestPacket
 * 操作码: 38
 * 原始混淆类: f.gu_1
 * 现代实现: cn.pokemmo.net.packet.outbound.ClientOpcode038RequestPacket
 */
public class gu_1 extends ClientOpcode038RequestPacket {

    public gu_1(short s, CH0 cH0, short s2, byte by, byte by2) {
        super(s, cH0, s2, by, by2);
    }
}
