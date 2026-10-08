/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengles;

import java.nio.Buffer;
import java.nio.IntBuffer;
import org.lwjgl.opengles.GLES;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

public class NVFence {
    public static final int GL_ALL_COMPLETED_NV = 34034;
    public static final int GL_FENCE_STATUS_NV = 34035;
    public static final int GL_FENCE_CONDITION_NV = 34036;

    public NVFence() {
        throw new UnsupportedOperationException();
    }

    public static native void nglDeleteFencesNV(int var0, long var1);

    public static void glDeleteFencesNV(@NativeType(value="GLuint const *") IntBuffer intBuffer) {
        NVFence.nglDeleteFencesNV(intBuffer.remaining(), MemoryUtil.memAddress(intBuffer));
    }

    public static void glDeleteFencesNV(@NativeType(value="GLuint const *") int n) {
        IntBuffer intBuffer;
        MemoryStack memoryStack = MemoryStack.stackGet();
        int n2 = n;
        n = memoryStack.getPointer();
        try {
            intBuffer = memoryStack.ints(n2);
        }
        catch (Throwable throwable) {
            memoryStack.setPointer(n);
            throw throwable;
        }
        NVFence.nglDeleteFencesNV(1, MemoryUtil.memAddress(intBuffer));
        memoryStack.setPointer(n);
    }

    public static native void nglGenFencesNV(int var0, long var1);

    public static void glGenFencesNV(@NativeType(value="GLuint *") IntBuffer intBuffer) {
        NVFence.nglGenFencesNV(intBuffer.remaining(), MemoryUtil.memAddress(intBuffer));
    }

    @NativeType(value="void")
    public static int glGenFencesNV() {
        IntBuffer intBuffer;
        MemoryStack memoryStack = MemoryStack.stackGet();
        int n = memoryStack.getPointer();
        try {
            intBuffer = memoryStack.callocInt(1);
        }
        catch (Throwable throwable) {
            memoryStack.setPointer(n);
            throw throwable;
        }
        NVFence.nglGenFencesNV(1, MemoryUtil.memAddress(intBuffer));
        int n2 = intBuffer.get(0);
        memoryStack.setPointer(n);
        return n2;
    }

    @NativeType(value="GLboolean")
    public static native boolean glIsFenceNV(@NativeType(value="GLuint") int var0);

    @NativeType(value="GLboolean")
    public static native boolean glTestFenceNV(@NativeType(value="GLuint") int var0);

    public static native void nglGetFenceivNV(int var0, int var1, long var2);

    public static void glGetFenceivNV(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLint *") IntBuffer intBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)intBuffer, 1);
        }
        long l = MemoryUtil.memAddress(intBuffer);
        NVFence.nglGetFenceivNV(n, n2, l);
    }

    @NativeType(value="void")
    public static int glGetFenceiNV(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2) {
        IntBuffer intBuffer;
        MemoryStack memoryStack = MemoryStack.stackGet();
        int n3 = memoryStack.getPointer();
        try {
            intBuffer = memoryStack.callocInt(1);
        }
        catch (Throwable throwable) {
            memoryStack.setPointer(n3);
            throw throwable;
        }
        NVFence.nglGetFenceivNV(n, n2, MemoryUtil.memAddress(intBuffer));
        int n4 = intBuffer.get(0);
        memoryStack.setPointer(n3);
        return n4;
    }

    public static native void glFinishFenceNV(@NativeType(value="GLuint") int var0);

    public static native void glSetFenceNV(@NativeType(value="GLuint") int var0, @NativeType(value="GLenum") int var1);

    public static void glDeleteFencesNV(@NativeType(value="GLuint const *") int[] nArray) {
        long l = GLES.getICD().glDeleteFencesNV;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.callPV(nArray.length, nArray, l);
    }

    public static void glGenFencesNV(@NativeType(value="GLuint *") int[] nArray) {
        long l = GLES.getICD().glGenFencesNV;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.callPV(nArray.length, nArray, l);
    }

    public static void glGetFenceivNV(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLint *") int[] nArray) {
        long l = GLES.getICD().glGetFenceivNV;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(nArray, 1);
        }
        JNI.callPV(n, n2, nArray, l);
    }

    static {
        GLES.initialize();
    }
}

