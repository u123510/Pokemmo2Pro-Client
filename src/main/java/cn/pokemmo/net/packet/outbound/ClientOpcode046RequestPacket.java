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
 * Renamed from f.Tg0
 */
public class ClientOpcode046RequestPacket
extends RE {
    public final CH0 aG;
    public final CH0 R20;

    public ClientOpcode046RequestPacket(CH0 cH0, CH0 cH02) {
        super(46);
        this.aG = cH0;
        this.R20 = cH02;
    }

    @Override
    public final void ig0(k20_0 k20_02, ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.aG.Sa);
        byteBuffer.putLong(this.R20.Sa);
    }
}

