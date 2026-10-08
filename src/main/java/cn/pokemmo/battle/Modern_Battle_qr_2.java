package cn.pokemmo.battle;

import f.*;
import java.lang.reflect.Field;
import java.util.regex.Pattern;

/**
 * 现代化重构类 - 原始混淆类: f.qr_2
 */
public class Modern_Battle_qr_2
implements rx_0 {

    public Modern_Battle_qr_2() {
        super();
    }

    public static final qr_2 Od = new qr_2();

    @Override
    public final Object nx0(String string, Field field, String string2, String string3) {
        try {
            return Pattern.compile(string);
        }
        catch (Exception exception) {
            throw new lc0_0(jj0_0.hw0("Not valid RegExp: ", string), exception);
        }
    }
}


