/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.graphics.animation.tween;

import f.*;

import com.badlogic.gdx.graphics.Color;
import f.BD;
import f.BM;
import f.Rv0;
import f.na0_0;
import f.wh_0;

/*
 * Renamed from f.bQ
 */
public class SoundVolumeTweenAccessor
implements BaseTweenAccessor, f.BD {
    public static final /* synthetic */ boolean en;

    static {
        en = SoundVolumeTweenAccessor.class.desiredAssertionStatus() ^ true;
    }

    @Override
    public final void wl(Object object, int n, float[] fArray) {
        Object object2 = (BM)object;
        switch (n) {
            default: {
                if (!en) {
                    throw new AssertionError();
                }
                break;
            }
            case 13: {
                na0_0 na0_02;
                long l = na0_0.UG;
                if (!((wh_0)object2).tM(l)) {
                    Object object3 = object2;
                    object2 = Color.CLEAR;
                    float f = 0.0f;
                    na0_02 = new na0_0((long)l, (Color)object2, (float)f);
                    na0_02.nF0 = 0.8f;
                    ((wh_0)object3).LPT8(na0_02);
                } else {
                    na0_02 = (na0_0)((wh_0)object2).sg(l);
                }
                na0_02.aD = fArray[0];
                break;
            }
            case 12: {
                na0_0 na0_04;
                long l = na0_0.UG;
                if (!((wh_0)object2).tM(l)) {
                    Object object4 = object2;
                    object2 = Color.CLEAR;
                    float f = 0.0f;
                    na0_04 = new na0_0((long)l, (Color)object2, (float)f);
                    na0_04.nF0 = 0.8f;
                    ((wh_0)object4).LPT8(na0_04);
                } else {
                    na0_04 = (na0_0)((wh_0)object2).sg(l);
                }
                na0_04.nF0 = fArray[0];
                break;
            }
            case 11: {
                na0_0 na0_06;
                long l = na0_0.UG;
                if (!((wh_0)object2).tM(l)) {
                    Object object5 = object2;
                    object2 = Color.CLEAR;
                    float f = 1.0f;
                    na0_06 = new na0_0((long)l, (Color)object2, (float)f);
                    na0_06.nF0 = 0.8f;
                    ((wh_0)object5).LPT8(na0_06);
                } else {
                    na0_06 = (na0_0)((wh_0)object2).sg(l);
                }
                float f = fArray[0];
                float f2 = fArray[1];
                float f3 = fArray[2];
                float f4 = fArray[3];
                na0_06.CD0.set(f, f2, f3, f4);
                break;
            }
            case 10: {
                long l = Rv0.XT;
                if (!((wh_0)object2).tM(l)) {
                    Color color = Color.CLEAR;
                    Rv0 rv02 = new Rv0(l, color);
                    ((wh_0)object2).LPT8(rv02);
                }
                float f = fArray[0];
                float f5 = fArray[1];
                float f6 = fArray[2];
                float f7 = fArray[3];
                ((Rv0)((wh_0)object2).sg((long)l)).Vr.set(f, f5, f6, f7);
            }
        }
    }

    @Override
    public final int AJ(Object object, int n, float[] fArray) {
        int n2;
        BM bM = (BM)object;
        switch (n) {
            default: {
                if (en) {
                    n2 = 0;
                    break;
                }
                throw new AssertionError();
            }
            case 13: {
                float f = 0.0f;
                long l = na0_0.UG;
                if (bM.tM(l)) {
                    f = ((na0_0)bM.sg((long)l)).aD;
                }
                fArray[0] = f;
                n2 = 1;
                break;
            }
            case 12: {
                float f = 1.0f;
                long l = na0_0.UG;
                if (bM.tM(l)) {
                    f = ((na0_0)bM.sg((long)l)).nF0;
                }
                fArray[0] = f;
                n2 = 1;
                break;
            }
            case 11: {
                object = Color.CLEAR;
                long l = na0_0.UG;
                if (bM.tM(l)) {
                    object = ((na0_0)bM.sg((long)l)).CD0;
                }
                fArray[0] = ((Color)object).r;
                fArray[1] = ((Color)object).g;
                fArray[2] = ((Color)object).b;
                fArray[3] = ((Color)object).a;
                n2 = 4;
                break;
            }
            case 10: {
                object = Color.CLEAR;
                long l = Rv0.XT;
                if (bM.tM(l)) {
                    object = ((Rv0)bM.sg((long)l)).Vr;
                }
                fArray[0] = ((Color)object).r;
                fArray[1] = ((Color)object).g;
                fArray[2] = ((Color)object).b;
                fArray[3] = ((Color)object).a;
                n2 = 4;
            }
        }
        return n2;
    }
}
