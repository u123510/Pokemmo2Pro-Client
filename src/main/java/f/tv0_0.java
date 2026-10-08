package f;

import cn.pokemmo.net.packet.inbound.ServerOpcode085Packet;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - ServerOpcode085Packet
 * 操作码: 85
 * 原始混淆类: f.tv0_0
 * 现代实现: cn.pokemmo.net.packet.inbound.ServerOpcode085Packet
 */
public class tv0_0 extends ServerOpcode085Packet {

    public tv0_0(k20_0 source, ByteBuffer data) {
        super(source, data);
    }
}
