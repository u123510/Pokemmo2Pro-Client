package f;

import cn.pokemmo.net.packet.outbound.ClientOpcode161RequestPacket;
import java.nio.ByteBuffer;

/**
 * 客户端出站请求数据包垫片 - ClientOpcode161RequestPacket
 * 操作码: 161
 * 原始混淆类: f.H6
 * 现代实现: cn.pokemmo.net.packet.outbound.ClientOpcode161RequestPacket
 */
public class H6 extends ClientOpcode161RequestPacket {

    public H6(String string) {
        super(string);
    }
}
