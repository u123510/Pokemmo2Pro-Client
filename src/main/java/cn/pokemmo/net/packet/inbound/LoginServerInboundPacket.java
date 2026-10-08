package cn.pokemmo.net.packet.inbound;

import f.*;

/**
 * 登录服入站数据包抽象基类 (Login Server Inbound Packet)
 * 对应混淆类: f.uf_0
 */
public abstract class LoginServerInboundPacket extends gl0_2 implements Cloneable {
    public static final dl_1 LOGGER = Cq0.E1(LoginServerInboundPacket.class);
    public static final dl_1 Pn0 = LOGGER;

    public LoginServerInboundPacket(int opcode) {
        super(opcode);
    }

    @Override
    public void run() {
        try {
            this.os0();
        } catch (Throwable throwable) {
            LOGGER.warn("error handling ls ({}) message {}", ((ky_2) this.uk).ZM, this, throwable);
        }
    }
}
