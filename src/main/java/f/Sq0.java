package f;

import cn.pokemmo.net.packet.outbound.ClientOpcode041RequestPacket;
import java.nio.ByteBuffer;

/**
 * 客户端出站请求数据包垫片 - ClientOpcode041RequestPacket
 * 操作码: 41
 * 原始混淆类: f.Sq0
 * 现代实现: cn.pokemmo.net.packet.outbound.ClientOpcode041RequestPacket
 */
public class Sq0 extends ClientOpcode041RequestPacket {

    public Sq0(CH0 cH0, ry_0 ry_02, byte by, qe0_2 qe0_22, byte by2) {
        super(cH0, ry_02, by, qe0_22, by2);
    }
}
