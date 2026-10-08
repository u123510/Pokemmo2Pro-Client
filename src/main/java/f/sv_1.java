package f;

import cn.pokemmo.net.packet.inbound.BattleOpcode055Packet;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - BattleOpcode055Packet
 * 操作码: 55
 * 原始混淆类: f.sv_1
 * 现代实现: cn.pokemmo.net.packet.inbound.BattleOpcode055Packet
 */
public class sv_1 extends BattleOpcode055Packet {

    public sv_1(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }
}
