package cn.pokemmo.net.packet.protocol;

import f.Mg;
import java.nio.ByteBuffer;

/**
 * 子协议数据包头部报文
 * 原始类: f.k1_0
 */
public abstract class SubProtocolHeaderPacket extends Mg {
    public final byte HU;

    public SubProtocolHeaderPacket(byte i1, byte i2) {
        super(i1);
        this.HU = i2;
    }

    public final int ha() {
        return this.HU;
    }

    public final void hG(ByteBuffer v1) {
        v1.put(this.mG);
        v1.put(this.HU);
    }
}
