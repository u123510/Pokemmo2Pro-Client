/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengl;

import org.lwjgl.opengl.GL;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.NativeType;

public class GLXNVDelayBeforeSwap {
    public GLXNVDelayBeforeSwap() {
        throw new UnsupportedOperationException();
    }

    @NativeType(value="Bool")
    public static boolean glXDelayBeforeSwapNV(@NativeType(value="Display *") long l, @NativeType(value="GLXDrawable") long l2, @NativeType(value="GLfloat") float f) {
        long l3 = GL.getCapabilitiesGLXClient().glXDelayBeforeSwapNV;
        if (Checks.CHECKS) {
            Checks.check(l3);
            Checks.check(l);
            Checks.check(l2);
        }
        return JNI.callPPI(l, l2, f, l3) != 0;
    }
}

