package f;

import cn.pokemmo.net.packet.inbound.MonsterDetailDataPacket;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - MonsterDetailDataPacket
 * 操作码: 20
 * 原始混淆类: f.H60
 * 现代实现: cn.pokemmo.net.packet.inbound.MonsterDetailDataPacket
 */
public class H60 extends MonsterDetailDataPacket {

    public H60(k20_0 v1, ByteBuffer v2) {
        super(v1, v2);
    }
}
