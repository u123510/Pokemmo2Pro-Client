package f;

import cn.pokemmo.net.packet.inbound.MonsterStatusConditionPacket;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - MonsterStatusConditionPacket
 * 操作码: 21
 * 原始混淆类: f.R3
 * 现代实现: cn.pokemmo.net.packet.inbound.MonsterStatusConditionPacket
 */
public class R3 extends MonsterStatusConditionPacket {

    public R3(k20_0 source, ByteBuffer data) {
        super(source, data);
    }
}
