/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import f.A5;
import f.CH0;
import f.GH;
import f.K5;
import f.RJ0;
import f.k20_0;
import java.nio.ByteBuffer;

public class ServerOpcode068Packet
extends GH {
    public CH0 q5;
    public byte Pw0;

    public ServerOpcode068Packet(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }

    @Override
    public final void Oj0() {
        ServerOpcode068Packet pU = this;
        pU.q5 = pU.pE();
        pU.Pw0 = pU.Rj.get();
    }

    @Override
    public final void os0() {
        A5[] a5Array = A5.B4;
        int n = A5.B4.length;
        for (int j = 0; j < n; ++j) {
            Object object = a5Array[j];
            object = this.sr0().Bb((A5)object);
            if (object == null || (object = ((RJ0)object).zg(this.q5)) == null) continue;
            ((K5)object).nn.N50 = this.Pw0;
        }
        this.sr0().yt0();
    }
}

