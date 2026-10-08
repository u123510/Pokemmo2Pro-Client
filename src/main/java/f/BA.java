package f;

import cn.pokemmo.net.packet.outbound.TargetInteractRequestPacket;
import java.nio.ByteBuffer;

/**
 * 客户端出站请求数据包垫片 - TargetInteractRequestPacket
 * 操作码: 10
 * 原始混淆类: f.BA
 * 现代实现: cn.pokemmo.net.packet.outbound.TargetInteractRequestPacket
 */
public class BA extends TargetInteractRequestPacket {

    public BA(CH0 cH0, byte by, short s) {
        super(cH0, by, s);
    }
}
