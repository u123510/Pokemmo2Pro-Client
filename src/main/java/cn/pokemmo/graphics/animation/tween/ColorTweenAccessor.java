/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.graphics.animation.tween;

import f.*;

import com.badlogic.gdx.graphics.Color;
import f.BD;

public class ColorTweenAccessor
implements BaseTweenAccessor, f.BD {
    public static final /* synthetic */ boolean aQ;

    static {
        aQ = ColorTweenAccessor.class.desiredAssertionStatus() ^ true;
    }

    @Override
    public final void wl(Object object, int n, float[] fArray) {
        Color color = (Color)object;
        if (n != 0) {
            if (!aQ) {
                throw new AssertionError();
            }
        } else {
            float f = fArray[0];
            float f2 = fArray[1];
            float f3 = fArray[2];
            float f4 = fArray[3];
            color.set(f, f2, f3, f4);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final int AJ(Object object, int n, float[] fArray) {
        Color color = (Color)object;
        if (n != 0) {
            if (!aQ) throw new AssertionError();
            return 0;
        }
        fArray[0] = color.r;
        fArray[1] = color.g;
        fArray[2] = color.b;
        fArray[3] = color.a;
        return 4;
    }
}

