/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.packet.outbound;

import f.*;
import java.nio.ByteBuffer;

import f.CH0;
import f.RE;
import f.k20_0;
import java.nio.ByteBuffer;

/*
 * Renamed from f.f2
 */
public class ClientOpcode011RequestPacket
extends RE {
    public final CH0 Hv0;
    public final boolean wv0;

    public ClientOpcode011RequestPacket(CH0 cH0, boolean bl) {
        super(11);
        this.Hv0 = cH0;
        this.wv0 = bl;
    }

    @Override
    public final void ig0(k20_0 k20_02, ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.Hv0.Sa);
        byteBuffer.put((byte)(this.wv0 ? 1 : 0));
    }
}

