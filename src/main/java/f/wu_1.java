package f;

import cn.pokemmo.net.packet.inbound.ServerOpcode122Packet;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - ServerOpcode122Packet
 * 操作码: 122
 * 原始混淆类: f.wu_1
 * 现代实现: cn.pokemmo.net.packet.inbound.ServerOpcode122Packet
 */
public class wu_1 extends ServerOpcode122Packet {

    public wu_1(k20_0 source, ByteBuffer data) {
        super(source, data);
    }
}
