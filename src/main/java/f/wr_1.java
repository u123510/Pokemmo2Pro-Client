package f;

import cn.pokemmo.net.packet.inbound.BattleOpcode062Packet;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - BattleOpcode062Packet
 * 操作码: 62
 * 原始混淆类: f.wr_1
 * 现代实现: cn.pokemmo.net.packet.inbound.BattleOpcode062Packet
 */
public class wr_1 extends BattleOpcode062Packet {

    public wr_1(k20_0 source, ByteBuffer data) {
        super(source, data);
    }
}
