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

public class ClientOpcode029RequestPacket
extends RE {
    public final CH0 GS;
    public final byte H50;

    public ClientOpcode029RequestPacket(byte by, CH0 cH0) {
        super(29);
        this.GS = cH0;
        this.H50 = by;
    }

    @Override
    public final void ig0(k20_0 k20_02, ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.GS.Sa);
        byteBuffer.put(this.H50);
    }
}

