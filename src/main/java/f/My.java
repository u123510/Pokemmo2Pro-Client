package f;

import cn.pokemmo.net.packet.outbound.ClientOpcode160RequestPacket;
import java.nio.ByteBuffer;

/**
 * 客户端出站请求数据包垫片 - ClientOpcode160RequestPacket
 * 操作码: 160
 * 原始混淆类: f.My
 * 现代实现: cn.pokemmo.net.packet.outbound.ClientOpcode160RequestPacket
 */
public class My extends ClientOpcode160RequestPacket {

    public My(String string) {
        super(string);
    }
}
