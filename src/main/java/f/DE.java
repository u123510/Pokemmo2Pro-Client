package f;

import cn.pokemmo.net.packet.inbound.EntityDespawnPacket;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - EntityDespawnPacket
 * 操作码: 7
 * 原始混淆类: f.DE
 * 现代实现: cn.pokemmo.net.packet.inbound.EntityDespawnPacket
 */
public class DE extends EntityDespawnPacket {

    public DE(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }
}
