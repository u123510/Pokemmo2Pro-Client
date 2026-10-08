/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengl;

import org.lwjgl.opengl.GL;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.NativeType;

public class GLXSGISwapControl {
    public GLXSGISwapControl() {
        throw new UnsupportedOperationException();
    }

    @NativeType(value="GLint")
    public static int glXSwapIntervalSGI(int n) {
        long l = GL.getCapabilitiesGLXClient().glXSwapIntervalSGI;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        return JNI.callI(n, l);
    }
}

