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

public class ANGLESyncControlRate {
    public ANGLESyncControlRate() {
        throw new UnsupportedOperationException();
    }

    public static int neglGetMscRateANGLE(long l, long l2, long l3, long l4) {
        long l5 = EGL.getCapabilities().eglGetMscRateANGLE;
        if (Checks.CHECKS) {
            Checks.check(l5);
            Checks.check(l);
            Checks.check(l2);
        }
        return JNI.callPPPPI(l, l2, l3, l4, l5);
    }

    @NativeType(value="EGLBoolean")
    public static boolean eglGetMscRateANGLE(@NativeType(value="EGLDisplay") long l, @NativeType(value="EGLSurface") long l2, @NativeType(value="int32_t *") IntBuffer intBuffer, @NativeType(value="int32_t *") IntBuffer intBuffer2) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)intBuffer, 1);
            Checks.check((Buffer)intBuffer2, 1);
        }
        return ANGLESyncControlRate.neglGetMscRateANGLE(l, l2, l = MemoryUtil.memAddress(intBuffer), l2 = MemoryUtil.memAddress(intBuffer2)) != 0;
    }

    @NativeType(value="EGLBoolean")
    public static boolean eglGetMscRateANGLE(@NativeType(value="EGLDisplay") long l, @NativeType(value="EGLSurface") long l2, @NativeType(value="int32_t *") int[] nArray, @NativeType(value="int32_t *") int[] nArray2) {
        long l3 = EGL.getCapabilities().eglGetMscRateANGLE;
        if (Checks.CHECKS) {
            Checks.check(l3);
            Checks.check(l);
            Checks.check(l2);
            Checks.check(nArray, 1);
            Checks.check(nArray2, 1);
        }
        return JNI.callPPPPI(l, l2, nArray, nArray2, l3) != 0;
    }
}

