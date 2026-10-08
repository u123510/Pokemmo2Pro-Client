package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class BattleActiveUnitUpdatePacket extends pd0_0 {
    public a10_0 Wt0;
    public b30_0 e9;
    public PF CON;

    public BattleActiveUnitUpdatePacket(k20_0 source, ByteBuffer data) {
        super(source, data);
    }

    @Override
    public final void Oj0() {
        this.Wt0 = tw0_0.PK0;
        this.e9 = b30_0.f5(this.Rj.get());
        if ((this.Rj.get() & 255) == 1) {
            this.cI0(this.Wt0.mn(this.e9.Pp0), this.Wt0.xy0, this.Wt0.pH0);
        }
        O8 state = this.Wt0.mn(this.e9.Pp0);
        this.CON = this.ml(state, this.e9.B6, this.Wt0.Sv);
    }

    @Override
    public final void os0() {
        a10_0 mode = this.Wt0;
        if (mode == null) {
            return;
        }
        mode.Tk0.add(new Wv0(this.CON, this.e9));
    }
}
