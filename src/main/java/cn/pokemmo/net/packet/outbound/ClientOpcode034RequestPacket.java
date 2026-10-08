/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.packet.outbound;

import f.*;
import java.nio.ByteBuffer;

import f.CH0;
import f.RE;
import f.Gf;
import f.k20_0;
import java.nio.ByteBuffer;

/*
 * Renamed from f.cB
 */
public class ClientOpcode034RequestPacket
extends RE {
    public final CH0 ss;

    public ClientOpcode034RequestPacket(CH0 cH0) {
        super(34);
        this.ss = cH0;
    }

    @Override
    public final void ig0(k20_0 k20_02, ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.ss.Sa);
        byteBuffer.putLong(Gf.jb(this.ss.hashCode()));
    }
}

