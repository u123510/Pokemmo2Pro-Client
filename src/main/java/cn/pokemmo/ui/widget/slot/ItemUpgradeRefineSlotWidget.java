package cn.pokemmo.ui.widget.slot;

import f.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import cn.pokemmo.ui.widget.slot.BaseItemSlotWidget;

public class ItemUpgradeRefineSlotWidget extends BaseItemSlotWidget {
    public final VU XV;
    public final cn_0 Mw;

    public ItemUpgradeRefineSlotWidget(Mj v1, VU v2, HJ0 v3, short i4) {
        super(i4 > 0 ? i4 : (short) 0, CH0.j1, (short) -1, (short) 0, true);
        this.XV = v2;
        this.Mw = v3;
        Ez0();
        this.ge = 6;
        this.ej0 = 6;
        uf("widget");
        of(() -> TK0(v1));
    }

    @Override
    public final void Uj0(byte i1, short i2, short i3) {
        throw null;
    }

    @Override
    public final void Ez0() {
        super.Ez0();
        if (this.Mw == null) {
            return;
        }
        short s = this.wE0;
        if (s > 0) {
            mc0_1 mc0_1Var = gu0.l2.lPT6(s);
            String name = sm0_0.c0(mc0_1Var.Nl);
            if (name.length() > 12) {
                this.Mw.Sk(sm0_0.c0(mc0_1Var.Nl).substring(0, 12).trim() + "...");
            } else {
                this.Mw.Sk(sm0_0.c0(mc0_1Var.Nl));
            }
            this.Mw.Xr0(lb0_2.Sp0(mc0_1Var, true, false));
            this.Mw.GH0 = 150;
        } else {
            this.Mw.Sk(sm0_0.c0(nf0_0.Po));
            this.Mw.Xr0((Object) null);
        }
    }

    public final void UR(K5 v1) {
        if (v1 != null) {
            if (v1.cL == null) {
                return;
            }
            tw0_0.rl.fk0.uQ(new SF0(this.XV.I8.JF, this.XV.pu, v1.nn.wQ));
            this.lO = v1.nn.Br;
        } else {
            VU vu = this.XV;
            if (vu != null) {
                tw0_0.rl.fk0.uQ(new SF0(vu.I8.JF, vu.pu, (short) -1));
            }
            super.Uj0((byte) 0, (short) 0, (short) 0);
            this.lO = CH0.j1;
        }
    }

    @Override
    public final void K8() {
        RY(36, 36);
        g2(36, 36);
        oY(36, 36);
    }

    @Override
    public final boolean nd0(i70_0 v1) {
        if (v1.Li() && v1.zu == 4 && v1.nA0 == 0 && (v1.J30 & 36) != 0 && this.wE0 > 0 && this.XV != null) {
            UR((K5) null);
            return true;
        }
        return super.nd0(v1);
    }

    public final void TK0(Mj v1) {
        if (v1 == null) {
            return;
        }
        yo_0 yo_0Var = v1.Jn0 == _volatile.Kb ? pv0_0.k0 : pv0_0.lU;
        boolean z = this.wE0 > 0;
        UA.zd(pv0_0.S20(this, yo_0Var, z), this);
    }
}
