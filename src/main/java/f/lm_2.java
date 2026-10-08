package f;

import cn.pokemmo.net.packet.inbound.BattleOpcode049Packet;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - BattleOpcode049Packet
 * 操作码: 49
 * 原始混淆类: f.lm_2
 * 现代实现: cn.pokemmo.net.packet.inbound.BattleOpcode049Packet
 */
public class lm_2 extends BattleOpcode049Packet {

    public lm_2(k20_0 source, ByteBuffer data) {
        super(source, data);
    }
}
