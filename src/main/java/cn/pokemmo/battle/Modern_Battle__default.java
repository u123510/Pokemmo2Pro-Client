package cn.pokemmo.battle;

import f.*;
import java.lang.reflect.Field;

/**
 * 现代化重构类 - 原始混淆类: f._default
 */
public class Modern_Battle__default
implements rx_0 {

    public Modern_Battle__default() {
        super();
    }

    public static final _default iP = new _default();

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final Object nx0(String string, Field field, String string2, String string3) {
        short s;
        try {
            s = Short.decode(string);
            if (!string2.isEmpty()) {
                s = (short)Math.max(Short.decode(string2).shortValue(), s);
            }
        }
        catch (Exception exception) {
            throw new lc0_0(exception);
        }
        if (string3.isEmpty()) return s;
        s = (short)Math.min(Short.decode(string3).shortValue(), s);
        return s;
    }
}


