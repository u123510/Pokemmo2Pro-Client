package f;

import cn.pokemmo.net.packet.inbound.BattleOpcode245Packet;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - BattleOpcode245Packet
 * 操作码: 245
 * 原始混淆类: f.dg0_1
 * 现代实现: cn.pokemmo.net.packet.inbound.BattleOpcode245Packet
 */
public class dg0_1 extends BattleOpcode245Packet {

    public dg0_1(k20_0 source, ByteBuffer data) {
        super(source, data);
    }
}
