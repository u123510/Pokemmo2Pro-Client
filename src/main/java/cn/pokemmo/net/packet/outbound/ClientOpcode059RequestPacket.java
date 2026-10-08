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

public class ClientOpcode059RequestPacket
extends RE {
    public final CH0 ew;
    public final CH0 aux;

    public ClientOpcode059RequestPacket(CH0 cH0, CH0 cH02) {
        super(59);
        this.ew = cH0;
        this.aux = cH02;
    }

    @Override
    public final void ig0(k20_0 k20_02, ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.ew.Sa);
        byteBuffer.putLong(this.aux.Sa);
    }
}

