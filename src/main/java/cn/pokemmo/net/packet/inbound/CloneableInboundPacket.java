package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

/**
 * 支持克隆的入站数据包抽象基类 (Cloneable Inbound Packet)
 * 对应混淆类: f.Ey0
 */
public abstract class CloneableInboundPacket extends gl0_2 implements Cloneable {
    public static final dl_1 LOGGER = Cq0.E1(CloneableInboundPacket.class);
    public static final dl_1 kn0 = LOGGER;

    public CloneableInboundPacket(TX owner, ByteBuffer buffer) {
        super(buffer, 0);
        this.VR(owner);
    }

    @Override
    public void run() {
        try {
            this.os0();
        } catch (Throwable throwable) {
            kn0.warn(this.toString(), throwable);
        }
    }

    public void iw0() {
    }
}
