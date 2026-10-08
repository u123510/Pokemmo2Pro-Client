package com.badlogic.gdx.jnigen.runtime;

import f.Sc0;
import f.a80_0;
import f.co0;
import f.dv0_0;
import f.tc0_0;
import f.xq_1;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;

public class CHandler {
    public static final int tv0;
    public static final HashMap dx;

    private static native int getPointerSize();
    private static native boolean init(Method callback, Method exceptionToString);

    public static String ZR(Throwable throwable) {
        StringWriter writer = new StringWriter();
        throwable.printStackTrace(new PrintWriter(writer));
        return writer.toString();
    }

    private static native void testIllegalArgumentExceptionThrowable(Class type);
    private static native void testCXXExceptionThrowable(Class type);

    /**
     * JNI callback used by the native jnigen runtime.  The original class
     * contains a keyword-like obfuscated identifier; dispatchCallback is the
     * legal source-level name used by the reconstructed project.
     */
    public static long dispatchCallback(dv0_0 call, ByteBuffer buffer) {
        a80_0[] arguments = call.NUL;
        if (!call.tt.compareAndSet(false, true)) {
            if (call.NUL.length != 0) {
                arguments = new a80_0[call.NUL.length];
                for (int i = 0; i < call.NUL.length; ++i) {
                    arguments[i] = new a80_0(call.NUL[i].vP);
                }
            }

            co0 returnType = call.Tw0.vP;
            if (!returnType.UK) {
                int size = returnType.fL0 ? tv0 : returnType.By0;
                if (size != 0) {
                    new a80_0(returnType);
                }
            }
        }

        if (buffer != null) {
            buffer.order(ByteOrder.nativeOrder());
            for (a80_0 argument : arguments) {
                co0 type = argument.vP;
                int size = type.UK ? 0 : (type.fL0 ? tv0 : type.By0);
                if (size == 1) {
                    buffer.get();
                    boolean ignored = type.OE0;
                } else if (size == 2) {
                    buffer.getShort();
                    boolean ignored = type.OE0;
                } else if (size == 4) {
                    buffer.getInt();
                    boolean ignored = type.OE0;
                } else if (size == 8) {
                    buffer.getLong();
                }
            }
        }

        throw new NullPointerException();
    }

    public static co0 j2(String name) {
        synchronized (dx) {
            co0 type = (co0)dx.get(name);
            if (type != null) {
                return type;
            }
            throw new IllegalArgumentException("CType " + name + " is not registered.");
        }
    }

    public static void He(co0 type) {
        synchronized (dx) {
            if (type.Yv == null) {
                throw new IllegalArgumentException("CType has no name");
            }
            dx.put(type.Yv, type);
        }
    }

    public static native long convertNativeTypeToFFIType(long value);
    public static native long getPointerPart(long value, int offset, int size);
    public static native void setPointerAsString(long value, String string);
    public static native String getPointerAsString(long value);
    public static native int getSizeFromFFIType(long value);
    public static native boolean getSignFromFFIType(long value);
    public static native boolean isVoid(long value);
    public static native long malloc(long size);
    public static native void free(long pointer);

    static {
        try {
            new tc0_0().yY("jnigen-runtime");
            Method callback = CHandler.class.getDeclaredMethod(
                "dispatchCallback", dv0_0.class, ByteBuffer.class);
            Method exceptionToString = CHandler.class.getDeclaredMethod(
                "ZR", Throwable.class);
            if (!CHandler.init(callback, exceptionToString)) {
                throw new RuntimeException(
                    "JNI initialization failed, either CHandler#dispatchCallback or " +
                    "CHandler#getExceptionString are not JNI accessible.");
            }

            tv0 = CHandler.getPointerSize();
            try {
                CHandler.testIllegalArgumentExceptionThrowable(IllegalArgumentException.class);
                throw new RuntimeException("Unable to throw IllegalArgumentException from JNI.");
            } catch (IllegalArgumentException expected) {
                try {
                    CHandler.testCXXExceptionThrowable(Sc0.class);
                    throw new RuntimeException("Unable to throw CXXException from JNI.");
                } catch (Sc0 expectedCxx) {
                    dx = new HashMap();
                }
            }
        } catch (NoSuchMethodException exception) {
            throw new RuntimeException(exception);
        }
    }

    public static co0 oz0(long value, String name) {
        if (value == 0L) {
            throw new IllegalArgumentException(xq_1.pz0("CType ", name, " maps to zero."));
        }
        value = CHandler.convertNativeTypeToFFIType(value);
        int size = CHandler.getSizeFromFFIType(value);
        boolean signed = CHandler.getSignFromFFIType(value);
        boolean voidType = CHandler.isVoid(value);
        return new co0(name, value, size, signed, false, voidType);
    }

    public static co0 Ts(long value) {
        if (value == 0L) {
            throw new IllegalArgumentException("CType null maps to zero.");
        }
        value = CHandler.convertNativeTypeToFFIType(value);
        int size = CHandler.getSizeFromFFIType(value);
        boolean signed = CHandler.getSignFromFFIType(value);
        boolean voidType = CHandler.isVoid(value);
        return new co0(null, value, size, signed, true, voidType);
    }
}
