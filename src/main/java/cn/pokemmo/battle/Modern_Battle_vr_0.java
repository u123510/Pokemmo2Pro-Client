package cn.pokemmo.battle;

import f.*;
import java.lang.reflect.Field;

/**
 * 现代化重构类 - 原始混淆类: f.vr_0
 */
public class Modern_Battle_vr_0
implements rx_0 {

    public Modern_Battle_vr_0() {
        super();
    }

    public static final vr_0 aK = new vr_0();

    @Override
    public final Object nx0(String string, Field field, String string2, String string3) {
        try {
            return Class.forName(string, false, vr_0.class.getClassLoader());
        }
        catch (ClassNotFoundException classNotFoundException) {
            throw new lc0_0(xq_1.pz0("Cannot find class with name '", string, "'"));
        }
    }
}


