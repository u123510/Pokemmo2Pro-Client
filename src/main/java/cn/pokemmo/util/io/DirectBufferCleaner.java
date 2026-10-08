package cn.pokemmo.util.io;

import f.Cq0;
import f.dl_1;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.Buffer;
import java.nio.ByteBuffer;

/**
 * 直接缓冲区释放与清理工具 (Direct Buffer Cleaner Utility)
 * <p>
 * 原始混淆类: {@code f.m00_0}
 */
public abstract class DirectBufferCleaner {
    public static final dl_1 J1;
    public static final Method lL0;
    public static final Method uF;
    public static final Method I4;
    public static final Method Ii;
    public static final Object Sh;
    public static final Method uW;
    public static final Method Qe0;

    protected DirectBufferCleaner() {
    }

    public static Method gq(String className, String methodName) {
        Class<?> clazz;
        try {
            clazz = Class.forName(className);
        } catch (Throwable t) {
            return null;
        }

        Method method;
        try {
            method = clazz.getMethod(methodName, new Class[0]);
            method.setAccessible(true);
        } catch (Throwable t) {
            method = null;
        }
        return method;
    }

    public static boolean SX(Buffer buffer) {
        if (!buffer.isDirect()) {
            return false;
        }

        try {
            Method uWMethod = uW;
            if (uWMethod != null) {
                uWMethod.invoke(Sh, new Object[]{ buffer });
                return true;
            }

            Method iiMethod = Ii;
            if (iiMethod != null) {
                iiMethod.invoke(buffer, new Object[0]);
                return true;
            }

            Method qe0Method = Qe0;
            if (qe0Method != null) {
                qe0Method.invoke(buffer, new Object[0]);
                return true;
            }

            Method cleanM = lL0;
            if (cleanM == null) {
                cleanM = gq(buffer.getClass().getName(), "cleaner");
            }
            if (cleanM == null) {
                J1.warn("Can't release direct buffer: {}", buffer);
                return false;
            }

            Object cleaner = cleanM.invoke(buffer, new Object[0]);
            if (cleaner != null) {
                Method cleanAction = uF;
                if (cleanAction == null) {
                    if (cleaner instanceof Runnable) {
                        cleanAction = gq(Runnable.class.getName(), "run");
                    } else {
                        cleanAction = gq(cleaner.getClass().getName(), "clean");
                    }
                }
                if (cleanAction == null) {
                    J1.warn("Can't release direct buffer: {}", buffer);
                    return false;
                }
                cleanAction.invoke(cleaner, new Object[0]);
                return true;
            }

            Method viewedBufferMethod = I4;
            if (viewedBufferMethod == null) {
                viewedBufferMethod = gq(buffer.getClass().getName(), "viewedBuffer");
            }
            if (viewedBufferMethod == null) {
                J1.warn("Can't release direct buffer: {}", buffer);
                return false;
            }

            Object viewed = viewedBufferMethod.invoke(buffer, new Object[0]);
            if (viewed != null) {
                if (viewed instanceof Buffer) {
                    return SX((Buffer) viewed);
                }
            } else {
                J1.warn("Can't release direct buffer: {}", buffer);
            }
        } catch (Exception e) {
            J1.warn("Can't release direct buffer: {}", buffer, e);
        }
        return false;
    }

    static {
        J1 = Cq0.E1(DirectBufferCleaner.class);

        Object unsafe = null;
        try {
            Field declaredField = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            unsafe = declaredField.get(null);
        } catch (Throwable t) {
            unsafe = null;
        }
        Sh = unsafe;

        Method invokeCleaner = null;
        if (unsafe != null) {
            try {
                invokeCleaner = unsafe.getClass().getMethod("invokeCleaner", new Class[]{ ByteBuffer.class });
                invokeCleaner.setAccessible(true);
            } catch (Throwable t) {
                invokeCleaner = null;
            }
        }
        uW = invokeCleaner;

        if (uW == null) {
            lL0 = gq("sun.nio.ch.DirectBuffer", "cleaner");
            uF = gq("sun.misc.Cleaner", "clean");
            Method method = gq("sun.nio.ch.DirectBuffer", "viewedBuffer");
            if (method == null) {
                method = gq("sun.nio.ch.DirectBuffer", "attachment");
            }
            I4 = method;
            Ii = gq("org.apache.harmony.nio.internal.DirectBuffer", "free");
            Qe0 = gq("java.nio.DirectByteBuffer", "free");
        } else {
            lL0 = null;
            uF = null;
            I4 = null;
            Ii = null;
            Qe0 = null;
        }
    }
}
