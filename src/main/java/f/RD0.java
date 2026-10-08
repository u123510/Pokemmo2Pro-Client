package f;

import cn.pokemmo.net.packet.outbound.ClientOpcode136RequestPacket;
import java.nio.ByteBuffer;

/**
 * 客户端出站请求数据包垫片 - ClientOpcode136RequestPacket
 * 操作码: 136
 * 原始混淆类: f.RD0
 * 现代实现: cn.pokemmo.net.packet.outbound.ClientOpcode136RequestPacket
 */
public class RD0 extends ClientOpcode136RequestPacket {

    public RD0(pg0_0 pg0_02, String string) {
        super(pg0_02, string);
    }
}
