package f;

import cn.pokemmo.net.packet.inbound.PartyMemberUpdatePacket;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - PartyMemberUpdatePacket
 * 操作码: 13
 * 原始混淆类: f.wb0_0
 * 现代实现: cn.pokemmo.net.packet.inbound.PartyMemberUpdatePacket
 */
public class wb0_0 extends PartyMemberUpdatePacket {

    public wb0_0(k20_0 source, ByteBuffer data) {
        super(source, data);
    }
}
