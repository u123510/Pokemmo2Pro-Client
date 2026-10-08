package f;

import cn.pokemmo.net.packet.inbound.MapRomDataPacket;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - MapRomDataPacket
 * 操作码: 16
 * 原始混淆类: f.Sb
 * 现代实现: cn.pokemmo.net.packet.inbound.MapRomDataPacket
 */
public class Sb extends MapRomDataPacket {

    public Sb(k20_0 var1, ByteBuffer var2) {
        super(var1, var2);
    }
}
