package f;

import cn.pokemmo.net.packet.inbound.BattleOpcode137Packet;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - BattleOpcode137Packet
 * 操作码: 137
 * 原始混淆类: f.M80
 * 现代实现: cn.pokemmo.net.packet.inbound.BattleOpcode137Packet
 */
public class M80 extends BattleOpcode137Packet {

    public M80(k20_0 connection, ByteBuffer buffer) {
        super(connection, buffer);
    }
}
