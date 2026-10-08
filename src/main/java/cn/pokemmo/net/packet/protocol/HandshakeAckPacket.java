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
 * Renamed from f.b5
 */
public class HandshakeAckPacket
extends BaseSystemProtocolPacket {
    public final short Iw;

    public HandshakeAckPacket(short s) {
        super((byte)20);
        this.Iw = s;
    }

    @Override
    public final boolean Ev0(CE cE, cq_0 cq_02) {
        return cq_02.Lh(cE.Xn0) == this.Iw;
    }

    @Override
    public final void hG(ByteBuffer byteBuffer) {
        byteBuffer.put(this.mG);
        byteBuffer.putShort(this.Iw);
    }
}

