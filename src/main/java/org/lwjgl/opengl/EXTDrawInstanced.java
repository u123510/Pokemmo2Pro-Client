/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengl;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;
import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GLChecks;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

public class EXTDrawInstanced {
    public EXTDrawInstanced() {
        throw new UnsupportedOperationException();
    }

    public static native void glDrawArraysInstancedEXT(@NativeType(value="GLenum") int var0, @NativeType(value="GLint") int var1, @NativeType(value="GLsizei") int var2, @NativeType(value="GLsizei") int var3);

    public static native void nglDrawElementsInstancedEXT(int var0, int var1, int var2, long var3, int var5);

    public static void glDrawElementsInstancedEXT(@NativeType(value="GLenum") int n, @NativeType(value="GLsizei") int n2, @NativeType(value="GLenum") int n3, @NativeType(value="void const *") long l, @NativeType(value="GLsizei") int n4) {
        EXTDrawInstanced.nglDrawElementsInstancedEXT(n, n2, n3, l, n4);
    }

    public static void glDrawElementsInstancedEXT(@NativeType(value="GLenum") int n, @NativeType(value="GLenum") int n2, @NativeType(value="void const *") ByteBuffer byteBuffer, @NativeType(value="GLsizei") int n3) {
        int n4 = n;
        ByteBuffer byteBuffer2 = byteBuffer;
        n = byteBuffer2.remaining() >> GLChecks.typeToByteShift(n2);
        long l = MemoryUtil.memAddress(byteBuffer2);
        EXTDrawInstanced.nglDrawElementsInstancedEXT(n4, n, n2, l, n3);
    }

    public static void glDrawElementsInstancedEXT(@NativeType(value="GLenum") int n, @NativeType(value="void const *") ByteBuffer byteBuffer, @NativeType(value="GLsizei") int n2) {
        int n3 = n;
        ByteBuffer byteBuffer2 = byteBuffer;
        n = byteBuffer2.remaining();
        long l = MemoryUtil.memAddress(byteBuffer2);
        EXTDrawInstanced.nglDrawElementsInstancedEXT(n3, n, 5121, l, n2);
    }

    public static void glDrawElementsInstancedEXT(@NativeType(value="GLenum") int n, @NativeType(value="void const *") ShortBuffer shortBuffer, @NativeType(value="GLsizei") int n2) {
        int n3 = n;
        ShortBuffer shortBuffer2 = shortBuffer;
        n = shortBuffer2.remaining();
        long l = MemoryUtil.memAddress(shortBuffer2);
        EXTDrawInstanced.nglDrawElementsInstancedEXT(n3, n, 5123, l, n2);
    }

    public static void glDrawElementsInstancedEXT(@NativeType(value="GLenum") int n, @NativeType(value="void const *") IntBuffer intBuffer, @NativeType(value="GLsizei") int n2) {
        int n3 = n;
        IntBuffer intBuffer2 = intBuffer;
        n = intBuffer2.remaining();
        long l = MemoryUtil.memAddress(intBuffer2);
        EXTDrawInstanced.nglDrawElementsInstancedEXT(n3, n, 5125, l, n2);
    }

    static {
        GL.initialize();
    }
}

