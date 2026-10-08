package cn.pokemmo.world.render.mesh;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import com.badlogic.gdx.math.Matrix4;

public class RockClimbMeshRenderer extends BaseMapMeshRenderer {
    public static final C8 Jh;
    public static final short[][] kY;
    public final Qm m40;
    public byte az;
    public boolean pA0;
    public final es_1 Oa0;
    public final es_1 lPt4;
    public final es_1 RE;

    static {
        Jh = new C8();
        kY = new short[][] {
            {1, 34},
            {1, 35},
            {1, 36},
            {6, 25},
            {6, 26},
            {6, 27},
            {6, 8},
            {6, 9},
            {6, 10},
            {7, 8},
            {7, 9},
            {7, 10},
            {10, 2},
            {10, 3},
            {10, 4},
            {13, 6},
            {13, 7},
            {13, 8},
            {13, 19},
            {13, 20},
            {13, 21},
            {13, 27},
            {13, 28},
            {13, 29},
            {13, 33},
            {13, 34},
            {13, 35},
            {16, 2},
            {16, 3},
            {16, 4},
            {16, 25},
            {16, 26},
            {16, 27},
            {20, 21},
            {20, 22},
            {20, 23},
            {20, 24},
            {20, 25},
            {25, 34},
            {25, 35},
            {25, 36}
        };
    }

    public RockClimbMeshRenderer(cb_0 cb_02) {
        super(cb_02);
        this.az = -10;
        this.pA0 = false;
        this.Oa0 = new es_1();
        this.lPt4 = new es_1();
        this.RE = new es_1();

        v80_0.Cb0().getClass();
        Ou0 ou0 = v80_0.VH(242);
        ou0.sY = false;
        ou0.ho.el0(4.0f, (float) this.az * 0.5f, 4.0f);
        this.yS(ou0);
        this.m40 = new Qm((f.rj_1)(Object)this, ou0);
        ou0.K50();
        this.H1((byte) 1, true);

        dh0_2 dh0_22 = new dh0_2((f.rj_1)(Object)this);
        int n = cb_02.Kb() * cb_02.uF0();
        int n2 = cb_02.To() * cb_02.cH0();
        for (short s = 0; s < n; s = (short) (s + 1)) {
            for (short s2 = 0; s2 < n2; s2 = (short) (s2 + 1)) {
                Ll0 ll0 = cb_02.rc0((byte) 0, s, s2);
                if (ll0.re() == 89) {
                    ll0.Mw(dh0_22);
                }
            }
        }

        v80_0.Cb0().getClass();
        Ou0 ou02 = v80_0.VH(487);
        ou02.ho.m80(2.875f, 1.0f, 10.125f);
        ou02.Ni(RockClimbMeshRenderer::LPt2);
        ou02.TU(0, true);
        this.yS(ou02);

        v80_0.Cb0().getClass();
        Ou0 ou03 = v80_0.VH(486);
        ou03.ho.m80(2.875f, 1.0f, 0.875f);
        ou03.Ni(RockClimbMeshRenderer::a1);
        ou03.TU(0, true);
        this.yS(ou03);
    }

    public static boolean a1() {
        BR bR = tw0_0.rl;
        if (bR != null) {
            return bR.yh0.Ny((byte) 3, (short) 1364);
        }
        return false;
    }

    public static boolean LPt2() {
        BR bR = tw0_0.rl;
        if (bR != null) {
            return bR.yh0.Ny((byte) 3, (short) 1364);
        }
        return false;
    }

    @Override
    public final void lpt1(float f) {
        if (!this.pA0) {
            es_1 es_12 = ((ov_0) tw0_0.LD0.Sc).qf;
            I2 i2 = es_12.ZD();
            while (i2.hasNext()) {
                nv0_0 nv0_02 = (nv0_0) i2.next();
                I2 i22 = nv0_02.yf0.ZD();
                while (i22.hasNext()) {
                    Ou0 ou0 = (Ou0) i22.next();
                    if (ou0.yI0.equalsIgnoreCase("r04_b1")) {
                        ou0.EG();
                        this.Oa0.Ue0(ou0);
                    }
                    if (ou0.yI0.equalsIgnoreCase("r04_b2")) {
                        ou0.EG();
                        this.lPt4.Ue0(ou0);
                    }
                    if (ou0.yI0.equalsIgnoreCase("r04_b3")) {
                        ou0.EG();
                        this.RE.Ue0(ou0);
                    }
                }
            }
            if (this.lPt4.KB > 0) {
                this.pA0 = true;
            }
        }

        Qm qm = this.m40;
        qm.VB0.bo0(lg_0.S4.uL);
        Matrix4 matrix4 = qm.VB0.ho;
        C8 c8 = Jh;
        matrix4.V1(c8);
        float f2 = (float) qm.Yg.az * 0.5f;
        float f3 = c8.y;
        if (f3 < f2) {
            f3 += lg_0.S4.uL * 0.5f;
            c8.y = f3;
            if (f3 >= f2) {
                c8.y = f2;
            }
            qm.VB0.ho.Y1(c8);
        } else if (f3 > f2) {
            f3 -= lg_0.S4.uL * 0.5f;
            c8.y = f3;
            if (f3 <= f2) {
                c8.y = f2;
            }
            qm.VB0.ho.Y1(c8);
        }

        super.lpt1(f);
    }

    public final void H1(byte b, boolean bl) {
        this.az = b;
        for (int i = 0; i < kY.length; i++) {
            short[] sArray = kY[i];
            this.WK.rc0((byte) 0, sArray[0], sArray[1]).Ds0 = (float) this.az * 2.0f;
        }

        I2 i2 = this.Oa0.ZD();
        while (i2.hasNext()) {
            Ou0 ou0 = (Ou0) i2.next();
            if (b == 2) {
                ou0.Ey((String) ou0.Kv.get(0), false, null);
            } else {
                ou0.EG();
                mz_2 mz_22 = (mz_2) ((BM) ou0.Y3.get(0)).sg(mz_2.g7);
                mz_22.R4(ou0.wA);
            }
        }

        I2 i22 = this.lPt4.ZD();
        while (i22.hasNext()) {
            Ou0 ou0 = (Ou0) i22.next();
            if (b == 1) {
                ou0.Ey((String) ou0.Kv.get(0), false, null);
            } else {
                ou0.EG();
                mz_2 mz_22 = (mz_2) ((BM) ou0.Y3.get(0)).sg(mz_2.g7);
                mz_22.R4(ou0.wA);
            }
        }

        I2 i23 = this.RE.ZD();
        while (i23.hasNext()) {
            Ou0 ou0 = (Ou0) i23.next();
            if (b == 0) {
                ou0.Ey((String) ou0.Kv.get(0), false, null);
            } else {
                ou0.EG();
                mz_2 mz_22 = (mz_2) ((BM) ou0.Y3.get(0)).sg(mz_2.g7);
                mz_22.R4(ou0.wA);
            }
        }

        if (bl) {
            Qm qm = this.m40;
            Matrix4 matrix4 = qm.VB0.ho;
            C8 c8 = Jh;
            matrix4.V1(c8);
            c8.y = (float) qm.Yg.az * 0.5f;
            qm.VB0.ho.Y1(c8);
        }
    }

    @Override
    public final void dispose() {
        super.dispose();
        this.Oa0.clear();
        this.lPt4.clear();
        this.RE.clear();
        this.az = -10;
    }

    @Override
    public final void sn0(short[] sArray) {
        if (sArray.length < 1) {
            return;
        }
        short s = sArray[0];
        if (s == 4463 || s == 4464) {
            byte b = (byte) sArray[1];
            boolean bl = (s == 4463);
            this.H1(b, bl);
        }
    }
}
