/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengl;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.opengl.GL;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

public class EXTDrawBuffers2 {
    public EXTDrawBuffers2() {
        throw new UnsupportedOperationException();
    }

    public static native void glColorMaskIndexedEXT(@NativeType(value="GLuint") int var0, @NativeType(value="GLboolean") boolean var1, @NativeType(value="GLboolean") boolean var2, @NativeType(value="GLboolean") boolean var3, @NativeType(value="GLboolean") boolean var4);

    public static native void nglGetBooleanIndexedvEXT(int var0, int var1, long var2);

    public static void glGetBooleanIndexedvEXT(@NativeType(value="GLenum") int n, @NativeType(value="GLuint") int n2, @NativeType(value="GLboolean *") ByteBuffer byteBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)byteBuffer, 1);
        }
        long l = MemoryUtil.memAddress(byteBuffer);
        EXTDrawBuffers2.nglGetBooleanIndexedvEXT(n, n2, l);
    }

    @NativeType(value="void")
    public static boolean glGetBooleanIndexedEXT(@NativeType(value="GLenum") int n, @NativeType(value="GLuint") int n2) {
        ByteBuffer byteBuffer;
        MemoryStack memoryStack = MemoryStack.stackGet();
        int n3 = memoryStack.getPointer();
        try {
            byteBuffer = memoryStack.calloc(1);
        }
        catch (Throwable throwable) {
            memoryStack.setPointer(n3);
            throw throwable;
        }
        EXTDrawBuffers2.nglGetBooleanIndexedvEXT(n, n2, MemoryUtil.memAddress(byteBuffer));
        boolean bl = byteBuffer.get(0) != 0;
        memoryStack.setPointer(n3);
        return bl;
    }

    public static native void nglGetIntegerIndexedvEXT(int var0, int var1, long var2);

    public static void glGetIntegerIndexedvEXT(@NativeType(value="GLenum") int n, @NativeType(value="GLuint") int n2, @NativeType(value="GLint *") IntBuffer intBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)intBuffer, 1);
        }
        long l = MemoryUtil.memAddress(intBuffer);
        EXTDrawBuffers2.nglGetIntegerIndexedvEXT(n, n2, l);
    }

    @NativeType(value="void")
    public static int glGetIntegerIndexedEXT(@NativeType(value="GLenum") int n, @NativeType(value="GLuint") int n2) {
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
        EXTDrawBuffers2.nglGetIntegerIndexedvEXT(n, n2, MemoryUtil.memAddress(intBuffer));
        int n4 = intBuffer.get(0);
        memoryStack.setPointer(n3);
        return n4;
    }

    public static native void glEnableIndexedEXT(@NativeType(value="GLenum") int var0, @NativeType(value="GLuint") int var1);

    public static native void glDisableIndexedEXT(@NativeType(value="GLenum") int var0, @NativeType(value="GLuint") int var1);

    @NativeType(value="GLboolean")
    public static native boolean glIsEnabledIndexedEXT(@NativeType(value="GLenum") int var0, @NativeType(value="GLuint") int var1);

    public static void glGetIntegerIndexedvEXT(@NativeType(value="GLenum") int n, @NativeType(value="GLuint") int n2, @NativeType(value="GLint *") int[] nArray) {
        long l = GL.getICD().glGetIntegerIndexedvEXT;
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

