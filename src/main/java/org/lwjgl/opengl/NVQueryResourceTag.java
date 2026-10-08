/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengl;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.opengl.GL;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

public class NVQueryResourceTag {
    public NVQueryResourceTag() {
        throw new UnsupportedOperationException();
    }

    public static native void nglGenQueryResourceTagNV(int var0, long var1);

    public static void glGenQueryResourceTagNV(@NativeType(value="GLuint *") IntBuffer intBuffer) {
        NVQueryResourceTag.nglGenQueryResourceTagNV(intBuffer.remaining(), MemoryUtil.memAddress(intBuffer));
    }

    @NativeType(value="void")
    public static int glGenQueryResourceTagNV() {
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
        NVQueryResourceTag.nglGenQueryResourceTagNV(1, MemoryUtil.memAddress(intBuffer));
        int n2 = intBuffer.get(0);
        memoryStack.setPointer(n);
        return n2;
    }

    public static native void nglDeleteQueryResourceTagNV(int var0, long var1);

    public static void glDeleteQueryResourceTagNV(@NativeType(value="GLuint const *") IntBuffer intBuffer) {
        NVQueryResourceTag.nglDeleteQueryResourceTagNV(intBuffer.remaining(), MemoryUtil.memAddress(intBuffer));
    }

    public static void glDeleteQueryResourceTagNV(@NativeType(value="GLuint const *") int n) {
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
        NVQueryResourceTag.nglDeleteQueryResourceTagNV(1, MemoryUtil.memAddress(intBuffer));
        memoryStack.setPointer(n);
    }

    public static native void nglQueryResourceTagNV(int var0, long var1);

    public static void glQueryResourceTagNV(@NativeType(value="GLuint") int n, @NativeType(value="GLchar const *") ByteBuffer byteBuffer) {
        if (Checks.CHECKS) {
            Checks.checkNT1(byteBuffer);
        }
        NVQueryResourceTag.nglQueryResourceTagNV(n, MemoryUtil.memAddress(byteBuffer));
    }

    public static void glQueryResourceTagNV(@NativeType(value="GLuint") int n, @NativeType(value="GLchar const *") CharSequence charSequence) {
        MemoryStack memoryStack = MemoryStack.stackGet();
        int n2 = n;
        MemoryStack memoryStack2 = memoryStack;
        n = memoryStack.getPointer();
        try {
            memoryStack2.nASCII(charSequence, true);
        }
        catch (Throwable throwable) {
            memoryStack.setPointer(n);
            throw throwable;
        }
        NVQueryResourceTag.nglQueryResourceTagNV(n2, memoryStack2.getPointerAddress());
        memoryStack.setPointer(n);
    }

    public static void glGenQueryResourceTagNV(@NativeType(value="GLuint *") int[] nArray) {
        long l = GL.getICD().glGenQueryResourceTagNV;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.callPV(nArray.length, nArray, l);
    }

    public static void glDeleteQueryResourceTagNV(@NativeType(value="GLuint const *") int[] nArray) {
        long l = GL.getICD().glDeleteQueryResourceTagNV;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.callPV(nArray.length, nArray, l);
    }

    static {
        GL.initialize();
    }
}

