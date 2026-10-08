/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.egl;

import java.nio.Buffer;
import java.nio.LongBuffer;
import org.lwjgl.egl.EGL;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

public class KHRStreamFIFO {
    public static final int EGL_STREAM_FIFO_LENGTH_KHR = 12796;
    public static final int EGL_STREAM_TIME_NOW_KHR = 12797;
    public static final int EGL_STREAM_TIME_CONSUMER_KHR = 12798;
    public static final int EGL_STREAM_TIME_PRODUCER_KHR = 12799;

    public KHRStreamFIFO() {
        throw new UnsupportedOperationException();
    }

    public static int neglQueryStreamTimeKHR(long l, long l2, int n, long l3) {
        long l4 = EGL.getCapabilities().eglQueryStreamTimeKHR;
        if (Checks.CHECKS) {
            Checks.check(l4);
            Checks.check(l);
            Checks.check(l2);
        }
        return JNI.callPPPI(l, l2, n, l3, l4);
    }

    @NativeType(value="EGLBoolean")
    public static boolean eglQueryStreamTimeKHR(@NativeType(value="EGLDisplay") long l, @NativeType(value="EGLStreamKHR") long l2, @NativeType(value="EGLenum") int n, @NativeType(value="EGLTimeKHR *") LongBuffer longBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)longBuffer, 1);
        }
        return KHRStreamFIFO.neglQueryStreamTimeKHR(l, l2, n, l = MemoryUtil.memAddress(longBuffer)) != 0;
    }

    @NativeType(value="EGLBoolean")
    public static boolean eglQueryStreamTimeKHR(@NativeType(value="EGLDisplay") long l, @NativeType(value="EGLStreamKHR") long l2, @NativeType(value="EGLenum") int n, @NativeType(value="EGLTimeKHR *") long[] lArray) {
        long l3 = EGL.getCapabilities().eglQueryStreamTimeKHR;
        if (Checks.CHECKS) {
            Checks.check(l3);
            Checks.check(l);
            Checks.check(l2);
            Checks.check(lArray, 1);
        }
        return JNI.callPPPI(l, l2, n, lArray, l3) != 0;
    }
}

