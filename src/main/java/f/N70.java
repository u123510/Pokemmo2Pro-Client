package f;

import cn.pokemmo.net.packet.inbound.BattleOpcode112Packet;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - BattleOpcode112Packet
 * 操作码: 112
 * 原始混淆类: f.N70
 * 现代实现: cn.pokemmo.net.packet.inbound.BattleOpcode112Packet
 */
public class N70 extends BattleOpcode112Packet {

    public N70(k20_0 source, ByteBuffer data) {
        super(source, data);
    }
}
