/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import f.GH;
import f.k20_0;
import java.nio.ByteBuffer;

public class ServerTimestampSyncPacket
extends GH {
    public int Sr;

    public ServerTimestampSyncPacket(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }

    @Override
    public final void Oj0() {
        this.Sr = this.Rj.getInt();
    }

    @Override
    public final void os0() {
        this.sr0().Cl.Lx0 = (int)(System.currentTimeMillis() / 1000L) + this.Sr;
    }
}

