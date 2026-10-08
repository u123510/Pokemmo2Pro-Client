package f;

import cn.pokemmo.net.packet.inbound.ServerOpcode064Packet;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - ServerOpcode064Packet
 * 操作码: 64
 * 原始混淆类: f.su_1
 * 现代实现: cn.pokemmo.net.packet.inbound.ServerOpcode064Packet
 */
public class su_1 extends ServerOpcode064Packet {

    public su_1(k20_0 source, ByteBuffer data) {
        super(source, data);
    }
}
