package f;

import cn.pokemmo.net.packet.inbound.BattleOpcode052Packet;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - BattleOpcode052Packet
 * 操作码: 52
 * 原始混淆类: f.BJ
 * 现代实现: cn.pokemmo.net.packet.inbound.BattleOpcode052Packet
 */
public class BJ extends BattleOpcode052Packet {

    public BJ(k20_0 var1, ByteBuffer var2) {
        super(var1, var2);
    }
}
