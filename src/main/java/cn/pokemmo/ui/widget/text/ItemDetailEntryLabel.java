package cn.pokemmo.ui.widget.text;

import f.*;
import java.util.*;

import java.text.NumberFormat;

public class ItemDetailEntryLabel extends BaseLabel {
    public final q40_0 rl;
    public final ie_2 xv;
    public final int Pj;

    public ItemDetailEntryLabel(q40_0 panel, ie_2 entry, int index) {
        super(entry.TG0.getName() + " x" + NumberFormat.getInstance().format((long) entry.r40()));
        this.rl = panel;
        this.uf("button");
        this.xv = entry;
        this.Pj = index;
        this.pw0(entry.TG0.dB0(true) != JU.O4);
        if (tw0_0.H30()) {
            this.RR(() -> Ku0(entry, panel));
        }
    }

    public static void Ku0(ie_2 entry, q40_0 panel) {
        if (q40_0.lF0 == entry.TG0 && panel.I7 != null) {
            a7_0.bH(panel.I7.ER.Fc0);
        }
    }

    public final boolean nd0(i70_0 input) {
        int code = input.zu;
        if (code == 10 || code == 5) {
            q40_0.lF0 = this.xv.TG0;
        }
        return super.nd0(input);
    }

    public final void hs() {
        this.rl.Cs.Sk(lb0_2.Sp0(this.xv.TG0, true, true));
        this.rl.Bh0 = this.Pj;
        this.rl.ZI0.og.Nk(new Wr[]{gh_1.aH0.F10(this.xv.TG0, false)});
        Br0 preview = this.rl.ZI0.og;
        preview.OA0 = true;
        preview.IF = 48;
        preview.gx0 = 48;
        this.rl.K8();
    }
}
