/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengl;

import org.lwjgl.opengl.GL;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.NativeType;

public class WGLEXTSwapControl {
    public WGLEXTSwapControl() {
        throw new UnsupportedOperationException();
    }

    @NativeType(value="BOOL")
    public static boolean wglSwapIntervalEXT(int n) {
        long l = GL.getCapabilitiesWGL().wglSwapIntervalEXT;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        return JNI.callI(n, l) != 0;
    }

    public static int wglGetSwapIntervalEXT() {
        long l = GL.getCapabilitiesWGL().wglGetSwapIntervalEXT;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        return JNI.callI(l);
    }
}

