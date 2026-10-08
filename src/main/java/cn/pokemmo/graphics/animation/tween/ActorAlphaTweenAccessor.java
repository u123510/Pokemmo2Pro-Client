/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.graphics.animation.tween;

import f.*;

import f.BD;
import f.le0_2;

/*
 * Renamed from f.Yv
 */
public class ActorAlphaTweenAccessor
implements BaseTweenAccessor, f.BD {
    public static final /* synthetic */ boolean j9;

    static {
        j9 = ActorAlphaTweenAccessor.class.desiredAssertionStatus() ^ true;
    }

    @Override
    public final void wl(Object object, int n, float[] fArray) {
        le0_2 le0_22 = (le0_2)object;
        switch (n) {
            default: {
                if (!j9) {
                    throw new AssertionError();
                }
                break;
            }
            case 6: {
                le0_2 le0_23 = le0_22;
                int n2 = (int)fArray[0];
                le0_23.iv(n2, (int)fArray[1]);
                le0_23.lt0();
                break;
            }
            case 5: {
                int n3 = le0_22.Mx;
                le0_22.oY(n3, (int)fArray[0]);
                break;
            }
            case 4: {
                le0_2 le0_24 = le0_22;
                int n4 = (int)fArray[0];
                le0_24.oY(n4, le0_24.OB);
                break;
            }
            case 3: {
                int n5 = (int)fArray[0];
                le0_22.sy(n5, (int)fArray[1]);
                break;
            }
            case 2: {
                int n6 = le0_22.A20;
                le0_22.sy(n6, (int)fArray[0]);
                break;
            }
            case 1: {
                Object object2 = le0_22;
                int n7 = (int)fArray[0];
                ((le0_2)object2).sy(n7, ((le0_2)object2).SB0);
            }
        }
    }

    @Override
    public final int AJ(Object object, int n, float[] fArray) {
        int n2;
        le0_2 le0_22 = (le0_2)object;
        switch (n) {
            default: {
                if (j9) {
                    n2 = 0;
                    break;
                }
                throw new AssertionError();
            }
            case 6: {
                fArray[0] = le0_22.Mx;
                fArray[1] = le0_22.OB;
                n2 = 2;
                break;
            }
            case 5: {
                fArray[0] = le0_22.OB;
                n2 = 1;
                break;
            }
            case 4: {
                fArray[0] = le0_22.Mx;
                n2 = 1;
                break;
            }
            case 3: {
                fArray[0] = le0_22.A20;
                fArray[1] = le0_22.SB0;
                n2 = 2;
                break;
            }
            case 2: {
                fArray[0] = le0_22.SB0;
                n2 = 1;
                break;
            }
            case 1: {
                fArray[0] = le0_22.A20;
                n2 = 1;
            }
        }
        return n2;
    }
}

