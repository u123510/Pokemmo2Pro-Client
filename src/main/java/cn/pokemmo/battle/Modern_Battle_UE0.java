package cn.pokemmo.battle;

import f.*;

/**
 * 现代化重构类 - 原始混淆类: f.UE0
 */
public class Modern_Battle_UE0 {

    public static final nb_2 Y00 = new nb_2();

    public static ju_0 TL0(Class clazz) {
        int n = 100;
        nb_2 nb_22 = Y00;
        ju_0 ju_02 = (ju_0)nb_22.Wk0(clazz);
        if (ju_02 == null) {
            ju_02 = new bk0_0(clazz, 4, n);
            nb_22.WK0(clazz, ju_02);
        }
        return ju_02;
    }

    public static void P3(Object object) {
        if (object != null) {
            ju_0 ju_02 = (ju_0)Y00.Wk0(object.getClass());
            if (ju_02 == null) {
                return;
            }
            ju_02.free(object);
            return;
        }
        throw new IllegalArgumentException("object cannot be null.");
    }

    protected Modern_Battle_UE0() {
    }
}


