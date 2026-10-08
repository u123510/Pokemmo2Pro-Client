package f;

import cn.pokemmo.net.packet.outbound.PartyLeaveRequestPacket;
import java.nio.ByteBuffer;

/**
 * 客户端出站请求数据包垫片 - PartyLeaveRequestPacket
 * 操作码: 224
 * 原始混淆类: f.FR
 * 现代实现: cn.pokemmo.net.packet.outbound.PartyLeaveRequestPacket
 */
public class FR extends PartyLeaveRequestPacket {

    public FR(byte by, bx_0 bx_02) {
        super(by, bx_02);
    }
}
