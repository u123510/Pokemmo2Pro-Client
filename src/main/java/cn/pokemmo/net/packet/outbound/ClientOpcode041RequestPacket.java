/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.packet.outbound;

import f.*;
import java.nio.ByteBuffer;

import f.CH0;
import f.RE;
import f.k20_0;
import f.qe0_2;
import f.ry_0;
import f.so_2;
import java.nio.ByteBuffer;

public class ClientOpcode041RequestPacket
extends RE {
    public final CH0 mn;
    public final ry_0 LX;
    public final byte eE;
    public final qe0_2 o60;
    public final byte tb0;

    public ClientOpcode041RequestPacket(CH0 cH0, ry_0 ry_02, byte by, qe0_2 qe0_22, byte by2) {
        super(41);
        this.mn = cH0;
        this.LX = ry_02;
        this.eE = by;
        this.o60 = qe0_22;
        this.tb0 = by2;
    }

    @Override
    public final void ig0(k20_0 k20_02, ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.mn.Sa);
        byteBuffer.put(this.LX.AH);
        byteBuffer.put(this.eE);
        so_2.fb(byteBuffer, this.o60);
        byteBuffer.put(this.tb0);
    }
}

