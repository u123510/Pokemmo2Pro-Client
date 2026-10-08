package ch.qos.logback.classic.spi;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface ConfiguratorRank {
    int FALLBACK = -10;
    int NOMINAL = 0;
    int SERIALIZED_MODEL = 10;
    int DEFAULT = 20;
    int CUSTOM_LOW_PRIORITY = 20;
    int CUSTOM_NORMAL_PRIORITY = 30;
    int CUSTOM_HIGH_PRIORITY = 40;
    int CUSTOM_TOP_PRIORITY = 50;
    int value() default DEFAULT;
}
