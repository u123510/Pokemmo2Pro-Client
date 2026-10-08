package cn.pokemmo.ui.widget.edit;

import f.*;

import java.util.logging.Level;
import java.util.logging.Logger;

public class EditFieldAutoCompletionWindow extends tm_0 {
    public final h10_0 pc;
    public final ni0_2 ux0;
    public boolean l7;
    public hf0_0 bN;

    public EditFieldAutoCompletionWindow(cg_0 cg_0) {
        super(cg_0);
        h10_0 h10_0 = new h10_0();
        this.pc = h10_0;
        ni0_2 ni0_2 = new ni0_2(h10_0);
        this.ux0 = ni0_2;
        SL(ni0_2);
        ni0_2.mJ0(new fj0_1((nv_1) this));
    }

    @Override
    public final String Ck() {
        return "editfieldautocompletionwindow";
    }

    public final void Jh() {
        KZ kz = null;
        if (this.bN != null) {
            cg_0 cg_0 = (cg_0) this.gI0;
            int i = cg_0.FC;
            if (i > 0) {
                String str = ((wn0_0) cg_0.dI0).YA.toString();
                KZ kz2 = this.pc.k10;
                if (kz2 != null) {
                    kz = kz2.Gq(str);
                }
                if (kz == null) {
                    try {
                        kz = this.bN.COM3(str, i, this.pc.k10);
                    } catch (Exception e) {
                        Logger.getLogger("EditFieldAutoCompletionWindow").log(Level.SEVERE, "Exception while collecting auto completion results", (Throwable) e);
                    }
                }
            }
        }
        this.pc.k10 = kz;
        this.pc.aD();
        this.l7 = false;
        j6();
    }

    public final void U4() {
        this.pc.k10 = null;
        this.pc.aD();
        j6();
    }

    public final void UU() {
        U4();
    }

    @Override
    public final boolean nd0(i70_0 i70_0) {
        if (!E00.ZU(i70_0.zu)) {
            return super.nd0(i70_0);
        }
        if (this.l7) {
            if (!i70_0.iT()) {
                return true;
            }
            int r9 = dp0.r9(i70_0.finally$);
            if (r9 == 3 || r9 == 123 || r9 == 92 || r9 == 93 || r9 == 19 || r9 == 20) {
                this.ux0.nd0(i70_0);
                return true;
            }
            if (r9 == 66) {
                return kG();
            }
            if (r9 == 111) {
                U4();
                return true;
            }
            if (r9 == 21 || r9 == 22) {
                return false;
            }
            if (i70_0.L8() || i70_0.finally$ == 67) {
                if (!kG()) {
                    U4();
                }
                return false;
            }
            return true;
        }
        int r92 = dp0.r9(i70_0.finally$);
        if (r92 == 19 || r92 == 20 || r92 == 93) {
            this.ux0.nd0(i70_0);
            this.l7 = true;
            j6();
            return this.l7;
        }
        if (r92 == 111) {
            U4();
            return false;
        }
        if (r92 == 62) {
            if ((i70_0.J30 & 36) != 0) {
                Jh();
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean kG() {
        int i = this.ux0.Mw0;
        if (i < 0) {
            return false;
        }
        String str = ((gj_2) this.pc.k10).iX[i];
        str.getClass();
        ((cg_0) this.gI0).mm(str);
        U4();
        return true;
    }

    public final void j6() {
        if (this.pc.ul0() > 0) {
            Ey();
            return;
        }
        this.l7 = false;
        zk0_1 zk0_1 = this.Em0;
        if (zk0_1 != null) {
            zk0_1.ZC0(this);
        }
    }
}
