package f;

import cn.pokemmo.net.packet.inbound.MovementUpdatePacket;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - MovementUpdatePacket
 * 操作码: 6
 * 原始混淆类: f.P60
 * 现代实现: cn.pokemmo.net.packet.inbound.MovementUpdatePacket
 */
public class P60 extends MovementUpdatePacket {

    public P60(k20_0 source, ByteBuffer buffer) {
        super(source, buffer);
    }
}
