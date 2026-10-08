package f;

import cn.pokemmo.net.packet.inbound.ServerOpcode095Packet;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - ServerOpcode095Packet
 * 操作码: 95
 * 原始混淆类: f.I8
 * 现代实现: cn.pokemmo.net.packet.inbound.ServerOpcode095Packet
 */
public class I8 extends ServerOpcode095Packet {

    public I8(k20_0 source, ByteBuffer data) {
        super(source, data);
    }
}
