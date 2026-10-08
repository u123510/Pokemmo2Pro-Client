package f;

import cn.pokemmo.net.packet.outbound.ClientOpcode212RequestPacket;
import java.nio.ByteBuffer;

/**
 * 客户端出站请求数据包垫片 - ClientOpcode212RequestPacket
 * 操作码: 212
 * 原始混淆类: f.IK
 * 现代实现: cn.pokemmo.net.packet.outbound.ClientOpcode212RequestPacket
 */
public class IK extends ClientOpcode212RequestPacket {

    public IK(CH0 cH0) {
        super(cH0);
    }
}
