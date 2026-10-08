package f;

import cn.pokemmo.net.packet.inbound.BattleActiveUnitUpdatePacket;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - BattleActiveUnitUpdatePacket
 * 操作码: 53
 * 原始混淆类: f.sp_0
 * 现代实现: cn.pokemmo.net.packet.inbound.BattleActiveUnitUpdatePacket
 */
public class sp_0 extends BattleActiveUnitUpdatePacket {

    public sp_0(k20_0 source, ByteBuffer data) {
        super(source, data);
    }
}
