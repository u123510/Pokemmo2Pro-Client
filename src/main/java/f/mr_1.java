package f;

import cn.pokemmo.net.packet.outbound.ClientOpcode151RequestPacket;
import java.nio.ByteBuffer;

/**
 * 客户端出站请求数据包垫片 - ClientOpcode151RequestPacket
 * 操作码: 151
 * 原始混淆类: f.mr_1
 * 现代实现: cn.pokemmo.net.packet.outbound.ClientOpcode151RequestPacket
 */
public class mr_1 extends ClientOpcode151RequestPacket {

    public mr_1(CH0 cH0, short s) {
        super(cH0, s);
    }
}
