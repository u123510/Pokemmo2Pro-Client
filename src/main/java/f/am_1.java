package f;

import cn.pokemmo.net.packet.outbound.ClientOpcode117RequestPacket;
import java.nio.ByteBuffer;

/**
 * 客户端出站请求数据包垫片 - ClientOpcode117RequestPacket
 * 操作码: 117
 * 原始混淆类: f.am_1
 * 现代实现: cn.pokemmo.net.packet.outbound.ClientOpcode117RequestPacket
 */
public class am_1 extends ClientOpcode117RequestPacket {

    public am_1(short s, byte by, boolean bl) {
        super(s, by, bl);
    }
}
