package f;

import cn.pokemmo.net.packet.outbound.ClientOpcode079RequestPacket;
import java.nio.ByteBuffer;

/**
 * 客户端出站请求数据包垫片 - ClientOpcode079RequestPacket
 * 操作码: 79
 * 原始混淆类: f.Rr0
 * 现代实现: cn.pokemmo.net.packet.outbound.ClientOpcode079RequestPacket
 */
public class Rr0 extends ClientOpcode079RequestPacket {

    public Rr0(byte by, byte by2, byte by3, short s) {
        super(by, by2, by3, s);
    }
}
