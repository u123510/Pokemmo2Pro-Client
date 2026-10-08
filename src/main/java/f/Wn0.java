package f;

import cn.pokemmo.net.packet.inbound.BattleOpcode054Packet;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - BattleOpcode054Packet
 * 操作码: 54
 * 原始混淆类: f.Wn0
 * 现代实现: cn.pokemmo.net.packet.inbound.BattleOpcode054Packet
 */
public class Wn0 extends BattleOpcode054Packet {

    public Wn0(k20_0 value, ByteBuffer buffer) {
        super(value, buffer);
    }
}
