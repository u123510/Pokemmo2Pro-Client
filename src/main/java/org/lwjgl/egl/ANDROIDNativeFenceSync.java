/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.egl;

import org.lwjgl.egl.EGL;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.NativeType;

public class ANDROIDNativeFenceSync {
    public static final int EGL_SYNC_NATIVE_FENCE_ANDROID = 12612;
    public static final int EGL_SYNC_NATIVE_FENCE_FD_ANDROID = 12613;
    public static final int EGL_SYNC_NATIVE_FENCE_SIGNALED_ANDROID = 12614;
    public static final int EGL_NO_NATIVE_FENCE_FD_ANDROID = -1;

    public ANDROIDNativeFenceSync() {
        throw new UnsupportedOperationException();
    }

    @NativeType(value="EGLint")
    public static int eglDupNativeFenceFDANDROID(@NativeType(value="EGLDisplay") long l, @NativeType(value="EGLSyncKHR") long l2) {
        long l3 = EGL.getCapabilities().eglDupNativeFenceFDANDROID;
        if (Checks.CHECKS) {
            Checks.check(l3);
            Checks.check(l);
            Checks.check(l2);
        }
        return JNI.callPPI(l, l2, l3);
    }
}

