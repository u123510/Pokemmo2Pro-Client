package cn.pokemmo.ui.widget.component;

import f.*;
import java.util.*;

public class NpcTradeDialogComponent extends BaseComponent {
    public final Qy0 QL;
    public final fy_2 pE;

    public NpcTradeDialogComponent(Qy0 owner) {
        super();
        this.uf("logingui");
        this.QL = owner;
        this.pE = new fy_2();
        this.pE.uf("login-panel");
        cn_0 label = new cn_0(sm0_0.c0(74));
        this.pE.WQ(this.pE.lo0().Kn0(label));
        this.pE.x40(this.pE.H10().Kn0(label));
        this.SL(this.pE);
    }

    public final void K8() {
        this.pE.lt0();
        int centeredX = kq_0.lpT2(this.QL.a3(), this.pE.Mx, 2, this.QL.A20 + this.QL.e80);
        int centeredY = kq_0.lpT2(this.QL.k5(), this.pE.OB, 2, this.QL.SB0 + this.QL.y9);
        this.pE.E40(centeredX, centeredY);
    }

    public final void aUX(zk0_1 ignored) {
        if (dw_2.lp0 && tw0_0.kz0()) {
            lg_0.S4.getClass();
            lg_0.S4.getClass();
        }
        wl0_2 listener = this.Jj0;
        if (listener != null) {
            listener.uf(this.M, this.A20, this.SB0, this.Mx, this.OB);
        }
    }
}
