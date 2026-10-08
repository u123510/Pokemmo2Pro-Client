package f;

import cn.pokemmo.net.packet.outbound.ClientOpcode035RequestPacket;
import java.nio.ByteBuffer;

/**
 * 客户端出站请求数据包垫片 - ClientOpcode035RequestPacket
 * 操作码: 35
 * 原始混淆类: f.px0_0
 * 现代实现: cn.pokemmo.net.packet.outbound.ClientOpcode035RequestPacket
 */
public class px0_0 extends ClientOpcode035RequestPacket {

    public px0_0(byte by, short s, short s2) {
        super(by, s, s2);
    }
}
