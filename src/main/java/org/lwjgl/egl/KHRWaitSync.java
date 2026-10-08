/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.egl;

import org.lwjgl.egl.EGL;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.NativeType;

public class KHRWaitSync {
    public KHRWaitSync() {
        throw new UnsupportedOperationException();
    }

    @NativeType(value="EGLint")
    public static int eglWaitSyncKHR(@NativeType(value="EGLDisplay") long l, @NativeType(value="EGLSyncKHR") long l2, @NativeType(value="EGLint") int n) {
        long l3 = EGL.getCapabilities().eglWaitSyncKHR;
        if (Checks.CHECKS) {
            Checks.check(l3);
            Checks.check(l);
            Checks.check(l2);
        }
        return JNI.callPPI(l, l2, n, l3);
    }
}

