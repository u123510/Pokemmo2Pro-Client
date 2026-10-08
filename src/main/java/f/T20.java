package f;

import cn.pokemmo.net.packet.outbound.TournamentMatchRequestPacket;
import java.nio.ByteBuffer;

/**
 * 客户端出站请求数据包垫片 - TournamentMatchRequestPacket
 * 操作码: 96
 * 原始混淆类: f.T20
 * 现代实现: cn.pokemmo.net.packet.outbound.TournamentMatchRequestPacket
 */
public class T20 extends TournamentMatchRequestPacket {

    public T20(String string, String string2) {
        super(string, string2);
    }
}
