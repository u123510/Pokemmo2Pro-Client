package f;

import cn.pokemmo.net.packet.inbound.TradeConfirmPacket;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - TradeConfirmPacket
 * 操作码: 17
 * 原始混淆类: f.wi_1
 * 现代实现: cn.pokemmo.net.packet.inbound.TradeConfirmPacket
 */
public class wi_1 extends TradeConfirmPacket {

    public wi_1(k20_0 connection, ByteBuffer input) {
        super(connection, input);
    }
}
