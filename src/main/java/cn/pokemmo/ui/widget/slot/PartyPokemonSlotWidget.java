package cn.pokemmo.ui.widget.slot;

import f.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import cn.pokemmo.ui.widget.slot.BaseItemSlotWidget;

public class PartyPokemonSlotWidget extends BaseItemSlotWidget {
    public CH0 qi;

    public PartyPokemonSlotWidget() {
        super((short) 0, CH0.j1, (short) 0, (short) 0, true);
        this.qi = CH0.j1;
        if (tw0_0.kz0()) {
            this.ge = 25;
            this.ej0 = 25;
            this.zW.EJ0 = 2.0f;
            uf("itemplate");
        } else {
            this.ge = 12;
            this.ej0 = 6;
            uf("item-slot");
        }
    }

    @Override
    public final boolean nd0(i70_0 i70_0Var) {
        if (E00.ZU(i70_0Var.zu) && i70_0Var.iT()) {
            int i = i70_0Var.finally$;
            int dummy = dw_2.ff;
            rp_0 rp_0Var = rp_0.sJ0;
            if (rp_0Var != null && rp_0Var.Ov(i)) {
                this.M40.run();
                return true;
            }
        }
        return super.nd0(i70_0Var);
    }

    @Override
    public final void Uj0(byte b, short s, short s2) {
        this.qi = CH0.j1;
        super.Uj0(b, s, s2);
    }

    @Override
    public final void Ez0() {
        if (!tw0_0.kz0()) {
            super.Ez0();
            return;
        }
        a7_0.bH(this.ER.Fc0);
        this.GH0 = 100;
        short s = this.wE0;
        if (s < 1) {
            SU("");
            this.yj0 = null;
            yB0();
            return;
        }
        mc0_1 lPT6 = gu0.l2.lPT6(s);
        if (this.ax > -1) {
            String str = this.ax + "x " + sm0_0.c0(lPT6.Nl);
            if (str.length() > 20) {
                str = str.substring(0, 17) + "...";
            }
            SU(str);
        } else {
            SU("");
        }
    }

    @Override
    public final void UR(K5 k5) {
        if (k5 == null) {
            Uj0((byte) 0, (short) 0, (short) 0);
            this.qi = CH0.j1;
            return;
        }
        mc0_1 mc0_1Var = k5.cL;
        if (mc0_1Var == null) {
            return;
        }
        hl0_0 hl0_0Var = k5.nn;
        short s = hl0_0Var.PA0;
        if (s > 1) {
            uf0_0 uf0_0Var = (uf0_0) jq0_0.tK0(Qy0.yI0, uf0_0.class);
            if (uf0_0Var != null) {
                lpt6__0.v90(uf0_0Var);
                return;
            }
            String str = sm0_0.wa0(8033, sm0_0.c0(mc0_1Var.Nl));
            uf0_0 uf0_0Var2 = new uf0_0(str, s, new Qp0(this, k5), (le0_2) null);
            Qy0.yI0.F9(Qy0.yI0.fU(), uf0_0Var2);
            return;
        }
        Uj0(hl0_0Var.N50, hl0_0Var.wQ, s);
        this.qi = k5.nn.Br;
    }

    @Override
    public final void K8() {
        if (tw0_0.kz0()) {
            RY(300, 100);
            g2(300, 100);
            oY(300, 100);
        } else {
            RY(48, 48);
            g2(48, 48);
            oY(48, 48);
        }
    }
}
