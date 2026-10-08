package cn.pokemmo.graphics.mesh;

import com.badlogic.gdx.math.Matrix4;
import f.*;
import f.C8;
import f.Dt0;
import f.G6;
import f.N8;
import f.UF;
import f.VV;
import f.ac0_0;
import f.ai_0;
import f.es_0;
import f.es_1;
import f.fp0_0;
import f.fy0_0;
import f.hy_1;
import f.kj_0;
import f.kz_0;
import f.lg_0;
import f.lk0_2;
import f.lt_1;
import f.ly0_0;
import f.mb_1;
import f.nf_1;
import f.sa_0;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import java.util.HashMap;

/**
 * 现代化重构类 - 原始类: f.ap0_0
 */
public class GdxMesh implements fy0_0 {

    public static final HashMap d4 = new HashMap();
    public final kj_0 COM6;
    public final lk0_2 Sw0;
    public boolean uf;
    public final boolean a;
    public final C8 GU;

    public GdxMesh(kj_0 kj_02, lk0_2 lk0_22, boolean bl) {
        this.uf = true;
        this.GU = new C8();
        this.COM6 = kj_02;
        this.Sw0 = lk0_22;
        this.a = bl;
        GdxMesh.F10(lg_0.k, this);
    }

    public GdxMesh(boolean bl, int n, int n2, kz_0 ... kz_0Array) {
        this.uf = true;
        this.GU = new C8();
        this.COM6 = ap0_0.Cf0(bl, n, new sa_0(kz_0Array));
        this.Sw0 = new hy_1(bl, n2);
        this.a = false;
        GdxMesh.F10(lg_0.k, this);
    }

    public GdxMesh(boolean bl, int n, int n2, sa_0 sa_02) {
        this.uf = true;
        this.GU = new C8();
        this.COM6 = ap0_0.Cf0(bl, n, sa_02);
        this.Sw0 = new hy_1(bl, n2);
        this.a = false;
        GdxMesh.F10(lg_0.k, this);
    }

    public GdxMesh(boolean bl, boolean bl2, int n, int n2, sa_0 sa_02) {
        this.uf = true;
        this.GU = new C8();
        this.COM6 = ap0_0.Cf0(bl, n, sa_02);
        this.Sw0 = new hy_1(bl2, n2);
        this.a = false;
        GdxMesh.F10(lg_0.k, this);
    }

    public GdxMesh(VV vV, boolean bl, int n, int n2, kz_0 ... kz_0Array) {
        this(vV, bl, n, n2, new sa_0(kz_0Array));
    }

    public GdxMesh(VV vV, boolean bl, int n, int n2, sa_0 sa_02) {
        this.uf = true;
        this.GU = new C8();
        if (vV == VV.cG0) {
            this.COM6 = new ai_0(bl, n, sa_02);
            this.Sw0 = new hy_1(bl, n2);
            this.a = false;
        } else if (vV == VV.nJ0) {
            this.COM6 = new UF(bl, n, sa_02);
            this.Sw0 = new mb_1(bl, n2);
            this.a = false;
        } else if (vV == VV.at) {
            this.COM6 = new es_0(bl, n, sa_02);
            this.Sw0 = new mb_1(bl, n2);
            this.a = false;
        } else {
            this.COM6 = new N8(n, sa_02);
            this.Sw0 = new G6(n2);
            this.a = true;
        }
        GdxMesh.F10(lg_0.k, this);
    }

    public static kj_0 Cf0(boolean bl, int n, sa_0 sa_02) {
        if (lg_0.MA != null) {
            return new es_0(bl, n, sa_02);
        }
        return new ai_0(bl, n, sa_02);
    }

    public static void F10(Dt0 dt0, GdxMesh ap0_02) {
        HashMap hashMap = d4;
        es_1 es_12 = (es_1)hashMap.get(dt0);
        if (es_12 == null) {
            es_12 = new es_1();
        }
        es_12.Ue0(ap0_02);
        hashMap.put(dt0, es_12);
    }

    public final void zm(lt_1 var1_1, int var2_2, int var3_4, int var4_5, boolean var5_6) {
        if (var4_5 == 0) return;
        if (var5_6) {
            this.COM6.Fn0(var1_1, null);
            if (this.Sw0.Id() > 0) this.Sw0.bind();
        }
        if (this.a) {
            if (this.Sw0.Id() > 0) {
                ShortBuffer indices = this.Sw0.st0(false);
                int position = indices.position();
                indices.limit();
                indices.position(var3_4);
                lg_0.Sf0.glDrawElements(var2_2, var4_5, 5123, indices);
                indices.position(position);
            } else {
                lg_0.Sf0.glDrawArrays(var2_2, var3_4, var4_5);
            }
        } else if (this.Sw0.Id() > 0) {
            if (var4_5 + var3_4 <= this.Sw0.Kd()) {
                lg_0.Sf0.glDrawElements(var2_2, var4_5, 5123, var3_4 * 2);
            } else {
                throw new nf_1("Mesh attempting to access memory outside of the index buffer (count: "
                        + var4_5 + ", offset: " + var3_4 + ", max: " + this.Sw0.Kd() + ")");
            }
        } else {
            lg_0.Sf0.glDrawArrays(var2_2, var3_4, var4_5);
        }
        if (var5_6) {
            this.COM6.yK0(var1_1, null);
            if (this.Sw0.Id() > 0) this.Sw0.qe();
        }
    }

    @Override
    public final void dispose() {
        HashMap hashMap = d4;
        if (hashMap.get(lg_0.k) != null) {
            ((es_1)hashMap.get(lg_0.k)).sj0((Object) this, true);
        }
        GdxMesh ap0_02 = this;
        ap0_02.COM6.dispose();
        ap0_02.Sw0.dispose();
    }

    public final kz_0 UL(int n) {
        sa_0 sa_02 = this.COM6.JP();
        for (kz_0 kz_02 : sa_02.Os) {
            if (kz_02.tM != n) continue;
            return kz_02;
        }
        return null;
    }

    public final sa_0 zh0() {
        return this.COM6.JP();
    }

    public final ly0_0 Bn0(ly0_0 ly0_02, int n, int n2, Matrix4 matrix4) {
        int n3;
        int n4 = this.Sw0.Id();
        int n5 = this.COM6.mB0();
        if (n4 != 0) {
            n5 = n4;
        }
        if (n >= 0 && n2 >= 1 && (n3 = n + n2) <= n5) {
            FloatBuffer floatBuffer = this.COM6.st0(false);
            ShortBuffer shortBuffer = this.Sw0.st0(false);
            kz_0 kz_02 = this.UL(1);
            int n6 = kz_02.Kk0 / 4;
            int n7 = this.COM6.JP().u5 / 4;
            int n8 = kz_02.dG0;
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 == 3) {
                        if (n4 > 0) {
                            while (n < n3) {
                                n4 = (shortBuffer.get(n) & 0xFFFF) * n7 + n6;
                                C8 c8 = this.GU;
                                float f = floatBuffer.get(n4);
                                float f2 = floatBuffer.get(n4 + 1);
                                float f3 = floatBuffer.get(n4 + 2);
                                c8.x = f;
                                c8.y = f2;
                                c8.z = f3;
                                if (matrix4 != null) {
                                    this.GU.cu(matrix4);
                                }
                                ly0_02.Zi(this.GU);
                                ++n;
                            }
                        } else {
                            while (n < n3) {
                                n4 = n * n7 + n6;
                                C8 c8 = this.GU;
                                float f = floatBuffer.get(n4);
                                float f4 = floatBuffer.get(n4 + 1);
                                float f5 = floatBuffer.get(n4 + 2);
                                c8.x = f;
                                c8.y = f4;
                                c8.z = f5;
                                if (matrix4 != null) {
                                    this.GU.cu(matrix4);
                                }
                                ly0_02.Zi(this.GU);
                                ++n;
                            }
                        }
                    }
                } else if (n4 > 0) {
                    while (n < n3) {
                        n4 = (shortBuffer.get(n) & 0xFFFF) * n7 + n6;
                        C8 c8 = this.GU;
                        float f = floatBuffer.get(n4);
                        float f6 = floatBuffer.get(n4 + 1);
                        float f7 = f;
                        f = 0.0f;
                        c8.x = f7;
                        c8.y = f6;
                        c8.z = f;
                        if (matrix4 != null) {
                            this.GU.cu(matrix4);
                        }
                        ly0_02.Zi(this.GU);
                        ++n;
                    }
                } else {
                    while (n < n3) {
                        n4 = n * n7 + n6;
                        C8 c8 = this.GU;
                        float f = floatBuffer.get(n4);
                        float f8 = floatBuffer.get(n4 + 1);
                        float f9 = f;
                        f = 0.0f;
                        c8.x = f9;
                        c8.y = f8;
                        c8.z = f;
                        if (matrix4 != null) {
                            this.GU.cu(matrix4);
                        }
                        ly0_02.Zi(this.GU);
                        ++n;
                    }
                }
            } else if (n4 > 0) {
                while (n < n3) {
                    n4 = (shortBuffer.get(n) & 0xFFFF) * n7 + n6;
                    C8 c8 = this.GU;
                    float f = 0.0f;
                    float f10 = 0.0f;
                    c8.x = floatBuffer.get(n4);
                    c8.y = f;
                    c8.z = f10;
                    if (matrix4 != null) {
                        this.GU.cu(matrix4);
                    }
                    ly0_02.Zi(this.GU);
                    ++n;
                }
            } else {
                while (n < n3) {
                    n4 = n * n7 + n6;
                    C8 c8 = this.GU;
                    float f = 0.0f;
                    float f11 = 0.0f;
                    c8.x = floatBuffer.get(n4);
                    c8.y = f;
                    c8.z = f11;
                    if (matrix4 != null) {
                        this.GU.cu(matrix4);
                    }
                    ly0_02.Zi(this.GU);
                    ++n;
                }
            }
            return ly0_02;
        }
        throw new nf_1(fp0_0.uD(new StringBuilder("Invalid part specified ( offset=").append(n).append(", count=").append(n2).append(", max="), n5, " )"));
    }

    public final float[] gK(int n, float[] fArray) {
        int n2 = 0;
        int n3 = 0;
        int n4 = this.COM6.mB0() * this.COM6.JP().u5 / 4;
        if (n == -1) {
            n = n4 > fArray.length ? fArray.length : n4;
        }
        if (n > 0 && n <= n4 && fArray.length > 0) {
            if (fArray.length >= n) {
                boolean bl = false;
                FloatBuffer floatBuffer = this.COM6.st0(bl);
                int n5 = floatBuffer.position();
                ((Buffer)floatBuffer).position(n2);
                floatBuffer.get(fArray, n3, n);
                ((Buffer)floatBuffer).position(n5);
                return fArray;
            }
            throw new IllegalArgumentException("not enough room in vertices array, has " + fArray.length + " floats, needs " + n);
        }
        throw new IndexOutOfBoundsException();
    }

    public final void Mr(short[] sArray) {
        this.Sw0.Gy0(sArray.length, sArray);
    }

    public final void DH(int n, short[] sArray) {
        int n2 = 0;
        int n3 = 0;
        int n4 = this.Sw0.Id();
        if (n < 0) {
            n = n4;
        }
        if (n4 > 0 && n <= n4) {
            if (sArray.length >= n) {
                boolean bl = false;
                ShortBuffer shortBuffer = this.Sw0.st0(bl);
                int n5 = shortBuffer.position();
                ((Buffer)shortBuffer).position(n2);
                shortBuffer.get(sArray, n3, n);
                ((Buffer)shortBuffer).position(n5);
                return;
            }
            throw new IllegalArgumentException("not enough room in indices array, has " + sArray.length + " shorts, needs " + n);
        }
        throw new IllegalArgumentException(ac0_0.YH0("Invalid range specified, offset: 0, count: ", n, ", max: ", n4));
    }

    public final void xl0() {
        this.uf = false;
    }
}
