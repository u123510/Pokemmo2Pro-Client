/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.packet.outbound;

import f.*;
import java.nio.ByteBuffer;

import f.RE;
import f.bo_1;
import f.k20_0;
import f.qe0_2;
import f.so_2;
import java.nio.ByteBuffer;

public class GuildActionRequestPacket
extends RE {
    public final String Ec0;
    public final byte Yo0;
    public final byte My0;
    public final qe0_2 Ka;

    public GuildActionRequestPacket(String string, byte by, byte by2, qe0_2 qe0_22) {
        super(3);
        this.Ec0 = string;
        this.Yo0 = by;
        this.My0 = by2;
        this.Ka = qe0_22;
    }

    @Override
    public final void ig0(k20_0 k20_02, ByteBuffer byteBuffer) {
        GuildActionRequestPacket mn0 = this;
        bo_1.cK(mn0.Ec0, byteBuffer);
        byteBuffer.put(mn0.Yo0);
        byteBuffer.put(this.My0);
        so_2.fb(byteBuffer, this.Ka);
    }
}

