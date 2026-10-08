package f;

import cn.pokemmo.net.packet.outbound.ClientOpcode208RequestPacket;
import java.nio.ByteBuffer;

/**
 * 客户端出站请求数据包垫片 - ClientOpcode208RequestPacket
 * 操作码: 208
 * 原始混淆类: f.IQ
 * 现代实现: cn.pokemmo.net.packet.outbound.ClientOpcode208RequestPacket
 */
public class IQ extends ClientOpcode208RequestPacket {

    public IQ(String string) {
        super(string);
    }
}
