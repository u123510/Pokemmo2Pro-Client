package f;

import cn.pokemmo.net.packet.outbound.PlayerAfkStatusRequestPacket;
import java.nio.ByteBuffer;

/**
 * 客户端出站请求数据包垫片 - PlayerAfkStatusRequestPacket
 * 操作码: 70
 * 原始混淆类: f.b4_0
 * 现代实现: cn.pokemmo.net.packet.outbound.PlayerAfkStatusRequestPacket
 */
public class b4_0 extends PlayerAfkStatusRequestPacket {

    public b4_0(boolean bl) {
        super(bl);
    }
}
