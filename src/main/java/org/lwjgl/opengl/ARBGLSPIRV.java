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

public class ARBGLSPIRV {
    public static final int GL_SHADER_BINARY_FORMAT_SPIR_V_ARB = 38225;
    public static final int GL_SPIR_V_BINARY_ARB = 38226;

    public ARBGLSPIRV() {
        throw new UnsupportedOperationException();
    }

    public static native void nglSpecializeShaderARB(int var0, long var1, int var3, long var4, long var6);

    public static void glSpecializeShaderARB(@NativeType(value="GLuint") int n, @NativeType(value="GLchar const *") ByteBuffer byteBuffer, @NativeType(value="GLuint const *") IntBuffer intBuffer, @NativeType(value="GLuint const *") IntBuffer intBuffer2) {
        if (Checks.CHECKS) {
            Checks.checkNT1(byteBuffer);
            Checks.check((Buffer)intBuffer2, intBuffer.remaining());
        }
        IntBuffer intBuffer3 = intBuffer;
        long l = MemoryUtil.memAddress(byteBuffer);
        int n2 = intBuffer3.remaining();
        long l2 = MemoryUtil.memAddress(intBuffer3);
        long l3 = MemoryUtil.memAddress(intBuffer2);
        ARBGLSPIRV.nglSpecializeShaderARB(n, l, n2, l2, l3);
    }

    public static void glSpecializeShaderARB(@NativeType(value="GLuint") int n, @NativeType(value="GLchar const *") CharSequence charSequence, @NativeType(value="GLuint const *") IntBuffer intBuffer, @NativeType(value="GLuint const *") IntBuffer intBuffer2) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)intBuffer2, intBuffer.remaining());
        }
        MemoryStack memoryStack = MemoryStack.stackGet();
        int n2 = n;
        IntBuffer intBuffer3 = intBuffer;
        MemoryStack memoryStack2 = memoryStack;
        n = memoryStack2.getPointer();
        try {
            memoryStack2.nUTF8(charSequence, true);
        }
        catch (Throwable throwable) {
            memoryStack.setPointer(n);
            throw throwable;
        }
        long l = memoryStack2.getPointerAddress();
        int n3 = intBuffer3.remaining();
        long l2 = MemoryUtil.memAddress(intBuffer3);
        long l3 = MemoryUtil.memAddress(intBuffer2);
        ARBGLSPIRV.nglSpecializeShaderARB(n2, l, n3, l2, l3);
        memoryStack.setPointer(n);
    }

    public static void glSpecializeShaderARB(@NativeType(value="GLuint") int n, @NativeType(value="GLchar const *") ByteBuffer byteBuffer, @NativeType(value="GLuint const *") int[] nArray, @NativeType(value="GLuint const *") int[] nArray2) {
        long l = GL.getICD().glSpecializeShaderARB;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.checkNT1(byteBuffer);
            Checks.check(nArray2, nArray.length);
        }
        long l2 = MemoryUtil.memAddress(byteBuffer);
        int n2 = nArray.length;
        JNI.callPPPV(n, l2, n2, nArray, nArray2, l);
    }

    public static void glSpecializeShaderARB(@NativeType(value="GLuint") int n, @NativeType(value="GLchar const *") CharSequence charSequence, @NativeType(value="GLuint const *") int[] nArray, @NativeType(value="GLuint const *") int[] nArray2) {
        long l = GL.getICD().glSpecializeShaderARB;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(nArray2, nArray.length);
        }
        MemoryStack memoryStack = MemoryStack.stackGet();
        int n2 = n;
        MemoryStack memoryStack2 = memoryStack;
        n = memoryStack2.getPointer();
        try {
            memoryStack2.nUTF8(charSequence, true);
        }
        catch (Throwable throwable) {
            memoryStack.setPointer(n);
            throw throwable;
        }
        long l2 = memoryStack2.getPointerAddress();
        int n3 = nArray.length;
        JNI.callPPPV(n2, l2, n3, nArray, nArray2, l);
        memoryStack.setPointer(n);
    }

    static {
        GL.initialize();
    }
}

