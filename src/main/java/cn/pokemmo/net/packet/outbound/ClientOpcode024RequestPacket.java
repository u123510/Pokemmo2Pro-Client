/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.packet.outbound;

import f.*;
import java.nio.ByteBuffer;

import f.CH0;
import f.QL;
import f.RE;
import f.k20_0;
import java.nio.ByteBuffer;

/*
 * Renamed from f.fN
 */
public class ClientOpcode024RequestPacket
extends RE {
    public final CH0 jb0;
    public final QL ft0;

    public ClientOpcode024RequestPacket(CH0 cH0, QL qL) {
        super(24);
        this.jb0 = cH0;
        this.ft0 = qL;
    }

    @Override
    public final void ig0(k20_0 k20_02, ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.jb0.Sa);
        byteBuffer.put(this.ft0.D7);
    }
}

