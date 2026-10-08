/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengl;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import org.lwjgl.opengl.GL;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

public class NVBindlessMultiDrawIndirectCount {
    public NVBindlessMultiDrawIndirectCount() {
        throw new UnsupportedOperationException();
    }

    public static native void nglMultiDrawArraysIndirectBindlessCountNV(int var0, long var1, long var3, int var5, int var6, int var7);

    public static void glMultiDrawArraysIndirectBindlessCountNV(@NativeType(value="GLenum") int n, @NativeType(value="void const *") ByteBuffer byteBuffer, @NativeType(value="GLintptr") long l, @NativeType(value="GLsizei") int n2, @NativeType(value="GLsizei") int n3, @NativeType(value="GLint") int n4) {
        if (Checks.CHECKS) {
            int n5 = n3 == 0 ? n4 * 24 + 16 : n3;
            Checks.check((Buffer)byteBuffer, n2 * n5);
        }
        NVBindlessMultiDrawIndirectCount.nglMultiDrawArraysIndirectBindlessCountNV(n, MemoryUtil.memAddress(byteBuffer), l, n2, n3, n4);
    }

    public static void glMultiDrawArraysIndirectBindlessCountNV(@NativeType(value="GLenum") int n, @NativeType(value="void const *") long l, @NativeType(value="GLintptr") long l2, @NativeType(value="GLsizei") int n2, @NativeType(value="GLsizei") int n3, @NativeType(value="GLint") int n4) {
        NVBindlessMultiDrawIndirectCount.nglMultiDrawArraysIndirectBindlessCountNV(n, l, l2, n2, n3, n4);
    }

    public static native void nglMultiDrawElementsIndirectBindlessCountNV(int var0, int var1, long var2, long var4, int var6, int var7, int var8);

    public static void glMultiDrawElementsIndirectBindlessCountNV(@NativeType(value="GLenum") int n, @NativeType(value="GLenum") int n2, @NativeType(value="void const *") ByteBuffer byteBuffer, @NativeType(value="GLintptr") long l, @NativeType(value="GLsizei") int n3, @NativeType(value="GLsizei") int n4, @NativeType(value="GLint") int n5) {
        if (Checks.CHECKS) {
            int n6 = n4 == 0 ? (n5 + 2) * 24 : n4;
            Checks.check((Buffer)byteBuffer, n3 * n6);
        }
        long l2 = MemoryUtil.memAddress(byteBuffer);
        NVBindlessMultiDrawIndirectCount.nglMultiDrawElementsIndirectBindlessCountNV(n, n2, l2, l, n3, n4, n5);
    }

    public static void glMultiDrawElementsIndirectBindlessCountNV(@NativeType(value="GLenum") int n, @NativeType(value="GLenum") int n2, @NativeType(value="void const *") long l, @NativeType(value="GLintptr") long l2, @NativeType(value="GLsizei") int n3, @NativeType(value="GLsizei") int n4, @NativeType(value="GLint") int n5) {
        NVBindlessMultiDrawIndirectCount.nglMultiDrawElementsIndirectBindlessCountNV(n, n2, l, l2, n3, n4, n5);
    }

    static {
        GL.initialize();
    }
}

