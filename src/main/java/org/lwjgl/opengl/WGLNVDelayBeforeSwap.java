/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengl;

import org.lwjgl.opengl.GL;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.NativeType;

public class WGLNVDelayBeforeSwap {
    public WGLNVDelayBeforeSwap() {
        throw new UnsupportedOperationException();
    }

    @NativeType(value="BOOL")
    public static boolean wglDelayBeforeSwapNV(@NativeType(value="HDC") long l, @NativeType(value="GLfloat") float f) {
        long l2 = GL.getCapabilitiesWGL().wglDelayBeforeSwapNV;
        if (Checks.CHECKS) {
            Checks.check(l2);
            Checks.check(l);
        }
        return JNI.callPI(l, f, l2) != 0;
    }
}

