package cn.pokemmo.ui.widget.layout;

import f.*;
import java.util.*;

import java.util.ArrayList;

public class FlowContainerLayout extends BaseLayoutBox {
    public static final ArrayList By0 = new ArrayList();

    public final er_0 jk;
    public final YE0 LL0;

    public FlowContainerLayout() {
        this.uf("adminframe-table");

        YE0 model = new YE0();
        this.LL0 = model;

        er_0 table = new er_0(model);
        this.jk = table;
        table.uf("/adminframe-table");
        table.p5(true);
        table.Dp0();

        lo0_0 content = new lo0_0(table);
        this.WQ(this.lo0().Xq(new ya_1[]{this.C7(new le0_2[]{content})}));
        this.x40(this.H10().Xq(new ya_1[]{this.hb(new le0_2[]{content})}));
    }
}
