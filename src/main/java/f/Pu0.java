package f;

import cn.pokemmo.net.packet.outbound.ClientOpcode135RequestPacket;
import java.nio.ByteBuffer;

/**
 * 客户端出站请求数据包垫片 - ClientOpcode135RequestPacket
 * 操作码: 135
 * 原始混淆类: f.Pu0
 * 现代实现: cn.pokemmo.net.packet.outbound.ClientOpcode135RequestPacket
 */
public class Pu0 extends ClientOpcode135RequestPacket {

    public Pu0(CH0 var1, boolean var2) {
        super(var1, var2);
    }
}
