package f;

import cn.pokemmo.net.packet.outbound.CharacterCreationRequestPacket;
import java.nio.ByteBuffer;

/**
 * 客户端出站请求数据包垫片 - CharacterCreationRequestPacket
 * 操作码: 37
 * 原始混淆类: f.Bs0
 * 现代实现: cn.pokemmo.net.packet.outbound.CharacterCreationRequestPacket
 */
public class Bs0 extends CharacterCreationRequestPacket {

    public Bs0(String string, Cq cq, boolean bl, boolean bl2, boolean bl3, byte by, byte by2, N2 n2, lq0[] lq0Array, byte by3) {
        super(string, cq, bl, bl2, bl3, by, by2, n2, lq0Array, by3);
    }
}
