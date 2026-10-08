package f;

import cn.pokemmo.net.packet.inbound.ServerOpcode193Packet;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - ServerOpcode193Packet
 * 操作码: 193
 * 原始混淆类: f.S5
 * 现代实现: cn.pokemmo.net.packet.inbound.ServerOpcode193Packet
 */
public class S5 extends ServerOpcode193Packet {

    public S5(k20_0 var1, ByteBuffer var2) {
        super(var1, var2);
    }
}
