package cn.pokemmo.ui.widget.tree;

import f.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import cn.pokemmo.ui.widget.tree.BaseTreeModel;

import java.util.ArrayList;
import java.util.Collections;

public class TradeItemTreeModel extends BaseTreeModel {
    public final bp_2 ON;
    public final int tw;
    public final E2 y6;
    public final cb0_1 ff;

    public TradeItemTreeModel(cb0_1 owner, boolean reverse) {
        super();
        this.ON = bp_2.Vy;
        this.tw = reverse ? 2 : 1;
        this.uf("/tournament-table");
        this.y6 = new E2(this);
        this.ff = owner;
        this.private$(this.y6);
        this.Vo0(xe_1.class, new md_2());
        this.Vo0(ia0_1.class, new S3());
        this.p5(true);
        this.Dp0();
        this.Bb(0);
        this.MK();
    }

    @Override
    public final void kz(int index) {
        super.kz(index);
    }

    public final void fC0(zp0_0[] values) {
        ArrayList<zp0_0> sorted = new ArrayList<>();
        Collections.addAll(sorted, values);
        Collections.sort(sorted, this.ON.Zp);
        if (this.tw == 2) Collections.reverse(sorted);
        E2 table = this.y6;
        if (table.Tu.length > 0) table.fg0(0, table.Tu.length);
        zp0_0[] replacement = sorted.toArray(new zp0_0[0]);
        table.bG = new xe_1[replacement.length];
        table.Tu = replacement;
        for (int i = 0; i < replacement.length; ++i) table.od0(0, i);
    }

    public final void MK() {
        this.LPT6(this.ON.ex0, this.tw);
    }
}
