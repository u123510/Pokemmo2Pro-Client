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

/*
 * Renamed from f.tU
 */
public class ClientOpcode025RequestPacket
extends RE {
    public final CH0 l60;
    public final short p20;

    public ClientOpcode025RequestPacket(CH0 cH0, short s) {
        super(25);
        this.l60 = cH0;
        this.p20 = s;
    }

    @Override
    public final void ig0(k20_0 k20_02, ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.l60.Sa);
        byteBuffer.putShort(this.p20);
    }
}

