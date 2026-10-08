package cn.pokemmo.battle.animation.special;

import f.*;

import com.badlogic.gdx.graphics.Color;

/**
 * 宝可梦对战特殊事件/状态动画 - BattleFy1Animation
 * 原始类: f.fy_1
 */
public class BattleFy1Animation extends MU {
    public final ML0 ip0;
    public final PF ND;
    public final short Qn0;
    public final PF d2;

    public BattleFy1Animation(ML0 var1, PF var2, short var3, PF var4) {
        super(var2);
        this.d2 = var4;
        this.vv(var2);
        this.ND = var2;
        this.ip0 = var1;
        this.Qn0 = var3;
    }

    public static void G5(int var0, D2 var1) {
        float f0 = dw_2.ej;
        di0_0.Hv0((short) 250, (byte) 0, 0.8f, f0, true);
    }

    public static void v0(int var0, D2 var1) {
        if (tw0_0.PK0 != null) {
            tw0_0.RE0.Eh(tw0_0.PK0.cOM1(), tw0_0.PK0.QA(), true, false);
        }
    }

    public static void Vw0(int var0, D2 var1) {
        tw0_0.RE0.BK0(true);
    }

    public void vx0(int var1, D2 var2) {
        jd0_1 jd = this.ip0.Hi(this.ND);
        if (jd != null) {
            jd.Hm(true);
        }
    }

    @Override
    public final boolean Bv0(boolean var1) {
        return false;
    }

    @Override
    public final MU us() {
        return this.je0();
    }

    public final void q(C8 v1, int var2, D2 var3) {
        this.ND.s0(this.ND.p10(), this.ND.Ya0(), "", (short) 1, this.ND.Wm(), this.ND.coM9(), this.ND.rp0(), QL.lQ);
        this.ND.ZI(this.ND.COm2(), false);
        this.ND.zi0.Sj = this.Qn0;
        this.ND.F(this.Qn0);
        this.ND.r10.Wb();
        this.vv(this.ND);

        pw_1 p1 = pw_1.xC().p1(4.0f);
        com3__3[] br0 = this.ND.Br0;
        p1.Xf0();
        Color black = Color.BLACK;
        for (int i = 0; i < br0.length; ++i) {
            com3__3 c = br0[i];
            if (c.Cf0 != null) {
                c.Cf0.Vr.set(black);
            }
            c.zf0(v1.x, v1.y - 1.1f, v1.z);
            p1.y80(ao_1.DX(c, 4, 2.4f).kt(v1.x, v1.y, v1.z));
        }

        p1.mz0().p1(1.0f).y80(ao_1.pc((i, d) -> this.MN(i, d)));

        ao_1 a1 = ao_1.DX(this.ND.LpT9.K7, 13, 1.0f);
        a1.h5[0] = 1.4f;
        p1.y80(a1).y80(ao_1.pc((i, d) -> this.k90(i, d)));

        Color clear = Color.CLEAR;
        for (int i = 0; i < br0.length; ++i) {
            p1.y80(ao_1.DX(br0[i], 10, 0.8f).Om0(new float[] { clear.r, clear.g, clear.b, clear.a }));
        }

        pw_1 p2 = p1.Xf0()
            .y80(this.wn0("shiny_star_prebaked"))
            .xi0(this.i6((byte) 2, (short) 1556, 1, 14, 0.0f, 0.9375f, this.Vz0))
            .xi0(this.i6((byte) 2, (short) 1554, 1, 14, 700.0f, 0.859375f, this.Vz0))
            .xi0(this.i6((byte) 2, (short) 1556, 1, 14, 0.0f, 0.9375f, this.Vz0))
            .xi0(this.i6((byte) 2, (short) 1554, 1, 14, 700.0f, 0.859375f, this.Vz0))
            .mz0()
            .p1(1.5f);

        Hr0.Ri0((i, d) -> G5(i, d), p2, 2.5f);
        p1.y80(ao_1.pc((i, d) -> v0(i, d))).Ms(this.Vs.wP);
    }

    public final void MN(int var1, D2 var2) {
        Color c = Color.valueOf("#FF9AA2");
        this.ND.LpT9.K7.LPT8(new na0_0(na0_0.UG, c, 0.0f));
    }

    public final BattleFy1Animation je0() {
        C8 v1 = T3.hf(this.ND.LpT9.j, this.ND.LpT9.j);
        this.ND.U7(0.75f);
        this.E8 = pw_1.xC();
        pw_1 initial = this.E8.TD0();
        float dur = ((float) di0_0.Ks(this.ND.p10())) / 1000.0f + 0.25f;
        initial.Sq0 += dur;
        initial.y80(MU.eK0((short) 1388, this.ND.COm2()));
        this.E8.Xf0();

        if (this.ND.Sc0 != null) {
            yh_0 yh = yh_0.Xm0;
            Wr wr = yh.dI0;
            if (wr == null) {
                wr = new Wr(new tn_0(yh));
                yh.dI0 = wr;
            }
            wr.Ik = hk0_1.KG;
        }

        com3__3[] bg = this.ND.BG;
        for (int i = 0; i < bg.length; ++i) {
            this.E8.y80(ao_1.DX(bg[i], 4, 0.2f).kt(v1.x, v1.y - 1.1f, v1.z));
        }

        this.E8.y80(ao_1.pc((i, d) -> this.bf0(i, d)))
            .y80(this.E2(18, true))
            .y80(ao_1.pc((i, d) -> Vw0(i, d)))
            .mz0()
            .p1(3.0f)
            .y80(ao_1.pc((i, d) -> this.q(v1, i, d)))
            .xi0(this.Ue0(4, 8470, 0.0f, 0.75f, 0.1f))
            .xi0(this.WW(14, 0.1f, 0.0f, 0.75f, px_1.ep0(8470)))
            .xi0(this.WW(16, 0.1f, 0.0f, 0.75f, px_1.ep0(8470)))
            .p1(1.0f);

        this.E8.Xf0()
            .xi0(this.i6((byte) 2, (short) 1818, 0, 14, 0.0f, 0.9921875f, this.Vz0))
            .xi0(this.Sv0(0, 0, 0.0f, 800.0f))
            .xi0(this.i6((byte) 2, (short) 1376, 0, 14, 833.3333f, 0.0f, this.Vz0))
            .xi0(this.Wt(1, 0.6f))
            .mz0()
            .Xf0()
            .xi0(this.Ue0(2, 31, 0.0f, 0.5f, 0.075f))
            .xi0(this.WW(16, 1.25f, 0.0f, 0.5f, px_1.ep0(31)))
            .xi0(this.nM(16, 2))
            .y80(this.Qh0(719))
            .xi0(this.fE0(-1, 719, 1, 11, 8, 0.25f));

        pw_1 p_fe0 = this.fE0(-1, 719, 2, 11, 8, 0.5f);
        A2.Kj0(this.E8, p_fe0, 0.2f);

        this.E8.xi0(this.i6((byte) 2, (short) 1561, 0, 14, 0.0f, 0.9921875f, this.Vz0))
            .xi0(this.i6((byte) 2, (short) 1907, 0, 14, 0.0f, 0.9921875f, this.Vz0))
            .xi0(this.i6((byte) 2, (short) 1907, 1, 14, 1333.3334f, 0.9921875f, this.Vz0))
            .xi0(this.i6((byte) 2, (short) 1907, 3, 14, 2600.0f, 0.9921875f, this.Vz0));

        N4.zr(this.E8, this.fE0(-1, 719, 1, 11, 8, 0.0f), 1.4f);
        this.E8.xi0(this.Xq0(16, 2, 23, 0.0f, 0.064f, 0.10009766f, -0.10009766f));
        N4.zr(this.E8, this.fE0(-1, 719, 2, 11, 8, 0.5f), 1.6f);
        N4.zr(this.E8, this.fE0(-1, 719, 0, 11, 8, 0.0f), 2.6f);
        this.E8.xi0(this.fE0(-1, 719, 3, 11, 8, 0.5f));
        pk_1.el(this.E8, this.fE0(-1, 719, 1, 11, 8, 0.25f));

        this.E8.xi0(this.Ue0(2, 31, 0.5f, 0.0f, 0.075f))
            .xi0(this.WW(16, 0.75f, 0.5f, 0.0f, px_1.ep0(31)));
        HB.p30(this.E8, this.Xq0(16, 2, 1, 0.0f, 0.032f, 0.10009766f, -0.10009766f));
        this.E8.xi0(this.tP(0.4f))
            .mz0()
            .y80(ao_1.pc((i, d) -> this.vx0(i, d)))
            .y80(this.E2(18, false))
            .xi0(this.tP(0.4f))
            .mz0();

        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }

    public void k90(int var1, D2 var2) {
        this.ND.z8();
    }

    public void bf0(int var1, D2 var2) {
        this.ND.Ry0((byte) 0);
        jd0_1 jd = this.ip0.Hi(this.ND);
        if (jd != null) {
            jd.Hm(false);
        }
    }

    @Override
    public final void R10() {
        PF pf = this.d2;
        pf.G90 = false;
        pf.cf0 = false;
        pf.Yo = false;
        pf.z40 = false;
        pf.Sk0 = 554;
        pf.S20 = -1;
        pf.AF0 = false;
        pf.hS = false;
        pf.uV = false;
        pf.fl0 = false;
        pf.f50 = false;
        pf.Eu = new short[0];
        pf.Ah();
        PF pf2 = this.d2;
        i40_0 gc = i40_0.Gc;
        pf2.gp = gc;
        pf2.Qj = gc;
        this.ip0.Hi(pf2).XO();
        this.ip0.lZ.add(new ii_1(this.d2, this.ip0.Hi(this.d2), null, false, false));
        super.R10();
    }
}
