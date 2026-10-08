package cn.pokemmo.ui.widget.tree;

import f.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import cn.pokemmo.ui.widget.tree.BaseTreeModel;

import java.util.ArrayList;
import java.util.Collections;

public class SettingsCategoryTreeModel extends BaseTreeModel {
    public v9_0 Um0;
    public int Ge0;
    public final GM Zd0;

    public SettingsCategoryTreeModel() {
        super();
        this.Um0 = v9_0.ZW;
        this.Ge0 = 1;
        this.Zd0 = new GM();
        this.private$(this.Zd0);
        this.Vo0(xe_1.class, new md_2());
        this.Vo0(ia0_1.class, new S3());
        this.uf("instance-table");
        this.p5(true);
        this.Dp0();
        this.Bb(0);
        this.ka();
    }

    public final void kz(int index) {
        super.kz(index);
        v9_0[] columns = v9_0.Ui;
        if (columns.length <= index) {
            return;
        }
        v9_0 selected = columns[index];
        v9_0 current = this.Um0;
        if (current == selected) {
            int order = (this.Ge0 == 1) ? 2 : 1;
            if (this.Ge0 != order) {
                this.Ge0 = order;
                this.ka();
                this.DA0();
            }
        } else if (current != selected) {
            this.Um0 = selected;
            this.ka();
            this.DA0();
        }
    }

    public final void DA0() {
        ArrayList sorted = new ArrayList(hq_2.ZG.instanceof$());
        Collections.sort(sorted, this.Um0.LC0);
        if (this.Ge0 == 2) {
            Collections.reverse(sorted);
        }
        OJ[] old = this.Zd0.Dx0;
        if (old.length > 0) {
            this.Zd0.fg0(0, old.length);
        }
        OJ[] replacement = (OJ[]) sorted.toArray(new OJ[0]);
        this.Zd0.Dx0 = replacement;
        this.Zd0.od0(0, replacement.length);
    }

    @Override
    public final void K8() {
        this.lt0();
        super.K8();
    }

    public final void ka() {
        this.LPT6(this.Um0.ss0, this.Ge0);
    }
}
