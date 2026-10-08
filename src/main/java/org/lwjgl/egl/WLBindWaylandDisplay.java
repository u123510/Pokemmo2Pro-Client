/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.egl;

import java.nio.Buffer;
import java.nio.IntBuffer;
import org.lwjgl.egl.EGL;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

public class WLBindWaylandDisplay {
    public WLBindWaylandDisplay() {
        throw new UnsupportedOperationException();
    }

    @NativeType(value="EGLBoolean")
    public static boolean eglBindWaylandDisplayWL(@NativeType(value="EGLDisplay") long l, @NativeType(value="struct wl_display *") long l2) {
        long l3 = EGL.getCapabilities().eglBindWaylandDisplayWL;
        if (Checks.CHECKS) {
            Checks.check(l3);
            Checks.check(l);
            Checks.check(l2);
        }
        return JNI.callPPI(l, l2, l3) != 0;
    }

    @NativeType(value="EGLBoolean")
    public static boolean eglUnbindWaylandDisplayWL(@NativeType(value="EGLDisplay") long l, @NativeType(value="struct wl_display *") long l2) {
        long l3 = EGL.getCapabilities().eglUnbindWaylandDisplayWL;
        if (Checks.CHECKS) {
            Checks.check(l3);
            Checks.check(l);
            Checks.check(l2);
        }
        return JNI.callPPI(l, l2, l3) != 0;
    }

    public static int neglQueryWaylandBufferWL(long l, long l2, int n, long l3) {
        long l4 = EGL.getCapabilities().eglQueryWaylandBufferWL;
        if (Checks.CHECKS) {
            Checks.check(l4);
            Checks.check(l);
            Checks.check(l2);
        }
        return JNI.callPPPI(l, l2, n, l3, l4);
    }

    @NativeType(value="EGLBoolean")
    public static boolean eglQueryWaylandBufferWL(@NativeType(value="EGLDisplay") long l, @NativeType(value="struct wl_resource *") long l2, @NativeType(value="EGLint") int n, @NativeType(value="EGLint *") IntBuffer intBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)intBuffer, 1);
        }
        return WLBindWaylandDisplay.neglQueryWaylandBufferWL(l, l2, n, l = MemoryUtil.memAddress(intBuffer)) != 0;
    }

    @NativeType(value="EGLBoolean")
    public static boolean eglQueryWaylandBufferWL(@NativeType(value="EGLDisplay") long l, @NativeType(value="struct wl_resource *") long l2, @NativeType(value="EGLint") int n, @NativeType(value="EGLint *") int[] nArray) {
        long l3 = EGL.getCapabilities().eglQueryWaylandBufferWL;
        if (Checks.CHECKS) {
            Checks.check(l3);
            Checks.check(l);
            Checks.check(l2);
            Checks.check(nArray, 1);
        }
        return JNI.callPPPI(l, l2, n, nArray, l3) != 0;
    }
}

