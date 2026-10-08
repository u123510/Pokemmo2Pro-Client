package f;

import cn.pokemmo.net.packet.inbound.BattleOpcode081Packet;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - BattleOpcode081Packet
 * 操作码: 81
 * 原始混淆类: f.nm_0
 * 现代实现: cn.pokemmo.net.packet.inbound.BattleOpcode081Packet
 */
public class nm_0 extends BattleOpcode081Packet {

    public nm_0(k20_0 source, ByteBuffer data) {
        super(source, data);
    }
}
