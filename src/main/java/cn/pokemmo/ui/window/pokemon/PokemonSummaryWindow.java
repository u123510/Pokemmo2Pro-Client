/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.ui.window.pokemon;

import f.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.NumberFormat;

import aurelienribon.tweenengine.equations.Quad;
import com.badlogic.gdx.graphics.g3d.particles.ParticleEffectExt;
import f.AG0;
import f.AN;
import f.BJ0;
import f.BR;
import f.BU;
import f.Br0;
import f.C8;
import f.C90;
import f.CE;
import f.CH0;
import f.CI0;
import f.CO;
import f.D2;
import f.E00;
import f.EP;
import f.Fo;
import f.Fu0;
import f.Ge0;
import f.HJ0;
import f.Hm0;
import f.I2;
import f.Jm0;
import f.Jn0;
import f.LPT6_;
import f.Ma;
import f.Mj;
import f.P8;
import f.PH;
import f.PH0;
import f.QA0;
import f.QH;
import f.QL;
import f.Qy0;
import f.RJ0;
import f.S70;
import f.T80;
import f.TB;
import f.TK;
import f.UA;
import f.VU;
import f.Vt0;
import f.X4;
import f.XD0;
import f.XZ;
import f.a7_0;
import f.ae0_1;
import f.ao_1;
import f.as0_0;
import f.at_0;
import f.b3_0;
import f._catch;
import f.cn_0;
import f.com2__3;
import f.cq_0;
import f.cx_0;
import f.dw_2;
import f.e90_0;
import f.ec0_2;
import f.eh_2;
import f.es_1;
import f.fd0_0;
import f.ff_0;
import f.fn_0;
import f.fn_1;
import f.fy0_0;
import f.fy_2;
import f.g7_0;
import f.gc_2;
import f.gh_1;
import f.gn_0;
import f.gu0;
import f.hl_2;
import f.hn_1;
import f.hx_1;
import f.i40_0;
import f.i4_0;
import f.i70_0;
import f.ib0_0;
import f.ig_0;
import f.jn_0;
import f.jy_1;
import f.kf0_1;
import f.kr_2;
import f.lb0_2;
import f.le0_2;
import f.lg_0;
import f.lo0_0;
import f.lpt3__4;
import f.lpt6__0;
import f.lpt6__2;
import f.mc0_1;
import f.mh_1;
import f.mp_1;
import f.n70_0;
import f.nf0_0;
import f.ob0_0;
import f.pa0_0;
import f.pw_1;
import f.q90_0;
import f.qj_2;
import f.ql_0;
import f.qo_1;
import f.qq_0;
import f.qu_1;
import f.rb_1;
import f.rg0_2;
import f.rh_2;
import f.rp_0;
import f.rz_0;
import f.s20_0;
import f.s2_0;
import f.sj0_1;
import f.sm0_0;
import f.ss_1;
import f.tk0_0;
import f.tr_1;
import f.tu_1;
import f.tw0_0;
import f.tx_1;
import f.ui_1;
import f.vk0_1;
import f._volatile;
import f.wl0_2;
import f.x4_0;
import f.xe_1;
import f.xt_0;
import f.ya_1;
import f.yh_0;
import f.zb0_2;
import f.zk0_1;
import f.zo_0;
import f.zs_1;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.TimeZone;
import java.util.function.LongSupplier;

/*
 * Renamed from f.ng
 * Illegal identifiers - consider using --renameillegalidents true
 */
/**
 * 宝可梦详细概要窗口
 *
 * 原混淆类: f.ng_2
 */
public class PokemonSummaryWindow
extends cx_0
implements tr_1  {
    public final ng_2 asBridge() {
        return (ng_2) (Object) this;
    }

    public static final gn_0[] MS;
    public static final int[][] wx0;
    public static final int[][][] oh;
    public static CH0 aUx;
    public final P8 Ru;
    public final cn_0[] wl;
    public final fy_2 r5;
    public final fy_2 MB;
    public final fy_2 Up;
    public final fy_2 D5;
    public final fy_2 XT;
    public com2__3 Zw;
    public xe_1 U80;
    public qo_1 Z5;
    public final qu_1 mA0;
    public final CH0 se;
    public int gN;
    public int jc;
    public es_1 MF0;
    public final es_1 class$;
    public Mj CU;
    public final S70 pa0;
    public final tk0_0 V20;
    public final S70 hq;
    public S70 dG0;
    public qj_2[] Lj0;
    public final TK qq;
    public gn_0 fr0;
    public le0_2 Pb0;
    public int b00;
    public final boolean HJ0;
    public ParticleEffectExt c0;
    public final i40_0 DR;
    public ff_0 rw;
    public as0_0 fz0;
    public boolean xc;
    public final es_1 la0;
    public xt_0[] Gq0;
    public int Rf0;
    public xe_1 Gg0;
    public pw_1 vm0;
    public C90 ln;

    /*
     * Enabled aggressive block sorting
     */
    public final void v4(VU vU, boolean bl) {
        yh_0 yh = yh_0.Xm0;
        float f = yh.hS((byte) 2, vU.I8.Yb0);
        if (f == 0.0f) {
            f = tw0_0.kz0() ? 4.0f : 2.0f;
        }
        boolean isFront = this.Rf0 == 0;
        AG0[] frames = yh.Kr0(vU.Dg0(), vU.I8.Kr(), isFront, vU.I8.I());
        if (frames == null || frames.length == 0) {
            frames = yh_0.uC0;
        }
        AG0 firstFrame = frames[0];
        int[] delays = null;
        if (this.Gq0 == null && !yh.ak0(vU.Dg0(), vU.I8.Kr(), isFront, vU.I8.I())) {
            try {
                xt_0 m1 = yh.P90(vU.Dg0(), vU.I8.Kr(), true, vU.I8.I());
                xt_0 m2 = yh.P90(vU.Dg0(), vU.I8.Kr(), false, vU.I8.I());
                if (m1 != null && m2 != null) {
                    this.Gq0 = new xt_0[]{m1, m2};
                    this.Gq0[0].j9(Math.round(f));
                    this.Gq0[1].j9(Math.round(f));
                    this.Gq0[1].a30 = this.Gq0[0].a30;
                    this.Gq0[1].IT = this.Gq0[0].IT;
                    this.Gq0[1].B0 = this.Gq0[0].B0;
                    this.la0.G6(this.Gq0, 0, this.Gq0.length);
                } else {
                    this.Gq0 = null;
                }
            } catch (Exception e) {
                this.Gq0 = null;
            }
        }
        if (yh.kJ(vU.Dg0(), vU.I8.Kr(), isFront, vU.I8.I())) {
            delays = yh.R6(vU.Dg0(), vU.I8.Kr(), isFront, vU.I8.I());
        } else {
            frames = null;
        }
        double halfScale = (double) f * 0.5;
        int scaledW = (int) ((float) firstFrame.d3().bz * f);
        int scaledH = (int) ((float) firstFrame.d3().xZ * f);
        int posX = 129 - (int) ((double) firstFrame.d3().bz * halfScale);
        int posY = 100 - (int) ((double) firstFrame.d3().xZ * halfScale);
        Br0 anim = this.qq.og;
        if (vU.I8.aR()) {
            anim.EJ0 = 1.15f;
            if (vU.I8.I()) {
                anim.ZC = x4_0.DS;
                anim.Ps = 1.0f;
            } else {
                anim.ZC = x4_0.EH0;
                anim.Ps = 0.8f;
            }
            anim.d00 = 1.5f;
        }
        if (frames != null && frames.length > 2) {
            anim.o60(frames);
            anim.aL(delays);
            anim.G1 = true;
            if (bl) {
                anim.gY = posX;
                anim.a4 = posY;
                anim.OA0 = true;
                anim.IF = scaledW;
                anim.gx0 = scaledH;
            }
        } else if (this.Gq0 != null) {
            xt_0[] curAnim = new xt_0[]{this.Gq0[this.Rf0]};
            anim.UU(curAnim);
            if (bl) {
                anim.Ic();
                int ox, oy;
                if (vU.I8.aR()) {
                    ox = anim.gY + 72;
                    oy = anim.a4 + 68;
                } else {
                    ox = anim.gY + 110;
                    oy = anim.a4 + 90;
                }
                anim.gY = ox;
                anim.a4 = oy;
            }
        } else {
            anim.o60(new AG0[]{firstFrame});
            if (bl) {
                anim.gY = posX;
                anim.a4 = posY;
                anim.OA0 = true;
                anim.IF = scaledW;
                anim.gx0 = scaledH;
            }
        }
    }

    public final void com3() {
        tw0_0.rl.Cp(zo_0.Pk, "//clonepokemon " + this.se, "", true);
    }

    public final void AK0() {
        if (this.Gq0 != null) {
            for (xt_0 xt : this.Gq0) {
                xt.run();
            }
            xt_0 src = this.Gq0[0];
            xt_0 dst = this.Gq0[1];
            dst.getClass();
            dst.a30 = src.a30;
            dst.IT = src.IT;
            dst.B0 = src.B0;
        }
    }

    public final void RJ0(VU vU, VU vU2) {
        BU.T50.PRn(vU.pu);
        BU.T50.FI(vU2, this.Pb0, this.Z5, true).BL();
    }

    public final /* synthetic */ void Vs() {
        this.Z5 = qo_1.bD;
    }

    public final /* synthetic */ void oy0() {
        this.Z5 = qo_1.iI0;
    }

    public final /* synthetic */ void dF0() {
        this.Z5 = qo_1.Er;
    }

    public final /* synthetic */ void PK() {
        this.Z5 = qo_1.I0;
    }

    public final /* synthetic */ void X60() {
        this.Z5 = qo_1.wb0;
    }

    public final /* synthetic */ void QG() {
        this.Z5 = qo_1.VM;
    }

    public final /* synthetic */ void q50() {
        this.Z5 = qo_1.VD;
    }

    public final /* synthetic */ void nR() {
        this.Z5 = qo_1.EA;
    }

    public final /* synthetic */ void Lm() {
        this.Z5 = qo_1.eX;
    }

    public final /* synthetic */ void oj() {
        this.Z5 = qo_1.VM;
    }

    public final /* synthetic */ void cd() {
        this.Z5 = qo_1.wb0;
    }

    public final /* synthetic */ void PrN() {
        this.Z5 = qo_1.DL;
    }

    public final void tL0(VU vU, BU bU) {
        int msgId = vU.I8.rh0() > 0 ? 2311 : 2310;
        String name = sm0_0.c0(gu0.l2.lPT6((short)vU.I8.rh0()).Nl);
        String text = sm0_0.Bx(msgId, vU.k30(), name);
        lpt3__4 dialog = new lpt3__4(text, () -> this.AL0(vU, bU), this.U80);
        dialog.D80 = true;
        Qy0.yI0.sr0(dialog);
    }

    public final void AL0(VU vU, BU bU) {
        BR bR = tw0_0.rl;
        CH0 cH0 = vU.pu;
        bR.fk0.uQ(new sj0_1(cH0));
        if (!(tw0_0.kz0() ^ true) && this.class$.KB >= 2) {
            aUx = vU.pu;
            this.Ru(true);
        } else {
            this.wz();
            bU.PRn(vU.pu);
        }
    }

    public final void m(boolean bl, mc0_1 object, String string, VU vU, e90_0 e90_02) {
        BR bR = tw0_0.rl;
        int n2 = bR.Bb(bR.u40).a90((short)1446);
        int n = bl ? 1000 : 25;
        if (n2 < n) {
            Qy0.yI0.e80(sm0_0.Bx(1899, String.valueOf(n2), String.valueOf(n), sm0_0.c0(object.Nl)), null);
            return;
        }
        String prompt;
        if (bl) {
            prompt = sm0_0.Bx(1897, string, String.valueOf(n), sm0_0.c0(object.Nl), vU.k30());
        } else {
            prompt = sm0_0.Bx(1898, string, String.valueOf(n), sm0_0.c0(object.Nl));
        }
        lpt3__4 dialog = new lpt3__4(prompt, () -> ng_2.ta0((short)1446, n), this.Ru);
        dialog.D80 = bl;
        Qy0.yI0.sr0(dialog);
    }

    public final void h3(VU vU) {
        if (vU.I8.vn()) {
            return;
        }
        byte by = (new byte[]{0, 5, 50, 55, 65, 80, 100})[++this.b00 % 7];
        String string = "";
        if (by != 0) {
            string = sm0_0.wa0(1859, by + "");
        }
        if (by == 0) {
            by = vU.I8.wj;
        }
        this.K9(vU, by, string);
    }

    public final void HA(VU vU) {
        if (vU != null) {
            if (tw0_0.PK0 != null) {
                tw0_0.rl.qK(sm0_0.wa0(6106, vU.na0()));
            } else {
                if (this.fz0 != null) {
                    this.u3(this.fz0);
                }
                this.fz0 = new as0_0(vU);
                this.F9(this.fU(), this.fz0);
            }
        }
    }

    public final void nj0(VU vU, int n) {
        vU.I8.jw0 = (byte)(vU.I8.jw0 ^ 1 << n);
        this.RM(vU, n);
        BR bR = tw0_0.rl;
        if (bR != null) {
            bR.fk0.uQ(new Fo(vU.I8.jw0, vU.pu));
        }
    }

    public final void GF0(VU vU, e90_0 object) {
        float f;
        pw_1 tween = this.vm0;
        if (tween != null && tween.fb0 && !tween.BJ0()) {
            return;
        }
        int n2 = this.Rf0 == 0 ? 1 : 0;
        this.Rf0 = n2;
        if (this.Gq0 == null) {
            this.v4(vU, false);
            return;
        }
        Br0 br0 = this.qq.og;
        int n3 = br0.gY;
        int n4 = br0.a4;
        int n5 = tw0_0.kz0() ? (this.Rf0 == 0 ? 50 : -50) : (this.Rf0 == 0 ? 25 : -25);
        this.vm0 = pw_1.xC();
        this.vm0.Xf0();
        if (this.Rf0 == 1) {
            float f2;
            pw_1 pw_12 = this.vm0;
            ao_1 ao_12 = ao_1.DX(br0, 2, 0.15f);
            int n6 = tw0_0.kz0() ? 15 : 10;
            ao_1 ao_13 = ao_12;
            ao_13.h5[0] = f2 = (float)(n4 - n6);
            ao_13.Yn = Quad.IN;
            pw_12.y80(ao_13);
        }
        PokemonSummaryWindow ng_22 = this;
        ao_1 ao_14 = ao_1.DX(br0, 1, 0.25f);
        ao_14.h5[0] = f = (float)(n3 + n5);
        Quad quad = Quad.IN;
        ao_14.Yn = quad;
        ng_22.vm0.y80(ao_14).y80(ao_1.pc((n, d2) -> this.v4(vU, false))).mz0();
        if (ng_22.Rf0 == 1) {
            float f3;
            ao_1 ao_15 = ao_1.DX(br0, 2, 0.15f);
            ao_15.h5[0] = f3 = (float)n4;
            ao_15.Yn = quad;
            this.vm0.TD0().y80(ao_15).mz0();
        }
        this.vm0.Ms(tw0_0.LD0.lY);
    }

    public final void Wg(BU bU, VU vU) {
        bU.PRn(vU.pu);
        this.wz();
    }

    public final void K9(VU vU, byte by, String string) {
        gc_2[] gc_2Array = gc_2.ME;
        int n = gc_2.ME.length;
        for (int j = 0; j < n; ++j) {
            gc_2 gc_22 = gc_2Array[j];
            if (gc_22.j8) continue;
            if (this.wl[gc_22.CoM2] == null) {
                this.wl[gc_22.CoM2] = new cn_0(null, 0);
            }
            if (gc_22 == gc_2.RC && string.isEmpty()) {
                this.wl[gc_22.CoM2].Sk(vU.I8.VD + " / " + vU.Ps.BL0(gc_22));
            } else {
                this.wl[gc_22.CoM2].Sk(vU.Ps.ml(gc_22, by) + string);
            }
            VU vU2 = vU;
            this.wl[gc_22.CoM2].uf("label-monster-value");
            short s = 0;
            int n2 = 0;
            rz_0 rz_02 = rz_0.YB;
            int n3 = vU2.SC.Fb(gc_22);
            s = XD0.pD0(gc_22, (byte)s, (short)n2, by, rz_02, n3);
            n2 = vU2.I8.RI(gc_22);
            n3 = 0;
            int by2 = vU2.SC.Fb(gc_22);
            n2 = XD0.pD0(gc_22, (byte)n2, (short)n3, by, rz_02, by2);
            n3 = 0;
            short s2 = vU2.I8.ZY(gc_22);
            int n4 = vU2.SC.Fb(gc_22);
            n3 = XD0.pD0(gc_22, (byte)n3, s2, by, rz_02, n4);
            byte by3 = vU2.I8.RI(gc_22);
            short s3 = vU2.I8.ZY(gc_22);
            int n5 = vU2.SC.Fb(gc_22);
            int n52 = XD0.pD0(gc_22, by3, s3, by, rz_02, n5);
            byte by4 = vU2.I8.RI(gc_22);
            short s4 = vU2.I8.ZY(gc_22);
            rz_0 rz_03 = vU2.I8.yb;
            int n6 = vU2.SC.Fb(gc_22);
            int n7 = n52;
            n2 -= s;
            n52 = n3 - s;
            n3 = XD0.pD0(gc_22, by4, s4, by, rz_03, n6) - n7;
            DecimalFormat decimalFormat = new DecimalFormat("+#;-#");
            String[] stringArray = new String[4];
            String[] stringArray2 = stringArray;
            stringArray2[0] = s + "";
            stringArray2[1] = decimalFormat.format(n2);
            stringArray2[2] = decimalFormat.format(n52);
            stringArray[3] = decimalFormat.format(n3);
            this.wl[gc_22.CoM2].Xr0(sm0_0.Bx(1848, stringArray2));
            this.wl[gc_22.CoM2].GH0 = 150;
        }
    }

    @Override
    public final void a80(Jn0 jn0) {
    }

    @Override
    public final void aUX(zk0_1 object) {
        if (dw_2.lp0) {
            lg_0.S4.getClass();
            lg_0.S4.getClass();
        }
        if (this.Jj0 != null) {
            this.Jj0.uf(this.M, this.A20, this.SB0, this.Mx, this.OB);
        }
        if (this.Gq0 != null) {
            lg_0.k.lPT5(this::AK0);
        }
        if (this.c0 != null && this.rw != null && !this.xc) {
            jn_0 jn = tw0_0.LD0;
            ui_1 ui = jn.j20;
            jy_1 aj = jn.aj;
            ui.end();
            eh_2 eh = jn.K10;
            BJ0 bj = jn.U1;
            ql_0 ql = new ql_0(this.A20 + 275, this.SB0 + 35, 224.0f, 227.0f);
            bj.Q30 = (this.DR == i40_0.Kt || this.DR == i40_0.lpt8 || this.DR == i40_0.Us0) ? -10.0f : 0.0f;
            bj.d00 = 0.0f;
            if (tw0_0.kz0()) {
                ql.j80 = 0.0f;
                ql.Wm0 = 60.0f;
                ql.IA = tw0_0.LD0.ew0();
                ql.Eu0 = tw0_0.LD0.Hv0() - 120;
                bj.Ui = ql.IA;
                bj.yG = ql.Eu0;
                bj.Rg0 = 2.0f;
                bj.rj.x = -2.5f;
                bj.rj.y = -0.5f;
                bj.rj.z = -2.25f;
                bj.JP(-3.0f, 0.0f, 1.0f);
            } else {
                bj.Ui = ql.IA;
                bj.yG = ql.Eu0;
                bj.Rg0 = 2.0f;
                bj.rj.x = 0.0f;
                bj.rj.y = 0.0f;
                bj.rj.z = -3.25f;
                bj.JP(0.0f, 0.0f, 0.0f);
            }
            ql_0 ql2 = new ql_0();
            aj.vE0(ui.jP, ql, ql2);
            PH.Sj(ql2);
            if (!tw0_0.kz0()) {
                float f5 = (float)jn.Hv0() - ql.Wm0 - ql.Eu0;
                float f6 = jn.Ew;
                int n = (int)(f5 / f6);
                int n5 = (int)(ql.IA / f6);
                int n6 = (int)(ql.Eu0 / f6);
                CI0.r40((int)(ql.j80 / jn.Ew), n, n5, n6);
            }
            bj.ye(true);
            eh.jK(bj);
            this.rw.begin();
            this.rw.update();
            this.rw.me0();
            this.rw.end();
            eh.eo0(this.rw);
            eh.end();
            ui.W30();
            PH.eF();
            ((qq_0)this.Em0.AK).va.kF(false);
        }
    }

    @Override
    public final void HP(zk0_1 zk0_12) {
        super.HP(zk0_12);
    }

    @Override
    public final int R1() {
        return this.gN;
    }

    @Override
    public final int Se() {
        return this.jc;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    @Override
    public final void K8() {
        block16: {
            block17: {
                xe_1 xe_12;
                int n;
                block12: {
                    block15: {
                        int n2;
                        int n3;
                        S70 s70;
                        block14: {
                            S70 s702;
                            block13: {
                                n = this.jc;
                                this.RY(this.gN, n);
                                n = this.jc;
                                this.g2(this.gN, n);
                                n = this.jc;
                                this.oY(this.gN, n);
                                this.Up.RY(400, 300);
                                this.Up.oY(400, 300);
                                super.K8();
                                this.V20.lt0();
                                if (!(tw0_0.kz0() ^ true)) break block12;
                                s702 = this.hq;
                                if (s702 == null || this.dG0 == null) break block13;
                                s702.E40(this.A20 + 277, this.SB0 + 246);
                                s70 = this.dG0;
                                n3 = this.hq.A20 + 50;
                                n2 = this.SB0;
                                break block14;
                            }
                            if (s702 == null) break block15;
                            s70 = s702;
                            n3 = this.A20 + 277;
                            n2 = this.SB0;
                        }
                        s70.E40(n3, n2 + 246);
                    }
                    if (this.Lj0 == null) break block16;
                    break block17;
                }
                this.Ru.lt0();
                this.Ru.A20(pa0_0.qQ, 0, 0);
                this.D5.RY(400, 24);
                this.D5.g2(400, 24);
                this.D5.oY(400, 24);
                this.D5.A20(pa0_0.Mk, -150, 110);
                this.qq.lt0();
                this.qq.A20(pa0_0.up0, -250, -70);
                fy_2 fy_22 = this.D5;
                n = fy_22.A20;
                n = fy_22.Mx / 2 + n;
                S70 s70 = this.hq;
                if (s70 != null && this.dG0 != null) {
                    s70.E40(n - 100, 500);
                    this.dG0.E40(n, this.hq.SB0);
                } else if (s70 != null) {
                    s70.E40(n - 50, 500);
                }
                this.XT.lt0();
                fy_2 fy_23 = this.XT;
                fy_23.E40(n - fy_23.Mx / 2, this.hq.SB0 + 16);
                fy_2 fy_24 = this.XT;
                this.mA0.E40(fy_24.A20 + fy_24.Mx - 64, fy_24.SB0 + 35);
                if (this.Lj0 != null) {
                    for (int i = 0; i < 4; ++i) {
                        int n4 = n - 64;
                        this.Lj0[i].E40(i * 32 + n4, this.hq.SB0 + 106);
                    }
                }
                this.V20.E40(this.D5.cz() - 48, this.D5.SB0 + 30);
                es_1 es_12 = this.MF0;
                if (es_12 != null) {
                    int n5 = 0;
                    int n6 = (this.Mx - 360) / 2;
                    I2 i2 = es_12.ZD();
                    while (i2.hasNext()) {
                        le0_2 le0_22 = (le0_2)i2.next();
                        le0_22.lt0();
                        le0_22.sy(n5++ * 60 + n6, this.OB - le0_22.OB);
                    }
                }
                if ((xe_12 = this.Gg0) == null) return;
                xe_12.lt0();
                this.Gg0.vf(pa0_0.Ht0);
                return;
            }
            for (int j = 0; j < 4; ++j) {
                qj_2 qj_22 = this.Lj0[j];
                int n = this.A20 + 277;
                int n7 = this.dG0 == null ? 50 : 100;
                int n8 = n + n7 + 2;
                qj_22.E40(j * 16 + n8, this.SB0 + 245);
            }
        }
        this.D5.RY(226, 24);
        this.D5.g2(226, 24);
        this.D5.oY(226, 24);
        this.D5.E40(this.A20 + 274, this.SB0 + 34);
        this.XT.lt0();
        this.XT.E40(this.A20 + 275, this.SB0 + 257);
        this.mA0.E40(this.A20 + 460, this.SB0 + 271);
        tk0_0 tk0_02 = this.V20;
        tk0_02.E40(this.A20 + 500 - tk0_02.Mx, this.SB0 + 58);
        this.pa0.E40(this.A20 + 500 - this.V20.Mx, this.SB0 + 236);
    }

    @Override
    public final void Qa(Jn0 jn0) {
        super.Qa(jn0);
        if (this.Jj0 instanceof Fu0) {
            Fu0 fu0 = (Fu0) this.Jj0;
            this.fr0 = (gn_0) rh_2.I2.get(this.DR);
            if (tw0_0.kz0()) {
                this.Jj0 = fu0.so(this.fr0);
                return;
            }
            gn_0 gn = this.fr0;
            int targetIdx = 3;
            int len = fu0.sI0.length;
            wl0_2[] arr = new wl0_2[len];
            for (int i = 0; i < len; ++i) {
                arr[i] = (i == targetIdx) ? fu0.sI0[i].so(gn) : fu0.sI0[i];
            }
            this.Jj0 = new Fu0(arr, fu0);
        }
    }

    public final void x00() {
        if (this.HJ0) {
            lpt6__0.v90(this);
        }
    }

    @Override
    public final boolean nd0(i70_0 object) {
        as0_0 as0_02 = this.fz0;
        if (as0_02 != null && as0_02.Of()) {
            return super.nd0(object);
        }
        if (E00.ZU(object.zu) && object.iT()) {
            int n2 = object.finally$;
            if (rp_0.I90 != null && rp_0.I90.Ov(n2)) {
                this.Ru.Lb(-1);
                return true;
            }
            if (rp_0.Ni != null && rp_0.Ni.Ov(n2)) {
                this.Ru.Lb(1);
                return true;
            }
            if (this.Zw != null && this.Ru.bC == this.Zw) {
                if (rp_0.kC0 != null && rp_0.kC0.Ov(n2)) {
                    this.U80.f00();
                    lpt6__0.v90(this);
                    return true;
                }
                if (rp_0.synchronized$ != null && rp_0.synchronized$.Ov(n2)) {
                    lpt6__0.v90(this.U80);
                    return true;
                }
            } else if (tw0_0.kz0() && this.MF0 != null) {
                if (rp_0.kC0 != null && rp_0.kC0.Ov(n2)) {
                    this.Ru(true);
                    return true;
                }
                if (rp_0.synchronized$ != null && rp_0.synchronized$.Ov(n2)) {
                    this.Ru(false);
                    return true;
                }
                return super.nd0(object);
            }
            if (rp_0.nK0 != null && rp_0.nK0.Ov(n2)) {
                BU.T50.PRn(this.se);
                this.wz();
                return true;
            }
            if (rp_0.sJ0 != null && rp_0.sJ0.Ov(n2)) {
                if (this.U80 != null && this.U80.Of()) {
                    a7_0.bH(this.U80.ER.Fc0);
                }
                return true;
            }
        }
        int n;
        if (tw0_0.Yw(8) && E00.C10(n = object.zu) && n != 3 && object.nA0 == 1) {
            VU vU = tw0_0.rl.PC0.sF(this.se);
            if (vU != null) {
                short s = vU.I8.ou0;
                Vt0 vt06 = new Vt0("SET");
                EP eP7 = new EP(sm0_0.c0(8011));
                vt06.hx.add(eP7);
                for (int n5 = 0; n5 < 2; ++n5) {
                    boolean bl = n5 == 0;
                    at_0 at_010 = new at_0("" + bl, () -> ng_2.T10(s, bl));
                    eP7.hx.add(at_010);
                    at_010.LG(vU.I8.I() != bl);
                }
                for (int n5 = 0; n5 < 2; ++n5) {
                    boolean bl = n5 == 0;
                    at_0 at_011 = new at_0("Secret " + bl, () -> ng_2.Xp(s, bl));
                    eP7.hx.add(at_011);
                    at_011.LG(vU.I8.u3() != bl);
                }
                if (tw0_0.Yw(9)) {
                    EP eP8 = new EP(sm0_0.c0(8119));
                    vt06.hx.add(eP8);
                    for (int n5 = 0; n5 < 2; ++n5) {
                        boolean bl = n5 == 0;
                        at_0 at_012 = new at_0("" + bl, () -> ng_2.A2(s, bl));
                        eP8.hx.add(at_012);
                        at_012.LG(vU.I8.aR() != bl);
                    }
                }
                EP eP5 = new EP(sm0_0.c0(8100));
                vt06.hx.add(eP5);
                for (int n5 = 0; n5 < 2; ++n5) {
                    boolean bl = n5 == 0;
                    at_0 at_013 = new at_0("" + sm0_0.c0(n5 + 8101), () -> ng_2.UB(s, bl));
                    eP5.hx.add(at_013);
                    at_013.LG(vU.Dg0() != n5);
                }
                EP eP4 = new EP(sm0_0.c0(1824));
                vt06.hx.add(eP4);
                EP eP3 = new EP(sm0_0.c0(8099));
                eP4.hx.add(eP3);
                for (int n4 = 0; n4 < 2; ++n4) {
                    boolean bl2 = n4 == 0;
                    eP3.hx.add(new at_0("" + bl2, () -> ng_2.lV(s, bl2)));
                }
                int n6 = -1;
                short[] forms = vU.SC.h5;
                for (int n3 = 0; n3 < forms.length; ++n3) {
                    int formId = forms[n3];
                    if (formId == 0 || n6 == formId || (!vU.I8.ca() && n3 == 2)) continue;
                    n6 = formId;
                    final int formIndex = n3;
                    at_0 formBtn = new at_0(sm0_0.c0(formId + 210000), () -> ng_2.ta0(s, formIndex));
                    eP4.hx.add(formBtn);
                    if (formId == vU.Aq0()) {
                        formBtn.LG(false);
                    }
                }
                Vt0 vt04 = new Vt0(sm0_0.c0(5585));
                vt06.hx.add(vt04);
                for (rz_0 rz : rz_0.lpT5) {
                    String string = rz.Hv == null ? "\n" + sm0_0.c0(1806) : "\n+10% " + rz.j10 + " -10% " + rz.Hv;
                    at_0 at_017 = new at_0(sm0_0.c0(rz.f10 + 180000) + string, () -> ng_2.L8(s, rz));
                    vt04.hx.add(at_017);
                    at_017.LG(rz != vU.I8.yb);
                }
                Vt0 vt03 = new Vt0(sm0_0.c0(3057));
                vt06.hx.add(vt03);
                vt03.hx.add(new at_0("<ADD ALL>", () -> ng_2.Qe(s)));
                for (QL ql : QL.j90) {
                    ql.getClass();
                    String sName = sm0_0.c0(ql == QL.lQ ? 61 : (ql == QL.Ll ? 49 : ql.D7 + 10800));
                    vt03.hx.add(new at_0(sName, () -> ng_2.Fh0(s, ql)));
                }
                EP eP2 = new EP(sm0_0.c0(1849));
                vt06.hx.add(eP2);
                eP2.hx.add(new at_0("Max", () -> ng_2.I9(s)));
                eP2.hx.add(new at_0("Half", () -> ng_2.C9(s)));
                eP2.hx.add(new at_0("Zero", () -> ng_2.ht0(s)));
                eP2.hx.add(new at_0("Random", () -> ng_2.FC(s)));
                EP eP = new EP(sm0_0.c0(1800));
                vt06.hx.add(eP);
                eP.hx.add(new at_0("Max", () -> ng_2.FU(s)));
                eP.hx.add(new at_0("Half", () -> ng_2.LY(s)));
                eP.hx.add(new at_0("Reset", () -> ng_2.Jd0(s)));
                for (gc_2 gc : gc_2.Wp) {
                    EP statSub = new EP(gc.name());
                    eP.hx.add(statSub);
                    statSub.hx.add(new at_0("Max", () -> ng_2.GG0(s, gc)));
                    statSub.hx.add(new at_0("Half", () -> ng_2.bK(s, gc)));
                    statSub.hx.add(new at_0("Zero", () -> ng_2.i50(s, gc)));
                }
                Vt0 vt02 = new Vt0(sm0_0.c0(1811));
                vt06.hx.add(vt02);
                vt02.mA0("Max", () -> ng_2.gm0(s));
                vt02.mA0("Half", () -> ng_2.q50(s));
                vt02.mA0("Zero", () -> ng_2.OO(s));
                Vt0 vt0 = new Vt0(sm0_0.c0(2));
                vt06.hx.add(vt0);
                for (int j = 0; j < 25; ++j) {
                    String string = j < 16 ? sm0_0.c0(j + 248001) : (j < 24 ? sm0_0.c0(j + 245476) : sm0_0.c0(245576));
                    Wr wr = ob0_0.Ui0().W6((byte)j);
                    final int ballIdx = j;
                    vt0.hx.add(new kf0_1(string, wr, 8, 8, 0, 0, () -> ng_2.le(s, ballIdx), false));
                }
                if (tw0_0.Yw(8)) {
                    EP eP11 = new EP("Set OT");
                    eP11.hx.add(new at_0(sm0_0.c0(5685), () -> ng_2.bT(s)));
                    eP11.hx.add(new at_0(sm0_0.c0(5684), () -> ng_2.vu0(s)));
                    eP11.hx.add(new at_0("Unknown OT", () -> ng_2.J00(s)));
                    eP11.hx.add(new at_0(tw0_0.e60.jB0.oc0, () -> ng_2.Ps(s)));
                    vt06.hx.add(eP11);
                }
                if (tw0_0.Yw(7)) {
                    at_0 at_027 = new at_0("Set Gift", () -> ng_2.O30(s));
                    at_027.LG(vU.I8.gS(21) ^ true);
                    vt06.hx.add(at_027);
                }
                if (tw0_0.Yw(9)) {
                    vt06.hx.add(new at_0("Clone", this::com3));
                }
                if (tw0_0.Yw(9)) {
                    Vt0 vt07 = new Vt0(sm0_0.c0(1847));
                    vt06.hx.add(vt07);
                    vt07.mA0("Clear", () -> ng_2.m5(s));
                    for (int[] nArray : wx0) {
                        LongSupplier longSupplier = () -> ng_2.lPt8(vU, nArray);
                        vt07.mA0(sm0_0.Bw((byte)2, lpt6__2.Q80, 170, nArray[3], sm0_0.zb0), () -> ng_2.Com9(s, longSupplier));
                    }
                    for (int[][] grid : oh) {
                        for (int[] n12 : grid) {
                            LongSupplier longSupplier = () -> ng_2.qd(vU, n12);
                            vt07.mA0(sm0_0.Bw((byte)2, lpt6__2.Q80, 170, n12[3], sm0_0.zb0), () -> ng_2.Hx0(s, longSupplier));
                        }
                    }
                }
                UA.rL(vt06, this, object.f8, object.AN);
                return true;
            }
            VU vU2 = tw0_0.rl.r1(_volatile.Bf0).sF(this.se);
            if (vU2 != null) {
                Vt0 vt0 = new Vt0("SET");
                if (tw0_0.Yw(9)) {
                    vt0.hx.add(new at_0("Clone", () -> ng_2.wm(vU2)));
                }
                if (vt0.hx.size() != 0) {
                    UA.rL(vt0, this, object.f8, object.AN);
                }
            }
        }
        return super.nd0(object);
    }

    public final void Ru(boolean bl) {
        if (this.MF0 == null) {
            return;
        }
        int n = -1;
        short n2 = 0;
        while (n2 < this.MF0.KB) {
            if (this.MF0.get(n2) != null && ((Jm0) this.MF0.get(n2)).ER.U20()) {
                n = n2;
                break;
            }
            n2 = (short) (n2 + 1);
        }
        if (bl) {
            if (n > 0) {
                Jm0 jm0 = (Jm0) this.MF0.get(n - 1);
                if (jm0 != null && jm0.OI) {
                    jm0.ER.lK0(true);
                    a7_0.bH(jm0.ER.Fc0);
                }
            }
        } else {
            if (n < this.MF0.KB - 1) {
                Jm0 jm0 = (Jm0) this.MF0.get(n + 1);
                if (jm0 != null && jm0.OI) {
                    jm0.ER.lK0(true);
                    a7_0.bH(jm0.ER.Fc0);
                }
            }
        }
    }

    public final void wz() {
        le0_2 target = this.Pb0;
        if (target != null && target.eE && target.OI) {
            lpt6__0.v90(target);
        }
    }

    @Override
    public final void t5() {
        super.t5();
        this.xc = true;
        I2 i2 = this.la0.ZD();
        while (i2.hasNext()) {
            ((fy0_0)i2.next()).dispose();
        }
    }

    @Override
    public final void C(zk0_1 zk0_12) {
        super.C(zk0_12);
        if (tw0_0.kz0()) {
            this.ln = new C90(new T80(asBridge()));
            zk0_12.cL.HV.P6(0, this.ln);
        }
    }

    @Override
    public final void N00(zk0_1 zk0_12) {
        super.N00(zk0_12);
        if (this.ln != null) {
            zk0_12.cL.HV.sj0(this.ln, true);
        }
    }

    public final void RM(VU vU, int n) {
        gn_0 color = gn_0.DARKGRAY;
        boolean bl = (vU.I8.jw0 & 1 << n) != 0;
        if (bl) {
            color = MS[n];
        }
        if (tw0_0.kz0() && n != 4) {
            color = gn_0.WHITE;
        }
        this.Lj0[n].tp0.r8(fn_0.qz0().Ny0(n, tw0_0.kz0(), bl));
        this.Lj0[n].tp0.wx0(color);
    }

    public static void wm(VU vU) {
        tw0_0.rl.Cp(zo_0.Pk, "//clonepokemon " + vU.pu, "", true);
    }

    public static void Hx0(short s, LongSupplier longSupplier) {
        tw0_0.rl.Cp(zo_0.Pk, CO.go("//setribbons ", s, " ").append(longSupplier.getAsLong()).toString(), "", true);
    }

    public static long qd(VU vU, int[] nArray) {
        CE ce = vU.I8;
        int n = nArray[0];
        int n2 = nArray[1];
        if (!ce.iB()) {
            if (n2 < 0) {
                n2 = 0;
            }
            if (n2 > 4) {
                n2 = 4;
            }
            if (!ce.W8(n, n2)) {
                n = n * 3 + 1;
                ce.gU = ce.gU & ~(7L << n) | ((long) n2 << n);
            }
        }
        return ce.gU;
    }

    public static void Com9(short s, LongSupplier longSupplier) {
        tw0_0.rl.Cp(zo_0.Pk, CO.go("//setribbons ", s, " ").append(longSupplier.getAsLong()).toString(), "", true);
    }

    public static long lPt8(VU vU, int[] nArray) {
        CE ce = vU.I8;
        int n = nArray[0];
        if (!ce.iB()) {
            ce.gU |= 1L << n;
        }
        return ce.gU;
    }

    public static void m5(short s) {
        BR bR = tw0_0.rl;
        String string = "//setribbons " + s + " 0";
        bR.getClass();
        bR.Cp(zo_0.Pk, string, "", true);
    }

    public static void O30(short s) {
        BR bR = tw0_0.rl;
        String string = "//setgift " + s;
        bR.getClass();
        bR.Cp(zo_0.Pk, string, "", true);
    }

    public static void Ps(short s) {
        BR bR = tw0_0.rl;
        String string = CO.go("//setot ", s, " ").append(tw0_0.e60.jB0.oc0).toString();
        bR.getClass();
        bR.Cp(zo_0.Pk, string, "", true);
    }

    public static void J00(short s) {
        BR bR = tw0_0.rl;
        String string = "//setot " + s + " unknown";
        bR.getClass();
        bR.Cp(zo_0.Pk, string, "", true);
    }

    public static void vu0(short s) {
        BR bR = tw0_0.rl;
        String string = "//setot " + s + " {STRING_5684}";
        bR.getClass();
        bR.Cp(zo_0.Pk, string, "", true);
    }

    public static void bT(short s) {
        BR bR = tw0_0.rl;
        String string = "//setot " + s + " {STRING_5685}";
        bR.getClass();
        bR.Cp(zo_0.Pk, string, "", true);
    }

    public static void le(short s, int n) {
        BR bR = tw0_0.rl;
        String string = "//setballtype " + tw0_0.e60.jB0.oc0 + " " + s + " " + n;
        bR.getClass();
        bR.Cp(zo_0.Pk, string, "", true);
    }

    public static void OO(short s) {
        BR bR = tw0_0.rl;
        String string = "//sethappiness " + s + " 0";
        bR.getClass();
        bR.Cp(zo_0.Pk, string, "", true);
    }

    public static void q50(short s) {
        BR bR = tw0_0.rl;
        String string = "//sethappiness " + s + " 127";
        bR.getClass();
        bR.Cp(zo_0.Pk, string, "", true);
    }

    public static void gm0(short s) {
        BR bR = tw0_0.rl;
        String string = "//sethappiness " + s + " 255";
        bR.getClass();
        bR.Cp(zo_0.Pk, string, "", true);
    }

    public static void i50(short s, gc_2 gc_22) {
        BR bR = tw0_0.rl;
        String string = CO.go("//setevs ", s, " ").append(gc_22.name()).append(" 0").toString();
        bR.getClass();
        bR.Cp(zo_0.Pk, string, "", true);
    }

    public static void bK(short s, gc_2 gc_22) {
        BR bR = tw0_0.rl;
        String string = CO.go("//setevs ", s, " ").append(gc_22.name()).append(" 126").toString();
        bR.getClass();
        bR.Cp(zo_0.Pk, string, "", true);
    }

    public static void GG0(short s, gc_2 gc_22) {
        BR bR = tw0_0.rl;
        String string = CO.go("//setevs ", s, " ").append(gc_22.name()).append(" 252").toString();
        bR.getClass();
        bR.Cp(zo_0.Pk, string, "", true);
    }

    public static void Jd0(short s) {
        gc_2[] gc_2Array = gc_2.Wp;
        int n = gc_2.Wp.length;
        for (int j = 0; j < n; ++j) {
            gc_2 stat = gc_2Array[j];
            tw0_0.rl.Cp(zo_0.Pk, CO.go("//setevs ", s, " ").append(stat.name()).append(" 0").toString(), "", true);
        }
    }

    public static void LY(short s) {
        gc_2[] gc_2Array = gc_2.Wp;
        int n = gc_2.Wp.length;
        for (int j = 0; j < n; ++j) {
            gc_2 stat = gc_2Array[j];
            tw0_0.rl.Cp(zo_0.Pk, CO.go("//setevs ", s, " ").append(stat.name()).append(" 42").toString(), "", true);
        }
    }

    public static void FU(short s) {
        gc_2[] gc_2Array = gc_2.Wp;
        int n = gc_2.Wp.length;
        for (int j = 0; j < n; ++j) {
            gc_2 stat = gc_2Array[j];
            tw0_0.rl.Cp(zo_0.Pk, CO.go("//setevs ", s, " ").append(stat.name()).append(" 85").toString(), "", true);
        }
    }

    public static void FC(short s) {
        BR bR = tw0_0.rl;
        String string = CO.go("//setivs ", s, " ").append(rg0_2.r4(31)).append(" ").append(rg0_2.r4(31)).append(" ").append(rg0_2.r4(31)).append(" ").append(rg0_2.r4(31)).append(" ").append(rg0_2.r4(31)).append(" ").append(rg0_2.r4(31)).append("").toString();
        bR.getClass();
        bR.Cp(zo_0.Pk, string, "", true);
    }

    public static void ht0(short s) {
        BR bR = tw0_0.rl;
        String string = "//setivs " + s + " 0 0 0 0 0 0";
        bR.getClass();
        bR.Cp(zo_0.Pk, string, "", true);
    }

    public static void C9(short s) {
        BR bR = tw0_0.rl;
        String string = "//setivs " + s + " 15 15 15 15 15 15";
        bR.getClass();
        bR.Cp(zo_0.Pk, string, "", true);
    }

    public static void I9(short s) {
        BR bR = tw0_0.rl;
        String string = "//setivs " + s + " 31 31 31 31 31 31";
        bR.getClass();
        bR.Cp(zo_0.Pk, string, "", true);
    }

    public static void Fh0(short s, QL qL) {
        BR bR = tw0_0.rl;
        String string = CO.go("//addparticle ", s, " ").append(qL.D7).toString();
        bR.getClass();
        bR.Cp(zo_0.Pk, string, "", true);
    }

    public static void Qe(short s) {
        QL[] qLArray = QL.j90;
        int n = QL.j90.length;
        for (int j = 0; j < n; ++j) {
            QL qL = qLArray[j];
            tw0_0.rl.Cp(zo_0.Pk, CO.go("//addparticle ", s, " ").append(qL.D7).toString(), "", true);
        }
    }

    public static void L8(short s, rz_0 rz_02) {
        BR bR = tw0_0.rl;
        String string = CO.go("//setnature ", s, " ").append(sm0_0.c0(rz_02.f10 + 180000).toUpperCase()).toString();
        bR.getClass();
        bR.Cp(zo_0.Pk, string, "", true);
    }

    public static void ta0(short s, int n) {
        BR bR = tw0_0.rl;
        String string = "//setability " + tw0_0.e60.jB0.oc0 + " " + s + " " + n;
        bR.getClass();
        bR.Cp(zo_0.Pk, string, "", true);
    }

    public static void lV(short s, boolean bl) {
        BR bR = tw0_0.rl;
        String string = "//setha " + s + " " + bl;
        bR.getClass();
        bR.Cp(zo_0.Pk, string, "", true);
    }

    public static void UB(short s, boolean bl) {
        BR bR = tw0_0.rl;
        String string = CO.go("//setgender ", s, " ").append(bl ? 0 : 1).toString();
        bR.getClass();
        bR.Cp(zo_0.Pk, string, "", true);
    }

    public static void A2(short s, boolean bl) {
        BR bR = tw0_0.rl;
        String string = "//setalpha " + s + " " + bl;
        bR.getClass();
        bR.Cp(zo_0.Pk, string, "", true);
    }

    public static void Xp(short s, boolean bl) {
        BR bR = tw0_0.rl;
        String string = "//setsecretshiny " + tw0_0.e60.jB0.oc0 + " " + s + " " + bl;
        bR.getClass();
        bR.Cp(zo_0.Pk, string, "", true);
    }

    public static void T10(short s, boolean bl) {
        BR bR = tw0_0.rl;
        String string = "//setshiny " + tw0_0.e60.jB0.oc0 + " " + s + " " + bl;
        bR.getClass();
        bR.Cp(zo_0.Pk, string, "", true);
    }

    public static /* synthetic */ void MJ() {
        i4_0 i4_02 = kr_2.R4();
        tw0_0.lM.getClass();
        i4_02.dispose();
    }

    /*
     * Enabled aggressive block sorting
     */
        public static void Ro(VU vU, Jm0 jm0) {
        if (tw0_0.PK0 != null) {
            jm0.ER.lK0(vU.I8.N00 == QL.Uy0);
            return;
        }
        QL qL = (vU.I8.N00 == QL.Uy0) ? QL.lQ : QL.Uy0;
        tw0_0.rl.fk0.uQ(new fn_1(vU.pu, qL));
    }

    public static void NH0(VU vU, QL qL, Jm0 jm0) {
        if (tw0_0.PK0 != null) {
            jm0.ER.lK0(vU.I8.N00 == qL);
            return;
        }
        if (vU.I8.N00 == qL) {
            qL = QL.lQ;
        }
        tw0_0.rl.fk0.uQ(new fn_1(vU.pu, qL));
    }

    public static void sk0(VU vU) {
        tw0_0.rl.fk0.uQ(new s20_0((byte) 3, (byte) 2, vU.pu));
    }

    public static void Pj(VU vU) {
        tw0_0.rl.fk0.uQ(new s20_0((byte) 2, (byte) 1, vU.pu));
    }

    public static void M10(VU vU) {
        tw0_0.rl.fk0.uQ(new s20_0((byte) 1, (byte) 0, vU.pu));
    }

    public static void MH0(VU vU) {
        tw0_0.rl.fk0.uQ(new s20_0((byte) 2, (byte) 3, vU.pu));
    }

    public static void po(VU vU) {
        tw0_0.rl.fk0.uQ(new s20_0((byte) 1, (byte) 2, vU.pu));
    }

    public static void yw(VU vU) {
        tw0_0.rl.fk0.uQ(new s20_0((byte) 0, (byte) 1, vU.pu));
    }

    public static void z3(vk0_1 vk0_12, VU vU) {
        BU bU = BU.T50;
        CE ce = (vU != null) ? vU.I8 : null;
        QH qH = new QH(bU, s2_0.Fl0(vk0_12, ce, 64));
        bU.SL(qH);
    }

    public static void UG0(VU vU) {
        tw0_0.rl.fk0.uQ(new Ma(vU.pu, true));
    }

    public static void LB(VU vU) {
        b3_0 buf = new b3_0();
        buf.sV(vU.I8.Ql0());
        buf.GC0('\t');
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss a z");
        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
        buf.sV(sdf.format((long) vU.I8.t50 * 1000L));
        buf.GC0('\t');
        buf.sV(vU.k30());
        buf.sV(" (");
        buf.on(vU.I8.Yb0);
        buf.sV(")");
        buf.GC0('\t');
        buf.on(vU.I8.aJ0).GC0('\t');
        buf.sV(sm0_0.c0(vU.I8.yb.f10 + 180000));
        buf.GC0('\t');
        buf.on(vU.I8.RI(gc_2.RC)).GC0('\t');
        buf.on(vU.I8.RI(gc_2.r4)).GC0('\t');
        buf.on(vU.I8.RI(gc_2.ly)).GC0('\t');
        buf.on(vU.I8.RI(gc_2.ej)).GC0('\t');
        buf.on(vU.I8.RI(gc_2.lL0)).GC0('\t');
        buf.on(vU.I8.RI(gc_2.ie0));
        tw0_0.rl.qK("Copied to clipboard");
        lg_0.k.E00.getClass();
        hl_2.Ja0(buf.toString());
    }

    public static void ID0(VU vU) {
        BU bU = BU.T50;
        cq_0 cq_02 = vU.f60;
        byte b = vU.I8.ZF0;
        fd0_0 fd0_02 = bU.le;
        if (fd0_02 == null) {
            bU.QS();
        } else {
            lpt6__0.v90(fd0_02);
        }
        bU.le.y0(b, cq_02);
    }

    public static void cH0(VU vU, qj_2 qj_22) {
        RJ0 rj0 = tw0_0.rl.NC[1];
        byte by = vU.I8.QQ;
        mc0_1 currentBall = (mc0_1) gu0.l2.iz.BM(by);
        ArrayList<mc0_1> list = new ArrayList<>();
        short[] ballList = n70_0.l3;
        for (int i = 0; i < 25; ++i) {
            short s = ballList[i];
            if (!rj0.Dj0((byte) -1, s, (short) 1)) {
                s = rj0.Dj0((byte) -1, X4.S90(s), (short) 1) ? X4.S90(s) : 0;
            }
            if (s <= 0) continue;
            mc0_1 ball = gu0.l2.lPT6(s);
            if (ball.Bk0 == currentBall.Bk0) continue;
            list.add(ball);
        }
        if (list.size() < 1) {
            return;
        }
        Vt0 vt0 = new Vt0();
        for (mc0_1 ball : list) {
            String name = sm0_0.c0(ball.Nl);
            Wr icon = gh_1.aH0.F10(ball, false);
            vt0.hx.add(new kf0_1(name, icon, 3, 3, 24, 24, () -> ng_2.OT(vU, currentBall, ball, qj_22), false));
        }
        vt0.mA0(sm0_0.c0(nf0_0.Bq0), ng_2::Zf0);
        UA.CI0(vt0, qj_22);
    }

    public static void Zf0() {
    }

    public static void OT(VU vU, mc0_1 oldBall, mc0_1 newBall, qj_2 qj_22) {
        Qy0 qy0 = Qy0.yI0;
        String[] stringArray = new String[3];
        stringArray[0] = vU.k30();
        stringArray[1] = (oldBall == null) ? "" : sm0_0.c0(oldBall.Nl);
        stringArray[2] = sm0_0.c0(newBall.Nl);
        String msg = sm0_0.Bx(1892, stringArray);
        lpt3__4 dialog = new lpt3__4(msg, () -> ng_2.LL(vU, newBall), qj_22);
        dialog.D80 = true;
        qy0.sr0(dialog);
    }

    public static void LL(VU vU, mc0_1 ball) {
        tw0_0.rl.fk0.uQ(new tu_1(vU.pu, ball.Z8));
    }

    static {
        gn_0[] gn_0Array = new gn_0[5];
        gn_0Array[0] = new gn_0((byte) -1, (byte) -77, (byte) -70, (byte) -1);
        gn_0Array[1] = new gn_0((byte) -1, (byte) -1, (byte) -70, (byte) -1);
        gn_0Array[2] = new gn_0((byte) -70, (byte) -1, (byte) -55, (byte) -1);
        gn_0Array[3] = new gn_0((byte) -70, (byte) -31, (byte) -1, (byte) -1);
        gn_0Array[4] = gn_0.WHITE;
        MS = gn_0Array;
        int[][] nArrayArray = new int[15][];
        nArrayArray[0] = new int[]{16, 0, 8, 0, 80};
        nArrayArray[1] = new int[]{22, 0, 38, 42, 122};
        nArrayArray[2] = new int[]{23, 0, 39, 43, 123};
        nArrayArray[3] = new int[]{20, 2, 11, 51, 131};
        nArrayArray[4] = new int[]{27, 4, 12, 52, 132};
        nArrayArray[5] = new int[]{28, 0, 13, 53, 133};
        nArrayArray[6] = new int[]{29, 1, 14, 54, 134};
        nArrayArray[7] = new int[]{30, 0, 15, 55, 135};
        nArrayArray[8] = new int[]{31, 3, 16, 56, 136};
        nArrayArray[9] = new int[]{32, 0, 17, 57, 137};
        nArrayArray[10] = new int[]{33, 2, 18, 58, 138};
        nArrayArray[11] = new int[]{24, 1, 19, 59, 139};
        nArrayArray[12] = new int[]{25, 3, 20, 60, 140};
        nArrayArray[13] = new int[]{26, 0, 21, 61, 141};
        nArrayArray[14] = new int[]{34, 0, 24, 64, 144};
        wx0 = nArrayArray;
        oh = new int[4][5][5];
        for (int j = 0; j < oh.length; ++j) {
            for (int k = 0; k < oh[j].length; ++k) {
                int[] entry = oh[j][k];
                entry[0] = k;
                entry[1] = j + 1;
                entry[2] = j;
                int n = k * 4;
                entry[3] = n + 2 + j;
                entry[4] = n + 82 + j;
            }
        }
        aUx = CH0.j1;
    }

    public static void P9(xe_1 btn) {
        Qy0.yI0.dk(-1, "Object id copied to clipboard");
        lg_0.k.E00.getClass();
        hl_2.Ja0(btn.U4);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
        public PokemonSummaryWindow(BU var1_1, VU var2_5, qo_1 var3_6, boolean var4_8, boolean var5_14) {
        super(tw0_0.kz0(), !var5_14);
        this.Zw = null;
        this.U80 = null;
        this.gN = 500;
        this.jc = 382;
        this.class$ = new es_1(7);
        this.Pb0 = null;
        this.b00 = 0;
        this.xc = false;
        this.la0 = new es_1();
        this.Rf0 = 1;
        if (tw0_0.kz0()) {
            this.uf("monster-frame-mobile");
        } else {
            this.uf("monster-frame");
        }
        tw0_0.Dc0();
        this.gN = 506;
        this.jc = 316;
        this.Ko(true);
        if (tw0_0.kz0()) {
            this.gN = tw0_0.LD0.ew0();
            this.jc = tw0_0.LD0.Hv0();
        }
        this.HJ0 = var4_8;
        this.Pb0(() -> this.Wg(var1_1, var2_5));
        if (var2_5.uF0()) {
            this.DR = i40_0.Gc;
        } else {
            i40_0 i40_02 = var2_5.ZE();
            this.DR = i40_02;
            if (dw_2.o70) {
                ff_0 ff_02 = new ff_0(tw0_0.LD0.U1);
                this.rw = ff_02;
                ff_02.nI(tw0_0.Ll0.Qz0);
                this.la0.Ue0(ff_02);
                ParticleEffectExt effect = ff_02.UH0("special/type_" + i40_02.o6());
                this.c0 = effect;
                effect.start();
                ff_02.zd();
                ff_02.fY(effect);
            }
        }
        this.se = var2_5.ZK();
        fy_2 infoTab = new fy_2();
        this.Ru = new P8();
        this.Ru.I6(false);
        this.Hy(ig_0.u9(0, new StringBuilder(), " ").append(sm0_0.c0(1801)).toString());
        this.qq = new TK(asBridge());
        this.qq.ZZ((zs_1)(object -> this.GF0(var2_5, (e90_0)object)));
        this.v4(var2_5, true);
        qj_2 ballIcon = tw0_0.kz0() ? new qj_2(32, 32) : new qj_2(16, 16);
        ballIcon.uf("monsterframe-ball");
        ballIcon.sl().Nk(new Wr[]{ob0_0.Ui0().W6(var2_5.RJ().PRn())});
        boolean canChangeBall = (var2_5.RJ().nq() == _volatile.BV || var2_5.RJ().nq().Fs()) && var2_5.rX();
        ballIcon.pw0(canChangeBall);
        ballIcon.RR(() -> ng_2.cH0(var2_5, ballIcon));
        S70 formIcon = new S70(16, 16);
        S70 shinyIcon = new S70(24, 24);
        S70 alphaIcon = new S70(24, 24);
        this.pa0 = alphaIcon;
        S70 pokerusIcon = new S70(24, 24);
        S70 markIcon = new S70(24, 24);
        S70 genderIcon = new S70(24, 24);
        this.V20 = new tk0_0();
        A40 headerIconsArea = this.V20.gg0;
        if (var2_5.RJ().I() && !var2_5.uF0()) {
            shinyIcon.JH().r8(new LPT6_[]{fn_0.qz0().p20(var2_5.RJ().u3())});
            if (tw0_0.kz0()) {
                shinyIcon.JH().dA(2.0f);
                shinyIcon.VA(48, 48);
            }
            if (var2_5.RJ().u3()) {
                shinyIcon.Xr0(sm0_0.c0(10996));
            } else {
                shinyIcon.Xr0(sm0_0.c0(5614));
            }
            shinyIcon.Bb(0);
            headerIconsArea.vx0(shinyIcon).im0();
        }
        if (var2_5.RJ().ca()) {
            markIcon.JH().r8(new LPT6_[]{fn_0.qz0().BX()});
            if (tw0_0.kz0()) {
                markIcon.JH().dA(2.0f);
                markIcon.VA(48, 48);
            }
            markIcon.Xr0(sm0_0.c0(1886));
            markIcon.Bb(0);
            headerIconsArea.vx0(markIcon).im0();
        }
        if (var2_5.RJ().aR()) {
            pokerusIcon.JH().r8(new LPT6_[]{fn_0.qz0().SB()});
            if (tw0_0.kz0()) {
                pokerusIcon.JH().dA(2.0f);
                pokerusIcon.VA(48, 48);
            }
            pokerusIcon.Xr0(sm0_0.wa0(1887, sm0_0.c0(0)));
            pokerusIcon.Bb(0);
            headerIconsArea.vx0(pokerusIcon).im0();
        }
        if (var2_5.RJ().pg()) {
            genderIcon.JH().Nk(new Wr[]{gh_1.Jh0().zm((short)1446)});
            if (tw0_0.kz0()) {
                genderIcon.JH().dA(2.0f);
                genderIcon.VA(48, 48);
            }
            genderIcon.Xr0(sm0_0.wa0(1923, mp_1.vf0().W50((short)655).FZ()));
            genderIcon.Bb(0);
            headerIconsArea.vx0(genderIcon).im0();
        }
        if (!var2_5.uF0() && var2_5.RJ().No().Ex() > 0) {
            QL activeRibbon = var2_5.RJ().No();
            alphaIcon.JH().df();
            alphaIcon.JH().r8(new LPT6_[]{fn_0.qz0().Ku(activeRibbon.Ex(), var2_5.RJ().u3())});
            alphaIcon.VA(24, 24);
            alphaIcon.Bb(0);
            alphaIcon.Xr0(lb0_2.CU(activeRibbon, var2_5.RJ().u3()));
            if (tw0_0.kz0()) {
                alphaIcon.JH().dA(2.0f);
                alphaIcon.VA(48, 48);
                headerIconsArea.vx0(alphaIcon).im0();
            }
        }
        if (tw0_0.kz0()) {
            formIcon.JH().dA(2.0f);
            formIcon.JH().Gy0(-4, -4);
            ballIcon.sl().dA(2.0f);
            ballIcon.sl().Gy0(0, -7);
        }
        cn_0 nameLabel = new cn_0();
        String nameStr = var2_5.na0();
        if (nameStr.length() > 11) {
            nameStr = nameStr.substring(0, 11) + "...";
            nameLabel.Xr0(var2_5.na0());
            nameLabel.Bb(150);
        }
        nameLabel.Sk(nameStr);
        if (!var2_5.uF0() && var2_5.Dg0() >= 0) {
            formIcon.JH().r8(new LPT6_[]{fn_0.qz0().Cn(var2_5.Dg0())});
        }
        StringBuilder lvlSb = ig_0.u9(59, new StringBuilder(), " ");
        String lvlStr = var2_5.uF0() ? "???" : Byte.toString(var2_5.RJ().tr0());
        cn_0 lvlLabel = new cn_0(lvlSb.append(lvlStr).toString());
        lvlLabel.uf("label");
        this.D5 = new fy_2();
        this.D5.uf("nameplate");
        this.hq = new S70(55, 22);
        if (var2_5.uF0()) {
            this.hq.Sk("");
        } else if (var2_5.KD().o6() != var2_5.KI().o6()) {
            this.dG0 = new S70(53, 22);
            this.hq.JH().r8(new LPT6_[]{fn_0.qz0().jJ0(var2_5.KD().o6())});
            this.dG0.JH().r8(new LPT6_[]{fn_0.qz0().jJ0(var2_5.KI().o6())});
            this.SL(this.hq);
            this.SL(this.dG0);
            if (tw0_0.kz0()) {
                this.hq.JH().dA(2.0f);
                this.dG0.JH().dA(2.0f);
            }
        } else {
            this.hq.JH().r8(new LPT6_[]{fn_0.qz0().jJ0(var2_5.KD().o6())});
            if (tw0_0.kz0()) {
                this.hq.JH().dA(2.0f);
            }
            this.SL(this.hq);
        }
        this.D5.WQ(this.D5.H10().X20(this.D5.H10().LPt3(new le0_2[]{ballIcon, nameLabel, formIcon}).Ze0().k5(pa0_0.up0, lvlLabel).qd(3)));
        this.D5.x40(this.D5.lo0().Xq(new ya_1[]{this.D5.hb(new le0_2[]{ballIcon, nameLabel, formIcon, lvlLabel})}));
        cn_0 itemTitle = new cn_0(sm0_0.c0(1842));
        HJ0 itemBtn = new HJ0(asBridge(), sm0_0.c0(nf0_0.Po));
        this.XT = new fy_2();
        this.XT.uf("itemplate");
        _volatile[] itemTypes = new _volatile[]{_volatile.kA0, _volatile.CG0, _volatile.BV, _volatile.Bf0, _volatile.Kb};
        for (int k = 0; k < itemTypes.length; ++k) {
            Mj mj = tw0_0.rl.r1(itemTypes[k]);
            if (mj == null || mj.sF(var2_5.ZK()) == null) continue;
            this.CU = mj;
            break;
        }
        short heldItemShort = (short)var2_5.RJ().rh0();
        this.mA0 = new qu_1(this.CU, var2_5, itemBtn, heldItemShort);
        itemBtn.uf("label2");
        this.XT.WQ(this.XT.lo0().Xq(new ya_1[]{this.XT.C7(new le0_2[]{itemTitle, itemBtn})}));
        this.XT.x40(this.XT.H10().Xq(new ya_1[]{this.XT.hb(new le0_2[]{itemTitle, itemBtn})}));
        this.Up = new fy_2();
        if (!tw0_0.kz0()) {
            this.Up.x40(XZ.BC0(this.Up.lo0(), new ya_1[]{this.Up.H10().LPt3(new le0_2[]{this.Ru}).X20(this.Up.hb(new le0_2[]{this.qq})).qd(10)}, this.Up).Xq(new ya_1[]{this.Up.lo0().X20(this.Up.H10().qd(25).X20(this.Up.hb(new le0_2[]{this.qq}))).LPt3(new le0_2[]{this.Ru})}));
            this.SL(this.Up);
        } else {
            this.SL(this.Ru);
            this.SL(this.qq);
        }
        this.SL(this.D5);
        this.SL(this.XT);
        if (var2_5.rX()) {
            this.Lj0 = new qj_2[5];
            for (int i = 0; i < this.Lj0.length; ++i) {
                int size = tw0_0.kz0() ? (i == 4 ? 24 : 32) : (i == 4 ? 24 : 16);
                this.Lj0[i] = new qj_2(size, size);
                this.Lj0[i].uf("spritelabel");
                this.RM(var2_5, i);
                final int curI = i;
                this.Lj0[i].RR(() -> this.nj0(var2_5, curI));
                if (i == 4) {
                    headerIconsArea.vx0(this.Lj0[i]).im0();
                    this.Lj0[i].sl().Gy0(4, 4);
                    if (tw0_0.kz0()) {
                        this.Lj0[i].xf0(48, 48);
                        this.Lj0[i].sl().dA(2.0f);
                        this.Lj0[i].sl().Gy0(0, 0);
                    }
                } else {
                    this.SL(this.Lj0[i]);
                    if (tw0_0.kz0()) {
                        this.Lj0[i].xf0(32, 32);
                    }
                }
            }
        }
        this.ff0(1);
        cn_0 objIdTitle = new cn_0("Object Id:");
        cn_0 trainerIdTitle = new cn_0(g7_0.Zx(1, new StringBuilder(), ":"));
        cn_0 otTitle = new cn_0(sm0_0.c0(1803));
        cn_0 dateTitle = new cn_0(sm0_0.c0(1804));
        cn_0 locTitle = new cn_0(sm0_0.c0(1805));
        cn_0 metTitle = new cn_0(sm0_0.c0(1828));
        xe_1 idBtn = new xe_1(var2_5.ZK().toString());
        idBtn.RR(() -> ng_2.P9(idBtn));
        String objIdFormatted = String.format("%03d", var2_5.Wd().oH());
        cn_0 objIdVal = new cn_0(objIdFormatted);
        qj_2 monsterSprite = new qj_2(var2_5.k30(), pa0_0.up0);
        String trainerIdStr = var2_5.uF0() ? "???" : var2_5.RJ().W4().e8();
        cn_0 trainerIdVal = new cn_0(trainerIdStr);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a");
        cn_0 dateVal = new cn_0(dateFormat.format((long)var2_5.RJ().LPT5() * 1000L));
        if (var2_5.uF0()) {
            trainerIdVal.uf("label-monster-value");
            trainerIdVal.Xr0(null);
        } else if (var2_5.RJ().W4().Ue0() == null) {
            trainerIdVal.uf("label-monster-value-tooltip");
            trainerIdVal.Xr0(sm0_0.c0(1806));
        } else {
            trainerIdVal.uf("label-monster-value-tooltip");
            trainerIdVal.Xr0(lb0_2.GK0(var2_5.RJ().W4()));
        }
        trainerIdVal.Bb(150);
        objIdTitle.uf("label-monster-title");
        trainerIdTitle.uf("label-monster-title");
        otTitle.uf("label-monster-title");
        dateTitle.uf("label-monster-title");
        locTitle.uf("label-monster-title");
        metTitle.uf("label-monster-title");
        idBtn.uf("label-monster-value-name");
        objIdVal.uf("label-monster-value-name");
        monsterSprite.uf("label-monster-value");
        dateVal.uf("label-monster-value");
        cn_0 expTitle = new cn_0(sm0_0.c0(1807));
        expTitle.Xr0(sm0_0.c0(1808));
        cn_0 nextExpTitle = new cn_0(sm0_0.c0(1810));
        cn_0 progressTitle = new cn_0(sm0_0.c0(1829));
        cn_0 happyTitle = new cn_0(sm0_0.c0(1811));
        cn_0 otVal = new cn_0();
        String otName = var2_5.RJ().Ql0();
        if (otName.length() > 11) {
            otName = otName.substring(0, 10) + "...";
            otVal.Xr0(var2_5.RJ().Ql0());
        }
        E90 curPlayer = tw0_0.e60 == null ? null : tw0_0.e60.at();
        if (var2_5.RJ().x40().Uz0() && curPlayer != null && var2_5.RJ().Ql0().equalsIgnoreCase(curPlayer.na0())) {
            otName = QA0.W0(otName, " *");
            otVal.Xr0(sm0_0.c0(2538));
        }
        otVal.Bb(150);
        otVal.Sk(otName);
        String happyStr = var2_5.uF0() ? "???" : var2_5.RJ().Dn0() * 100 / 255 + "%";
        cn_0 happyVal = new cn_0(happyStr);
        cn_0 curExpVal;
        cn_0 toNextExpVal;
        float expProgress;
        if (var2_5.uF0()) {
            curExpVal = new cn_0("???");
            toNextExpVal = new cn_0("???");
            expProgress = 0.0f;
        } else {
            int currentExp = var2_5.RJ().OR();
            byte level = var2_5.RJ().tr0();
            int baseLevelExp = var2_5.Wd().H5().Mu0(level);
            int maxLevelExp = var2_5.Wd().H5().Mu0(100);
            int expDiff = var2_5.Wd().H5().Mu0(level + 1) - baseLevelExp;
            int expGained = currentExp - baseLevelExp;
            float ratio = (float)expGained / (float)expDiff;
            cn_0 expTotalLabel = new cn_0(NumberFormat.getInstance().format(currentExp));
            int expRemaining = expDiff - expGained;
            cn_0 expRemainLabel = new cn_0(NumberFormat.getInstance().format(expRemaining));
            String[] expFormatArgs = new String[]{NumberFormat.getInstance().format(currentExp), NumberFormat.getInstance().format(maxLevelExp)};
            expTotalLabel.Xr0(sm0_0.Bx(1882, expFormatArgs));
            expTotalLabel.Bb(0);
            expRemainLabel.Xr0(expGained + " / " + NumberFormat.getInstance().format(expDiff));
            expRemainLabel.Bb(0);
            if (var2_5.RJ().tr0() == 100) {
                expTotalLabel.Sk(NumberFormat.getInstance().format(var2_5.Wd().H5().Mu0(level)));
                expRemainLabel.Sk("-");
                expProgress = 1.0f;
                toNextExpVal = expRemainLabel;
                curExpVal = expTotalLabel;
            } else {
                if (expRemaining < 1) {
                    expTotalLabel.Sk(NumberFormat.getInstance().format(expDiff) + "+");
                    expRemainLabel.Sk(sm0_0.c0(1879));
                    expRemainLabel.Xr0(sm0_0.c0(1880));
                }
                expProgress = ratio;
                toNextExpVal = expRemainLabel;
                curExpVal = expTotalLabel;
            }
        }
        if (!var2_5.uF0() && var2_5.rX()) {
            monsterSprite.RR(() -> this.HA(var2_5));
            monsterSprite.sl().r8(new LPT6_[]{fn_0.qz0().m7()});
        }
        expTitle.uf("label-monster-title");
        happyTitle.uf("label-monster-title");
        nextExpTitle.uf("label-monster-title");
        progressTitle.uf("label-monster-title");
        otVal.uf("label-monster-value");
        curExpVal.uf("label-monster-value");
        toNextExpVal.uf("label-monster-value");
        happyVal.uf("label-monster-value");
        ae0_1 expProgressBar = new ae0_1();
        expProgressBar.uf("monsterframe-xp-progressbar");
        expProgressBar.aE(expProgress);
        expProgressBar.Xr0((int)(expProgress * 100.0f) + "%");
        expProgressBar.Bb(0);
        ae0_1 happyProgressBar = new ae0_1();
        happyProgressBar.uf("monsterframe-happiness-progressbar");
        happyProgressBar.aE((float)var2_5.RJ().Dn0() * 100.0f / 255.0f / 100.0f);
        fy_2 infoContainer = new fy_2();
        infoContainer.uf("label-monster-area");
        CH0 otGuid = var2_5.RJ().x40();
        ya_1 otRow;
        ya_1 otCol;
        if (!var2_5.uF0() && var2_5.RJ().eM().isEmpty() && (otGuid.Uz0() || otGuid.equals(var2_5.RJ().Zy()) && otGuid.equals(tw0_0.e60.za0()))) {
            otRow = infoContainer.C7(new le0_2[]{otTitle, monsterSprite});
            otCol = infoContainer.hb(new le0_2[]{otTitle, monsterSprite});
        } else {
            otRow = infoContainer.C7(new le0_2[]{otTitle, monsterSprite});
            otCol = infoContainer.hb(new le0_2[]{otTitle, monsterSprite});
            monsterSprite.uf("label-monster-value");
        }
        I7 infoH10 = infoContainer.H10();
        Hm0 infoLo0 = infoContainer.lo0();
        qj_2 infoSpriteExtra = new qj_2(objIdFormatted, pa0_0.up0);
        infoSpriteExtra.sl().Nk(new Wr[]{gh_1.Jh0().S1((short)5431)});
        infoSpriteExtra.sl().nq0(24, 24);
        infoSpriteExtra.uf("label-monster-value");
        infoSpriteExtra.RR(() -> ng_2.ID0(var2_5));
        if (var2_5.U8() < 32767) {   // 所有有效种族(含自定义与新增官方)都显示图鉴编号行
            infoH10.LPt3(new le0_2[]{trainerIdTitle, infoSpriteExtra});
            infoLo0.LPt3(new le0_2[]{trainerIdTitle, infoSpriteExtra});
        }
        ya_1[] infoRows = new ya_1[8];
        infoRows[0] = tw0_0.ng() ? infoContainer.C7(new le0_2[]{objIdTitle, idBtn}) : null;
        infoRows[1] = infoH10;
        infoRows[2] = otRow;
        infoRows[3] = infoContainer.C7(new le0_2[]{locTitle, trainerIdVal});
        infoRows[4] = infoContainer.C7(new le0_2[]{dateTitle, otVal});
        infoRows[5] = infoContainer.C7(new le0_2[]{nextExpTitle, curExpVal});
        infoRows[6] = infoContainer.C7(new le0_2[]{progressTitle, toNextExpVal});
        infoRows[7] = infoContainer.H10().Kn0(expProgressBar);
        ya_1[] infoCols = new ya_1[8];
        infoCols[0] = tw0_0.ng() ? infoContainer.hb(new le0_2[]{objIdTitle, idBtn}) : null;
        infoCols[1] = infoLo0;
        infoCols[2] = otCol;
        infoCols[3] = infoContainer.hb(new le0_2[]{locTitle, trainerIdVal});
        infoCols[4] = infoContainer.hb(new le0_2[]{dateTitle, otVal});
        infoCols[5] = infoContainer.hb(new le0_2[]{nextExpTitle, curExpVal});
        infoCols[6] = infoContainer.hb(new le0_2[]{progressTitle, toNextExpVal});
        infoCols[7] = infoContainer.lo0().Kn0(expProgressBar);
        infoContainer.x40(XZ.BC0(infoContainer.lo0(), infoRows, infoContainer).Xq(infoCols));
        infoTab.x40(XZ.BC0(infoTab.lo0(), new ya_1[]{infoTab.H10().qd(5).LPt3(new le0_2[]{infoContainer})}, infoTab).Xq(new ya_1[]{infoTab.lo0().LPt3(new le0_2[]{infoContainer})}));
        fy_2 statsTab1 = new fy_2();
        cn_0 hpTitle = new cn_0(sm0_0.c0(1809));
        cn_0 atkTitle = new cn_0(sm0_0.c0(1812));
        cn_0 defTitle = new cn_0(sm0_0.c0(1813));
        cn_0 spaTitle = new cn_0(sm0_0.c0(1814));
        cn_0 spdTitle = new cn_0(sm0_0.c0(1815));
        cn_0 speTitle = new cn_0(sm0_0.c0(1816));
        hpTitle.uf("label-monster-title");
        atkTitle.uf("label-monster-title");
        defTitle.uf("label-monster-title");
        spaTitle.uf("label-monster-title");
        spdTitle.uf("label-monster-title");
        speTitle.uf("label-monster-title");
        this.wl = new cn_0[6];
        this.K9(var2_5, var2_5.RJ().tr0(), "");
        ae0_1 hpBar = new ae0_1();
        hpBar.uf("monsterframe-hp-progressbar");
        hpBar.aE((float)var2_5.RJ().JW() / (float)var2_5.zw0().BL0(gc_2.RC));
        xe_1 levelToggle = new xe_1();
        levelToggle.Xr0(sm0_0.c0(1858));
        levelToggle.Bb(100);
        levelToggle.uf("level-toggle");
        levelToggle.pw0(!var2_5.uF0());
        levelToggle.Ll(!var2_5.uF0());
        levelToggle.RR(() -> this.h3(var2_5));
        cn_0 curHpTitle = new cn_0(sm0_0.c0(1817));
        curHpTitle.uf("label-monster-title");
        cn_0 curHpVal = new cn_0(var2_5.RJ().JW() + " / " + var2_5.zw0().BL0(gc_2.RC));
        curHpVal.uf("label-monster-value");
        fy_2 statsArea1 = new fy_2();
        statsArea1.uf("label-monster-area");
        ya_1[] statRows1 = new ya_1[10];
        statRows1[0] = statsArea1.C7(new le0_2[]{hpTitle, this.wl[gc_2.RC.pI0()]});
        statRows1[1] = statsArea1.C7(new le0_2[]{hpBar});
        statRows1[2] = statsArea1.C7(new le0_2[]{curHpTitle, curHpVal});
        statRows1[3] = statsArea1.C7(new le0_2[]{happyProgressBar});
        statRows1[4] = statsArea1.C7(new le0_2[]{atkTitle, this.wl[gc_2.r4.pI0()]});
        statRows1[5] = statsArea1.C7(new le0_2[]{defTitle, this.wl[gc_2.ly.pI0()]});
        statRows1[6] = statsArea1.C7(new le0_2[]{spaTitle, this.wl[gc_2.ej.pI0()]});
        statRows1[7] = statsArea1.C7(new le0_2[]{spdTitle, this.wl[gc_2.lL0.pI0()]});
        statRows1[8] = statsArea1.C7(new le0_2[]{speTitle, this.wl[gc_2.ie0.pI0()]});
        statRows1[9] = statsArea1.H10().Ze0().Kn0(levelToggle);
        ya_1[] statCols1 = new ya_1[10];
        statCols1[0] = statsArea1.hb(new le0_2[]{hpTitle, this.wl[gc_2.RC.pI0()]});
        statCols1[1] = statsArea1.hb(new le0_2[]{hpBar});
        statCols1[2] = statsArea1.hb(new le0_2[]{curHpTitle, curHpVal});
        statCols1[3] = statsArea1.hb(new le0_2[]{happyProgressBar});
        statCols1[4] = statsArea1.hb(new le0_2[]{atkTitle, this.wl[gc_2.r4.pI0()]});
        statCols1[5] = statsArea1.hb(new le0_2[]{defTitle, this.wl[gc_2.ly.pI0()]});
        statCols1[6] = statsArea1.hb(new le0_2[]{spaTitle, this.wl[gc_2.ej.pI0()]});
        statCols1[7] = statsArea1.hb(new le0_2[]{spdTitle, this.wl[gc_2.lL0.pI0()]});
        statCols1[8] = statsArea1.hb(new le0_2[]{speTitle, this.wl[gc_2.ie0.pI0()]});
        statCols1[9] = statsArea1.hb(new le0_2[]{levelToggle});
        statsArea1.x40(XZ.BC0(statsArea1.lo0(), statRows1, statsArea1).Xq(statCols1));
        statsTab1.WQ(statsTab1.H10().Xq(new ya_1[]{statsTab1.H10().qd(5).LPt3(new le0_2[]{statsArea1})}));
        statsTab1.x40(statsTab1.lo0().Xq(new ya_1[]{statsTab1.lo0().LPt3(new le0_2[]{statsArea1})}));
        fy_2 historyTab = new fy_2();
        cn_0 metAtTitle = new cn_0(sm0_0.c0(1846));
        String str1 = var2_5.RJ().x40().equals(tw0_0.e60.za0()) ? "" : sm0_0.c0(1871);
        String str2 = sm0_0.c0(1872);
        String str4;
        switch (var2_5.RJ().TG0()) {
            default: {
                int code = var2_5.RJ().mm0() == 0 ? (var2_5.RJ().TG0() & 255) - -139912 : var2_5.RJ().mm0() * 1000 + 140000 + (var2_5.RJ().TG0() & 255);
                if (!sm0_0.wo0(code) || var2_5.RJ().N40() == 0) {
                    code = var2_5.RJ().mm0() + 250000;
                }
                if (var2_5.RJ().aUX()) {
                    code = 1884;
                }
                str4 = sm0_0.c0(code);
                if (var2_5.RJ().xk()) {
                    str4 = sm0_0.wa0(1889, str4);
                    break;
                }
                str4 = sm0_0.wa0(1877, str4);
                break;
            }
            case -1: {
                str1 = "";
                str2 = sm0_0.c0(1874);
                str4 = sm0_0.c0(1876);
                break;
            }
            case -7: 
            case -6: 
            case -5: 
            case -4: 
            case -3: 
            case -2: {
                str1 = "";
                str2 = sm0_0.c0(1874);
                switch (var2_5.RJ().TG0()) {
                    default: {
                        str4 = sm0_0.c0(101769);
                        break;
                    }
                    case -2: {
                        str4 = sm0_0.c0(101775);
                        break;
                    }
                    case -3: {
                        str4 = sm0_0.c0(101773);
                        break;
                    }
                    case -4: {
                        str4 = sm0_0.c0(101771);
                        break;
                    }
                    case -6: {
                        str4 = sm0_0.c0(101730);
                        break;
                    }
                    case -7: {
                        str4 = sm0_0.c0(101754);
                    }
                }
                str4 = sm0_0.wa0(1888, str4);
            }
        }
        String str3 = sm0_0.wa0(1875, var2_5.RJ().N40() + "");
        if (var2_5.RJ().N40() == -1) {
            str2 = sm0_0.c0(1873);
            str3 = "";
        } else if (var2_5.RJ().N40() < 1) {
            str3 = "";
        }
        if (var2_5.uF0()) {
            str1 = "";
            str2 = sm0_0.c0(1874);
            str3 = "";
        }
        String str5 = sm0_0.wa0(1878, dateFormat.format((long)var2_5.RJ().LPT5() * 1000L));
        b3_0 historyDoc = new b3_0();
        String[] histArgs = new String[]{str1, str2, str3, str4, str5};
        historyDoc.vK0(sm0_0.Bx(1870, histArgs));
        historyDoc.vK0("\n\n");
        if (!var2_5.uF0()) {
            if (var2_5.RJ().W4().hF0() != null && var2_5.RJ().W4().Eh0() != null) {
                String[] eggArgs = new String[]{sm0_0.c0(var2_5.RJ().W4().hF0().bB0()), sm0_0.c0(var2_5.RJ().W4().Eh0().bB0())};
                historyDoc.vK0(sm0_0.Bx(1881, eggArgs));
            } else {
                historyDoc.vK0(sm0_0.c0(1883));
            }
            if (var2_5.RJ().yW() != null) {
                historyDoc.vK0("\n\n");
                historyDoc.vK0(sm0_0.H5(lpt6__2.Q80, 188, var2_5.RJ().Sx() % 5 + var2_5.RJ().yW().FZ() * 5 + 53));
            } else {
                int charIdx = tx_1.gX(var2_5.RJ());
                if (charIdx > 5) {
                    charIdx = 5;
                }
                if (gc_2.RK((byte)charIdx) != var2_5.RJ().yW()) {
                    for (int n = 0; n < gc_2.Wp.length && var2_5.RJ().RI(gc_2.RK((byte)charIdx)) != var2_5.RJ().Sx(); ++n) {
                        if (++charIdx <= 5) continue;
                        charIdx = 0;
                    }
                }
                historyDoc.vK0("\n\n");
                historyDoc.vK0(sm0_0.H5(lpt6__2.Q80, 188, var2_5.RJ().Sx() % 5 + charIdx * 5 + 53));
            }
            if (var2_5.RJ().ca()) {
                historyDoc.vK0("\n\n");
                historyDoc.vK0(sm0_0.c0(1885));
            }
        }
        cn_0 histVal = new cn_0(historyDoc.toString());
        metAtTitle.uf("label-monster-title");
        histVal.uf("label-monster-value");
        xe_1 copyDataBtn = null;
        if (tw0_0.ng()) {
            copyDataBtn = new xe_1("Copy Data");
            copyDataBtn.RR(() -> ng_2.LB(var2_5));
            copyDataBtn.RY(100, 25);
            copyDataBtn.lt0();
        }
        S70 ashSprite = null;
        if (var2_5.RJ().df0()) {
            AG0 ashAg = yh_0.Dl0().Kr0((byte)0, yh_0.ls(), false, false)[0];
            if (tw0_0.kz0()) {
                ashSprite = new S70(96, 96);
            } else {
                ashSprite = new S70(32, 32);
            }
            ashSprite.JH().o60(new AG0[]{ashAg});
            if (tw0_0.kz0()) {
                ashSprite.JH().nq0(ashAg.k60() * 3, ashAg.COM9() * 3);
                ashSprite.JH().Gy0(ashSprite.Nl0() - 96, ashSprite.wF() - 100);
            } else {
                ashSprite.JH().Gy0(ashSprite.Nl0() - 30, ashSprite.wF() - 35);
            }
            b3_0 ashMovesSb = new b3_0();
            for (int m = 0; m < 4; ++m) {
                if (var2_5.RJ().ns0(m) < 1) continue;
                vk0_1 ashMove = ec0_2.Sx().SX((short)var2_5.RJ().ns0(m));
                if (ashMove == null) continue;
                if (ashMovesSb.length() > 0) {
                    ashMovesSb.vK0("\n");
                }
                ashMovesSb.vK0(ashMove.CoM2());
            }
            ashSprite.Xr0(sm0_0.wa0(1860, ashMovesSb.toString()));
            ashSprite.Bb(0);
        }
        S70 shayminIcon = null;
        if (var2_5.RJ().SA0() == 492 && var2_5.rX() && (tw0_0.rl.DD(var2_5.U8()) == null || !tw0_0.rl.DD(var2_5.U8()).L80().i2())) {
            mc0_1 gracideaItem = (mc0_1) gu0.Az0().lPT6((short)1446);
            boolean isSky = !var2_5.RJ().pg();
            shayminIcon = new S70();
            shayminIcon.JH().Nk(new Wr[]{gh_1.Jh0().zm((short)1446)});
            shayminIcon.JH().dA(2.0f);
            if (tw0_0.kz0()) {
                shayminIcon.JH().dA(4.0f);
            }
            shayminIcon.RF();
            String gracideaName = mp_1.vf0().W50((short)655).FZ();
            String shayminTooltip = sm0_0.wa0(isSky ? 1894 : 1895, gracideaName);
            shayminIcon.Xr0(shayminTooltip);
            shayminIcon.Bb(0);
            final boolean f_isSky = isSky;
            final mc0_1 f_gracidea = gracideaItem;
            final String f_gracideaName = gracideaName;
            shayminIcon.ZZ((zs_1)(e -> this.m(f_isSky, f_gracidea, f_gracideaName, var2_5, (e90_0)e)));
        }
        fy_2 histArea = new fy_2();
        histArea.uf("label-monster-area");
        ya_1 histRow1 = histArea.bx0(new ya_1[]{histArea.hb(new le0_2[]{metAtTitle, histVal, copyDataBtn})}).qd(15).X20(histArea.hb(new le0_2[]{ashSprite, shayminIcon}));
        ya_1 histRow2 = histArea.Ou0(new ya_1[]{histArea.C7(new le0_2[]{metAtTitle, histVal, copyDataBtn})});
        I7 histH10 = histArea.H10();
        int histGap = tw0_0.kz0() ? 42 : 30;
        ya_1 histRow2Combined = histRow2.X20(histH10.qd(histGap).Kn0(ashSprite).Kn0(shayminIcon));
        histArea.WQ(histRow1);
        histArea.x40(histRow2Combined);
        historyTab.WQ(historyTab.H10().Xq(new ya_1[]{historyTab.H10().qd(5).LPt3(new le0_2[]{histArea})}));
        historyTab.x40(historyTab.lo0().Xq(new ya_1[]{historyTab.lo0().LPt3(new le0_2[]{histArea})}));
        fy_2 statsTab2 = new fy_2();
        qj_2 evTooltipBtn = new qj_2("", 16, 16);
        evTooltipBtn.uf("tooltip-button2");
        evTooltipBtn.Bb(0);
        evTooltipBtn.Xr0(sm0_0.c0(1839));
        if (tw0_0.kz0()) {
            evTooltipBtn.xf0(60, 60);
        }
        cn_0 evTitle = new cn_0(sm0_0.c0(1838));
        cn_0[] evStatTitles = new cn_0[gc_2.Wp.length + 1];
        cn_0[] evStatVals = new cn_0[gc_2.Wp.length + 1];
        for (int idx = 0; idx < gc_2.Wp.length; ++idx) {
            gc_2 stat = gc_2.Wp[idx];
            int statTitleId = stat.pI0() + 1817;
            evStatTitles[stat.pI0()] = new cn_0(sm0_0.c0(statTitleId));
            evStatTitles[stat.pI0()].uf("label-monster-title");
            evStatVals[stat.pI0()] = new cn_0(Integer.toString(var2_5.RJ().ZY(stat)));
            if (var2_5.RJ().ZY(stat) == 252) {
                evStatVals[stat.pI0()].uf("label-monster-value-stat-complete");
            } else {
                evStatVals[stat.pI0()].uf("label-monster-value");
            }
        }
        evStatTitles[gc_2.Wp.length] = new cn_0(sm0_0.c0(1726));
        evStatTitles[gc_2.Wp.length].uf("label-monster-title");
        evStatVals[gc_2.Wp.length] = new cn_0(var2_5.RJ().f80() + " / 510");
        if (var2_5.RJ().f80() == 510) {
            evStatVals[gc_2.Wp.length].uf("label-monster-value-stat-complete");
        } else {
            evStatVals[gc_2.Wp.length].uf("label-monster-value");
        }
        fy_2 evArea = new fy_2();
        evArea.uf("label-monster-area");
        ya_1[] evRows = new ya_1[8];
        for (int r = 0; r < 7; ++r) {
            evRows[r] = evArea.C7(new le0_2[]{evStatTitles[r], evStatVals[r]});
        }
        evRows[7] = evArea.H10().qd(15).LPt3(new le0_2[]{evTitle, evTooltipBtn});
        ya_1[] evCols = new ya_1[8];
        for (int c = 0; c < 7; ++c) {
            evCols[c] = evArea.hb(new le0_2[]{evStatTitles[c], evStatVals[c]});
        }
        evCols[7] = evArea.hb(new le0_2[]{evTitle, evTooltipBtn});
        evArea.x40(XZ.BC0(evArea.lo0(), evRows, evArea).Xq(evCols));
        statsTab2.WQ(statsTab2.H10().Xq(new ya_1[]{statsTab2.H10().qd(5).LPt3(new le0_2[]{evArea})}));
        statsTab2.x40(statsTab2.lo0().Xq(new ya_1[]{statsTab2.lo0().LPt3(new le0_2[]{evArea})}));
        fy_2 statsTab3 = new fy_2();
        qj_2 ivTooltipBtn = new qj_2("", 16, 16);
        ivTooltipBtn.uf("tooltip-button2");
        ivTooltipBtn.Bb(0);
        ivTooltipBtn.Xr0(sm0_0.c0(1837));
        if (tw0_0.kz0()) {
            ivTooltipBtn.xf0(60, 60);
        }
        cn_0 ivTitle = new cn_0(sm0_0.c0(1836));
        cn_0[] ivStatTitles = new cn_0[gc_2.Wp.length + 1];
        cn_0[] ivStatVals = new cn_0[gc_2.Wp.length + 1];
        for (int idx = 0; idx < gc_2.Wp.length; ++idx) {
            gc_2 stat = gc_2.Wp[idx];
            int statTitleId = stat.pI0() + 1830;
            ivStatTitles[stat.pI0()] = new cn_0(sm0_0.c0(statTitleId));
            ivStatTitles[stat.pI0()].uf("label-monster-title");
            ss_1 ivValBtn = new ss_1(asBridge(), Integer.toString(var2_5.RJ().RI(stat)), stat, var2_5);
            ivStatVals[stat.pI0()] = ivValBtn;
            if (var2_5.RJ().RI(stat) == 31) {
                ivValBtn.uf("label-monster-value-stat-complete");
            } else if (var2_5.RJ().RI(stat) == 0) {
                ivValBtn.uf("label-monster-value-stat-bad");
            } else {
                ivValBtn.uf("label-monster-value");
            }
        }
        ivStatTitles[gc_2.Wp.length] = new cn_0(sm0_0.c0(1726));
        ivStatTitles[gc_2.Wp.length].uf("label-monster-title");
        cn_0 ivTotalVal = new cn_0(var2_5.RJ().X3() + " / 186");
        ivStatVals[gc_2.Wp.length] = ivTotalVal;
        if (var2_5.RJ().X3() == 186) {
            ivTotalVal.uf("label-monster-value-stat-complete");
        } else if (var2_5.RJ().X3() == 0) {
            ivTotalVal.uf("label-monster-value-stat-bad");
        } else {
            ivTotalVal.uf("label-monster-value");
        }
        fy_2 ivArea = new fy_2();
        ivArea.uf("label-monster-area");
        ya_1[] ivRows = new ya_1[8];
        for (int r = 0; r < 7; ++r) {
            ivRows[r] = ivArea.C7(new le0_2[]{ivStatTitles[r], ivStatVals[r]});
        }
        ivRows[7] = ivArea.H10().qd(15).LPt3(new le0_2[]{ivTitle, ivTooltipBtn});
        ya_1[] ivCols = new ya_1[8];
        for (int c = 0; c < 7; ++c) {
            ivCols[c] = ivArea.hb(new le0_2[]{ivStatTitles[c], ivStatVals[c]});
        }
        ivCols[7] = ivArea.hb(new le0_2[]{ivTitle, ivTooltipBtn});
        ivArea.x40(XZ.BC0(ivArea.lo0(), ivRows, ivArea).Xq(ivCols));
        statsTab3.WQ(statsTab3.H10().Xq(new ya_1[]{statsTab3.H10().qd(5).LPt3(new le0_2[]{ivArea})}));
        statsTab3.x40(statsTab3.lo0().Xq(new ya_1[]{statsTab3.lo0().LPt3(new le0_2[]{ivArea})}));
        fy_2 statsTab4 = new fy_2();
        cn_0[] contestTitles = new cn_0[ib0_0.rl.length + 1];
        ae0_1[] contestBars = new ae0_1[ib0_0.rl.length + 1];
        int contestTotal = 0;
        for (int idx = 0; idx < ib0_0.rl.length; ++idx) {
            ib0_0 stat = ib0_0.rl[idx];
            contestTotal += var2_5.RJ().ob(stat);
            contestTitles[stat.Uh()] = new cn_0(sm0_0.c0(stat.sh()) + ":");
            contestTitles[stat.Uh()].uf("label-monster-title-full");
            contestBars[stat.Uh()] = new ae0_1();
            contestBars[stat.Uh()].uf("monsterframe-progressbar-contest-" + stat.Uh());
            contestBars[stat.Uh()].aE((float)var2_5.RJ().ob(stat) / 255.0f);
        }
        cn_0 contestTotalTitle = new cn_0(sm0_0.c0(1726));
        contestTitles[5] = contestTotalTitle;
        contestTotalTitle.uf("label-monster-title-full");
        ae0_1 contestTotalBar = new ae0_1();
        contestBars[5] = contestTotalBar;
        contestTotalBar.uf("monsterframe-progressbar-contest-total");
        contestBars[5].aE((float)contestTotal / 640.0f);
        fy_2 contestArea = new fy_2();
        contestArea.uf("label-monster-area");
        le0_2[] contestWidgets = new le0_2[12];
        for (int k = 0; k < 6; ++k) {
            contestWidgets[k * 2] = contestTitles[k];
            contestWidgets[k * 2 + 1] = contestBars[k];
        }
        contestArea.WQ(contestArea.hb(contestWidgets));
        contestArea.x40(contestArea.C7(contestWidgets));
        statsTab4.WQ(statsTab4.H10().Xq(new ya_1[]{statsTab4.H10().qd(5).LPt3(new le0_2[]{contestArea})}));
        statsTab4.x40(statsTab4.lo0().Xq(new ya_1[]{statsTab4.lo0().LPt3(new le0_2[]{contestArea})}));
        fy_2 attacksTab = new fy_2();
        cn_0[] moveLabels = new cn_0[4];
        TB[] moveButtons = new TB[4];
        qj_2[] moveIcons = new qj_2[4];
        xe_1[] moveMobileButtons = tw0_0.kz0() ? new xe_1[4] : null;
        boolean hasWorld = tw0_0.e60.N60() != null && tw0_0.e60.N60().Km();
        _else world = tw0_0.e60.N60();
        for (int m = 0; m < 4; ++m) {
            S70 moveTitleIcon = new S70(16, 16);
            moveLabels[m] = moveTitleIcon;
            moveTitleIcon.uf("label-monster-title-wide");
            if (tw0_0.kz0()) {
                moveIcons[m] = new qj_2(64, 70);
            } else {
                moveIcons[m] = new qj_2(24, 31);
            }
            moveIcons[m].Ll(false);
            vk0_1 moveData = ec0_2.Sx().SX((short)var2_5.RJ().UD(m));
            String moveName = moveData == null ? "-" : moveData.CoM2();
            if (moveData != null && moveData.oC0() == 165) {
                moveName = g7_0.Zx(1852, AN.nK0(moveName, "\n"), " \u221e");
            } else {
                byte ppByte = 0;
                if (moveData != null && world != null) {
                    int p4 = world.p4();
                    boolean ppFlag = world.ZE() == 2 && (p4 == 434 || p4 == 435) && var2_5.RJ().TG0() == 70 && var2_5.RJ().mm0() == 2;
                    ppByte = moveData.Gn(ppFlag);
                }
                moveName = ig_0.u9(1852, AN.nK0(moveName, "\n"), " ").append(var2_5.RJ().xm(m)).append(" / ").append(var2_5.RJ().Vd(ppByte, (byte)m)).toString();
            }
            TB moveBtn = new TB(asBridge(), moveName, m, moveButtons);
            moveButtons[m] = moveBtn;
            moveBtn.uf("label-skill-name");
            if (moveData == null || moveData.oC0() < 1) continue;
            i40_0 moveType = moveData.yS(var2_5.RJ());
            if (tw0_0.kz0()) {
                moveBtn.sl().r8(new LPT6_[]{fn_0.qz0().jJ0(moveType.o6())});
                moveBtn.sl().Gy0(140, 26);
                moveBtn.sl().dA(2.0f);
            } else {
                moveBtn.sl().r8(new LPT6_[]{fn_0.qz0().It(moveType.o6())});
                moveBtn.sl().Gy0(110, 6);
            }
            moveBtn.Bb(200);
            if (tw0_0.H30()) {
                moveBtn.Xr0(s2_0.tq0(moveData, var2_5));
            } else {
                xe_1 skillTooltipBtn = new xe_1();
                if (moveMobileButtons != null) {
                    moveMobileButtons[m] = skillTooltipBtn;
                }
                skillTooltipBtn.uf("tooltip-button2");
                final vk0_1 f_vk = moveData;
                skillTooltipBtn.RR(() -> ng_2.z3(f_vk, var2_5));
            }
            if (!hasWorld && !var2_5.rX() || hasWorld && var2_5.RJ().Zy().uI0() && !var2_5.rX() || !tx_1.H40(moveData.oC0(), hasWorld)) continue;
            moveIcons[m].uf("spritetogglebutton-outline");
            if (BU.lh().cE0().YF((short)(moveData.oC0() * -1)) > -1) {
                moveIcons[m].sl().r8(new LPT6_[]{fn_0.qz0().l80()});
            } else {
                moveIcons[m].sl().r8(new LPT6_[]{fn_0.qz0().kn()});
            }
            moveIcons[m].Ll(true);
            moveIcons[m].RR(new hn_1(asBridge(), moveData, moveIcons, m, var2_5));
            moveBtn.uf("label-skill-use-name");
            moveBtn.RR(new _catch(asBridge(), moveData, hasWorld, var2_5, moveButtons, m, var1_1));
        }
        fy_2 movesArea = new fy_2();
        movesArea.uf("label-monster-area");
        int iconW0 = tw0_0.kz0() ? 0 : 16;
        int iconH0 = tw0_0.kz0() ? 0 : 32;
        qj_2 icon1 = (qj_2)((qj_2)new qj_2("", iconW0, iconH0).sl().r8(new LPT6_[]{fn_0.qz0().Zb()})).sl().Gy0(0, 8);
        int iconW1 = tw0_0.kz0() ? 0 : 16;
        int iconH1 = tw0_0.kz0() ? 0 : 16;
        qj_2 icon2 = (qj_2)new qj_2("", iconW1, iconH1).sl().r8(new LPT6_[]{fn_0.qz0().Zb()});
        int iconW2 = tw0_0.kz0() ? 0 : 16;
        int iconH2 = tw0_0.kz0() ? 0 : 16;
        qj_2 icon3 = (qj_2)new qj_2("", iconW2, iconH2).sl().r8(new LPT6_[]{fn_0.qz0().Zb()});
        int iconW3 = tw0_0.kz0() ? 0 : 16;
        int iconH3 = tw0_0.kz0() ? 0 : 16;
        qj_2 icon4 = (qj_2)new qj_2("", iconW3, iconH3).sl().r8(new LPT6_[]{fn_0.qz0().DI0()});
        int iconW4 = tw0_0.kz0() ? 0 : 16;
        int iconH4 = tw0_0.kz0() ? 0 : 16;
        qj_2 icon5 = (qj_2)new qj_2("", iconW4, iconH4).sl().r8(new LPT6_[]{fn_0.qz0().DI0()});
        int iconW5 = tw0_0.kz0() ? 0 : 16;
        int iconH5 = tw0_0.kz0() ? 0 : 32;
        qj_2 icon6 = (qj_2)((qj_2)new qj_2("", iconW5, iconH5).sl().r8(new LPT6_[]{fn_0.qz0().DI0()})).sl().Gy0(0, 8);
        icon1.RR(() -> ng_2.yw(var2_5));
        icon2.RR(() -> ng_2.po(var2_5));
        icon3.RR(() -> ng_2.MH0(var2_5));
        icon4.RR(() -> ng_2.M10(var2_5));
        icon5.RR(() -> ng_2.Pj(var2_5));
        icon6.RR(() -> ng_2.sk0(var2_5));
        cn_0 descTitle = new cn_0(sm0_0.c0(1824));
        descTitle.uf("label-monster-title");
        short aq0 = var2_5.Aq0();
        String descStr = sm0_0.c0(aq0 + 210000);
        cn_0 descVal = new cn_0(descStr);
        b3_0 descSb = new b3_0();
        if (descStr.length() > 16) {
            descVal.Sk(descStr.substring(0, 14) + "...");
            descSb.vK0(descStr);
        }
        if (var2_5.RJ().an() == 2) {
            if (descSb.hp0 > 0) {
                descSb.vK0("\n\n");
            }
            descSb.vK0(sm0_0.c0(1886));
        }
        if (descSb.hp0 > 0) {
            descVal.Bb(150);
            descVal.Xr0(descSb.toString());
        }
        String fullDesc = sm0_0.c0(aq0 + 220000);
        if (!fullDesc.contains("\n")) {
            int fontSize = tw0_0.kz0() ? (zb0_2.vh0 != null ? 27 : 50) : (zb0_2.bigCJKFontSizes() ? 20 : (zb0_2.vh0 != null ? 22 : 38));
            fullDesc = hx_1.oO(fullDesc, fontSize, null, true, 1);
        }
        cn_0 fullDescLabel = new cn_0(fullDesc);
        if (var2_5.uF0()) {
            descVal.Sk("???");
            fullDescLabel.Sk("");
        }
        if (var2_5.RJ().an() == 2) {
            descVal.uf("label-hidden-ability");
        } else {
            descVal.uf("label-monster-value");
        }
        fullDescLabel.uf("label");
        icon1.uf("label-skill-arrowdown");
        icon2.uf("label-skill-arrowdown");
        icon3.uf("label-skill-arrowdown");
        icon4.uf("label-skill-arrowup");
        icon5.uf("label-skill-arrowup");
        icon6.uf("label-skill-arrowup");
        if (tw0_0.H30()) {
            ya_1[] mRows = new ya_1[6];
            mRows[0] = movesArea.C7(new le0_2[]{moveLabels[0], icon1, moveButtons[0]}).qd(7).Kn0(moveIcons[0]);
            mRows[1] = movesArea.C7(new le0_2[]{moveLabels[1]}).X20(movesArea.hb(new le0_2[]{icon4, icon2})).Kn0(moveButtons[1]).qd(7).Kn0(moveIcons[1]);
            mRows[2] = movesArea.C7(new le0_2[]{moveLabels[2]}).X20(movesArea.hb(new le0_2[]{icon5, icon3})).Kn0(moveButtons[2]).qd(7).Kn0(moveIcons[2]);
            mRows[3] = movesArea.C7(new le0_2[]{moveLabels[3], icon6, moveButtons[3]}).qd(7).Kn0(moveIcons[3]);
            mRows[4] = movesArea.C7(new le0_2[]{descTitle, descVal});
            mRows[5] = movesArea.H10().Kn0(fullDescLabel);
            ya_1[] mCols = new ya_1[6];
            mCols[0] = movesArea.hb(new le0_2[]{moveLabels[0], icon1, moveButtons[0], moveIcons[0]});
            mCols[1] = movesArea.hb(new le0_2[]{moveLabels[1]}).X20(movesArea.C7(new le0_2[]{icon4, icon2})).Kn0(moveButtons[1]).Kn0(moveIcons[1]);
            mCols[2] = movesArea.hb(new le0_2[]{moveLabels[2]}).X20(movesArea.C7(new le0_2[]{icon5, icon3})).Kn0(moveButtons[2]).Kn0(moveIcons[2]);
            mCols[3] = movesArea.hb(new le0_2[]{moveLabels[3], icon6, moveButtons[3], moveIcons[3]});
            mCols[4] = movesArea.hb(new le0_2[]{descTitle, descVal});
            mCols[5] = movesArea.hb(new le0_2[]{fullDescLabel});
            movesArea.x40(XZ.BC0(movesArea.lo0(), mRows, movesArea).Xq(mCols));
        } else {
            ya_1[] mRows = new ya_1[6];
            mRows[0] = movesArea.C7(new le0_2[]{moveLabels[0], moveButtons[0], moveMobileButtons[0], icon1, moveIcons[0]});
            mRows[1] = movesArea.C7(new le0_2[]{moveLabels[1]}).LPt3(new le0_2[]{moveButtons[1], moveMobileButtons[1]}).X20(movesArea.C7(new le0_2[]{icon4, icon2, moveIcons[1]}));
            mRows[2] = movesArea.C7(new le0_2[]{moveLabels[2]}).LPt3(new le0_2[]{moveButtons[2], moveMobileButtons[2]}).X20(movesArea.C7(new le0_2[]{icon5, icon3, moveIcons[2]}));
            mRows[3] = movesArea.C7(new le0_2[]{moveLabels[3], moveButtons[3], moveMobileButtons[3], icon6, moveIcons[3]});
            mRows[4] = movesArea.C7(new le0_2[]{descTitle, descVal});
            mRows[5] = movesArea.H10().qd(15).Kn0(fullDescLabel);
            ya_1[] mCols = new ya_1[6];
            mCols[0] = movesArea.hb(new le0_2[]{moveLabels[0], moveButtons[0], moveMobileButtons[0], icon1, moveIcons[0]});
            mCols[1] = movesArea.hb(new le0_2[]{moveLabels[1]}).LPt3(new le0_2[]{moveButtons[1], moveMobileButtons[1]}).X20(movesArea.hb(new le0_2[]{icon4, icon2, moveIcons[1]}));
            mCols[2] = movesArea.hb(new le0_2[]{moveLabels[2]}).LPt3(new le0_2[]{moveButtons[2], moveMobileButtons[2]}).X20(movesArea.hb(new le0_2[]{icon5, icon3, moveIcons[2]}));
            mCols[3] = movesArea.hb(new le0_2[]{moveLabels[3], moveButtons[3], moveMobileButtons[3], icon6, moveIcons[3]});
            mCols[4] = movesArea.hb(new le0_2[]{descTitle, descVal});
            mCols[5] = movesArea.hb(new le0_2[]{fullDescLabel});
            movesArea.x40(XZ.BC0(movesArea.lo0(), mRows, movesArea).Xq(mCols));
        }
        if (tw0_0.PK0 != null || tw0_0.kz0()) {
            icon1.sl().lo0();
            icon2.sl().lo0();
            icon3.sl().lo0();
            icon4.sl().lo0();
            icon5.sl().lo0();
            icon6.sl().lo0();
            if (tw0_0.kz0() && tw0_0.PK0 != null) {
                icon1.Ll(false);
                icon2.Ll(false);
                icon3.Ll(false);
                icon4.Ll(false);
                icon5.Ll(false);
                icon6.Ll(false);
            }
        }
        attacksTab.WQ(attacksTab.H10().Xq(new ya_1[]{attacksTab.H10().qd(5).LPt3(new le0_2[]{movesArea})}));
        attacksTab.x40(attacksTab.lo0().Xq(new ya_1[]{attacksTab.lo0().LPt3(new le0_2[]{movesArea})}));
        fy_2 ribbonsTab = new fy_2();
        cn_0 ribbonTitle = new cn_0(sm0_0.c0(1847));
        ribbonTitle.uf("label-monster-title");
        this.r5 = new fy_2();
        this.r5.uf("label-monster-area");
        ya_1 rRow = this.r5.lo0();
        ya_1 rCol = this.r5.H10();
        I7 rH10 = this.r5.H10();
        Hm0 rLo0 = this.r5.lo0();
        int ribbonCount = 0;
        if (var2_5.RJ().gS(21)) {
            ribbonCount = 1;
            S70 champRibbon = new S70(32, 32);
            champRibbon.JH().Nk(new Wr[]{ob0_0.Ui0().lq0(0, 14)});
            if (tw0_0.kz0()) {
                champRibbon.JH().nq0(64, 64);
                champRibbon.VA(80, 64);
            }
            champRibbon.Bb(0);
            champRibbon.Xr0(sm0_0.wa0(1844, sm0_0.c0(var2_5.RJ().mm0() + 250000)));
            rH10.Kn0(champRibbon);
            rLo0.Kn0(champRibbon);
        }
        for (int i = 0; i < ng_2.wx0.length; ++i) {
            int[] ribbonEntry = ng_2.wx0[i];
            S70 ribbonIcon = new S70(32, 32);
            ribbonIcon.JH().Nk(new Wr[]{ob0_0.Ui0().lq0(ribbonEntry[1], ribbonEntry[2])});
            gn_0 tint = !var2_5.RJ().gS(ribbonEntry[0]) ? new gn_0((byte)0, (byte)0, (byte)0, (byte)127) : null;
            ribbonIcon.JH().wx0(tint);
            if (tw0_0.kz0()) {
                ribbonIcon.JH().nq0(64, 64);
                ribbonIcon.VA(80, 64);
            }
            ribbonIcon.Bb(0);
            ribbonIcon.Xr0(sm0_0.H5(lpt6__2.Q80, 170, ribbonEntry[3]) + "\n" + sm0_0.H5(lpt6__2.Q80, 170, ribbonEntry[4]));
            rH10.Kn0(ribbonIcon);
            rLo0.Kn0(ribbonIcon);
            if (ribbonCount++ <= 4) continue;
            rRow.X20(rH10.Ze0());
            rCol.X20(rLo0);
            rH10 = this.r5.H10();
            rLo0 = this.r5.lo0();
            ribbonCount = 0;
        }
        if (ribbonCount > 0) {
            rRow.X20(rH10.Ze0());
            rCol.X20(rLo0);
        }
        for (int rowIdx = 0; rowIdx < ng_2.oh.length; ++rowIdx) {
            int[][] ribbonSubArray = ng_2.oh[rowIdx];
            I7 subH10 = this.r5.H10();
            Hm0 subLo0 = this.r5.lo0();
            for (int[] ribbonItem : ribbonSubArray) {
                S70 rIcon = new S70(32, 32);
                rIcon.JH().Nk(new Wr[]{ob0_0.Ui0().lq0(ribbonItem[0], ribbonItem[2])});
                gn_0 subTint = !var2_5.RJ().W8(ribbonItem[0], ribbonItem[1]) ? new gn_0((byte)0, (byte)0, (byte)0, (byte)127) : null;
                rIcon.JH().wx0(subTint);
                if (tw0_0.kz0()) {
                    rIcon.JH().nq0(64, 64);
                    rIcon.VA(80, 64);
                }
                rIcon.Bb(0);
                rIcon.Xr0(sm0_0.H5(lpt6__2.Q80, 170, ribbonItem[3]) + "\n" + sm0_0.H5(lpt6__2.Q80, 170, ribbonItem[4]));
                subH10.Kn0(rIcon);
                subLo0.Kn0(rIcon);
            }
            rRow.X20(subH10.Ze0());
            rCol.X20(subLo0);
        }
        if (tw0_0.kz0()) {
            this.r5.WQ(this.r5.lo0().Xq(new ya_1[]{this.r5.C7(new le0_2[]{ribbonTitle}), rRow}));
            this.r5.x40(this.r5.H10().Xq(new ya_1[]{this.r5.hb(new le0_2[]{ribbonTitle}), rCol}));
        } else {
            this.r5.WQ(rRow);
            this.r5.x40(rCol);
        }
        ribbonsTab.WQ(ribbonsTab.H10().Xq(new ya_1[]{ribbonsTab.H10().qd(5).LPt3(new le0_2[]{this.r5})}));
        ribbonsTab.x40(ribbonsTab.lo0().Xq(new ya_1[]{ribbonsTab.lo0().LPt3(new le0_2[]{this.r5})}));
        cn_0 markTitle = new cn_0(sm0_0.c0(1890));
        markTitle.uf("label-monster-title");
        fy_2 marksTab = new fy_2();
        this.MB = new fy_2();
        this.MB.uf("label-monster-area");
        ya_1 mbRow = this.MB.lo0();
        ya_1 mbCol = this.MB.H10();
        I7 mbH10 = this.MB.H10();
        Hm0 mbLo0 = this.MB.lo0();
        boolean hasUncommitted = false;
        boolean hasMarks = false;
        int markColCount = 0;
        int maxCols = tw0_0.H30() ? 6 : 8;
        for (int idx = 0; idx < QL.j90.length; ++idx) {
            QL ql = QL.j90[idx];
            if (!ql.PR(tw0_0.rl.ex(), var2_5.RJ())) continue;
            hasMarks = true;
            Jm0 markBtn = new Jm0(32, 32);
            markBtn.l10().df();
            markBtn.uf("spritetogglebutton-outline");
            markBtn.l10().r8(new LPT6_[]{fn_0.qz0().Ku(ql.Ex(), var2_5.RJ().u3())});
            boolean canChange = (var2_5.RJ().nq() == _volatile.BV || var2_5.RJ().nq().Fs()) && var2_5.rX();
            markBtn.pw0(canChange);
            markBtn.k50(var2_5.RJ().No() == ql);
            markBtn.RR(() -> ng_2.NH0(var2_5, ql, markBtn));
            if (tw0_0.kz0()) {
                markBtn.l10().dA(2.0f);
                markBtn.aux(64, 64);
            }
            markBtn.Bb(0);
            markBtn.Xr0(lb0_2.CU(ql, var2_5.RJ().u3()));
            mbH10.Kn0(markBtn);
            mbLo0.Kn0(markBtn);
            if (++markColCount % maxCols == 0) {
                mbRow.X20(mbH10.Ze0());
                mbCol.X20(mbLo0);
                mbH10 = this.MB.H10();
                mbLo0 = this.MB.lo0();
                hasUncommitted = false;
            } else {
                hasUncommitted = true;
            }
        }
        if (!hasMarks) {
            cn_0 noMarksLabel = new cn_0(sm0_0.c0(1891));
            noMarksLabel.uf("label-monster-value-center");
            mbRow.Kn0(noMarksLabel);
            mbCol.Kn0(noMarksLabel);
        } else if (markColCount > 1 && var2_5.rX()) {
            if (markColCount % maxCols == 0) {
                mbRow.X20(mbH10.Ze0());
                mbCol.X20(mbLo0);
                mbH10 = this.MB.H10();
                mbLo0 = this.MB.lo0();
            }
            Jm0 clearMarkBtn = new Jm0(32, 32);
            clearMarkBtn.l10().df();
            clearMarkBtn.uf("spritetogglebutton-outline");
            clearMarkBtn.l10().r8(new LPT6_[]{fn_0.qz0().Ck0()});
            boolean canChange = (var2_5.RJ().nq() == _volatile.BV || var2_5.RJ().nq().Fs()) && var2_5.rX();
            clearMarkBtn.pw0(canChange);
            clearMarkBtn.k50(var2_5.RJ().No() == QL.Uy0);
            clearMarkBtn.RR(() -> ng_2.Ro(var2_5, clearMarkBtn));
            if (tw0_0.kz0()) {
                clearMarkBtn.l10().dA(2.0f);
                clearMarkBtn.aux(64, 64);
            }
            clearMarkBtn.Bb(0);
            clearMarkBtn.Xr0(ig_0.u9(10997, new StringBuilder(), "\n\n").append(sm0_0.c0(10998)).toString());
            mbH10.Kn0(clearMarkBtn);
            mbLo0.Kn0(clearMarkBtn);
            hasUncommitted = true;
        }
        if (hasUncommitted) {
            mbRow.X20(mbH10.Ze0());
            mbCol.X20(mbLo0);
        }
        this.MB.WQ(this.MB.lo0().Xq(new ya_1[]{this.MB.C7(new le0_2[]{markTitle}), mbRow}));
        this.MB.x40(this.MB.H10().Xq(new ya_1[]{this.MB.hb(new le0_2[]{markTitle}), mbCol}));
        lo0_0 scrollPane = new lo0_0(this.MB);
        marksTab.WQ(marksTab.H10().qd(5).Kn0(scrollPane));
        marksTab.x40(marksTab.lo0().Kn0(scrollPane));
        fy_2 particleTab = new fy_2();
        fy_2 particleArea = new fy_2();
        particleArea.uf("label-monster-area");
        cn_0 particleLabel = new cn_0(sm0_0.wa0(1825, sm0_0.c0(0)));
        xe_1 tL0Btn = new xe_1(sm0_0.c0(1826));
        tL0Btn.RR(() -> this.tL0(var2_5, var1_1));
        this.U80 = tL0Btn;
        particleArea.WQ(particleArea.lo0().X20(particleArea.C7(new le0_2[]{particleLabel})).Kn0(tL0Btn));
        particleArea.x40(particleArea.H10().X20(particleArea.hb(new le0_2[]{particleLabel})).Kn0(tL0Btn));
        particleTab.WQ(particleTab.H10().Xq(new ya_1[]{particleTab.H10().qd(5).LPt3(new le0_2[]{particleArea})}));
        particleTab.x40(particleTab.lo0().Xq(new ya_1[]{particleTab.lo0().LPt3(new le0_2[]{particleArea})}));
        this.RY(this.gN, this.jc);
        this.g2(this.gN, this.jc);
        this.oY(this.gN, this.jc);
        com2__3 tabInfo = this.Ru.Wq(infoTab, "");
        tabInfo.PI0("monster-frame-tab-info");
        tabInfo.Kj(this::PrN);
        if (var2_5.uF0()) {
            this.Z5 = qo_1.DL;
            com2__3 tabHist = this.Ru.Wq(historyTab, "");
            tabHist.PI0("monster-frame-tab-history");
            tabHist.Kj(this::cd);
            com2__3 tabAttack = this.Ru.Wq(attacksTab, "");
            tabAttack.PI0("monster-frame-tab-attack");
            tabAttack.Kj(this::oj);
            if (var3_6 == qo_1.VM) {
                this.Ru.Zd(tabAttack);
            } else if (var3_6 == qo_1.wb0) {
                this.Ru.Zd(tabHist);
            }
        } else {
            com2__3 tabStats1 = this.Ru.Wq(statsTab1, "");
            tabStats1.PI0("monster-frame-tab-stats");
            tabStats1.Kj(this::Lm);
            com2__3 tabStats2 = this.Ru.Wq(statsTab2, "");
            tabStats2.PI0("monster-frame-tab-stats2");
            tabStats2.Kj(this::nR);
            com2__3 tabStats3 = this.Ru.Wq(statsTab3, "");
            tabStats3.PI0("monster-frame-tab-stats3");
            tabStats3.Kj(this::q50);
            com2__3 tabAttack = this.Ru.Wq(attacksTab, "");
            tabAttack.PI0("monster-frame-tab-attack");
            tabAttack.Kj(this::QG);
            com2__3 tabHist = this.Ru.Wq(historyTab, "");
            tabHist.PI0("monster-frame-tab-history");
            tabHist.Kj(this::X60);
            if (!var2_5.RJ().iB()) {
                if (tw0_0.Ll0.cOM4((byte)1)) {
                    com2__3 tabStats4 = this.Ru.Wq(statsTab4, "");
                    tabStats4.PI0("monster-frame-tab-stats4");
                    tabStats4.Kj(this::PK);
                    if (var3_6 == qo_1.I0) {
                        this.Ru.Zd(tabStats4);
                    }
                }
                com2__3 tabRibbons = this.Ru.Wq(ribbonsTab, "");
                tabRibbons.PI0("monster-frame-tab-ribbons");
                tabRibbons.Kj(this::dF0);
                if (var3_6 == qo_1.Er) {
                    this.Ru.Zd(tabRibbons);
                }
            }
            com2__3 tabParticles = this.Ru.Wq(marksTab, "");
            tabParticles.PI0("monster-frame-tab-particles");
            tabParticles.Kj(this::oy0);
            if (var3_6 == qo_1.eX) {
                this.Ru.Zd(tabStats1);
            } else if (var3_6 == qo_1.EA) {
                this.Ru.Zd(tabStats2);
            } else if (var3_6 == qo_1.VM) {
                this.Ru.Zd(tabAttack);
            } else if (var3_6 == qo_1.wb0) {
                this.Ru.Zd(tabHist);
            } else if (var3_6 == qo_1.VD) {
                this.Ru.Zd(tabStats3);
            } else if (var3_6 == qo_1.iI0) {
                this.Ru.Zd(tabParticles);
            }
            this.Z5 = var3_6;
        }
        if (!var2_5.uF0() && (var2_5.RJ().nq().Fs() || var2_5.RJ().nq() == _volatile.CG0) && !var2_5.RJ().TH()) {
            com2__3 tabInfoExtra = this.Ru.Wq(particleTab, "");
            this.Zw = tabInfoExtra;
            tabInfoExtra.PI0("monster-frame-tab-info");
            tabInfoExtra.Kj(this::Vs);
            if (var3_6 == qo_1.bD) {
                this.Ru.Zd(tabInfoExtra);
            }
        }
        this.SL(this.V20);
        if (tw0_0.H30()) {
            this.SL(this.pa0);
        }
        this.SL(this.mA0);
        if (tw0_0.kz0()) {
            this.class$.clear();
            if (this.CU != null) {
                if (this.CU.Bm0() == _volatile.Bf0) {
                    short b70 = var2_5.RJ().b70();
                    int boxIdx = b70 / 60;
                    for (short s = (short)(b70 - 1); s >= boxIdx * 60; s = (short)(s - 1)) {
                        VU vu = this.CU.Ry0(s);
                        if (this.class$.KB < 3 && vu != null && !ng_2.aUx.equals(vu.ZK())) {
                            this.class$.Ue0(vu);
                        }
                    }
                    this.class$.Qe0();
                    for (short s = b70; s < (boxIdx + 1) * 60; s = (short)(s + 1)) {
                        VU vu = this.CU.Ry0(s);
                        if (this.class$.KB < 7 && vu != null && !ng_2.aUx.equals(vu.ZK())) {
                            this.class$.Ue0(vu);
                        }
                    }
                } else {
                    this.class$.Lpt7((Object[]) this.CU.rT());
                }
            }
            this.MF0 = new es_1(6);
            I2 iterator = this.class$.ZD();
            while (iterator.hasNext()) {
                VU vuItem = (VU) iterator.next();
                Jm0 tab = new Jm0(60, 60);
                tab.uf("/monster-tab");
                yh_0 dl = yh_0.Dl0();
                tab.pw0(vuItem != null);
                if (vuItem != null) {
                    short spId = vuItem.RJ().Kr();
                    byte form = vuItem.Dg0();
                    boolean gender = vuItem.LPt6();
                    tab.l10().o60(dl.qC0(spId, form, gender));
                    tab.l10().nq0(72, 72);
                    tab.l10().Gy0(-6, -12);
                    if (!var2_5.ZK().equals(vuItem.ZK())) {
                        tab.RR(() -> this.RJ0(var2_5, vuItem));
                    }
                    if (var2_5.ZK().equals(vuItem.ZK())) {
                        tab.k50(true);
                    }
                }
                this.SL(tab);
                this.MF0.Ue0(tab);
            }
        }
        if (tw0_0.xj0()) {
            xe_1 shareBtn = new xe_1();
            this.Gg0 = shareBtn;
            shareBtn.RR(ng_2::MJ);
            shareBtn.uf("mobile-share-icon");
            shareBtn.SU("");
            this.SL(shareBtn);
        }
    }
}
