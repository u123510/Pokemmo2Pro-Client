package f;

import cn.pokemmo.net.packet.inbound.ServerOpcode109Packet;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - ServerOpcode109Packet
 * 操作码: 109
 * 原始混淆类: f.Vr
 * 现代实现: cn.pokemmo.net.packet.inbound.ServerOpcode109Packet
 */
public class Vr extends ServerOpcode109Packet {

    public Vr(k20_0 var1, ByteBuffer var2) {
        super(var1, var2);
    }
}
