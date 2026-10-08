/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengles;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;
import org.lwjgl.PointerBuffer;
import org.lwjgl.opengles.GLES;
import org.lwjgl.opengles.GLESChecks;
import org.lwjgl.system.Checks;
import org.lwjgl.system.CustomBuffer;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

public class OESDrawElementsBaseVertex {
    public OESDrawElementsBaseVertex() {
        throw new UnsupportedOperationException();
    }

    public static native void nglDrawElementsBaseVertexOES(int var0, int var1, int var2, long var3, int var5);

    public static void glDrawElementsBaseVertexOES(@NativeType(value="GLenum") int n, @NativeType(value="GLsizei") int n2, @NativeType(value="GLenum") int n3, @NativeType(value="void const *") long l, @NativeType(value="GLint") int n4) {
        OESDrawElementsBaseVertex.nglDrawElementsBaseVertexOES(n, n2, n3, l, n4);
    }

    public static void glDrawElementsBaseVertexOES(@NativeType(value="GLenum") int n, @NativeType(value="GLenum") int n2, @NativeType(value="void const *") ByteBuffer byteBuffer, @NativeType(value="GLint") int n3) {
        int n4 = n;
        ByteBuffer byteBuffer2 = byteBuffer;
        n = byteBuffer2.remaining() >> GLESChecks.typeToByteShift(n2);
        long l = MemoryUtil.memAddress(byteBuffer2);
        OESDrawElementsBaseVertex.nglDrawElementsBaseVertexOES(n4, n, n2, l, n3);
    }

    public static void glDrawElementsBaseVertexOES(@NativeType(value="GLenum") int n, @NativeType(value="void const *") ByteBuffer byteBuffer, @NativeType(value="GLint") int n2) {
        int n3 = n;
        ByteBuffer byteBuffer2 = byteBuffer;
        n = byteBuffer2.remaining();
        long l = MemoryUtil.memAddress(byteBuffer2);
        OESDrawElementsBaseVertex.nglDrawElementsBaseVertexOES(n3, n, 5121, l, n2);
    }

    public static void glDrawElementsBaseVertexOES(@NativeType(value="GLenum") int n, @NativeType(value="void const *") ShortBuffer shortBuffer, @NativeType(value="GLint") int n2) {
        int n3 = n;
        ShortBuffer shortBuffer2 = shortBuffer;
        n = shortBuffer2.remaining();
        long l = MemoryUtil.memAddress(shortBuffer2);
        OESDrawElementsBaseVertex.nglDrawElementsBaseVertexOES(n3, n, 5123, l, n2);
    }

    public static void glDrawElementsBaseVertexOES(@NativeType(value="GLenum") int n, @NativeType(value="void const *") IntBuffer intBuffer, @NativeType(value="GLint") int n2) {
        int n3 = n;
        IntBuffer intBuffer2 = intBuffer;
        n = intBuffer2.remaining();
        long l = MemoryUtil.memAddress(intBuffer2);
        OESDrawElementsBaseVertex.nglDrawElementsBaseVertexOES(n3, n, 5125, l, n2);
    }

    public static native void nglDrawRangeElementsBaseVertexOES(int var0, int var1, int var2, int var3, int var4, long var5, int var7);

    public static void glDrawRangeElementsBaseVertexOES(@NativeType(value="GLenum") int n, @NativeType(value="GLuint") int n2, @NativeType(value="GLuint") int n3, @NativeType(value="GLsizei") int n4, @NativeType(value="GLenum") int n5, @NativeType(value="void const *") long l, @NativeType(value="GLint") int n6) {
        OESDrawElementsBaseVertex.nglDrawRangeElementsBaseVertexOES(n, n2, n3, n4, n5, l, n6);
    }

    public static void glDrawRangeElementsBaseVertexOES(@NativeType(value="GLenum") int n, @NativeType(value="GLuint") int n2, @NativeType(value="GLuint") int n3, @NativeType(value="GLenum") int n4, @NativeType(value="void const *") ByteBuffer byteBuffer, @NativeType(value="GLint") int n5) {
        int n6 = n;
        ByteBuffer byteBuffer2 = byteBuffer;
        n = byteBuffer2.remaining() >> GLESChecks.typeToByteShift(n4);
        long l = MemoryUtil.memAddress(byteBuffer2);
        OESDrawElementsBaseVertex.nglDrawRangeElementsBaseVertexOES(n6, n2, n3, n, n4, l, n5);
    }

    public static void glDrawRangeElementsBaseVertexOES(@NativeType(value="GLenum") int n, @NativeType(value="GLuint") int n2, @NativeType(value="GLuint") int n3, @NativeType(value="void const *") ByteBuffer byteBuffer, @NativeType(value="GLint") int n4) {
        int n5 = n;
        ByteBuffer byteBuffer2 = byteBuffer;
        n = byteBuffer2.remaining();
        long l = MemoryUtil.memAddress(byteBuffer2);
        OESDrawElementsBaseVertex.nglDrawRangeElementsBaseVertexOES(n5, n2, n3, n, 5121, l, n4);
    }

    public static void glDrawRangeElementsBaseVertexOES(@NativeType(value="GLenum") int n, @NativeType(value="GLuint") int n2, @NativeType(value="GLuint") int n3, @NativeType(value="void const *") ShortBuffer shortBuffer, @NativeType(value="GLint") int n4) {
        int n5 = n;
        ShortBuffer shortBuffer2 = shortBuffer;
        n = shortBuffer2.remaining();
        long l = MemoryUtil.memAddress(shortBuffer2);
        OESDrawElementsBaseVertex.nglDrawRangeElementsBaseVertexOES(n5, n2, n3, n, 5123, l, n4);
    }

    public static void glDrawRangeElementsBaseVertexOES(@NativeType(value="GLenum") int n, @NativeType(value="GLuint") int n2, @NativeType(value="GLuint") int n3, @NativeType(value="void const *") IntBuffer intBuffer, @NativeType(value="GLint") int n4) {
        int n5 = n;
        IntBuffer intBuffer2 = intBuffer;
        n = intBuffer2.remaining();
        long l = MemoryUtil.memAddress(intBuffer2);
        OESDrawElementsBaseVertex.nglDrawRangeElementsBaseVertexOES(n5, n2, n3, n, 5125, l, n4);
    }

    public static native void nglDrawElementsInstancedBaseVertexOES(int var0, int var1, int var2, long var3, int var5, int var6);

    public static void glDrawElementsInstancedBaseVertexOES(@NativeType(value="GLenum") int n, @NativeType(value="GLsizei") int n2, @NativeType(value="GLenum") int n3, @NativeType(value="void const *") long l, @NativeType(value="GLsizei") int n4, @NativeType(value="GLint") int n5) {
        OESDrawElementsBaseVertex.nglDrawElementsInstancedBaseVertexOES(n, n2, n3, l, n4, n5);
    }

    public static void glDrawElementsInstancedBaseVertexOES(@NativeType(value="GLenum") int n, @NativeType(value="GLenum") int n2, @NativeType(value="void const *") ByteBuffer byteBuffer, @NativeType(value="GLsizei") int n3, @NativeType(value="GLint") int n4) {
        int n5 = n;
        ByteBuffer byteBuffer2 = byteBuffer;
        n = byteBuffer2.remaining() >> GLESChecks.typeToByteShift(n2);
        long l = MemoryUtil.memAddress(byteBuffer2);
        OESDrawElementsBaseVertex.nglDrawElementsInstancedBaseVertexOES(n5, n, n2, l, n3, n4);
    }

    public static void glDrawElementsInstancedBaseVertexOES(@NativeType(value="GLenum") int n, @NativeType(value="void const *") ByteBuffer byteBuffer, @NativeType(value="GLsizei") int n2, @NativeType(value="GLint") int n3) {
        int n4 = n;
        ByteBuffer byteBuffer2 = byteBuffer;
        n = byteBuffer2.remaining();
        long l = MemoryUtil.memAddress(byteBuffer2);
        OESDrawElementsBaseVertex.nglDrawElementsInstancedBaseVertexOES(n4, n, 5121, l, n2, n3);
    }

    public static void glDrawElementsInstancedBaseVertexOES(@NativeType(value="GLenum") int n, @NativeType(value="void const *") ShortBuffer shortBuffer, @NativeType(value="GLsizei") int n2, @NativeType(value="GLint") int n3) {
        int n4 = n;
        ShortBuffer shortBuffer2 = shortBuffer;
        n = shortBuffer2.remaining();
        long l = MemoryUtil.memAddress(shortBuffer2);
        OESDrawElementsBaseVertex.nglDrawElementsInstancedBaseVertexOES(n4, n, 5123, l, n2, n3);
    }

    public static void glDrawElementsInstancedBaseVertexOES(@NativeType(value="GLenum") int n, @NativeType(value="void const *") IntBuffer intBuffer, @NativeType(value="GLsizei") int n2, @NativeType(value="GLint") int n3) {
        int n4 = n;
        IntBuffer intBuffer2 = intBuffer;
        n = intBuffer2.remaining();
        long l = MemoryUtil.memAddress(intBuffer2);
        OESDrawElementsBaseVertex.nglDrawElementsInstancedBaseVertexOES(n4, n, 5125, l, n2, n3);
    }

    public static native void nglMultiDrawElementsBaseVertexOES(int var0, long var1, int var3, long var4, int var6, long var7);

    public static void glMultiDrawElementsBaseVertexOES(@NativeType(value="GLenum") int n, @NativeType(value="GLsizei const *") IntBuffer intBuffer, @NativeType(value="GLenum") int n2, @NativeType(value="void const * const *") PointerBuffer pointerBuffer, @NativeType(value="GLint const *") IntBuffer intBuffer2) {
        if (Checks.CHECKS) {
            Checks.check((CustomBuffer)pointerBuffer, intBuffer.remaining());
            Checks.check((Buffer)intBuffer2, intBuffer.remaining());
        }
        long l = MemoryUtil.memAddress(intBuffer);
        long l2 = MemoryUtil.memAddress(pointerBuffer);
        int n3 = intBuffer.remaining();
        long l3 = MemoryUtil.memAddress(intBuffer2);
        OESDrawElementsBaseVertex.nglMultiDrawElementsBaseVertexOES(n, l, n2, l2, n3, l3);
    }

    public static void glMultiDrawElementsBaseVertexOES(@NativeType(value="GLenum") int n, @NativeType(value="GLsizei const *") int[] nArray, @NativeType(value="GLenum") int n2, @NativeType(value="void const * const *") PointerBuffer pointerBuffer, @NativeType(value="GLint const *") int[] nArray2) {
        long l = GLES.getICD().glMultiDrawElementsBaseVertexOES;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check((CustomBuffer)pointerBuffer, nArray.length);
            Checks.check(nArray2, nArray.length);
        }
        int n3 = n;
        long l2 = MemoryUtil.memAddress(pointerBuffer);
        n = nArray.length;
        JNI.callPPPV(n3, nArray, n2, l2, n, nArray2, l);
    }

    static {
        GLES.initialize();
    }
}

