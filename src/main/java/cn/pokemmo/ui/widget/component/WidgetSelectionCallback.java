package cn.pokemmo.ui.widget.component;

import f.gt_0;
import f.vl_0;
import f.wn0_0;
import f.yq_2;

public class WidgetSelectionCallback implements gt_0 {
    public final vl_0 G2;

    public WidgetSelectionCallback(vl_0 v1) {
        this.G2 = v1;
    }

    public void ks0(int i1) {
        vl_0 v = this.G2;
        yq_2 yq = v.LB0;
        String str = ((wn0_0) v.interface$.dI0).YA.toString();
        yq.Te0.mi0 = str;
        yq.LD0();
    }
}
