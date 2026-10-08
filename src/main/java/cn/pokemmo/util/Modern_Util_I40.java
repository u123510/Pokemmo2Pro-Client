package cn.pokemmo.util;

import f.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 现代化重构类 - 原始混淆类: f.I40
 */
public class Modern_Util_I40 {

    public final Constructor<?> cx;

    public Modern_Util_I40(Constructor<?> constructor) {
        this.cx = constructor;
    }

    public final Object la(Object... arguments) throws ua_0 {
        try {
            return this.cx.newInstance(arguments);
        } catch (InvocationTargetException exception) {
            throw new ua_0(
                "Exception occurred in constructor for class: "
                    + this.cx.getDeclaringClass().getName(),
                exception
            );
        } catch (IllegalAccessException exception) {
            throw new ua_0(
                "Could not instantiate instance of class: "
                    + this.cx.getDeclaringClass().getName(),
                exception
            );
        } catch (InstantiationException exception) {
            throw new ua_0(
                "Could not instantiate instance of class: "
                    + this.cx.getDeclaringClass().getName(),
                exception
            );
        } catch (IllegalArgumentException exception) {
            throw new ua_0(
                "Illegal argument(s) supplied to constructor for class: "
                    + this.cx.getDeclaringClass().getName(),
                exception
            );
        }
    }
}

