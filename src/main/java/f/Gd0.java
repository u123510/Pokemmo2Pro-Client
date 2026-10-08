package f;

import cn.pokemmo.net.packet.inbound.MonsterPartyListPacket;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - MonsterPartyListPacket
 * 操作码: 19
 * 原始混淆类: f.Gd0
 * 现代实现: cn.pokemmo.net.packet.inbound.MonsterPartyListPacket
 */
public class Gd0 extends MonsterPartyListPacket {

    public Gd0(k20_0 source, ByteBuffer data) {
        super(source, data);
    }
}
