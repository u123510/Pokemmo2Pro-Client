package f;

import cn.pokemmo.net.packet.inbound.TradeCompletePacket;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - TradeCompletePacket
 * 操作码: 18
 * 原始混淆类: f.b0_0
 * 现代实现: cn.pokemmo.net.packet.inbound.TradeCompletePacket
 */
public class b0_0 extends TradeCompletePacket {

    public b0_0(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }
}
