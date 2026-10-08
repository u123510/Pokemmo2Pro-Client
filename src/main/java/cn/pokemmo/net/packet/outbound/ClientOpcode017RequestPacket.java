/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.packet.outbound;

import f.*;
import java.nio.ByteBuffer;

import f.RE;
import f.k20_0;
import java.nio.ByteBuffer;

public class ClientOpcode017RequestPacket
extends RE {
    public final byte m9;
    public final long bY;

    public ClientOpcode017RequestPacket(byte by, long l) {
        super(17);
        this.m9 = by;
        this.bY = l;
    }

    @Override
    public final void ig0(k20_0 k20_02, ByteBuffer byteBuffer) {
        byteBuffer.put(this.m9);
        byteBuffer.putLong(this.bY);
    }
}

