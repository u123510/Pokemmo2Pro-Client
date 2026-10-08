package f;

import cn.pokemmo.net.packet.inbound.BattleOpcode092Packet;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - BattleOpcode092Packet
 * 操作码: 92
 * 原始混淆类: f.Xc
 * 现代实现: cn.pokemmo.net.packet.inbound.BattleOpcode092Packet
 */
public class Xc extends BattleOpcode092Packet {

    public Xc(k20_0 source, ByteBuffer data) {
        super(source, data);
    }
}
