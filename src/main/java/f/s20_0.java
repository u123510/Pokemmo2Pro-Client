package f;

import cn.pokemmo.net.packet.outbound.ClientOpcode013RequestPacket;
import java.nio.ByteBuffer;

/**
 * 客户端出站请求数据包垫片 - ClientOpcode013RequestPacket
 * 操作码: 13
 * 原始混淆类: f.s20_0
 * 现代实现: cn.pokemmo.net.packet.outbound.ClientOpcode013RequestPacket
 */
public class s20_0 extends ClientOpcode013RequestPacket {

    public s20_0(byte by, byte by2, CH0 cH0) {
        super(by, by2, cH0);
    }
}
