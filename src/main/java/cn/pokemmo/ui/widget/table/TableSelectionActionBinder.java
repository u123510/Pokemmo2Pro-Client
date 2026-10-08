package cn.pokemmo.ui.widget.table;

import f.*;

public class TableSelectionActionBinder {
    public final pu_2 Wq0;
    public final ws_1 Vg0;
    public Nj w9;

    public TableSelectionActionBinder(ws_1 v1) {
        this.Vg0 = v1;
        this.Wq0 = new pu_2();
        this.Wq0.B8("selectNextRow", this::Is0, 5);
        this.Wq0.B8("selectPreviousRow", this::hM, 5);
        this.Wq0.B8("selectNextPage", this::lW, 5);
        this.Wq0.B8("selectPreviousPage", this::Db0, 5);
        this.Wq0.B8("selectFirstRow", this::H90, 5);
        this.Wq0.B8("selectLastRow", this::DI, 5);
        this.Wq0.B8("extendSelectionToNextRow", this::m5, 5);
        this.Wq0.B8("extendSelectionToPreviousRow", this::Ey, 5);
        this.Wq0.B8("extendSelectionToNextPage", this::At, 5);
        this.Wq0.B8("extendSelectionToPreviousPage", this::Em, 5);
        this.Wq0.B8("extendSelectionToFirstRow", this::b80, 5);
        this.Wq0.B8("extendSelectionToLastRow", this::xv, 5);
        this.Wq0.B8("moveLeadToNextRow", this::l40, 5);
        this.Wq0.B8("moveLeadToPreviousRow", this::q9, 5);
        this.Wq0.B8("moveLeadToNextPage", this::RH0, 5);
        this.Wq0.B8("moveLeadToPreviousPage", this::r30, 5);
        this.Wq0.B8("moveLeadToFirstRow", this::Com7, 5);
        this.Wq0.B8("moveLeadToLastRow", this::yJ0, 5);
        this.Wq0.B8("toggleSelectionOnLeadRow", this::EY, 5);
        this.Wq0.B8("selectAll", this::yE, 5);
        this.Wq0.B8("selectNone", this::bU, 5);
    }

    public final void Is0() {
        Ho(1, 2);
    }

    public final void hM() {
        Ho(-1, 2);
    }

    public final void lW() {
        Ho(Ua(), 2);
    }

    public final void Db0() {
        Ho(-Ua(), 2);
    }

    public final void H90() {
        if (HL0() > 0) {
            jt(0, 2);
        }
    }

    public final void DI() {
        int count = HL0();
        if (count > 0) {
            Ho(count - 1, 2);
        }
    }

    public final void m5() {
        Ho(1, 1);
    }

    public final void Ey() {
        Ho(-1, 1);
    }

    public final void At() {
        Ho(Ua(), 1);
    }

    public final void Em() {
        Ho(-Ua(), 1);
    }

    public final void b80() {
        if (HL0() > 0) {
            jt(0, 1);
        }
    }

    public final void xv() {
        int count = HL0();
        if (count > 0) {
            Ho(count - 1, 1);
        }
    }

    public final void l40() {
        Ho(1, 3);
    }

    public final void q9() {
        Ho(-1, 3);
    }

    public final void RH0() {
        Ho(Ua(), 3);
    }

    public final void r30() {
        Ho(-Ua(), 3);
    }

    public final void Com7() {
        if (HL0() > 0) {
            jt(0, 3);
        }
    }

    public final void yJ0() {
        int count = HL0();
        if (count > 0) {
            jt(count - 1, 3);
        }
    }

    public final void EY() {
        int lead = this.Vg0.aW;
        if (lead > 0) {
            this.Vg0.Ol(lead, lead);
        }
    }

    public final void yE() {
        int count = HL0();
        if (count > 0) {
            this.Vg0.J2(0, count - 1);
        }
    }

    public final void bU() {
        this.Vg0.cd();
    }

    public final void Ho(int i1, int i2) {
        int max = HL0();
        if (max > 0) {
            int current = Math.max(0, this.Vg0.aW);
            int target = Math.max(0, Math.min(max - 1, current + i1));
            jt(target, i2);
        }
    }

    public final void jt(int i1, int i2) {
        if (this.w9 != null) {
            this.w9.zG0(i1);
        }
        if (i2 == 0) {
            this.Vg0.Ol(i1, i1);
        } else if (i2 == 1) {
            int anchor = Math.max(0, this.Vg0.rk);
            this.Vg0.J2(anchor, i1);
        } else if (i2 == 3) {
            this.Vg0.aW = i1;
        } else {
            this.Vg0.J2(i1, i1);
        }
    }

    public final int HL0() {
        if (this.w9 != null) {
            return this.w9.Dx0;
        }
        return 0;
    }

    public final int Ua() {
        if (this.w9 != null) {
            int pageSize = this.w9.Tl - this.w9.wU;
            if (!this.w9.rS) {
                pageSize++;
            }
            return Math.max(1, pageSize);
        }
        return 1;
    }
}
