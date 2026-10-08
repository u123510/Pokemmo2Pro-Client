package f;

import cn.pokemmo.net.packet.outbound.ClientOpcode075RequestPacket;
import java.nio.ByteBuffer;

/**
 * 客户端出站请求数据包垫片 - ClientOpcode075RequestPacket
 * 操作码: 75
 * 原始混淆类: f.ZI
 * 现代实现: cn.pokemmo.net.packet.outbound.ClientOpcode075RequestPacket
 */
public class ZI extends ClientOpcode075RequestPacket {

    public ZI(byte by, String string) {
        super(by, string);
    }
}
