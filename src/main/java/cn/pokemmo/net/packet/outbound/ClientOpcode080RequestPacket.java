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
 * Renamed from f.eD0
 */
public class ClientOpcode080RequestPacket
extends RE {
    public final byte Pr0;

    public ClientOpcode080RequestPacket(byte by) {
        super(80);
        this.Pr0 = by;
    }

    @Override
    public final void ig0(k20_0 k20_02, ByteBuffer byteBuffer) {
        byteBuffer.put(this.Pr0);
    }
}

