package f;

import cn.pokemmo.net.packet.inbound.CloneableInboundPacket;
import java.nio.ByteBuffer;

/**
 * 可克隆入站数据包兼容门面
 * 核心实现已迁移至 cn.pokemmo.net.packet.inbound.CloneableInboundPacket
 */
public abstract class Ey0 extends CloneableInboundPacket {

    public Ey0(TX owner, ByteBuffer buffer) {
        super(owner, buffer);
    }
}
