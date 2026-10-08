/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengles;

import org.lwjgl.opengles.GLES;
import org.lwjgl.system.Checks;
import org.lwjgl.system.NativeType;

public class OESEGLImage {
    public OESEGLImage() {
        throw new UnsupportedOperationException();
    }

    public static native void nglEGLImageTargetTexture2DOES(int var0, long var1);

    public static void glEGLImageTargetTexture2DOES(@NativeType(value="GLenum") int n, @NativeType(value="GLeglImageOES") long l) {
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        OESEGLImage.nglEGLImageTargetTexture2DOES(n, l);
    }

    public static native void nglEGLImageTargetRenderbufferStorageOES(int var0, long var1);

    public static void glEGLImageTargetRenderbufferStorageOES(@NativeType(value="GLenum") int n, @NativeType(value="GLeglImageOES") long l) {
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        OESEGLImage.nglEGLImageTargetRenderbufferStorageOES(n, l);
    }

    static {
        GLES.initialize();
    }
}

