/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengl;

import java.nio.Buffer;
import java.nio.IntBuffer;
import org.lwjgl.opengl.GL;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

public class MESAFramebufferFlipY {
    public static final int GL_FRAMEBUFFER_FLIP_Y_MESA = 35771;

    public MESAFramebufferFlipY() {
        throw new UnsupportedOperationException();
    }

    public static native void glFramebufferParameteriMESA(@NativeType(value="GLenum") int var0, @NativeType(value="GLenum") int var1, @NativeType(value="GLint") int var2);

    public static native void nglGetFramebufferParameterivMESA(int var0, int var1, long var2);

    public static void glGetFramebufferParameterivMESA(@NativeType(value="GLenum") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLint *") IntBuffer intBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)intBuffer, 1);
        }
        long l = MemoryUtil.memAddress(intBuffer);
        MESAFramebufferFlipY.nglGetFramebufferParameterivMESA(n, n2, l);
    }

    public static void glGetFramebufferParameterivMESA(@NativeType(value="GLenum") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLint *") int[] nArray) {
        long l = GL.getICD().glGetFramebufferParameterivMESA;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(nArray, 1);
        }
        JNI.callPV(n, n2, nArray, l);
    }

    static {
        GL.initialize();
    }
}

