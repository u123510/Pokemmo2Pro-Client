package f;

import cn.pokemmo.net.packet.outbound.ClientOpcode115RequestPacket;
import java.nio.ByteBuffer;

/**
 * 客户端出站请求数据包垫片 - ClientOpcode115RequestPacket
 * 操作码: 115
 * 原始混淆类: f.cp_2
 * 现代实现: cn.pokemmo.net.packet.outbound.ClientOpcode115RequestPacket
 */
public class cp_2 extends ClientOpcode115RequestPacket {

    public cp_2(byte by, CH0 cH0, CH0 cH02) {
        super(by, cH0, cH02);
    }
}
