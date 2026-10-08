package f;

import cn.pokemmo.net.packet.inbound.ServerOpcode185Packet;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - ServerOpcode185Packet
 * 操作码: 185
 * 原始混淆类: f.Q6
 * 现代实现: cn.pokemmo.net.packet.inbound.ServerOpcode185Packet
 */
public class Q6 extends ServerOpcode185Packet {

    public Q6(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }
}
