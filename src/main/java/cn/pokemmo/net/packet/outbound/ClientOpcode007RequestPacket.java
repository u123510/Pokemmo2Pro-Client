/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.packet.outbound;

import f.*;
import java.nio.ByteBuffer;

import f.RE;
import f.k20_0;
import java.nio.ByteBuffer;

public class ClientOpcode007RequestPacket
extends RE {
    public final byte mF;

    public ClientOpcode007RequestPacket(byte by) {
        super(7);
        this.mF = by;
    }

    @Override
    public final void ig0(k20_0 k20_02, ByteBuffer byteBuffer) {
        byteBuffer.put(this.mF);
    }
}

