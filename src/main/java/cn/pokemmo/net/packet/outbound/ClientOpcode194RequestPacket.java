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
 * Renamed from f.hL
 */
public class ClientOpcode194RequestPacket
extends RE {
    public final boolean BA0;
    public final long GG;

    public ClientOpcode194RequestPacket(long l, boolean bl) {
        super(194);
        this.BA0 = bl;
        this.GG = l;
    }

    @Override
    public final void ig0(k20_0 k20_02, ByteBuffer byteBuffer) {
        byteBuffer.put((byte)(this.BA0 ? 1 : 0));
        byteBuffer.putLong(this.GG);
    }
}

