/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.egl;

import org.lwjgl.egl.EGL;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.NativeType;

public class NVSystemTime {
    public NVSystemTime() {
        throw new UnsupportedOperationException();
    }

    @NativeType(value="EGLuint64NV")
    public static long eglGetSystemTimeFrequencyNV() {
        long l = EGL.getCapabilities().eglGetSystemTimeFrequencyNV;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        return JNI.callJ(l);
    }

    @NativeType(value="EGLuint64NV")
    public static long eglGetSystemTimeNV() {
        long l = EGL.getCapabilities().eglGetSystemTimeNV;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        return JNI.callJ(l);
    }
}

