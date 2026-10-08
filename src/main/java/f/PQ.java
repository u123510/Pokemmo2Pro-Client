package f;

import cn.pokemmo.net.packet.outbound.ClientOpcode226RequestPacket;
import java.nio.ByteBuffer;

/**
 * 客户端出站请求数据包垫片 - ClientOpcode226RequestPacket
 * 操作码: 226
 * 原始混淆类: f.PQ
 * 现代实现: cn.pokemmo.net.packet.outbound.ClientOpcode226RequestPacket
 */
public class PQ extends ClientOpcode226RequestPacket {

    public PQ(byte by) {
        super(by);
    }
}
