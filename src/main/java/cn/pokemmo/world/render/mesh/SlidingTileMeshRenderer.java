package cn.pokemmo.world.render.mesh;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class SlidingTileMeshRenderer extends BaseMapMeshRenderer {
    public final Ou0[] kI;
    public final float[][] bd0;
    public final Ou0[] lK;
    public final float[][] a2;
    public final Ou0[] u60;
    public final float[][] do$;
    public final PG[] e6;
    public final float[] f40;
    public final int[] OE0;
    public final int[] l70;
    public final int[] Oa0;
    public final boolean[] Qo0;
    public final Runnable[] Hw0;
    public final float[][] J8;
    public final float[] Da;
    public final short[][][] Ce;
    public Ou0 qO;

    public SlidingTileMeshRenderer(p50_0 v1) {
        super(v1);
        this.kI = new Ou0[4];
        this.bd0 = new float[][]{
            {6.375f, 0.5f, 2.375f},
            {7.375f, 0.5f, 8.375f},
            {3.375f, 0.5f, 4.125f},
            {11.625f, 0.5f, 10.375f}
        };
        this.lK = new Ou0[4];
        this.a2 = new float[][]{
            {1.375f, 0.5f, 9.375f},
            {5.625f, 0.5f, 9.375f},
            {10.375f, 0.5f, 9.625f},
            {8.625f, 0.5f, 1.625f}
        };
        this.u60 = new Ou0[4];
        this.do$ = new float[][]{
            {1.375f, 0.5f, 9.375f},
            {5.625f, 0.5f, 9.375f},
            {10.375f, 0.5f, 9.625f},
            {8.625f, 0.5f, 1.625f}
        };
        this.e6 = new PG[4];
        this.f40 = new float[4];
        this.OE0 = new int[4];
        this.l70 = new int[4];
        this.Oa0 = new int[]{-1, -1, -1, -1};
        this.Qo0 = new boolean[4];
        this.Hw0 = new Runnable[4];
        this.J8 = new float[][]{
            {0.0f, 4.56666f},
            {1.33333f, 2.16666f},
            {0.0f, 4.16666f},
            {0.0f, 4.16666f}
        };
        this.Da = new float[]{7.1f, 1.25f, 10.5f, 9.5f};
        this.Ce = new short[][][]{
            {
                {5, 39, -1},
                {22, 8, 1}
            },
            {
                {22, 39, -1},
                {14, 39, 0},
                {16, 27, 1}
            },
            {
                {41, 40, -1},
                {16, 15, 1}
            },
            {
                {34, 8, -1},
                {49, 40, 1}
            }
        };
        this.qO = null;
        for (int i2 = 0; i2 < 4; i2++) {
            this.kI[i2] = ra0_0.Ao0().M50(i2);
            this.kI[i2].ho.el0(this.bd0[i2][0], this.bd0[i2][1], this.bd0[i2][2]);
            this.kI[i2].TU(0, false);
            yS(this.kI[i2]);

            this.lK[i2] = ra0_0.Ao0().eG0(i2);
            this.lK[i2].RD0();
            this.lK[i2].ho.el0(this.a2[i2][0], this.a2[i2][1], this.a2[i2][2]);
            this.Cz.Ue0(this.lK[i2]);

            this.u60[i2] = ra0_0.Ao0().ad(i2);
            this.u60[i2].ho.el0(this.do$[i2][0], this.do$[i2][1], this.do$[i2][2]);
            yS(this.u60[i2]);
        }
        for (int i2 = 0; i2 < this.Ce.length; i2++) {
            for (int i3 = 0; i3 < this.Ce[i2].length; i3++) {
                short[] sArr = this.Ce[i2][i3];
                short s = sArr[2];
                short s2 = sArr[0];
                short s3 = sArr[1];
                v1.A40(s2, s3).Mw(new DD((f.w9_0)(Object)this, i2, i3, s));
            }
        }
    }

    public static boolean Lv() {
        BR br = tw0_0.rl;
        if (br != null && br.yh0.Ny((byte) 2, (short) 1524)) {
            return true;
        }
        return false;
    }

    public static boolean static$() {
        BR br = tw0_0.rl;
        if (br != null && br.yh0.Ny((byte) 2, (short) 1524)) {
            return true;
        }
        return false;
    }

    @Override
    public final void lpt1(float f) {
        if (this.qO == null) {
            for (I2 it = tw0_0.LD0.Sc.qf.ZD(); it.hasNext(); ) {
                nv0_0 nv0 = (nv0_0) it.next();
                if (nv0.EK.O60 == J4.p5(this.WK.Bm0, this.WK.case$)) {
                    Ou0 ou0 = nv0.LH0(new C8(13.5f, 2.0f, 43.5f), 107);
                    this.qO = ou0;
                    ou0.qp = SlidingTileMeshRenderer::static$;
                    nv0.LH0(new C8(31.5f, 2.0f, 9.5f), 107).qp = SlidingTileMeshRenderer::Lv;
                    break;
                }
            }
        }
        super.lpt1(f);
        for (int i1 = 0; i1 < 4; i1++) {
            float f2 = lg_0.S4.uL;
            PG pg = this.e6[i1];
            if (pg == null) {
                z0(i1, false);
            } else if (!this.Qo0[i1]) {
                int i4 = this.OE0[i1];
                float f3;
                f2 = (this.f40[i1] += f2);
                if (f2 < 2.0f) {
                    if (!LW.iF(pg.lK0)) {
                        Runnable runnable = this.Hw0[i1];
                        if (runnable != null) {
                            runnable.run();
                            this.Hw0[i1] = null;
                        }
                    }
                    this.e6[i1].lK0 = 0.0f;
                    this.e6[i1].Ym = 0.0f;
                    this.Oa0[i1] = 0;
                } else if (!LW.iF(this.J8[i1][i4]) && (f2 = this.f40[i1]) >= (f3 = this.J8[i1][i4]) + 2.0f && f2 <= f3 + 4.0f) {
                    if (!LW.iF(this.e6[i1].lK0)) {
                        Runnable runnable = this.Hw0[i1];
                        if (runnable != null) {
                            runnable.run();
                            this.Hw0[i1] = null;
                        }
                    }
                    this.e6[i1].lK0 = 0.0f;
                    this.e6[i1].Ym = this.J8[i1][i4];
                    this.Oa0[i1] = 1;
                } else {
                    this.e6[i1].lK0 = 1.0f;
                    this.Oa0[i1] = -1;
                }
            }
        }
    }

    @Override
    public final void dispose() {
        super.dispose();
        yt_1 yt = tw0_0.e60;
        if (yt != null) {
            E90 e90 = yt.jB0;
            if (e90 != null) {
                e90.il0.getClass();
                e90.il0.f60(null, false, C8.Zero);
            }
        }
    }

    public final void sn0(short[] sArr) {
        if (sArr.length < 1) {
            return;
        }
        short s = sArr[0];
        if (s == 384) {
            ON(sArr[1], sArr[2]);
        } else if (s == 608) {
            short s2 = sArr[1];
            for (int i = 0; i < this.u60.length; i++) {
                ON(i, (s2 & (1 << i)) != 0 ? 1 : 0);
            }
        }
    }

    public final void z0(int i, boolean z) {
        int i3;
        this.OE0[i] = (i3 = this.l70[i]);
        float f;
        PG pg;
        if (z && (pg = this.e6[i]) != null) {
            f = pg.Ym;
        } else {
            f = 0.0f;
        }
        this.e6[i] = this.lK[i].sC0(i3, false, new ey_2((f.w9_0)(Object)this, i));
        if (z) {
            this.e6[i].Ym = f;
        } else {
            this.f40[i] = 0.0f;
        }
    }

    public final void ON(int i1, int i2) {
        this.kI[i1].sC0(i2, false, null);
        this.u60[i1].sC0(i2, false, null);
        this.l70[i1] = i2;
        PG pg = this.e6[i1];
        if (pg != null && pg.Ym < this.Da[i1]) {
            z0(i1, true);
        }
    }
}
