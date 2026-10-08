/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.packet.outbound;

import f.*;
import java.nio.ByteBuffer;

import f.RE;
import f.k20_0;
import f.k80_0;
import java.nio.ByteBuffer;

/*
 * Renamed from f.q7
 */
public class ClientOpcode116RequestPacket
extends RE {
    public final k80_0 rw0;

    public ClientOpcode116RequestPacket(k80_0 k80_02) {
        super(116);
        this.rw0 = k80_02;
    }

    @Override
    public final void ig0(k20_0 k20_02, ByteBuffer byteBuffer) {
        byteBuffer.put(this.rw0.GH0);
    }
}

