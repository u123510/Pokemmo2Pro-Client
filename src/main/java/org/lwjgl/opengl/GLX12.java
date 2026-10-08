/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengl;

import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GLX11;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.NativeType;

public class GLX12
extends GLX11 {
    public GLX12() {
        throw new UnsupportedOperationException();
    }

    @NativeType(value="Display *")
    public static long glXGetCurrentDisplay() {
        long l = GL.getCapabilitiesGLXClient().glXGetCurrentDisplay;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        return JNI.callP(l);
    }
}

