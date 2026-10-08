/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.graphics.animation.tween;

import f.*;

import f.BD;
import f.qd0_0;

public class OrthoCameraTweenAccessor
implements BaseTweenAccessor, f.BD {
    public static final /* synthetic */ boolean j4;

    static {
        j4 = OrthoCameraTweenAccessor.class.desiredAssertionStatus() ^ true;
    }

    @Override
    public final void wl(Object object, int n, float[] fArray) {
        qd0_0 qd0_02 = (qd0_0)object;
        switch (n) {
            default: {
                if (!j4) {
                    throw new AssertionError();
                }
                break;
            }
            case 4: {
                qd0_02.nB = fArray[0];
                break;
            }
            case 3: {
                qd0_0 qd0_03 = qd0_02;
                int n2 = (int)fArray[0];
                int n3 = (int)fArray[1];
                qd0_03.s00 = n2;
                qd0_03.Vc0 = n3;
                break;
            }
            case 2: {
                qd0_02.Vc0 = (int)fArray[0];
                break;
            }
            case 1: {
                qd0_02.s00 = (int)fArray[0];
            }
        }
    }

    @Override
    public final int AJ(Object object, int n, float[] fArray) {
        int n2;
        qd0_0 qd0_02 = (qd0_0)object;
        switch (n) {
            default: {
                if (j4) {
                    n2 = 0;
                    break;
                }
                throw new AssertionError();
            }
            case 4: {
                int n3 = 0;
                fArray[n3] = qd0_02.nB;
                n2 = 1;
                break;
            }
            case 3: {
                fArray[0] = qd0_02.s00;
                fArray[1] = qd0_02.Vc0;
                n2 = 2;
                break;
            }
            case 2: {
                fArray[0] = qd0_02.Vc0;
                n2 = 1;
                break;
            }
            case 1: {
                fArray[0] = qd0_02.s00;
                n2 = 1;
            }
        }
        return n2;
    }
}

