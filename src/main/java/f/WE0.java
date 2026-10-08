package f;

import cn.pokemmo.net.packet.outbound.ClientOpcode113RequestPacket;
import java.nio.ByteBuffer;

/**
 * 客户端出站请求数据包垫片 - ClientOpcode113RequestPacket
 * 操作码: 113
 * 原始混淆类: f.WE0
 * 现代实现: cn.pokemmo.net.packet.outbound.ClientOpcode113RequestPacket
 */
public class WE0 extends ClientOpcode113RequestPacket {

    public WE0(byte by, int n, int n2) {
        super(by, n, n2);
    }
}
