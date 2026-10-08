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

public class NVDrawInstanced {
    public NVDrawInstanced() {
        throw new UnsupportedOperationException();
    }

    public static native void glDrawArraysInstancedNV(@NativeType(value="GLenum") int var0, @NativeType(value="GLint") int var1, @NativeType(value="GLsizei") int var2, @NativeType(value="GLsizei") int var3);

    public static native void nglDrawElementsInstancedNV(int var0, int var1, int var2, long var3, int var5);

    public static void glDrawElementsInstancedNV(@NativeType(value="GLenum") int n, @NativeType(value="GLsizei") int n2, @NativeType(value="GLenum") int n3, @NativeType(value="void const *") long l, @NativeType(value="GLsizei") int n4) {
        NVDrawInstanced.nglDrawElementsInstancedNV(n, n2, n3, l, n4);
    }

    public static void glDrawElementsInstancedNV(@NativeType(value="GLenum") int n, @NativeType(value="GLenum") int n2, @NativeType(value="void const *") ByteBuffer byteBuffer, @NativeType(value="GLsizei") int n3) {
        int n4 = n;
        ByteBuffer byteBuffer2 = byteBuffer;
        n = byteBuffer2.remaining() >> GLESChecks.typeToByteShift(n2);
        long l = MemoryUtil.memAddress(byteBuffer2);
        NVDrawInstanced.nglDrawElementsInstancedNV(n4, n, n2, l, n3);
    }

    public static void glDrawElementsInstancedNV(@NativeType(value="GLenum") int n, @NativeType(value="void const *") ByteBuffer byteBuffer, @NativeType(value="GLsizei") int n2) {
        int n3 = n;
        ByteBuffer byteBuffer2 = byteBuffer;
        n = byteBuffer2.remaining();
        long l = MemoryUtil.memAddress(byteBuffer2);
        NVDrawInstanced.nglDrawElementsInstancedNV(n3, n, 5121, l, n2);
    }

    public static void glDrawElementsInstancedNV(@NativeType(value="GLenum") int n, @NativeType(value="void const *") ShortBuffer shortBuffer, @NativeType(value="GLsizei") int n2) {
        int n3 = n;
        ShortBuffer shortBuffer2 = shortBuffer;
        n = shortBuffer2.remaining();
        long l = MemoryUtil.memAddress(shortBuffer2);
        NVDrawInstanced.nglDrawElementsInstancedNV(n3, n, 5123, l, n2);
    }

    public static void glDrawElementsInstancedNV(@NativeType(value="GLenum") int n, @NativeType(value="void const *") IntBuffer intBuffer, @NativeType(value="GLsizei") int n2) {
        int n3 = n;
        IntBuffer intBuffer2 = intBuffer;
        n = intBuffer2.remaining();
        long l = MemoryUtil.memAddress(intBuffer2);
        NVDrawInstanced.nglDrawElementsInstancedNV(n3, n, 5125, l, n2);
    }

    static {
        GLES.initialize();
    }
}

