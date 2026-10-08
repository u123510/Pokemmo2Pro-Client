/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.packet.outbound;

import f.*;
import java.nio.ByteBuffer;

import f.RE;
import f.k20_0;
import java.nio.ByteBuffer;

/*
 * Renamed from f.vE0
 */
public class ClientOpcode018RequestPacket
extends RE {
    public final byte dM;
    public final boolean A50;

    public ClientOpcode018RequestPacket(byte by, boolean bl) {
        super(18);
        this.dM = by;
        this.A50 = bl;
    }

    @Override
    public final void ig0(k20_0 k20_02, ByteBuffer byteBuffer) {
        byteBuffer.put(this.dM);
        byteBuffer.put((byte)(this.A50 ? 1 : 0));
    }
}

