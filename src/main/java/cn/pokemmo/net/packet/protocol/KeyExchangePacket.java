/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.packet.protocol;

import f.*;

import f.CE;
import f.Mg;
import f.cq_0;
import java.nio.ByteBuffer;

/*
 * Renamed from f.Kg0
 */
public class KeyExchangePacket
extends BaseSystemProtocolPacket {
    public KeyExchangePacket() {
        super((byte)22);
    }

    @Override
    public final boolean Ev0(CE cE, cq_0 cq_02) {
        return cE.Yb0 != 132;
    }

    @Override
    public final void hG(ByteBuffer byteBuffer) {
        byteBuffer.put(this.mG);
    }
}

