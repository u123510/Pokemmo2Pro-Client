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

public class ClientOpcode057RequestPacket
extends RE {
    public final CH0 F7;
    public final short ka0;

    public ClientOpcode057RequestPacket(CH0 cH0, short s) {
        super(57);
        this.F7 = cH0;
        this.ka0 = s;
    }

    @Override
    public final void ig0(k20_0 k20_02, ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.F7.Sa);
        byteBuffer.putShort(this.ka0);
    }
}

