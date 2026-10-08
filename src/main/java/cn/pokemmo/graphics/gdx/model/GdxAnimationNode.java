/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.graphics.gdx.model;

import f.*;


import com.badlogic.gdx.graphics.Color;
import f.C3;
import f.KC0;
import f.Kd0;
import f.LPT6_;
import f.X70;
import f.jt0_0;
import f.ql_0;
import f.ui_1;
import f.wx_1;

/*
 * Renamed from f.Qh
 */
public class GdxAnimationNode
extends Kd0 {
    public GdxAnimationNode(jt0_0 jt0_02) {
        super(jt0_02);
    }

    public GdxAnimationNode(jt0_0 jt0_02, C3 c3) {
        super(jt0_02, c3);
    }

    public GdxAnimationNode(jt0_0 jt0_02, float f) {
        super(jt0_02, f);
    }

    public GdxAnimationNode(jt0_0 jt0_02, float f, C3 c3) {
        super(jt0_02, f, c3);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void R30(X70 x70) {
        Color color;
        X70 x702 = x70;
        Color color2 = color = ((ui_1)this.Ft).oH;
        float f = color2.g;
        float f2 = color2.b;
        float f3 = Color.toFloatBits(color.r, f, f2, color.a * x70.GM);
        int n = x702.l30;
        int n2 = x702.QL;
        float f4 = this.n0;
        float f5 = (float)x702.vA0 * f4;
        f4 = (float)x702.auX * f4;
        float f6 = this.nJ.j80;
        f6 = x702.v2() * this.n0 - (x70.ep - 1.0f) * f6;
        if (x702.A30) {
            x70.t20();
        }
        GdxAnimationNode qh_02 = this;
        ql_0 ql_02 = this.nJ;
        float f7 = ql_02.Wm0;
        f7 = -x70.R00 * this.n0 - (x70.OH - 1.0f) * f7;
        int n3 = Math.max(0, (int)((ql_02.j80 - f6) / f5));
        ql_0 ql_03 = this.nJ;
        int n4 = Math.min(n, (int)((ql_03.j80 + ql_03.IA + f5 - f6) / f5));
        int n5 = Math.max(0, (int)((qh_02.nJ.Wm0 - f7) / f4));
        ql_0 ql_04 = qh_02.nJ;
        int n6 = Math.min(n2, (int)((ql_04.Wm0 + ql_04.Eu0 + f4 - f7) / f4));
        f7 = (float)n6 * f4 + f7;
        f6 = (float)n3 * f5 + f6;
        float[] fArray = this.G70;
        while (n6 >= n5) {
            float f8 = f6;
            for (int j = n3; j < n4; f8 += f5, ++j) {
                LPT6_ lPT6_;
                block9: {
                    float f9;
                    block10: {
                        wx_1 wx_12;
                        KC0 kC0 = j >= 0 && j < x70.l30 && n6 >= 0 && n6 < x70.QL ? x70.gm0[j][n6] : null;
                        if (kC0 == null || (wx_12 = kC0.Gy) == null) continue;
                        KC0 kC02 = kC0;
                        boolean bl = kC02.oi0;
                        int n7 = kC02.gY;
                        lPT6_ = wx_12.LT();
                        wx_1 wx_13 = wx_12;
                        f9 = wx_13.OS() * this.n0 + f8;
                        float f10 = this.n0;
                        float f11 = wx_13.Yl0() * f10 + f7;
                        float f12 = (float)lPT6_.bz * f10 + f9;
                        f10 = (float)lPT6_.xZ * f10 + f11;
                        float f13 = lPT6_.yQ;
                        float f14 = lPT6_.Ll0;
                        float f15 = lPT6_.Yo;
                        float f16 = lPT6_.Y60;
                        fArray[0] = f9;
                        fArray[1] = f11;
                        fArray[2] = f3;
                        fArray[3] = f13;
                        fArray[4] = f14;
                        fArray[5] = f9;
                        fArray[6] = f10;
                        fArray[7] = f3;
                        fArray[8] = f13;
                        fArray[9] = f16;
                        fArray[10] = f12;
                        fArray[11] = f10;
                        fArray[12] = f3;
                        fArray[13] = f15;
                        fArray[14] = f16;
                        fArray[15] = f12;
                        fArray[16] = f11;
                        fArray[17] = f3;
                        fArray[18] = f15;
                        fArray[19] = f14;
                        if (kC0.UH0) {
                            fArray[3] = f15;
                            fArray[13] = f13;
                            fArray[8] = f15;
                            fArray[18] = f13;
                        }
                        if (bl) {
                            fArray[4] = f16;
                            fArray[14] = f14;
                            fArray[9] = f14;
                            fArray[19] = f16;
                        }
                        if (n7 == 0) break block9;
                        if (n7 == 1) break block10;
                        if (n7 != 2) {
                            if (n7 == 3) {
                                float f17 = fArray[4];
                                fArray[4] = f9 = fArray[19];
                                fArray[19] = f9 = fArray[14];
                                fArray[14] = f9 = fArray[9];
                                fArray[9] = f17;
                                f17 = fArray[3];
                                fArray[3] = f9 = fArray[18];
                                fArray[18] = f9 = fArray[13];
                                fArray[13] = f9 = fArray[8];
                                fArray[8] = f17;
                            }
                            break block9;
                        } else {
                            float f18 = fArray[3];
                            fArray[3] = f9 = fArray[13];
                            fArray[13] = f18;
                            f18 = fArray[8];
                            fArray[8] = f9 = fArray[18];
                            fArray[18] = f18;
                            f18 = fArray[4];
                            fArray[4] = f9 = fArray[14];
                            fArray[14] = f18;
                            f18 = fArray[9];
                            fArray[9] = f9 = fArray[19];
                            fArray[19] = f18;
                        }
                        break block9;
                    }
                    float f19 = fArray[4];
                    fArray[4] = f9 = fArray[9];
                    fArray[9] = f9 = fArray[14];
                    fArray[14] = f9 = fArray[19];
                    fArray[19] = f19;
                    f19 = fArray[3];
                    fArray[3] = f9 = fArray[8];
                    fArray[8] = f9 = fArray[13];
                    fArray[13] = f9 = fArray[18];
                    fArray[18] = f19;
                }
                this.Ft.Il0(lPT6_.OB, fArray, 20);
            }
            f7 -= f4;
            --n6;
        }
        return;
    }
}

