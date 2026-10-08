package f;

import cn.pokemmo.net.packet.outbound.ClientOpcode080RequestPacket;
import java.nio.ByteBuffer;

/**
 * 客户端出站请求数据包垫片 - ClientOpcode080RequestPacket
 * 操作码: 80
 * 原始混淆类: f.ed0_1
 * 现代实现: cn.pokemmo.net.packet.outbound.ClientOpcode080RequestPacket
 */
public class ed0_1 extends ClientOpcode080RequestPacket {

    public ed0_1(byte by) {
        super(by);
    }
}
