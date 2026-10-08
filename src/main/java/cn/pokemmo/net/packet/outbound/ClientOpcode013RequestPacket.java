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
 * Renamed from f.s20
 */
public class ClientOpcode013RequestPacket
extends RE {
    public final CH0 cOn;
    public final byte vF0;
    public final byte Rd0;

    public ClientOpcode013RequestPacket(byte by, byte by2, CH0 cH0) {
        super(13);
        this.cOn = cH0;
        this.vF0 = by;
        this.Rd0 = by2;
    }

    @Override
    public final void ig0(k20_0 k20_02, ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.cOn.Sa);
        byteBuffer.put(this.vF0);
        byteBuffer.put(this.Rd0);
    }
}

