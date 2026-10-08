/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.graphics.animation.tween;

import f.*;

import com.badlogic.gdx.graphics.Color;
import f.BD;
import f.C8;
import f.LW;
import f.Rv0;
import f.com3__3;
import f.xt_0;

/*
 * Renamed from f.qH0
 */
public class WorldEntityTweenAccessor
implements BaseTweenAccessor, f.BD {
    public static final /* synthetic */ boolean II0;

    static {
        II0 = WorldEntityTweenAccessor.class.desiredAssertionStatus() ^ true;
    }

    @Override
    public final void wl(Object object, int n, float[] fArray) {
        Object object2 = (com3__3)object;
        switch (n) {
            default: {
                if (!II0) {
                    throw new AssertionError();
                }
                break;
            }
            case 13: {
                float f;
                ((com3__3)object2).XV = f = fArray[0];
                object2 = ((com3__3)object2).Kj;
                if (object2 == null) break;
                ((xt_0)object2).B0 = f;
                break;
            }
            case 12: {
                float f = ((com3__3)object2).j.y;
                float f2 = fArray[1];
                ((com3__3)object2).zf0(fArray[0], f, f2);
                break;
            }
            case 11: {
                object = ((com3__3)object2).Cf0;
                float f = (object != null ? ((Rv0)object).Vr : null).r;
                float f3 = (object != null ? ((Rv0)object).Vr : null).g;
                float f4 = (object != null ? ((Rv0)object).Vr : null).b;
                float f5 = fArray[0];
                ((com3__3)object2).nu(f, f3, f4, f5);
                break;
            }
            case 10: {
                float f = fArray[1];
                float f6 = fArray[2];
                float f7 = fArray[3];
                ((com3__3)object2).nu(fArray[0], f, f6, f7);
                break;
            }
            case 9: {
                float f = ((com3__3)object2).MI0().g;
                float f8 = ((com3__3)object2).MI0().b;
                float f9 = fArray[0];
                ((com3__3)object2).CQ.v50.set(((com3__3)object2).MI0().r, f, f8, f9);
                break;
            }
            case 8: {
                float f = fArray[1];
                float f10 = fArray[2];
                float f11 = fArray[3];
                ((com3__3)object2).CQ.v50.set(fArray[0], f, f10, f11);
                break;
            }
            case 7: {
                ((com3__3)object2).OF0(fArray[0] * ((com3__3)object2).im);
                break;
            }
            case 6: {
                float f = fArray[0] * ((com3__3)object2).im;
                ((com3__3)object2).Qw0(((com3__3)object2).oW.x, f);
                break;
            }
            case 5: {
                float f = ((com3__3)object2).oW.y;
                ((com3__3)object2).Qw0(fArray[0] * ((com3__3)object2).im, f);
                break;
            }
            case 4: {
                float f = fArray[1];
                float f12 = fArray[2];
                ((com3__3)object2).zf0(fArray[0], f, f12);
                break;
            }
            case 3: {
                ((com3__3)object2).j.z = fArray[0];
                break;
            }
            case 2: {
                ((com3__3)object2).j.y = fArray[0];
                break;
            }
            case 1: {
                ((com3__3)object2).j.x = fArray[0];
            }
        }
    }

    @Override
    public final int AJ(Object object, int n, float[] fArray) {
        int n2;
        Object object2 = (com3__3)object;
        switch (n) {
            default: {
                if (II0) {
                    n2 = 0;
                    break;
                }
                throw new AssertionError();
            }
            case 14: {
                float f;
                Object object3 = object2;
                fArray[0] = f = LW.r1(((com3__3)object3).oW.x * 100.0f, 0.0f, 1.0f);
                fArray[1] = f = LW.r1(((com3__3)object3).oW.y * 100.0f, 0.0f, 1.0f);
                fArray[2] = f = LW.r1(((com3__3)object3).oW.z * 100.0f, 0.0f, 1.0f);
                n2 = 2;
                break;
            }
            case 13: {
                float f;
                int n3 = 0;
                fArray[n3] = f = ((com3__3)object2).XV;
                n2 = 1;
                break;
            }
            case 12: {
                float f;
                C8 c8 = ((com3__3)object2).j;
                fArray[0] = f = c8.x;
                fArray[1] = f = c8.z;
                n2 = 2;
                break;
            }
            case 11: {
                float f;
                int n4 = 0;
                object = ((com3__3)object2).Cf0;
                fArray[n4] = f = (object != null ? ((Rv0)object).Vr : null).a;
                n2 = 1;
                break;
            }
            case 10: {
                float f;
                object2 = ((com3__3)object2).Cf0;
                Color color = object2 != null ? ((Rv0)object2).Vr : null;
                fArray[0] = f = color.r;
                fArray[1] = f = color.g;
                fArray[2] = f = color.b;
                fArray[3] = f = color.a;
                n2 = 4;
                break;
            }
            case 9: {
                float f;
                fArray[0] = f = ((com3__3)object2).MI0().a;
                n2 = 1;
                break;
            }
            case 8: {
                float f;
                Color color = ((com3__3)object2).MI0();
                fArray[0] = f = color.r;
                fArray[1] = f = color.g;
                fArray[2] = f = color.b;
                fArray[3] = f = color.a;
                n2 = 4;
                break;
            }
            case 7: {
                float f;
                Object object4 = object2;
                fArray[0] = f = LW.r1(((com3__3)object4).oW.x * 100.0f, 0.0f, 1.0f);
                fArray[1] = f = LW.r1(((com3__3)object4).oW.y * 100.0f, 0.0f, 1.0f);
                n2 = 2;
                break;
            }
            case 6: {
                float f;
                fArray[0] = f = LW.r1(((com3__3)object2).oW.y * 100.0f, 0.0f, 1.0f);
                n2 = 1;
                break;
            }
            case 5: {
                float f;
                fArray[0] = f = LW.r1(((com3__3)object2).oW.x * 100.0f, 0.0f, 1.0f);
                n2 = 1;
                break;
            }
            case 4: {
                float f;
                C8 c8 = ((com3__3)object2).j;
                fArray[0] = f = c8.x;
                fArray[1] = f = c8.y;
                fArray[2] = f = c8.z;
                n2 = 3;
                break;
            }
            case 3: {
                float f;
                fArray[0] = f = ((com3__3)object2).j.z;
                n2 = 1;
                break;
            }
            case 2: {
                float f;
                fArray[0] = f = ((com3__3)object2).j.y;
                n2 = 1;
                break;
            }
            case 1: {
                float f;
                fArray[0] = f = ((com3__3)object2).j.x;
                n2 = 1;
            }
        }
        return n2;
    }
}

