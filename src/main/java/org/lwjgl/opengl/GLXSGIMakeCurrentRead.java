/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengl;

import org.lwjgl.opengl.GL;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.NativeType;

public class GLXSGIMakeCurrentRead {
    public GLXSGIMakeCurrentRead() {
        throw new UnsupportedOperationException();
    }

    @NativeType(value="Bool")
    public static boolean glXMakeCurrentReadSGI(@NativeType(value="Display *") long l, @NativeType(value="GLXDrawable") long l2, @NativeType(value="GLXDrawable") long l3, @NativeType(value="GLXContext") long l4) {
        long l5 = GL.getCapabilitiesGLXClient().glXMakeCurrentReadSGI;
        if (Checks.CHECKS) {
            Checks.check(l5);
            Checks.check(l);
        }
        return JNI.callPPPPI(l, l2, l3, l4, l5) != 0;
    }

    @NativeType(value="GLXDrawable")
    public static long glXGetCurrentReadDrawableSGI() {
        long l = GL.getCapabilitiesGLXClient().glXGetCurrentReadDrawableSGI;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        return JNI.callP(l);
    }
}

