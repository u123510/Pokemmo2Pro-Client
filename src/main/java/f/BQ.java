package f;

import cn.pokemmo.net.packet.outbound.ClientOpcode100RequestPacket;
import java.nio.ByteBuffer;

/**
 * 客户端出站请求数据包垫片 - ClientOpcode100RequestPacket
 * 操作码: 100
 * 原始混淆类: f.BQ
 * 现代实现: cn.pokemmo.net.packet.outbound.ClientOpcode100RequestPacket
 */
public class BQ extends ClientOpcode100RequestPacket {

    public BQ(CH0 cH0) {
        super(cH0);
    }
}
