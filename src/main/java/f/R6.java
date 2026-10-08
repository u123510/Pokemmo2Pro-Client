package f;

import cn.pokemmo.net.packet.inbound.BattleOpcode059Packet;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - BattleOpcode059Packet
 * 操作码: 59
 * 原始混淆类: f.R6
 * 现代实现: cn.pokemmo.net.packet.inbound.BattleOpcode059Packet
 */
public class R6 extends BattleOpcode059Packet {

    public R6(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }
}
