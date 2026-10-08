package f;

import cn.pokemmo.net.packet.InboundPacket;
import java.nio.ByteBuffer;

/**
 * 客户端入站数据包兼容垫片
 * 核心业务已重构迁移至 cn.pokemmo.net.packet.InboundPacket
 */
public abstract class gl0_2 extends InboundPacket {

    public gl0_2(ByteBuffer byteBuffer, int i) {
        super(byteBuffer, i);
    }

    public gl0_2(int i) {
        super(i);
    }

    @Override
    public void decodePayload() {
        Oj0();
    }

    @Override
    public abstract void Oj0();

    @Override
    public void execute() {
        os0();
    }

    @Override
    public abstract void os0();
}
