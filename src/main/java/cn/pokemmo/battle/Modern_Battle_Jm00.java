package cn.pokemmo.battle;

import f.*;

/**
 * 现代化重构类 - 原始混淆类: f.jm0_0
 */
public abstract class Modern_Battle_Jm00 {

    public Modern_Battle_Jm00() {
        super();
    }

    public static final float[] yr0 = new float[16384];

    static {
        int n = 0;
        while (n < 16384) {
            int n2 = n++;
            jm0_0.yr0[n2] = (float)Math.sin(((float)n2 + 0.5f) / 16384.0f * ((float)Math.PI * 2));
        }
        float[] fArray = yr0;
        float[] fArray2 = yr0;
        fArray[0] = 0.0f;
        fArray2[4096] = 1.0f;
        fArray[8192] = 0.0f;
        fArray2[12288] = -1.0f;
    }
}


