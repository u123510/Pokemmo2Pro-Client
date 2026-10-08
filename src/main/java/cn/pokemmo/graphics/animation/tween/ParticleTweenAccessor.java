/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.graphics.animation.tween;

import f.*;

import f.B5;
import f.BD;

/*
 * Renamed from f.pV
 */
public class ParticleTweenAccessor
implements BaseTweenAccessor, f.BD {
    public static final /* synthetic */ boolean qt0;

    static {
        qt0 = ParticleTweenAccessor.class.desiredAssertionStatus() ^ true;
    }

    @Override
    public final void wl(Object object, int n, float[] fArray) {
        B5 b5 = (B5)object;
        switch (n) {
            default: {
                if (!qt0) {
                    throw new AssertionError();
                }
                break;
            }
            case 8: {
                b5.Ha0(fArray[0]);
                break;
            }
            case 7: {
                B5 b52 = b5;
                b52.B1 = fArray[0];
                b52.o70 = true;
                break;
            }
            case 6: {
                B5 b53 = b5;
                float f = fArray[0];
                float f2 = fArray[1];
                b53.Zi0 = f;
                b53.D60 = f2;
                b53.o70 = true;
                break;
            }
            case 5: {
                Object object2 = b5;
                float f = b5.Zi0;
                float f3 = fArray[0];
                ((B5)object2).Zi0 = f;
                ((B5)object2).D60 = f3;
                ((B5)object2).o70 = true;
                break;
            }
            case 4: {
                float f = fArray[0];
                float f4 = b5.D60;
                b5.Zi0 = f;
                b5.D60 = f4;
                b5.o70 = true;
                break;
            }
            case 3: {
                b5.NL0(fArray[0]);
                b5.ZJ(fArray[1]);
                break;
            }
            case 2: {
                b5.ZJ(fArray[0]);
                break;
            }
            case 1: {
                b5.NL0(fArray[0]);
            }
        }
    }

    @Override
    public final int AJ(Object object, int n, float[] fArray) {
        int n2;
        B5 b5 = (B5)object;
        switch (n) {
            default: {
                if (qt0) {
                    n2 = 0;
                    break;
                }
                throw new AssertionError();
            }
            case 8: {
                fArray[0] = b5.UB0.a;
                n2 = 1;
                break;
            }
            case 7: {
                int n3 = 0;
                fArray[n3] = b5.B1;
                n2 = 1;
                break;
            }
            case 6: {
                int n4 = 0;
                fArray[n4] = b5.Zi0;
                n4 = 1;
                fArray[n4] = b5.D60;
                n2 = 2;
                break;
            }
            case 5: {
                int n5 = 0;
                fArray[n5] = b5.D60;
                n2 = 1;
                break;
            }
            case 4: {
                int n6 = 0;
                fArray[n6] = b5.Zi0;
                n2 = 1;
                break;
            }
            case 3: {
                fArray[0] = b5.a70();
                fArray[1] = b5.wJ0();
                n2 = 2;
                break;
            }
            case 2: {
                fArray[0] = b5.wJ0();
                n2 = 1;
                break;
            }
            case 1: {
                fArray[0] = b5.a70();
                n2 = 1;
            }
        }
        return n2;
    }
}

