package f;

import cn.pokemmo.net.packet.outbound.ClientOpcode121RequestPacket;
import java.nio.ByteBuffer;

/**
 * 客户端出站请求数据包垫片 - ClientOpcode121RequestPacket
 * 操作码: 121
 * 原始混淆类: f.cw_2
 * 现代实现: cn.pokemmo.net.packet.outbound.ClientOpcode121RequestPacket
 */
public class cw_2 extends ClientOpcode121RequestPacket {

    public cw_2(byte by, byte by2, CH0 cH0) {
        super(by, by2, cH0);
    }
}
