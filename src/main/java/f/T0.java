package f;

import cn.pokemmo.net.packet.inbound.ServerOpcode043Packet;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - ServerOpcode043Packet
 * 操作码: 43
 * 原始混淆类: f.T0
 * 现代实现: cn.pokemmo.net.packet.inbound.ServerOpcode043Packet
 */
public class T0 extends ServerOpcode043Packet {

    public T0(k20_0 connection, ByteBuffer data) {
        super(connection, data);
    }
}
