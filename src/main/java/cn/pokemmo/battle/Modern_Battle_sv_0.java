package cn.pokemmo.battle;

import f.*;
import java.lang.reflect.Field;

/**
 * 现代化重构类 - 原始混淆类: f.sv_0
 */
public class Modern_Battle_sv_0
implements rx_0 {

    public Modern_Battle_sv_0() {
        super();
    }

    public static final sv_0 T00 = new sv_0();

    @Override
    public final Object nx0(String string, Field field, String string2, String string3) {
        Boolean bl;
        if (!"true".equalsIgnoreCase(string) && !"1".equals(string)) {
            if (!"false".equalsIgnoreCase(string) && !"0".equals(string)) {
                throw new lc0_0(jj0_0.hw0("Invalid boolean string: ", string));
            }
            bl = Boolean.FALSE;
        } else {
            bl = Boolean.TRUE;
        }
        return bl;
    }
}


