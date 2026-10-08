package f;

import cn.pokemmo.net.packet.outbound.ClientOpcode225RequestPacket;
import java.nio.ByteBuffer;

/**
 * 客户端出站请求数据包垫片 - ClientOpcode225RequestPacket
 * 操作码: 225
 * 原始混淆类: f.m2_0
 * 现代实现: cn.pokemmo.net.packet.outbound.ClientOpcode225RequestPacket
 */
public class m2_0 extends ClientOpcode225RequestPacket {

    public m2_0(byte by, byte by2, byte by3, py_1 py_12, short s) {
        super(by, by2, by3, py_12, s);
    }
}
