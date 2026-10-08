package f;

import cn.pokemmo.net.packet.outbound.ClientOpcode016RequestPacket;
import java.nio.ByteBuffer;

/**
 * 客户端出站请求数据包垫片 - ClientOpcode016RequestPacket
 * 操作码: 16
 * 原始混淆类: f.rp_2
 * 现代实现: cn.pokemmo.net.packet.outbound.ClientOpcode016RequestPacket
 */
public class rp_2 extends ClientOpcode016RequestPacket {

    public rp_2(byte by) {
        super(by);
    }
}
