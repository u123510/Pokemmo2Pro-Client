package f;

import cn.pokemmo.net.packet.inbound.TradeStateUpdatePacket;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - TradeStateUpdatePacket
 * 操作码: 15
 * 原始混淆类: f.lpt8__1
 * 现代实现: cn.pokemmo.net.packet.inbound.TradeStateUpdatePacket
 */
public class lpt8__1 extends TradeStateUpdatePacket {

    public lpt8__1(k20_0 source, ByteBuffer data) {
        super(source, data);
    }
}
