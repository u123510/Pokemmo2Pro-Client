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

public class TournamentMatchRequestPacket
extends RE {
    public final String vv;
    public final String ov0;

    public TournamentMatchRequestPacket(String string, String string2) {
        super(96);
        this.vv = string;
        this.ov0 = string2;
    }

    @Override
    public final void ig0(k20_0 k20_02, ByteBuffer byteBuffer) {
        TournamentMatchRequestPacket t20 = this;
        bo_1.cK(t20.vv, byteBuffer);
        bo_1.cK(t20.ov0, byteBuffer);
    }
}

