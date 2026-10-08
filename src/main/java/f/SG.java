package f;

import cn.pokemmo.net.packet.inbound.ServerOpcode058Packet;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - ServerOpcode058Packet
 * 操作码: 58
 * 原始混淆类: f.SG
 * 现代实现: cn.pokemmo.net.packet.inbound.ServerOpcode058Packet
 */
public class SG extends ServerOpcode058Packet {

    public SG(k20_0 var1, ByteBuffer var2) {
        super(var1, var2);
    }
}
