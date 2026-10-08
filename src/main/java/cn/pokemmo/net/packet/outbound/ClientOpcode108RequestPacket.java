/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.packet.outbound;

import f.*;
import java.nio.ByteBuffer;

import f.G50;
import f.RE;
import f.k20_0;
import java.nio.ByteBuffer;

public class ClientOpcode108RequestPacket
extends RE {
    public final G50[] v7;

    public ClientOpcode108RequestPacket(G50[] g50Array) {
        super(108);
        this.v7 = g50Array;
    }

    @Override
    public final void ig0(k20_0 k20_02, ByteBuffer byteBuffer) {
        byteBuffer.put((byte)this.v7.length);
        int n = 0;
        while (true) {
            G50[] g50Array = this.v7;
            if (n >= this.v7.length) break;
            byteBuffer.put(g50Array[n].Sf0);
            ++n;
        }
    }
}

