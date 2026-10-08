/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.egl;

import org.lwjgl.PointerBuffer;
import org.lwjgl.egl.EGL;
import org.lwjgl.system.Checks;
import org.lwjgl.system.CustomBuffer;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

public class NVNativeQuery {
    public NVNativeQuery() {
        throw new UnsupportedOperationException();
    }

    public static int neglQueryNativeDisplayNV(long l, long l2) {
        long l3 = EGL.getCapabilities().eglQueryNativeDisplayNV;
        if (Checks.CHECKS) {
            Checks.check(l3);
            Checks.check(l);
        }
        return JNI.callPPI(l, l2, l3);
    }

    @NativeType(value="EGLBoolean")
    public static boolean eglQueryNativeDisplayNV(@NativeType(value="EGLDisplay") long l, @NativeType(value="EGLNativeDisplayType *") PointerBuffer pointerBuffer) {
        if (Checks.CHECKS) {
            Checks.check((CustomBuffer)pointerBuffer, 1);
        }
        return NVNativeQuery.neglQueryNativeDisplayNV(l, MemoryUtil.memAddress(pointerBuffer)) != 0;
    }

    public static int neglQueryNativeWindowNV(long l, long l2, long l3) {
        long l4 = EGL.getCapabilities().eglQueryNativeWindowNV;
        if (Checks.CHECKS) {
            Checks.check(l4);
            Checks.check(l);
            Checks.check(l2);
        }
        return JNI.callPPPI(l, l2, l3, l4);
    }

    @NativeType(value="EGLBoolean")
    public static boolean eglQueryNativeWindowNV(@NativeType(value="EGLDisplay") long l, @NativeType(value="EGLSurface") long l2, @NativeType(value="EGLNativeWindowType *") PointerBuffer pointerBuffer) {
        if (Checks.CHECKS) {
            Checks.check((CustomBuffer)pointerBuffer, 1);
        }
        return NVNativeQuery.neglQueryNativeWindowNV(l, l2, MemoryUtil.memAddress(pointerBuffer)) != 0;
    }

    public static int neglQueryNativePixmapNV(long l, long l2, long l3) {
        long l4 = EGL.getCapabilities().eglQueryNativePixmapNV;
        if (Checks.CHECKS) {
            Checks.check(l4);
            Checks.check(l);
            Checks.check(l2);
        }
        return JNI.callPPPI(l, l2, l3, l4);
    }

    @NativeType(value="EGLBoolean")
    public static boolean eglQueryNativePixmapNV(@NativeType(value="EGLDisplay") long l, @NativeType(value="EGLSurface") long l2, @NativeType(value="EGLNativePixmapType *") PointerBuffer pointerBuffer) {
        if (Checks.CHECKS) {
            Checks.check((CustomBuffer)pointerBuffer, 1);
        }
        return NVNativeQuery.neglQueryNativePixmapNV(l, l2, MemoryUtil.memAddress(pointerBuffer)) != 0;
    }
}

