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

public class NVStreamSync {
    public static final int EGL_SYNC_TYPE_KHR = 12535;
    public static final int EGL_SYNC_NEW_FRAME_NV = 12831;

    public NVStreamSync() {
        throw new UnsupportedOperationException();
    }

    public static long neglCreateStreamSyncNV(long l, long l2, int n, long l3) {
        long l4 = EGL.getCapabilities().eglCreateStreamSyncNV;
        if (Checks.CHECKS) {
            Checks.check(l4);
            Checks.check(l);
            Checks.check(l2);
        }
        return JNI.callPPPP(l, l2, n, l3, l4);
    }

    @NativeType(value="EGLSyncKHR")
    public static long eglCreateStreamSyncNV(@NativeType(value="EGLDisplay") long l, @NativeType(value="EGLStreamKHR") long l2, @NativeType(value="EGLenum") int n, @NativeType(value="EGLint const *") IntBuffer intBuffer) {
        if (Checks.CHECKS) {
            Checks.checkNT(intBuffer, 12344);
        }
        long l3 = l;
        l = MemoryUtil.memAddress(intBuffer);
        return NVStreamSync.neglCreateStreamSyncNV(l3, l2, n, l);
    }

    @NativeType(value="EGLSyncKHR")
    public static long eglCreateStreamSyncNV(@NativeType(value="EGLDisplay") long l, @NativeType(value="EGLStreamKHR") long l2, @NativeType(value="EGLenum") int n, @NativeType(value="EGLint const *") int[] nArray) {
        long l3 = EGL.getCapabilities().eglCreateStreamSyncNV;
        if (Checks.CHECKS) {
            Checks.check(l3);
            Checks.check(l);
            Checks.check(l2);
            Checks.checkNT(nArray, 12344);
        }
        return JNI.callPPPP(l, l2, n, nArray, l3);
    }
}

