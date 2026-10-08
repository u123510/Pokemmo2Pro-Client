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
 * Renamed from f.vc
 */
public class ClientOpcode156RequestPacket
extends RE {
    public final CH0 Gh0;
    public final short sb;

    public ClientOpcode156RequestPacket(CH0 cH0, short s) {
        super(156);
        this.Gh0 = cH0;
        this.sb = s;
    }

    @Override
    public final void ig0(k20_0 k20_02, ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.Gh0.Sa);
        byteBuffer.putShort(this.sb);
    }
}

