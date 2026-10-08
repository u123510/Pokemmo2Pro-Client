/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.graphics.animation.tween;

import f.*;

import f.BD;
import f.Br0;

/*
 * Renamed from f.Em
 */
public class WindowDialogTweenAccessor
implements BaseTweenAccessor, f.BD {
    public static final /* synthetic */ boolean tb0;

    static {
        tb0 = WindowDialogTweenAccessor.class.desiredAssertionStatus() ^ true;
    }

    @Override
    public final void wl(Object object, int n, float[] fArray) {
        Br0 br0 = (Br0)object;
        switch (n) {
            default: {
                if (!tb0) {
                    throw new AssertionError();
                }
                break;
            }
            case 7: {
                float f = fArray[0];
                br0.IF = (int)f;
                float f2 = fArray[1];
                br0.gx0 = (int)f2;
                br0.gY = (int)(f / 2.0f);
                br0.a4 = (int)(f2 / 2.0f);
                break;
            }
            case 6: {
                br0.IF = (int)fArray[0];
                br0.gx0 = (int)fArray[1];
                break;
            }
            case 5: {
                br0.gx0 = (int)fArray[0];
                break;
            }
            case 4: {
                br0.IF = (int)fArray[0];
                break;
            }
            case 3: {
                br0.gY = (int)fArray[0];
                br0.a4 = (int)fArray[1];
                break;
            }
            case 2: {
                br0.a4 = (int)fArray[0];
                break;
            }
            case 1: {
                br0.gY = (int)fArray[0];
            }
        }
    }

    @Override
    public final int AJ(Object object, int n, float[] fArray) {
        int n2;
        Br0 br0 = (Br0)object;
        switch (n) {
            default: {
                if (tb0) {
                    n2 = 0;
                    break;
                }
                throw new AssertionError();
            }
            case 7: {
                fArray[0] = br0.IF;
                fArray[1] = br0.gx0;
                n2 = 2;
                break;
            }
            case 6: {
                fArray[0] = br0.IF;
                fArray[1] = br0.gx0;
                n2 = 2;
                break;
            }
            case 5: {
                fArray[0] = br0.gx0;
                n2 = 1;
                break;
            }
            case 4: {
                fArray[0] = br0.IF;
                n2 = 1;
                break;
            }
            case 3: {
                fArray[0] = br0.gY;
                fArray[1] = br0.a4;
                n2 = 2;
                break;
            }
            case 2: {
                fArray[0] = br0.a4;
                n2 = 1;
                break;
            }
            case 1: {
                fArray[0] = br0.gY;
                n2 = 1;
            }
        }
        return n2;
    }
}

