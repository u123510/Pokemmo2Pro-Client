package cn.pokemmo.battle;

import f.*;
import java.lang.reflect.Field;

/**
 * 现代化重构类 - 原始混淆类: f.con__5
 */
public class Modern_Battle_Con5
implements rx_0 {

    public Modern_Battle_Con5() {
        super();
    }

    public static final con__5 Kz = new con__5();

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final Object nx0(String string, Field field, String string2, String string3) {
        double d;
        try {
            d = Double.parseDouble(string);
            if (!string2.isEmpty()) {
                d = Math.max(Double.parseDouble(string2), d);
            }
        }
        catch (Exception exception) {
            throw new lc0_0(exception);
        }
        if (string3.isEmpty()) return d;
        d = Math.min(Double.parseDouble(string3), d);
        return d;
    }
}


