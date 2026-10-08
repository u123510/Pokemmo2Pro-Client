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
 * Renamed from f.yP
 */
public class ClientOpcode133RequestPacket
extends RE {
    public final CH0 Vi0;

    public ClientOpcode133RequestPacket(CH0 cH0) {
        super(133);
        this.Vi0 = cH0;
    }

    @Override
    public final void ig0(k20_0 k20_02, ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.Vi0.Sa);
    }
}

