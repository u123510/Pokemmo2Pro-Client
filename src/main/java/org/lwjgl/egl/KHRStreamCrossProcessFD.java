/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.egl;

import org.lwjgl.egl.EGL;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.NativeType;

public class KHRStreamCrossProcessFD {
    public static final int EGL_NO_FILE_DESCRIPTOR_KHR = -1;

    public KHRStreamCrossProcessFD() {
        throw new UnsupportedOperationException();
    }

    @NativeType(value="EGLNativeFileDescriptorKHR")
    public static int eglGetStreamFileDescriptorKHR(@NativeType(value="EGLDisplay") long l, @NativeType(value="EGLStreamKHR") long l2) {
        long l3 = EGL.getCapabilities().eglGetStreamFileDescriptorKHR;
        if (Checks.CHECKS) {
            Checks.check(l3);
            Checks.check(l);
            Checks.check(l2);
        }
        return JNI.callPPI(l, l2, l3);
    }

    @NativeType(value="EGLStreamKHR")
    public static long eglCreateStreamFromFileDescriptorKHR(@NativeType(value="EGLDisplay") long l, @NativeType(value="EGLNativeFileDescriptorKHR") int n) {
        long l2 = EGL.getCapabilities().eglCreateStreamFromFileDescriptorKHR;
        if (Checks.CHECKS) {
            Checks.check(l2);
            Checks.check(l);
        }
        return JNI.callPP(l, n, l2);
    }
}

