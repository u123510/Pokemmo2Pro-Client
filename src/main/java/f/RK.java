package f;

import cn.pokemmo.net.packet.outbound.ClientOpcode059RequestPacket;
import java.nio.ByteBuffer;

/**
 * 客户端出站请求数据包垫片 - ClientOpcode059RequestPacket
 * 操作码: 59
 * 原始混淆类: f.RK
 * 现代实现: cn.pokemmo.net.packet.outbound.ClientOpcode059RequestPacket
 */
public class RK extends ClientOpcode059RequestPacket {

    public RK(CH0 cH0, CH0 cH02) {
        super(cH0, cH02);
    }
}
