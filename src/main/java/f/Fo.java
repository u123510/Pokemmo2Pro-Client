package f;

import cn.pokemmo.net.packet.outbound.ClientOpcode029RequestPacket;
import java.nio.ByteBuffer;

/**
 * 客户端出站请求数据包垫片 - ClientOpcode029RequestPacket
 * 操作码: 29
 * 原始混淆类: f.Fo
 * 现代实现: cn.pokemmo.net.packet.outbound.ClientOpcode029RequestPacket
 */
public class Fo extends ClientOpcode029RequestPacket {

    public Fo(byte by, CH0 cH0) {
        super(by, cH0);
    }
}
