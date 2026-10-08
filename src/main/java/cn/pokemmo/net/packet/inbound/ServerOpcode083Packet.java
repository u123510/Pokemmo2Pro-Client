/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import f.Dm0;
import f.GH;
import f.k20_0;
import java.nio.ByteBuffer;

/*
 * Renamed from f.k90
 */
public class ServerOpcode083Packet
extends GH {
    public byte In;
    public int a30;

    public ServerOpcode083Packet(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }

    @Override
    public final void Oj0() {
        ServerOpcode083Packet k90_02 = this;
        k90_02.In = k90_02.Rj.get();
        k90_02.a30 = k90_02.Rj.getInt();
    }

    @Override
    public final void os0() {
        ServerOpcode083Packet k90_02 = this;
        byte by = k90_02.In;
        int n = k90_02.a30;
        Dm0 dm0 = this.sr0().bh;
        if (dm0 != null && dm0.hq0) {
            dm0.xp0[by] = n;
            dm0.aUX = true;
        }
    }
}

