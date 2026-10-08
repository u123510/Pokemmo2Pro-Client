package f;

import cn.pokemmo.net.packet.inbound.PlayDurationUpdatePacket;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - PlayDurationUpdatePacket
 * 操作码: 217
 * 原始混淆类: f.c40
 * 现代实现: cn.pokemmo.net.packet.inbound.PlayDurationUpdatePacket
 */
public class c40 extends PlayDurationUpdatePacket {

    public c40(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }
}
