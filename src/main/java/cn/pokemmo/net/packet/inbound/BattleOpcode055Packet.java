/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import f.GH;
import f.Vr0;
import f._volatile;
import f.a10_0;
import f.k20_0;
import f.lpt8__0;
import f.tw0_0;
import java.nio.ByteBuffer;

/*
 * Renamed from f.sV
 */
public class BattleOpcode055Packet
extends GH {
    public byte IB0;
    public short uO;
    public byte G0;
    public lpt8__0 L0;

    public BattleOpcode055Packet(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }

    @Override
    public final void Oj0() {
        BattleOpcode055Packet sv_12 = this;
        sv_12.IB0 = sv_12.Rj.get();
        sv_12.uO = sv_12.Rj.getShort();
        this.G0 = sv_12.Rj.get();
        if (this.G0 == 4) {
            this.L0 = new lpt8__0((_volatile)_volatile.zs0.BM(this.Rj.get()), this.Rj.getShort());
        }
    }

    @Override
    public final void os0() {
        a10_0 a10_02 = tw0_0.PK0;
        if (a10_02 != null) {
            BattleOpcode055Packet sv_12 = this;
            byte by = sv_12.IB0;
            short s = sv_12.uO;
            byte by2 = sv_12.G0;
            lpt8__0 lpt8__02 = sv_12.L0;
            a10_02.Tk0.add(new Vr0(by, s, by2, lpt8__02));
        }
    }
}

