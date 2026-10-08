package f;

import cn.pokemmo.net.packet.outbound.ClientOpcode108RequestPacket;
import java.nio.ByteBuffer;

/**
 * 客户端出站请求数据包垫片 - ClientOpcode108RequestPacket
 * 操作码: 108
 * 原始混淆类: f.XQ
 * 现代实现: cn.pokemmo.net.packet.outbound.ClientOpcode108RequestPacket
 */
public class XQ extends ClientOpcode108RequestPacket {

    public XQ(G50[] g50Array) {
        super(g50Array);
    }
}
