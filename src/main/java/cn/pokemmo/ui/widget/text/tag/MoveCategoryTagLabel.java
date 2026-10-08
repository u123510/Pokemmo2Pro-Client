package cn.pokemmo.ui.widget.text.tag;

import f.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import cn.pokemmo.ui.widget.text.tag.BaseTaggedLabelWidget;

import java.text.DecimalFormat;

public class MoveCategoryTagLabel extends BaseTaggedLabelWidget {
    public final TH Xh;
    public final VU pq;
    public final boolean o2;

    public MoveCategoryTagLabel(TH owner, VU value, byte index, boolean enabled) {
        super("999", 46, 46);
        Br0 icon = this.sl();
        icon.o60(yh_0.Dl0().qC0(value.RJ().Kr(), value.Dg0(), value.LPt6())[0]);
        icon.Gy0(5, -6);
        this.uf("monsterdex-button");
        this.Xh = owner;
        this.pq = value;
        this.o2 = enabled;
        BR root = tw0_0.rl;
        if (root != null && root.sm() != null) {
            this.SU(new DecimalFormat("000").format((long) value.Wd().oH()));
            this.RR(new pl0_0(owner, index));
            this.Bb(200);
        } else {
            this.SU("");
        }
    }

    @Override
    public final boolean nd0(i70_0 event) {
        if (this.OI && this.o2 && event.Li() && event.zu == 4 && event.nA0 == 1) {
            lg_0.k.lPT5(new it0(this));
            return true;
        }
        return super.nd0(event);
    }
}
