package f;

import cn.pokemmo.net.packet.inbound.ServerOpcode118Packet;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - ServerOpcode118Packet
 * 操作码: 118
 * 原始混淆类: f.wb0_1
 * 现代实现: cn.pokemmo.net.packet.inbound.ServerOpcode118Packet
 */
public class wb0_1 extends ServerOpcode118Packet {

    public wb0_1(k20_0 source, ByteBuffer data) {
        super(source, data);
    }
}
