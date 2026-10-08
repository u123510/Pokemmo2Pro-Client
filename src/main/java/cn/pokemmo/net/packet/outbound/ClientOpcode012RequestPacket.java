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
 * Renamed from f.sj0
 */
public class ClientOpcode012RequestPacket
extends RE {
    public final CH0 ZS;

    public ClientOpcode012RequestPacket(CH0 cH0) {
        super(12);
        this.ZS = cH0;
    }

    @Override
    public final void ig0(k20_0 k20_02, ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.ZS.Sa);
    }
}

