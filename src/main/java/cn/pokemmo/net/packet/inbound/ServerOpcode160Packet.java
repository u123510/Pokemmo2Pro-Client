/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import f.GH;
import f.ft_2;
import f.k20_0;
import java.nio.ByteBuffer;

/*
 * Renamed from f.nd0
 */
public class ServerOpcode160Packet
extends GH {
    public ft_2[] m70;

    public ServerOpcode160Packet(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }

    @Override
    public final void Oj0() {
        int n = this.Rj.get() & 0xFF;
        this.m70 = new ft_2[n];
        for (int j = 0; j < n; ++j) {
            ft_2 ft_22;
            ServerOpcode160Packet nd0_22 = this;
            ft_2[] ft_2Array = nd0_22.m70;
            nd0_22.pE();
            String string = nd0_22.q60();
            boolean bl = (nd0_22.Rj.get() & 0xFF) == 1;
            ft_2Array[j] = ft_22 = new ft_2(string, bl);
        }
    }

    @Override
    public final void os0() {
        this.sr0().FC0(this);
    }
}

