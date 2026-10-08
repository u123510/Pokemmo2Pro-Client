package f;

import cn.pokemmo.net.packet.inbound.ServerOpcode165Packet;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - ServerOpcode165Packet
 * 操作码: 165
 * 原始混淆类: f.fx_1
 * 现代实现: cn.pokemmo.net.packet.inbound.ServerOpcode165Packet
 */
public class fx_1 extends ServerOpcode165Packet {

    public fx_1(k20_0 source, ByteBuffer data) {
        super(source, data);
    }
}
