/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.graphics.animation.tween;

import f.*;

import f.BD;
import f.LW;
import f.U10;

/*
 * Renamed from f.wb0
 */
public class ScrollPanelTweenAccessor
implements BaseTweenAccessor, f.BD {
    public static final /* synthetic */ boolean m40;

    static {
        m40 = ScrollPanelTweenAccessor.class.desiredAssertionStatus() ^ true;
    }

    @Override
    public final void wl(Object object, int n, float[] fArray) {
        U10 u10 = (U10)object;
        if (n != 1) {
            if (n != 2) {
                if (!m40) {
                    throw new AssertionError();
                }
            } else {
                float f;
                u10.gQ = f = LW.r1(fArray[0], 0.0f, u10.lp0);
                u10.gW = u10.t60;
                u10.q20 = f;
            }
        } else {
            float f;
            u10.t60 = f = LW.r1(fArray[0], 0.0f, u10.mI);
            u10.gW = f;
            u10.q20 = u10.gQ;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final int AJ(Object object, int n, float[] fArray) {
        U10 u10 = (U10)object;
        if (n != 1) {
            if (n != 2) {
                if (!m40) throw new AssertionError();
                return 0;
            }
            int n2 = 0;
            fArray[n2] = u10.gQ;
            return 1;
        }
        int n3 = 0;
        fArray[n3] = u10.t60;
        return 1;
    }
}

