/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.egl;

import org.lwjgl.egl.EGL;
import org.lwjgl.egl.EGLClientPixmapHI;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.NativeType;

public class HIClientpixmap {
    public static final int EGL_CLIENT_PIXMAP_POINTER_HI = 36724;

    public HIClientpixmap() {
        throw new UnsupportedOperationException();
    }

    public static long neglCreatePixmapSurfaceHI(long l, long l2, long l3) {
        long l4 = EGL.getCapabilities().eglCreatePixmapSurfaceHI;
        if (Checks.CHECKS) {
            Checks.check(l4);
            Checks.check(l);
            Checks.check(l2);
            EGLClientPixmapHI.validate(l3);
        }
        return JNI.callPPPP(l, l2, l3, l4);
    }

    @NativeType(value="EGLSurface")
    public static long eglCreatePixmapSurfaceHI(@NativeType(value="EGLDisplay") long l, @NativeType(value="EGLConfig") long l2, @NativeType(value="struct EGLClientPixmapHI *") EGLClientPixmapHI eGLClientPixmapHI) {
        return HIClientpixmap.neglCreatePixmapSurfaceHI(l, l2, eGLClientPixmapHI.address());
    }
}

