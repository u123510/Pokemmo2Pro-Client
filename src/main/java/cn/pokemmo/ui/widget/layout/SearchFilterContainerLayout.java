package cn.pokemmo.ui.widget.layout;

import f.*;
import java.util.*;

public class SearchFilterContainerLayout extends BaseLayoutBox {
    public ft_2[] Cu0;
    public xe_1[] ad0;
    public final er_0 gi;
    public final Cn0 Xw0;
    public final cg_0 Ti;

    public SearchFilterContainerLayout() {
        super();
        this.Cu0 = new ft_2[0];
        this.uf("dialoglayout");
        this.ad0 = new xe_1[this.Cu0.length];
        for (int i = 0; i < this.Cu0.length; i++) {
            this.ad0[i] = new xe_1("Inspect Player");
        }

        Cn0 model = new Cn0((f.y0_0)(Object)this);
        this.Xw0 = model;
        er_0 table = new er_0(model);
        this.gi = table;
        GL0 rowButton = new GL0();
        table.Vo0(xe_1.class, rowButton);
        table.uf("/table");
        table.p5(true);
        table.Dp0();

        lo0_0 tableLayout = new lo0_0(table);
        cn_0 searchLabel = new cn_0("Search Player: ");
        cg_0 searchField = new cg_0();
        this.Ti = searchField;
        searchField.I7();
        searchLabel.kl();
        xe_1 searchButton = new xe_1("Search");
        searchButton.RR(new D70((f.y0_0)(Object)this));

        le0_2[] controls = new le0_2[]{searchLabel, searchField, searchButton};
        this.WQ(this.lo0()
                .X20(this.H10().LPt3(controls))
                .X20(this.H10().Kn0(tableLayout)));
        this.x40(this.H10()
                .X20(this.lo0().LPt3(controls))
                .qd(5)
                .X20(this.lo0().LPt3(new le0_2[]{tableLayout})));
    }

    @Override
    public final void K8() {
        this.gi.private$(this.Xw0);
        super.K8();
    }
}
