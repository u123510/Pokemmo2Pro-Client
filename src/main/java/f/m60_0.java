package f;

import cn.pokemmo.net.packet.outbound.TradeConfirmRequestPacket;
import java.nio.ByteBuffer;

/**
 * 客户端出站请求数据包垫片 - TradeConfirmRequestPacket
 * 操作码: 42
 * 原始混淆类: f.m60_0
 * 现代实现: cn.pokemmo.net.packet.outbound.TradeConfirmRequestPacket
 */
public class m60_0 extends TradeConfirmRequestPacket {

    public m60_0(short s, String string, String string2, boolean bl) {
        super(s, string, string2, bl);
    }
}
