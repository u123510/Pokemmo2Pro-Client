package cn.pokemmo.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * 运行时字符串值注解
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface StringValue {
    String value();
}
