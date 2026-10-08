package cn.pokemmo.ui.widget.button;

import f.*;

public class ToggleStateButton extends dz_2 {
    public static final MD0 t90;
    public static final MD0 LPt7;
    public static final MD0 Cd;
    public final kd_0 gU;
    public WX ER;
    public String tg0;
    public String U4;

    static {
        t90 = MD0.cB("armed");
        LPt7 = MD0.cB("pressed");
        Cd = MD0.cB("selected");
    }

    public ToggleStateButton() {
        this(null, false, null);
    }

    public ToggleStateButton(KG0 kg0) {
        this(kg0, false, null);
    }

    public ToggleStateButton(String str) {
        this(null, false, null);
        SU(str);
    }

    public ToggleStateButton(KG0 kg0, int i) {
        this(kg0, true, null);
    }

    public ToggleStateButton(tq_0 tq_0) {
        this(null, false, tq_0);
    }

    public ToggleStateButton(KG0 kg0, boolean b, tq_0 tq_0) {
        super(kg0, b);
        this.gU = new kd_0((xe_1) this);
        ne0(tq_0 != null ? tq_0 : new WX());
        Oq0(true);
    }

    @Override
    public String Ck() {
        return "button";
    }

    public final void yr0() {
        this.ER.Ge0(false);
        this.ER.Mo0(false);
        this.ER.tF(false);
    }

    public void pw0(boolean b) {
        boolean z = (this.ER.mu0 & 8) == 0;
        if (b != z) {
            this.ER.lv(8, !b);
            a7_0.bH(this.ER.xv0);
        }
    }

    public final void RR(Runnable runnable) {
        this.ER.Fc0 = (Runnable[]) a7_0.gE(this.ER.Fc0, runnable, Runnable.class);
    }

    public final String Oc0() {
        return this.U4;
    }

    public final void SU(String str) {
        if (str == null || !str.equals(this.U4)) {
            this.U4 = str;
            if (str == null) {
                str = this.tg0 != null ? this.tg0 : "";
            }
            B(str);
            COm3();
        }
    }

    @Override
    public void Ib(Jn0 jn0) {
        super.Ib(jn0);
        String str = (String) ((LC0) jn0).N30("text", false, String.class, null);
        this.tg0 = str;
        String str2 = this.U4;
        if (str2 == null) {
            B(str != null ? str : "");
        } else {
            B(str2);
        }
        COm3();
    }

    @Override
    public void C(zk0_1 zk0_1) {
        WX wx = this.ER;
        if (wx != null) {
            wx.Rl0();
        }
    }

    @Override
    public void N00(zk0_1 zk0_1) {
        WX wx = this.ER;
        if (wx != null) {
            wx.ft();
        }
    }

    @Override
    public int R1() {
        return Math.max(super.R1(), m0());
    }

    @Override
    public int Se() {
        return Math.max(super.Se(), rm0());
    }

    @Override
    public final void Ll(boolean b) {
        super.Ll(b);
        if (!b) {
            this.ER.Ge0(false);
            this.ER.Mo0(false);
            this.ER.tF(false);
        }
    }

    public final void I2() {
        super.pw0((this.ER.mu0 & 8) == 0);
        KG0 kg0 = this.M;
        kg0.j70(Cd, this.ER.U20());
        kg0.j70(H7, (this.ER.mu0 & 1) != 0);
        kg0.j70(t90, this.ER.sx0());
        kg0.j70(LPt7, (this.ER.mu0 & 2) != 0);
    }

    @Override
    public boolean nd0(i70_0 i70_0) {
        int i = i70_0.zu;
        if (E00.C10(i)) {
            boolean z = i != 7 && yv0(i70_0.f8, i70_0.AN);
            this.ER.Ge0(z);
            this.ER.Mo0(z && (this.ER.mu0 & 2) != 0);
        }
        int Qj = J90.Qj(i70_0.zu);
        if (Qj == 2) {
            if (i70_0.nA0 == 0) {
                this.ER.tF(true);
                this.ER.Mo0(true);
            }
        } else if (Qj == 3) {
            if (i70_0.nA0 == 0) {
                this.ER.tF(false);
                this.ER.Mo0(false);
            }
        } else {
            switch (Qj) {
                case 7:
                    return false;
                case 8:
                    int Do = dp0.Do(i70_0.finally$);
                    if (Do == 62 || Do == 66) {
                        if (!i70_0.l()) {
                            this.ER.tF(true);
                            this.ER.Mo0(true);
                        }
                        return true;
                    }
                    break;
                case 9:
                    int Do2 = dp0.Do(i70_0.finally$);
                    if (Do2 == 62 || Do2 == 66) {
                        this.ER.tF(false);
                        this.ER.Mo0(false);
                        return true;
                    }
                    break;
                case 10:
                    this.ER.Ge0(false);
                    break;
            }
        }
        if (super.nd0(i70_0)) {
            return true;
        }
        return E00.C10(i70_0.zu);
    }

    public final void nE() {
        if (dp0.aK0()) {
            super.lPT3();
            this.ER.Ge0(false);
            this.ER.Mo0(false);
            this.ER.tF(false);
        }
    }

    @Override
    public final void lPT3() {
        super.lPT3();
        this.ER.Ge0(false);
        this.ER.Mo0(false);
        this.ER.tF(false);
    }

    public final WX VJ() {
        return this.ER;
    }

    public final void ne0(WX wx) {
        boolean z = this.Em0 != null;
        WX wx2 = this.ER;
        if (wx2 != null) {
            if (z) {
                wx2.ft();
            }
            this.ER.xv0 = (Runnable[]) a7_0.tp0(this.gU, this.ER.xv0);
        }
        this.ER = wx;
        wx.l40(this.gU);
        if (z) {
            this.ER.Rl0();
        }
        I2();
        KG0 kg0 = this.M;
        MD0 md0 = t90;
        kg0.getClass();
        int i = md0.d1;
        gg_0[] gg_0Arr = kg0.OX;
        gg_0 gg_0 = i < gg_0Arr.length ? gg_0Arr[i] : null;
        if (gg_0 != null) {
            gg_0.Eh = false;
        }
        int i2 = LPt7.d1;
        gg_0 gg_02 = i2 < gg_0Arr.length ? gg_0Arr[i2] : null;
        if (gg_02 != null) {
            gg_02.Eh = false;
        }
        int i3 = H7.d1;
        gg_0 gg_03 = i3 < gg_0Arr.length ? gg_0Arr[i3] : null;
        if (gg_03 != null) {
            gg_03.Eh = false;
        }
        int i4 = Cd.d1;
        gg_0 gg_04 = i4 < gg_0Arr.length ? gg_0Arr[i4] : null;
        if (gg_04 != null) {
            gg_04.Eh = false;
        }
    }
}
