/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengles;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;
import org.lwjgl.opengles.GLES;
import org.lwjgl.opengles.GLESChecks;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

public class EXTBaseInstance {
    public EXTBaseInstance() {
        throw new UnsupportedOperationException();
    }

    public static native void glDrawArraysInstancedBaseInstanceEXT(@NativeType(value="GLenum") int var0, @NativeType(value="GLint") int var1, @NativeType(value="GLsizei") int var2, @NativeType(value="GLsizei") int var3, @NativeType(value="GLuint") int var4);

    public static native void nglDrawElementsInstancedBaseInstanceEXT(int var0, int var1, int var2, long var3, int var5, int var6);

    public static void glDrawElementsInstancedBaseInstanceEXT(@NativeType(value="GLenum") int n, @NativeType(value="GLsizei") int n2, @NativeType(value="GLenum") int n3, @NativeType(value="void const *") long l, @NativeType(value="GLsizei") int n4, @NativeType(value="GLuint") int n5) {
        EXTBaseInstance.nglDrawElementsInstancedBaseInstanceEXT(n, n2, n3, l, n4, n5);
    }

    public static void glDrawElementsInstancedBaseInstanceEXT(@NativeType(value="GLenum") int n, @NativeType(value="GLenum") int n2, @NativeType(value="void const *") ByteBuffer byteBuffer, @NativeType(value="GLsizei") int n3, @NativeType(value="GLuint") int n4) {
        int n5 = n;
        ByteBuffer byteBuffer2 = byteBuffer;
        n = byteBuffer2.remaining() >> GLESChecks.typeToByteShift(n2);
        long l = MemoryUtil.memAddress(byteBuffer2);
        EXTBaseInstance.nglDrawElementsInstancedBaseInstanceEXT(n5, n, n2, l, n3, n4);
    }

    public static void glDrawElementsInstancedBaseInstanceEXT(@NativeType(value="GLenum") int n, @NativeType(value="void const *") ByteBuffer byteBuffer, @NativeType(value="GLsizei") int n2, @NativeType(value="GLuint") int n3) {
        int n4 = n;
        ByteBuffer byteBuffer2 = byteBuffer;
        n = byteBuffer2.remaining();
        long l = MemoryUtil.memAddress(byteBuffer2);
        EXTBaseInstance.nglDrawElementsInstancedBaseInstanceEXT(n4, n, 5121, l, n2, n3);
    }

    public static void glDrawElementsInstancedBaseInstanceEXT(@NativeType(value="GLenum") int n, @NativeType(value="void const *") ShortBuffer shortBuffer, @NativeType(value="GLsizei") int n2, @NativeType(value="GLuint") int n3) {
        int n4 = n;
        ShortBuffer shortBuffer2 = shortBuffer;
        n = shortBuffer2.remaining();
        long l = MemoryUtil.memAddress(shortBuffer2);
        EXTBaseInstance.nglDrawElementsInstancedBaseInstanceEXT(n4, n, 5123, l, n2, n3);
    }

    public static void glDrawElementsInstancedBaseInstanceEXT(@NativeType(value="GLenum") int n, @NativeType(value="void const *") IntBuffer intBuffer, @NativeType(value="GLsizei") int n2, @NativeType(value="GLuint") int n3) {
        int n4 = n;
        IntBuffer intBuffer2 = intBuffer;
        n = intBuffer2.remaining();
        long l = MemoryUtil.memAddress(intBuffer2);
        EXTBaseInstance.nglDrawElementsInstancedBaseInstanceEXT(n4, n, 5125, l, n2, n3);
    }

    public static native void nglDrawElementsInstancedBaseVertexBaseInstanceEXT(int var0, int var1, int var2, long var3, int var5, int var6, int var7);

    public static void glDrawElementsInstancedBaseVertexBaseInstanceEXT(@NativeType(value="GLenum") int n, @NativeType(value="GLsizei") int n2, @NativeType(value="GLenum") int n3, @NativeType(value="void const *") long l, @NativeType(value="GLsizei") int n4, @NativeType(value="GLint") int n5, @NativeType(value="GLuint") int n6) {
        EXTBaseInstance.nglDrawElementsInstancedBaseVertexBaseInstanceEXT(n, n2, n3, l, n4, n5, n6);
    }

    public static void glDrawElementsInstancedBaseVertexBaseInstanceEXT(@NativeType(value="GLenum") int n, @NativeType(value="GLenum") int n2, @NativeType(value="void const *") ByteBuffer byteBuffer, @NativeType(value="GLsizei") int n3, @NativeType(value="GLint") int n4, @NativeType(value="GLuint") int n5) {
        int n6 = n;
        ByteBuffer byteBuffer2 = byteBuffer;
        n = byteBuffer2.remaining() >> GLESChecks.typeToByteShift(n2);
        long l = MemoryUtil.memAddress(byteBuffer2);
        EXTBaseInstance.nglDrawElementsInstancedBaseVertexBaseInstanceEXT(n6, n, n2, l, n3, n4, n5);
    }

    public static void glDrawElementsInstancedBaseVertexBaseInstanceEXT(@NativeType(value="GLenum") int n, @NativeType(value="void const *") ByteBuffer byteBuffer, @NativeType(value="GLsizei") int n2, @NativeType(value="GLint") int n3, @NativeType(value="GLuint") int n4) {
        int n5 = n;
        ByteBuffer byteBuffer2 = byteBuffer;
        n = byteBuffer2.remaining();
        long l = MemoryUtil.memAddress(byteBuffer2);
        EXTBaseInstance.nglDrawElementsInstancedBaseVertexBaseInstanceEXT(n5, n, 5121, l, n2, n3, n4);
    }

    public static void glDrawElementsInstancedBaseVertexBaseInstanceEXT(@NativeType(value="GLenum") int n, @NativeType(value="void const *") ShortBuffer shortBuffer, @NativeType(value="GLsizei") int n2, @NativeType(value="GLint") int n3, @NativeType(value="GLuint") int n4) {
        int n5 = n;
        ShortBuffer shortBuffer2 = shortBuffer;
        n = shortBuffer2.remaining();
        long l = MemoryUtil.memAddress(shortBuffer2);
        EXTBaseInstance.nglDrawElementsInstancedBaseVertexBaseInstanceEXT(n5, n, 5123, l, n2, n3, n4);
    }

    public static void glDrawElementsInstancedBaseVertexBaseInstanceEXT(@NativeType(value="GLenum") int n, @NativeType(value="void const *") IntBuffer intBuffer, @NativeType(value="GLsizei") int n2, @NativeType(value="GLint") int n3, @NativeType(value="GLuint") int n4) {
        int n5 = n;
        IntBuffer intBuffer2 = intBuffer;
        n = intBuffer2.remaining();
        long l = MemoryUtil.memAddress(intBuffer2);
        EXTBaseInstance.nglDrawElementsInstancedBaseVertexBaseInstanceEXT(n5, n, 5125, l, n2, n3, n4);
    }

    static {
        GLES.initialize();
    }
}

