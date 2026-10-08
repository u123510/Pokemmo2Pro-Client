/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import f.CH0;
import f.GH;
import f.VU;
import f._volatile;
import f.k20_0;
import f.sm0_0;
import java.nio.ByteBuffer;

public class PlayerWarpTeleportPacket
extends GH {
    public CH0 Gw0 = CH0.j1;
    public byte y2;
    public String e7 = "";

    public PlayerWarpTeleportPacket(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }

    @Override
    public final void Oj0() {
        PlayerWarpTeleportPacket yS = this;
        yS.Gw0 = yS.pE();
        this.y2 = yS.Rj.get();
        if (this.y2 == 0) {
            this.e7 = this.q60();
        }
    }

    @Override
    public final void os0() {
        VU vU = this.sr0().FJ0(this.Gw0, _volatile.pG0);
        String string = vU == null ? "" : vU.na0();
        if (this.y2 != 0 || !this.e7.isEmpty()) {
            this.sr0().qK(sm0_0.Bx(this.y2 + 6100, string, this.e7));
        }
        if (this.y2 == 0 && vU != null) {
            vU.I8.kX = this.e7;
            this.sr0().CA(vU);
        }
    }
}

