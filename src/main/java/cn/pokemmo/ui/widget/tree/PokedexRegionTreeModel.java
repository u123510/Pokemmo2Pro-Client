package cn.pokemmo.ui.widget.tree;

import f.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import cn.pokemmo.ui.widget.tree.BaseTreeModel;

import java.util.ArrayList;
import java.util.Collections;

public class PokedexRegionTreeModel extends BaseTreeModel {
    public Se Yz = Se.IK0;
    public int k2 = 2;
    public final hg_0 uA = new hg_0();
    public final PX ZX;
    public final pk_0 Dw0;

    public PokedexRegionTreeModel(pk_0 owner, ab_1 context) {
        this.Dw0 = owner;
        this.ZX = new PX(owner, context);
        this.private$(this.ZX);
        this.Vo0(xe_1.class, new md_2());
        this.Vo0(ia0_1.class, new S3());
        this.uf("/member-table");
        this.p5(true);
        this.Dp0();
        this.Bb(0);
        this.CG();
    }

    @Override
    public void kz(int index) {
        super.kz(index);
        Se[] columns = Se.g00;
        if (columns.length <= index) {
            return;
        }
        Se column = columns[index];
        if (column == this.Yz) {
            int order = (this.k2 == 1) ? 2 : 1;
            if (order == 0) {
                throw new NullPointerException("order");
            }
            if (this.k2 != order) {
                this.k2 = order;
                this.CG();
                this.tf0();
            }
            return;
        }
        if (column == null) {
            throw new NullPointerException("column");
        }
        if (this.Yz != column) {
            this.Yz = column;
            this.CG();
            this.tf0();
        }
    }

    public void tf0() {
        ArrayList<ce0_0> members = new ArrayList<>();
        for (ce0_0 member : this.Dw0.UH()) {
            if (this.uA == null || this.uA.iH0(member)) {
                members.add(member);
            }
        }
        Collections.sort(members, this.Yz.WR);
        if (this.k2 == 2) {
            Collections.reverse(members);
        }

        PX table = this.ZX;
        ce0_0[] values = members.toArray(new ce0_0[0]);
        table.Yr0 = new ia0_1[values.length];
        ce0_0[] previous = table.jy;
        if (previous.length > 0) {
            table.fg0(0, previous.length);
        }
        table.jy = values;
        table.od0(0, values.length);
        this.ZX.getClass();
        this.K8();
    }

    public void If0(String value, boolean enabled) {
        this.uA.hx0 = enabled;
        this.uA.Kj0 = value;
        this.tf0();
    }

    public void CG() {
        this.LPT6(this.Yz.Uj, this.k2);
    }
}
