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

import f.FB0;
import f.bb_2;
import f.kp_1;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CosmeticInventoryTableModel extends BaseTableModel {
    @Override
    public final int oK0() {
        return FB0.By0.size();
    }

    @Override
    public final int Zy() {
        return 3;
    }

    @Override
    public final String LPT7(int n) {
        if (n != 0) {
            if (n != 1) {
                if (n != 2) {
                    return "";
                }
                return "时间";
            }
            return "操作/状态";
        }
        return "玩家名称";
    }

    @Override
    public final Object RG0(int n, int n2) {
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    return "";
                }
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a");
                Date date = new Date();
                date.setTime((long)((kp_1)FB0.By0.get((int)n)).dG0 * 1000L);
                return simpleDateFormat.format(date);
            }
            return ((kp_1)FB0.By0.get((int)n)).sb0;
        }
        return ((kp_1)FB0.By0.get((int)n)).a60;
    }

    @Override
    public final Object fh0(int n, int n2) {
        return "";
    }
}

