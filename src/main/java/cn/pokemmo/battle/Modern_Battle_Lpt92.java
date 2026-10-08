package cn.pokemmo.battle;

import f.*;
import java.util.ArrayList;

/**
 * 现代化重构类 - 原始混淆类: f.lpt9__2
 */
public abstract class Modern_Battle_Lpt92 {

    public Modern_Battle_Lpt92() {
        super();
    }

    public static final float[] CoM4 = new float[]{1.0f, 1.25f, 1.5f, 1.75f, 2.0f};

    public static ArrayList Kf(int n, int n2) {
        ArrayList<Float> arrayList2 = new ArrayList<Float>();
        float[] fArray = CoM4;
        int n3 = 5;
        for (int j = 0; j < n3; ++j) {
            float f = fArray[j];
            if (!LW.LH0(f, 1.0f)) {
                int n4 = (int)((float)n2 / f);
                if ((int)((float)n / f) <= 500 || n4 <= 640) continue;
            }
            arrayList2.add(Float.valueOf(f));
        }
        return arrayList2;
    }
}


