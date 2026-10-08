package f;

import cn.pokemmo.util.reflect.FieldDeserializer;
import java.lang.reflect.Field;

public interface rx_0 extends FieldDeserializer {
    @Override
    Object nx0(String var1, Field var2, String var3, String var4);

    @Override
    default Object deserialize(String str1, Field field, String str2, String str3) {
        return nx0(str1, field, str2, str3);
    }
}
