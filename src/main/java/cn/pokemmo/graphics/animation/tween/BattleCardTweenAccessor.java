/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.graphics.animation.tween;

import f.*;

import f.BD;
import f.gn_0;

/*
 * Renamed from f.Com5
 */
public class BattleCardTweenAccessor
implements BaseTweenAccessor, f.BD {
    public static final /* synthetic */ boolean nu0;

    static {
        nu0 = BattleCardTweenAccessor.class.desiredAssertionStatus() ^ true;
    }

    @Override
    public final void wl(Object object, int n, float[] fArray) {
        gn_0 gn_02 = (gn_0)object;
        if (n != 0) {
            if (!nu0) {
                throw new AssertionError();
            }
        } else {
            gn_0 gn_03 = gn_02;
            byte by = (byte)fArray[0];
            byte by2 = (byte)fArray[1];
            n = (byte)fArray[2];
            byte by3 = (byte)fArray[3];
            gn_03.cv = by;
            gn_03.x8 = by2;
            gn_03.sh = (byte)n;
            gn_03.FY = by3;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final int AJ(Object object, int n, float[] fArray) {
        gn_0 gn_02 = (gn_0)object;
        if (n != 0) {
            if (!nu0) throw new AssertionError();
            return 0;
        }
        float[] fArray2 = fArray;
        float[] fArray3 = fArray;
        fArray2[0] = gn_02.cv & 0xFF;
        fArray3[1] = gn_02.x8 & 0xFF;
        fArray2[2] = gn_02.sh & 0xFF;
        fArray3[3] = gn_02.FY & 0xFF;
        return 4;
    }
}

