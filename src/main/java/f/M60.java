package f;

import cn.pokemmo.net.packet.outbound.ClientOpcode064RequestPacket;
import java.nio.ByteBuffer;

/**
 * 客户端出站请求数据包垫片 - ClientOpcode064RequestPacket
 * 操作码: 64
 * 原始混淆类: f.M60
 * 现代实现: cn.pokemmo.net.packet.outbound.ClientOpcode064RequestPacket
 */
public class M60 extends ClientOpcode064RequestPacket {

    public M60(byte value, CH0[] targets, byte first, byte second) {
        super(value, targets, first, second);
    }
}
