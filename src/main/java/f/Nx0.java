package f;

import cn.pokemmo.net.packet.outbound.ClientOpcode076RequestPacket;
import java.nio.ByteBuffer;

/**
 * 客户端出站请求数据包垫片 - ClientOpcode076RequestPacket
 * 操作码: 76
 * 原始混淆类: f.Nx0
 * 现代实现: cn.pokemmo.net.packet.outbound.ClientOpcode076RequestPacket
 */
public class Nx0 extends ClientOpcode076RequestPacket {

    public Nx0(int n) {
        super(n);
    }
    public Nx0(CH0 cH0, short s) {
        super(cH0, s);
    }
}
