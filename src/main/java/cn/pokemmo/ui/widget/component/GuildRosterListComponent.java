package cn.pokemmo.ui.widget.component;

import f.*;
import java.util.*;

public abstract class GuildRosterListComponent extends BaseComponent implements Runnable {
    public Z30 M00;
    public wl0_2 qF0;
    public boolean TQ;

    public GuildRosterListComponent() {
        super();
    }

    @Override
    public final void Ib(Jn0 style) {
        super.Ib(style);
        this.qF0 = ((LC0) style).uT("cursor");
    }

    public abstract void hp(zk0_1 event);

    public abstract void Th0();

    public abstract void CoM2(int x, int y);

    @Override
    public void FW(zk0_1 event) {
        if (this.M00 == null) {
            this.hp(event);
            this.TQ = true;
        }
        if (this.M00 != null) {
            if (this.TQ) {
                this.Th0();
            }
            this.M00.uf(this.M, this.A20 + this.e80, this.SB0 + this.y9, this.a3(), this.k5());
        }
    }

    @Override
    public final void t5() {
        super.t5();
        Z30 value = this.M00;
        if (value != null) {
            value.GS.Ng.sj0(value, true);
            this.M00 = null;
        }
    }

    public final boolean nd0(i70_0 event) {
        int type = J90.Qj(event.zu);
        if (type == 2 || type == 5) {
            this.CoM2(event.f8 - (this.A20 + this.e80), event.AN - (this.SB0 + this.y9));
            return true;
        }
        if (type == 7) {
            return false;
        }
        if (E00.C10(event.zu)) {
            return true;
        }
        return super.nd0(event);
    }

    @Override
    public final void run() {
        this.TQ = true;
    }
}
