/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.egl;

import org.lwjgl.PointerBuffer;
import org.lwjgl.egl.EGL;
import org.lwjgl.system.Checks;
import org.lwjgl.system.CustomBuffer;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

public class ANGLEQuerySurfacePointer {
    public ANGLEQuerySurfacePointer() {
        throw new UnsupportedOperationException();
    }

    public static int neglQuerySurfacePointerANGLE(long l, long l2, int n, long l3) {
        long l4 = EGL.getCapabilities().eglQuerySurfacePointerANGLE;
        if (Checks.CHECKS) {
            Checks.check(l4);
            Checks.check(l);
            Checks.check(l2);
        }
        return JNI.callPPPI(l, l2, n, l3, l4);
    }

    @NativeType(value="EGLBoolean")
    public static boolean eglQuerySurfacePointerANGLE(@NativeType(value="EGLDisplay") long l, @NativeType(value="EGLSurface") long l2, @NativeType(value="EGLint") int n, @NativeType(value="void **") PointerBuffer pointerBuffer) {
        if (Checks.CHECKS) {
            Checks.check((CustomBuffer)pointerBuffer, 1);
        }
        return ANGLEQuerySurfacePointer.neglQuerySurfacePointerANGLE(l, l2, n, l = MemoryUtil.memAddress(pointerBuffer)) != 0;
    }
}

