package f;

import cn.pokemmo.net.packet.inbound.ResourceFileWritePacket;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - ResourceFileWritePacket
 * 操作码: 246
 * 原始混淆类: f.b8
 * 现代实现: cn.pokemmo.net.packet.inbound.ResourceFileWritePacket
 */
public class b8 extends ResourceFileWritePacket {

    public b8(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }
}
