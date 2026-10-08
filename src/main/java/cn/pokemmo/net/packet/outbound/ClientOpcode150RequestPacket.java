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
 * Renamed from f.dJ0
 */
public class ClientOpcode150RequestPacket
extends RE {
    public final CH0 vu;

    public ClientOpcode150RequestPacket(CH0 cH0) {
        super(150);
        this.vu = cH0;
    }

    @Override
    public final void ig0(k20_0 k20_02, ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.vu.Sa);
    }
}

