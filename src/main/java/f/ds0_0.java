package f;

import cn.pokemmo.net.packet.inbound.ServerOpcode079Packet;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - ServerOpcode079Packet
 * 操作码: 79
 * 原始混淆类: f.ds0_0
 * 现代实现: cn.pokemmo.net.packet.inbound.ServerOpcode079Packet
 */
public class ds0_0 extends ServerOpcode079Packet {

    public ds0_0(k20_0 source, ByteBuffer data) {
        super(source, data);
    }
}
