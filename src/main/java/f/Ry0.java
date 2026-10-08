package f;

import cn.pokemmo.net.packet.inbound.MonsterPartySyncPacket;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - MonsterPartySyncPacket
 * 操作码: 113
 * 原始混淆类: f.Ry0
 * 现代实现: cn.pokemmo.net.packet.inbound.MonsterPartySyncPacket
 */
public class Ry0 extends MonsterPartySyncPacket {

    public Ry0(k20_0 var1, ByteBuffer var2) {
        super(var1, var2);
    }
}
