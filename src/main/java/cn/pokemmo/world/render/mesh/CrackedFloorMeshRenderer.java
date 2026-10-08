package cn.pokemmo.world.render.mesh;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class CrackedFloorMeshRenderer extends BaseMapMeshRenderer {
    public static final float[][] Ai;
    public static final byte[][] sl;
    public static final int[] P90;

    public final wy0_0[] ut0;
    public final Ou0 mD0;
    public float P1;
    public Ou0 Hm;

    static {
        Ai = new float[][]{
                new float[]{19.0f, 24.0f, 50.0f, 40.0f},
                new float[]{19.0f, 20.0f, 50.0f, 40.0f},
                new float[]{9.0f, 24.0f, 40.0f, 30.0f},
                new float[]{14.0f, 24.0f, 40.0f, 30.0f},
                new float[]{9.0f, 20.0f, 50.0f, 30.0f},
                new float[]{14.0f, 20.0f, 50.0f, -59.0f},
                new float[]{14.0f, 24.0f, 70.0f, 50.0f}
        };

        sl = new byte[][]{
                new byte[]{3, 2},
                new byte[]{3, 2},
                new byte[]{2, 1},
                new byte[]{2, 1},
                new byte[]{3, 1},
                new byte[]{3, 0},
                new byte[]{3, 3}
        };

        P90 = new int[]{0, 1, 0, 1, 1, 0, 1};
    }

    public CrackedFloorMeshRenderer(p50_0 v1) {
        super(v1);
        this.P1 = 0.0f;
        this.Hm = null;
        this.ut0 = new wy0_0[7];
        for (int i = 0; i < 7; ++i) {
            wy0_0 w = new wy0_0((CrackedFloorMeshRenderer)(Object)this, i, Ai[i], sl[i], P90[i], true);
            yS(w.uF0);
            this.ut0[i] = w;
            zA(i);
        }
        ra0_0.Ao0();
        this.mD0 = ra0_0.Xi();
        this.mD0.ho.m80(3.875f, -9.9375f, 6.0f);
        yS(this.mD0);
    }

    public static boolean Cj0() {
        BR rl = tw0_0.rl;
        return rl != null && rl.yh0.Ny((byte) 2, (short) 1525);
    }

    @Override
    public final void lpt1(float f1) {
        if (this.Hm == null) {
            es_1 qf = tw0_0.LD0.Sc.qf;
            I2 it = qf.ZD();
            while (it.hasNext()) {
                nv0_0 nv = (nv0_0) it.next();
                if (nv.EK.O60 == J4.p5(this.WK.Bm0, this.WK.case$)) {
                    this.Hm = nv.LH0(new C8(17.5f, -62.0f, 7.5f), 107);
                    this.Hm.qp = CrackedFloorMeshRenderer::Cj0;
                    break;
                }
            }
        }
        for (int i = 0; i < 7; ++i) {
            this.ut0[i].w70();
        }
        super.lpt1(f1);
    }

    public final void sn0(short[] v1) {
        if (v1.length < 1) {
            return;
        }
        switch (v1[0]) {
            case 400:
                if (v1.length >= 3) {
                    this.ut0[v1[1]].nr0 = v1[2];
                }
                break;
            case 401:
                if (v1.length >= 7) {
                    for (int i = 0; i < 6; ++i) {
                        this.ut0[i].Fe0(v1[i + 1]);
                    }
                }
                break;
            case 402:
                if (v1.length >= 2) {
                    this.ut0[6].Fe0(v1[1]);
                    this.ut0[6].nr0 = (v1[1] == 1) ? 0 : 1;
                }
                break;
        }
    }

    @Override
    public final void dispose() {
        super.dispose();
        if (tw0_0.e60 != null && tw0_0.e60.jB0 != null) {
            tw0_0.e60.jB0.il0.f60(null, false, C8.Zero);
        }
    }

    public final void zA(int i1) {
        for (int i2 = 0; i2 < 2; ++i2) {
            byte[] bArr = sl[i1];
            if (bArr[0] == bArr[1]) {
                continue;
            }
            byte b = bArr[i2];
            rk0_1 trigger = new rk0_1(this.ut0[i1], i2);
            float[] fArr = Ai[i1];
            int baseX = (int) (fArr[0] - 1.0f);
            int baseY = (int) fArr[1];
            for (int i7 = 0; i7 < 5; ++i7) {
                for (int i8 = 0; i8 < 3; ++i8) {
                    this.WK.rc0(b, (short) (baseX + i7), (short) (baseY + i8)).WH = trigger;
                }
            }
        }
    }
}
