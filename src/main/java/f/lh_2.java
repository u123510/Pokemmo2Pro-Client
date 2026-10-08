package f;

import cn.pokemmo.net.packet.inbound.BattleTurnActionHeaderPacket;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - BattleTurnActionHeaderPacket
 * 操作码: 57
 * 原始混淆类: f.lh_2
 * 现代实现: cn.pokemmo.net.packet.inbound.BattleTurnActionHeaderPacket
 */
public class lh_2 extends BattleTurnActionHeaderPacket {

    public lh_2(k20_0 context, ByteBuffer buffer) {
        super(context, buffer);
    }
}
