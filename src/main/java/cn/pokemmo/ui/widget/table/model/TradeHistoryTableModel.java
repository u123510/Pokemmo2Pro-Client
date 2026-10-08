package cn.pokemmo.ui.widget.table.model;

import cn.pokemmo.ui.widget.tree.TradeItemTreeModel;
import f.*;
import java.text.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import cn.pokemmo.ui.widget.table.model.BaseTableModel;
import java.text.SimpleDateFormat;



public class TradeHistoryTableModel extends BaseTableModel {
    public zp0_0[] Tu;
    public final SimpleDateFormat bR;
    public xe_1[] bG;
    public final String[] Hx0;
    public final TradeItemTreeModel oh0;

    public TradeHistoryTableModel(TradeItemTreeModel owner) {
        super();
        this.oh0 = owner;
        this.Tu = new zp0_0[0];
        this.bR = new SimpleDateFormat("yyyy-MM-dd");
        this.bG = new xe_1[0];
        this.Hx0 = new String[]{
                sm0_0.c0(9155),
                sm0_0.c0(9156),
                sm0_0.c0(9157),
                sm0_0.c0(9158)
        };
    }

    @Override
    public final int oK0() {
        return this.Tu.length;
    }

    @Override
    public final int Zy() {
        return this.Hx0.length;
    }

    @Override
    public final String LPT7(int column) {
        return this.Hx0[column];
    }

    @Override
    public final Object RG0(int rowIndex, int column) {
        zp0_0 row = this.Tu[rowIndex];
        switch (column) {
            case 0:
                if (this.bG[rowIndex] == null) {
                    this.bG[rowIndex] = new xe_1(row.Y10());
                    this.bG[rowIndex].yj0 = row.Y10();
                    this.bG[rowIndex].yB0();
                    this.bG[rowIndex].RR(new qa0_2(this, row));
                }
                return this.bG[rowIndex];
            case 1:
                return Short.valueOf(row.H10);
            case 2:
                return this.bR.format(Long.valueOf(row.th0));
            case 3:
                return sm0_0.c0(row.NO + 9200);
            default:
                return "";
        }
    }

    @Override
    public final Object fh0(int rowIndex, int column) {
        zp0_0 row = this.Tu[rowIndex];
        if (column != 0) {
            return "";
        }
        return row.Y10();
    }
}