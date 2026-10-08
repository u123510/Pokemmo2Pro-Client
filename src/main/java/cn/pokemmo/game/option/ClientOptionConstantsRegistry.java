package cn.pokemmo.game.option;

import f.*;
import java.lang.reflect.Array;

public abstract class ClientOptionConstantsRegistry {
    public static final boolean Bn0 = !ClientOptionConstantsRegistry.class.desiredAssertionStatus();

    public static Object[] gE(Object[] values, Object callback, Class<?> componentType) {
        if (callback == null) {
            throw new NullPointerException("callback");
        }
        int length = values == null ? 0 : values.length;
        Object[] result = (Object[]) Array.newInstance(componentType, length + 1);
        if (length > 0) {
            System.arraycopy(values, 0, result, 0, length);
        }
        result[length] = callback;
        return result;
    }

    public static Object[] tp0(Object callback, Object[] values) {
        if (callback == null) {
            throw new NullPointerException("callback");
        }
        if (values == null) {
            return null;
        }
        int index = -1;
        for (int i = 0; i < values.length; i++) {
            if (values[i] == callback) {
                index = i;
                break;
            }
        }
        if (index < 0) {
            return values;
        }
        int length = values.length;
        if (!Bn0 && (index < 0 || index >= length)) {
            throw new AssertionError();
        }
        if (length == 1) {
            return null;
        }
        Object[] result = (Object[]) Array.newInstance(values.getClass().getComponentType(), length - 1);
        System.arraycopy(values, 0, result, 0, index);
        System.arraycopy(values, index + 1, result, index, length - index - 1);
        return result;
    }

    public static void bH(Runnable[] callbacks) {
        if (callbacks != null) {
            for (Runnable callback : callbacks) {
                callback.run();
            }
        }
    }

    public static void COM8(zs_1[] callbacks, Enum<?> value) {
        if (callbacks != null) {
            for (zs_1 callback : callbacks) {
                callback.Xi0(value);
            }
        }
    }
}
