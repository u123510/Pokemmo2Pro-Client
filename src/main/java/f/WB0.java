package f;

import cn.pokemmo.net.packet.inbound.BattleTurnActionPayloadPacket;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - BattleTurnActionPayloadPacket
 * 操作码: 56
 * 原始混淆类: f.WB0
 * 现代实现: cn.pokemmo.net.packet.inbound.BattleTurnActionPayloadPacket
 */
public class WB0 extends BattleTurnActionPayloadPacket {

    public WB0(k20_0 connection, ByteBuffer buffer) {
        super(connection, buffer);
    }
}
