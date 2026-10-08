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

public class ClientOpcode065RequestPacket
extends RE {
    public final CH0 Ri0;
    public final boolean c6;

    public ClientOpcode065RequestPacket(CH0 cH0, boolean bl) {
        super(65);
        this.Ri0 = cH0;
        this.c6 = bl;
    }

    @Override
    public final void ig0(k20_0 k20_02, ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.Ri0.Sa);
        byteBuffer.put((byte)(this.c6 ? 1 : 0));
    }
}

