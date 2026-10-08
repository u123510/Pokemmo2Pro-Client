package f;

import cn.pokemmo.net.packet.inbound.BattleActiveMonsterUpdatePacket;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - BattleActiveMonsterUpdatePacket
 * 操作码: 48
 * 原始混淆类: f.iv_1
 * 现代实现: cn.pokemmo.net.packet.inbound.BattleActiveMonsterUpdatePacket
 */
public class iv_1 extends BattleActiveMonsterUpdatePacket {

    public iv_1(k20_0 k20_0, ByteBuffer bytebuffer) {
        super(k20_0, bytebuffer);
    }
}
