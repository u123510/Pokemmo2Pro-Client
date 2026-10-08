/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.packet.outbound;

import f.*;
import java.nio.ByteBuffer;

import f.CH0;
import f.RE;
import f.k20_0;
import f.pg0_0;
import java.nio.ByteBuffer;

/*
 * Renamed from f.Eh
 */
public class ClientOpcode132RequestPacket
extends RE {
    public final CH0 lpt7;
    public final pg0_0 GX;

    public ClientOpcode132RequestPacket(CH0 cH0, pg0_0 pg0_02) {
        super(132);
        this.lpt7 = cH0;
        this.GX = pg0_02;
    }

    @Override
    public final void ig0(k20_0 k20_02, ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.lpt7.Sa);
        byteBuffer.put(this.GX.b8);
    }
}

