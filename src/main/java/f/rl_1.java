package f;

import cn.pokemmo.net.packet.inbound.ServerOpcode192Packet;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - ServerOpcode192Packet
 * 操作码: 192
 * 原始混淆类: f.rl_1
 * 现代实现: cn.pokemmo.net.packet.inbound.ServerOpcode192Packet
 */
public class rl_1 extends ServerOpcode192Packet {

    public rl_1(k20_0 source, ByteBuffer data) {
        super(source, data);
    }
}
