/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.egl;

import org.lwjgl.egl.EGL;
import org.lwjgl.egl.EGL13;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.NativeType;

public class EGL14
extends EGL13 {
    public static final int EGL_MULTISAMPLE_RESOLVE_BOX_BIT = 512;
    public static final int EGL_MULTISAMPLE_RESOLVE = 12441;
    public static final int EGL_MULTISAMPLE_RESOLVE_DEFAULT = 12442;
    public static final int EGL_MULTISAMPLE_RESOLVE_BOX = 12443;
    public static final int EGL_OPENGL_API = 12450;
    public static final int EGL_OPENGL_BIT = 8;
    public static final int EGL_SWAP_BEHAVIOR_PRESERVED_BIT = 1024;
    public static final long EGL_DEFAULT_DISPLAY = 0L;

    public EGL14() {
        throw new UnsupportedOperationException();
    }

    @NativeType(value="EGLContext")
    public static long eglGetCurrentContext() {
        long l = EGL.getCapabilities().eglGetCurrentContext;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        return JNI.callP(l);
    }
}

