package cn.pokemmo.graphics.gdx.texture;

import f.*;


import com.badlogic.gdx.graphics.Texture;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;

public class GdxAnimationFrameTrack extends Xr0 {
    public final int As0;
    public final int E6;
    public i4_0 rD;
    public ByteBuffer lA;
    public IntBuffer YP;
    public final V7 vI0;

    public GdxAnimationFrameTrack(V7 v7, int i2, int i3) {
        this.vI0 = v7;
        this.As0 = i2;
        this.E6 = i3;
        int i4 = 0;
        int i5 = v7.T1();
        while (i4 < i5) {
            if (i4 != i2 && i4 != i3) {
                v7.LT[i4].Kj(this);
            }
            i4++;
        }
    }

    @Override
    public final String Ck() {
        return "colorarea2d";
    }

    @Override
    public final void FW(zk0_1 zk0_12) {
        super.FW(zk0_12);
        if (this.qF0 != null) {
            this.vI0.PW.getClass();
            float f1 = this.vI0.PW.o6(this.As0);
            this.vI0.PW.getClass();
            float f2 = this.vI0.PW.o6(this.E6);
            int i1 = (int) ((this.vI0.Ou[this.As0] - f1) * (float) (a3() - 1) / (0.0f - f1) + 0.5f);
            int i2 = (int) ((this.vI0.Ou[this.E6] - f2) * (float) (k5() - 1) / (0.0f - f2) + 0.5f);
            this.qF0.uf(this.M, this.A20 + this.e80 + i1, this.SB0 + this.y9 + i2, 1, 1);
        }
    }

    @Override
    public final void hp(zk0_1 zk0_12) {
        Z30 z30 = ((qq_0) zk0_12.AK).Sk(64);
        this.M00 = z30;
        i4_0 i4_02 = z30.i6.OB.getTextureData().JX();
        this.rD = i4_02;
        ByteBuffer byteBuffer = i4_02.Rh0();
        this.lA = byteBuffer;
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
        this.YP = this.lA.asIntBuffer();
    }

    @Override
    public final void Th0() {
        float[] arrf = (float[]) this.vI0.Ou.clone();
        IntBuffer intBuffer = this.YP;
        kj0_0 kj0_02 = this.vI0.PW;
        float f1 = this.vI0.PW.o6(this.As0);
        float f2 = (0.0f - f1) / 63.0f;
        float f3 = this.vI0.PW.o6(this.E6);
        float f4 = (0.0f - f3) / 63.0f;
        int i = 0;
        int i2 = 0;
        while (i < 64) {
            arrf[this.E6] = f3;
            int j = 0;
            float f5 = f1;
            while (j < 64) {
                arrf[this.As0] = f5;
                intBuffer.put(i2++, (kj0_02.a80(arrf) << 8) | 255);
                f5 += f2;
                j++;
            }
            f3 += f4;
            i++;
        }
        Texture texture = this.M00.i6.OB;
        texture.load(texture.getTextureData());
        this.TQ = false;
    }

    @Override
    public final void N00(zk0_1 zk0_12) {
        this.M00.i6.OB.dispose();
        this.rD.dispose();
    }

    @Override
    public final void CoM2(int i1, int i2) {
        this.vI0.PW.getClass();
        float f3 = this.vI0.PW.o6(this.As0);
        this.vI0.PW.getClass();
        float f4 = this.vI0.PW.o6(this.E6);
        int i5 = a3();
        int i6 = k5();
        int clampedX = Math.max(0, Math.min(i5, i1));
        int clampedY = Math.max(0, Math.min(i6, i2));
        float f1 = (0.0f - f3) * (float) clampedX / (float) i5 + f3;
        float f2 = (0.0f - f4) * (float) clampedY / (float) i6 + f4;
        this.vI0.LT[this.As0].MK0(f1);
        this.vI0.LT[this.E6].MK0(f2);
    }
}
