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
 * Renamed from f.wY
 */
public class ClientOpcode043RequestPacket
extends RE {
    public final CH0 lF0;
    public final String lb0;

    public ClientOpcode043RequestPacket(CH0 cH0, String string) {
        super(43);
        this.lF0 = cH0;
        this.lb0 = string;
    }

    @Override
    public final void ig0(k20_0 k20_02, ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.lF0.Sa);
        bo_1.cK(this.lb0, byteBuffer);
    }
}

