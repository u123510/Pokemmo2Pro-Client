/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.egl;

import org.lwjgl.egl.EGL;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.NativeType;

public class WLCreateWaylandBufferFromImage {
    public WLCreateWaylandBufferFromImage() {
        throw new UnsupportedOperationException();
    }

    @NativeType(value="struct wl_buffer *")
    public static long eglCreateWaylandBufferFromImageWL(@NativeType(value="EGLDisplay") long l, @NativeType(value="EGLImageKHR") long l2) {
        long l3 = EGL.getCapabilities().eglCreateWaylandBufferFromImageWL;
        if (Checks.CHECKS) {
            Checks.check(l3);
            Checks.check(l);
            Checks.check(l2);
        }
        return JNI.callPPP(l, l2, l3);
    }
}

