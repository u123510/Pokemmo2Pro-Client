package cn.pokemmo.ui.widget.layout;

import f.*;
import java.util.*;

public class TabHeaderContainerLayout extends BaseLayoutBox {
    public final lr_0 Hz;

    public TabHeaderContainerLayout(lr_0 owner) {
        super();
        this.Hz = owner;
    }

    @Override
    public final boolean nd0(i70_0 event) {
        if (!E00.ZU(event.zu) || !event.iT()) {
            return super.nd0(event);
        }

        int key = event.finally$;
        rp_0 state = rp_0.synchronized$;
        int ignored = dw_2.ff;
        if (state != null && state.Ov(key)) {
            this.Uz(1, true);
            return true;
        }

        state = rp_0.Aq0;
        if (state != null && state.Ov(key)) {
            this.Uz(1, true);
            return true;
        }

        state = rp_0.kC0;
        if (state != null && state.Ov(key)) {
            this.Uz(-1, true);
            return true;
        }

        state = rp_0.cB;
        if (state != null && state.Ov(key)) {
            this.Uz(-1, true);
            return true;
        }

        state = rp_0.nK0;
        if (state != null && state.Ov(key)) {
            this.Hz.hq.f00();
            lpt6__0.v90(this.Hz.hq);
            return true;
        }

        return super.nd0(event);
    }
}
