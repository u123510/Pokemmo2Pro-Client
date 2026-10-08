package cn.pokemmo.ui.widget.table.model;

import f.*;
import java.text.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import cn.pokemmo.ui.widget.table.model.BaseTableModel;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class KeyBindingTableModel extends BaseTableModel {
    public static final SimpleDateFormat Qc0 = new SimpleDateFormat("dd/MM/yyyy hh:mm a z");
    public final k80_0 Cj;
    public final ad_2[] h6;
    public final String[] lc;
    public final ia0_1[] JW;
    public final Date[] l4;
    public final String[] Yv;

    public KeyBindingTableModel(k80_0 k80_0Var, ad_2[] ad_2VarArr) {
        this.Cj = k80_0Var;
        this.h6 = ad_2VarArr;
        int length = ad_2VarArr.length;
        this.JW = new ia0_1[length];
        this.l4 = new Date[length];
        this.Yv = new String[length];
        this.lc = new String[]{"", sm0_0.c0(1130), sm0_0.c0(1131), sm0_0.c0(5837)};
    }

    @Override
    public final int oK0() {
        return Math.max(1, this.h6.length);
    }

    @Override
    public final int Zy() {
        return this.lc.length;
    }

    @Override
    public final String LPT7(int i1) {
        return this.lc[i1];
    }

    @Override
    public final Object RG0(int i1, int i2) {
        ad_2[] ad_2Arr = this.h6;
        if (i1 >= ad_2Arr.length) {
            return "--";
        }
        ad_2 ad_2Var = ad_2Arr[i1];
        switch (i2) {
            case 0:
                return Integer.toString(i1 + 1);
            case 1:
                ia0_1 ia0_1Var = this.JW[i1];
                if (ia0_1Var != null) {
                    return ia0_1Var;
                }
                wp_0[] wp_0Arr = (wp_0[]) Arrays.copyOf(ad_2Var.d4, this.Cj.xA);
                int length = wp_0Arr.length;
                OT[] otArr = new OT[length];
                StringBuilder sb = new StringBuilder();
                if (tw0_0.kz0()) {
                    sb.append("       ");
                } else {
                    sb.append("  ");
                }
                boolean isSelf = false;
                for (int j = 0; j < wp_0Arr.length; j++) {
                    wp_0 wp_0Var = wp_0Arr[j];
                    cd0_2 oV = wp_0Var == null ? null : wp_0Var.oV();
                    if (tw0_0.kz0()) {
                        OT ot = new OT(24, 50, oV);
                        otArr[j] = ot;
                        ot.J60.Ta = 2;
                        ot.Te0(-17, -28);
                    } else {
                        otArr[j] = new OT(12, 24, oV);
                    }
                    if (wp_0Arr[j] == null) {
                        otArr[j].Ll(false);
                    } else {
                        isSelf |= wp_0Var.eU().equals(tw0_0.e60.dj0);
                        sb.append(wp_0Arr[j].oV().DR);
                        if (j != wp_0Arr.length - 1 && wp_0Arr[j + 1] != null) {
                            sb.append(", ");
                        }
                    }
                }
                String str = sb.toString();
                int maxLen = tw0_0.kz0() ? 60 : 43;
                if (str.length() > maxLen) {
                    str = str.substring(0, maxLen - 1) + "..";
                    this.Yv[i1] = sb.toString();
                }
                ia0_1 boxLayout = new ia0_1(1);
                pu_0 label = new pu_0(str);
                label.uf(isSelf ? "label" : "label-self");
                label.lv = false;
                for (int k = 0; k < length; k++) {
                    boxLayout.F9(boxLayout.fU(), otArr[k]);
                }
                boxLayout.F9(boxLayout.fU(), label);
                this.JW[i1] = boxLayout;
                return boxLayout;
            case 2:
                return NumberFormat.getInstance().format(ad_2Var.ly0);
            case 3:
                if (this.l4[i1] == null) {
                    this.l4[i1] = new Date(ad_2Var.Bf * 1000L);
                }
                return Qc0.format(this.l4[i1]);
            default:
                return "";
        }
    }

    @Override
    public final Object fh0(int i1, int i2) {
        if (i1 < this.h6.length) {
            String str = this.Yv[i1];
            if (str != null) {
                return str;
            }
        }
        return "";
    }
}
