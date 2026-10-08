package cn.pokemmo.world.render.mesh;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class GymMechanicMeshRenderer extends BaseMapMeshRenderer {
    public static final short[][] oj;
    public final Ou0[] OE0;
    public final boolean[] coM6;
    public final float[][] id;
    public final Ou0[] QS;
    public final float[][] cl0;
    public final Ou0[] M2;
    public final boolean[] wK0;
    public final boolean[] hT;
    public final float[][] k8;

    static {
        oj = new short[][]{
            new short[]{0, 1},
            new short[]{2, 3},
            new short[]{4, 5},
            new short[]{6},
            new short[]{7},
            new short[]{8, 9}
        };
    }

    public GymMechanicMeshRenderer(p50_0 p50_0) {
        super(p50_0);
        this.OE0 = new Ou0[6];
        this.coM6 = new boolean[6];
        this.id = new float[][]{
            new float[]{8.125f, 0.0f, 4.375f},
            new float[]{6.625f, 0.0f, 5.375f},
            new float[]{9.625f, 0.0f, 5.375f},
            new float[]{5.125f, 0.0f, 6.375f},
            new float[]{6.625f, 0.0f, 7.375f},
            new float[]{9.625f, 0.0f, 7.375f}
        };
        this.QS = new Ou0[8];
        this.cl0 = new float[][]{
            new float[]{6.625f, 0.0f, 4.375f},
            new float[]{9.625f, 0.0f, 4.375f},
            new float[]{5.125f, 0.0f, 5.375f},
            new float[]{8.125f, 0.0f, 5.375f},
            new float[]{11.125f, 0.0f, 5.375f},
            new float[]{6.625f, 0.0f, 6.375f},
            new float[]{8.125f, 0.0f, 7.375f},
            new float[]{11.125f, 0.0f, 7.375f}
        };
        this.M2 = new Ou0[10];
        this.wK0 = new boolean[10];
        this.hT = new boolean[]{false, true, false, true, false, true, true, true, false, true};
        this.k8 = new float[][]{
            new float[]{7.625f, 0.0f, 4.375f},
            new float[]{8.625f, 0.0f, 4.375f},
            new float[]{6.125f, 0.0f, 5.375f},
            new float[]{7.125f, 0.0f, 5.375f},
            new float[]{9.125f, 0.0f, 5.375f},
            new float[]{10.125f, 0.0f, 5.375f},
            new float[]{5.625f, 0.0f, 6.375f},
            new float[]{7.125f, 0.0f, 7.375f},
            new float[]{9.125f, 0.0f, 7.375f},
            new float[]{10.125f, 0.0f, 7.375f}
        };
        for (int i = 0; i < this.OE0.length; i++) {
            ra0_0.Ao0().getClass();
            this.OE0[i] = ra0_0.MB();
            this.OE0[i].ho.el0(this.id[i][0], this.id[i][1], this.id[i][2]);
            this.OE0[i].EG();
            yS(this.OE0[i]);
        }
        for (int i2 = 0; i2 < this.QS.length; i2++) {
            ra0_0.Ao0().getClass();
            this.QS[i2] = ra0_0.CoM4();
            this.QS[i2].ho.el0(this.cl0[i2][0], this.cl0[i2][1], this.cl0[i2][2]);
            this.QS[i2].EG();
            yS(this.QS[i2]);
        }
        for (int i3 = 0; i3 < this.M2.length; i3++) {
            ra0_0.Ao0();
            this.M2[i3] = ra0_0.S6(this.hT[i3]);
            this.M2[i3].ho.el0(this.k8[i3][0], this.k8[i3][1], this.k8[i3][2]);
            this.M2[i3].EG();
            yS(this.M2[i3]);
        }
        ra0_0.Ao0().getClass();
        Ou0 zu0 = ra0_0.zu0();
        zu0.ho.el0(8.125f, 0.0f, 8.375f);
        yS(zu0);
    }

    @Override
    public final void sn0(short[] sArr) {
        if (sArr.length < 1) {
            return;
        }
        switch (sArr[0]) {
            case 396:
                this.QS[sArr[1]].sC0(0, false, null);
                break;
            case 397:
                Ou0 ou0 = this.M2[sArr[1]];
                ou0.PE0 = 1.25f;
                ou0.sC0(0, false, null);
                this.wK0[sArr[1]] = true;
                lpt5__5.hL.ZD(new oh_2((f.ha0_0)(Object)this), 1200L);
                break;
            case 399:
                short s = sArr[1];
                short s2 = sArr[2];
                for (int i = 0; i < this.QS.length; i++) {
                    if ((s & (1 << i)) != 0) {
                        Ou0 ou02 = this.QS[i];
                        ou02.PE0 = 1.0E8f;
                        ou02.sC0(0, false, null);
                    }
                }
                for (int i2 = 0; i2 < this.M2.length; i2++) {
                    if ((s2 & (1 << i2)) != 0) {
                        Ou0 ou03 = this.M2[i2];
                        ou03.PE0 = 1.0E8f;
                        ou03.sC0(0, false, null);
                        this.wK0[i2] = true;
                    }
                }
                COn(true);
                break;
            default:
                break;
        }
    }

    public final void COn(boolean z) {
        for (int i = 0; i < this.OE0.length; i++) {
            if (!this.coM6[i]) {
                short[] sArr = oj[i];
                boolean ok = true;
                for (short s : sArr) {
                    if (!this.wK0[s]) {
                        ok = false;
                        break;
                    }
                }
                if (ok) {
                    if (z) {
                        this.OE0[i].PE0 = 1.0E8f;
                    } else {
                        this.OE0[i].PE0 = 1.0f;
                    }
                    this.OE0[i].sC0(0, false, null);
                    this.coM6[i] = true;
                }
            }
        }
    }
}
