/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengles;

import java.nio.IntBuffer;
import org.lwjgl.opengles.GLES;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

public class NVScissorExclusive {
    public static final int GL_SCISSOR_TEST_EXCLUSIVE_NV = 38229;
    public static final int GL_SCISSOR_BOX_EXCLUSIVE_NV = 38230;

    public NVScissorExclusive() {
        throw new UnsupportedOperationException();
    }

    public static native void nglScissorExclusiveArrayvNV(int var0, int var1, long var2);

    public static void glScissorExclusiveArrayvNV(@NativeType(value="GLuint") int n, @NativeType(value="GLint const *") IntBuffer intBuffer) {
        int n2 = n;
        IntBuffer intBuffer2 = intBuffer;
        n = intBuffer2.remaining() >> 2;
        long l = MemoryUtil.memAddress(intBuffer2);
        NVScissorExclusive.nglScissorExclusiveArrayvNV(n2, n, l);
    }

    public static native void glScissorExclusiveNV(@NativeType(value="GLint") int var0, @NativeType(value="GLint") int var1, @NativeType(value="GLsizei") int var2, @NativeType(value="GLsizei") int var3);

    public static void glScissorExclusiveArrayvNV(@NativeType(value="GLuint") int n, @NativeType(value="GLint const *") int[] nArray) {
        long l = GLES.getICD().glScissorExclusiveArrayvNV;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.callPV(n, nArray.length >> 2, nArray, l);
    }

    static {
        GLES.initialize();
    }
}

