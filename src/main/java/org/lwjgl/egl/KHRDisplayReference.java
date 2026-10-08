/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.egl;

import org.lwjgl.PointerBuffer;
import org.lwjgl.egl.EGL;
import org.lwjgl.system.Checks;
import org.lwjgl.system.CustomBuffer;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

public class KHRDisplayReference {
    public static final int EGL_TRACK_REFERENCES_KHR = 13138;

    public KHRDisplayReference() {
        throw new UnsupportedOperationException();
    }

    public static int neglQueryDisplayAttribKHR(long l, int n, long l2) {
        long l3 = EGL.getCapabilities().eglQueryDisplayAttribKHR;
        if (Checks.CHECKS) {
            Checks.check(l3);
            Checks.check(l);
        }
        return JNI.callPPI(l, n, l2, l3);
    }

    @NativeType(value="EGLBoolean")
    public static boolean eglQueryDisplayAttribKHR(@NativeType(value="EGLDisplay") long l, @NativeType(value="EGLint") int n, @NativeType(value="EGLAttrib *") PointerBuffer pointerBuffer) {
        if (Checks.CHECKS) {
            Checks.check((CustomBuffer)pointerBuffer, 1);
        }
        return KHRDisplayReference.neglQueryDisplayAttribKHR(l, n, MemoryUtil.memAddress(pointerBuffer)) != 0;
    }
}

