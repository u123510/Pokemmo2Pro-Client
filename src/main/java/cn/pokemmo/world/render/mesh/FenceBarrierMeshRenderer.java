/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.world.render.mesh;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

/*
 * Renamed from f.gF
 */
public class FenceBarrierMeshRenderer extends BaseMapMeshRenderer {
    public static final short[][] U4;
    public static final byte[][] Ke0;
    public static final short[][][] Ww;
    public final Ou0[] qo0 = new Ou0[10];
    public final Ou0 Zr0;
    public Gv0 m00 = null;
    public long Le;
    public final C8 bM0 = new C8();
    public he0_2 af = null;

    public static void sX(byte by, int n, int n2, int n3, int n4, int n5) {
        FenceBarrierMeshRenderer.Ke0[n][by] = (byte)n2;
        short[] sArray = Ww[n][by];
        short[] sArray2 = sArray;
        sArray2[0] = (short)n3;
        sArray2[1] = (short)n4;
        sArray[2] = (short)n5;
    }

    public FenceBarrierMeshRenderer(p50_0 p50_02) {
        super(p50_02);
        byte by = 0;
        while (true) {
            Ou0[] ou0Array = this.qo0;
            if (by >= this.qo0.length) break;
            FenceBarrierMeshRenderer gf_12 = this;
            ra0_0.Ao0().getClass();
            ou0Array[by] = ra0_0.y50();
            short[] sArray = U4[by];
            float f = ((float)sArray[0] + 0.5f) * 0.25f;
            float f2 = (float)sArray[2] * 0.25f;
            float f3 = ((float)sArray[1] + 0.5f) * 0.25f;
            gf_12.qo0[by].ho.m80(f, f2, f3);
            gf_12.yS(gf_12.qo0[by]);
            for (byte by2 = 0; by2 < 4; by2 = (byte)((byte)(by2 + 1))) {
                if (Ke0[by][by2] < 1) continue;
                short[] sArray2 = U4[by];
                int n = sArray2[0];
                int n2 = sArray2[1];
                switch (by2) {
                    default: {
                        break;
                    }
                    case 3: {
                        --n;
                        break;
                    }
                    case 2: {
                        ++n;
                        break;
                    }
                    case 1: {
                        ++n2;
                        break;
                    }
                    case 0: {
                        --n2;
                    }
                }
                p50_02.A40(n, n2).Mw(new j5_0((f.gf_1)(Object)this, by, by2));
            }
            by = (byte)(by + 1);
        }
        ra0_0.Ao0().getClass();
        this.Zr0 = ra0_0.M50(0);
    }

    static {
        short[][] sArrayArray = new short[10][];
        short[] sArray = new short[3];
        short[] sArray2 = sArray;
        sArray[0] = 15;
        sArray[1] = 28;
        sArray[2] = 0;
        sArrayArray[0] = sArray2;
        short[] sArray3 = new short[3];
        sArray2 = sArray3;
        sArray3[0] = 10;
        sArray3[1] = 19;
        sArray3[2] = 2;
        sArrayArray[1] = sArray2;
        short[] sArray4 = new short[3];
        sArray2 = sArray4;
        sArray4[0] = 20;
        sArray4[1] = 29;
        sArray4[2] = 4;
        sArrayArray[2] = sArray2;
        short[] sArray5 = new short[3];
        sArray2 = sArray5;
        sArray5[0] = 10;
        sArray5[1] = 25;
        sArray5[2] = 4;
        sArrayArray[3] = sArray2;
        short[] sArray6 = new short[3];
        sArray2 = sArray6;
        sArray6[0] = 15;
        sArray6[1] = 13;
        sArray6[2] = 4;
        sArrayArray[4] = sArray2;
        short[] sArray7 = new short[3];
        sArray2 = sArray7;
        sArray7[0] = 5;
        sArray7[1] = 8;
        sArray7[2] = 6;
        sArrayArray[5] = sArray2;
        short[] sArray8 = new short[3];
        sArray2 = sArray8;
        sArray8[0] = 7;
        sArray8[1] = 36;
        sArray8[2] = 6;
        sArrayArray[6] = sArray2;
        short[] sArray9 = new short[3];
        sArray2 = sArray9;
        sArray9[0] = 26;
        sArray9[1] = 34;
        sArray9[2] = 6;
        sArrayArray[7] = sArray2;
        short[] sArray10 = new short[3];
        sArray2 = sArray10;
        sArray10[0] = 24;
        sArray10[1] = 6;
        sArray10[2] = 6;
        sArrayArray[8] = sArray2;
        short[] sArray11 = new short[3];
        sArray2 = sArray11;
        sArray11[0] = 15;
        sArray11[1] = 3;
        sArray11[2] = 10;
        sArrayArray[9] = sArray2;
        U4 = sArrayArray;
        Ke0 = new byte[10][4];
        Ww = new short[10][4][3];
        FenceBarrierMeshRenderer.sX((byte)0, 0, 10, 15, 35, 0);
        FenceBarrierMeshRenderer.sX((byte)1, 0, 9, 15, 19, 2);
        FenceBarrierMeshRenderer.sX((byte)2, 1, 12, 3, 19, 4);
        FenceBarrierMeshRenderer.sX((byte)3, 1, 11, 21, 19, 2);
        FenceBarrierMeshRenderer.sX((byte)2, 2, 13, 10, 29, 4);
        FenceBarrierMeshRenderer.sX((byte)1, 3, 14, 10, 13, 4);
        FenceBarrierMeshRenderer.sX((byte)3, 3, 15, 20, 25, 4);
        FenceBarrierMeshRenderer.sX((byte)2, 4, 17, 5, 13, 4);
        FenceBarrierMeshRenderer.sX((byte)3, 4, 16, 25, 13, 4);
        FenceBarrierMeshRenderer.sX((byte)0, 5, 18, 5, 34, 6);
        FenceBarrierMeshRenderer.sX((byte)3, 6, 19, 26, 36, 6);
        FenceBarrierMeshRenderer.sX((byte)1, 7, 20, 26, 4, 6);
        FenceBarrierMeshRenderer.sX((byte)2, 8, 21, 15, 6, 10);
        FenceBarrierMeshRenderer.sX((byte)0, 9, 22, 15, 32, 0);
    }

    @Override
    public final void lpt1(float f) {
        FenceBarrierMeshRenderer gf_12 = this;
        super.lpt1(f);
        Object object = gf_12.m00;
        if (object != null) {
            int n = (int)((hk0_1.KG - this.Le) / 33L);
            if (n >= ((Gv0)object).ds) {
                this.m00 = null;
                this.af.run();
                return;
            }
            object = tw0_0.e60;
            if (object == null) {
                return;
            }
            float f2 = 0.25f;
            if (n >= 34) {
                ((yt_1)object).jB0.L8.Np0 = true;
            }
            FenceBarrierMeshRenderer gf_13 = this;
            gf_13.Zr0.ho.Y1(this.bM0);
            FenceBarrierMeshRenderer gf_14 = this;
            float f3 = gf_14.m00.Fx0(1, n) / 16.0f * f2;
            gf_13.Zr0.ho.el0(this.m00.Fx0(0, n) / 16.0f * 0.25f, f3, gf_14.m00.Fx0(2, n) / 16.0f * f2);
        }
    }

    @Override
    public final void dispose() {
        super.dispose();
        Object object = tw0_0.e60;
        if (object == null) {
            return;
        }
        object = ((yt_1)object).jB0;
        if (object != null) {
            EA0 eA0 = ((bi0_1)object).il0;
            object = null;
            boolean bl = false;
            eA0.getClass();
            C8 c8 = C8.Zero;
            eA0.f60((Ou0)object, bl, c8);
        }
    }
}

