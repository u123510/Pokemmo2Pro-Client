package cn.pokemmo.world.render.mesh;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class WaterWheelMeshRenderer extends BaseMapMeshRenderer {
    public final Ou0[] lpT2;
    public final Ou0[] Aa0;
    public final float[][] QG;
    public final float[][] U30;
    public final short[][] Ka;
    public Ou0 dI;

    public WaterWheelMeshRenderer(p50_0 v1) {
        super(v1);
        this.lpT2 = new Ou0[3];
        this.Aa0 = new Ou0[3];
        this.QG = new float[][]{
            {4.5f, 0.0f, 13.625f},
            {13.875f, 0.75f, 11.0f},
            {4.375f, 1.5f, 8.5f}
        };
        this.U30 = new float[][]{
            {5.875f, 0.0f, 13.375f},
            {14.875f, 0.75f, 10.375f},
            {3.875f, 1.5f, 7.375f}
        };
        this.Ka = new short[][]{
            {17, 60},
            {22, 53},
            {60, 44},
            {54, 39},
            {16, 38},
            {12, 34},
            {22, 32},
            {18, 29}
        };
        this.dI = null;

        for (int i2 = 0; i2 < 3; i2++) {
            ra0_0.Ao0().getClass();
            this.Aa0[i2] = ra0_0.EH0();
            this.Aa0[i2].ho.m80(this.U30[i2][0], this.U30[i2][1], this.U30[i2][2]);
            yS(this.Aa0[i2]);

            Ou0 model;
            if (i2 == 1) {
                ra0_0.Ao0().getClass();
                model = ra0_0.WD0();
            } else {
                ra0_0.Ao0().getClass();
                model = ra0_0.rH();
            }
            this.lpT2[i2] = model;
            model.ho.m80(this.QG[i2][0], this.QG[i2][1], this.QG[i2][2]);
            yS(this.lpT2[i2]);
            this.lpT2[i2].PE0 = 1.0E8f;
            this.lpT2[i2].TU(1, false);

            short x = (short) (int) (this.U30[i2][0] * 4.0f);
            short y = (short) (int) (this.U30[i2][2] * 4.0f);
            LT tile = v1.A40(x, y);
            if (tile != null) {
                tile.Mw(hI.To);
            }
        }

        for (int i2 = 0; i2 < this.Ka.length; i2++) {
            short x = this.Ka[i2][0];
            short y = this.Ka[i2][1];
            LT tile = v1.A40(x, y);
            if (tile != null) {
                tile.Mw(hI.To);
            }
        }
    }

    public static boolean Si0() {
        BR rl = tw0_0.rl;
        if (rl != null && rl.yh0.Ny((byte) 2, (short) 1527)) {
            return true;
        }
        return false;
    }

    public static boolean qv() {
        BR rl = tw0_0.rl;
        if (rl != null && rl.yh0.Ny((byte) 2, (short) 1527)) {
            return true;
        }
        return false;
    }

    @Override
    public final void lpt1(float f1) {
        if (this.dI == null) {
            I2 iter = tw0_0.LD0.Sc.qf.ZD();
            while (iter.hasNext()) {
                nv0_0 npc = (nv0_0) iter.next();
                if (npc.EK.O60 == J4.p5(this.WK.Bm0, this.WK.case$)) {
                    Ou0 model1 = npc.LH0(new C8(16.5f, 0.0f, 62.5f), 107);
                    this.dI = model1;
                    model1.qp = WaterWheelMeshRenderer::qv;
                    Ou0 model2 = npc.LH0(new C8(17.5f, 6.0f, 22.5f), 107);
                    model2.qp = WaterWheelMeshRenderer::Si0;
                    break;
                }
            }
        }
        super.lpt1(f1);
    }

    public final void sn0(short[] v1) {
        if (v1.length < 1) {
            return;
        }
        switch (v1[0]) {
            case 403:
                if (v1.length < 3) {
                    return;
                }
                short idx0 = v1[1];
                short anim0 = v1[2];
                Ou0 aaModel = this.Aa0[idx0];
                aaModel.PE0 = 1.0f;
                aaModel.sC0(anim0, false, null);
                break;
            case 404:
                if (v1.length < 3) {
                    return;
                }
                short idx1 = v1[1];
                short anim1 = v1[2];
                this.lpT2[idx1].PE0 = 1.0f;
                tw0_0.RE0.Hq0((byte) 2, (short) 1744);
                this.lpT2[idx1].sC0(anim1, false, new Zv0());
                break;
            case 405:
                if (v1.length < 4) {
                    return;
                }
                for (int i2 = 0; i2 < 3; i2++) {
                    short val = v1[i2 + 1];
                    Ou0 lpModel = this.lpT2[i2];
                    lpModel.PE0 = 1.0E8f;
                    int anim = (val == 0) ? 1 : 0;
                    lpModel.sC0(anim, false, null);
                    this.Aa0[i2].PE0 = 1.0E8f;
                    this.Aa0[i2].sC0(val, false, null);
                }
                break;
            default:
                break;
        }
    }
}
