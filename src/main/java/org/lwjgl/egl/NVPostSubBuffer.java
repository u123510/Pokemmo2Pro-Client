/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.egl;

import org.lwjgl.egl.EGL;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.NativeType;

public class NVPostSubBuffer {
    public static final int EGL_POST_SUB_BUFFER_SUPPORTED_NV = 12478;

    public NVPostSubBuffer() {
        throw new UnsupportedOperationException();
    }

    @NativeType(value="EGLBoolean")
    public static boolean eglPostSubBufferNV(@NativeType(value="EGLDisplay") long l, @NativeType(value="EGLSurface") long l2, @NativeType(value="EGLint") int n, @NativeType(value="EGLint") int n2, @NativeType(value="EGLint") int n3, @NativeType(value="EGLint") int n4) {
        long l3 = EGL.getCapabilities().eglPostSubBufferNV;
        if (Checks.CHECKS) {
            Checks.check(l3);
            Checks.check(l);
            Checks.check(l2);
        }
        return JNI.callPPI(l, l2, n, n2, n3, n4, l3) != 0;
    }
}

