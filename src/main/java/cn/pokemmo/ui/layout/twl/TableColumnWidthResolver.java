package cn.pokemmo.ui.layout.twl;

import f.Fx0;
import f.Nj;
import f.Zh;
import f.wb_1;

public class TableColumnWidthResolver extends wb_1 {
    public final Nj Ri;

    public TableColumnWidthResolver(Nj v1, int i2) {
        super(i2);
        this.Ri = v1;
    }

    public void DE(int i1, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            Zh zh = this.Ri.Xt(i1);
            int i7 = 0;
            for (int i8 = 0; i8 < this.Ri.gc0; i8++) {
                Fx0 fx = this.Ri.Dd0(i1, i8, zh);
                if (fx != null) {
                    i7 = Math.max(i7, fx.rm0());
                    i8 += Math.max(0, fx.y8() - 1);
                }
            }
            this.p2[i1] = i7;
            i1++;
        }
    }
}
