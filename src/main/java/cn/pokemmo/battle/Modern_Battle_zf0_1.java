package cn.pokemmo.battle;

import f.*;
import java.lang.reflect.Field;

/**
 * 现代化重构类 - 原始混淆类: f.zf0_1
 */
public class Modern_Battle_zf0_1
implements rx_0 {

    public Modern_Battle_zf0_1() {
        super();
    }

    public static final zf0_1 E50 = new zf0_1();

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final Object nx0(String string, Field field, String string2, String string3) {
        try {
            byte by = Byte.decode(string);
            if (!string2.isEmpty()) {
                by = (byte)Math.max(Byte.decode(string2).byteValue(), by);
            }
            if (!string3.isEmpty()) {
                by = (byte)Math.min(Byte.decode(string3).byteValue(), by);
            }
            return by;
        }
        catch (Exception exception) {
            throw new lc0_0(exception);
        }
    }
}


