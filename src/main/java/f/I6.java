package f;

import cn.pokemmo.net.packet.inbound.MonsterBoxStoragePacket;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - MonsterBoxStoragePacket
 * 操作码: 2
 * 原始混淆类: f.I6
 * 现代实现: cn.pokemmo.net.packet.inbound.MonsterBoxStoragePacket
 */
public class I6 extends MonsterBoxStoragePacket {

    public I6(k20_0 source, ByteBuffer data) {
        super(source, data);
    }
}
