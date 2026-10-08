package f;

import cn.pokemmo.net.packet.inbound.MonsterStatCalculatePacket;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - MonsterStatCalculatePacket
 * 操作码: 82
 * 原始混淆类: f.Y7
 * 现代实现: cn.pokemmo.net.packet.inbound.MonsterStatCalculatePacket
 */
public class Y7 extends MonsterStatCalculatePacket {

    public Y7(k20_0 source, ByteBuffer data) {
        super(source, data);
    }
}
