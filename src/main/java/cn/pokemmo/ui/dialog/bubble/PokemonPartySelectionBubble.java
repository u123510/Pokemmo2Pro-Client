package cn.pokemmo.ui.dialog.bubble;

import f.*;

/**
 * 队伍宝可梦槽位选择气泡视窗 (Pokemon Party Selection Bubble)
 * 展示队伍中 6 只宝可梦（状态、图标、详情等），支持培育屋、对战点数兑换、同行检查等选择。
 *
 * 原混淆类: f.y20_0
 */
public class PokemonPartySelectionBubble extends iw_1 {
    public y20_0 asBridge() {
        return (y20_0) (Object) this;
    }

    public final fy_2 Z8;
    public final ak0_2[] b60;
    public final hh0_1 qI0;
    public int mf0;
    public final int hp0;

    public PokemonPartySelectionBubble(byte b, jm_1 jm, Mj mj, short[] sArr) {
        super(b, jm);
        this.hp0 = 3;
        uf("messagebox");
        fy_2 fy2 = new fy_2();
        this.Z8 = fy2;
        fy2.uf("npc-interaction-panel");
        fy2.Oq0(true);
        this.b60 = new ak0_2[6];
        for (byte i1 = 0; i1 < this.b60.length; i1 = (byte) (i1 + 1)) {
            int w = tw0_0.kz0() ? 300 : 225;
            int h = tw0_0.kz0() ? 80 : 54;
            ak0_2 btn = new ak0_2("", w, h);
            this.b60[i1] = btn;
            btn.uf("/battle-button-ui");
            VU vu = (sArr == null || i1 >= sArr.length) ? null : mj.nul(sArr[i1]);
            if (vu == null) {
                this.b60[i1].ih(null);
            } else {
                this.b60[i1].ih(vu);
                byte d = vu.uF0() ? (byte) -1 : vu.Dg0();
                this.b60[i1].SF(d);
                if (mj.Bm0() == _volatile.JR) {
                    this.b60[i1].Ik0(0, 0);
                    this.b60[i1].zI0();
                }
            }
            byte bIndex = (sArr == null || i1 >= sArr.length) ? (byte) -1 : (byte) sArr[i1];
            if (jm == jm_1.WR && vu != null) {
                short s = 0;
                rz_0 rz0 = null;
                vh0_0 vh = tw0_0.rl.xj();
                if (vh != null) {
                    s = vh.Di0();
                    rz0 = vh.P40();
                }
                this.b60[i1].mI(sm0_0.wa0(7961, new StringBuilder().append(IJ0.tz0(k80_0.At, vu.RJ(), s, rz0)).append("").toString()));
            }
            this.b60[i1].qF0(pa0_0.up0);
            byte currentB = bIndex;
            this.b60[i1].RR(() -> Aw0(currentB));
        }
        String returnText = sm0_0.c0(nf0_0.Bq0).toUpperCase();
        int rw = tw0_0.kz0() ? 133 : 96;
        int rh = tw0_0.kz0() ? 129 : 30;
        hh0_1 returnBtn = new hh0_1(returnText, rw, rh);
        this.qI0 = returnBtn;
        returnBtn.uf("battle-button-return");
        returnBtn.RR(this::Kw);
        this.Z8.x40(this.Z8.H10().Xq(new ya_1[]{
            this.Z8.lo0().LPt3(new le0_2[]{this.b60[0], this.b60[1], this.b60[2]}),
            this.Z8.lo0().LPt3(new le0_2[]{this.b60[3], this.b60[4], this.b60[5]})
        }));
        this.Z8.WQ(this.Z8.H10().Xq(new ya_1[]{
            this.Z8.lo0().LPt3(new le0_2[]{this.b60[0], this.b60[3]}),
            this.Z8.lo0().LPt3(new le0_2[]{this.b60[1], this.b60[4]}),
            this.Z8.lo0().LPt3(new le0_2[]{this.b60[2], this.b60[5]})
        }));
        SL(this.Z8);
        SL(returnBtn);
    }

    @Override
    public void C(zk0_1 v1) {
        lg_0.k.lPT5(this::OC0);
    }

    @Override
    public boolean p3(int i) {
        rp_0 ni = rp_0.Ni;
        if (ni != null && ni.Ov(i)) {
            if ((this.mf0 + 1) % this.hp0 != 0) {
                this.mf0++;
            }
        } else if (rp_0.I90 != null && rp_0.I90.Ov(i)) {
            if ((this.mf0 + 1) % this.hp0 != 1) {
                this.mf0--;
            }
        } else if (rp_0.kC0 != null && rp_0.kC0.Ov(i)) {
            if (this.mf0 - this.hp0 >= 0) {
                this.mf0 -= this.hp0;
            }
        } else if (rp_0.synchronized$ != null && rp_0.synchronized$.Ov(i)) {
            if (this.mf0 + this.hp0 < this.b60.length) {
                this.mf0 += this.hp0;
            }
        }
        if (this.mf0 >= 0 && this.mf0 < this.b60.length) {
            lpt6__0.v90(this.b60[this.mf0]);
        }
        if (rp_0.sJ0 != null && rp_0.sJ0.Ov(i) && Of()) {
            ak0_2 btn = this.b60[this.mf0];
            if (btn.OI) {
                a7_0.bH(btn.ER.Fc0);
            }
            return true;
        }
        if (rp_0.nK0 != null && rp_0.nK0.Ov(i)) {
            m80((byte) -1);
        }
        return true;
    }

    @Override
    public boolean zn0() {
        return false;
    }

    @Override
    public void a80(Jn0 v1) {
        this.Z8.oY(tw0_0.LD0.ew0(), 240);
    }

    @Override
    public void K8() {
        if (tw0_0.kz0()) {
            this.Z8.lt0();
            this.Z8.E40((tw0_0.LD0.ew0() / 2) - (this.Z8.Mx / 2), (tw0_0.LD0.Hv0() / 2) - (this.Z8.OB / 2));
            this.qI0.lt0();
            int x = (tw0_0.LD0.ew0() / 2) - (this.qI0.Mx / 2);
            this.qI0.E40(x, this.Z8.SB0 + this.Z8.OB);
            lt0();
        } else {
            int y = (tw0_0.LD0.Hv0() - 500) / 4;
            this.Z8.oY(800, 115);
            int x = (tw0_0.LD0.ew0() / 2) - 400;
            this.Z8.E40(x, y + 350);
            for (ak0_2 btn : this.b60) {
                btn.RY(200, 48);
            }
            this.qI0.lt0();
            this.qI0.RY(128, 24);
            this.qI0.E40(this.Z8.cz() - this.qI0.Mx, this.Z8.VM() - this.qI0.OB);
            lt0();
        }
    }

    @Override
    public boolean hy0() {
        return false;
    }

    @Override
    public void Jh(int i1, int i2) {
    }

    public void OC0() {
        lpt6__0.v90(this.b60[this.mf0]);
    }

    public void Kw() {
        m80((byte) -1);
    }
}
