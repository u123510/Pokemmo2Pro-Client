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
 * Renamed from f.dH
 */
public class ServerCapabilityPacket
extends BaseSystemProtocolPacket {
    public ServerCapabilityPacket() {
        super((byte)24);
    }

    @Override
    public final void hG(ByteBuffer byteBuffer) {
        byteBuffer.put(this.mG);
    }

    @Override
    public final boolean Ev0(CE cE, cq_0 cq_02) {
        return cE == null ? false : cE.pg();
    }
}

