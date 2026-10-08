/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.graphics.animation.tween;

import f.*;

import f.BD;
import f.ql_0;

public class TextLabelTweenAccessor
implements BaseTweenAccessor, f.BD {
    public static final /* synthetic */ boolean Vd0;

    static {
        Vd0 = TextLabelTweenAccessor.class.desiredAssertionStatus() ^ true;
    }

    @Override
    public final void wl(Object object, int n, float[] fArray) {
        ql_0 ql_02 = (ql_0)object;
        switch (n) {
            default: {
                if (!Vd0) {
                    throw new AssertionError();
                }
                break;
            }
            case 6: {
                ql_02.IA = fArray[0];
                ql_02.Eu0 = fArray[1];
                break;
            }
            case 5: {
                ql_02.Eu0 = fArray[0];
                break;
            }
            case 4: {
                ql_02.IA = fArray[0];
                break;
            }
            case 3: {
                ql_02.j80 = fArray[0];
                ql_02.Wm0 = fArray[1];
                break;
            }
            case 2: {
                ql_02.Wm0 = fArray[0];
                break;
            }
            case 1: {
                ql_02.j80 = fArray[0];
            }
        }
    }

    @Override
    public final int AJ(Object object, int n, float[] fArray) {
        int n2;
        ql_0 ql_02 = (ql_0)object;
        switch (n) {
            default: {
                if (Vd0) {
                    n2 = 0;
                    break;
                }
                throw new AssertionError();
            }
            case 6: {
                fArray[0] = ql_02.IA;
                fArray[1] = ql_02.Eu0;
                n2 = 2;
                break;
            }
            case 5: {
                fArray[0] = ql_02.Eu0;
                n2 = 1;
                break;
            }
            case 4: {
                fArray[0] = ql_02.IA;
                n2 = 1;
                break;
            }
            case 3: {
                fArray[0] = ql_02.j80;
                fArray[1] = ql_02.Wm0;
                n2 = 2;
                break;
            }
            case 2: {
                fArray[0] = ql_02.Wm0;
                n2 = 1;
                break;
            }
            case 1: {
                fArray[0] = ql_02.j80;
                n2 = 1;
            }
        }
        return n2;
    }
}

