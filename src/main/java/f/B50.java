package f;

import cn.pokemmo.net.packet.inbound.ServerOpcode152Packet;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - ServerOpcode152Packet
 * 操作码: 152
 * 原始混淆类: f.B50
 * 现代实现: cn.pokemmo.net.packet.inbound.ServerOpcode152Packet
 */
public class B50 extends ServerOpcode152Packet {

    public B50(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }
}
