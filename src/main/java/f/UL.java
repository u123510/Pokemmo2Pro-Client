package f;

import cn.pokemmo.net.packet.inbound.ServerOpcode134Packet;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - ServerOpcode134Packet
 * 操作码: 134
 * 原始混淆类: f.UL
 * 现代实现: cn.pokemmo.net.packet.inbound.ServerOpcode134Packet
 */
public class UL extends ServerOpcode134Packet {

    public UL(k20_0 var1, ByteBuffer var2) {
        super(var1, var2);
    }
}
