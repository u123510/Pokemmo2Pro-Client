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

import f.bb_2;
import f.y0_0;

public class MailboxTableModel extends BaseTableModel {
    public final /* synthetic */ y0_0 TI;

    public MailboxTableModel(y0_0 y0_02) {
        this.TI = y0_02;
    }

    @Override
    public final int oK0() {
        return this.TI.Cu0.length;
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
                return "Inspect";
            }
            return "Status";
        }
        return "Player Name";
    }

    @Override
    public final Object RG0(int n, int n2) {
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    return "";
                }
                return this.TI.ad0[n];
            }
            if (this.TI.Cu0[n].Mg0) {
                return "Online";
            }
            return "Offline";
        }
        return this.TI.Cu0[n].So;
    }

    @Override
    public final Object fh0(int n, int n2) {
        return "";
    }
}

