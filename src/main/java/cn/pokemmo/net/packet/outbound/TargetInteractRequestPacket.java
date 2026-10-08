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

public class TargetInteractRequestPacket
extends RE {
    public final CH0 Vw0;
    public final byte qN;
    public final short bH;

    public TargetInteractRequestPacket(CH0 cH0, byte by, short s) {
        super(10);
        this.Vw0 = cH0;
        this.qN = by;
        this.bH = s;
    }

    @Override
    public final void ig0(k20_0 k20_02, ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.Vw0.Sa);
        byteBuffer.put(this.qN);
        byteBuffer.putShort(this.bH);
    }
}

