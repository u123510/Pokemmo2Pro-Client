/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.packet.outbound;

import f.*;
import java.nio.ByteBuffer;

import f.RE;
import f.bo_1;
import f.k20_0;
import java.nio.ByteBuffer;

/*
 * Renamed from f.fU
 */
public class ClientOpcode022RequestPacket
extends RE {
    public final boolean Ym;
    public final String zV;

    public ClientOpcode022RequestPacket(String string, boolean bl) {
        super(22);
        this.Ym = bl;
        this.zV = string;
    }

    @Override
    public final void ig0(k20_0 k20_02, ByteBuffer byteBuffer) {
        byteBuffer.put((byte)((this.Ym ? 1 : 0) ^ 1));
        bo_1.cK(this.zV, byteBuffer);
    }
}

