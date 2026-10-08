package cn.pokemmo.ui.widget.tree;

import f.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import cn.pokemmo.ui.widget.tree.BaseTreeModel;

import java.util.ArrayList;
import java.util.Collections;

public class AchievementGroupTreeModel extends BaseTreeModel {
    public ud_1 n10;
    public int Bc0;
    public final Sy0 U0;
    public final hb0_0 Fp0;

    public AchievementGroupTreeModel() {
        this.n10 = ud_1.po;
        this.Bc0 = 2;
        this.U0 = new Sy0();
        hb0_0 hb00 = new hb0_0();
        this.Fp0 = hb00;
        this.private$(hb00);
        this.Vo0(xe_1.class, new md_2());
        this.Vo0(ia0_1.class, new S3());
        this.uf("/member-table");
        this.p5(true);
        this.Dp0();
        this.Bb(0);
        this.Wt0();
    }

    @Override
    public final void kz(int i) {
        super.kz(i);
        ud_1[] cols = ud_1.cl0;
        if (i >= cols.length) {
            return;
        }
        ud_1 targetCol = cols[i];
        if (this.n10 == targetCol) {
            int newOrder = W0.ng0(this.Bc0);
            if (newOrder == 0) {
                throw new NullPointerException("order");
            }
            if (this.Bc0 != newOrder) {
                this.Bc0 = newOrder;
                this.Wt0();
                this.hk0();
            }
        } else {
            if (targetCol == null) {
                throw new NullPointerException("column");
            }
            if (this.n10 != targetCol) {
                this.n10 = targetCol;
                this.Wt0();
                this.hk0();
            }
        }
    }

    public final void hk0() {
        ArrayList<GR> list = new ArrayList<>();
        for (Object obj : tw0_0.rl.q50.lx.values()) {
            GR gr = (GR) obj;
            if (this.U0 == null || this.U0.RZ(gr)) {
                list.add(gr);
            }
        }
        Collections.sort(list, this.n10.sG0);
        if (this.Bc0 == 2) {
            Collections.reverse(list);
        }
        hb0_0 model = this.Fp0;
        GR[] newArr = list.toArray(new GR[0]);
        GR[] oldArr = model.hu0;
        if (oldArr.length > 0) {
            model.fg0(0, oldArr.length);
        }
        model.hu0 = newArr;
        model.od0(0, newArr.length);
        fa0_0 fa00 = tw0_0.rl.q50;
        if (fa00.LF0) {
            fa00.LF0 = false;
        }
    }

    @Override
    public final void HP(zk0_1 zk01) {
        super.HP(zk01);
        fa0_0 fa00 = tw0_0.rl.q50;
        if (fa00.LF0) {
            fa00.LF0 = false;
            this.hk0();
        }
    }

    public final void Wt0() {
        this.LPT6(this.n10.Rc0, this.Bc0);
    }
}
