package cn.pokemmo.world.render.mesh;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import com.badlogic.gdx.math.Matrix4;

public class SpinTileMeshRenderer extends BaseMapMeshRenderer {
    public static final int[] Vk = new int[] {
        297, 297, 294, 294, 294, 294, 294, 294, 294, 294, 294, 294,
        296, 296, 296, 296, 296, 295, 295, 295, 296, 295, 296, 295
    };

    public static final byte[] Q6 = new byte[] {
        1, 0, 1, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 1, 1
    };

    public static final short[][][] HU = new short[][][] {
        {{7, 9, 0}, {7, 9, 3}}, // 0
        {{16, 9, 0}, {16, 9, 3}}, // 1
        {{25, 9, 0}, {25, 9, 1}}, // 2
        {{11, 13, 0}, {11, 13, 1}}, // 3
        {{15, 13, 0}, {15, 13, 1}}, // 4
        {{19, 13, 0}, {19, 13, 1}}, // 5
        {{24, 13, 0}, {24, 13, 1}}, // 6
        {{21, 22, 0}, {21, 22, 1}}, // 7
        {{25, 22, 0}, {25, 22, 1}}, // 8
        {{29, 22, 0}, {29, 22, 1}}, // 9
        {{5, 26, 1}, {5, 26, 2}}, // 10
        {{29, 9, 1}, {29, 9, 2}}, // 11
        {{11, 22, 1}, {18, 22, 1}}, // 12
        {{9, 26, 2}, {21, 26, 2}}, // 13
        {{7, 12, 2}, {22, 12, 2}}, // 14
        {{10, 4, 2}, {14, 4, 2}}, // 15
        {{19, 4, 2}, {22, 4, 2}}, // 16
        {{2, 19, 2}, {2, 22, 2}}, // 17
        {{26, 16, 2}, {26, 22, 2}}, // 18
        {{29, 16, 2}, {29, 22, 2}}, // 19
        {{19, 4, 3}, {26, 4, 3}}, // 20
        {{29, 7, 3}, {29, 23, 3}}, // 21
        {{5, 26, 3}, {26, 26, 3}}, // 22
        {{2, 12, 3}, {2, 23, 3}}, // 23
    };

    public final Dg0[] hk0;
    public final JY[] PK0;
    public final es_1 Com6;

    public SpinTileMeshRenderer(cb_0 v1) {
        super(v1);
        this.PK0 = new JY[24];
        this.Com6 = new es_1(8);
        this.hk0 = new Dg0[3];
        for (int i2 = 0; i2 < this.hk0.length; i2++) {
            v80_0.Cb0().getClass();
            Ou0 v3 = v80_0.VH(300 + i2);
            this.Com6.Ue0(v3.ug0());
            this.hk0[i2] = new Dg0(v3);
            int i3 = i2 + 1;
            this.hk0[i2].ho.m80(4.0f, (float) i3 * 2.5f, 4.0f);
            yS(this.hk0[i2]);
        }
        Ou0[] v2 = new Ou0[4];
        for (int i3 = 0; i3 < 4; i3++) {
            v80_0.Cb0().getClass();
            Ou0 v4 = v80_0.VH(294 + i3);
            v2[i3] = v4;
            this.Com6.Ue0(v4.hW);
            this.Com6.Ue0(v2[i3].ug0());
        }
        for (int i3 = 0; i3 < 24; i3++) {
            short[][] v4 = HU[i3];
            byte i5 = Q6[i3];
            Ou0 v6 = v2[Vk[i3] - 294];
            JY v7 = new JY((f.sh_1)(Object)this, v6, i5, v4);
            w8_0 v5 = new w8_0(v7);
            int i6 = v4.length;
            for (int i8 = 0; i8 < i6; i8++) {
                short[] sArr = v4[i8];
                v1.Fn(sArr[0], sArr[1], sArr[2]).Mw(v5);
            }
            v7.Xm0();
            this.PK0[i3] = v7;
            yS(v7);
        }
        v80_0.Cb0().getClass();
        Ou0 o1 = v80_0.VH(487);
        o1.ho.m80(2.875f, 0.0f, 6.375f);
        o1.Ni(SpinTileMeshRenderer::Du);
        o1.TU(0, true);
        yS(o1);

        v80_0.Cb0().getClass();
        Ou0 o2 = v80_0.VH(486);
        o2.ho.m80(4.125f, 7.5f, 1.875f);
        o2.Ni(SpinTileMeshRenderer::Wv);
        o2.TU(0, true);
        yS(o2);
    }

    public static boolean Wv() {
        BR v0 = tw0_0.rl;
        if (v0 != null) {
            return v0.yh0.Ny((byte) 3, (short) 1366);
        }
        return false;
    }

    public static boolean Du() {
        BR v0 = tw0_0.rl;
        if (v0 != null) {
            return v0.yh0.Ny((byte) 3, (short) 1366);
        }
        return false;
    }

    @Override
    public final void dispose() {
        I2 v1 = this.Com6.ZD();
        while (v1.hasNext()) {
            ((fy0_0) v1.next()).dispose();
        }
        super.dispose();
    }

    @Override
    public final void lpt1(float f1) {
        super.lpt1(f1);
        float waterY = tw0_0.e60.jB0.L8.ze0.y + 2.25f;
        for (int i = 0; i < this.hk0.length; i++) {
            this.hk0[i].ex0 = waterY;
        }
        for (int i = 0; i < this.PK0.length; i++) {
            this.PK0[i].bo0(waterY);
        }
    }

    @Override
    public final void sn0(short[] v1) {
        if (v1.length < 1) {
            return;
        }
        if (v1[0] != 4467) {
            return;
        }
        short i1 = v1[1];
        short i2 = v1[2];
        yt_1 yt = tw0_0.e60;
        if (yt == null) {
            return;
        }
        E90 e90 = yt.jB0;
        if (e90 == null) {
            return;
        }
        JY jy = this.PK0[i1];
        byte b = (byte) i2;
        if (jy.ir != null) {
            return;
        }
        if (jy.ad0 == b) {
            return;
        }
        jy.ir = e90;
        jy.ad0 = b;
        short[] sArr = jy.Xx0[b];
        jy.lO.x = (float) sArr[0] * 0.25f + 0.125f;
        jy.lO.y = (float) sArr[2] * 2.5f;
        jy.lO.z = (float) sArr[1] * 0.25f + 0.125f;
        e90.il0.getClass();
        e90.il0.f60(jy, false, C8.Zero);
        tw0_0.rl.xm = new lf_2(jy, e90);
    }
}
