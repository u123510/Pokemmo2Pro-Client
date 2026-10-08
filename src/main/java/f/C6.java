package f;

import cn.pokemmo.net.packet.outbound.BattleActionChoiceRequestPacket;
import java.nio.ByteBuffer;

/**
 * 客户端出站请求数据包垫片 - BattleActionChoiceRequestPacket
 * 操作码: 48
 * 原始混淆类: f.C6
 * 现代实现: cn.pokemmo.net.packet.outbound.BattleActionChoiceRequestPacket
 */
public class C6 extends BattleActionChoiceRequestPacket {

    public C6(byte by, CH0 cH0, short s, boolean bl) {
        super(by, cH0, s, bl);
    }
}
