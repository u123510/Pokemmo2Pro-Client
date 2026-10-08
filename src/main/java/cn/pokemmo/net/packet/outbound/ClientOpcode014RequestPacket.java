/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.packet.outbound;

import f.*;
import java.nio.ByteBuffer;

import f.CH0;
import f.RE;
import f.bo_1;
import f.k20_0;
import java.nio.ByteBuffer;

/*
 * Renamed from f.j4
 */
public class ClientOpcode014RequestPacket
extends RE {
    public final CH0 qx0;
    public final String Ke0;

    public ClientOpcode014RequestPacket(CH0 cH0, String string) {
        super(14);
        this.qx0 = cH0;
        this.Ke0 = string;
    }

    @Override
    public final void ig0(k20_0 k20_02, ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.qx0.Sa);
        bo_1.cK(this.Ke0, byteBuffer);
    }
}

