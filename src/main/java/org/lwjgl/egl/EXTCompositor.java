/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.egl;

import java.nio.IntBuffer;
import org.lwjgl.egl.EGL;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

public class EXTCompositor {
    public static final int EGL_PRIMARY_COMPOSITOR_CONTEXT_EXT = 13408;
    public static final int EGL_EXTERNAL_REF_ID_EXT = 13409;
    public static final int EGL_COMPOSITOR_DROP_NEWEST_FRAME_EXT = 13410;
    public static final int EGL_COMPOSITOR_KEEP_NEWEST_FRAME_EXT = 13411;

    public EXTCompositor() {
        throw new UnsupportedOperationException();
    }

    public static int neglCompositorSetContextListEXT(long l, int n) {
        long l2 = EGL.getCapabilities().eglCompositorSetContextListEXT;
        if (Checks.CHECKS) {
            Checks.check(l2);
        }
        return JNI.callPI(l, n, l2);
    }

    @NativeType(value="EGLBoolean")
    public static boolean eglCompositorSetContextListEXT(@NativeType(value="EGLint const *") IntBuffer intBuffer) {
        return EXTCompositor.neglCompositorSetContextListEXT(MemoryUtil.memAddress(intBuffer), intBuffer.remaining()) != 0;
    }

    public static int neglCompositorSetContextAttributesEXT(int n, long l, int n2) {
        long l2 = EGL.getCapabilities().eglCompositorSetContextAttributesEXT;
        if (Checks.CHECKS) {
            Checks.check(l2);
        }
        return JNI.callPI(n, l, n2, l2);
    }

    @NativeType(value="EGLBoolean")
    public static boolean eglCompositorSetContextAttributesEXT(@NativeType(value="EGLint") int n, @NativeType(value="EGLint const *") IntBuffer intBuffer) {
        int n2;
        IntBuffer intBuffer2 = intBuffer;
        long l = MemoryUtil.memAddress(intBuffer2);
        return EXTCompositor.neglCompositorSetContextAttributesEXT(n, l, n2 = intBuffer2.remaining()) != 0;
    }

    public static int neglCompositorSetWindowListEXT(int n, long l, int n2) {
        long l2 = EGL.getCapabilities().eglCompositorSetWindowListEXT;
        if (Checks.CHECKS) {
            Checks.check(l2);
        }
        return JNI.callPI(n, l, n2, l2);
    }

    @NativeType(value="EGLBoolean")
    public static boolean eglCompositorSetWindowListEXT(@NativeType(value="EGLint") int n, @NativeType(value="EGLint const *") IntBuffer intBuffer) {
        int n2;
        IntBuffer intBuffer2 = intBuffer;
        long l = MemoryUtil.memAddress(intBuffer2);
        return EXTCompositor.neglCompositorSetWindowListEXT(n, l, n2 = intBuffer2.remaining()) != 0;
    }

    public static int neglCompositorSetWindowAttributesEXT(int n, long l, int n2) {
        long l2 = EGL.getCapabilities().eglCompositorSetWindowAttributesEXT;
        if (Checks.CHECKS) {
            Checks.check(l2);
        }
        return JNI.callPI(n, l, n2, l2);
    }

    @NativeType(value="EGLBoolean")
    public static boolean eglCompositorSetWindowAttributesEXT(@NativeType(value="EGLint") int n, @NativeType(value="EGLint const *") IntBuffer intBuffer) {
        int n2;
        IntBuffer intBuffer2 = intBuffer;
        long l = MemoryUtil.memAddress(intBuffer2);
        return EXTCompositor.neglCompositorSetWindowAttributesEXT(n, l, n2 = intBuffer2.remaining()) != 0;
    }

    @NativeType(value="EGLBoolean")
    public static boolean eglCompositorBindTexWindowEXT(@NativeType(value="EGLint") int n) {
        long l = EGL.getCapabilities().eglCompositorBindTexWindowEXT;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        return JNI.callI(n, l) != 0;
    }

    @NativeType(value="EGLBoolean")
    public static boolean eglCompositorSetSizeEXT(@NativeType(value="EGLint") int n, @NativeType(value="EGLint") int n2, @NativeType(value="EGLint") int n3) {
        long l = EGL.getCapabilities().eglCompositorSetSizeEXT;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        return JNI.callI(n, n2, n3, l) != 0;
    }

    @NativeType(value="EGLBoolean")
    public static boolean eglCompositorSwapPolicyEXT(@NativeType(value="EGLint") int n, @NativeType(value="EGLint") int n2) {
        long l = EGL.getCapabilities().eglCompositorSwapPolicyEXT;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        return JNI.callI(n, n2, l) != 0;
    }

    @NativeType(value="EGLBoolean")
    public static boolean eglCompositorSetContextListEXT(@NativeType(value="EGLint const *") int[] nArray) {
        long l = EGL.getCapabilities().eglCompositorSetContextListEXT;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        return JNI.callPI(nArray, nArray.length, l) != 0;
    }

    @NativeType(value="EGLBoolean")
    public static boolean eglCompositorSetContextAttributesEXT(@NativeType(value="EGLint") int n, @NativeType(value="EGLint const *") int[] nArray) {
        long l = EGL.getCapabilities().eglCompositorSetContextAttributesEXT;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        return JNI.callPI(n, nArray, nArray.length, l) != 0;
    }

    @NativeType(value="EGLBoolean")
    public static boolean eglCompositorSetWindowListEXT(@NativeType(value="EGLint") int n, @NativeType(value="EGLint const *") int[] nArray) {
        long l = EGL.getCapabilities().eglCompositorSetWindowListEXT;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        return JNI.callPI(n, nArray, nArray.length, l) != 0;
    }

    @NativeType(value="EGLBoolean")
    public static boolean eglCompositorSetWindowAttributesEXT(@NativeType(value="EGLint") int n, @NativeType(value="EGLint const *") int[] nArray) {
        long l = EGL.getCapabilities().eglCompositorSetWindowAttributesEXT;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        return JNI.callPI(n, nArray, nArray.length, l) != 0;
    }
}

