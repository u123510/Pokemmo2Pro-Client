package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

public class BattleOpcode047Packet extends GH {
    public boolean SV;
    public CH0 Fc;
    public String g00;

    public BattleOpcode047Packet(k20_0 source, java.nio.ByteBuffer data) {
        super(source, data);
        this.Fc = CH0.j1;
    }

    @Override
    public final void Oj0() {
        this.SV = (this.Rj.get() & 0xff) == 1;
        if (this.SV) {
            this.Fc = this.pE();
            this.g00 = this.q60();
        }
    }

    @Override
    public final void os0() {
        if (!this.SV) {
            this.sr0().qK(sm0_0.c0(2102));
            return;
        }
        Ge0 root = this.sr0();
        ch0_2 target = (ch0_2) root.Cl.px0.get(this.Fc);
        if (target != null) {
            target.GT = null;
            target.Pc0.Nw0 = this.g00;
        }
        BR battle = (BR) root;
        Qy0 panel = battle.lZ;
        if (panel.TG0 != null) panel.TG0.xe0();
        panel.TG0 = null;
        lg_0.k.lPT5(new Nq(panel, battle));
    }
}
