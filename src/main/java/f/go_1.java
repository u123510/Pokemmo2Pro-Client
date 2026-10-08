package f;

import cn.pokemmo.net.packet.inbound.ServerOpcode042Packet;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - ServerOpcode042Packet
 * 操作码: 42
 * 原始混淆类: f.go_1
 * 现代实现: cn.pokemmo.net.packet.inbound.ServerOpcode042Packet
 */
public class go_1 extends ServerOpcode042Packet {

    public go_1(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }
}
