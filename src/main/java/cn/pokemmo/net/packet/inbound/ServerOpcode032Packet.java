/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import f.GH;
import f.c8_0;
import f.k20_0;
import java.nio.ByteBuffer;

/*
 * Renamed from f.lL
 */
public class ServerOpcode032Packet
extends GH {
    public int bv;

    public ServerOpcode032Packet(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }

    @Override
    public final void Oj0() {
        this.bv = this.Rj.getInt();
    }

    @Override
    public final void os0() {
        c8_0.JD0.HY = (int)(System.currentTimeMillis() / 1000L) - this.bv;
    }
}

