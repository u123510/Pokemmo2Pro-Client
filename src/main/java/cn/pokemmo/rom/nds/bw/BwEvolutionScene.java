package cn.pokemmo.rom.nds.bw;

import f.*;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g3d.particles.ParticleEffectExt;

public class BwEvolutionScene extends vj_0 {
    public Tq0 pr0;
    public fh_1 Or;
    public ff_0 eH0;
    public Ou0 eo0;
    public final es_1 d7;
    public final lc_0[] G10;
    public final xt_0[] Zy;
    public final AG0[][] eF0;
    public ParticleEffectExt Fb0;
    public ParticleEffectExt rf0;
    public final WU W0;
    public final VU zA;
    public short lN;
    public short OI;

    public BwEvolutionScene(VU v1, WU v2) {
        super(false);
        this.d7 = new es_1();
        this.G10 = new lc_0[2];
        this.Zy = new xt_0[2];
        this.eF0 = new AG0[2][];
        this.lN = 0;
        this.OI = 0;
        this.zA = v1;
        this.W0 = v2;
        this.lN = v1.U8();
        this.OI = v1.Vo();
    }

    @Override
    public final void IZ() {
        super.IZ();
        this.fC0.Q30 = 0.0f;
        this.fC0.Rg0 = 0.75f;
        this.fC0.rj.x = 0.0f;
        this.fC0.rj.y = 0.0f;
        this.fC0.rj.z = -1.0f;
        this.fC0.JP(0.0f, 0.0f, 0.0f);
        this.pr0 = new Tq0(this.fC0);
        this.Or = new fh_1(1000, this.pr0);
        this.eH0 = new ff_0(this.fC0, 0);
        this.eH0.A7 = new FJ((Ae) tw0_0.Ll0.Qz0.fd0.dg.get("/a/1/8/2"));
        this.eH0.Vk.Q4();
        this.ym0.Ue0(this.Or);
        this.ym0.Ue0(this.pr0);
        this.ym0.Ue0(this.eH0);
        co_1.Kl0.x = 0.0f;
        co_1.Kl0.y = 0.0f;
        co_1.Kl0.z = -1.0f;
        co_1.cOm6.x = 0.0f;
        co_1.cOm6.y = 0.0f;
        co_1.cOm6.z = -1.0f;
        this.Fb0 = this.eH0.UH0("special/spinme");
        this.eH0.fY(this.Fb0);
        this.Fb0.start();
        this.ym0.Ue0(this.Fb0);

        nj0_0 v1 = tw0_0.Ll0.Qz0;
        v80_0 v2 = v80_0.Cb0();
        Ae ae = (Ae) v1.fd0.dg.get("/a/1/8/2");
        FJ fj = new FJ(ae);
        int[] anims = new int[] { 6, 9, -1, 7 };
        this.eo0 = v80_0.CW(fj, 8, anims);
        this.eo0.ia((String) this.eo0.Kv.get(0), true);
        this.eo0.PE0 = 2.0f;
        this.ym0.Ue0(this.Fb0);

        LPT6_[] v1_models = new LPT6_[2];
        boolean[] v2_bools = new boolean[] { false, false };
        int i3 = 1;
        for (int i4 = 0; i4 < 2; i4++) {
            short i5;
            if (i4 == 0) {
                i5 = this.zA.I8.Kr();
            } else {
                i5 = yh_0.Ed(this.zA.I8.ZF0, this.zA.u60);
            }
            yh_0 v6 = yh_0.Xm0;
            if (v6.ak0(this.zA.Dg0(), i5, this.zA.I8.I(), false)) {
                AG0[] v5 = v6.Kr0(this.zA.Dg0(), i5, this.zA.I8.I(), false);
                this.eF0[i4] = v5;
                LPT6_[] v7 = new LPT6_[v5.length];
                for (int i8 = 0; i8 < v5.length; i8++) {
                    v7[i8] = v5[i8].d3();
                    v5[i8].O50(this);
                }
                v1_models[i4] = v7[0];
                this.G10[i4] = lc_0.fC0(v7[0]);
            } else {
                v2_bools[i4] = true;
                i3 = 2;
                this.Zy[i4] = v6.P90(this.zA.Dg0(), i5, this.zA.I8.I(), false);
                this.Zy[i4].j9((float) i3);
                v1_models[i4] = this.Zy[i4].yq();
                this.G10[i4] = lc_0.fC0(v1_models[i4]);
                this.ym0.Ue0(this.Zy[i4]);
            }
            C8 rj = new C8(this.fC0.rj);
            rj.na(-0.07f, 0.225f, 0.0f);
            this.G10[i4].yj(rj);
            this.G10[i4].oA(0.0125f / (float) i3);
        }

        this.d7.clear();
        this.ru0 = 0.0f;
        int i4_counter = 0;
        int i5_stepX = i3 * 8;
        int i6_stepY = i3 * 4;
        int i7_width = i3 * 192;
        int i8_height = i3 * 128;
        for (int i9_y = 0; i9_y < i8_height; i9_y += i6_stepY) {
            for (int i10_x = 0; i10_x < i7_width; i10_x += i5_stepX) {
                lc_0 v11 = null;
                lc_0 v12 = null;
                for (int i13 = 0; i13 < 2; i13++) {
                    lc_0 v14_sub;
                    if (v2_bools[i13]) {
                        LPT6_ model = v1_models[i13];
                        Texture tex = model.OB;
                        int i16 = i7_width - i10_x;
                        int i17 = -i5_stepX;
                        LPT6_ sub = new LPT6_(tex, i16, i9_y, i17, i6_stepY);
                        v14_sub = lc_0.fC0(sub);
                    } else {
                        LPT6_ v14_m = v1_models[i13];
                        int bz = v14_m.bz;
                        if (bz == 192 && v14_m.xZ == 128) {
                            LPT6_ sub = new LPT6_(v14_m.OB, v14_m.Zi0() + i10_x, i9_y, i5_stepX, i6_stepY);
                            v14_sub = lc_0.fC0(sub);
                        } else {
                            int i17_offY = 64 - v14_m.xZ / 2;
                            int i18_offX = i10_x - (96 - bz / 2);
                            if (i18_offX < 0 || (i9_y - i17_offY) < 0 || i18_offX >= bz || (i9_y - i17_offY) >= v14_m.xZ) {
                                continue;
                            }
                            LPT6_ sub = new LPT6_(v14_m.OB, v14_m.Zi0() + i18_offX, i9_y - i17_offY, i5_stepX, i6_stepY);
                            v14_sub = lc_0.fC0(sub);
                        }
                    }
                    C8 pos = new C8(this.fC0.rj);
                    pos.na(0.0f, 1.0f, 0.0f);
                    float f15 = (float) (-i10_x / i5_stepX) * 0.1f;
                    pos.Vy(f15, (float) (i9_y / i6_stepY) * 0.05f, 0.0f);
                    v14_sub.yj(pos);
                    v14_sub.oA(0.0125f / (float) i3);
                    if (i13 == 0) {
                        v11 = v14_sub;
                    } else {
                        v12 = v14_sub;
                    }
                }
                float f13 = (float) (i4_counter++) * 0.0125f;
                if (v11 != null || v12 != null) {
                    float f14 = (float) (-i10_x / i5_stepX) * 0.1f;
                    C8 offset = new C8(f14, (float) (i9_y / i6_stepY) * 0.05f, 0.0f);
                    this.d7.Ue0(new li0_1(v11, v12, offset, f13));
                }
            }
        }
        this.LPt6(lg_0.S4.Kr0(), lg_0.S4.sD0());
        String msg = sm0_0.Bw((byte) 2, lpt6__2.Q80, 172, 0, new String[] { this.zA.na0() });
        this.W0.is0(msg);
        tw0_0.RE0.Hq0((byte) 2, (short) 1010);
        tw0_0.RE0.Eh((byte) 2, (short) 1011, true, false);
        ML0 zw = tw0_0.LD0.d6.ZW;
        if (zw != null) {
            zw.Ll(false);
        }
    }

    @Override
    public final boolean Lpt1() {
        if (this.ru0 * 2.0f > 35.0f || this.W0.BD) {
            return true;
        }
        return false;
    }

    @Override
    public final void i5() {
        if (this.eo0 != null) {
            this.eo0.P30(this.ru0, null);
            this.OB0.eo0(this.eo0);
        }
        float f1 = this.ru0 * 14.0f + 100.0f;
        float f2 = this.ru0 * 2.0f;
        if (f2 >= 2.0f) {
            if (this.lN > 0) {
                di0_0.xE0(this.lN);
                this.lN = 0;
            }
        }
        if (f2 >= 25.0f) {
            if (this.OI > 0) {
                di0_0.xE0(this.OI);
                this.OI = 0;
            }
        }
        if (f2 >= 24.0f && this.rf0 == null) {
            cq_0 v3 = (cq_0) mp_1.vf0().k2.get(Short.valueOf(this.zA.u60));
            String targetName = v3.Ay(false);
            String evolvedMsg = sm0_0.Bw((byte) 2, lpt6__2.Q80, 172, 2, new String[] { this.zA.na0(), targetName });
            this.W0.is0(evolvedMsg);
            this.zA.aG(v3);
            this.zA.I8.Yb0 = v3.dR;
            this.rf0 = this.eH0.UH0("special/evolution_stars");
            this.eH0.fY(this.rf0);
            this.rf0.init();
            this.rf0.start();
            this.ym0.Ue0(this.rf0);
            this.eo0.Uo0((String) this.eo0.Kv.get(0), 16.0f);
            this.eo0.Uo0((String) this.eo0.Kv.get(0), -4.0f);
            if (tw0_0.rl != null) {
                tw0_0.rl.fk0.uQ(new f2_0(this.zA.pu, true));
            }
            a10_0 pk0 = tw0_0.PK0;
            if (pk0 != null) {
                PF v4 = pk0.nd0(this.zA.pu);
                if (v4 != null) {
                    tb0_1 v5 = v4.r10;
                    short dR = v3.dR;
                    byte ya0 = v4.Ya0();
                    String kX = this.zA.I8.kX;
                    short ib = v4.zi0.Bn.IB;
                    byte wm = v4.Wm();
                    byte com9 = v4.coM9();
                    byte rp0 = v4.rp0();
                    se_0 b3 = v5.B3;
                    b3.Bn.Yb0 = dR;
                    b3.ZE0 = (cq_0) mp_1.vf0().k2.get(Short.valueOf(b3.Bn.Yb0));
                    b3.Bn.wj = ya0;
                    b3.Bn.kX = kX;
                    b3.Bn.n7(ib);
                    b3.D4 = wm;
                    b3.nF0 = com9;
                    if (rp0 < 0 || rp0 > 24) {
                        rp0 = 3;
                    }
                    b3.Bn.QQ = rp0;
                    v5.Wb();
                    v4.rm0 = v3.dR;
                    v4.Z10 = (cq_0) mp_1.vf0().k2.get(Short.valueOf(v4.rm0));
                    v4.ZI(v4.COm2(), true);
                }
            }
            this.W0.ah0 = false;
            this.W0.yR.Ll(false);
        }

        I2 it = this.d7.ZD();
        while (it.hasNext()) {
            li0_1 v4 = (li0_1) it.next();
            f1 += v4.Qu;
            C8 v5 = T3.hf(v4.m40, v4.m40);
            lc_0 v6 = v4.h9;
            float f7 = 0.0f;
            float f8 = this.ru0 * 2.0f - v4.Qu;
            if (f8 >= 18.0f) {
                v6 = v4.hR;
            }
            if (v6 == null) {
                continue;
            }
            if (f2 > 25.0f) {
                v6.gH0(1.0f, 1.0f, 1.0f, 0.0f);
            } else if (f2 > 10.0f) {
                float f9 = Math.min(1.0f, f2 - 10.0f);
                v6.gH0(1.0f, 1.0f, 1.0f, f9);
            }
            if (f8 < 15.0f && f8 >= 1.0f) {
                f7 = LW.Fm0(f1);
                f8 = LW.Po0(f1);
                if (f7 == 0.0f) {
                    f7 = LW.Yu.nextFloat() * 1.0f;
                }
                if (f8 == 0.0f) {
                    f8 = LW.Yu.nextFloat() * 1.0f;
                }
                f7 *= 0.33f;
                f8 *= 0.33f;
            } else {
                v5.x = -1.22f;
                f8 = 0.0f;
                float tmp = f8;
                f8 = f7;
                f7 = tmp;
            }
            if (v4.h9 != null) {
                v4.h9.aa(v4.SD0.x + f7 + v5.x, v4.SD0.y + 0.0f, v4.SD0.z + f8);
            }
            if (v4.hR != null) {
                v4.hR.aa(v4.SD0.x + f7 + v5.x, v4.SD0.y + 0.0f, v4.SD0.z + f8);
            }
            if (f2 > 2.0f && f2 < 25.0f) {
                this.Or.ni0(v6);
            }
        }
        if (f2 < 2.0f) {
            this.G10[0].gH0(0.0f, 0.0f, 0.0f, 0.0f);
            this.G10[0].GF();
            this.Or.ni0(this.G10[0]);
        } else if (f2 >= 25.0f) {
            this.G10[1].gH0(0.0f, 0.0f, 0.0f, 0.0f);
            this.G10[1].GF();
            this.Or.ni0(this.G10[1]);
        }
        this.Or.JF0();
        this.eH0.update();
        this.eH0.begin();
        this.eH0.me0();
        this.eH0.end();
        this.OB0.eo0(this.eH0);
        if (this.Zy[0] != null) {
            lg_0.k.lPT5(this.Zy[0]);
        }
        if (this.Zy[1] != null) {
            lg_0.k.lPT5(this.Zy[1]);
        }
    }

    @Override
    public final void dispose() {
        super.dispose();
        this.W0.xe0();
        ML0 v2 = tw0_0.LD0.d6.ZW;
        if (v2 != null) {
            v2.Ll(true);
        }
        if (this.W0.BD) {
            BR v1 = tw0_0.rl;
            if (v1 != null) {
                CH0 pu = this.zA.pu;
                v1.fk0.uQ(new f2_0(pu, false));
            }
        }
        tw0_0.RE0.Eh((byte) 0, (short) 0, true, false);
        this.eo0.O4();
    }
}
