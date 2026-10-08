package f;

import cn.pokemmo.net.packet.inbound.BattleOpcode195Packet;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - BattleOpcode195Packet
 * 操作码: 195
 * 原始混淆类: f.ra0_2
 * 现代实现: cn.pokemmo.net.packet.inbound.BattleOpcode195Packet
 */
public class ra0_2 extends BattleOpcode195Packet {

    public ra0_2(k20_0 source, ByteBuffer data) {
        super(source, data);
    }
}
