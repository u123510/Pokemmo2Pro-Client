package f;

import cn.pokemmo.net.packet.inbound.BattleTeamLayoutPacket;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - BattleTeamLayoutPacket
 * 操作码: 198
 * 原始混淆类: f.LA
 * 现代实现: cn.pokemmo.net.packet.inbound.BattleTeamLayoutPacket
 */
public class LA extends BattleTeamLayoutPacket {

    public LA(k20_0 owner, ByteBuffer input) {
        super(owner, input);
    }
}
