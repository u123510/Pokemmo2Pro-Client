/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.egl;

import org.lwjgl.egl.EGL;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.NativeType;

public class ANDROIDPresentationTime {
    public ANDROIDPresentationTime() {
        throw new UnsupportedOperationException();
    }

    @NativeType(value="EGLBoolean")
    public static boolean eglPresentationTimeANDROID(@NativeType(value="EGLDisplay") long l, @NativeType(value="EGLSurface") long l2, @NativeType(value="EGLnsecsANDROID") long l3) {
        long l4 = EGL.getCapabilities().eglPresentationTimeANDROID;
        if (Checks.CHECKS) {
            Checks.check(l4);
            Checks.check(l);
            Checks.check(l2);
        }
        return JNI.callPPJI(l, l2, l3, l4) != 0;
    }
}

