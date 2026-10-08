package f;

import cn.pokemmo.net.packet.inbound.TradeStatusPromptPacket;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - TradeStatusPromptPacket
 * 操作码: 84
 * 原始混淆类: f.jv_0
 * 现代实现: cn.pokemmo.net.packet.inbound.TradeStatusPromptPacket
 */
public class jv_0 extends TradeStatusPromptPacket {

    public jv_0(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }
}
