package f;

import cn.pokemmo.net.packet.protocol.SubProtocolHeaderPacket;

/**
 * 兼容垫片 (Shim) - 子协议数据包头部报文
 * 核心逻辑已迁移至 cn.pokemmo.net.packet.protocol.SubProtocolHeaderPacket
 */
public abstract class k1_0 extends SubProtocolHeaderPacket {
    public k1_0(byte i1, byte i2) {
        super(i1, i2);
    }
}
