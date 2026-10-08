package f;

import cn.pokemmo.net.packet.inbound.MonsterHeldItemUpdatePacket;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - MonsterHeldItemUpdatePacket
 * 操作码: 98
 * 原始混淆类: f.SN
 * 现代实现: cn.pokemmo.net.packet.inbound.MonsterHeldItemUpdatePacket
 */
public class SN extends MonsterHeldItemUpdatePacket {

    public SN(k20_0 var1, ByteBuffer var2) {
        super(var1, var2);
    }
}
