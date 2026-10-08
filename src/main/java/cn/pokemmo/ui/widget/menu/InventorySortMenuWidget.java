/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.ui.widget.menu;

import f.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import cn.pokemmo.ui.widget.menu.BasePopupMenuWidget;

import f.BU;
import f.E00;
import f.bk_2;
import f.i70_0;
import f.jq0_0;
import f.le0_2;
import f.lo0_0;
import f.nf0_0;
import f.pa0_0;
import f.sm0_0;
import f.tk0_0;
import f.xe_1;
import f.zk0_1;

public class InventorySortMenuWidget extends BasePopupMenuWidget {
    public final tk0_0 lM;

    public InventorySortMenuWidget(BU le0_22, tk0_0 object) {
        if (jq0_0.hA(le0_22, InventorySortMenuWidget.class)) {
            jq0_0.tK0(le0_22, InventorySortMenuWidget.class).xe0();
        }
        this.uf("dialog-widget");
        this.lM = new tk0_0();
        this.lM.uf("item-panel");
        xe_1 button = new xe_1(sm0_0.c0(nf0_0.BA));
        button.RR(this::xe0);
        lo0_0 panel = new lo0_0(object);
        panel.Qs0(2);
        bk_2 layout = this.lM.gg0;
        layout.EF(15.0f);
        layout.yI().ys0(5.0f);
        layout.vx0(panel).Pt(500.0f).ru().K6().im0();
        layout.vx0(button).Yt();
        this.gg0.vx0(this.lM).K6().ru();
        this.mz0();
    }

    @Override
    public final void C(zk0_1 zk0_12) {
    }

    @Override
    public final boolean nd0(i70_0 i70_02) {
        if (E00.C10(i70_02.zu) && i70_02.nA0 == 0) {
            this.xe0();
            return true;
        }
        return super.nd0(i70_02);
    }

    @Override
    public final void K8() {
        InventorySortMenuWidget qH = this;
        super.K8();
        qH.kh0();
        qH.lM.vf(pa0_0.Ol);
    }
}
