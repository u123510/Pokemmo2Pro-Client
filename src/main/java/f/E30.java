package f;

import cn.pokemmo.net.packet.outbound.ClientOpcode152RequestPacket;
import java.nio.ByteBuffer;

/**
 * 客户端出站请求数据包垫片 - ClientOpcode152RequestPacket
 * 操作码: 152
 * 原始混淆类: f.E30
 * 现代实现: cn.pokemmo.net.packet.outbound.ClientOpcode152RequestPacket
 */
public class E30 extends ClientOpcode152RequestPacket {

    public E30(CH0 id, byte flag, fb0_1 data, short value, byte mode) {
        super(id, flag, data, value, mode);
    }
}
