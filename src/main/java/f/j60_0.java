package f;

import cn.pokemmo.net.packet.inbound.BattleOpcode100Packet;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - BattleOpcode100Packet
 * 操作码: 100
 * 原始混淆类: f.j60_0
 * 现代实现: cn.pokemmo.net.packet.inbound.BattleOpcode100Packet
 */
public class j60_0 extends BattleOpcode100Packet {

    public j60_0(k20_0 source, ByteBuffer data) {
        super(source, data);
    }
}
