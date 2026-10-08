package f;

import cn.pokemmo.net.packet.inbound.ClearWorldEntitiesPacket;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - ClearWorldEntitiesPacket
 * 操作码: 27
 * 原始混淆类: f.a4_0
 * 现代实现: cn.pokemmo.net.packet.inbound.ClearWorldEntitiesPacket
 */
public class a4_0 extends ClearWorldEntitiesPacket {

    public a4_0(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }
}
