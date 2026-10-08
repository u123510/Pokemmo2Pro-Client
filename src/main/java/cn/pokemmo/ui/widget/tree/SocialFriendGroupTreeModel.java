package cn.pokemmo.ui.widget.tree;

import f.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import cn.pokemmo.ui.widget.tree.BaseTreeModel;

import java.util.ArrayList;
import java.util.Collections;

public class SocialFriendGroupTreeModel extends BaseTreeModel {
    public td0_2 a0;
    public int JZ;
    public final vp_0 Te0;
    public final vj0_0 jr;

    public SocialFriendGroupTreeModel(vl_0 vl0) {
        this.a0 = td0_2.kC;
        this.JZ = 1;
        this.Te0 = new vp_0();
        vj0_0 vj00 = new vj0_0(vl0);
        this.jr = vj00;
        this.private$(vj00);
        this.Vo0(xe_1.class, new md_2());
        this.Vo0(ia0_1.class, new S3());
        this.uf("/member-table");
        this.p5(true);
        this.Dp0();
        this.Bb(0);
        this.OF();
    }

    @Override
    public final void kz(int i) {
        super.kz(i);
        td0_2[] cols = td0_2.yA;
        if (i >= cols.length) {
            return;
        }
        td0_2 targetCol = cols[i];
        if (this.a0 == targetCol) {
            int newOrder = W0.ng0(this.JZ);
            if (newOrder == 0) {
                throw new NullPointerException("order");
            }
            if (this.JZ != newOrder) {
                this.JZ = newOrder;
                this.OF();
                this.LD0();
            }
        } else {
            if (targetCol == null) {
                throw new NullPointerException("column");
            }
            if (this.a0 != targetCol) {
                this.a0 = targetCol;
                this.OF();
                this.LD0();
            }
        }
    }

    public final void LD0() {
        ArrayList<e70_0> list = new ArrayList<>();
        for (Object obj : tw0_0.rl.a8.qY.values()) {
            e70_0 member = (e70_0) obj;
            if (this.Te0 == null || this.Te0.wM(member)) {
                list.add(member);
            }
        }
        Collections.sort(list, this.a0.R50);
        if (this.JZ == 2) {
            Collections.reverse(list);
        }
        vj0_0 model = this.jr;
        e70_0[] newArr = list.toArray(new e70_0[0]);
        e70_0[] oldArr = model.ve0;
        if (oldArr.length > 0) {
            model.fg0(0, oldArr.length);
        }
        model.ve0 = newArr;
        model.od0(0, newArr.length);
        BB0 bb0 = tw0_0.rl.a8;
        if (bb0.o7) {
            bb0.o7 = false;
        }
    }

    @Override
    public final void HP(zk0_1 zk01) {
        super.HP(zk01);
        BB0 bb0 = tw0_0.rl.a8;
        if (bb0.o7) {
            bb0.o7 = false;
            this.LD0();
        }
    }

    public final void OF() {
        this.LPT6(this.a0.Fs0, this.JZ);
    }
}
