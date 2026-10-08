package f;

import cn.pokemmo.net.packet.AbstractPayloadPacket;
import java.nio.ByteBuffer;

/**
 * 载荷编码出站数据包兼容垫片
 * 核心业务已重构迁移至 cn.pokemmo.net.packet.AbstractPayloadPacket
 */
public abstract class ZF0 extends AbstractPayloadPacket {

    public ZF0(int n) {
        super(n);
    }

    @Override
    public void writePayload(ByteBuffer buffer) {
        Q80(buffer);
    }

    @Override
    public abstract void Q80(ByteBuffer var1);
}
