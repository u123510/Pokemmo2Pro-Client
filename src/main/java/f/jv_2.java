package f;

import cn.pokemmo.net.packet.inbound.TradeRequestPacket;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - TradeRequestPacket
 * 操作码: 14
 * 原始混淆类: f.jv_2
 * 现代实现: cn.pokemmo.net.packet.inbound.TradeRequestPacket
 */
public class jv_2 extends TradeRequestPacket {

    public jv_2(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }
}
