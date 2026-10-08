/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import f.CH0;
import f.GH;
import f.ce0_0;
import f.k20_0;
import f.pg0_0;
import f.pk_0;
import f.sm0_0;
import f.yq0_0;
import f.zo_0;
import java.nio.ByteBuffer;

/*
 * Renamed from f.bu
 */
public class ServerOpcode131Packet
extends GH {
    public ce0_0 gc0;

    public ServerOpcode131Packet(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }

    @Override
    public final void Oj0() {
        pk_0 player = this.sr0().xI0;
        if (player != null) {
            CH0 ignored = player.mn0.Vj;
        }
        ce0_0 entry = new ce0_0(this.pE(), pg0_0.vh0(this.Rj.get()), this.Rj.getInt());
        entry.fh0(this.h80());
        this.gc0 = entry;
        entry.mo0 = (this.Rj.get() & 0xFF) == 1;
    }

    @Override
    public final void os0() {
        pk_0 pk_02 = this.sr0().xI0;
        if (pk_02 == null) {
            return;
        }
        ServerOpcode131Packet bu_22 = this;
        pk_02.eG0(this.gc0);
        bu_22.sr0().jC(sm0_0.Bx(2600, this.gc0.GG0.DR, pk_02.mn0.lt0), zo_0.kJ0);
        bu_22.sr0().fP();
    }
}
