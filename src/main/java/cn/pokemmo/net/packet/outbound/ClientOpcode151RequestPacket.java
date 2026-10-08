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
 * Renamed from f.mr
 */
public class ClientOpcode151RequestPacket
extends RE {
    public final CH0 sx;
    public final short aJ;

    public ClientOpcode151RequestPacket(CH0 cH0, short s) {
        super(151);
        this.sx = cH0;
        this.aJ = s;
    }

    @Override
    public final void ig0(k20_0 k20_02, ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.sx.Sa);
        byteBuffer.putShort(this.aJ);
    }
}

