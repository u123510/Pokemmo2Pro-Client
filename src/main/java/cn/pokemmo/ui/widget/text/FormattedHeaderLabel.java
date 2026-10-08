package cn.pokemmo.ui.widget.text;

import f.*;
import java.util.*;

public class FormattedHeaderLabel extends BaseLabel {
    public CharSequence M7;
    public Y30 T70;
    public ft0_0 W5;
    public final boolean tK0;
    public boolean C50;
    public int Ui0;
    public int KJ;
    public pa0_0 r70;
    public le0_2 uw0;
    public final Br0 zW;
    public final Br0 ww;

    public FormattedHeaderLabel(String v1, String v2) {
        super(v1);
        this.tK0 = true;
        this.Ui0 = -1;
        this.r70 = null;
        this.zW = new Br0(this);
        this.ww = new Br0(this);
        this.Pc(v2);
        this.uf("battlebutton");
    }

    public final Br0 Gx() {
        return this.zW;
    }

    public final void Pc(String v1) {
        if (v1 == null) {
            v1 = "";
        }
        this.M7 = v1;
        this.Ui0 = -1;
        this.KJ = RF.tw0(v1);
        this.C50 = true;
        this.M.Mk(dz_2.F9);
        this.COm3();
    }

    public final void ML0() {
        this.sy0(0.0, null, false);
    }

    public final void sy0(double d1, yw_0 v3, boolean i4) {
        if (this.uw0 == null) {
            this.uw0 = new le0_2(null, false);
            this.F9(this.fU(), this.uw0);
        }
        this.uw0.Ll(v3 != null);
        String style;
        if (v3 == yw_0.Jy) {
            style = "eff-status";
        } else if (d1 < 0.001) {
            style = "eff-i";
        } else if (i4) {
            style = "eff-e";
        } else if (d1 < 1.0) {
            style = "eff-nve";
        } else if (d1 < 2.0) {
            style = "eff-e";
        } else {
            style = "eff-se";
        }
        if (!style.equals(this.uw0.gW)) {
            this.uw0.uf(style);
            this.uw0.yI();
        }
    }

    @Override
    public final void t5() {
        if (this.W5 != null) {
            this.W5.xT();
            this.W5 = null;
        }
        super.t5();
    }

    @Override
    public final void CG(Jn0 v1) {
        super.CG(v1);
        LC0 style = (LC0) v1;
        this.T70 = style.D8("font2");
        if (this.W5 != null) {
            this.W5.xT();
            this.W5 = null;
        }
        pa0_0 alignment = this.Tb;
        Enum<?> configured = (Enum<?>) style.N30(
                "textAlignment2",
                true,
                alignment.getDeclaringClass(),
                null);
        if (configured != null) {
            alignment = (pa0_0) configured;
        }
        this.r70 = alignment;
        this.Ui0 = -1;
        if (this.tK0) {
            this.C50 = true;
        }
    }

    @Override
    public final void FW(zk0_1 v1) {
        this.QD(this.M);
        KG0 batch = this.M;
        if (this.C50) {
            this.C50 = false;
            if (this.tK0 && this.Li() && this.T70 != null) {
                zb0_2 font = (zb0_2) this.T70;
                if (this.W5 == null) {
                    sc_0 data = font.getFont();
                    data.getClass();
                    this.W5 = new ft0_0(data, data.lg0);
                }
                if (this.KJ > 1) {
                    int width = font.computeMultiLineTextWidth(this.M7);
                    pa0_0 alignment = this.r70 == null ? this.Tb : this.r70;
                    this.Ui0 = (int) font.cacheMultiLineText(
                            this.W5,
                            this.M7,
                            width,
                            alignment.uf).PRN;
                } else {
                    this.Ui0 = (int) font.cacheText(this.W5, this.M7).PRN;
                }
            } else {
                this.t5();
            }
        }
        if (!this.Li() || this.T70 == null) {
            return;
        }

        int x = this.A20 + this.e80;
        pa0_0 alignment = this.r70 == null ? this.Tb : this.r70;
        int horizontal = alignment.CB0;
        zb0_2 font = (zb0_2) this.T70;
        if (horizontal > 0) {
            int available = this.a3();
            int width;
            if (this.Ui0 == -1 || this.C50) {
                width = this.KJ > 1
                        ? font.computeMultiLineTextWidth(this.M7)
                        : font.computeTextWidth(this.M7);
                this.Ui0 = width;
            } else {
                width = this.Ui0;
            }
            x += (available - width) * horizontal / 2;
        }

        int y = this.SB0 + this.y9;
        int vertical = alignment.V4;
        if (vertical > 0) {
            int available = this.k5();
            int height = (int) (Math.max(this.KJ, 1) * font.getLineHeightF());
            y += (available - height) * vertical / 2;
            y += this.uw0 == null ? 12 : 4;
        }

        if (this.W5 != null) {
            font.drawFromCache(this.W5, batch, x, y);
        } else {
            font.drawText(batch, x, y, this.M7);
        }
    }

    @Override
    public final void qF0(pa0_0 v1) {
        if (this.Tb != v1) {
            this.C50 = true;
        }
        super.qF0(v1);
    }

    @Override
    public boolean nd0(i70_0 v1) {
        if (E00.ZU(v1.zu) && v1.finally$ == 66) {
            return false;
        }
        return super.nd0(v1);
    }

    @Override
    public void K8() {
        if (this.uw0 == null) {
            return;
        }
        this.uw0.oY(104, 18);
        if (tw0_0.kz0()) {
            this.uw0.oY(208, 36);
            int x = this.uw0.gW.contains("right") ? this.A20 + 110 : this.A20 + 5;
            this.uw0.E40(x, this.SB0 + 75);
        } else {
            this.uw0.E40(this.A20 + 10, this.SB0 + 26);
        }
    }

    @Override
    public final void aUX(zk0_1 v1) {
        super.aUX(v1);
        this.zW.t00();
        this.ww.t00();
    }
}
