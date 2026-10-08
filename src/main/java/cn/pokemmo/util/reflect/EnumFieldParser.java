package cn.pokemmo.util.reflect;

import f.lc0_0;
import f.rx_0;
import java.lang.reflect.Field;

/**
 * 枚举字段反射解析器
 */
public class EnumFieldParser implements rx_0 {
    public static final EnumFieldParser INSTANCE = new EnumFieldParser();

    @SuppressWarnings({"rawtypes", "unchecked"})
    public Object parseEnum(String name, Field field, String s1, String s2) {
        Class enumType = field.getType();
        try {
            return Enum.valueOf(enumType, name);
        } catch (Exception e) {
            throw new lc0_0(e);
        }
    }

    @Override
    public Object nx0(String var1, Field var2, String var3, String var4) {
        return parseEnum(var1, var2, var3, var4);
    }
}
