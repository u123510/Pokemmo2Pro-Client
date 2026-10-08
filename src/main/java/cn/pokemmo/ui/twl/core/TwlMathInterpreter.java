package cn.pokemmo.ui.twl.core;

import f.COM5_;
import f.GQ;
import f.dy0_0;
import f.fl_2;
import f.nw_1;
import f.vp_1;
import f.y6;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 表达式求值数学解释器 (AbstractMathInterpreter)
 */
public abstract class TwlMathInterpreter {
    public final ArrayList B;
    public final HashMap sm0;

    public TwlMathInterpreter() {
        this.B = new ArrayList();
        this.sm0 = new HashMap();
        registerFunction("min", new nw_1());
        registerFunction("max", new y6());
    }

    public static Method findGetter(Class clazz, String name) {
        Method[] methods = clazz.getMethods();
        for (Method m : methods) {
            if (!Modifier.isStatic(m.getModifiers())
                    && m.getReturnType() != Void.TYPE
                    && Modifier.isPublic(m.getDeclaringClass().getModifiers())
                    && m.getParameterTypes().length == 0
                    && (checkGetter(m, name, "get") || checkGetter(m, name, "is"))) {
                return m;
            }
        }
        return null;
    }

    public static Method il(Class clazz, String name) {
        return findGetter(clazz, name);
    }

    public static boolean checkGetter(Method method, String propName, String prefix) {
        String methodName = method.getName();
        int prefixLen = prefix.length();
        int propLen = propName.length();
        return methodName.length() == propLen + prefixLen
                && methodName.startsWith(prefix)
                && methodName.charAt(prefixLen) == Character.toUpperCase(propName.charAt(0))
                && methodName.regionMatches(prefixLen + 1, propName, 1, propLen - 1);
    }

    public static boolean Dz0(Method method, String propName, String prefix) {
        return checkGetter(method, propName, prefix);
    }

    public final void registerFunction(String name, vp_1 fn) {
        this.sm0.put(name, fn);
    }

    public final void RG0(String name, vp_1 fn) {
        registerFunction(name, fn);
    }

    public final Object execute(Class targetType, String expr) {
        this.B.clear();
        COM5_ parser = new COM5_(expr, (fl_2) this);
        int numValues = parser.n50(true);
        if (this.B.size() != numValues) {
            throw new IllegalStateException(GQ.ti("Expected ", numValues, " return values on the stack"));
        }
        if (numValues == 1 && targetType.isInstance(this.B.get(0))) {
            return targetType.cast(this.B.get(0));
        }
        Constructor[] constructors = targetType.getConstructors();
        for (Constructor c : constructors) {
            Class[] paramTypes = c.getParameterTypes();
            if (paramTypes.length == numValues) {
                boolean match = true;
                for (int p = 0; p < numValues; p++) {
                    Class paramType = paramTypes[p];
                    Object arg = this.B.get(p);
                    if (arg == null) {
                        if (paramType.isPrimitive()) {
                            match = false;
                            break;
                        }
                    } else {
                        Class wrapper = (Class) dy0_0.Sl.get(paramType);
                        if (wrapper != null) {
                            paramType = wrapper;
                        }
                        if (!paramType.isInstance(arg)) {
                            match = false;
                            break;
                        }
                    }
                }
                if (match) {
                    try {
                        return targetType.cast(c.newInstance(this.B.toArray(new Object[numValues])));
                    } catch (Exception e) {
                        Logger.getLogger(TwlMathInterpreter.class.getName()).log(Level.SEVERE, "can't instantiate object", e);
                    }
                }
            }
        }
        throw new IllegalArgumentException("Can't construct a " + targetType + " from expression: \"" + expr + "\"");
    }

    public final Object sa(Class targetType, String expr) {
        return execute(targetType, expr);
    }

    public final Number popNumber() {
        int size = this.B.size();
        if (size != 0) {
            Object obj = this.B.remove(size - 1);
            if (obj instanceof Number) {
                return (Number) obj;
            }
            throw new IllegalStateException("expected number on stack - found: " + (obj != null ? obj.getClass() : "null"));
        }
        throw new IllegalStateException("stack underflow");
    }

    public final Number A10() {
        return popNumber();
    }
}
