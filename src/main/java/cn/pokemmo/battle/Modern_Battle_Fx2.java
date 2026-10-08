package cn.pokemmo.battle;

import f.*;
import java.lang.reflect.Field;

/**
 * 现代化重构类 - 原始混淆类: f.fx_2
 */
public class Modern_Battle_Fx2
implements rx_0 {

    public Modern_Battle_Fx2() {
        super();
    }

    public static final fx_2 ge = new fx_2();

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final Object nx0(String string, Field field, String string2, String string3) {
        float f;
        try {
            f = Float.parseFloat(string);
            if (!string2.isEmpty()) {
                f = Math.max(Float.parseFloat(string2), f);
            }
        }
        catch (Exception exception) {
            throw new lc0_0(exception);
        }
        if (string3.isEmpty()) return Float.valueOf(f);
        f = Math.min(Float.parseFloat(string3), f);
        return Float.valueOf(f);
    }
}


