package f;

import cn.pokemmo.net.packet.inbound.ServerOpcode160Packet;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - ServerOpcode160Packet
 * 操作码: 160
 * 原始混淆类: f.nd0_2
 * 现代实现: cn.pokemmo.net.packet.inbound.ServerOpcode160Packet
 */
public class nd0_2 extends ServerOpcode160Packet {

    public nd0_2(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }
}
