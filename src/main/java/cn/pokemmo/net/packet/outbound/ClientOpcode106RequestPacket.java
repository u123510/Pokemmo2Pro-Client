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
 * Renamed from f.Ye0
 */
public class ClientOpcode106RequestPacket
extends RE {
    public final boolean hB;

    public ClientOpcode106RequestPacket(boolean bl) {
        super(106);
        this.hB = bl;
    }

    @Override
    public final void ig0(k20_0 k20_02, ByteBuffer byteBuffer) {
        byteBuffer.put((byte)(this.hB ? 1 : 0));
    }
}

