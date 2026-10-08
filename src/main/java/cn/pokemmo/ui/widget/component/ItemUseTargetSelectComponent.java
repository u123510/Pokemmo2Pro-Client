package cn.pokemmo.ui.widget.component;

import f.*;
import java.util.*;

public class ItemUseTargetSelectComponent extends BaseComponent {
    public final HV ct0;
    public final S70 Y30;
    public final cn_0 FA;
    public final cn_0 og;
    public final S70 gZ;
    public final cn_0 ge0;
    public final short kU;
    public final q10_0 Z9;
    public final xe_1 U20;
    public final fy_2 hF0;
    public final Mm yq;
    public long ys = 0L;
    public final S70[] P;

    public ItemUseTargetSelectComponent(HV v1, boolean z) {
        this.ys = 0L;
        this.ct0 = v1;
        uf("gameshop-item-addon");
        int i4 = tw0_0.kz0() ? 136 : 100;
        int i5 = tw0_0.kz0() ? 136 : 80;
        S70 v3 = new S70(i4, i5);
        this.Y30 = v3;
        Br0 v4 = v3.JH();
        int i6 = tw0_0.kz0() ? 20 : 3;
        v4.Gy0(2, i6);
        v3.JH().nq0(24, 24);
        this.yq = new Mm(v3, tw0_0.e60.at());
        this.yq.CF0(2);
        X90 v5 = v1.Hc0();
        q10_0 v6_q = v5.ZD0();
        this.Z9 = v6_q;
        short i5_s = v5.Y0();
        this.kU = i5_s;
        this.yq.qd((byte) -2, v6_q, i5_s);
        if (v6_q == q10_0.VI) {
            this.yq.JQ(true);
        }
        this.P = jq0_0.dq0(gu0.Az0().lPT6(v1.MB0()));
        int i5_tag = 0;
        if (System.currentTimeMillis() / 1000L - (long) v1.Op0() < 604800L) {
            uf("gameshop-item-addon-new");
            i5_tag = 1;
        }
        if (!tw0_0.kz0() && v1.yg() > v1.eo()) {
            uf("gameshop-item-addon-sale");
            i5_tag = 1;
        }
        if (v1.Aq0() != null) {
            i5_tag = 1;
            uf("gameshop-item-addon-limited");
            if (v1.zi0() == 1) {
                uf("gameshop-item-addon-seasonal");
            }
        }
        String v6_name = v1.wG0();
        cn_0 faTemp = null;
        if (v6_name.contains("(") && tw0_0.kz0()) {
            String[] split = v6_name.split("\\(");
            v6_name = split[0];
            String v7 = split[1].replace(")", "");
            faTemp = new cn_0(v7);
            faTemp.uf("item-name-extra");
        }
        this.FA = faTemp;
        cn_0 v2_name = new cn_0(v6_name);
        v2_name.uf("item-name");
        if (z && tw0_0.kz0()) {
            v2_name.uf("item-name-mixed");
        }
        new cn_0(v1.ZE0());
        cn_0 ogTemp = null;
        if (v1.Aq0() != null) {
            ogTemp = new cn_0(sm0_0.wa0(3010, tx_1.je0(v1.Aq0().Rl0())));
            ogTemp.uf("limited-time");
        }
        this.og = ogTemp;
        S70 gzTemp = null;
        if (i5_tag != 0) {
            gzTemp = new S70(57, 57);
            gzTemp.uf("label-special");
        }
        this.gZ = gzTemp;
        cn_0 v5_price = new cn_0(sm0_0.wa0(2996, Integer.toString(v1.eo())));
        cn_0 ge0Temp = null;
        if (v1.yg() > v1.eo()) {
            int i6_disc = ((v1.yg() - v1.eo()) * 100) / v1.yg();
            if (tw0_0.kz0()) {
                ge0Temp = new cn_0(sm0_0.wa0(2995, Integer.toString(i6_disc)));
                ge0Temp.uf("label-discount");
            } else {
                v5_price.Sk(v5_price.kl() + " (" + sm0_0.wa0(2995, Integer.toString(i6_disc)) + ")");
            }
        }
        this.ge0 = ge0Temp;
        String v6_btn = "";
        if (tw0_0.kz0()) {
            v6_btn = " (" + sm0_0.wa0(2994, Integer.toString(v1.eo())) + ")";
        }
        this.U20 = new xe_1(g7_0.Zx(56, new StringBuilder(), v6_btn));
        this.U20.RR(new ac_2(v1));
        this.hF0 = new fy_2();
        SL(this.hF0);
        if (tw0_0.H30()) {
            Hm0 v6_hm = this.hF0.lo0();
            ya_1 v10;
            if (this.og == null) {
                v10 = this.hF0.H10().LPt3(new le0_2[]{v2_name}).Ze0().Kn0(v5_price).Kn0(this.U20);
            } else {
                v10 = this.hF0.H10().LPt3(new le0_2[]{this.og}).Ze0().LPt3(new le0_2[]{v2_name}).Kn0(v5_price).Kn0(this.U20);
            }
            this.hF0.x40(v6_hm.Xq(new ya_1[]{this.hF0.C7(new le0_2[]{this.gZ, v3}), v10}));
            I7 v6_i7 = this.hF0.H10();
            ya_1 v2_ya;
            if (this.og == null) {
                v2_ya = this.hF0.hb(new le0_2[]{v2_name, v5_price, this.U20});
            } else {
                v2_ya = this.hF0.hb(new le0_2[]{v2_name, this.og, v5_price, this.U20});
            }
            this.hF0.WQ(v6_i7.Xq(new ya_1[]{this.hF0.hb(new le0_2[]{this.gZ, v3}), v2_ya}));
        } else {
            ya_1 v5_ya = this.hF0.C7(new le0_2[]{v2_name, this.FA});
            ya_1 v9;
            if (this.og == null) {
                v9 = this.hF0.H10().Kn0(this.U20);
            } else {
                v9 = this.hF0.H10().LPt3(new le0_2[]{this.og}).Kn0(this.U20);
            }
            this.hF0.x40(v5_ya.Xq(new ya_1[]{this.hF0.hb(new le0_2[]{this.ge0, this.gZ, v3}), v9}));
            Hm0 v5_hm2 = this.hF0.lo0();
            ya_1 v3_ya;
            if (this.og == null) {
                v3_ya = this.hF0.lo0().Kn0(this.U20);
            } else {
                v3_ya = this.hF0.hb(new le0_2[]{this.og, this.U20});
            }
            this.hF0.WQ(v5_hm2.Xq(new ya_1[]{
                this.hF0.H10().Ze0().Kn0(v2_name).Ze0(),
                this.hF0.H10().Ze0().Kn0(this.FA).Ze0(),
                this.hF0.lo0().k5(pa0_0.Ht0, this.ge0).LPt3(new le0_2[]{this.gZ}),
                this.hF0.H10().k5(pa0_0.Ol, v3),
                v3_ya
            }));
        }
        for (int i = 0; i < this.P.length; i++) {
            S70 s70 = this.P[i];
            if (tw0_0.kz0()) {
                s70.JH().dA(2.0f);
            }
            SL(s70);
        }
    }

    @Override
    public final void K8() {
        this.hF0.lt0();
        int i1 = kq_0.lpT2(this.A20, this.Mx, this.hF0.Mx, 2);
        this.hF0.E40(i1, this.SB0);
        for (int i = 0; i < this.P.length; i++) {
            this.P[i].lt0();
            if (tw0_0.kz0()) {
                this.P[i].E40(this.Y30.A20 + this.Y30.e80 - 50, this.Y30.SB0 + i * 38);
            } else {
                this.P[i].E40(this.Y30.A20 + this.Y30.e80 + 2, si0_0.Fz(this.Y30.SB0 + this.Y30.y9, 19, i, 5));
            }
        }
    }

    @Override
    public final void Dw0(zk0_1 v1) {
        int i1;
        int i2;
        if (!tw0_0.kz0()) {
            i1 = -6;
            if (this.Z9 == q10_0.VI || this.Z9 == q10_0.Bj0 || this.Z9 == q10_0.uz || this.Z9 == q10_0.rg0) {
                i2 = -16;
            } else {
                i2 = -24;
            }
        } else {
            this.yq.Ta = 4;
            i1 = -46;
            if (this.Z9 == q10_0.VI || this.Z9 == q10_0.Bj0 || this.Z9 == q10_0.uz || this.Z9 == q10_0.rg0) {
                i2 = -40;
            } else {
                i2 = -56;
            }
        }
        if (this.kU == 82) {
            i2 += 10;
        }
        if (this.og != null && System.currentTimeMillis() - this.ys > 1000L) {
            this.ys = System.currentTimeMillis();
            this.og.Sk(sm0_0.wa0(3010, tx_1.HU(this.ct0.dE0.Rl0(), 2)));
            this.U20.pw0(this.ct0.dE0.d70());
        }
        if (this.Z9 == q10_0.Bj0 || this.Z9 == q10_0.uz || this.Z9 == q10_0.rg0 || this.Z9 == q10_0.VI) {
            this.yq.Vd0(i1, i2);
        } else if (this.Z9 == q10_0.Qh0) {
            this.yq.eQ((byte) 20, i1, i2);
        } else {
            this.yq.eQ((byte) 0, i1, i2);
        }
    }
}
