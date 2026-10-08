/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.egl;

import org.lwjgl.PointerBuffer;
import org.lwjgl.egl.EGL;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

public class KHRCLEvent2 {
    public static final int EGL_CL_EVENT_HANDLE_KHR = 12444;
    public static final int EGL_SYNC_CL_EVENT_KHR = 12542;
    public static final int EGL_SYNC_CL_EVENT_COMPLETE_KHR = 12543;

    public KHRCLEvent2() {
        throw new UnsupportedOperationException();
    }

    public static long neglCreateSync64KHR(long l, int n, long l2) {
        long l3 = EGL.getCapabilities().eglCreateSync64KHR;
        if (Checks.CHECKS) {
            Checks.check(l3);
            Checks.check(l);
        }
        return JNI.callPPP(l, n, l2, l3);
    }

    @NativeType(value="EGLSyncKHR")
    public static long eglCreateSync64KHR(@NativeType(value="EGLDisplay") long l, @NativeType(value="EGLenum") int n, @NativeType(value="EGLAttribKHR const *") PointerBuffer pointerBuffer) {
        if (Checks.CHECKS) {
            Checks.checkNT(pointerBuffer, 12344L);
        }
        return KHRCLEvent2.neglCreateSync64KHR(l, n, MemoryUtil.memAddress(pointerBuffer));
    }
}

