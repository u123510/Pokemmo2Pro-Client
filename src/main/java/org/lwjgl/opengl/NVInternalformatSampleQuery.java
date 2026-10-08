/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengl;

import java.nio.IntBuffer;
import org.lwjgl.opengl.GL;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

public class NVInternalformatSampleQuery {
    public static final int GL_MULTISAMPLES_NV = 37745;
    public static final int GL_SUPERSAMPLE_SCALE_X_NV = 37746;
    public static final int GL_SUPERSAMPLE_SCALE_Y_NV = 37747;
    public static final int GL_CONFORMANT_NV = 37748;

    public NVInternalformatSampleQuery() {
        throw new UnsupportedOperationException();
    }

    public static native void nglGetInternalformatSampleivNV(int var0, int var1, int var2, int var3, int var4, long var5);

    public static void glGetInternalformatSampleivNV(@NativeType(value="GLenum") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLsizei") int n3, @NativeType(value="GLenum") int n4, @NativeType(value="GLint *") IntBuffer intBuffer) {
        int n5 = n;
        IntBuffer intBuffer2 = intBuffer;
        n = intBuffer2.remaining();
        long l = MemoryUtil.memAddress(intBuffer2);
        NVInternalformatSampleQuery.nglGetInternalformatSampleivNV(n5, n2, n3, n4, n, l);
    }

    public static void glGetInternalformatSampleivNV(@NativeType(value="GLenum") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLsizei") int n3, @NativeType(value="GLenum") int n4, @NativeType(value="GLint *") int[] nArray) {
        long l = GL.getICD().glGetInternalformatSampleivNV;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        int n5 = n;
        n = nArray.length;
        JNI.callPV(n5, n2, n3, n4, n, nArray, l);
    }

    static {
        GL.initialize();
    }
}

