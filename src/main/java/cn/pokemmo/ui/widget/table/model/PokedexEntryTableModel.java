package cn.pokemmo.ui.widget.table.model;

import f.*;
import java.text.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import cn.pokemmo.ui.widget.table.model.BaseTableModel;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PokedexEntryTableModel extends BaseTableModel {
    public GR[] hu0;
    public final SimpleDateFormat vp;
    public final String[] Om;

    public PokedexEntryTableModel() {
        this.hu0 = new GR[0];
        this.vp = new SimpleDateFormat("yyyy-MM-dd");
        if (tw0_0.kz0()) {
            this.Om = new String[] {
                sm0_0.c0(1651),
                sm0_0.c0(1652),
                sm0_0.c0(1659),
                sm0_0.c0(1683)
            };
        } else {
            this.Om = new String[] {
                sm0_0.c0(1651),
                sm0_0.c0(1652),
                sm0_0.c0(1659)
            };
        }
    }

    @Override
    public final int oK0() {
        return this.hu0.length;
    }

    @Override
    public final int Zy() {
        return this.Om.length;
    }

    @Override
    public final String LPT7(int i) {
        return this.Om[i];
    }

    @Override
    public final Object RG0(int i, int i2) {
        GR gr = this.hu0[i];
        switch (i2) {
            case 0: {
                OT ot;
                if (gr.WS.equals(tw0_0.e60.dj0)) {
                    ot = new OT(0, 0, tw0_0.e60.jB0);
                    ot.iB(true);
                } else {
                    ot = new OT(0, 0, gr.QB0);
                    ot.iB(gr.qc);
                }

                if (tw0_0.kz0()) {
                    ot.Te0(-28, -52);
                    ot.J60.Ta = 2;
                } else {
                    ot.Te0(-14, -26);
                }

                ia0_1 ia0_1Var = new ia0_1(1);
                px_0 px_0Var = new px_0(gr.QB0.DR);
                px_0Var.uf("label");
                px_0Var.lv = false;
                ia0_1Var.F9(ia0_1Var.fU(), ot);
                ia0_1Var.F9(ia0_1Var.fU(), px_0Var);
                return ia0_1Var;
            }
            case 1:
                return this.vp.format(new Date(gr.Em * 1000L));
            case 2:
                if (gr.qc) {
                    return sm0_0.c0(1678);
                }
                return this.vp.format(new Date(gr.QB0.gw * 1000L));
            case 3: {
                xe_1 xe_1Var = new xe_1(sm0_0.c0(1683));
                xe_1Var.RR(new UI(gr, xe_1Var));
                return xe_1Var;
            }
            default:
                return "";
        }
    }

    @Override
    public final Object fh0(int i, int i2) {
        return "";
    }
}
