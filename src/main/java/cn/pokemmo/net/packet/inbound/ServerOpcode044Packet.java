/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import f.CH0;
import f.E90;
import f.GH;
import f.k20_0;
import java.nio.ByteBuffer;

/*
 * Renamed from f.fC
 */
public class ServerOpcode044Packet
extends GH {
    public CH0 oo0 = CH0.j1;
    public String Uv;

    public ServerOpcode044Packet(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }

    @Override
    public final void Oj0() {
        ServerOpcode044Packet fc_02 = this;
        fc_02.oo0 = fc_02.pE();
        fc_02.Uv = fc_02.q60();
    }

    @Override
    public final void os0() {
        E90 e90 = this.sr0().cJ0.te0(this.oo0);
        if (e90 != null) {
            e90.Ll0 = this.Uv;
            e90.Cj0();
        }
    }
}

