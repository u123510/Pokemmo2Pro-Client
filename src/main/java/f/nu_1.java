package f;

import cn.pokemmo.net.packet.inbound.ServerOpcode034Packet;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - ServerOpcode034Packet
 * 操作码: 34
 * 原始混淆类: f.nu_1
 * 现代实现: cn.pokemmo.net.packet.inbound.ServerOpcode034Packet
 */
public class nu_1 extends ServerOpcode034Packet {

    public nu_1(k20_0 source, ByteBuffer data) {
        super(source, data);
    }
}
