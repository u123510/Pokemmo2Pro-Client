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

import f.COm8_;
import f.P70;
import f.X90;
import f.bb_2;
import f.r;
import f.sm0_0;
import f.xe_1;
import java.text.SimpleDateFormat;

/*
 * Renamed from f.cA
 */
public class AuctionHouseTableModel extends BaseTableModel {
    public static final String[] Mk0 = new String[]{sm0_0.c0(3200), sm0_0.c0(3201), "", ""};
    public X90[] Ts0 = new X90[0];
    public final COm8_ kz;

    public AuctionHouseTableModel(COm8_ cOm8_) {
        new SimpleDateFormat("yyyy-MM-dd");
        this.kz = cOm8_;
    }

    @Override
    public final int oK0() {
        return this.Ts0.length;
    }

    @Override
    public final int Zy() {
        return Mk0.length;
    }

    @Override
    public final String LPT7(int n) {
        return Mk0[n];
    }

    @Override
    public final Object RG0(int n, int n2) {
        if (n < 0 || n >= this.Ts0.length) {
            return "";
        }
        X90 x90 = this.Ts0[n];
        if (x90 == null) {
            return "";
        }
        switch (n2) {
            default: {
                return "";
            }
            case 3: {
                xe_1 xe_12 = new xe_1("X");
                r r4 = new r(this, x90);
                xe_12.RR(r4);
                return xe_12;
            }
            case 2: {
                if (!x90.yt()) {
                    return "";
                }
                xe_1 xe_13 = new xe_1("");
                xe_13.uf("button-wheel");
                P70 p702 = new P70(this, x90);
                xe_13.RR(p702);
                return xe_13;
            }
            case 1: {
                return x90.SG;
            }
            case 0: 
        }
        return x90.HQ();
    }

    @Override
    public final Object fh0(int n, int n2) {
        return "";
    }
}

