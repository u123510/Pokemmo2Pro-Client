package cn.pokemmo.ui.dialog.bubble;

import f.*;

/**
 * 宝可梦招式选择气泡视窗 (Move Selection Bubble)
 * 展示宝可梦已学会的最多 4 个招式（技能名、属性、PP、分类），支持键盘/手柄网格导航与选择/返回。
 *
 * 原混淆类: f.jl_0
 */
public class MoveSelectionBubble extends iw_1 {
    public jl_0 asBridge() {
        return (jl_0) (Object) this;
    }

    public final tk0_0 hI0;
    public final G20[] Y5;
    public final hh0_1 nU;
    public int Vf;
    public final int COm5;

    public MoveSelectionBubble(byte b, VU vu) {
        super(b, jm_1.zr0);
        tk0_0 tk0_0Var = new tk0_0();
        this.hI0 = tk0_0Var;
        this.COm5 = 2;
        uf("messagebox");
        uf("msgbox-move-selection-panel");
        Oq0(true);
        this.Y5 = new G20[4];
        for (byte b2 = 0; b2 < this.Y5.length; b2 = (byte) (b2 + 1)) {
            this.Y5[b2] = new G20("", "");
            this.Y5[b2].uf("msgbox-move-selection-button");
            this.Y5[b2].qF0(pa0_0.up0);
        }
        for (byte b3 = 0; b3 < this.Y5.length; b3 = (byte) (b3 + 1)) {
            short UD = vu.RJ().UD(b3);
            vk0_1 SX = ec0_2.Sx().SX(UD);
            if (UD >= 1 && SX != null) {
                this.Y5[b3].pw0(true);
                this.Y5[b3].Pc(lb0_2.fb0(SX));
                this.Y5[b3].SU(SX.CoM2());
                this.Y5[b3].Gx().r8(new LPT6_[]{fn_0.qz0().jJ0(SX.yS(vu.RJ()).o6())});
                if (tw0_0.kz0()) {
                    this.Y5[b3].Gx().Gy0(193, 18);
                    this.Y5[b3].Gx().dA(2.0f);
                } else {
                    this.Y5[b3].Gx().Gy0(182, 10);
                    this.Y5[b3].Xr0(s2_0.tq0(SX, vu));
                }
                byte targetIndex = b3;
                this.Y5[b3].RR(() -> u70(targetIndex));
            } else {
                this.Y5[b3].SU("--");
                this.Y5[b3].Pc("");
                this.Y5[b3].pw0(false);
                this.Y5[b3].Gx().lo0();
                this.Y5[b3].Xr0(null);
            }
        }
        if (tw0_0.kz0()) {
            this.nU = new hh0_1("", 80, 80);
        } else {
            this.nU = new hh0_1(sm0_0.c0(nf0_0.Bq0), 106, 30);
        }
        this.nU.uf("msgbox-return");
        this.nU.RR(this::AK);
        this.hI0.Nu().yi0(this.Y5[0]);
        this.hI0.SL(this.Y5[1]);
        this.hI0.Nu().yi0(this.Y5[2]);
        this.hI0.SL(this.Y5[3]);
        this.hI0.SL(this.nU);
        if (tw0_0.kz0()) {
            this.hI0.gg0.rx0(4.0f);
            this.hI0.gg0.qf(4.0f);
            this.hI0.gg0.qE0(10.0f);
            this.hI0.gg0.Dr0(10.0f);
        } else {
            this.hI0.gg0.EF(10.0f);
        }
        SL(this.hI0);
    }

    @Override
    public boolean p3(int i) {
        rp_0 rp_0Var = rp_0.Ni;
        if (rp_0Var != null && rp_0Var.Ov(i)) {
            int i3 = this.Vf;
            if ((i3 + 1) % this.COm5 != 0) {
                this.Vf = i3 + 1;
            }
        } else {
            rp_0 rp_0Var2 = rp_0.I90;
            if (rp_0Var2 != null && rp_0Var2.Ov(i)) {
                int i4 = this.Vf;
                if ((i4 + 1) % this.COm5 != 1) {
                    this.Vf = i4 - 1;
                }
            } else {
                rp_0 rp_0Var3 = rp_0.kC0;
                if (rp_0Var3 != null && rp_0Var3.Ov(i)) {
                    int i5 = this.Vf;
                    int i6 = this.COm5;
                    if (i5 - i6 >= 0) {
                        this.Vf = i5 - i6;
                    }
                } else {
                    rp_0 rp_0Var4 = rp_0.synchronized$;
                    if (rp_0Var4 != null && rp_0Var4.Ov(i)) {
                        int i7 = this.Vf;
                        int i8 = this.COm5;
                        if (i7 + i8 < this.Y5.length) {
                            this.Vf = i7 + i8;
                        }
                    }
                }
            }
        }
        int i9 = this.Vf;
        if (i9 >= 0 && i9 < this.Y5.length) {
            lpt6__0.v90(this.Y5[i9]);
        }
        rp_0 rp_0Var5 = rp_0.sJ0;
        if (rp_0Var5 != null && rp_0Var5.Ov(i) && Of()) {
            G20 g20 = this.Y5[this.Vf];
            if (g20.OI) {
                a7_0.bH(g20.ER.Fc0);
            }
            return true;
        }
        rp_0 rp_0Var6 = rp_0.nK0;
        if (rp_0Var6 != null && rp_0Var6.Ov(i)) {
            m80((byte) -1);
        }
        return true;
    }

    @Override
    public boolean zn0() {
        return false;
    }

    @Override
    public void K8() {
        if (!tw0_0.kz0()) {
            this.nU.RY(106, 24);
        } else {
            this.nU.oY(72, 72);
        }
        lt0();
        this.hI0.lt0();
        E40(tw0_0.LD0.ew0() / 2 - this.Mx / 2, tw0_0.LD0.Hv0() / 2 - this.OB / 2);
    }

    @Override
    public boolean hy0() {
        return false;
    }

    @Override
    public void Jh(int i, int i2) {
    }

    public void AK() {
        m80((byte) -1);
    }

    public void u70(byte b) {
        m80((byte) (b + 1));
    }
}
