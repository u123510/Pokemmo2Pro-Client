package cn.pokemmo.ui.widget.table.model;

import f.*;
import java.text.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import cn.pokemmo.ui.widget.table.model.BaseTableModel;

public class GuildMemberTableModel extends BaseTableModel {
    public final xe_1[] lPT1;
    public final Ju0 Bv;

    public GuildMemberTableModel(Ju0 v1, xe_1[] v2) {
        this.Bv = v1;
        this.lPT1 = v2;
    }

    public final int oK0() {
        return this.Bv.ts.size();
    }

    public final int Zy() {
        return 3;
    }

    public final String LPT7(int i1) {
        if (i1 == 0) {
            return "Name";
        }
        if (i1 == 1) {
            return "Value";
        }
        return "";
    }

    public final Object RG0(int i1, int i2) {
        if (i2 == 0) {
            return this.Bv.ts.get(i1);
        }
        if (i2 == 1) {
            return this.Bv.yq0.get(i1);
        }
        if (i2 == 2) {
            xe_1 elem = this.lPT1[i1];
            if (elem == null) {
                return "";
            }
            return elem;
        }
        return "";
    }

    public final Object fh0(int i1, int i2) {
        return "";
    }
}
