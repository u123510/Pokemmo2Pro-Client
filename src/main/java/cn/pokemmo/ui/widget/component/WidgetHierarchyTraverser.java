package cn.pokemmo.ui.widget.component;

import f.*;
import java.util.List;

public class WidgetHierarchyTraverser {
    public final w7_0 LpT1;

    public WidgetHierarchyTraverser() {
        this.LpT1 = new w7_0();
    }

    public final void k5(int value, String text, short key) {
        ba_2 marker = (ba_2) WM.qu0.Nf.f5(key);
        if (marker == null) {
            return;
        }
        synchronized (this.LpT1) {
            sc_1 state = (sc_1) this.LpT1.f5(key);
            if (state == null) {
                state = new sc_1(marker, text);
                this.LpT1.coM4(key, state);
            }
            if (value == 0) {
                this.BW(key);
                return;
            }
            state.YK = value;
            state.qH = (int) (System.currentTimeMillis() / 1000L) + value;
            for (Object listener : cz_0.z1(qh_1.class)) {
                ((qh_1) listener).zA((j_0) (Object) this);
            }
        }
    }

    public final void BW(short key) {
        synchronized (this.LpT1) {
            if (this.LpT1.sX(key) == null) {
                return;
            }
            for (Object listener : cz_0.z1(qh_1.class)) {
                ((qh_1) listener).zA((j_0) (Object) this);
            }
        }
    }
}
