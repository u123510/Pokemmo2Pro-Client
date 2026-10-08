package f;

import cn.pokemmo.net.packet.outbound.ClientOpcode047RequestPacket;
import java.nio.ByteBuffer;

/**
 * 客户端出站请求数据包垫片 - ClientOpcode047RequestPacket
 * 操作码: 47
 * 原始混淆类: f.Y8
 * 现代实现: cn.pokemmo.net.packet.outbound.ClientOpcode047RequestPacket
 */
public class Y8 extends ClientOpcode047RequestPacket {

    public Y8(short s, boolean bl) {
        super(s, bl);
    }
}
