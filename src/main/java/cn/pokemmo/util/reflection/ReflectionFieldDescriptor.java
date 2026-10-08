package cn.pokemmo.util.reflection;

import f.*;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class ReflectionFieldDescriptor {
    public final Field cOm5;

    public ReflectionFieldDescriptor(Field field) {
        this.cOm5 = field;
    }

    public final Class<?> Ku0() {
        return this.cOm5.getType();
    }

    public final Class<?> Np(int i) {
        Type genericType = this.cOm5.getGenericType();
        if (genericType instanceof ParameterizedType) {
            Type[] actualTypeArguments = ((ParameterizedType) genericType).getActualTypeArguments();
            if (actualTypeArguments.length - 1 >= i) {
                Type type = actualTypeArguments[i];
                if (type instanceof Class) {
                    return (Class<?>) type;
                }
                if (type instanceof ParameterizedType) {
                    return (Class<?>) ((ParameterizedType) type).getRawType();
                }
                if (type instanceof GenericArrayType) {
                    Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
                    if (genericComponentType instanceof Class) {
                        return Array.newInstance((Class<?>) genericComponentType, 0).getClass();
                    }
                }
            }
        }
        return null;
    }

    public final boolean Mf() {
        return this.cOm5.isAnnotationPresent(Deprecated.class);
    }

    public final Object uB(Object obj) {
        try {
            return this.cOm5.get(obj);
        } catch (IllegalAccessException e) {
            sneakyThrow(new ua_0("Illegal access to field: " + this.cOm5.getName(), e));
            return null;
        } catch (IllegalArgumentException e) {
            sneakyThrow(new ua_0("Object is not an instance of " + this.cOm5.getDeclaringClass(), e));
            return null;
        }
    }

    public final void lo(Object obj, Object obj2) {
        try {
            this.cOm5.set(obj, obj2);
        } catch (IllegalAccessException e) {
            sneakyThrow(new ua_0("Illegal access to field: " + this.cOm5.getName(), e));
        } catch (IllegalArgumentException e) {
            sneakyThrow(new ua_0("Argument not valid for field: " + this.cOm5.getName(), e));
        }
    }

    @SuppressWarnings("unchecked")
    private static <E extends Throwable> void sneakyThrow(Throwable throwable) throws E {
        throw (E) throwable;
    }
}
