package f;

import cn.pokemmo.net.packet.inbound.BattleOpcode156Packet;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - BattleOpcode156Packet
 * 操作码: 156
 * 原始混淆类: f.ND0
 * 现代实现: cn.pokemmo.net.packet.inbound.BattleOpcode156Packet
 */
public class ND0 extends BattleOpcode156Packet {

    public ND0(k20_0 source, ByteBuffer data) {
        super(source, data);
    }
}
