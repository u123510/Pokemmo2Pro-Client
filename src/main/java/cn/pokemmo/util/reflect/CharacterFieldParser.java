package cn.pokemmo.util.reflect;

import f.lc0_0;
import f.rx_0;
import java.lang.reflect.Field;

public class CharacterFieldParser implements rx_0 {
    public static final CharacterFieldParser Do = new CharacterFieldParser();

    @Override
    public Object nx0(String v1, Field v2, String v3, String v4) {
        try {
            char[] chars = v1.toCharArray();
            if (chars.length > 1) {
                throw new lc0_0("To many characters in the value");
            }
            return Character.valueOf(chars[0]);
        } catch (Exception ex) {
            throw new lc0_0(ex);
        }
    }
}
