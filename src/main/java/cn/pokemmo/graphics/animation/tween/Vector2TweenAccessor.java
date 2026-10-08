/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.graphics.animation.tween;

import f.*;

import f.BD;
import f.Bp0;

/*
 * Renamed from f.iH
 */
public class Vector2TweenAccessor
implements BaseTweenAccessor, f.BD {
    public static final /* synthetic */ boolean gL0;

    static {
        gL0 = Vector2TweenAccessor.class.desiredAssertionStatus() ^ true;
    }

    @Override
    public final void wl(Object object, int n, float[] fArray) {
        Bp0 bp0 = (Bp0)object;
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    if (!gL0) {
                        throw new AssertionError();
                    }
                } else {
                    bp0.x = fArray[0];
                    bp0.y = fArray[1];
                }
            } else {
                bp0.y = fArray[0];
            }
        } else {
            bp0.x = fArray[0];
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final int AJ(Object object, int n, float[] fArray) {
        Bp0 bp0 = (Bp0)object;
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    if (!gL0) throw new AssertionError();
                    return 0;
                }
                fArray[0] = bp0.x;
                fArray[1] = bp0.y;
                return 2;
            }
            fArray[0] = bp0.y;
            return 1;
        }
        fArray[0] = bp0.x;
        return 1;
    }
}

