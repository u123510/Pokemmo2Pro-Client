/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.graphics.animation.tween;

import f.*;

import f.BD;
import f.C8;

/*
 * Renamed from f.Gu
 */
public class Vector3TweenAccessor
implements BaseTweenAccessor, f.BD {
    public static final /* synthetic */ boolean gk;

    static {
        gk = Vector3TweenAccessor.class.desiredAssertionStatus() ^ true;
    }

    @Override
    public final void wl(Object object, int n, float[] fArray) {
        C8 c8 = (C8)object;
        switch (n) {
            default: {
                if (!gk) {
                    throw new AssertionError();
                }
                break;
            }
            case 4: {
                c8.x = fArray[0];
                c8.y = fArray[1];
                c8.z = fArray[2];
                break;
            }
            case 3: {
                c8.z = fArray[0];
                break;
            }
            case 2: {
                c8.y = fArray[0];
                break;
            }
            case 1: {
                c8.x = fArray[0];
            }
        }
    }

    @Override
    public final int AJ(Object object, int n, float[] fArray) {
        int n2;
        C8 c8 = (C8)object;
        switch (n) {
            default: {
                if (gk) {
                    n2 = 0;
                    break;
                }
                throw new AssertionError();
            }
            case 4: {
                fArray[0] = c8.x;
                fArray[1] = c8.y;
                fArray[2] = c8.z;
                n2 = 3;
                break;
            }
            case 3: {
                fArray[0] = c8.z;
                n2 = 1;
                break;
            }
            case 2: {
                fArray[0] = c8.y;
                n2 = 1;
                break;
            }
            case 1: {
                fArray[0] = c8.x;
                n2 = 1;
            }
        }
        return n2;
    }
}

