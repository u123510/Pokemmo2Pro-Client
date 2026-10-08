package cn.pokemmo.config;

import f.rx_0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * 客户端配置项元数据注解 (Client Config Field Annotation)
 * 标记在配置字段上，指定其持久化 key 键名、类型转换器 (transformer)、默认值以及取值上下限。
 *
 * 原混淆类: f._interface
 */
@Retention(value=RetentionPolicy.RUNTIME)
public @interface ConfigField {
    String key();

    Class propertyTransformer() default rx_0.class;

    String defaultValue() default "DO_NOT_OVERWRITE_INITIALIZATION_VALUE";

    String min() default "";

    String max() default "";
}
