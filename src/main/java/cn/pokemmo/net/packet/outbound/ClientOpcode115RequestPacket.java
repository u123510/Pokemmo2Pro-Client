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
 * Renamed from f.cp
 */
public class ClientOpcode115RequestPacket
extends RE {
    public final CH0 K0;
    public final CH0 Ao0;
    public final byte oy;

    public ClientOpcode115RequestPacket(byte by, CH0 cH0, CH0 cH02) {
        super(115);
        this.K0 = cH0;
        this.Ao0 = cH02;
        this.oy = by;
    }

    @Override
    public final void ig0(k20_0 k20_02, ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.K0.Sa);
        byteBuffer.putLong(this.Ao0.Sa);
        byteBuffer.put(this.oy);
    }
}

