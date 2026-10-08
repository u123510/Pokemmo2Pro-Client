package f;

import cn.pokemmo.net.packet.inbound.BattleOpcode117Packet;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - BattleOpcode117Packet
 * 操作码: 117
 * 原始混淆类: f.xf0_0
 * 现代实现: cn.pokemmo.net.packet.inbound.BattleOpcode117Packet
 */
public class xf0_0 extends BattleOpcode117Packet {

    public xf0_0(k20_0 source, ByteBuffer data) {
        super(source, data);
    }
}
