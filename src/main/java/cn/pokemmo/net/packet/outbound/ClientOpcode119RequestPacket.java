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
 * Renamed from f.bK
 */
public class ClientOpcode119RequestPacket
extends RE {
    public final CH0 u50;

    public ClientOpcode119RequestPacket(CH0 cH0) {
        super(119);
        this.u50 = cH0;
    }

    @Override
    public final void ig0(k20_0 k20_02, ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.u50.Sa);
    }
}

