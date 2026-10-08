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
 * Renamed from f.l0
 */
public class ClientOpcode157RequestPacket
extends RE {
    public final CH0 z4;

    public ClientOpcode157RequestPacket(CH0 cH0) {
        super(157);
        this.z4 = cH0;
    }

    @Override
    public final void ig0(k20_0 k20_02, ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.z4.Sa);
    }
}

