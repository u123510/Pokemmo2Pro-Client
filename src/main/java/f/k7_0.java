package f;

import cn.pokemmo.net.packet.inbound.MonsterStorageMovePacket;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - MonsterStorageMovePacket
 * 操作码: 3
 * 原始混淆类: f.k7_0
 * 现代实现: cn.pokemmo.net.packet.inbound.MonsterStorageMovePacket
 */
public class k7_0 extends MonsterStorageMovePacket {

    public k7_0(k20_0 source, ByteBuffer data) {
        super(source, data);
    }
}
