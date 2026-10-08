/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.ui.widget.table.model;

import f.*;
import java.text.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import cn.pokemmo.ui.widget.table.model.BaseTableModel;

import f.P1;
import f.bb_2;
import f.th_0;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * Renamed from f.gA
 */
public class RankLadderTableModel extends BaseTableModel {
    public final /* synthetic */ P1 zd;

    public RankLadderTableModel(P1 p1) {
        this.zd = p1;
    }

    @Override
    public final int oK0() {
        return this.zd.tj.size();
    }

    @Override
    public final int Zy() {
        return 4;
    }

    @Override
    public final String LPT7(int n) {
        switch (n) {
            default: {
                return "";
            }
            case 3: {
                return "Delete";
            }
            case 2: {
                return "Note";
            }
            case 1: {
                return "Date";
            }
            case 0: 
        }
        return "Staff";
    }

    @Override
    public final Object RG0(int n, int n2) {
        switch (n2) {
            default: {
                return "";
            }
            case 3: {
                return this.zd.wn0[n];
            }
            case 2: {
                return ((th_0)this.zd.tj.get((int)n)).ge0.replace("REASON:", "\nREASON:");
            }
            case 1: {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a");
                Date date = new Date();
                date.setTime((long)((th_0)this.zd.tj.get((int)n)).Bx * 1000L);
                return simpleDateFormat.format(date);
            }
            case 0: 
        }
        return ((th_0)this.zd.tj.get((int)n)).UG;
    }

    @Override
    public final Object fh0(int n, int n2) {
        if (n2 != 0) {
            if (n2 != 2) {
                return "";
            }
            return ((th_0)this.zd.tj.get((int)n)).ge0.replace("REASON:", "\nREASON:");
        }
        return ((th_0)this.zd.tj.get((int)n)).UG;
    }
}

