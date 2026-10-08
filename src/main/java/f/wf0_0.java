package f;

import cn.pokemmo.net.packet.inbound.ServerOpcode076Packet;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - ServerOpcode076Packet
 * 操作码: 76
 * 原始混淆类: f.wf0_0
 * 现代实现: cn.pokemmo.net.packet.inbound.ServerOpcode076Packet
 */
public class wf0_0 extends ServerOpcode076Packet {

    public wf0_0(k20_0 source, ByteBuffer data) {
        super(source, data);
    }
}
