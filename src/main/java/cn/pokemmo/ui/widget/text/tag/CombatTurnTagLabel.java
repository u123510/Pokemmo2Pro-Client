package cn.pokemmo.ui.widget.text.tag;

import f.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import cn.pokemmo.ui.widget.text.tag.BaseTaggedLabelWidget;

public class CombatTurnTagLabel extends BaseTaggedLabelWidget implements dn0_0 {
    public static final MD0 xr0;
    public Ri0 Nd;
    public boolean Ik0;
    public K5 nUL;

    static {
        xr0 = MD0.cB("dragActive");
        MD0.cB("dropOk");
        MD0.cB("dropBlocked");
    }

    public CombatTurnTagLabel(jc_2 v1, HD0 v2, K5 v3, short i4) {
        super("", tw0_0.kz0() ? 80 : 40, tw0_0.kz0() ? 80 : 42);
        uf("inventory-button");
        SU("x" + (int) i4);
        this.z70 = new N1(new t5_0(this));
        this.tp0.Nk(new Wr[]{gh_1.aH0.F10(v3.cL, false)});
        this.tp0.gY = 0;
        this.tp0.a4 = 3;
        if (tw0_0.kz0()) {
            this.tp0.OA0 = true;
            this.tp0.IF = 48;
            this.tp0.gx0 = 48;
        } else {
            this.tp0.OA0 = true;
            this.tp0.IF = 24;
            this.tp0.gx0 = 24;
        }
        this.W3 = pa0_0.dC0;
        if (tw0_0.kz0()) {
            SU(i4 + "x " + v3.Ua());
            this.iK = 400;
            this.oY = 60;
            oY(400, 60);
            RY(400, 60);
            g2(400, 60);
            pa0_0 xE = pa0_0.xE;
            qF0(xE);
            this.W3 = xE;
        }
        short unused = v3.nn.wQ;
        this.nUL = v3;
        RR(new UD0(this, v2, v3, v1));
    }

    @Override
    public final boolean nd0(i70_0 v1) {
        if (E00.C10(v1.zu)) {
            Qy0.yI0.zm0();
        }
        if (tw0_0.kz0()) {
            return super.nd0(v1);
        }
        if (v1.Li()) {
            if (this.Ik0) {
                if (v1.LI0()) {
                    Ri0 r = this.Nd;
                    if (r != null) {
                        Ms0.Bs0(r.Iy0, this, v1);
                    }
                    this.Ik0 = false;
                    this.M.j70(xr0, false);
                } else {
                    Ri0 r = this.Nd;
                    if (r != null) {
                        r.Iy0.hU(v1);
                    }
                }
                return true;
            }
            if (v1.VP) {
                this.Ik0 = true;
                this.M.j70(xr0, true);
                Ri0 r = this.Nd;
                if (r != null) {
                    Ms0.K60(r.Iy0, this, v1);
                }
            } else {
                int zu = v1.zu;
                if (E00.C10(zu)) {
                    int na = v1.nA0;
                    if ((na == 0 || na == 1) && zu == 4) {
                        a7_0.bH(this.ER.Fc0);
                        return true;
                    }
                }
            }
        }
        return super.nd0(v1);
    }

    @Override
    public final void UR(K5 v1) {
        short unused = v1.nn.wQ;
        this.nUL = v1;
        this.tp0.Nk(new Wr[]{gh_1.aH0.F10(v1.cL, false)});
    }

    @Override
    public final K5 Ft0() {
        return this.nUL;
    }

    public final boolean f2() {
        return !tw0_0.kz0();
    }

    @Override
    public final void Kp0(zk0_1 v1, int i2, int i3, int i4) {
        if (!tw0_0.kz0()) {
            this.tp0.mt0(i2, i3);
        }
    }

    @Override
    public final void Dw0(zk0_1 v1) {
        if (!this.Ik0) {
            super.Dw0(v1);
        }
    }
}
