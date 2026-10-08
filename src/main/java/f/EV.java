package f;

import cn.pokemmo.net.packet.outbound.ClientOpcode044RequestPacket;
import java.nio.ByteBuffer;

/**
 * 客户端出站请求数据包垫片 - ClientOpcode044RequestPacket
 * 操作码: 44
 * 原始混淆类: f.EV
 * 现代实现: cn.pokemmo.net.packet.outbound.ClientOpcode044RequestPacket
 */
public class EV extends ClientOpcode044RequestPacket {

    public EV(byte by, String string) {
        super(by, string);
    }
}
