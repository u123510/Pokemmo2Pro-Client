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
 * Renamed from f.aM
 */
public class ClientOpcode117RequestPacket
extends RE {
    public final byte Kj;
    public final boolean sC;
    public final short Jl0;

    public ClientOpcode117RequestPacket(short s, byte by, boolean bl) {
        super(117);
        this.Kj = by;
        this.sC = bl;
        this.Jl0 = s;
    }

    @Override
    public final void ig0(k20_0 k20_02, ByteBuffer byteBuffer) {
        byteBuffer.put(this.Kj);
        byteBuffer.put((byte)(this.sC ? 1 : 0));
        byteBuffer.putShort(this.Jl0);
    }
}

