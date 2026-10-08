package f;

import cn.pokemmo.net.packet.inbound.ServerOpcode243Packet;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - ServerOpcode243Packet
 * 操作码: 243
 * 原始混淆类: f.NW
 * 现代实现: cn.pokemmo.net.packet.inbound.ServerOpcode243Packet
 */
public class NW extends ServerOpcode243Packet {

    public NW(k20_0 source, ByteBuffer data) {
        super(source, data);
    }
}
