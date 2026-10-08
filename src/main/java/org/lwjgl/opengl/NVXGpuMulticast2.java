/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengl;

import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import org.lwjgl.opengl.GL;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

public class NVXGpuMulticast2 {
    public NVXGpuMulticast2() {
        throw new UnsupportedOperationException();
    }

    public static native int nglAsyncCopyImageSubDataNVX(int var0, long var1, long var3, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22, long var23, long var25);

    @NativeType(value="GLuint")
    public static int glAsyncCopyImageSubDataNVX(@NativeType(value="GLuint const *") IntBuffer intBuffer, @NativeType(value="GLuint64 const *") LongBuffer longBuffer, @NativeType(value="GLuint") int n, @NativeType(value="GLbitfield") int n2, @NativeType(value="GLuint") int n3, @NativeType(value="GLenum") int n4, @NativeType(value="GLint") int n5, @NativeType(value="GLint") int n6, @NativeType(value="GLint") int n7, @NativeType(value="GLint") int n8, @NativeType(value="GLuint") int n9, @NativeType(value="GLenum") int n10, @NativeType(value="GLint") int n11, @NativeType(value="GLint") int n12, @NativeType(value="GLint") int n13, @NativeType(value="GLint") int n14, @NativeType(value="GLsizei") int n15, @NativeType(value="GLsizei") int n16, @NativeType(value="GLsizei") int n17, @NativeType(value="GLuint const *") IntBuffer intBuffer2, @NativeType(value="GLuint64 const *") LongBuffer longBuffer2) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)longBuffer, intBuffer.remaining());
            Checks.check((Buffer)longBuffer2, intBuffer2.remaining());
        }
        IntBuffer intBuffer3 = intBuffer2;
        long l = MemoryUtil.memAddress(intBuffer);
        long l2 = MemoryUtil.memAddress(longBuffer);
        int n18 = intBuffer3.remaining();
        long l3 = MemoryUtil.memAddress(intBuffer3);
        long l4 = MemoryUtil.memAddress(longBuffer2);
        return NVXGpuMulticast2.nglAsyncCopyImageSubDataNVX(intBuffer.remaining(), l, l2, n, n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12, n13, n14, n15, n16, n17, n18, l3, l4);
    }

    public static native long nglAsyncCopyBufferSubDataNVX(int var0, long var1, long var3, int var5, int var6, int var7, int var8, long var9, long var11, long var13, int var15, long var16, long var18);

    @NativeType(value="GLsync")
    public static long glAsyncCopyBufferSubDataNVX(@NativeType(value="GLuint const *") IntBuffer intBuffer, @NativeType(value="GLuint64 const *") LongBuffer longBuffer, @NativeType(value="GLuint") int n, @NativeType(value="GLbitfield") int n2, @NativeType(value="GLuint") int n3, @NativeType(value="GLuint") int n4, @NativeType(value="GLintptr") long l, @NativeType(value="GLintptr") long l2, @NativeType(value="GLsizeiptr") long l3, @NativeType(value="GLuint const *") IntBuffer intBuffer2, @NativeType(value="GLuint64 const *") LongBuffer longBuffer2) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)longBuffer, intBuffer.remaining());
            Checks.check((Buffer)longBuffer2, intBuffer2.remaining());
        }
        IntBuffer intBuffer3 = intBuffer2;
        long l4 = MemoryUtil.memAddress(intBuffer);
        long l5 = MemoryUtil.memAddress(longBuffer);
        int n5 = intBuffer3.remaining();
        long l6 = MemoryUtil.memAddress(intBuffer3);
        long l7 = MemoryUtil.memAddress(longBuffer2);
        return NVXGpuMulticast2.nglAsyncCopyBufferSubDataNVX(intBuffer.remaining(), l4, l5, n, n2, n3, n4, l, l2, l3, n5, l6, l7);
    }

    public static native void glUploadGpuMaskNVX(@NativeType(value="GLbitfield") int var0);

    public static native void nglMulticastViewportArrayvNVX(int var0, int var1, int var2, long var3);

    public static void glMulticastViewportArrayvNVX(@NativeType(value="GLuint") int n, @NativeType(value="GLuint") int n2, @NativeType(value="GLfloat const *") FloatBuffer floatBuffer) {
        int n3 = n;
        FloatBuffer floatBuffer2 = floatBuffer;
        n = floatBuffer2.remaining() >> 2;
        long l = MemoryUtil.memAddress(floatBuffer2);
        NVXGpuMulticast2.nglMulticastViewportArrayvNVX(n3, n2, n, l);
    }

    public static native void nglMulticastScissorArrayvNVX(int var0, int var1, int var2, long var3);

    public static void glMulticastScissorArrayvNVX(@NativeType(value="GLuint") int n, @NativeType(value="GLuint") int n2, @NativeType(value="GLint const *") IntBuffer intBuffer) {
        int n3 = n;
        IntBuffer intBuffer2 = intBuffer;
        n = intBuffer2.remaining() >> 2;
        long l = MemoryUtil.memAddress(intBuffer2);
        NVXGpuMulticast2.nglMulticastScissorArrayvNVX(n3, n2, n, l);
    }

    public static native void glMulticastViewportPositionWScaleNVX(@NativeType(value="GLuint") int var0, @NativeType(value="GLuint") int var1, @NativeType(value="GLfloat") float var2, @NativeType(value="GLfloat") float var3);

    @NativeType(value="GLuint")
    public static int glAsyncCopyImageSubDataNVX(@NativeType(value="GLuint const *") int[] nArray, @NativeType(value="GLuint64 const *") long[] lArray, @NativeType(value="GLuint") int n, @NativeType(value="GLbitfield") int n2, @NativeType(value="GLuint") int n3, @NativeType(value="GLenum") int n4, @NativeType(value="GLint") int n5, @NativeType(value="GLint") int n6, @NativeType(value="GLint") int n7, @NativeType(value="GLint") int n8, @NativeType(value="GLuint") int n9, @NativeType(value="GLenum") int n10, @NativeType(value="GLint") int n11, @NativeType(value="GLint") int n12, @NativeType(value="GLint") int n13, @NativeType(value="GLint") int n14, @NativeType(value="GLsizei") int n15, @NativeType(value="GLsizei") int n16, @NativeType(value="GLsizei") int n17, @NativeType(value="GLuint const *") int[] nArray2, @NativeType(value="GLuint64 const *") long[] lArray2) {
        long l = GL.getICD().glAsyncCopyImageSubDataNVX;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(lArray, nArray.length);
            Checks.check(lArray2, nArray2.length);
        }
        int n18 = nArray2.length;
        return JNI.callPPPPI(nArray.length, nArray, lArray, n, n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12, n13, n14, n15, n16, n17, n18, nArray2, lArray2, l);
    }

    @NativeType(value="GLsync")
    public static long glAsyncCopyBufferSubDataNVX(@NativeType(value="GLuint const *") int[] nArray, @NativeType(value="GLuint64 const *") long[] lArray, @NativeType(value="GLuint") int n, @NativeType(value="GLbitfield") int n2, @NativeType(value="GLuint") int n3, @NativeType(value="GLuint") int n4, @NativeType(value="GLintptr") long l, @NativeType(value="GLintptr") long l2, @NativeType(value="GLsizeiptr") long l3, @NativeType(value="GLuint const *") int[] nArray2, @NativeType(value="GLuint64 const *") long[] lArray2) {
        long l4 = GL.getICD().glAsyncCopyBufferSubDataNVX;
        if (Checks.CHECKS) {
            Checks.check(l4);
            Checks.check(lArray, nArray.length);
            Checks.check(lArray2, nArray2.length);
        }
        int n5 = nArray2.length;
        return JNI.callPPPPPPPP(nArray.length, nArray, lArray, n, n2, n3, n4, l, l2, l3, n5, nArray2, lArray2, l4);
    }

    public static void glMulticastViewportArrayvNVX(@NativeType(value="GLuint") int n, @NativeType(value="GLuint") int n2, @NativeType(value="GLfloat const *") float[] fArray) {
        long l = GL.getICD().glMulticastViewportArrayvNVX;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.callPV(n, n2, fArray.length >> 2, fArray, l);
    }

    public static void glMulticastScissorArrayvNVX(@NativeType(value="GLuint") int n, @NativeType(value="GLuint") int n2, @NativeType(value="GLint const *") int[] nArray) {
        long l = GL.getICD().glMulticastScissorArrayvNVX;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.callPV(n, n2, nArray.length >> 2, nArray, l);
    }

    static {
        GL.initialize();
    }
}

