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
 * Renamed from f.Nh
 */
public class ClientOpcode131RequestPacket
extends RE {
    public final String do0;

    public ClientOpcode131RequestPacket(String string) {
        super(131);
        this.do0 = string;
    }

    @Override
    public final void ig0(k20_0 k20_02, ByteBuffer byteBuffer) {
        bo_1.cK(this.do0, byteBuffer);
    }
}

