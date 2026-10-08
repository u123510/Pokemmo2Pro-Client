package cn.pokemmo.battle;

import f.*;
import java.lang.reflect.Field;

/**
 * 现代化重构类 - 原始混淆类: f.tq_1
 */
public class Modern_Battle_tq_1
implements rx_0 {

    public Modern_Battle_tq_1() {
        super();
    }

    public static final tq_1 M20 = new tq_1();

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final Object nx0(String string, Field field, String string2, String string3) {
        int n;
        try {
            n = Integer.decode(string);
            if (!string2.isEmpty()) {
                n = Math.max(Integer.decode(string2), n);
            }
        }
        catch (Exception exception) {
            throw new lc0_0(exception);
        }
        if (string3.isEmpty()) return n;
        n = Math.min(Integer.decode(string3), n);
        return n;
    }
}


