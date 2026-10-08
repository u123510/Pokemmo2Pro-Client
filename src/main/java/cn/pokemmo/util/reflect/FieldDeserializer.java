package cn.pokemmo.util.reflect;

import java.lang.reflect.Field;

public interface FieldDeserializer {
    Object deserialize(String str1, Field field, String str2, String str3);

    default Object nx0(String var1, Field var2, String var3, String var4) {
        return deserialize(var1, var2, var3, var4);
    }
}
