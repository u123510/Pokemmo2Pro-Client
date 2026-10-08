package f;

import cn.pokemmo.net.packet.inbound.BattleOpcode214Packet;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - BattleOpcode214Packet
 * 操作码: 214
 * 原始混淆类: f.MF
 * 现代实现: cn.pokemmo.net.packet.inbound.BattleOpcode214Packet
 */
public class MF extends BattleOpcode214Packet {

    public MF(k20_0 connection, ByteBuffer buffer) {
        super(connection, buffer);
    }
}
