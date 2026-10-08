/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengl;

import java.nio.Buffer;
import java.nio.IntBuffer;
import org.lwjgl.opengl.GL;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

public class NVTimelineSemaphore {
    public static final int GL_SEMAPHORE_TYPE_NV = 38323;
    public static final int GL_SEMAPHORE_TYPE_BINARY_NV = 38324;
    public static final int GL_SEMAPHORE_TYPE_TIMELINE_NV = 38325;
    public static final int GL_TIMELINE_SEMAPHORE_VALUE_NV = 38293;
    public static final int GL_MAX_TIMELINE_SEMAPHORE_VALUE_DIFFERENCE_NV = 38326;

    public NVTimelineSemaphore() {
        throw new UnsupportedOperationException();
    }

    public static native void nglCreateSemaphoresNV(int var0, long var1);

    public static void glCreateSemaphoresNV(@NativeType(value="GLuint *") IntBuffer intBuffer) {
        NVTimelineSemaphore.nglCreateSemaphoresNV(intBuffer.remaining(), MemoryUtil.memAddress(intBuffer));
    }

    @NativeType(value="void")
    public static int glCreateSemaphoresNV() {
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
        NVTimelineSemaphore.nglCreateSemaphoresNV(1, MemoryUtil.memAddress(intBuffer));
        int n2 = intBuffer.get(0);
        memoryStack.setPointer(n);
        return n2;
    }

    public static native void nglSemaphoreParameterivNV(int var0, int var1, long var2);

    public static void glSemaphoreParameterivNV(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLint const *") IntBuffer intBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)intBuffer, 1);
        }
        long l = MemoryUtil.memAddress(intBuffer);
        NVTimelineSemaphore.nglSemaphoreParameterivNV(n, n2, l);
    }

    public static native void nglGetSemaphoreParameterivNV(int var0, int var1, long var2);

    public static void glGetSemaphoreParameterivNV(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLint *") IntBuffer intBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)intBuffer, 1);
        }
        long l = MemoryUtil.memAddress(intBuffer);
        NVTimelineSemaphore.nglGetSemaphoreParameterivNV(n, n2, l);
    }

    public static void glCreateSemaphoresNV(@NativeType(value="GLuint *") int[] nArray) {
        long l = GL.getICD().glCreateSemaphoresNV;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.callPV(nArray.length, nArray, l);
    }

    public static void glSemaphoreParameterivNV(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLint const *") int[] nArray) {
        long l = GL.getICD().glSemaphoreParameterivNV;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(nArray, 1);
        }
        JNI.callPV(n, n2, nArray, l);
    }

    public static void glGetSemaphoreParameterivNV(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLint *") int[] nArray) {
        long l = GL.getICD().glGetSemaphoreParameterivNV;
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

