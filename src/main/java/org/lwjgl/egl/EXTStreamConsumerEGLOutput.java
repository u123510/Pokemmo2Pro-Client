/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.egl;

import org.lwjgl.egl.EGL;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.NativeType;

public class EXTStreamConsumerEGLOutput {
    public EXTStreamConsumerEGLOutput() {
        throw new UnsupportedOperationException();
    }

    @NativeType(value="EGLBoolean")
    public static boolean eglStreamConsumerOutputEXT(@NativeType(value="EGLDisplay") long l, @NativeType(value="EGLStreamKHR") long l2, @NativeType(value="EGLOutputLayerEXT") long l3) {
        long l4 = EGL.getCapabilities().eglStreamConsumerOutputEXT;
        if (Checks.CHECKS) {
            Checks.check(l4);
            Checks.check(l);
            Checks.check(l2);
            Checks.check(l3);
        }
        return JNI.callPPPI(l, l2, l3, l4) != 0;
    }
}

