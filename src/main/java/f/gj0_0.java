package f;

import cn.pokemmo.net.packet.inbound.GuildMemberListPacket;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - GuildMemberListPacket
 * 操作码: 219
 * 原始混淆类: f.gj0_0
 * 现代实现: cn.pokemmo.net.packet.inbound.GuildMemberListPacket
 */
public class gj0_0 extends GuildMemberListPacket {

    public gj0_0(k20_0 source, ByteBuffer data) {
        super(source, data);
    }
}
