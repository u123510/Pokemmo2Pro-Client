package cn.pokemmo.ui.twl.model;

import f.LB;
import f.M0;
import f.er_0;
import f.nh0_0;

/**
 * 抽象表格数据模型 (AbstractTableModel)
 * 原始混淆类: f.bb_2
 */
public abstract class TwlAbstractTableModel extends M0 implements nh0_0 {
    public LB[] Pj0;

    public Object fh0(int row, int column) {
        return null;
    }

    public final void od0(int first, int count) {
        LB[] rowList = this.Pj0;
        if (rowList != null) {
            for (LB row : rowList) {
                row.rf0.Dx0 = row.rf0.S50.oK0();
                row.rf0.dK0(first, count);
            }
        }
    }

    public final void fg0(int first, int count) {
        LB[] rowList = this.Pj0;
        if (rowList != null) {
            for (LB row : rowList) {
                er_0 model = row.rf0;
                model.getClass();
                int rowCount = model.Dx0;
                if (first < 0 || count < 0 || count > rowCount || first > rowCount - count) {
                    throw new IllegalArgumentException("row");
                }
                row.rf0.Dx0 = row.rf0.S50.oK0();
                row.rf0.c7(first, count);
            }
        }
    }
}
