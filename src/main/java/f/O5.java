package f;

import cn.pokemmo.net.packet.inbound.BattleOpcode094Packet;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - BattleOpcode094Packet
 * 操作码: 94
 * 原始混淆类: f.O5
 * 现代实现: cn.pokemmo.net.packet.inbound.BattleOpcode094Packet
 */
public class O5 extends BattleOpcode094Packet {

    public O5(k20_0 owner, ByteBuffer buffer) {
        super(owner, buffer);
    }
}
