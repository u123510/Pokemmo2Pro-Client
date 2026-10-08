package cn.pokemmo.graphics.gdx.texture;

import f.*;


import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.math.Matrix4;

public class GdxTextureAtlasReader {
    public int cy;
    public int up;
    public final int SK0;
    public int hU;
    public final ap0_0 wv0;
    public final lt_1 HQ;
    public boolean CoM7;
    public final int Il;
    public final int g8;
    public final int ki;
    public final Matrix4 Cv;
    public final float[] XL0;
    public final String[] f50;

    public GdxTextureAtlasReader(boolean z, boolean z2, int i) {
        this(5000, z, z2, i, K20(i, z, z2));
        this.CoM7 = true;
    }

    public GdxTextureAtlasReader(int i, boolean z, boolean z2, int i2) {
        this(i, z, z2, i2, K20(i2, z, z2));
        this.CoM7 = true;
    }

    public GdxTextureAtlasReader(int i, boolean z, boolean z2, int i2, lt_1 lt_1) {
        this.Cv = new Matrix4();
        this.SK0 = i;
        this.Il = i2;
        this.HQ = lt_1;
        kz_0[] kz_0Arr = bj0(i2, z, z2);
        this.wv0 = new ap0_0(false, i, 0, kz_0Arr);
        int vertexSize = this.wv0.zh0().u5 / 4;
        this.XL0 = new float[vertexSize * i];
        this.g8 = vertexSize;
        if (this.wv0.UL(8) != null) {
            int unused = this.wv0.UL(8).Kk0 / 4;
        }
        int kiVal = 0;
        if (this.wv0.UL(4) != null) {
            kiVal = this.wv0.UL(4).Kk0 / 4;
        }
        this.ki = kiVal;
        if (this.wv0.UL(16) != null) {
            int unused2 = this.wv0.UL(16).Kk0 / 4;
        }
        this.f50 = new String[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            this.f50[i3] = yr_1.pG("u_sampler", i3);
        }
    }

    public static lt_1 K20(int i, boolean z, boolean z2) {
        StringBuilder sb = new StringBuilder("attribute vec4 a_position;\n");
        sb.append(z ? "attribute vec3 a_normal;\n" : "");
        sb.append(z2 ? "attribute vec4 a_color;\n" : "");
        String vert = sb.toString();
        for (int i2 = 0; i2 < i; i2++) {
            vert = vert + "attribute vec2 a_texCoord" + i2 + ";\n";
        }
        StringBuilder sb2 = AN.nK0(vert, "uniform mat4 u_projModelView;\n");
        sb2.append(z2 ? "varying vec4 v_col;\n" : "");
        String vert2 = sb2.toString();
        for (int i3 = 0; i3 < i; i3++) {
            vert2 = vert2 + "varying vec2 v_tex" + i3 + ";\n";
        }
        String vert3 = QA0.W0(vert2, "void main() {\n   gl_Position = u_projModelView * a_position;\n");
        if (z2) {
            vert3 = QA0.W0(vert3, "   v_col = a_color;\n   v_col.a *= 255.0 / 254.0;\n");
        }
        for (int i4 = 0; i4 < i; i4++) {
            vert3 = vert3 + "   v_tex" + i4 + " = a_texCoord" + i4 + ";\n";
        }
        String vertexShader = QA0.W0(vert3, "   gl_PointSize = 1.0;\n}\n");

        String fragHeader = z2 ? "#ifdef GL_ES\nprecision mediump float;\n#endif\nvarying vec4 v_col;\n" : "#ifdef GL_ES\nprecision mediump float;\n#endif\n";
        for (int i5 = 0; i5 < i; i5++) {
            fragHeader = fragHeader + "varying vec2 v_tex" + i5 + ";\n" + "uniform sampler2D u_sampler" + i5 + ";\n";
        }
        StringBuilder sbFrag = AN.nK0(fragHeader, "void main() {\n   gl_FragColor = ");
        sbFrag.append(z2 ? "v_col" : "vec4(1, 1, 1, 1)");
        String frag = sbFrag.toString();
        if (i > 0) {
            frag = QA0.W0(frag, " * ");
        }
        for (int i6 = 0; i6 < i; i6++) {
            if (i6 == i - 1) {
                frag = frag + " texture2D(u_sampler" + i6 + ",  v_tex" + i6 + ")";
            } else {
                frag = frag + " texture2D(u_sampler" + i6 + ",  v_tex" + i6 + ") *";
            }
        }
        String fragmentShader = QA0.W0(frag, ";\n}");
        lt_1 lt_1 = new lt_1(vertexShader, fragmentShader);
        if (lt_1.U00) {
            return lt_1;
        }
        throw new nf_1("Error compiling shader: " + lt_1.aX());
    }

    public static kz_0[] bj0(int i, boolean z, boolean z2) {
        es_1 es_1 = new es_1();
        es_1.Ue0(new kz_0(1, 3, "a_position"));
        if (z) {
            es_1.Ue0(new kz_0(8, 3, "a_normal"));
        }
        if (z2) {
            es_1.Ue0(new kz_0(4, 4, "a_color"));
        }
        for (int i2 = 0; i2 < i; i2++) {
            es_1.Ue0(new kz_0(16, 2, yr_1.pG("a_texCoord", i2)));
        }
        kz_0[] result = new kz_0[es_1.KB];
        for (int i3 = 0; i3 < es_1.KB; i3++) {
            result[i3] = (kz_0) es_1.get(i3);
        }
        return result;
    }

    public final void eS(float f, float f2, float f3, float f4) {
        int idx = this.up + this.ki;
        this.XL0[idx] = Color.toFloatBits(f, f2, f3, f4);
    }

    public final void mC(float f) {
        this.XL0[this.up + this.ki] = f;
    }

    public final void cn(float f, float f2) {
        int i = this.up;
        float[] fArr = this.XL0;
        fArr[i] = f;
        fArr[i + 1] = f2;
        fArr[i + 2] = 0.0F;
        this.up = i + this.g8;
        this.hU++;
    }
}
