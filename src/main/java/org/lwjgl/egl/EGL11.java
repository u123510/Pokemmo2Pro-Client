/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.egl;

import org.lwjgl.egl.EGL;
import org.lwjgl.egl.EGL10;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.NativeType;

public class EGL11
extends EGL10 {
    public static final int EGL_BACK_BUFFER = 12420;
    public static final int EGL_BIND_TO_TEXTURE_RGB = 12345;
    public static final int EGL_BIND_TO_TEXTURE_RGBA = 12346;
    public static final int EGL_CONTEXT_LOST = 12302;
    public static final int EGL_MIN_SWAP_INTERVAL = 12347;
    public static final int EGL_MAX_SWAP_INTERVAL = 12348;
    public static final int EGL_MIPMAP_TEXTURE = 12418;
    public static final int EGL_MIPMAP_LEVEL = 12419;
    public static final int EGL_NO_TEXTURE = 12380;
    public static final int EGL_TEXTURE_2D = 12383;
    public static final int EGL_TEXTURE_FORMAT = 12416;
    public static final int EGL_TEXTURE_RGB = 12381;
    public static final int EGL_TEXTURE_RGBA = 12382;
    public static final int EGL_TEXTURE_TARGET = 12417;

    public EGL11() {
        throw new UnsupportedOperationException();
    }

    @NativeType(value="EGLBoolean")
    public static boolean eglBindTexImage(@NativeType(value="EGLDisplay") long l, @NativeType(value="EGLSurface") long l2, @NativeType(value="EGLint") int n) {
        long l3 = EGL.getCapabilities().eglBindTexImage;
        if (Checks.CHECKS) {
            Checks.check(l3);
            Checks.check(l);
            Checks.check(l2);
        }
        return JNI.callPPI(l, l2, n, l3) != 0;
    }

    @NativeType(value="EGLBoolean")
    public static boolean eglReleaseTexImage(@NativeType(value="EGLDisplay") long l, @NativeType(value="EGLSurface") long l2, @NativeType(value="EGLint") int n) {
        long l3 = EGL.getCapabilities().eglReleaseTexImage;
        if (Checks.CHECKS) {
            Checks.check(l3);
            Checks.check(l);
            Checks.check(l2);
        }
        return JNI.callPPI(l, l2, n, l3) != 0;
    }

    @NativeType(value="EGLBoolean")
    public static boolean eglSurfaceAttrib(@NativeType(value="EGLDisplay") long l, @NativeType(value="EGLSurface") long l2, @NativeType(value="EGLint") int n, @NativeType(value="EGLint") int n2) {
        long l3 = EGL.getCapabilities().eglSurfaceAttrib;
        if (Checks.CHECKS) {
            Checks.check(l3);
            Checks.check(l);
            Checks.check(l2);
        }
        return JNI.callPPI(l, l2, n, n2, l3) != 0;
    }

    @NativeType(value="EGLBoolean")
    public static boolean eglSwapInterval(@NativeType(value="EGLDisplay") long l, @NativeType(value="EGLint") int n) {
        long l2 = EGL.getCapabilities().eglSwapInterval;
        if (Checks.CHECKS) {
            Checks.check(l2);
            Checks.check(l);
        }
        return JNI.callPI(l, n, l2) != 0;
    }
}

