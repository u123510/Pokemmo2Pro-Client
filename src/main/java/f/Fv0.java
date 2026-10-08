package f;

import cn.pokemmo.net.packet.inbound.BattleActionExecutionPacket;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - BattleActionExecutionPacket
 * 操作码: 51
 * 原始混淆类: f.Fv0
 * 现代实现: cn.pokemmo.net.packet.inbound.BattleActionExecutionPacket
 */
public class Fv0 extends BattleActionExecutionPacket {

    public Fv0(k20_0 v1, ByteBuffer v2) {
        super(v1, v2);
    }
}
