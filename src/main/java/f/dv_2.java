package f;

import cn.pokemmo.net.packet.inbound.BattleOpcode201Packet;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - BattleOpcode201Packet
 * 操作码: 201
 * 原始混淆类: f.dv_2
 * 现代实现: cn.pokemmo.net.packet.inbound.BattleOpcode201Packet
 */
public class dv_2 extends BattleOpcode201Packet {

    public dv_2(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }
}
