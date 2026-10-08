package cn.pokemmo.rom.nds.hgss;

import f.*;
import com.badlogic.gdx.graphics.Texture;

public class HgssVoltorbFlipBoard implements fy0_0 {
    public static final int[][][] LPT7;
    public final hl0_1 XA;
    public final Texture c1;
    public final Texture Du;
    public final Texture ca;
    public final Texture Con;
    public final LPT6_[] Xu;
    public final LPT6_[] VZ;
    public final LPT6_[] yC;
    public final Texture[] F3;
    public final LPT6_[][] lPt2;
    public final js_1[] G9;
    public final SB0[] Ni0;
    public final CF Fo;
    public int gB;
    public short v50;

    static {
        LPT7 = new int[][][]{
                {
                        {3, 1, 6, 24},
                        {0, 3, 6, 27},
                        {5, 0, 6, 32},
                        {2, 2, 6, 36},
                        {4, 1, 6, 48}
                },
                {
                        {1, 3, 7, 54},
                        {6, 0, 7, 64},
                        {3, 2, 7, 72},
                        {0, 4, 7, 81},
                        {5, 1, 7, 96}
                },
                {
                        {2, 3, 8, 108},
                        {7, 0, 8, 128},
                        {4, 2, 8, 144},
                        {1, 4, 8, 162},
                        {6, 1, 8, 192}
                },
                {
                        {3, 3, 8, 216},
                        {0, 5, 8, 243},
                        {8, 0, 10, 256},
                        {5, 2, 10, 288},
                        {2, 4, 10, 324}
                },
                {
                        {7, 1, 10, 384},
                        {4, 3, 10, 432},
                        {1, 5, 10, 486},
                        {9, 0, 10, 512},
                        {6, 2, 10, 576}
                },
                {
                        {3, 4, 10, 648},
                        {0, 6, 10, 729},
                        {8, 1, 10, 768},
                        {5, 3, 10, 864},
                        {2, 5, 10, 972}
                },
                {
                        {7, 2, 10, 1152},
                        {4, 4, 10, 1296},
                        {1, 6, 13, 1458},
                        {9, 1, 13, 1536},
                        {6, 3, 10, 1728}
                },
                {
                        {0, 7, 10, 2187},
                        {8, 2, 10, 2304},
                        {5, 4, 10, 2592},
                        {2, 6, 10, 2916},
                        {7, 3, 10, 3456}
                }
        };
    }

    public HgssVoltorbFlipBoard(int i1) {
        this.XA = new hl0_1();
        this.Xu = new LPT6_[4];
        this.VZ = new LPT6_[10];
        this.yC = new LPT6_[10];
        this.F3 = new Texture[40];
        this.lPt2 = new LPT6_[4][];
        this.G9 = new js_1[25];
        this.Ni0 = new SB0[2];
        this.Fo = new CF();
        this.v50 = 0;
        this.gB = i1;

        for (int i = 0; i < this.G9.length; i++) {
            this.G9[i] = new js_1((t50_0) (Object) this, i);
        }
        for (int i = 0; i < this.Ni0.length; i++) {
            this.Ni0[i] = new SB0((t50_0) (Object) this, i);
        }

        FJ v1 = new FJ(tw0_0.Ll0.t1.nuL().COM7("/a/2/6/4"));
        Tt0 v2 = new Tt0(v1.EG(0));
        Tt0 v3 = new Tt0(v1.EG(1));
        Tt0 v4 = new Tt0(v1.EG(10));
        Gt0 v5 = new Gt0(v1.EG(2), true);
        IA0 v6 = new IA0(v1.EG(4), true);
        Gt0 v7 = new Gt0(v1.EG(3), true);
        IA0 v8 = new IA0(v1.EG(6), true);

        i4_0 p1 = v5.Qo0(v2);
        this.c1 = new Texture(p1);
        p1.dispose();

        i4_0 p2 = v7.Qo0(v3);
        this.Du = new Texture(p2);
        p2.dispose();

        for (int i = 0; i < this.Xu.length; i++) {
            this.Xu[i] = new LPT6_(this.c1, i * 8 + 8, 8, 8, 8);
        }
        for (int i = 0; i < this.VZ.length; i++) {
            this.VZ[i] = new LPT6_(this.c1, i * 8 + 8, 0, 8, 8);
        }
        for (int i = 0; i < this.yC.length; i++) {
            this.yC[i] = new LPT6_(this.Du, i * 16, 44, 16, 24);
        }

        for (int i = 0; i < 4; i++) {
            LPT6_[] arr = new LPT6_[5];
            arr[0] = new LPT6_(this.c1, 184, 0, 24, 24);
            arr[1] = new LPT6_(this.c1, 184, 24, 24, 24);
            arr[2] = new LPT6_(this.c1, 208, 0, 24, 24);
            int yOffset = 88;
            if (i == 1) {
                yOffset = 160;
            } else if (i == 2) {
                yOffset = 136;
            } else if (i == 3) {
                yOffset = 112;
            }
            arr[3] = new LPT6_(this.c1, yOffset, 24, 24, 24);
            arr[4] = new LPT6_(this.c1, yOffset, 0, 24, 24);
            this.lPt2[i] = arr;
        }

        i4_0 p3 = v6.dB(v2, v5);
        i4_0 p4 = new i4_0(p3.Sq0(), 200, p3.rH0());
        p4.NH0(p3, 0, 0);
        p3.dispose();
        this.ca = new Texture(p4);
        p4.dispose();

        i4_0 p5 = v8.dB(v3, v7);
        i4_0 p6 = new i4_0(p5.Sq0(), 84, p5.rH0());
        p6.dw0(p5, 0, 106, 256, 84);
        p5.dispose();
        this.Con = new Texture(p6);
        p6.dispose();

        Gt0 v11 = new Gt0(v1.EG(11), true);
        Rk0 v12 = new Rk0(v1.EG(12), true);
        for (int i = 0; i < 40; i++) {
            Bp0 v13 = new Bp0();
            Bp0 v14 = new Bp0();
            v12.DX(i, v13, v14);
            i4_0 v15 = new i4_0((int) v13.x, (int) v13.y, ix0_0.Vw);
            v12.Q60(i, v11, v4, v15, v14, null);
            this.F3[i] = new Texture(v15);
            v15.dispose();
        }
        v12.Lpt8();
        this.v50 = tw0_0.rl.hz().ma((byte) 4, (short) 1495);
    }

    public static void Kq(int i0, D2 v1) {
        tw0_0.RE0.d00(true, (byte) 4, (short) 2348, 0.0f);
    }

    public static void G70(int i0, D2 v1) {
        tw0_0.RE0.d00(true, (byte) 4, (short) 2348, 0.0f);
    }

    public final boolean X5() {
        for (js_1 js : this.G9) {
            pw_1 pw = js.Oi;
            if (pw != null && !pw.BJ0()) {
                return true;
            }
        }
        for (SB0 sb : this.Ni0) {
            int target;
            if (sb.rY == 1) {
                target = sb.FF.Fo.Kc0;
            } else {
                target = sb.FF.Fo.J9.UK();
            }
            if (sb.jz != target) {
                return true;
            }
        }
        return false;
    }

    public final void cm() {
        for (js_1 js : this.G9) {
            js.c80();
        }
        pw_1.xC()
                .TD0()
                .p1(0.033f)
                .p1(0.066f)
                .p1(0.033f)
                .y80(ao_1.pc(t50_0::G70))
                .mz0()
                .Ms(tw0_0.LD0.Ov);
    }

    public final void TP() {
        pw_1 pw = pw_1.xC();
        pw.TD0();
        for (int i = 0; i < 5; i++) {
            pw.Xf0();
            for (js_1 js : this.G9) {
                if (js.WA == i) {
                    js.mh0(pw);
                }
            }
            pw.mz0();
            pw.y80(ao_1.pc(t50_0::Kq));
            pw.p1(0.066f);
        }
        pw.y80(ao_1.pc(this::Tr0));
        pw.mz0();
        pw.Ms(tw0_0.LD0.Ov);
    }

    @Override
    public final void dispose() {
        tw0_0.RE0.Eh((byte) 0, (short) 0, true, false);
        this.XA.dispose();
        this.c1.dispose();
        this.Du.dispose();
        this.ca.dispose();
        this.Con.dispose();
        for (Texture tex : this.F3) {
            tex.dispose();
        }
    }

    public final CF ya0() {
        return this.Fo;
    }

    public final void l60(int i1) {
        this.Fo.Kc0 = i1;
        this.Ni0[1].jz = i1;
        this.Ni0[1].bB0 = i1;
    }

    public final void Qw0(int i1) {
        String str = Integer.toString(this.Ni0[i1].jz);
        int pad = 5 - str.length();
        for (int i = 0; i < str.length(); i++) {
            int digit = str.charAt(i) - '0';
            LPT6_ sprite = this.yC[digit];
            float x = (pad + i) * 16 + 168;
            float y = i1 * 40 + 210;
            this.XA.Lz(sprite, x, y);
        }
    }

    public final void Tr0(int i1, D2 v2) {
        CF cf = this.Fo;
        if (cf.J9.KG0()) {
            if (cf.J9.Oq0()) {
                if (cf.J9.HV() + 1 > 7) {
                    cf.PK++;
                } else {
                    cf.PK = 0;
                }
                if (cf.PK > 4) {
                    cf.l10 = 8;
                } else if (cf.l10 < 8) {
                    cf.l10++;
                }
                cf.Kc0 += cf.J9.UK();
            } else {
                cf.l10 = Math.max(1, Math.min(cf.J9.HV(), cf.l10));
                cf.PK = 0;
            }
            cf.J9 = new yb0_2(cf.l10, cf);
            cf.p80 = 0;
            cf.vf0 = 0;
        }
        for (js_1 js : this.G9) {
            js.QE = false;
            js.ty0 = 0;
            js.Rb = 0;
            js.Oi = null;
        }
    }
}
