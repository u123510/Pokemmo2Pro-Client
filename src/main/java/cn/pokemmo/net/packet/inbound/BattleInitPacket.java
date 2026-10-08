/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import f.CH0;
import f.GH;
import f.VU;
import f.bc_1;
import f.k20_0;
import f.tw0_0;
import f.ut_2;
import java.nio.ByteBuffer;

/*
 * Renamed from f.oy0
 */
public class BattleInitPacket
extends GH {
    public CH0 uW;
    public byte k10;
    public short o5;

    public BattleInitPacket(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }

    @Override
    public final void Oj0() {
        BattleInitPacket oy0_02 = this;
        oy0_02.uW = oy0_02.pE();
        oy0_02.k10 = oy0_02.Rj.get();
        oy0_02.o5 = oy0_02.Rj.getShort();
    }

    @Override
    public final void os0() {
        VU vU = this.sr0().PC0.sF(this.uW);
        if (vU == null) {
            return;
        }
        if (tw0_0.PK0 == null) {
            tw0_0.PK0 = bc_1.Bm();
        }
        BattleInitPacket oy0_02 = this;
        byte by = oy0_02.k10;
        tw0_0.PK0.YP(new ut_2(vU, by, oy0_02.o5));
    }
}

