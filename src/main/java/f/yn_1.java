package f;

import cn.pokemmo.net.packet.inbound.ServerOpcode184Packet;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - ServerOpcode184Packet
 * 操作码: 184
 * 原始混淆类: f.yn_1
 * 现代实现: cn.pokemmo.net.packet.inbound.ServerOpcode184Packet
 */
public class yn_1 extends ServerOpcode184Packet {

    public yn_1(k20_0 source, ByteBuffer data) {
        super(source, data);
    }
}
