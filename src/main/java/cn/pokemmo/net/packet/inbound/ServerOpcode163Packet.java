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
import f.yt_1;
import java.nio.ByteBuffer;

public class ServerOpcode163Packet
extends GH {
    public CH0 kc = CH0.j1;
    public boolean CoM5;
    public boolean TI0;
    public boolean F2;

    public ServerOpcode163Packet(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }

    @Override
    public final void Oj0() {
        ServerOpcode163Packet qG0 = this;
        qG0.kc = qG0.pE();
        boolean bl = qG0.Rj.get() == 1;
        this.CoM5 = bl;
        bl = this.Rj.get() == 1;
        this.TI0 = bl;
        bl = this.Rj.get() == 1;
        this.F2 = bl;
    }

    @Override
    public final void os0() {
        StringBuilder stringBuilder;
        Object object = this.sr0().cJ0;
        if (object == null) {
            return;
        }
        if ((object = ((yt_1)object).te0(this.kc)) == null) {
            return;
        }
        boolean bl = this.CoM5;
        ServerOpcode163Packet qG0 = this;
        boolean bl2 = qG0.F2;
        boolean bl3 = qG0.TI0;
        ((E90)object).Cj0();
        ((E90)object).oD = bl;
        ((E90)object).Lpt3 = bl2;
        ((E90)object).FI0 = bl3;
        StringBuilder stringBuilder2 = new StringBuilder();
        if (bl) {
            stringBuilder2.append("{\u00a7}");
        }
        if (bl3) {
            stringBuilder2.append("{GMMODE}");
        }
        if (bl2) {
            stringBuilder2.append("{HIDE}");
        }
        StringBuilder stringBuilder3 = stringBuilder2;
        stringBuilder2.append(" ");
        stringBuilder3.append(((E90)object).ea);
        ((E90)object).ea = stringBuilder3.toString();
    }
}

