package cn.pokemmo.ui.widget.component;

import f.D2;
import f.LB0;
import f.YT;
import f.hn_0;
import f.tw0_0;

public class InventoryItemSelectedListener implements LB0 {
    public final hn_0 iV;

    public InventoryItemSelectedListener(hn_0 v1) {
        this.iV = v1;
    }

    public void LPT3(int i1, D2 v2) {
        hn_0 hn = this.iV;
        YT yt = hn.vw.ZY;
        if (yt.uw(hn.hm) >= 0) {
            int idx = yt.uw(this.iV.hm);
            short s = (idx < 0) ? yt.XQ : yt.ie0[idx];
            tw0_0.RE0.wp0((byte) 2, s);
        }
    }
}
