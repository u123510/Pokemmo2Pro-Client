package cn.pokemmo.ui.widget.tree;

import f.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import cn.pokemmo.ui.widget.tree.BaseTreeModel;

import java.util.ArrayList;
import java.util.Collections;

public class ModFileListTreeModel extends BaseTreeModel {
    public gm_1 w0;
    public int Wn0;
    public final X50 W20;
    public final ArrayList ML;

    public ModFileListTreeModel() {
        super();
        this.w0 = gm_1.Lh;
        this.Wn0 = 1;
        this.ML = new ArrayList();
        this.W20 = new X50();
        this.private$(this.W20);
        this.Vo0(xe_1.class, new md_2());
        this.Vo0(ia0_1.class, new S3());
        this.uf("/dex-move-table");
        this.p5(true);
        this.Dp0();
        this.Bb(0);
        this.dw();
    }

    public final void kz(int index) {
        super.kz(index);
        gm_1[] columns = gm_1.wl;
        if (columns.length <= index) {
            return;
        }
        gm_1 selected = columns[index];
        gm_1 current = this.w0;
        if (current == selected) {
            int order = (this.Wn0 == 1) ? 2 : 1;
            if (order == 0) {
                throw new NullPointerException("order");
            }
            if (this.Wn0 != order) {
                this.Wn0 = order;
                this.dw();
                this.Wg0();
            }
        } else {
            if (selected == null) {
                throw new NullPointerException("column");
            }
            if (current != selected) {
                this.w0 = selected;
                this.dw();
                this.Wg0();
            }
        }
    }

    public final void Wg0() {
        ArrayList sorted = new ArrayList(this.ML);
        Collections.sort(sorted, this.w0.SV);
        if (this.Wn0 == 2) {
            Collections.reverse(sorted);
        }
        eo0_0[] old = this.W20.or0;
        if (old.length > 0) {
            this.W20.fg0(0, old.length);
        }
        eo0_0[] replacement = (eo0_0[]) sorted.toArray(new eo0_0[0]);
        this.W20.or0 = replacement;
        this.W20.od0(0, replacement.length);
    }

    public final void dw() {
        this.LPT6(this.w0.e70, this.Wn0);
    }
}
