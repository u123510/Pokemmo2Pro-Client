package cn.pokemmo.ui.widget.component;

import f.*;
import java.util.*;

public abstract class BaseTabbedPanelComponent extends BaseComponent implements tr_1 {
    public final xe_1[] lw;
    public int Qo0;
    public final fy_2 A3;
    public final cn_0 DR;
    public final xe_1 tf0;
    public final xe_1 FI0;
    public final xe_1 WB0;
    public final ae0_1 DE;
    public final long Nw0;
    public final BU Dg;
    public final byte qq0;

    public BaseTabbedPanelComponent(BU owner, byte mode) {
        this(owner, mode, 60, 63);
    }

    public BaseTabbedPanelComponent(BU owner, byte mode, int confirmId, int cancelId) {
        super(null, false);
        this.Qo0 = 1;
        this.uf("confirm-widget");
        this.Dg = owner;
        this.qq0 = mode;

        fy_2 panel = new fy_2();
        this.A3 = panel;
        panel.uf("confirm-panel");

        cn_0 prompt = new cn_0();
        this.DR = prompt;

        ae0_1 progress = new ae0_1();
        this.DE = progress;
        progress.aE(1.0f);
        progress.uf("countdown-progressbar");

        xe_1 confirm = new xe_1(sm0_0.c0(confirmId));
        this.tf0 = confirm;
        confirm.RR(() -> this.Q8(mode));

        xe_1 cancel = new xe_1(sm0_0.c0(cancelId));
        this.FI0 = cancel;
        cancel.RR(() -> this.Rx(mode));

        xe_1 fallback = new xe_1(sm0_0.c0(202));
        this.WB0 = fallback;
        fallback.RR(() -> this.pF0(mode));

        this.CP();
        this.SL(panel);
        this.Nw0 = System.currentTimeMillis() + 15000L;
        this.lw = new xe_1[]{confirm, cancel, fallback};
    }

    public void CP() {
        this.A3.x40(
                XN.sA(this.A3, this.A3)
                        .Kn0(this.DR)
                        .Kn0(this.DE)
                        .X20(XN.sA(this.A3, this.A3)
                                .LPt3(new le0_2[]{this.tf0, this.FI0, this.WB0}))
                        .Ze0());
        this.A3.WQ(
                D5.fE0(this.A3, this.A3)
                        .Kn0(this.DR)
                        .Kn0(this.DE)
                        .X20(D5.fE0(this.A3, this.A3)
                                .Kn0(this.tf0)
                                .Kn0(this.FI0)
                                .Kn0(this.WB0)));
    }

    public byte Tg0() {
        return FD.Q70.Zz0;
    }

    public final void dd(String text) {
        this.DR.Sk(text);
    }

    public void HP(zk0_1 context) {
        float seconds = (float)(this.Nw0 - System.currentTimeMillis()) / 1000.0f;
        if (seconds > 0.0f) {
            this.DE.aE(seconds / 15.0f);
            super.HP(context);
            return;
        }

        tw0_0.rl.ze0(this.qq0, FD.Ye.Zz0);
        this.Dg.u3(this);
    }

    public final void K8() {
        this.A3.lt0();
        this.lt0();
        this.N80(pa0_0.Ol);
    }

    public final void C(zk0_1 context) {
        if (this.lw == null) {
            throw new RuntimeException();
        }
        lpt6__0.v90(this.PRN());
    }

    public final boolean nd0(i70_0 event) {
        if (E00.ZU(event.zu) && event.iT()) {
            int key = event.finally$;

            rp_0 action = rp_0.kC0;
            if (action != null && action.Ov(key)) {
                --this.Qo0;
                lpt6__0.v90(this.PRN());
                return true;
            }

            action = rp_0.synchronized$;
            if (action != null && action.Ov(key)) {
                ++this.Qo0;
                lpt6__0.v90(this.PRN());
                return true;
            }

            action = rp_0.sJ0;
            if (action != null && action.Ov(key)) {
                a7_0.bH(this.PRN().ER.Fc0);
                return true;
            }

            action = rp_0.nK0;
            if (action != null && action.Ov(key)) {
                xe_1 button = this.FI0;
                if (button != null) {
                    a7_0.bH(button.ER.Fc0);
                    return true;
                }
            }
        }
        return super.nd0(event);
    }

    public final xe_1 PRN() {
        if (this.Qo0 < 0) {
            this.Qo0 = 0;
        }
        xe_1[] buttons = this.lw;
        if (this.Qo0 >= buttons.length) {
            this.Qo0 = buttons.length - 1;
        }
        return buttons[this.Qo0];
    }

    public final void pF0(byte value) {
        this.xe0();
        tw0_0.rl.ze0(value, FD.Np0.Zz0);
    }

    public final void Rx(byte value) {
        this.xe0();
        tw0_0.rl.ze0(value, FD.C6.Zz0);
    }

    public final void Q8(byte value) {
        this.xe0();
        tw0_0.rl.ze0(value, this.Tg0());
    }
}
