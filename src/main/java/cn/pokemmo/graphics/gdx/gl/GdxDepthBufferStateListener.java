package cn.pokemmo.graphics.gdx.gl;

import f.*;


import com.badlogic.gdx.math.Matrix4;
import java.util.ArrayList;

public class GdxDepthBufferStateListener implements g2_0 {
    public final int Jb0;
    public final float[] N;
    public final byte[] d70;
    public final boolean m50;
    public int nr0;
    public int Vk;
    public final Ou0 uF0;
    public boolean P8;
    public ArrayList<bi0_1> Xr0;
    public final gr_2 ME0;
    public final ik0_1 W0;
    public final C8 vV;

    public GdxDepthBufferStateListener(gr_2 gr_2, int i, float[] fArr, byte[] bArr, int i2, boolean z) {
        this(gr_2, ra0_0.bE0(i == 5), i, fArr, bArr, i2, z);
        ra0_0.Ao0().getClass();
    }

    public GdxDepthBufferStateListener(gr_2 gr_2, Ou0 ou0, int i, float[] fArr, byte[] bArr, int i2, boolean z) {
        this.P8 = true;
        this.Xr0 = null;
        this.vV = new C8();
        this.ME0 = gr_2;
        this.W0 = (gr_2 instanceof ik0_1) ? (ik0_1) gr_2 : null;
        this.Jb0 = i;
        this.N = fArr;
        this.d70 = bArr;
        this.nr0 = i2;
        this.Vk = i2;
        this.m50 = z;
        ou0.RD0();
        Matrix4 matrix4 = ou0.ho;
        float f = fArr[0] * 0.25F;
        float f2 = z ? 0.375F : 0.0F;
        float f3 = f + f2;
        float f4 = fArr[i2 + 2] * 0.25F;
        float f5 = fArr[1] * 0.25F;
        float f6 = z ? 0.375F : 0.0F;
        matrix4.m80(f3, f4, f5 + f6);
        ou0.PE0 = 1.0E8F;
        ou0.P30(lg_0.S4.Ce(), null);
        ou0.TU(i2, false);
        this.uF0 = ou0;
    }

    public final void w70() {
        int i = this.Vk;
        int i2 = this.nr0;
        if (i == i2) {
            return;
        }
        this.uF0.ho.V1(this.vV);
        this.vV.Fg0(4.0F);
        float[] fArr = this.N;
        int i3 = i2 + 2;
        float f = fArr[i3];
        if (f > fArr[i + 2]) {
            float f2 = this.vV.y + lg_0.S4.uL * 10.0F;
            this.vV.y = f2;
            if (f2 >= f) {
                this.vV.y = f;
            }
        } else {
            float f3 = this.vV.y - lg_0.S4.uL * 10.0F;
            this.vV.y = f3;
            if (f3 <= f) {
                this.vV.y = f;
            }
        }
        ik0_1 ik0_1 = this.W0;
        if (ik0_1 != null && ik0_1.P1 < 2.75F && this.Jb0 == 5 && this.vV.y < -36.8F) {
            if (this.W0.P1 == 0.0F) {
                Ou0 ou0 = this.W0.mD0;
                ou0.PE0 = 2.5F;
                ou0.sC0(0, false, null);
            }
            this.vV.y = -36.8F;
            this.W0.P1 += lg_0.S4.uL;
        }
        if (LW.LH0(this.vV.y, this.N[i3])) {
            if (this.P8) {
                Ou0 ou02 = this.uF0;
                ou02.PE0 = 1.0F;
                ou02.sC0(i2, false, null);
            }
            this.Vk = i2;
            ArrayList<bi0_1> arrayList = this.Xr0;
            if (arrayList != null) {
                for (bi0_1 bi0_1 : arrayList) {
                    bi0_1.il0.getClass();
                    bi0_1.il0.f60(null, false, C8.Zero);
                    bi0_1.ba0.JT = this.d70[i2];
                    bi0_1.ba0.pq = null;
                }
                this.Xr0 = null;
            }
            tw0_0.RE0.Hq0((byte) 2, (short) 1747);
        } else if (this.Xr0 == null) {
            ArrayList<bi0_1> arrayList2 = new ArrayList<>();
            float[] fArr2 = ik0_1.Ai[this.Jb0];
            int i4 = (int) (fArr2[0] - 1.0F);
            int i5 = (int) fArr2[1];
            int i6 = i4 + 4;
            int i7 = i5 + 2;
            byte b = ik0_1.sl[this.Jb0][i];
            for (Object obj : tw0_0.e60.pn0.values()) {
                bi0_1 bi0_12 = (bi0_1) obj;
                zv_2 zv_2 = bi0_12.ba0;
                short s = zv_2.Lq0;
                if (s >= i4 && s <= i6) {
                    short s2 = zv_2.B5;
                    if (s2 >= i5 && s2 <= i7 && zv_2.JT == b) {
                        arrayList2.add(bi0_12);
                    }
                }
            }
            yt_1 yt_1 = tw0_0.e60;
            if (yt_1 != null && yt_1.jB0 != null) {
                arrayList2.add(yt_1.jB0);
            }
            this.Xr0 = arrayList2;
            for (bi0_1 bi0_13 : arrayList2) {
                bi0_13.il0.getClass();
                bi0_13.il0.f60(this.uF0, true, C8.Zero);
            }
            tw0_0.rl.xm = this;
        }
        this.uF0.ho.Y1(this.vV.Fg0(0.25F));
        this.uF0.rF0();
    }

    public final void Fe0(int i) {
        this.nr0 = i;
        this.Vk = i;
        C8 c8 = this.vV;
        float[] fArr = this.N;
        c8.x = fArr[0];
        c8.y = fArr[i + 2];
        c8.z = fArr[1];
        c8.Fg0(0.25F);
        if (this.m50) {
            this.vV.x += 0.375F;
            this.vV.z += 0.375F;
        }
        if (this.P8) {
            Ou0 ou0 = this.uF0;
            ou0.PE0 = 1.0E8F;
            ou0.sC0(this.nr0, false, null);
        }
        this.uF0.ho.Y1(this.vV);
        ik0_1 ik0_1 = this.W0;
        if (ik0_1 != null && ik0_1.P1 < 1.0F && this.Jb0 == 5 && i == 1) {
            ik0_1.P1 = 10000.0F;
            Ou0 ou02 = ik0_1.mD0;
            ou02.PE0 = 1.0E8F;
            ou02.sC0(0, false, null);
        }
    }

    @Override
    public final boolean H2(boolean z, int i) {
        yt_1 yt_1 = tw0_0.e60;
        if (yt_1 != null && yt_1.N60() != null) {
            _else n60 = tw0_0.e60.N60();
            if (J4.p5(n60.Bm0, n60.case$) == this.ME0.gq0()) {
                return this.Vk != this.nr0;
            }
        }
        return false;
    }
}
