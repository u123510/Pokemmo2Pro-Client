package f;

import cn.pokemmo.net.packet.inbound.BattleInitPacket;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - BattleInitPacket
 * 操作码: 23
 * 原始混淆类: f.oy0_0
 * 现代实现: cn.pokemmo.net.packet.inbound.BattleInitPacket
 */
public class oy0_0 extends BattleInitPacket {

    public oy0_0(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }
}
