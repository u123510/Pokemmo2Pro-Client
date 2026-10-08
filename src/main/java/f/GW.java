package f;

import cn.pokemmo.net.packet.outbound.ClientOpcode168RequestPacket;
import java.nio.ByteBuffer;
import java.util.List;

/**
 * 客户端出站请求数据包垫片 - ClientOpcode168RequestPacket
 * 操作码: 168
 * 原始混淆类: f.GW
 * 现代实现: cn.pokemmo.net.packet.outbound.ClientOpcode168RequestPacket
 */
public class GW extends ClientOpcode168RequestPacket {

    public GW(boolean flag, List<lj0_2> values) {
        super(flag, values);
    }
}
