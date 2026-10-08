package f;

import cn.pokemmo.net.packet.inbound.BattleOpcode121Packet;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - BattleOpcode121Packet
 * 操作码: 121
 * 原始混淆类: f.sy0_0
 * 现代实现: cn.pokemmo.net.packet.inbound.BattleOpcode121Packet
 */
public class sy0_0 extends BattleOpcode121Packet {

    public sy0_0(k20_0 source, ByteBuffer data) {
        super(source, data);
    }
}
