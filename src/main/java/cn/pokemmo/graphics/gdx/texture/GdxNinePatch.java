package cn.pokemmo.graphics.gdx.texture;

import f.*;


import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;

public class GdxNinePatch {
    public static final Color MM;
    public Texture Hy0;
    public int xD;
    public int nz0;
    public int zy0;
    public int LPT6;
    public int z20;
    public int Nr;
    public int GG;
    public int vg0;
    public int tI0;
    public float V4;
    public float oa;
    public float pa;
    public float z0;
    public float jn;
    public float J1;
    public float[] oB;
    public int hn;
    public final Color fa0;
    public float VA0;
    public float yy0;
    public float Mh0;
    public float q5;

    public GdxNinePatch(Texture v1, int i2, int i3, int i4, int i5) {
        this(new LPT6_(v1), i2, i3, i4, i5);
    }

    public GdxNinePatch(LPT6_ v1, int i2, int i3, int i4, int i5) {
        this.oB = new float[180];
        this.fa0 = new Color(Color.WHITE);
        this.VA0 = -1.0f;
        this.yy0 = -1.0f;
        this.Mh0 = -1.0f;
        this.q5 = -1.0f;
        if (v1 == null) {
            throw new IllegalArgumentException("region cannot be null.");
        }
        int i6 = v1.R90() - i2 - i3;
        int i7 = v1.dV() - i4 - i5;
        LPT6_[] patches = new LPT6_[9];
        if (i4 > 0) {
            if (i2 > 0) {
                patches[0] = new LPT6_(v1, 0, 0, i2, i4);
            }
            if (i6 > 0) {
                patches[1] = new LPT6_(v1, i2, 0, i6, i4);
            }
            if (i3 > 0) {
                patches[2] = new LPT6_(v1, i2 + i6, 0, i3, i4);
            }
        }
        if (i7 > 0) {
            if (i2 > 0) {
                patches[3] = new LPT6_(v1, 0, i4, i2, i7);
            }
            if (i6 > 0) {
                patches[4] = new LPT6_(v1, i2, i4, i6, i7);
            }
            if (i3 > 0) {
                patches[5] = new LPT6_(v1, i2 + i6, i4, i3, i7);
            }
        }
        if (i5 > 0) {
            int i10 = i4 + i7;
            if (i2 > 0) {
                patches[6] = new LPT6_(v1, 0, i10, i2, i5);
            }
            if (i6 > 0) {
                patches[7] = new LPT6_(v1, i2, i10, i6, i5);
            }
            if (i3 > 0) {
                patches[8] = new LPT6_(v1, i2 + i6, i10, i3, i5);
            }
        }
        if (i2 == 0 && i6 == 0) {
            patches[1] = patches[2];
            patches[4] = patches[5];
            patches[7] = patches[8];
            patches[2] = null;
            patches[5] = null;
            patches[8] = null;
        }
        if (i4 == 0 && i7 == 0) {
            patches[3] = patches[6];
            patches[4] = patches[7];
            patches[5] = patches[8];
            patches[6] = null;
            patches[7] = null;
            patches[8] = null;
        }
        Kh(patches);
    }

    public GdxNinePatch(Texture v1, Color v2) {
        this(v1);
        Ew(v2);
    }

    public GdxNinePatch(Texture v1) {
        this(new LPT6_(v1));
    }

    public GdxNinePatch(LPT6_ v1, Color v2) {
        this(v1);
        Ew(v2);
    }

    public GdxNinePatch(LPT6_ v1) {
        this.oB = new float[180];
        this.fa0 = new Color(Color.WHITE);
        this.VA0 = -1.0f;
        this.yy0 = -1.0f;
        this.Mh0 = -1.0f;
        this.q5 = -1.0f;
        LPT6_[] patches = new LPT6_[9];
        patches[4] = v1;
        Kh(patches);
    }

    public GdxNinePatch(LPT6_... v1) {
        this.oB = new float[180];
        this.fa0 = new Color(Color.WHITE);
        this.VA0 = -1.0f;
        this.yy0 = -1.0f;
        this.Mh0 = -1.0f;
        this.q5 = -1.0f;
        if (v1 == null || v1.length != 9) {
            throw new IllegalArgumentException("NinePatch needs nine TextureRegions");
        }
        Kh(v1);
        if ((v1[0] != null && v1[0].R90() != this.V4)
                || (v1[3] != null && v1[3].R90() != this.V4)
                || (v1[6] != null && v1[6].R90() != this.V4)) {
            throw new nf_1("Left side patches must have the same width");
        }
        if ((v1[2] != null && v1[2].R90() != this.oa)
                || (v1[5] != null && v1[5].R90() != this.oa)
                || (v1[8] != null && v1[8].R90() != this.oa)) {
            throw new nf_1("Right side patches must have the same width");
        }
        if ((v1[6] != null && v1[6].dV() != this.J1)
                || (v1[7] != null && v1[7].dV() != this.J1)
                || (v1[8] != null && v1[8].dV() != this.J1)) {
            throw new nf_1("Bottom side patches must have the same height");
        }
        if ((v1[0] != null && v1[0].dV() != this.jn)
                || (v1[1] != null && v1[1].dV() != this.jn)
                || (v1[2] != null && v1[2].dV() != this.jn)) {
            throw new nf_1("Top side patches must have the same height");
        }
    }

    public GdxNinePatch(pb_1 v1) {
        this(v1, v1.fa0);
    }

    public GdxNinePatch(pb_1 v1, Color v2) {
        this.oB = new float[180];
        Color color = new Color(Color.WHITE);
        this.fa0 = color;
        this.VA0 = -1.0f;
        this.yy0 = -1.0f;
        this.Mh0 = -1.0f;
        this.q5 = -1.0f;
        this.Hy0 = v1.Hy0;
        this.xD = v1.xD;
        this.nz0 = v1.nz0;
        this.zy0 = v1.zy0;
        this.LPT6 = v1.LPT6;
        this.z20 = v1.z20;
        this.Nr = v1.Nr;
        this.GG = v1.GG;
        this.vg0 = v1.vg0;
        this.tI0 = v1.tI0;
        this.V4 = v1.V4;
        this.oa = v1.oa;
        this.pa = v1.pa;
        this.z0 = v1.z0;
        this.jn = v1.jn;
        this.J1 = v1.J1;
        this.VA0 = v1.VA0;
        this.Mh0 = v1.Mh0;
        this.q5 = v1.q5;
        this.yy0 = v1.yy0;
        float[] buf = new float[v1.oB.length];
        this.oB = buf;
        System.arraycopy(v1.oB, 0, buf, 0, v1.oB.length);
        this.hn = v1.hn;
        color.set(v2);
    }

    public final void Kh(LPT6_[] v1) {
        if (v1[6] != null) {
            this.xD = yX(v1[6], false, false);
            this.V4 = v1[6].bz;
            this.J1 = v1[6].xZ;
        } else {
            this.xD = -1;
        }
        if (v1[7] != null) {
            boolean edgeX = (v1[6] != null || v1[8] != null);
            this.nz0 = yX(v1[7], edgeX, false);
            this.pa = Math.max(this.pa, (float) v1[7].bz);
            this.J1 = Math.max(this.J1, (float) v1[7].xZ);
        } else {
            this.nz0 = -1;
        }
        if (v1[8] != null) {
            this.zy0 = yX(v1[8], false, false);
            this.oa = Math.max(this.oa, (float) v1[8].bz);
            this.J1 = Math.max(this.J1, (float) v1[8].xZ);
        } else {
            this.zy0 = -1;
        }
        if (v1[3] != null) {
            boolean edgeY = (v1[0] != null || v1[6] != null);
            this.LPT6 = yX(v1[3], false, edgeY);
            this.V4 = Math.max(this.V4, (float) v1[3].bz);
            this.z0 = Math.max(this.z0, (float) v1[3].xZ);
        } else {
            this.LPT6 = -1;
        }
        if (v1[4] != null) {
            boolean edgeX = (v1[3] != null || v1[5] != null);
            boolean edgeY = (v1[1] != null || v1[7] != null);
            this.z20 = yX(v1[4], edgeX, edgeY);
            this.pa = Math.max(this.pa, (float) v1[4].bz);
            this.z0 = Math.max(this.z0, (float) v1[4].xZ);
        } else {
            this.z20 = -1;
        }
        if (v1[5] != null) {
            boolean edgeY = (v1[2] != null || v1[8] != null);
            this.Nr = yX(v1[5], false, edgeY);
            this.oa = Math.max(this.oa, (float) v1[5].bz);
            this.z0 = Math.max(this.z0, (float) v1[5].xZ);
        } else {
            this.Nr = -1;
        }
        if (v1[0] != null) {
            this.GG = yX(v1[0], false, false);
            this.V4 = Math.max(this.V4, (float) v1[0].bz);
            this.jn = Math.max(this.jn, (float) v1[0].xZ);
        } else {
            this.GG = -1;
        }
        if (v1[1] != null) {
            boolean edgeX = (v1[0] != null || v1[2] != null);
            this.vg0 = yX(v1[1], edgeX, false);
            this.pa = Math.max(this.pa, (float) v1[1].bz);
            this.jn = Math.max(this.jn, (float) v1[1].xZ);
        } else {
            this.vg0 = -1;
        }
        if (v1[2] != null) {
            this.tI0 = yX(v1[2], false, false);
            this.oa = Math.max(this.oa, (float) v1[2].bz);
            this.jn = Math.max(this.jn, (float) v1[2].xZ);
        } else {
            this.tI0 = -1;
        }
        if (this.hn < this.oB.length) {
            float[] trimmed = new float[this.hn];
            System.arraycopy(this.oB, 0, trimmed, 0, this.hn);
            this.oB = trimmed;
        }
    }

    public final int yX(LPT6_ v1, boolean edgeX, boolean edgeY) {
        if (this.Hy0 == null) {
            this.Hy0 = v1.OB;
        } else if (this.Hy0 != v1.OB) {
            throw new IllegalArgumentException("All regions must be from the same texture.");
        }
        float u = v1.yQ;
        float v = v1.Ll0;
        float u2 = v1.Yo;
        float v2 = v1.Y60;
        if (this.Hy0.getMagFilter() == eb0_1.jc0 || this.Hy0.getMinFilter() == eb0_1.jc0) {
            if (edgeX) {
                float halfTexel = 0.5f / this.Hy0.getWidth();
                u += halfTexel;
                u2 -= halfTexel;
            }
            if (edgeY) {
                float halfTexel = 0.5f / this.Hy0.getHeight();
                v -= halfTexel;
                v2 += halfTexel;
            }
        }
        float[] vertices = this.oB;
        int idx = this.hn;
        vertices[idx + 3] = u;
        vertices[idx + 4] = v;
        vertices[idx + 8] = u;
        vertices[idx + 9] = v2;
        vertices[idx + 13] = u2;
        vertices[idx + 14] = v2;
        vertices[idx + 18] = u2;
        vertices[idx + 19] = v;
        this.hn = idx + 20;
        return idx;
    }

    public final void Ew(Color v1) {
        this.fa0.set(v1);
    }

    public final void Rt(float f1, float f2) {
        this.V4 *= f1;
        this.oa *= f1;
        this.jn *= f2;
        this.J1 *= f2;
        this.pa *= f1;
        this.z0 *= f2;
        if (this.VA0 != -1.0f) {
            this.VA0 *= f1;
        }
        if (this.yy0 != -1.0f) {
            this.yy0 *= f1;
        }
        if (this.Mh0 != -1.0f) {
            this.Mh0 *= f2;
        }
        if (this.q5 != -1.0f) {
            this.q5 *= f2;
        }
    }

    public final void Qi(float f1, float f2, float f3, float f4, float f5, int i6) {
        float fx2 = f1 + f3;
        float fy2 = f2 + f4;
        float[] vertices = this.oB;
        vertices[i6] = f1;
        vertices[i6 + 1] = f2;
        vertices[i6 + 2] = f5;
        vertices[i6 + 5] = f1;
        vertices[i6 + 6] = fy2;
        vertices[i6 + 7] = f5;
        vertices[i6 + 10] = fx2;
        vertices[i6 + 11] = fy2;
        vertices[i6 + 12] = f5;
        vertices[i6 + 15] = fx2;
        vertices[i6 + 16] = f2;
        vertices[i6 + 17] = f5;
    }

    public final void P8(ui_1 v1, float f2, float f3, float f4, float f5) {
        float centerW = f4 - this.oa - this.V4;
        float centerH = f5 - this.jn - this.J1;
        float centerX = f2 + this.V4;
        float centerY = f3 + this.J1;
        float rightX = f2 + f4 - this.oa;
        float topY = f3 + f5 - this.jn;

        float colorBits = MM.set(this.fa0).mul(v1.oH).toFloatBits();

        if (this.xD != -1) {
            Qi(f2, f3, this.V4, this.J1, colorBits, this.xD);
        }
        if (this.nz0 != -1) {
            Qi(centerX, f3, centerW, this.J1, colorBits, this.nz0);
        }
        if (this.zy0 != -1) {
            Qi(rightX, f3, this.oa, this.J1, colorBits, this.zy0);
        }
        if (this.LPT6 != -1) {
            Qi(f2, centerY, this.V4, centerH, colorBits, this.LPT6);
        }
        if (this.z20 != -1) {
            Qi(centerX, centerY, centerW, centerH, colorBits, this.z20);
        }
        if (this.Nr != -1) {
            Qi(rightX, centerY, this.oa, centerH, colorBits, this.Nr);
        }
        if (this.GG != -1) {
            Qi(f2, topY, this.V4, this.jn, colorBits, this.GG);
        }
        if (this.vg0 != -1) {
            Qi(centerX, topY, centerW, this.jn, colorBits, this.vg0);
        }
        if (this.tI0 != -1) {
            Qi(rightX, topY, this.oa, this.jn, colorBits, this.tI0);
        }
    }

    static {
        MM = new Color();
    }
}
