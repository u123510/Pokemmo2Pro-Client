package cn.pokemmo.world.render.mesh;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import com.badlogic.gdx.math.Matrix4;

public class IceSlidingPuzzleMeshRenderer extends BaseMapMeshRenderer {
    public static final C8 en0 = new C8();
    public static final C8 KC0 = new C8();
    public static final short[][][] oC = new short[][][]{
            {{15, 26}, {19, 26}},
            {{21, 24}, {21, 20}, {21, 16}},
            {{20, 17}, {20, 12}},
            {{9, 10}, {13, 10}, {16, 10}, {18, 10}},
            {{3, 20}, {8, 20}, {3, 17}, {8, 17}},
            {{4, 22}, {4, 12}, {7, 12}},
            {{7, 14}, {3, 14}, {3, 10}},
            {{8, 7}, {11, 7}, {21, 7}},
            {{23, 27}, {23, 11}}
    };
    public static final byte[] ZY = new byte[]{0, 0, 0, 0, 1, 0, 0, 0, 0};
    public static final byte[] Fc = new byte[]{0, 0, 0, 2, 1, 0, 2, 0, 1};
    public static final byte[][] iD = new byte[][]{
            {8, 4},
            {1, 3, 2},
            {1, 2},
            {8, 12, 12, 4},
            {9, 5, 10, 6},
            {1, 10, 4},
            {20, 25, 2},
            {8, 12, 4},
            {1, 2}
    };
    public static final short[][] T10 = new short[][]{
            {20, 26},
            {3, 21},
            {8, 14},
            {8, 12},
            {8, 10},
            {12, 7},
            {20, 11},
            {19, 10},
            {22, 7},
            {12, 10},
            {23, 28}
    };
    public final RA0[] s80;
    public final Ou0[] ve;

    public IceSlidingPuzzleMeshRenderer(cb_0 cb_02) {
        super(cb_02);
        Ou0 ou0 = fi_0.xL().rv();
        Ou0 ou02 = fi_0.xL().BH();
        this.s80 = new RA0[oC.length];
        for (byte b = 0; b < oC.length; b = (byte) (b + 1)) {
            Ou0 ou03 = ou0.Ma0();
            ou03.sY = false;
            ou03.rF0();
            this.yS(ou03);
            this.s80[b] = new RA0((f.k70_0)(Object)this, b, ou03);
            for (byte b2 = 0; b2 < oC[b].length; b2 = (byte) (b2 + 1)) {
                Hy0 hy0 = new Hy0((f.k70_0)(Object)this, this.s80[b], b2);
                cb_02.A40(oC[b][b2][0], oC[b][b2][1]).Mw(hy0);
            }
        }
        this.ve = new Ou0[T10.length];
        for (byte b3 = 0; b3 < T10.length; b3 = (byte) (b3 + 1)) {
            Ou0 ou04 = ou02.Ma0();
            ou04.sY = false;
            float f = (float) T10[b3][0] * 0.25f + 0.125f;
            float f2 = (float) T10[b3][1] * 0.25f + 0.125f;
            ou04.ho.m80(f, 0.1f, f2);
            ou04.rF0();
            this.yS(ou04);
            this.ve[b3] = ou04;
        }
        v80_0.Cb0();
        Ou0 ou05 = v80_0.VH(487);
        ou05.ho.m80(2.875f, 0.0f, 7.375f);
        ou05.Ni(IceSlidingPuzzleMeshRenderer::nJ);
        ou05.TU(0, true);
        this.yS(ou05);
        v80_0.Cb0();
        Ou0 ou06 = v80_0.VH(486);
        ou06.ho.m80(2.375f, 0.26f, 1.125f);
        ou06.Ni(IceSlidingPuzzleMeshRenderer::F0);
        ou06.TU(0, true);
        this.yS(ou06);
    }

    public static boolean F0() {
        BR br = tw0_0.rl;
        if (br != null) {
            return br.yh0.Ny((byte) 3, (short) 1363);
        }
        return false;
    }

    public static boolean nJ() {
        BR br = tw0_0.rl;
        if (br != null) {
            return br.yh0.Ny((byte) 3, (short) 1363);
        }
        return false;
    }

    @Override
    public final void lpt1(float f) {
        for (int i = 0; i < oC.length; i++) {
            RA0 ra0 = this.s80[i];
            Matrix4 ho = ra0.PD0.ho;
            C8 c8 = en0;
            ho.V1(c8);
            float f4 = c8.z;
            C8 c82 = ra0.Xa;
            float f7 = c82.z;
            if (f4 < f7) {
                float f5;
                c8.z = f5 = f4 + lg_0.S4.uL * 0.5f;
                if (f5 >= c82.z) {
                    c8.z = c82.z;
                    ra0.PD0.ep.mH0.DL0 = 1;
                    ra0.Re.Kl0(ra0.YU.Tz(), ra0.YU.HR() + 1);
                }
            } else if (f4 > f7) {
                float f6;
                c8.z = f6 = f4 - lg_0.S4.uL * 0.5f;
                if (f6 <= c82.z) {
                    c8.z = c82.z;
                    ra0.PD0.ep.mH0.DL0 = 1;
                    ra0.Re.Kl0(ra0.YU.Tz(), ra0.YU.HR() - 1);
                }
            } else {
                float f8 = c8.x;
                float f9 = c82.x;
                if (f8 < f9) {
                    float f10;
                    c8.x = f10 = f8 + lg_0.S4.uL * 0.5f;
                    if (f10 >= c82.x) {
                        c8.x = c82.x;
                        ra0.PD0.ep.mH0.DL0 = 1;
                        ra0.Re.Kl0(ra0.YU.Tz() + 1, ra0.YU.HR());
                    }
                } else if (f8 > f9) {
                    float f11;
                    c8.x = f11 = f8 - lg_0.S4.uL * 0.5f;
                    if (f11 <= c82.x) {
                        c8.x = c82.x;
                        ra0.PD0.ep.mH0.DL0 = 1;
                        ra0.Re.Kl0(ra0.YU.Tz() - 1, ra0.YU.HR());
                    }
                } else {
                    ra0.continue$ = false;
                }
            }
            ra0.PD0.ho.Y1(c8);
        }
        super.lpt1(f);
    }

    public final void Kl0(int i, int i2) {
        for (byte b = 0; b < T10.length; b = (byte) (b + 1)) {
            if (T10[b][0] == i && T10[b][1] == i2) {
                Ou0 ou0 = this.ve[b];
                if (!this.y50.sj0(ou0, true)) {
                    continue;
                }
                this.ve[b].ho.V1(KC0);
                fi_0 fi_02 = fi_0.xL();
                if (fi_02.W8 == null) {
                    v80_0.Cb0();
                    vh_1 vh_12 = fi_02.LM[3];
                    int[] nArray = new int[]{168, 190};
                    fi_02.W8 = v80_0.CW(vh_12, 112, nArray);
                    fi_02.M70.Ue0(fi_02.W8.hW);
                }
                Ou0 ou02 = tq0_0.ip0(fi_02.W8, fi_02.W8);
                ou02.I0 = true;
                ou02.ho.Y1(KC0);
                ou02.rF0();
                this.y50.Ue0(ou02);
                ou02.Ey("gym07_woodbox", false, new xi_1((f.k70_0)(Object)this, ou02));
                return;
            }
        }
    }

    @Override
    public final void sn0(short[] sArray) {
        if (sArray.length < 1) {
            return;
        }
        short s = sArray[0];
        if (s == 4468) {
            short s2 = sArray[1];
            this.y50.sj0(this.ve[s2], true);
        } else if (s == 4471) {
            short s3 = sArray[1];
            short s4 = sArray[2];
            this.s80[s3].si((byte) s4, false);
        }
    }
}
