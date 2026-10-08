package f;

import cn.pokemmo.net.packet.inbound.PlayerMoneyUpdatePacket;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - PlayerMoneyUpdatePacket
 * 操作码: 253
 * 原始混淆类: f.O9
 * 现代实现: cn.pokemmo.net.packet.inbound.PlayerMoneyUpdatePacket
 */
public class O9 extends PlayerMoneyUpdatePacket {

    public O9(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }
}
