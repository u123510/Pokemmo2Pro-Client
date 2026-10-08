package f;

import cn.pokemmo.net.packet.inbound.BattleOpcode197Packet;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - BattleOpcode197Packet
 * 操作码: 197
 * 原始混淆类: f.oc0_1
 * 现代实现: cn.pokemmo.net.packet.inbound.BattleOpcode197Packet
 */
public class oc0_1 extends BattleOpcode197Packet {

    public oc0_1(k20_0 v1, ByteBuffer v2) {
        super(v1, v2);
    }
}
