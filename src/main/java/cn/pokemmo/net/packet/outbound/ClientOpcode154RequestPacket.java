/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.packet.outbound;

import f.*;
import java.nio.ByteBuffer;

import f.CH0;
import f.RE;
import f.k20_0;
import f.qd_0;
import java.nio.ByteBuffer;

/*
 * Renamed from f.dt0
 */
public class ClientOpcode154RequestPacket
extends RE {
    public final qd_0 iE0;
    public final CH0 DA0;
    public final int rF0;
    public final short Eh;

    public ClientOpcode154RequestPacket(qd_0 qd_02, CH0 cH0, int n, short s) {
        super(154);
        this.iE0 = qd_02;
        this.DA0 = cH0;
        this.rF0 = n;
        this.Eh = s;
    }

    @Override
    public final void ig0(k20_0 k20_02, ByteBuffer byteBuffer) {
        byteBuffer.put(this.iE0.xZ);
        byteBuffer.putLong(this.DA0.Sa);
        byteBuffer.putInt(this.rF0);
        byteBuffer.putShort(this.Eh);
    }
}

