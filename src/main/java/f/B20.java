package f;

import cn.pokemmo.annotation.StringValue;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * 兼容垫片 (Shim) - 运行时字符串注解
 * 现代定义已迁移至 {@link StringValue}
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface B20 {
    String value();
}
