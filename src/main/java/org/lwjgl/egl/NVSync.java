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

public class NVSync {
    public static final int EGL_SYNC_PRIOR_COMMANDS_COMPLETE_NV = 12518;
    public static final int EGL_SYNC_STATUS_NV = 12519;
    public static final int EGL_SIGNALED_NV = 12520;
    public static final int EGL_UNSIGNALED_NV = 12521;
    public static final int EGL_SYNC_FLUSH_COMMANDS_BIT_NV = 1;
    public static final int EGL_ALREADY_SIGNALED_NV = 12522;
    public static final int EGL_TIMEOUT_EXPIRED_NV = 12523;
    public static final int EGL_CONDITION_SATISFIED_NV = 12524;
    public static final int EGL_SYNC_TYPE_NV = 12525;
    public static final int EGL_SYNC_CONDITION_NV = 12526;
    public static final int EGL_SYNC_FENCE_NV = 12527;
    public static final long EGL_FOREVER_NV = -1L;
    public static final long EGL_NO_SYNC_NV = 0L;

    public NVSync() {
        throw new UnsupportedOperationException();
    }

    public static long neglCreateFenceSyncNV(long l, int n, long l2) {
        long l3 = EGL.getCapabilities().eglCreateFenceSyncNV;
        if (Checks.CHECKS) {
            Checks.check(l3);
            Checks.check(l);
        }
        return JNI.callPPP(l, n, l2, l3);
    }

    @NativeType(value="EGLSyncNV")
    public static long eglCreateFenceSyncNV(@NativeType(value="EGLDisplay") long l, @NativeType(value="EGLenum") int n, @NativeType(value="EGLint const *") IntBuffer intBuffer) {
        if (Checks.CHECKS) {
            Checks.checkNT(intBuffer, 12344);
        }
        return NVSync.neglCreateFenceSyncNV(l, n, MemoryUtil.memAddress(intBuffer));
    }

    @NativeType(value="EGLBoolean")
    public static boolean eglDestroySyncNV(@NativeType(value="EGLSyncNV") long l) {
        long l2 = EGL.getCapabilities().eglDestroySyncNV;
        if (Checks.CHECKS) {
            Checks.check(l2);
            Checks.check(l);
        }
        return JNI.callPI(l, l2) != 0;
    }

    @NativeType(value="EGLBoolean")
    public static boolean eglFenceNV(@NativeType(value="EGLSyncNV") long l) {
        long l2 = EGL.getCapabilities().eglFenceNV;
        if (Checks.CHECKS) {
            Checks.check(l2);
            Checks.check(l);
        }
        return JNI.callPI(l, l2) != 0;
    }

    @NativeType(value="EGLint")
    public static int eglClientWaitSyncNV(@NativeType(value="EGLSyncNV") long l, @NativeType(value="EGLint") int n, @NativeType(value="EGLTimeNV") long l2) {
        long l3 = EGL.getCapabilities().eglClientWaitSyncNV;
        if (Checks.CHECKS) {
            Checks.check(l3);
            Checks.check(l);
        }
        return JNI.callPJI(l, n, l2, l3);
    }

    @NativeType(value="EGLBoolean")
    public static boolean eglSignalSyncNV(@NativeType(value="EGLSyncNV") long l, @NativeType(value="EGLenum") int n) {
        long l2 = EGL.getCapabilities().eglSignalSyncNV;
        if (Checks.CHECKS) {
            Checks.check(l2);
            Checks.check(l);
        }
        return JNI.callPI(l, n, l2) != 0;
    }

    public static int neglGetSyncAttribNV(long l, int n, long l2) {
        long l3 = EGL.getCapabilities().eglGetSyncAttribNV;
        if (Checks.CHECKS) {
            Checks.check(l3);
            Checks.check(l);
        }
        return JNI.callPPI(l, n, l2, l3);
    }

    @NativeType(value="EGLBoolean")
    public static boolean eglGetSyncAttribNV(@NativeType(value="EGLSyncNV") long l, @NativeType(value="EGLint") int n, @NativeType(value="EGLint *") IntBuffer intBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)intBuffer, 1);
        }
        return NVSync.neglGetSyncAttribNV(l, n, MemoryUtil.memAddress(intBuffer)) != 0;
    }

    @NativeType(value="EGLSyncNV")
    public static long eglCreateFenceSyncNV(@NativeType(value="EGLDisplay") long l, @NativeType(value="EGLenum") int n, @NativeType(value="EGLint const *") int[] nArray) {
        long l2 = EGL.getCapabilities().eglCreateFenceSyncNV;
        if (Checks.CHECKS) {
            Checks.check(l2);
            Checks.check(l);
            Checks.checkNT(nArray, 12344);
        }
        return JNI.callPPP(l, n, nArray, l2);
    }

    @NativeType(value="EGLBoolean")
    public static boolean eglGetSyncAttribNV(@NativeType(value="EGLSyncNV") long l, @NativeType(value="EGLint") int n, @NativeType(value="EGLint *") int[] nArray) {
        long l2 = EGL.getCapabilities().eglGetSyncAttribNV;
        if (Checks.CHECKS) {
            Checks.check(l2);
            Checks.check(l);
            Checks.check(nArray, 1);
        }
        return JNI.callPPI(l, n, nArray, l2) != 0;
    }
}

