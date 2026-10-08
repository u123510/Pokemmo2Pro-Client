/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.egl;

import org.lwjgl.egl.EGL;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.NativeType;

public class KHRStreamConsumerGLTexture {
    public static final int EGL_CONSUMER_ACQUIRE_TIMEOUT_USEC_KHR = 12830;

    public KHRStreamConsumerGLTexture() {
        throw new UnsupportedOperationException();
    }

    @NativeType(value="EGLBoolean")
    public static boolean eglStreamConsumerGLTextureExternalKHR(@NativeType(value="EGLDisplay") long l, @NativeType(value="EGLStreamKHR") long l2) {
        long l3 = EGL.getCapabilities().eglStreamConsumerGLTextureExternalKHR;
        if (Checks.CHECKS) {
            Checks.check(l3);
            Checks.check(l);
            Checks.check(l2);
        }
        return JNI.callPPI(l, l2, l3) != 0;
    }

    @NativeType(value="EGLBoolean")
    public static boolean eglStreamConsumerAcquireKHR(@NativeType(value="EGLDisplay") long l, @NativeType(value="EGLStreamKHR") long l2) {
        long l3 = EGL.getCapabilities().eglStreamConsumerAcquireKHR;
        if (Checks.CHECKS) {
            Checks.check(l3);
            Checks.check(l);
            Checks.check(l2);
        }
        return JNI.callPPI(l, l2, l3) != 0;
    }

    @NativeType(value="EGLBoolean")
    public static boolean eglStreamConsumerReleaseKHR(@NativeType(value="EGLDisplay") long l, @NativeType(value="EGLStreamKHR") long l2) {
        long l3 = EGL.getCapabilities().eglStreamConsumerReleaseKHR;
        if (Checks.CHECKS) {
            Checks.check(l3);
            Checks.check(l);
            Checks.check(l2);
        }
        return JNI.callPPI(l, l2, l3) != 0;
    }
}

