package cn.pokemmo.ui.widget.table.model;

import f.*;
import java.text.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import cn.pokemmo.ui.widget.table.model.BaseTableModel;

import java.text.SimpleDateFormat;
import java.util.Date;

public class QuestLogTableModel extends BaseTableModel {
    public final vl_0 coM2;
    public e70_0[] ve0;
    public final SimpleDateFormat dY;
    public final String[] oe;

    public QuestLogTableModel(vl_0 owner) {
        super();
        this.ve0 = new e70_0[0];
        this.dY = new SimpleDateFormat("yyyy-MM-dd");
        this.coM2 = owner;
        if (tw0_0.kz0()) {
            this.oe = new String[]{sm0_0.c0(1651), sm0_0.c0(1662), sm0_0.c0(1683)};
        } else {
            this.oe = new String[]{sm0_0.c0(1651), sm0_0.c0(1662)};
        }
    }

    public final int oK0() {
        return this.ve0.length;
    }

    public final int Zy() {
        return this.oe.length;
    }

    public final String LPT7(int index) {
        return this.oe[index];
    }

    public final Object RG0(int row, int column) {
        e70_0 value = this.ve0[row];
        if (column == 0) {
            return value.zJ0;
        }
        if (column == 1) {
            return this.dY.format(new Date((long) value.yc * 1000L));
        }
        if (column == 2) {
            xe_1 button = new xe_1(sm0_0.c0(1663));
            button.RR(new ub0_1(this, value));
            return button;
        }
        return "";
    }

    public final Object fh0(int row, int ignored) {
        StringBuilder builder = new StringBuilder();
        ig_0.u9(1661, builder, "\n");
        builder.append(this.ve0[row].mo);
        return builder.toString();
    }
}
