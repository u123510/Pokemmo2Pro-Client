/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengl;

import org.lwjgl.opengl.GL;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.NativeType;

public class GLXSGIXSwapGroup {
    public GLXSGIXSwapGroup() {
        throw new UnsupportedOperationException();
    }

    public static void glXJoinSwapGroupSGIX(@NativeType(value="Display *") long l, @NativeType(value="GLXDrawable") long l2, @NativeType(value="GLXDrawable") long l3) {
        long l4 = GL.getCapabilitiesGLXClient().glXJoinSwapGroupSGIX;
        if (Checks.CHECKS) {
            Checks.check(l4);
            Checks.check(l);
            Checks.check(l2);
        }
        JNI.callPPPV(l, l2, l3, l4);
    }
}

