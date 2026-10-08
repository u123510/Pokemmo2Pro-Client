package f;

import cn.pokemmo.net.packet.outbound.ClientOpcode169RequestPacket;
import java.nio.ByteBuffer;

/**
 * 客户端出站请求数据包垫片 - ClientOpcode169RequestPacket
 * 操作码: 169
 * 原始混淆类: f.KE0
 * 现代实现: cn.pokemmo.net.packet.outbound.ClientOpcode169RequestPacket
 */
public class KE0 extends ClientOpcode169RequestPacket {

    public KE0(CH0 cH0) {
        super(cH0);
    }
}
