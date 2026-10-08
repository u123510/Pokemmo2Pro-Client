package f;

import cn.pokemmo.net.packet.outbound.TradeOfferItemRequestPacket;
import java.nio.ByteBuffer;

/**
 * 客户端出站请求数据包垫片 - TradeOfferItemRequestPacket
 * 操作码: 20
 * 原始混淆类: f.BW
 * 现代实现: cn.pokemmo.net.packet.outbound.TradeOfferItemRequestPacket
 */
public class BW extends TradeOfferItemRequestPacket {

    public BW(CH0 cH0, short s, CH0 cH02, CH0 cH03) {
        super(cH0, s, cH02, cH03);
    }
}
