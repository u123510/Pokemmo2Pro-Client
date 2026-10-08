package f;

import cn.pokemmo.config.ConfigField;
import f.rx_0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * 兼容垫片 (Shim) - 客户端配置项元数据注解
 * 现代定义已迁移至 {@link ConfigField}
 */
@Retention(value=RetentionPolicy.RUNTIME)
public @interface _interface {
    public String key();

    public Class propertyTransformer() default rx_0.class;

    public String defaultValue() default "DO_NOT_OVERWRITE_INITIALIZATION_VALUE";

    public String min() default "";

    public String max() default "";
}

