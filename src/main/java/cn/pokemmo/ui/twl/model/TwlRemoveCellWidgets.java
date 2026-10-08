package cn.pokemmo.ui.twl.model;

import f.NH0;
import f.Nj;
import f.XL;
import f.cw0_0;
import f.le0_2;

/**
 * 表格单元格控件移除回调 (TableBase.RemoveCellWidgets)
 */
public class TwlRemoveCellWidgets implements XL {
    public final Nj owner;

    public TwlRemoveCellWidgets(Nj owner) {
        this.owner = owner;
    }

    public Nj getOwner() {
        return this.owner;
    }

    @Override
    public void cOm6(int row, int column, cw0_0 widget) {
        le0_2 child = ((NH0) widget).wH;
        if (child != null) {
            Nj owner = this.owner;
            int idx = owner.b2.Dp(child);
            if (idx >= 0) {
                owner.b2.fC0(idx);
            }
        }
    }
}
