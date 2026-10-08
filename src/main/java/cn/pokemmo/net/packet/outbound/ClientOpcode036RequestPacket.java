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
 * Renamed from f.Wk
 */
public class ClientOpcode036RequestPacket
extends RE {
    public final CH0 T20;
    public final short Dn;

    public ClientOpcode036RequestPacket(CH0 cH0, short s) {
        super(36);
        this.T20 = cH0;
        this.Dn = s;
    }

    @Override
    public final void ig0(k20_0 k20_02, ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.T20.Sa);
        byteBuffer.putShort(this.Dn);
    }
}

