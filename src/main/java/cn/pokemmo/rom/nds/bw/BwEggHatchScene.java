package cn.pokemmo.rom.nds.bw;

import f.*;
import com.badlogic.gdx.graphics.g3d.particles.ParticleEffectExt;

public class BwEggHatchScene extends vj_0 {
    public fh_1 xc0;
    public ff_0 sR;
    public Ou0 cF0;
    public xt_0 Yl;
    public lc_0 gB;
    public xt_0 Xr0;
    public lc_0 Dz0;
    public AG0[] go;
    public ParticleEffectExt PG0;
    public final WU oR;
    public final VU Tu;
    public boolean B10;
    public pw_1 jd0;
    public boolean KH0;

    public BwEggHatchScene(VU v1, WU v2) {
        super(false);
        this.B10 = true;
        this.Tu = v1;
        this.oR = v2;
    }

    @Override
    public final void IZ() {
        super.IZ();
        this.fC0.Q30 = 0.0f;
        this.fC0.Rg0 = 0.65f;
        this.fC0.rj.x = 0.0f;
        this.fC0.rj.y = 0.0f;
        this.fC0.rj.z = -1.8f;
        this.fC0.JP(0.0f, 0.0f, 0.0f);
        this.fC0.zo0 = 50.0f;
        Tq0 v2 = new Tq0(this.fC0);
        this.xc0 = new fh_1(100, v2);
        this.sR = new ff_0(this.fC0, 0);
        this.sR.A7 = new FJ((Ae) tw0_0.Ll0.Qz0.fd0.dg.get("/a/1/8/9"));
        this.sR.Vk.Q4();
        this.ym0.Ue0(this.xc0);
        this.ym0.Ue0(v2);
        this.ym0.Ue0(this.sR);
    }

    @Override
    public final void ux() {
        co_1.Kl0.x = 0.0f;
        co_1.Kl0.y = 0.0f;
        co_1.Kl0.z = -0.4f;
        co_1.cOm6.x = 0.0f;
        co_1.cOm6.y = 0.0f;
        co_1.cOm6.z = -0.4f;

        ParticleEffectExt v1_fx;
        try {
            v1_fx = this.sR.B2("particle/special/egg.vfx").copy();
        } catch (Exception v2) {
            ff_0.D2.info("Couldn't load preload VFX {}", "special/egg", v2);
            v1_fx = new ParticleEffectExt();
        }
        this.PG0 = v1_fx;
        this.ym0.Ue0(v1_fx);

        nj0_0 v1 = tw0_0.Ll0.Qz0;
        v80_0 v2_v80 = v80_0.Cb0();
        Ae ae = (Ae) v1.fd0.dg.get("/a/1/8/9");
        FJ fj = new FJ(ae);
        int[] anims = new int[] { 6, 7, 9 };
        this.cF0 = v80_0.CW(fj, 8, anims);
        this.cF0.ia((String) this.cF0.Kv.get(0), true);
        this.cF0.PE0 = 2.0f;

        short i1 = this.Tu.I8.Kr();
        float f2 = 1.0f;
        int i3 = 1;
        yh_0 v4_yh = yh_0.Xm0;
        if (v4_yh.ak0(this.Tu.Dg0(), i1, this.Tu.I8.I(), false)) {
            AG0[] v4 = v4_yh.Kr0(this.Tu.Dg0(), i1, this.Tu.I8.I(), false);
            this.go = v4_yh.Kr0(this.Tu.Dg0(), i1, this.Tu.I8.I(), false);
            LPT6_[] v5 = new LPT6_[this.go.length];
            for (int i6 = 0; i6 < this.go.length; i6++) {
                v5[i6] = v4[i6].d3();
                v4[i6].O50(this);
            }
            this.gB = lc_0.fC0(v5[0]);
            f2 *= 64.0f / (float) v5[0].xZ;
        } else {
            i3 = 2;
            this.Yl = v4_yh.P90(this.Tu.Dg0(), i1, this.Tu.I8.I(), false);
            this.Yl.j9((float) i3);
            this.ym0.Ue0(this.Yl);
            this.gB = lc_0.fC0(this.Yl.yq());
        }

        yh_0 v1_yh = yh_0.Xm0;
        this.Xr0 = v1_yh.P90(this.Tu.Dg0(), yh_0.BE, this.Tu.I8.I(), false);
        this.ym0.Ue0(this.Xr0);

        AG0[] hm0 = v1_yh.hm0;
        if (hm0 == null) {
            Wr wr = new Wr(new uk0_1(v1_yh));
            v1_yh.hm0 = new AG0[6];
            for (int i5 = 0; i5 < v1_yh.hm0.length; i5++) {
                v1_yh.hm0[i5] = new AG0(wr, i5 * 32, 0, 32, 32);
            }
            hm0 = v1_yh.hm0;
        }

        es_1 v1_es = new es_1();
        for (int i6 = 0; i6 < hm0.length; i6++) {
            v1_es.Ue0(hm0[i6].d3());
        }
        this.Dz0 = lc_0.fC0(hm0[0].d3());

        C8 v1_pos = new C8(this.fC0.rj);
        v1_pos.na(-0.07f, 0.325f, 0.2f);
        this.gB.yj(v1_pos);
        this.gB.ei0.na(0.0f, -0.2f, 0.2f);
        this.gB.oA((f2 * 0.0125f) / (float) i3);

        v1_pos.Vy(0.0f, 0.3f, 0.0f);
        this.Dz0.yj(v1_pos);
        this.Dz0.oA(0.0125f);
        this.ru0 = 0.0f;

        this.LPt6(lg_0.S4.Kr0(), lg_0.S4.sD0());
        String msg = sm0_0.Bw((byte) 2, lpt6__2.YG0, 260, 0, new String[] { this.Tu.na0() });
        this.oR.is0(msg.replaceAll("\n", ""));
        tw0_0.RE0.Hq0((byte) 2, (short) 1010);
        tw0_0.RE0.Eh((byte) 2, (short) 1011, true, false);

        ML0 v2_zw = tw0_0.LD0.d6.ZW;
        if (v2_zw != null) {
            v2_zw.Ll(false);
        }

        pw_1 v1_pw = pw_1.xC().TD0();
        v1_pw.Sq0 += 0.925f;
        v1_pw.Xf0();
        ao_1 a1 = ao_1.DX(this.Dz0, 2, 0.125f);
        a1.h5[0] = this.Dz0.ei0.y + 0.1f;
        v1_pw.y80(a1);
        ao_1 a2 = ao_1.DX(this.Dz0, 5, 0.125f);
        a2.h5[0] = 1.0f;
        v1_pw.y80(a2);
        v1_pw.mz0();
        v1_pw.Xf0();
        ao_1 a3 = ao_1.DX(this.Dz0, 2, 0.125f);
        a3.h5[0] = this.Dz0.ei0.y - 0.05f;
        v1_pw.y80(a3);
        ao_1 a4 = ao_1.DX(this.Dz0, 5, 0.125f);
        a4.h5[0] = 1.25f;
        v1_pw.y80(a4);
        ao_1 a5 = ao_1.DX(this.Dz0, 6, 0.125f);
        a5.h5[0] = 1.0f;
        v1_pw.y80(a5);
        v1_pw.mz0();
        v1_pw.Xf0();
        ao_1 a6 = ao_1.DX(this.Dz0, 2, 0.125f);
        a6.h5[0] = this.Dz0.ei0.y;
        v1_pw.y80(a6);
        ao_1 a7 = ao_1.DX(this.Dz0, 6, 0.125f);
        a7.h5[0] = 1.25f;
        v1_pw.y80(a7);
        v1_pw.mz0();
        v1_pw.mz0();
        v1_pw = (pw_1) v1_pw.Yu0(1, 0.925f);

        pw_1 v2_pw = pw_1.xC().TD0();
        ao_1 b1 = ao_1.DX(this.Dz0, 1, 0.05f);
        b1.h5[0] = this.Dz0.ei0.x - 0.02f;
        v2_pw.y80(b1);
        ao_1 b2 = ao_1.DX(this.Dz0, 1, 0.05f);
        b2.h5[0] = this.Dz0.ei0.x + 0.02f;
        v2_pw.y80(b2);
        v2_pw.mz0();
        v2_pw = (pw_1) v2_pw.Yu0(4, 0.0f);

        pw_1 v3_pw = pw_1.xC().TD0();
        ao_1 c1 = ao_1.DX(this.Dz0, 1, 0.05f);
        c1.h5[0] = this.Dz0.ei0.x - 0.04f;
        v3_pw.y80(c1);
        ao_1 c2 = ao_1.DX(this.Dz0, 1, 0.05f);
        c2.h5[0] = this.Dz0.ei0.x + 0.04f;
        v3_pw.y80(c2);
        v3_pw.mz0();
        v3_pw = (pw_1) v3_pw.Yu0(10, 0.0f);

        pw_1 v4_pw = pw_1.xC().TD0();
        ao_1 d1 = ao_1.DX(this.Dz0, 1, 0.05f);
        d1.h5[0] = this.Dz0.ei0.x - 0.06f;
        v4_pw.y80(d1);
        ao_1 d2 = ao_1.DX(this.Dz0, 1, 0.05f);
        d2.h5[0] = this.Dz0.ei0.x + 0.06f;
        v4_pw.y80(d2);
        v4_pw.mz0();
        v4_pw = (pw_1) v4_pw.Yu0(10, 0.0f);

        this.jd0 = pw_1.xC();
        this.jd0.TD0();
        this.jd0.xi0(v1_pw);
        v2_pw.Sq0 += 0.55f;
        this.jd0.xi0(v2_pw);
        this.jd0.xi0(v3_pw);
        this.jd0.xi0(v4_pw);
        ao_1 e1 = ao_1.DX(this.Dz0, 1, 0.125f);
        e1.h5[0] = this.Dz0.ei0.x;
        this.jd0.y80(e1);
        this.jd0.mz0();
        this.jd0.Ms(this.cn);
    }

    @Override
    public final boolean Lpt1() {
        if (this.ru0 > 11.0f || this.oR.BD) {
            return true;
        }
        return false;
    }

    @Override
    public final void update() {
        super.update();
        if (this.oR.Em0 == null) {
            Qy0 v1 = Qy0.yI0;
            WU v2 = this.oR;
            I30 v3 = v1.ez0;
            if (v3 != null) {
                v3.xe0();
            }
            v1.ez0 = v2;
            v1.F9(0, v2);
        }
        this.cF0.P30(this.ru0, null);
        if (this.Yl != null) {
            lg_0.k.lPT5(this.Yl);
        }
        if (this.Xr0 != null) {
            lg_0.k.lPT5(this.Xr0);
        }
    }

    @Override
    public final void i5() {
        this.OB0.eo0(this.cF0);
        int i1 = 0;
        float f2 = this.ru0;
        if (f2 > 3.9f) {
            i1 = 5;
        } else if (f2 > 2.8f) {
            i1 = 4;
        } else if (f2 > 2.6f) {
            i1 = 3;
        } else if (f2 > 1.5f) {
            i1 = 2;
        } else if (f2 > 1.3f) {
            i1 = 1;
        }

        yh_0 v2 = yh_0.Xm0;
        AG0[] v3 = v2.hm0;
        if (v3 == null) {
            Wr wr = new Wr(new uk0_1(v2));
            v2.hm0 = new AG0[6];
            for (int i4 = 0; i4 < v2.hm0.length; i4++) {
                v2.hm0[i4] = new AG0(wr, i4 * 32, 0, 32, 32);
            }
            v3 = v2.hm0;
        }

        this.Dz0.i80.sI0 = v3[i1].d3();
        this.Dz0.et0();

        if (this.jd0 != null && this.jd0.BJ0() && !this.PG0.isInitialized()) {
            this.sR.fY(this.PG0);
            this.PG0.init();
            this.PG0.start();
            String v1 = (String) this.cF0.Kv.get(0);
            if (this.cF0.i10 != null) {
                u5_0 v4 = (u5_0) this.cF0.i10.get(v1);
                if (v4 != null) {
                    v4.Wd0 = false;
                    this.cF0.FL0 = v4;
                    this.cF0.kv = 0.0f;
                }
            }
            this.cF0.Uo0(v1, 16.0f);
            this.cF0.Uo0(v1, -4.0f);
            this.jd0 = null;
        }

        if (this.ru0 > 8.0f && !this.KH0) {
            this.KH0 = true;
            String v2_str = (String) this.cF0.Kv.get(0);
            if (this.cF0.i10 != null) {
                u5_0 v4 = (u5_0) this.cF0.i10.get(v2_str);
                if (v4 != null) {
                    v4.Wd0 = false;
                    this.cF0.FL0 = v4;
                    this.cF0.kv = 0.0f;
                }
            }
            if (this.cF0.FL0 != null) {
                I2 it = this.cF0.FL0.P30.ZD();
                while (it.hasNext()) {
                    ((uy_1) it.next()).zw0 = T4.hJ0;
                }
            }
        }

        if (this.jd0 != null && !this.jd0.BJ0()) {
            this.Dz0.gH0(0.0f, 0.0f, 0.0f, 0.0f);
            this.Dz0.GF();
            this.xc0.ni0(this.Dz0);
        } else if (this.ru0 > 8.0f) {
            this.gB.GF();
            this.xc0.ni0(this.gB);
            if (this.B10) {
                CE v1 = this.Tu.I8;
                di0_0.Hv0(v1.Yb0, v1.ZF0, 1.0f, 0.0f, false);
                this.B10 = false;
                this.gB.gH0(0.0f, 0.0f, 0.0f, 0.0f);
                String msg = sm0_0.Bw((byte) 2, lpt6__2.YG0, 260, 1, new String[] { this.Tu.na0() });
                this.oR.is0(msg);
            }
        }

        this.xc0.JF0();
        this.sR.update();
        this.sR.begin();
        this.sR.me0();
        this.sR.end();
        this.OB0.eo0(this.sR);
    }

    @Override
    public final void dispose() {
        super.dispose();
        this.oR.xe0();
        tw0_0.RE0.Eh((byte) 0, (short) 0, true, false);
        this.cF0.O4();
    }
}
