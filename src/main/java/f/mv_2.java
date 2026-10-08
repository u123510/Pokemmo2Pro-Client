package f;

import cn.pokemmo.net.packet.inbound.BattleOpcode200Packet;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - BattleOpcode200Packet
 * 操作码: 200
 * 原始混淆类: f.mv_2
 * 现代实现: cn.pokemmo.net.packet.inbound.BattleOpcode200Packet
 */
public class mv_2 extends BattleOpcode200Packet {

    public mv_2(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }
}
