package cn.pokemmo.ui.widget.layout;

import f.*;
import java.util.*;

public class SplitPaneContainerLayout extends BaseLayoutBox {
    public final le0_2 Ty0;
    public final EP coM9;
    public final int throw$;

    public SplitPaneContainerLayout(int i1, EP v2, le0_2 v3) {
        this.Ty0 = v3;
        this.coM9 = v2;
        this.throw$ = i1;
    }


    public final String Ck() {
        return "menupopup";
    }


    public final void C(zk0_1 v1) {
        this.uc = false;
        this.coM9.getClass();
        this.Ty0.M.j70(EP.p10, true);
    }


    public final void N00(zk0_1 v1) {
        this.Ty0.M.j70(EP.p10, false);
        this.coM9.getClass();
    }


    public final boolean nd0(i70_0 v1) {
        return super.nd0(v1) || v1.Li();
    }
}
