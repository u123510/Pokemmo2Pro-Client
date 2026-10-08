/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.egl;

import org.lwjgl.egl.EGL;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.NativeType;

public class NVStreamReset {
    public static final int EGL_SUPPORT_RESET_NV = 13108;
    public static final int EGL_SUPPORT_REUSE_NV = 13109;

    public NVStreamReset() {
        throw new UnsupportedOperationException();
    }

    @NativeType(value="EGLBoolean")
    public static boolean eglResetStreamNV(@NativeType(value="EGLDisplay") long l, @NativeType(value="EGLStreamKHR") long l2) {
        long l3 = EGL.getCapabilities().eglResetStreamNV;
        if (Checks.CHECKS) {
            Checks.check(l3);
            Checks.check(l);
            Checks.check(l2);
        }
        return JNI.callPPI(l, l2, l3) != 0;
    }
}

