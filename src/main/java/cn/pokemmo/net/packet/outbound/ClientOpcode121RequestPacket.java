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
 * Renamed from f.cw
 */
public class ClientOpcode121RequestPacket
extends RE {
    public final byte bP;
    public final byte hR;
    public final CH0 Dy;

    public ClientOpcode121RequestPacket(byte by, byte by2, CH0 cH0) {
        super(121);
        this.bP = by;
        this.hR = by2;
        this.Dy = cH0;
    }

    @Override
    public final void ig0(k20_0 k20_02, ByteBuffer byteBuffer) {
        byteBuffer.put(this.bP);
        byteBuffer.put(this.hR);
        byteBuffer.putLong(this.Dy.Sa);
    }
}

