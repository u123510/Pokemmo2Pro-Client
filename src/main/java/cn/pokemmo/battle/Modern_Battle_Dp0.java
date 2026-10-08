package cn.pokemmo.battle;

import f.*;
import java.util.function.IntPredicate;

/**
 * 现代化重构类 - 原始混淆类: f.dp0
 */
public abstract class Modern_Battle_Dp0 {

    public Modern_Battle_Dp0() {
        super();
    }

    public static IntPredicate mf0 = n -> false;
    public static IntPredicate YF = n -> false;
    public static IntPredicate Hr0 = n -> false;
    public static IntPredicate Ah = n -> false;
    public static IntPredicate Yc = n -> false;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean aK0() {
        lg_0.k.getClass();
        hb0_2 hb0_22 = hb0_2.BN;
        if (hb0_22 == hb0_2.cw) return true;
        lg_0.k.getClass();
        if (hb0_22 != hb0_2.XU) return false;
        return true;
    }

    public static int Do(int n) {
        if (mf0.test(n)) {
            return 66;
        }
        if (YF.test(n)) {
            return 19;
        }
        if (Hr0.test(n)) {
            return 20;
        }
        if (Ah.test(n)) {
            return 21;
        }
        if (Yc.test(n)) {
            return 22;
        }
        return n;
    }

    public static int r9(int n) {
        if ((n & 0x100) == 0) {
            return n;
        }
        return dp0.Do(n);
    }
}


