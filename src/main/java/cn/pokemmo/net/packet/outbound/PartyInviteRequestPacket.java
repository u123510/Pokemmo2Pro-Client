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
 * Renamed from f.dZ
 */
public class PartyInviteRequestPacket
extends RE {
    public final String TO;
    public final String em;

    public PartyInviteRequestPacket(String string, String string2) {
        super(128);
        this.TO = string;
        this.em = string2;
    }

    @Override
    public final void ig0(k20_0 k20_02, ByteBuffer byteBuffer) {
        PartyInviteRequestPacket dz_12 = this;
        bo_1.cK(dz_12.TO, byteBuffer);
        bo_1.cK(dz_12.em, byteBuffer);
    }
}

