package cn.pokemmo.graphics.animation.tween;

import f.*;

public class ProgressBarTweenAccessor implements BaseTweenAccessor, f.BD {
    public static final boolean BA0 = !ProgressBarTweenAccessor.class.desiredAssertionStatus();

    @Override
    public final void wl(Object obj, int i, float[] arrf) {
        lc_0 lc_0Var = (lc_0) obj;
        switch (i) {
            case 1:
                lc_0Var.ei0.x = arrf[0];
                lc_0Var.vP = false;
                break;
            case 2:
                lc_0Var.ei0.y = arrf[0];
                lc_0Var.vP = false;
                break;
            case 3:
                lc_0Var.ei0.z = arrf[0];
                lc_0Var.vP = false;
                break;
            case 4:
                lc_0Var.aa(arrf[0], arrf[1], arrf[2]);
                break;
            case 5:
                lc_0Var.Fp0.x = arrf[0] * 0.01f;
                lc_0Var.vP = false;
                break;
            case 6:
                lc_0Var.Fp0.y = arrf[0] * 0.01f;
                lc_0Var.vP = false;
                break;
            case 7:
                lc_0Var.Fp0.x = arrf[0] * 0.01f;
                lc_0Var.Fp0.y = arrf[1] * 0.01f;
                lc_0Var.vP = false;
                break;
            case 8:
                lc_0Var.gH0(arrf[0], arrf[1], arrf[2], arrf[3]);
                break;
            case 9:
                lc_0Var.gH0(lc_0Var.lPT5.r, lc_0Var.lPT5.g, lc_0Var.lPT5.b, arrf[0]);
                break;
            case 10:
                lc_0Var.Ej0(arrf[0], arrf[1], arrf[2], arrf[3]);
                break;
            case 11:
                lc_0Var.Ej0(lc_0Var.ts.r, lc_0Var.ts.g, lc_0Var.ts.b, arrf[0]);
                break;
            case 12:
                lc_0Var.aa(arrf[0], lc_0Var.ei0.y, arrf[1]);
                break;
            case 13:
                lc_0Var.Mj = arrf[0];
                break;
            default:
                if (!BA0) {
                    throw new AssertionError();
                }
                break;
        }
    }

    @Override
    public final int AJ(Object obj, int i, float[] arrf) {
        lc_0 lc_0Var = (lc_0) obj;
        switch (i) {
            case 1:
                arrf[0] = lc_0Var.ei0.x;
                return 1;
            case 2:
                arrf[0] = lc_0Var.ei0.y;
                return 1;
            case 3:
                arrf[0] = lc_0Var.ei0.z;
                return 1;
            case 4:
                arrf[0] = lc_0Var.ei0.x;
                arrf[1] = lc_0Var.ei0.y;
                arrf[2] = lc_0Var.ei0.z;
                return 3;
            case 5:
                arrf[0] = lc_0Var.Fp0.x * 100.0f;
                return 1;
            case 6:
                arrf[0] = lc_0Var.Fp0.y * 100.0f;
                return 1;
            case 7:
                arrf[0] = lc_0Var.Fp0.x * 100.0f;
                arrf[1] = lc_0Var.Fp0.y * 100.0f;
                return 2;
            case 8:
                arrf[0] = lc_0Var.lPT5.r;
                arrf[1] = lc_0Var.lPT5.g;
                arrf[2] = lc_0Var.lPT5.b;
                arrf[3] = lc_0Var.lPT5.a;
                return 4;
            case 9:
                arrf[0] = lc_0Var.lPT5.a;
                return 1;
            case 10:
                arrf[0] = lc_0Var.ts.r;
                arrf[1] = lc_0Var.ts.g;
                arrf[2] = lc_0Var.ts.b;
                arrf[3] = lc_0Var.ts.a;
                return 4;
            case 11:
                arrf[0] = lc_0Var.ts.a;
                return 1;
            case 12:
                arrf[0] = lc_0Var.ei0.x;
                arrf[1] = lc_0Var.ei0.z;
                return 2;
            case 13:
                arrf[0] = lc_0Var.Mj;
                return 1;
            default:
                if (!BA0) {
                    throw new AssertionError();
                }
                return 0;
        }
    }
}
