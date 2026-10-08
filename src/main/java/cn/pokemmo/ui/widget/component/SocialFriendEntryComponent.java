package cn.pokemmo.ui.widget.component;

import f.*;
import java.util.*;

public class SocialFriendEntryComponent extends BaseComponent {
    public final le0_2 cD0;

    public SocialFriendEntryComponent(le0_2 child) {
        super();
        this.uf("fullscreen-container");
        this.cD0 = child;
        this.SL(child);
    }

    public final int pi0() {
        return tw0_0.LD0.ew0();
    }

    public final int zs0() {
        return tw0_0.LD0.Hv0();
    }

    public final void K8() {
        this.lt0();
        this.E40(0, 0);
        this.cD0.lt0();
        this.cD0.vf(pa0_0.Ol);
        this.cD0.r90 = 0;
    }

    public final void aUX(zk0_1 value) {
        if (dw_2.lp0 && tw0_0.kz0()) {
            lg_0.S4.getClass();
            lg_0.S4.getClass();
        }
        wl0_2 layout = this.Jj0;
        if (layout == null) {
            return;
        }
        layout.uf(this.M, this.A20, this.SB0, this.Mx, this.OB);
    }
}
