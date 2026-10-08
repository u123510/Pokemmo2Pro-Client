package cn.pokemmo.ui.widget.component;

import f.*;
import java.util.*;

public class PartyStatusRowComponent extends BaseComponent {
    public final cn_0 eU;
    public final fy_2 mE0;

    public PartyStatusRowComponent(short width, short height) {
        super();
        this.uf("queuegui");
        fy_2 panel = new fy_2();
        this.mE0 = panel;
        panel.uf("login-panel");
        cn_0 heading = new cn_0(sm0_0.c0(1075));
        this.eU = heading;
        cn_0 count = new cn_0(sm0_0.c0(1076) + " " + width + "/" + height);
        panel.x40(panel.C7(new le0_2[]{heading, count}));
        panel.WQ(panel.hb(new le0_2[]{heading, count}));
        this.SL(panel);
    }

    @Override
    public final void K8() {
        this.mE0.lt0();
        le0_2 root = this.K20;
        int width = root.A20 + root.e80;
        width = kq_0.lpT2(this.a3(), this.mE0.Mx, 2, width);
        le0_2 parent = this.K20;
        int height = parent.SB0 + parent.y9;
        height = kq_0.lpT2(this.k5(), this.mE0.OB, 2, height);
        this.E40(width, height);
    }

    @Override
    public final void aUX(zk0_1 context) {
        if (dw_2.lp0 && tw0_0.kz0()) {
            lg_0.S4.getClass();
            lg_0.S4.getClass();
        }
        wl0_2 drawable = this.Jj0;
        if (drawable != null) {
            drawable.uf(this.M, this.A20, this.SB0, this.Mx, this.OB);
        }
    }
}
