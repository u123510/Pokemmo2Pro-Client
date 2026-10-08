/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.egl;

import org.lwjgl.egl.EGL;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.NativeType;

public class EXTDisplayAlloc {
    public static final int EGL_ALLOC_NEW_DISPLAY_EXT = 13177;

    public EXTDisplayAlloc() {
        throw new UnsupportedOperationException();
    }

    @NativeType(value="EGLBoolean")
    public static boolean eglDestroyDisplayEXT(@NativeType(value="EGLDisplay") long l) {
        long l2 = EGL.getCapabilities().eglDestroyDisplayEXT;
        if (Checks.CHECKS) {
            Checks.check(l2);
            Checks.check(l);
        }
        return JNI.callPI(l, l2) != 0;
    }
}

