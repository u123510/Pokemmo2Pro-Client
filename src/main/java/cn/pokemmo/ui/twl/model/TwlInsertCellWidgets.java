package cn.pokemmo.ui.twl.model;

import f.Gy0;
import f.NA;
import f.NH0;
import f.Nj;
import f.XL;
import f.cw0_0;
import f.le0_2;

/**
 * 表格单元格控件插入回调 (TableBase.InsertCellWidgets)
 */
public class TwlInsertCellWidgets implements XL {
    public final Nj owner;

    public TwlInsertCellWidgets(Nj owner) {
        this.owner = owner;
    }

    public Nj getOwner() {
        return this.owner;
    }

    @Override
    public void cOm6(int row, int column, cw0_0 widget) {
        Nj owner = this.owner;
        NH0 source = (NH0) widget;
        NA target = (NA) owner.Dd0(row, column, null);
        le0_2 child = source.wH;
        if (child != null) {
            Gy0 parent = owner.b2;
            if (child.K20 != parent) {
                parent.F9(parent.fU(), child);
            }
            owner.P9(column);
            int columnStart = owner.ey.eC0(column);
            int width = owner.Us0(column) - columnStart;
            int rowStart = owner.DH(row);
            int height = owner.Ut(row) - rowStart;
            int posX = owner.E60() + columnStart;
            int posY = owner.SB0 + owner.y9 - owner.eL + owner.mq + rowStart;
            target.NM(child, posX, posY, width, height);
        }
    }
}
