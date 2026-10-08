package cn.pokemmo.world.render.mesh;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class ArrowSpinnerMeshRenderer extends BaseMapMeshRenderer {
    public static final C8 p90 = new C8();
    public static final C8[][] fA0;
    public static final int[][] AF0;

    public final O7[] mV;
    public boolean pF;
    public final Ou0[] hg0;
    public Ou0 By;
    public Ou0 cy0;
    public Ou0 UL;
    public final boolean[] G60;

    public ArrowSpinnerMeshRenderer(hm_0 hm_0Var) {
        super(hm_0Var);
        this.pF = false;
        this.hg0 = new Ou0[3];
        this.By = null;
        this.cy0 = null;
        this.UL = null;
        this.G60 = new boolean[2];
        this.mV = new O7[4];
        v80_0.Cb0().getClass();
        Ou0 sb = v80_0.sb((byte) 4, 118, false);
        for (byte b = 0; b < this.mV.length; b = (byte) (b + 1)) {
            Ou0 ou0 = (b == 0) ? sb : sb.Ma0();
            this.mV[b] = new O7((f.zr0_0)(Object)this, b, ou0, fA0[b]);
        }
        for (int i = 6; i <= 11; i++) {
            int i2 = ((i % 3) * 6) + 3;
            int i3 = (i > 8) ? 9 : 17;
            hm_0Var.A40(i2, i3).Mw(new FF((f.zr0_0)(Object)this, 3, i));
        }
        hm_0Var.A40(3, 32).Mw(new FF((f.zr0_0)(Object)this, 0, 0));
        hm_0Var.A40(9, 32).Mw(new FF((f.zr0_0)(Object)this, 1, 1));
        hm_0Var.A40(15, 32).Mw(new FF((f.zr0_0)(Object)this, 2, 2));
        hm_0Var.A40(3, 24).Mw(new FF((f.zr0_0)(Object)this, 2, 3));
        hm_0Var.A40(9, 24).Mw(new FF((f.zr0_0)(Object)this, 0, 4));
        hm_0Var.A40(15, 24).Mw(new FF((f.zr0_0)(Object)this, 1, 5));

        v80_0.Cb0().getClass();
        Ou0 sb2 = v80_0.sb((byte) 4, 158, false);
        sb2.ho.m80(1.625f, 0.0f, 8.875f);
        sb2.Ni(ArrowSpinnerMeshRenderer::SG);
        sb2.TU(0, true);
        yS(sb2);

        v80_0.Cb0().getClass();
        Ou0 sb3 = v80_0.sb((byte) 4, 157, false);
        sb3.ho.m80(2.875f, 0.0f, 1.375f);
        sb3.Ni(ArrowSpinnerMeshRenderer::u80);
        sb3.TU(0, true);
        yS(sb3);
    }

    public static int[] hm0(int i, int i2, int i3) {
        for (int i4 = 0; i4 < AF0.length; i4++) {
            for (int i5 = 0; i5 < 3; i5++) {
                if (i5 != i3 || i4 != i2) {
                    if (AF0[i4][i5] == i) {
                        return new int[]{i4, i5};
                    }
                }
            }
        }
        return new int[2];
    }

    public static boolean u80() {
        BR br = tw0_0.rl;
        if (br != null && br.yh0.Ny((byte) 4, (short) 1362)) {
            return true;
        }
        return false;
    }

    public static boolean SG() {
        BR br = tw0_0.rl;
        if (br != null && br.yh0.Ny((byte) 4, (short) 1362)) {
            return true;
        }
        return false;
    }

    static {
        fA0 = new C8[][]{
            new C8[]{
                new C8(0.875f, 0.0f, 7.75f),
                new C8(0.875f, 0.0f, 7.25f),
                new C8(2.375f, 0.0f, 7.25f),
                new C8(2.375f, 0.0f, 6.75f),
                new C8(3.875f, 0.0f, 7.0f),
                new C8(3.875f, 0.0f, 6.25f),
                new C8(2.375f, 0.0f, 6.25f),
                new C8(2.375f, 0.0f, 6.0f)
            },
            new C8[]{
                new C8(2.375f, 0.0f, 7.75f),
                new C8(2.375f, 0.0f, 7.25f),
                new C8(0.875f, 0.0f, 7.25f),
                new C8(0.875f, 0.0f, 6.75f),
                new C8(2.375f, 0.0f, 6.5f),
                new C8(2.375f, 0.0f, 6.25f),
                new C8(3.875f, 0.0f, 6.25f),
                new C8(3.875f, 0.0f, 6.0f)
            },
            new C8[]{
                new C8(3.875f, 0.0f, 7.75f),
                new C8(3.875f, 0.0f, 7.0f),
                new C8(2.375f, 0.0f, 6.75f),
                new C8(2.375f, 0.0f, 6.5f),
                new C8(0.875f, 0.0f, 6.75f),
                new C8(0.875f, 0.0f, 6.0f)
            },
            new C8[]{
                new C8(2.375f, 0.0f, 4.0f),
                new C8(0.875f, 0.0f, 2.25f)
            }
        };

        AF0 = new int[][]{
            new int[]{9, 10, 11},
            new int[]{21, 21, 0},
            new int[]{0, 0, 20},
            new int[]{1, 20, 0},
            new int[]{0, 1, 0},
            new int[]{0, 2, 2},
            new int[]{0, 0, 0},
            new int[]{6, 7, 8}
        };
    }

    @Override
    public final void lpt1(float f) {
        if (!this.pF) {
            I2 it = tw0_0.LD0.Sc.qf.ZD();
            while (it.hasNext()) {
                nv0_0 nv0_0Var = (nv0_0) it.next();
                if (nv0_0Var.EK.O60 == J4.p5(this.WK.Bm0, this.WK.case$)) {
                    this.pF = true;
                    I2 it2 = nv0_0Var.yf0.ZD();
                    while (it2.hasNext()) {
                        Ou0 ou0 = (Ou0) it2.next();
                        String str = ou0.yI0;
                        if (str != null) {
                            switch (str) {
                                case "gym02switch_r":
                                    this.By = ou0;
                                    break;
                                case "gym02rope_1":
                                    this.cy0 = ou0;
                                    Xz0 Ve0 = ou0.Ve0("g02rope_1b", true);
                                    if (Ve0 != null) {
                                        Ve0.Fc0.x = 1.0f;
                                        Ve0.Fc0.y = 1.0f;
                                        Ve0.Fc0.z = 1.0f;
                                        ou0.a8();
                                    }
                                    break;
                                case "gym02rope_2":
                                    this.UL = ou0;
                                    break;
                                case "gym02switch":
                                    ou0.ho.V1(p90);
                                    if (p90.x > 2.0f) {
                                        if (p90.z > 4.0f) {
                                            this.hg0[0] = ou0;
                                        } else {
                                            this.hg0[2] = ou0;
                                        }
                                    } else {
                                        this.hg0[1] = ou0;
                                    }
                                    break;
                            }
                        }
                    }
                }
            }
            if (this.cy0 != null) {
                this.cy0.sC0(0, false, null);
            }
            if (this.UL != null) {
                this.UL.sC0(0, false, null);
            }
        }

        for (O7 o7 : this.mV) {
            if (o7.qk0) {
                int i = o7.l5;
                int i2 = o7.zT;
                if (i != i2) {
                    int i3 = (i2 > i) ? (i + 1) : (i - 1);
                    C8 c8 = o7.H8[i];
                    C8 c82 = o7.H8[i3];
                    float SH0 = c8.SH0(c82);
                    o7.Ko0 += lg_0.S4.uL;
                    if (o7.Ko0 >= SH0) {
                        o7.nJ.ho.Y1(c82);
                        o7.Ko0 = 0.0f;
                        if (o7.zT > o7.l5) {
                            o7.l5++;
                        } else {
                            o7.l5--;
                        }
                    } else {
                        p90.x = c8.x;
                        p90.y = c8.y;
                        p90.z = c8.z;
                        p90.JA(c82, o7.Ko0 / SH0);
                        o7.nJ.ho.Y1(p90);
                    }
                } else {
                    af0_0.SS.P10 = 0L;
                    af0_0.SS.Lu0 = 0;
                    af0_0.SS.fq0 = 0;
                    af0_0.SS.mr = 1;
                    af0_0.SS.De = hk0_1.KG + 60L;
                    af0_0.SS.jL0 = 60;
                    o7.qk0 = false;
                    o7.nJ.EG();
                    if (o7.h3 != null) {
                        tw0_0.RE0.wp0((byte) 4, (short) 1623);
                        o7.h3.il0.getClass();
                        o7.h3.il0.f60(null, false, C8.Zero);
                        KF kf = o7.h3.rd;
                        o7.h3.il0.getClass();
                        o7.h3.il0.f60(null, false, C8.Zero);
                        if (o7.Pi0) {
                            o7.h3.il0.LE(new nk_0[]{nk_0.Vb});
                        } else {
                            o7.h3.il0.LE(new nk_0[]{nk_0.TN});
                        }
                        if (o7.t5 != null) {
                            o7.h3.il0.Cp(o7.t5);
                        }
                        o7.h3 = null;
                        o7.t5 = null;
                    }
                }
            }
        }
        super.lpt1(f);
    }

    @Override
    public final void sn0(short[] sArr) {
        if (sArr.length < 1 || sArr[0] != 4701) {
            return;
        }
        byte b = (byte) sArr[1];
        boolean z = sArr[2] == 1;
        this.G60[b] = z;
        if (b == 1) {
            if (this.cy0 != null) {
                this.cy0.sC0(z ? 1 : 0, false, null);
            }
            if (this.By != null) {
                this.By.sC0(z ? 1 : 0, false, null);
            }
        } else {
            if (this.UL != null) {
                this.UL.sC0(z ? 1 : 0, false, null);
            }
            for (Ou0 ou0 : this.hg0) {
                if (ou0 != null) {
                    ou0.sC0(z ? 1 : 0, false, null);
                }
            }
        }
    }
}
