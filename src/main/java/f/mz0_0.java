package f;

import cn.pokemmo.net.packet.inbound.ServerOpcode046Packet;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - ServerOpcode046Packet
 * 操作码: 46
 * 原始混淆类: f.mz0_0
 * 现代实现: cn.pokemmo.net.packet.inbound.ServerOpcode046Packet
 */
public class mz0_0 extends ServerOpcode046Packet {

    public mz0_0(k20_0 source, ByteBuffer data) {
        super(source, data);
    }
}
