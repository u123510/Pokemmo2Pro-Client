package cn.pokemmo.battle;

import f.*;
import java.lang.reflect.Field;

/**
 * 现代化重构类 - 原始混淆类: f.lo_0
 */
public class Modern_Battle_Lo0
implements rx_0 {

    public Modern_Battle_Lo0() {
        super();
    }

    public static final lo_0 Vi = new lo_0();

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final Object nx0(String string, Field field, String string2, String string3) {
        long l;
        try {
            l = Long.decode(string);
            if (!string2.isEmpty()) {
                l = Math.max(Long.decode(string2), l);
            }
        }
        catch (Exception exception) {
            throw new lc0_0(exception);
        }
        if (string3.isEmpty()) return l;
        l = Math.min(Long.decode(string3), l);
        return l;
    }
}


