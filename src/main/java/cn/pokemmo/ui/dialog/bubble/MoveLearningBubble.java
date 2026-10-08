package cn.pokemmo.ui.dialog.bubble;

import f.*;

/**
 * 宝可梦新招式学习/遗忘气泡视窗 (Move Learning Bubble)
 * 用于宝可梦升级或回忆时，在已有 4 个招式与 1 个待学招式间进行选择与遗忘替换。
 *
 * 原混淆类: f.dg_2
 */
public class MoveLearningBubble extends iw_1 {
    public dg_2 asBridge() {
        return (dg_2) (Object) this;
    }

    public final fy_2 tE0;
    public final G20[] vj;
    public final hh0_1 z30;
    public int rX;
    public final int P0;

    public MoveLearningBubble(byte b, short s, VU vu) {
        super(b, jm_1.GJ);
        this.P0 = 2;
        uf("messagebox");
        fy_2 fy_2Var = new fy_2();
        this.tE0 = fy_2Var;
        fy_2Var.uf("npc-interaction-panel");
        this.tE0.Oq0(true);
        this.vj = new G20[5];
        for (int i = 0; i < this.vj.length; i++) {
            G20 g20 = new G20("", "");
            this.vj[i] = g20;
            g20.uf("battle-move-button-left");
            this.vj[i].qF0(pa0_0.up0);
        }
        for (int i = 0; i < this.vj.length; i++) {
            short s2 = (i == 4) ? s : vu.RJ().UD(i);
            if (s2 == 0) {
                this.vj[i].SU("-");
                this.vj[i].Pc("");
                this.vj[i].pw0(false);
                this.vj[i].Gx().lo0();
                this.vj[i].Xr0(null);
                this.vj[i].ML0();
            } else {
                this.vj[i].pw0(true);
                vk0_1 vk0_1Var = ec0_2.Sx().SX(s2);
                this.vj[i].Xr0(s2_0.tq0(vk0_1Var, vu));
                this.vj[i].Pc(lb0_2.fb0(vk0_1Var));
                this.vj[i].SU(vk0_1Var.CoM2());
                byte bIdx = (byte) i;
                this.vj[i].RR(() -> this.m80(bIdx));
                i40_0 i40_0Var = vk0_1Var.yS(vu.RJ());
                this.vj[i].Gx().r8(new LPT6_[]{fn_0.qz0().jJ0(i40_0Var.o6())});
                this.vj[i].Gx().Gy0(153, 10);
                this.vj[i].SU(vk0_1Var.CoM2());
                this.vj[i].ML0();
            }
        }
        this.vj[4].pw0(false);
        hh0_1 hh0_1Var = new hh0_1(sm0_0.c0(nf0_0.Bq0), 96, 30);
        this.z30 = hh0_1Var;
        hh0_1Var.uf("battle-button-return");
        this.z30.RR(this::K30);

        this.tE0.x40(this.tE0.H10().Xq(new ya_1[]{
                this.tE0.lo0().LPt3(new le0_2[]{this.vj[0], this.vj[1], this.vj[4]}),
                this.tE0.lo0().LPt3(new le0_2[]{this.vj[2], this.vj[3]})
        }));
        this.tE0.WQ(this.tE0.H10().Xq(new ya_1[]{
                this.tE0.lo0().LPt3(new le0_2[]{this.vj[0], this.vj[2]}),
                this.tE0.lo0().LPt3(new le0_2[]{this.vj[1], this.vj[3]}),
                this.tE0.lo0().LPt3(new le0_2[]{this.vj[4]})
        }));
        SL(this.tE0);
        SL(this.z30);
    }

    @Override
    public boolean p3(int i) {
        rp_0 rp_0Var = rp_0.Ni;
        if (rp_0Var != null && rp_0Var.Ov(i)) {
            int i3 = this.rX;
            if ((i3 + 1) % this.P0 != 0) {
                this.rX = i3 + 1;
            }
        } else {
            rp_0 rp_0Var2 = rp_0.I90;
            if (rp_0Var2 != null && rp_0Var2.Ov(i)) {
                int i4 = this.rX;
                if ((i4 + 1) % this.P0 != 1) {
                    this.rX = i4 - 1;
                }
            } else {
                rp_0 rp_0Var3 = rp_0.kC0;
                if (rp_0Var3 != null && rp_0Var3.Ov(i)) {
                    int i5 = this.rX;
                    int i6 = this.P0;
                    if (i5 - i6 >= 0) {
                        this.rX = i5 - i6;
                    }
                } else {
                    rp_0 rp_0Var4 = rp_0.synchronized$;
                    if (rp_0Var4 != null && rp_0Var4.Ov(i)) {
                        int i7 = this.rX;
                        int i8 = this.P0;
                        if (i7 + i8 < this.vj.length) {
                            this.rX = i7 + i8;
                        }
                    }
                }
            }
        }

        int cur = this.rX;
        if (cur >= 0 && cur < this.vj.length) {
            lpt6__0.v90(this.vj[cur]);
        }

        rp_0 rp_0Var5 = rp_0.sJ0;
        if (rp_0Var5 != null && rp_0Var5.Ov(i)) {
            if (Of()) {
                G20 btn = this.vj[this.rX];
                if (btn.OI) {
                    a7_0.bH(btn.ER.Fc0);
                }
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
    public void a80(Jn0 jn0) {
        this.tE0.oY(tw0_0.LD0.ew0(), 240);
    }

    @Override
    public void K8() {
        this.tE0.oY(800, 115);
        int y = (tw0_0.LD0.Hv0() - 500) / 4;
        int x = (tw0_0.LD0.ew0() / 2 - 400) + 350;
        this.tE0.E40(x, y);
        this.z30.lt0();
        this.z30.RY(128, 24);
        this.z30.E40(this.tE0.cz() - this.z30.Mx, this.tE0.VM() - this.z30.OB);
        this.z30.lt0();
    }

    @Override
    public boolean hy0() {
        return false;
    }

    @Override
    public void Jh(int i, int i2) {
    }

    public void K30() {
        m80((byte) -1);
    }
}
