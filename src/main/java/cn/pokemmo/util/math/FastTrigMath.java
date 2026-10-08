/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.util.math;

import f.*;

import f.O00;
import f.jm0_0;

public class FastTrigMath {
    public static final O00 Yu = new O00();

    protected FastTrigMath() {
    }

    public static float Po0(float f) {
        return jm0_0.yr0[(int)(f * 2607.5945f) & 0x3FFF];
    }

    public static float Fm0(float f) {
        return jm0_0.yr0[(int)((f + 1.5707964f) * 2607.5945f) & 0x3FFF];
    }

    public static float Om(float f) {
        return jm0_0.yr0[(int)(f * 45.511112f) & 0x3FFF];
    }

    public static float gc0(float f) {
        return jm0_0.yr0[(int)((f + 90.0f) * 45.511112f) & 0x3FFF];
    }

    public static float vH(double d) {
        double d2 = Math.abs(d);
        d2 = (d2 - 1.0) / (d2 + 1.0);
        double d4 = d2 * d2;
        double d5 = d2 * d4;
        double d6 = d5 * d4;
        double d7 = d6 * d4;
        double d8 = d7 * d4;
        double d9 = d2;
        double d10 = d;
        d = d8 * d4;
        d2 = Math.signum(d10);
        d4 = d9 * 0.99997726 - d5 * 0.33262347;
        d4 = d6 * 0.19354346 + d4 - d7 * 0.11643287;
        return (float)((d8 * 0.05265332 + d4 - d * 0.0117212 + 0.7853981633974483) * d2);
    }

    public static float mS(float f, float f2) {
        float f3 = f / f2;
        if (f3 != f3) {
            f3 = f == f2 ? 1.0f : -1.0f;
        } else {
            float f4 = f3;
            float f5 = f4 - f4;
            if (f5 != f5) {
                f2 = 0.0f;
            }
        }
        if (f2 > 0.0f) {
            return LW.vH(f3);
        }
        if (f2 < 0.0f) {
            if (f >= 0.0f) {
                return LW.vH(f3) + (float)Math.PI;
            }
            return LW.vH(f3) - (float)Math.PI;
        }
        if (f > 0.0f) {
            return f2 + 1.5707964f;
        }
        if (f < 0.0f) {
            return f2 - 1.5707964f;
        }
        return f2 + f;
    }

    public static int uo0(int n) {
        if (n == 0) {
            return 1;
        }
        int n2 = n + -1;
        int n3 = n2 | n2 >> 1;
        int n4 = n3 | n3 >> 2;
        int n5 = n4 | n4 >> 4;
        int n6 = n5 | n5 >> 8;
        return (n6 | n6 >> 16) + 1;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean eh(int n) {
        if (n == 0) return false;
        int n2 = n;
        if ((n2 & n2 - 1) != 0) return false;
        return true;
    }

    public static float r1(float f, float f2, float f3) {
        if (f < f2) {
            return f2;
        }
        if (f > f3) {
            return f3;
        }
        return f;
    }

    public static boolean iF(float f) {
        return Math.abs(f) <= 1.0E-6f;
    }

    public static boolean LH0(float f, float f2) {
        return Math.abs(f - f2) <= 1.0E-6f;
    }
}

