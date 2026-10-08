/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.egl;

import org.lwjgl.egl.EGL;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.NativeType;

public class NVStreamFlush {
    public NVStreamFlush() {
        throw new UnsupportedOperationException();
    }

    @NativeType(value="EGLBoolean")
    public static boolean eglStreamFlushNV(@NativeType(value="EGLDisplay") long l, @NativeType(value="EGLStreamKHR") long l2) {
        long l3 = EGL.getCapabilities().eglStreamFlushNV;
        if (Checks.CHECKS) {
            Checks.check(l3);
            Checks.check(l);
            Checks.check(l2);
        }
        return JNI.callPPI(l, l2, l3) != 0;
    }
}

