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

public class ClientOpcode209RequestPacket
extends RE {
    public final CH0 A4;

    public ClientOpcode209RequestPacket(CH0 cH0) {
        super(209);
        this.A4 = cH0;
    }

    @Override
    public final void ig0(k20_0 k20_02, ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.A4.Sa);
    }
}

