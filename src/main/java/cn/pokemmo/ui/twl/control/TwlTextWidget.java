package cn.pokemmo.ui.twl.control;

import f.*;
import cn.pokemmo.ui.twl.core.*;
import cn.pokemmo.ui.twl.renderer.*;

/**
 * 基础文本显示控件 (TextWidget)
 */
public class TwlTextWidget extends le0_2 {
    public static final MD0 H7;
    public static final MD0 F9;
    public Y30 x70;
    public ft0_0 SJ;
    public CharSequence j50;
    public int Bs;
    public int J8;
    public int S00;
    public boolean Sf;
    public boolean Zl0;
    public pa0_0 Tb;
    public String V00;
    public boolean kW;

    static {
        H7 = MD0.cB("hover");
        F9 = MD0.cB("textChanged");
        MD0.cB("textSelection");
    }

    public TwlTextWidget() {
        this(null, false);
    }

    public TwlTextWidget(KG0 kg0) {
        this(kg0, false);
    }

    public TwlTextWidget(KG0 kg0, boolean b) {
        super(kg0, b);
        this.Bs = -1;
        this.J8 = -1;
        this.Sf = true;
        this.Tb = pa0_0.qQ;
        this.V00 = null;
        this.j50 = "";
    }

    public String Ck() {
        return "textwidget";
    }

    public void df(Y30 y30) {
        ft0_0 ft0_0 = this.SJ;
        if (ft0_0 != null) {
            ft0_0.xT();
            this.SJ = null;
        }
        this.x70 = y30;
        if (this.Sf) {
            this.Zl0 = true;
        }
    }

    public final void B(CharSequence charSequence) {
        if (charSequence != null) {
            this.j50 = charSequence;
            this.S00 = RF.tw0(charSequence);
            this.Zl0 = true;
            this.M.Mk(F9);
            return;
        }
        throw new NullPointerException("text");
    }

    public final boolean Li() {
        return this.S00 > 0;
    }

    public void qF0(pa0_0 pa0_0) {
        if (pa0_0 != null) {
            if (this.Tb != pa0_0) {
                this.Tb = pa0_0;
                this.Zl0 = true;
            }
            return;
        }
        throw new NullPointerException("alignment");
    }

    public void CG(Jn0 jn0) {
        LC0 lc0 = (LC0) jn0;
        df(lc0.D8("font"));
        Enum enumVal = (Enum) lc0.N30("textAlignment", true, pa0_0.qQ.getDeclaringClass(), null);
        pa0_0 pa = pa0_0.qQ;
        if (enumVal != null) {
            pa = (pa0_0) enumVal;
        }
        qF0(pa);
    }

    @Override
    public void Ib(Jn0 jn0) {
        super.Ib(jn0);
        CG(jn0);
    }

    @Override
    public void t5() {
        ft0_0 ft0_0 = this.SJ;
        if (ft0_0 != null) {
            ft0_0.xT();
            this.SJ = null;
        }
        super.t5();
    }

    public int Pk(boolean b) {
        int i = this.A20 + this.e80;
        if (b) {
            byte b2 = this.Tb.CB0;
            if (b2 > 0) {
                return ((a3() - hr0()) * b2 / 2) + i;
            }
        }
        return i;
    }

    public final int hC() {
        int i = this.SB0 + this.y9;
        byte b = this.Tb.V4;
        if (b > 0) {
            return ((((k5() - Ob()) * b) / 2) + i) - ((zb0_2) this.x70).getBaseLine();
        }
        return i;
    }

    @Override
    public void Ej0() {
        super.bA0();
        this.Zl0 = true;
    }

    @Override
    public void FW(zk0_1 zk0_1) {
        QD(this.M);
    }

    @Override
    public int pi0() {
        int max = super.pi0();
        if (Li() && this.x70 != null) {
            return Math.max(max, hr0());
        }
        return max;
    }

    @Override
    public int zs0() {
        int max = super.zs0();
        if (Li() && this.x70 != null) {
            return Math.max(max, Ob());
        }
        return max;
    }

    public final int hr0() {
        boolean z = this.Zl0;
        if (!z && this.Sf) {
            return this.Bs;
        }
        Y30 y30 = this.x70;
        if (y30 == null) {
            return 0;
        }
        if (z || !this.Sf) {
            if (this.S00 <= 1 && !this.kW) {
                this.Bs = ((zb0_2) y30).computeTextWidth(this.j50);
            } else {
                this.Bs = ((zb0_2) y30).computeMultiLineTextWidth(this.j50, super.pi0(), this.kW);
            }
        }
        return this.Bs;
    }

    public final int Ob() {
        if (!this.Zl0 && this.Sf) {
            return this.J8;
        }
        if (this.x70 != null) {
            int round = (int) (((zb0_2) this.x70).getLineHeightF() * (float) Math.max(1, this.S00));
            this.J8 = round;
            return round;
        }
        return 0;
    }

    public final void k50(i70_0 i70_0) {
        int i = i70_0.zu;
        if (E00.C10(i) && !this.z7) {
            this.M.j70(H7, i != 7);
        }
    }

    public final void m90() {
        if (this.Sf) {
            this.Sf = false;
            this.Zl0 = true;
        }
    }

    public final void QD(KG0 kg0) {
        if (this.Zl0) {
            this.Zl0 = false;
            if (this.Sf && Li() && this.x70 != null && !((zb0_2) this.x70).isMarkupEnabled()) {
                ft0_0 ft0_0 = this.SJ;
                if (ft0_0 == null) {
                    sc_0 font = ((zb0_2) this.x70).getFont();
                    font.getClass();
                    this.SJ = new ft0_0(font, font.lg0);
                } else {
                    ft0_0.xT();
                }
                lpt3__5 cacheMultiLineText = ((zb0_2) this.x70).cacheMultiLineText(this.SJ, this.j50, a3(), this.Tb.uf, this.kW, this.V00);
                this.Bs = (int) cacheMultiLineText.PRN;
                if (this.kW) {
                    this.J8 = (int) cacheMultiLineText.gv0;
                } else {
                    this.J8 = (int) (((zb0_2) this.x70).getLineHeightF() * (float) this.S00);
                }
            } else if (this.x70 != null) {
                if (Li()) {
                    this.Bs = ((zb0_2) this.x70).computeTextWidth(this.j50);
                    this.J8 = (int) (((zb0_2) this.x70).getLineHeightF() * (float) this.S00);
                } else {
                    this.Bs = 0;
                    this.J8 = ((zb0_2) this.x70).getLineHeight();
                }
            } else {
                t5();
            }
        }
        if (Li()) {
            Y30 y30 = this.x70;
            if (y30 != null) {
                ft0_0 ft0_02 = this.SJ;
                if (ft0_02 != null) {
                    ((zb0_2) y30).drawFromCache(ft0_02, (rb_1) kg0, Pk(false), hC());
                } else if (this.S00 > 1) {
                    ((zb0_2) y30).drawMultiLineText((rb_1) kg0, Pk(true), hC(), this.j50, hr0(), this.Tb.uf);
                } else {
                    ((zb0_2) y30).drawText((rb_1) kg0, Pk(true), hC(), this.j50);
                }
            }
        }
    }

    public final void dc0() {
        this.V00 = "";
    }
}
