package f;

import cn.pokemmo.net.packet.outbound.ClientOpcode040RequestPacket;
import java.nio.ByteBuffer;

/**
 * 客户端出站请求数据包垫片 - ClientOpcode040RequestPacket
 * 操作码: 40
 * 原始混淆类: f.L7
 * 现代实现: cn.pokemmo.net.packet.outbound.ClientOpcode040RequestPacket
 */
public class L7 extends ClientOpcode040RequestPacket {

    public L7(byte by, byte[] byArray) {
        super(by, byArray);
    }
}
