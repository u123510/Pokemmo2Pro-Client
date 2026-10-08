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
 * Renamed from f.Yz
 */
public class ClientOpcode118RequestPacket
extends RE {
    public final CH0 Vt;

    public ClientOpcode118RequestPacket(CH0 cH0) {
        super(118);
        this.Vt = cH0;
    }

    @Override
    public final void ig0(k20_0 k20_02, ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.Vt.Sa);
    }
}

