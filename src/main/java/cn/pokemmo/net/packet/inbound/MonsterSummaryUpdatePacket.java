package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class MonsterSummaryUpdatePacket extends S20 {
    public byte fk;
    public VU ty;

    public MonsterSummaryUpdatePacket(k20_0 source, ByteBuffer data) {
        super(data, source);
    }

    @Override
    public final void Oj0() {
        this.fk = this.Rj.get();
        if (this.fk == 0) {
            this.ty = new VU(this.Lr0());
        }
    }

    @Override
    public final void os0() {
        switch (this.fk) {
            case 1:
                this.sr0().qK(sm0_0.c0(5998));
                return;
            case 2:
                this.sr0().qK(sm0_0.c0(5997));
                return;
            case 0:
                Ge0 owner = this.sr0();
                VU value = this.ty;
                BU hud = ((BR) owner).lZ.zK0;
                if (hud != null) {
                    hud.FI(value, null, qo_1.DL, false);
                }
                return;
            default:
                return;
        }
    }
}
