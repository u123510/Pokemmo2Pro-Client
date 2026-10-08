package f;

import cn.pokemmo.net.packet.outbound.ClientOpcode156RequestPacket;
import java.nio.ByteBuffer;

/**
 * 客户端出站请求数据包垫片 - ClientOpcode156RequestPacket
 * 操作码: 156
 * 原始混淆类: f.vc_1
 * 现代实现: cn.pokemmo.net.packet.outbound.ClientOpcode156RequestPacket
 */
public class vc_1 extends ClientOpcode156RequestPacket {

    public vc_1(CH0 cH0, short s) {
        super(cH0, s);
    }
}
