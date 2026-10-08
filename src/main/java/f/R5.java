package f;

import cn.pokemmo.net.packet.outbound.ClientOpcode045RequestPacket;
import java.nio.ByteBuffer;

/**
 * 客户端出站请求数据包垫片 - ClientOpcode045RequestPacket
 * 操作码: 45
 * 原始混淆类: f.R5
 * 现代实现: cn.pokemmo.net.packet.outbound.ClientOpcode045RequestPacket
 */
public class R5 extends ClientOpcode045RequestPacket {

    public R5(MO first, MO second, byte type) {
        super(first, second, type);
    }
}
