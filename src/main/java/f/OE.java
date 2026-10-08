package f;

import cn.pokemmo.net.packet.protocol.GamePacketHandler;

/**
 * 兼容垫片 (Shim) - 游戏网络数据包协议处理器 (Game Packet Handler)
 * 实际实现已迁移至 {@link GamePacketHandler}
 */
public final class OE extends GamePacketHandler {
    public OE(ni0_2 ni0_22) {
        super(ni0_22);
    }
}
