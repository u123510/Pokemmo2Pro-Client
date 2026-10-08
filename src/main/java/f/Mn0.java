package f;

import cn.pokemmo.net.packet.outbound.GuildActionRequestPacket;
import java.nio.ByteBuffer;

/**
 * 客户端出站请求数据包垫片 - GuildActionRequestPacket
 * 操作码: 3
 * 原始混淆类: f.Mn0
 * 现代实现: cn.pokemmo.net.packet.outbound.GuildActionRequestPacket
 */
public class Mn0 extends GuildActionRequestPacket {

    public Mn0(String string, byte by, byte by2, qe0_2 qe0_22) {
        super(string, by, by2, qe0_22);
    }
}
