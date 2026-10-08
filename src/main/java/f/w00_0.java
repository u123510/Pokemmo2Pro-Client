package f;

import cn.pokemmo.net.packet.inbound.BattleOpcode196Packet;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - BattleOpcode196Packet
 * 操作码: 196
 * 原始混淆类: f.w00_0
 * 现代实现: cn.pokemmo.net.packet.inbound.BattleOpcode196Packet
 */
public class w00_0 extends BattleOpcode196Packet {

    public w00_0(k20_0 source, ByteBuffer data) {
        super(source, data);
    }
}
