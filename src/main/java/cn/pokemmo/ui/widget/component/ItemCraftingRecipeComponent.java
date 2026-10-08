package cn.pokemmo.ui.widget.component;

import f.*;
import java.util.*;

import java.util.ArrayList;

public class ItemCraftingRecipeComponent extends BaseComponent {
    public static f.zy0_0 CF0;
    public int ii0;
    public final ArrayList TD0;
    public boolean n60;
    public boolean Mb0;
    public final fy_2 while$;
    public final lo0_0 L3;
    public final StringBuilder Zi;
    public final dd0_0 I50;
    public final Z4 Ke0;

    public ItemCraftingRecipeComponent() {
        this.n60 = false;
        this.Mb0 = false;
        uf("/console");
        this.TD0 = new ArrayList();
        fy_2 fy_2Var = new fy_2();
        this.while$ = fy_2Var;
        this.Zi = new StringBuilder();
        dd0_0 dd0_0Var = new dd0_0();
        this.I50 = dd0_0Var;

        dp_0 dp_0Var = new dp_0(dd0_0Var);
        dp_0Var.uf("textarea");
        lo0_0 lo0_0Var = new lo0_0(dp_0Var);
        this.L3 = lo0_0Var;
        lo0_0Var.Qs0(2);

        Z4 z4 = new Z4();
        this.Ke0 = z4;
        z4.I7();
        z4.uf("editfield");
        z4.ef0(lpt3__1.VB0);

        fy_2Var.x40(fy_2Var.C7(new le0_2[] { lo0_0Var, z4 }));
        fy_2Var.WQ(fy_2Var.hb(new le0_2[] { lo0_0Var, z4 }));
        z4.J0();
        z4.Ii(new z7_0((f.zy0_0)(Object)this));

        SL(fy_2Var);
        CF0 = (f.zy0_0)(Object)this;
    }

    @Override
    public final void K8() {
        this.while$.oY(a3(), k5());
    }

    public final int KC0() {
        if (this.Mb0) {
            return 100;
        }
        return tw0_0.LD0.Hv0() / 2;
    }

    public final synchronized void Xt(String str, String str2) {
        StringBuilder sb = new StringBuilder("<div style=\"font-family: ");
        sb.append(str2).append(";\">").append(wq_0.P60(str)).append("</div>");
        int unused = this.L3.g1.hm;
        this.Zi.append(this.Zi.toString());
        this.I50.sV(sb.toString());
        this.n60 = true;
    }

    @Override
    public final void HP(zk0_1 zk0_1Var) {
        super.HP(zk0_1Var);
        if (this.n60) {
            this.n60 = false;
            this.L3.Iu();
            this.L3.Xr0(this.L3.g1.hm);
        }
    }
}
