package cn.pokemmo.battle;

import f.*;

/**
 * 现代化重构类 - 原始混淆类: f.fc0_2
 */
public abstract class Modern_Battle_Fc02 {

    public Modern_Battle_Fc02() {
        super();
    }

    public static int YQ = 0;
    public static int On0 = 0;

    public static void q70(int n, boolean bl) {
        if (n < 0) {
            n = 0;
        } else if (n > 100) {
            n = 100;
        }
        int n2 = lg_0.S4.Kr0();
        int d = lg_0.S4.sD0();
        float f = 1.0f;
        if (bl) {
            f = tw0_0.LD0.Ew;
        }
        float f2 = (float)n * 0.4f / 100.0f + 0.3f;
        double d2 = f;
        YQ = (int)(Math.max(Math.ceil((float)n2 * f2), 760.0) * d2);
        On0 = (int)(Math.max(Math.ceil((float)d * f2), 400.0) * d2);
    }
}


